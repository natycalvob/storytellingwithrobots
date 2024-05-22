package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures
import furhatos.app.characterparams.flow.*
import furhatos.nlu.common.*

val SmallTalkIntro = state(Interaction) {
    onEntry {
        furhat.say("Hello. My name is Niky. What is your name?")
        delay(2000)
        furhat.gesture(Gestures.Smile)
        furhat.say("Nice to meet you. ${furhat.voice.pause("1000ms")}" +
                " ${furhat.voice.emphasis("I am so happy to play with you today!")}" +
                " ${furhat.voice.pause("1000ms")}")
        goto(CheckRobotExperience)
    }
}

val CheckRobotExperience = state(Interaction) {
    onEntry {
        furhat.ask("Have you played with robots before?")
    }

    onResponse<Yes> {
        furhat.say("${furhat.voice.emphasis("Wow,")} that’s very nice! " +
                "I have so many robot friends. ${furhat.voice.pause("500ms")}")
        goto(AskStoryPreference)
    }

    onResponse<No> {
        furhat.say("${furhat.voice.emphasis("Oh,")} I hope you can have a lot of fun today. ")
        delay(500)
        goto(AskStoryPreference)
    }
}

val AskStoryPreference = state(Interaction) {
    onEntry {
        furhat.ask("I am a robot who likes stories very much. Do you like to tell stories to your friends?")
    }

    onResponse<Yes> {
        furhat.say("${furhat.voice.emphasis("Great!")} I am sure I will learn a lot from you today. " +
                "What is your favorite story?")
        goto(FavoriteStory)
    }

    onResponse<No> {
        furhat.say("${furhat.voice.emphasis("Oh no!")} I hope that playing with me can make you change your mind!")
        goto(AskMoviePreference)
    }
}

val FavoriteStory = state(Interaction) {
    onEntry {
        delay(2000)
        furhat.say("That sounds interesting! I'd love to hear more about it.")
        delay(500)
        goto(AskMoviePreference)
    }
}

val AskMoviePreference = state(Interaction) {
    onEntry {
        furhat.say("One kid once told me that he likes movies, and told me a story about the princesses Elsa and Ana ${furhat.voice.pause("800ms")} " +
                "they were two sisters that built a snowman")
        delay(500)
        furhat.ask("Have you seen that movie?")
    }

    onReentry{
        furhat.ask("Have you seen Frozen, the movie?")
    }
    onResponse<Yes> {
        furhat.say("${furhat.voice.emphasis("Wow")} It seems that it is a very famous movie. Did you like it?")
        goto(MoviePreferenceResponse)
    }

    onResponse<No> {
        delay(300)
        goto(AskStory)
    }
}

val MoviePreferenceResponse = state(Interaction) {
    onEntry {
        furhat.listen()
    }

    onResponse<Yes> {
        furhat.gesture(Gestures.Surprise)
        furhat.say("Now, I am curious, can you tell me more about it?")
        delay(3000)
        goto(AskStory)
    }

    onResponse<No> {
        furhat.say("${furhat.voice.emphasis("Really")}. Why?")
        delay(2000)
        furhat.say("Umh, probably, I wouldn't like it either")
        furhat.gesture(Gestures.Shake)
        goto(AskStory)
    }
}


val AskStory = state(Interaction) {
    onEntry {
        furhat.say("I will tell you something. I don’t know how to tell stories very well. ")
        furhat.ask("I would like to learn from you. Would you tell me a story?")
    }

    onReentry{
        furhat.ask("Would you tell me a story?")
    }
    onResponse<Yes> {
        furhat.say("${furhat.voice.emphasis("Nice!")} Let's start our story game.")
        // Transition to a story-telling state if available
    }

    onResponse<No> {
        furhat.say("${furhat.voice.emphasis("Come on!")} I promise it will be fun!")
        furhat.listen()
        reentry()
    }
}

