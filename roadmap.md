# Roadmap Completo — Plataforma de Atendimento Inteligente (Evoluindo para SaaS e Microsserviços)

## Objetivo

Construir um projeto único que evolui em três fases:

1. Backend e Infraestrutura (Vaga 1)
2. Fullstack Cloud Native (Vaga 2)
3. Arquitetura Corporativa com Microsserviços (Vaga 3)

Ao final, você terá um projeto de nível pleno/sênior que demonstra experiência em:

- Backend
- Frontend
- DevOps
- Cloud AWS
- Microsserviços
- Observabilidade
- CI/CD
- Arquitetura distribuída

---

# FASE 1 — Backend Profissional

## Objetivo

Criar uma plataforma de atendimento inteligente onde clientes podem abrir chamados e conversar com atendentes.

---

## Arquitetura

```text
Cliente
   ↓
REST API
   ↓
Spring Boot
   ↓
PostgreSQL
```

---

## Tecnologias

### Backend

- Java 21
- Spring Boot 3

### Banco de Dados

- PostgreSQL

### Controle de Versão

- Git
- GitHub

### Containerização

- Docker

### Testes

- JUnit 5
- Mockito

### Documentação

- Swagger/OpenAPI

### Segurança

- Spring Security
- JWT

---

## Funcionalidades

### Autenticação

- Cadastro
- Login
- JWT
- Refresh Token

### Usuários

- Cliente
- Atendente
- Administrador

### Chamados

- Criar chamado
- Atualizar chamado
- Encerrar chamado

### Histórico

- Histórico de atendimentos

---

## Estrutura do Projeto

```text
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── config
 ├── security
 └── exception
```

---

## Aprendizados

- APIs REST
- Arquitetura em camadas
- SQL
- Segurança
- Testes unitários

---

## Dificuldade

6/10

---

# FASE 1.5 — Melhorias Backend

## Objetivo

Adicionar recursos encontrados em ambientes corporativos.

---

## Ferramentas

### Cache

Redis

### Logs

Logback

### Monitoramento

Spring Actuator

---

## Funcionalidades

### Cache

- Usuários
- Chamados

### Logs

- Login
- Erros
- Operações críticas

### Health Check

```text
/actuator/health
```

---

## Aprendizados

- Performance
- Observabilidade inicial

---

## Dificuldade

7/10

---

# FASE 2 — Frontend Moderno

## Objetivo

Criar interface profissional.

---

## Arquitetura

```text
React
  ↓
REST API
  ↓
Spring Boot
```

---

## Tecnologias

### Frontend

- React
- TypeScript
- Vite

### UI

- Material UI

### Estado

- React Query

### Formulários

- React Hook Form

### Validação

- Zod

---

## Páginas

### Login

```text
/login
```

### Dashboard

```text
/dashboard
```

### Chamados

```text
/tickets
```

### Administração

```text
/admin
```

---

## Funcionalidades

### Dashboard

- Chamados abertos
- Chamados fechados
- Métricas

### Atendimento

- Lista de chamados
- Filtros
- Busca

---

## Aprendizados

- React
- TypeScript
- Consumo de APIs

---

## Dificuldade

7.5/10

---

# FASE 3 — AWS

## Objetivo

Levar o sistema para cloud.

---

## Serviços AWS

### Armazenamento

S3

### Computação

EC2

### Banco

RDS PostgreSQL

### Segurança

IAM

### Monitoramento

CloudWatch

---

## Funcionalidades

### Upload

Anexos de chamados

```text
Frontend
 ↓
Backend
 ↓
S3
```

---

## Aprendizados

- Cloud
- Deploy
- Custos

---

## Dificuldade

8/10

---

# FASE 4 — DevOps

## Objetivo

Automatizar deploy.

---

## Ferramentas

### CI/CD

GitHub Actions

### Containers

Docker

### Registro

Docker Hub

---

## Pipeline

```text
Push
 ↓
Testes
 ↓
Build
 ↓
Docker Image
 ↓
Deploy
```

---

## Pipeline YAML

```yaml
Build
Test
Package
Docker Build
Docker Push
Deploy
```

---

## Aprendizados

- CI/CD
- Deploy contínuo

---

## Dificuldade

8/10

---

# FASE 5 — Kubernetes

## Objetivo

Orquestrar containers.

---

## Ferramentas

### Kubernetes

