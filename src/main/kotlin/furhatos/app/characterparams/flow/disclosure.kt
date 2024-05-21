package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.app.characterparams.flow.*
import furhatos.app.characterparams.nlu.*
import furhatos.nlu.common.*


val SmallTalkDisclosure = state(Interaction) {
    onEntry {
        furhat.say("Tell you what. I really like telling stories. I think I can be very good at telling stories because" +
                " I try really hard to learn how to tell good stories.")
        delay(2000)
        furhat.ask("What about you? Can you tell me things that are good about you or things you can do well?")
    }

    onReentry{
        furhat.ask("What about you?")
    }

    onResponse<ShareGoodThing> {
        furhat.say("${it.intent.Thing}, Wow, that’s interesting.")
        furhat.say("It's great to hear that!. Keep it up!")
        delay(500)
        goto(PromptBadThings)
    }

    onResponse<No>  {
        furhat.say("Okay, Let’s talk about it next time.")
        delay(500)
        goto(PromptBadThings)
    }
}

val PromptBadThings = state(Interaction) {
    onEntry {
        furhat.say("Did you know, I sometimes don’t know the answer to what people ask me. I’m still learning," +
                " but that embarrasses me a lot.")
        delay(3000)
        furhat.ask("What about you? Can you tell me things that you are not so good at, or things you " +
                "tried but didn’t go so well? ")
    }

    onReentry{
        furhat.ask("What about you?")
    }

    onResponse<ShareBadThing> {
        furhat.say("${it.intent.Thing}, Yes, sometimes it can be hard. But that is okay. " +
                "Everyone has things they're not so good at.")
        delay(500)
        furhat.say("Thanks for sharing, and don’t worry. We will get better every time we try.")
        delay(500)
    }

    onResponse<No>  {
        furhat.say("Okay, Let’s talk about it next time.")
        delay(500)
    }
}
