package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.voice.PollyVoice
import furhatos.util.Gender
import furhatos.util.Language

val Start: State = state {

    onEntry {
        furhat.attend(users.current)
    }
    onButton("Interaction", color = Color.Green){
        goto(Interaction)
    }

    // Define the appearance and voice of the robot
    onButton("Machine-like", color = Color.Yellow, section = Section.RIGHT){
        furhat.setCharacter("Billy")
        furhat.setVoice(Language.ENGLISH_US, Gender.FEMALE)
        furhat.voice = PollyVoice.Ivy()
        furhat.say("I am a more machine-like character")
    }
    onButton("Human-like", color = Color.Red, section = Section.RIGHT){
        furhat.setCharacter("Devan")
        furhat.setVoice(Language.ENGLISH_US, Gender.MALE)
        furhat.voice = PollyVoice.Justin()
        furhat.say("I am a more human-like character")
    }
}