package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures
import furhatos.records.Location

val Interaction: State = state() {
    onEntry {
        furhat.attend(users.current)
        furhat.gesture(Gestures.Roll)
    }
    // Dialogue Sessions that overwrite
    onButton("SmallTalkIntro", color = Color.Blue, section = Section.LEFT) {
        goto(SmallTalkIntro)
    }
    onButton("SmallTalkDisclosure", color = Color.Green, section = Section.LEFT) {
        goto(SmallTalkDisclosure)
    }
    onButton("Storytelling", color = Color.Red, section = Section.LEFT) {
        goto(IntStorytellingEnt)
    }

    onButton("Go to Start", color = Color.Yellow, section = Section.LEFT) {
        goto(Start)
    }

    // General Behaviours (Section.RIGHT; always visible)
    // Verbal Behaviours
    onButton("yourTurn", color = Color.Yellow, section = Section.RIGHT) {
        furhat.say("it's your turn")
    }
    onButton("myTurn", color = Color.Yellow, section = Section.RIGHT) {
        furhat.say("it's my turn")
    }
    onButton("likePlaying?", color = Color.Yellow, section = Section.RIGHT) {
        random(
                { furhat.say("Do you like playing with me?") },
                { furhat.say("Did you have fun?") },
                { furhat.say("Did you like our game?") }
        )
    }
    onButton("Yes", color = Color.Yellow, section = Section.RIGHT) {
        furhat.gesture(Gestures.Nod)
        random(
                { furhat.say("Yes") },
                { furhat.say("Yeah") },
                { furhat.say("Of course") }
        )
    }
    onButton("No", color = Color.Yellow, section = Section.RIGHT){
        furhat.gesture(Gestures.Shake)
        random(
                { furhat.say("No") },
                { furhat.say("Nope") },
                { furhat.say("I don't think so") }
        )
    }

    onButton("I don't understand", color = Color.Yellow, section = Section.RIGHT) {
        furhat.say("I'm sorry. I don't understand")
    }

    onButton("thanks", color = Color.Yellow, section = Section.RIGHT){
        random(
                { furhat.say("Thanks") },
                { furhat.say("Thank you") }
        )
    }

    onButton("don'tKnow", color = Color.Yellow, section = Section.RIGHT ) {
        random(
                { furhat.say("I don't know") },
                { furhat.say("I am not sure") },
                { furhat.say("I can't answer that right now!") }
        )
    }
    onButton("Great", color = Color.Yellow, section = Section.RIGHT){
        random(
                { furhat.say("Great") },
                { furhat.say("Nice") },
                { furhat.say("Okay! that's great!") }
        )
    }
    onButton("That was a good story", color = Color.Yellow, section = Section.RIGHT, size = Size.Large) {
        furhat.say("That was a ${furhat.voice.emphasis("really good")} story. I have learnt a lot from you. " +
                " ${furhat.voice.pause("1000ms")} I can tell your story to other kids around the world! ")
    }

    onButton("Finish, Bye", color = Color.Yellow, section = Section.RIGHT){
        furhat.say("We have finished today. Thank you for telling me your story!")
        random(
                { furhat.say("Bye") },
                { furhat.say("Have a nice day, bye") },
                { furhat.say("Good-bye") }
        )
    }

    onButton("Attend User", color = Color.Red, section = Section.RIGHT){
        furhat.attend(users.current)
    }

    onButton("Attend Screen", color = Color.Red, section = Section.RIGHT){
        furhat.attend(Location.DOWN)
        furhat.gesture(Gestures.Shake(strength = 0.5, duration = 3.0))
    }

    onButton("Attend Random", color = Color.Red, section = Section.RIGHT){
        furhat.attendNobody()
    }

    onButton("Nod", color = Color.Red, section = Section.RIGHT){
        furhat.gesture(Gestures.Nod)
    }
}

/*
val SmallTalkIntro = state(Interaction) {
    onButton("Hello", color = Color.Blue, section = Section.LEFT) {
        furhat.say("Hello. My name is Niky. What is your name?")
    }
    onButton("NiceMeetU"){
        furhat.gesture(Gestures.Smile)
        furhat.say("Nice to meet you. ${furhat.voice.pause("2000ms")}" +
                " ${furhat.voice.emphasis("I am so happy to play with you today!")}" +
                " ${furhat.voice.pause("1000ms")}" +
                "Have you played with robots before?")
    }
    onButton("YesRobot", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Wow,")} that’s very nice! " +
                "I have so many robot friends")
    }
    onButton("NoRobot", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Oh,")} I hope you can have a lot of fun today.")
    }
    onButton("robotLikeStories", color = Color.Blue, section = Section.LEFT){
        furhat.say("I am a robot who likes stories very much. Do you like to tell stories to your friends?")
    }
    onButton("YesLikeStories", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Great!")} I am sure I will learn a lot from you today. " +
                "What is your favorite story?")
    }
    onButton("NoLikeStories", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Oh no!")} I hope that playing with me can make you change your mind!")
    }
    onButton("Movie", color = Color.Blue, section = Section.LEFT){
        furhat.say("One kid once told me that he likes movies, and told me a story about Jack Sparrow. " +
                "Have you seen that movie?")
    }
    onButton("YesSeenMovie", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Wow")} It seems that it is a very famous movie. Did you like it?")
    }
    onButton("YesLikeMovie", color = Color.Blue, section = Section.LEFT){
        furhat.gesture(Gestures.Surprise)
        furhat.say("Now, I am curious")
    }
    onButton("NoLikeMovie", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Really")}. Why?")
    }
    onButton("ResponseNo", color = Color.Blue, section = Section.LEFT){
        furhat.say("Umh, probably, I wouldn't like it either")
        furhat.gesture(Gestures.Shake)
    }
    onButton( "TellMeStory", color = Color.Blue, section = Section.LEFT){
        furhat.say("I will tell you something. I don’t know how to tell stories very well. " +
                "I would like to learn from you. Would you tell me a story?")
    }
    onButton("YesTellStory", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Nice!")} Let's start our story game.")
    }
    onButton("NoTellStory", color = Color.Blue, section = Section.LEFT){
        furhat.say("${furhat.voice.emphasis("Come on!")} I promise it will be fun!")
    }
} */

/*
val SmallTalkDisclosure = state(Interaction) {
    disclosureTalk.forEach { disclosureTalkU ->
        onButton(label = disclosureTalkU, color = Color.Green, section = Section.LEFT) {
            furhat.say {
                +disclosureTalkU
            }
        }
    }
}

val disclosureTalk = listOf(
        "Tell you what. I really like telling stories. I think I can be very good at telling stories, because I try really hard to learn, how to tell good stories",
        "What about you? Can you tell me things that are good about you, or things you can do well?",
        "Okay, Let’s talk about it next time",
        "Wow, that’s interesting",
        "Did you know, I sometimes don’t know the answer to what people ask me. I’m still learning, but that embarrasses me a lot.",
        "What about you? Can you tell me things that you are not so good at, or things you tried but didn’t go so well?",
        "Okay, let’s talk about it next time.",
        "Thanks for sharing, and don’t worry. We will get better every time we try."
)
*/