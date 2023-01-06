package com.vinicius.recyclermaster.model

// modelo de dados
data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

// responsável por criar modelos de emails
class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview, date, stared, unread, false)
}

// DSL (Domain-Specific Languages)
fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails() = mutableListOf(
    email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá, você precisa ver esse site para"
        date = "02 set"
        stared = false
    },
    email {
        user = "Google"
        subject = "Veja como proteger melhor sua conta de email"
        preview = "Com poucos passsos você consegue proteger"
        date = "16 mar"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Vinicius Schulz acabou de enviar um vídeo"
        preview = "Vinicius Schulz enviou o vídeo CURIOSIDADES DO CANADA"
        date = "23 set"
        stared = true
        unread = true
    },
    email {
        user = "Hotmail"
        subject = "Um novo acesso da sua conta foi realizado"
        preview = "Confirme se foi você"
        date = "06 abr"
        stared = false
    },email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá, você precisa ver esse site para"
        date = "02 set"
        stared = false
    },
    email {
        user = "Google"
        subject = "Veja como proteger melhor sua conta de email"
        preview = "Com poucos passsos você consegue proteger"
        date = "16 mar"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Vinicius Schulz acabou de enviar um vídeo"
        preview = "Vinicius Schulz enviou o vídeo CURIOSIDADES DO CANADA"
        date = "23 set"
        stared = true
        unread = true
    },
    email {
        user = "Hotmail"
        subject = "Um novo acesso da sua conta foi realizado"
        preview = "Confirme se foi você"
        date = "06 abr"
        stared = false
    },email {
        user = "Instagram"
        subject = "Veja nossas três dicas principais para você conseguir"
        preview = "Olá, você precisa ver esse site para"
        date = "02 set"
        stared = false
    },
    email {
        user = "Google"
        subject = "Veja como proteger melhor sua conta de email"
        preview = "Com poucos passsos você consegue proteger"
        date = "16 mar"
        stared = false
    },
    email {
        user = "Youtube"
        subject = "Vinicius Schulz acabou de enviar um vídeo"
        preview = "Vinicius Schulz enviou o vídeo CURIOSIDADES DO CANADA"
        date = "23 set"
        stared = true
        unread = true
    },
    email {
        user = "Hotmail"
        subject = "Um novo acesso da sua conta foi realizado"
        preview = "Confirme se foi você"
        date = "06 abr"
        stared = false
    }
)
