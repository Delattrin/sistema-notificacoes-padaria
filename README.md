> 🔁 Este projeto faz parte de uma série de evolução. Acompanhe a progressão: [sistema-padaria](https://github.com/Delattrin/sistema-padaria) → [sistema-padaria-oop](https://github.com/Delattrin/sistema-padaria-oop) → **sistema-notificacoes-padaria** → [Padaria-stock](https://github.com/Delattrin/Padaria-stock)
# 📦 Sistema de Notificações - Padaria Canaã

## 🧠 Sobre o projeto

Este projeto foi desenvolvido para praticar conceitos de Programação Orientada a Objetos em Java, principalmente:

* Polimorfismo
* Interfaces
* Encapsulamento
* Uso de coleções (ArrayList)

O sistema simula um módulo de notificações para uma padaria, permitindo o envio de mensagens por diferentes canais.

---

## ⚙️ Como funciona

Foi criada uma interface chamada `Notificavel`, que define o método:

```java
void enviar(String mensagem);
```

As classes abaixo implementam essa interface:

* NotificacaoEmail
* NotificacaoWhatsapp
* NotificacaoSMS

Cada uma possui seu próprio comportamento ao enviar a mensagem.

---

## 🔥 Polimorfismo na prática

O sistema utiliza uma lista de notificações:

```java
ArrayList<Notificavel> canais
```

E percorre essa lista chamando:

```java
n.enviar(mensagem);
```

Cada objeto executa sua própria implementação, caracterizando o polimorfismo em tempo de execução.

---

## 🧩 Estrutura do projeto

* `Notificavel.java` (interface)
* `NotificacaoEmail.java`
* `NotificacaoWhatsapp.java`
* `NotificacaoSMS.java`
* `GerenciadorNotificacoes.java`
* `App.java`

---

## 🚀 Possíveis melhorias

* Integração real com API do WhatsApp
* Sistema de clientes
* Tipos de notificação (pedido, estoque, promoções)
* Transformar em API com Spring Boot

---

## 👨‍💻 Autor

Kauã Delattre
