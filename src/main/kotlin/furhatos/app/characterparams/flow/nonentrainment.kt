package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.Section
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures



/////// Non Entrainment
val originality1NonEntrainment = state(Interaction) {
    originality1NonENT.forEach { storyIdeasU ->
        onButton(label = storyIdeasU, color = Color.Red, section = Section.RIGHT) {
            furhat.say {
                +Gestures.BrowRaise
                +storyIdeasU
                +Gestures.Wink
            }
        }
    }
}

val originality2NonEntrainment = state(Interaction) {
    originality2NonENT.forEach { storyIdeasU ->
        onButton(label = storyIdeasU, color = Color.Red, section = Section.RIGHT, instant = false) {
            furhat.say {
                +Gestures.BrowRaise
                +storyIdeasU
                +Gestures.Wink
            }
        }
    }
}

val originality3NonEntrainment = state(Interaction) {
    originality3NonENT.forEach { storyIdeasU ->
        onButton(label = storyIdeasU, color = Color.Red, section = Section.RIGHT, instant = false) {
            furhat.say {
                +Gestures.BrowRaise
                +storyIdeasU
                +Gestures.Wink
            }
        }
    }
}


val originality1NonENT = listOf(
        "Once upon a time, there was a prince and a princess on the playground with their crocodile, and they also had an alien...",
        "and there was a princess who played with her crocodile for a long time",
        "let's say that they had to get the air balloon away from the mosquito, because the mosquito wants to pop it",
        "and there was a cow, and the cow came to play with the princess and the prince and the cat",
        "and now, there was an alien, who was sad because he was on earth, and he wanted to be on his planet",
        "and then an alien hides the treasure chest",
        "and then, there was an alien who was blue and yellow"
)

val originality2NonENT = listOf(
        "Once upon a time, there was an alien destroying the world.",
        "let's say that there is a prince, who is allergic to mosquitos, he can't even be touched",
        "let's say that there is a magic crocodile had a very good sense of smell",
        "and then there is a princess, who keeps on jumping and jumping and jumping around",
        "and now, there was an alien that was an astronaut, and he was very mad because the bee had a lot of money, and he didn't",
        "then an alien wanted to bring a princess and a prince to his house on planet Mars",
        "then an alien was shaking and shaking and shaking so that her eyes turned red"
)

val originality3NonENT = listOf(
        "Once upon a time, there was a little prince called Caleb who always wanted to go to the bathroom",
        "and the princess says: \"If my crocodile runs away, what are we going to do now?\"",
        "and there was a cow, that opened the treasure chest, there was a tiny bit of a coin, and she ate it, then she transformed herself into a coin!",
        "then a prince and a princess disappeared, and there was a crocodile, that was worried about them. He said, \"Where did they go?\". He was curious!",
        "and then a cat came, and she saw a bone on the water, he picked it, and he turned into a unicorn",
        "then an alien said \"let's swim\" and then they changed into their swimming suits and started to swim in the lake with the shark and fish.",
        "then there was an alien, who has a missile system and killed them all with its bombs"
)