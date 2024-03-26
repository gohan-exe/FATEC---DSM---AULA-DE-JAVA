package atividade03.example.demo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class DemoApplication {

    private final Jedis jedis;

    public DemoApplication() {
        this.jedis = new Jedis("redis-19529.c308.sa-east-1-1.ec2.cloud.redislabs.com", 19529);
        jedis.auth("CMsoHMcll1YLGsbBAk9i2qyVubX0ldpf");
    }

    public void adicionarTarefa(String id, String descricao) {
        jedis.hset("tarefas", id, descricao);
    }

    public void listarTarefas() {
        Map<String, String> tarefas = jedis.hgetAll("tarefas");
        System.out.println("=================================");
        System.out.println("Lista de Tarefas:");
        for (Map.Entry<String, String> entry : tarefas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void marcarTarefaConcluida(String id) {
        jedis.hset("tarefas_concluidas", id, jedis.hget("tarefas", id));
        jedis.hdel("tarefas", id);
    }

    public void removerTarefasConcluidas() {
        Set<String> idsTarefasConcluidas = jedis.hkeys("tarefas_concluidas");
        for (String id : idsTarefasConcluidas) {
            jedis.hdel("tarefas_concluidas", id);
        }
    }

    public static void main(String[] args) {
        DemoApplication taskManager = new DemoApplication();
        Scanner scanner = new Scanner(System.in);

        try {
            int opcao;
            do {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Adicionar Tarefa");
                System.out.println("2. Listar Tarefas");
                System.out.println("3. Marcar Tarefa Concluída");
                System.out.println("4. Remover Tarefas Concluídas");
                System.out.println("5. Sair");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o ID da tarefa:");
                        String id = scanner.nextLine();
                        System.out.println("Digite a descrição da tarefa:");
                        String descricao = scanner.nextLine();
                        taskManager.adicionarTarefa(id, descricao);
                        break;
                    case 2:
                        taskManager.listarTarefas();
                        break;
                    case 3:
                        System.out.println("Digite o ID da tarefa concluída:");
                        String idConcluida = scanner.nextLine();
                        taskManager.marcarTarefaConcluida(idConcluida);
                        break;
                    case 4:
                        taskManager.removerTarefasConcluidas();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 5);
        } catch (JedisConnectionException e) {
            System.err.println("Não foi possível conectar ao servidor Redis. Verifique suas credenciais e conexão com a internet.");
        } finally {
            taskManager.jedis.close();
            scanner.close();
        }
    }
}
