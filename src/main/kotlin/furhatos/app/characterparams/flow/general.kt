package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.PollyVoice
import furhatos.util.*

val Idle: State = state {

    init {
        // furhat.setVoice(Language.ENGLISH_US, Gender.MALE)
        furhat.setVoice(Language.ENGLISH_US, Gender.FEMALE)
        furhat.voice = PollyVoice.Ivy()
        if (users.count > 0) {
            furhat.attend(users.random)
        }
    }

    onEntry {
        goto(Start)
    }
}

