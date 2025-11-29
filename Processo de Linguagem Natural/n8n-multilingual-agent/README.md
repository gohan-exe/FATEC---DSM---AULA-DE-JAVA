# n8n Multilingual Translation & Explanation Agent

Este repositório contém um workflow n8n colaborativo desenvolvido por Luccas Lohan, Artur Revollo e Bruno Santos.  
O workflow permite receber textos via webhook, traduzir e gerar explicações multilíngues usando AI Agents (Groq Chat + LangChain) e retornar um JSON estruturado.

---

## Funcionalidades

- Recebe texto via Webhook (POST).  
- Traduz o texto e gera explicação do conteúdo no idioma de destino.  
- Utiliza AI Agent (LangChain) e Groq Chat Model.  
- Retorna JSON limpo para o cliente (Insomnia, Postman ou outro).  
- Lida com Markdown retornado pelo AI Agent para extrair o JSON corretamente.

---

## Estrutura do Workflow

1. **Webhook Node**: Recebe o POST do cliente.
   - Endpoint: `/traduzir-explicacao`
   - Body esperado:
     ```json
     {
       "text": "MechWarrior 5 is an excellent game."
     }
     ```

2. **AI Agent Node**: Processa o texto com instruções multilíngues e gera saída em JSON.

3. **Code Node**:  
   - Remove o Markdown do output do AI Agent.  
   - Converte a string em JSON.  
   - Prepara a resposta final com `translated` e `explanation`.

4. **Respond to Webhook Node**: Retorna o JSON final para o cliente.

---

## Exemplo de Output

```json
{
  "translated": "MechWarrior 5 é um excelente jogo.",
  "explanation": "MechWarrior 5 é um jogo de simulação de mecha desenvolvido pela Piranha Games. A série MechWarrior é baseada no universo de BattleTech, um mundo de ficção científica onde robôs gigantes chamados 'Mechs' lutam em batalhas épicas. O jogo oferece uma experiência imersiva com gráficos de alta qualidade e uma jogabilidade intensa.",
"timestamp": 2025-11-29T21:03:32.140Z
}