K8s

### Ambiente Local

Minikube

ou

Kind

---

## Componentes

### Deployment

```yaml
deployment.yaml
```

### Service

```yaml
service.yaml
```

### ConfigMap

```yaml
configmap.yaml
```

### Secret

```yaml
secret.yaml
```

---

## Aprendizados

- Escalabilidade
- Alta disponibilidade

---

## Dificuldade

8.5/10

---

# FASE 6 — Microsserviços

## Objetivo

Transformar monólito em microsserviços.

---

## Arquitetura

```text
API Gateway
      ↓

┌──────────────┐
│ Auth Service │
└──────────────┘

┌──────────────┐
│ User Service │
└──────────────┘

┌──────────────┐
│ Ticket Service │
└──────────────┘

┌──────────────┐
│ Notification Service │
└──────────────┘
```

---

## Tecnologias

### Backend

- Spring Boot

### Comunicação

- REST
- OpenFeign

---

## Aprendizados

- Arquitetura distribuída

---

## Dificuldade

9/10

---

# FASE 7 — Mensageria

## Objetivo

Comunicação assíncrona.

---

## Ferramentas

### Opção 1

RabbitMQ

### Opção 2

Kafka

---

## Exemplo

Quando um chamado é criado:

```text
Ticket Service
      ↓
RabbitMQ
      ↓
Notification Service
```

---

## Eventos

### TicketCreated

### TicketClosed

### UserCreated

---

## Aprendizados

- Event Driven Architecture

---

## Dificuldade

9/10

---

# FASE 8 — Observabilidade

## Objetivo

Monitorar tudo.

---

## Ferramentas

### Métricas

Prometheus

### Dashboards

Grafana

### Tracing

OpenTelemetry

### Logs

Loki

---

## Arquitetura

```text
Aplicação
   ↓
Prometheus
   ↓
Grafana
```

---

## Dashboards

### Backend

- CPU
- Memória
- Requests

### Banco

- Conexões
- Latência

---

## Aprendizados

- SRE
- Monitoramento

---

## Dificuldade

9.5/10

---

# FASE 9 — GitOps

## Objetivo

Deploy corporativo.

---

## Ferramentas

### GitOps

ArgoCD

### Infraestrutura

Terraform

---

## Fluxo

```text
Git
 ↓
ArgoCD
 ↓
Kubernetes
```

---

## Aprendizados

- DevOps avançado
- GitOps

---

## Dificuldade

9.5/10

---

# FASE 10 — Diferencial de Mercado

## Objetivo

Adicionar IA.

---

## Ferramentas

### IA

OpenAI API

### Vetores

pgvector

ou

Qdrant

---

## Funcionalidades

### Chatbot Inteligente

Consulta base de conhecimento.

### Resumo de Chamados

IA gera resumo automático.

### Sugestão de Resposta

IA auxilia atendentes.

---

## Aprendizados

- IA aplicada
- RAG
- LLMs

---

## Dificuldade

10/10

---

# Resultado Final

## Stack Completa

### Backend

- Java 21
- Spring Boot
- JWT
- JPA
- Hibernate

### Frontend

- React
- TypeScript
- Material UI

### Banco

- PostgreSQL
- Redis

### Cloud

- AWS S3
- EC2
- RDS
- IAM

### DevOps

- Docker
- Kubernetes
- GitHub Actions
- ArgoCD
- Terraform

### Arquitetura

- Microsserviços
- RabbitMQ/Kafka
- API Gateway

### Observabilidade

- Prometheus
- Grafana
- OpenTelemetry
- Loki

### IA

- OpenAI API
- pgvector

---

# Nível Alcançado

| Fase | Nível |
|--------|---------|
| 1-2 | Júnior |
| 3-4 | Júnior Forte |
| 5-6 | Pleno |
| 7-8 | Pleno Forte |
| 9-10 | Pleno/Sênior |

Tempo estimado dedicando 2 a 3 horas por dia:

- Fase 1 → 2 semanas
- Fase 2 → 2 semanas
- Fase 3 → 1 semana
- Fase 4 → 1 semana
- Fase 5 → 2 semanas
- Fase 6 → 2 semanas
- Fase 7 → 1 semana
- Fase 8 → 1 semana
- Fase 9 → 1 semana
- Fase 10 → 2 semanas

Total: aproximadamente 15 a 17 semanas.
