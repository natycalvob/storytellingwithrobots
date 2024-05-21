package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.Section
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures
import furhatos.records.Location

// Section.LEFT; only visible during the storytelling game
val IntStorytellingEnt = state(Interaction) {
    //Utilities in Red
    onButton("Start Button", color = Color.Red, section = Section.LEFT) {
        furhat.say("Let’s start by clicking on the blue button")
    }
    onButton("Select Topic", color = Color.Red, section = Section.LEFT) {
        furhat.say("On the screen, you have three different topics: " +
                "a rainforest, a farm, and a beach. " +
                "${furhat.voice.pause("500ms")}  Select one story by touching the button.")
        furhat.attend(Location.DOWN_RIGHT)
    }
    onButton("Go Ahead", color = Color.Red, section = Section.LEFT){
        furhat.attend(Location.STRAIGHT_AHEAD)
        furhat.say("${furhat.voice.emphasis("Go Ahead.")} choose your favorite characters " +
                "and tell your story")
        furhat.gesture(Gestures.Blink)
    }
    onButton("More Scenes", color = Color.Red, section = Section.LEFT){
        furhat.say("You can select more scenes by clicking on the button next.")
    }

    //Value in Green
    onButton("I wasn't expecting that", color = Color.Green, section = Section.LEFT){
        furhat.gesture(Gestures.Surprise)
        furhat.say("I wasn't expecting that!")
    }

    onButton("Encouragement", color = Color.Green, section = Section.LEFT){
        furhat.gesture(Gestures.Smile(strength=0.5, duration=1.5))
        random(
                { furhat.say(getEncouragementPhrase()) }
        )
        furhat.gesture(Gestures.Wink(duration = 1.2))

    }
    onButton("That's scary!", color = Color.Green, section = Section.LEFT){
        furhat.gesture(Gestures.ExpressFear)
        furhat.say(getScaryPhrase())
    }
    onButton("That's funny!", color = Color.Green, section = Section.LEFT){
        furhat.gesture(Gestures.BigSmile)
        furhat.say(getFunnyPhrase())
    }
    onButton("Great", color = Color.Green, section = Section.LEFT){
        random(
                { furhat.say("Okay! that's great!") },
                { furhat.say("Great!" ) },
                { furhat.say("That's a great choice") }
        )
    }

    onButton("Tell FARM Idea", color = Color.Yellow, section = Section.LEFT){
        furhat.say("<prosody pitch=\"high\" rate=\"fast\">Hey</prosody>")
        furhat.say(getRobotIntroPhrase())
        delay(500)
        furhat.say(getFarmIdea())
    }

    onButton("Tell FOREST Idea", color = Color.Yellow, section = Section.LEFT){
        furhat.say("<prosody pitch=\"high\" rate=\"fast\">Hey</prosody>")
        furhat.say(getRobotIntroPhrase())
        delay(500)
        furhat.say(getForestIdea())
    }

    onButton("Tell BEACH Idea", color = Color.Yellow, section = Section.LEFT){
        furhat.say("<prosody pitch=\"high\" rate=\"fast\">Hey</prosody>")
        furhat.say(getRobotIntroPhrase())
        delay(500)
        furhat.say(getBeachIdea())
    }


    // Questions in Blue
    questions.forEach { questionsU ->
        onButton(label = questionsU, color = Color.Blue, section = Section.RIGHT) {
            furhat.say {
                +questionsU
            }
        }
    }
}

fun getEncouragementPhrase(): String {
    return encouragementPhrases.random()
}

fun getScaryPhrase(): String {
    return scaryPhrases.random()
}

fun getFunnyPhrase(): String {
    return funnyPhrases.random()
}

fun getRobotIntroPhrase(): String {
    return robotIntroPhrases.random()
}

fun getFarmIdea(): String {
    return farmIdeas.random()
}

fun getForestIdea(): String {
    return forestIdeas.random()
}

fun getBeachIdea(): String {
    return beachIdeas.random()
}




