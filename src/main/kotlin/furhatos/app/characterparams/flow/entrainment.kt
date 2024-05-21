package furhatos.app.characterparams.flow

import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.Section
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures

/////// Entrainment
val originality1Entrainment = state(Interaction) {
    originality1ENT.forEach { storyIdeasU ->
        onButton(label = storyIdeasU, color = Color.Red, section = Section.RIGHT) {
            furhat.say {
                +Gestures.BrowRaise
                +storyIdeasU
                +Gestures.Wink
            }
        }
    }
}

val originality2Entrainment = state(Interaction) {
    originality2ENT.forEach { storyIdeasU ->
        onButton(label = storyIdeasU, color = Color.Red, section = Section.RIGHT, instant = false) {
            furhat.say {
                +Gestures.BrowRaise
                +storyIdeasU
                +Gestures.Wink
            }
        }
    }
}

val originality3Entrainment = state(Interaction) {
    originality3ENT.forEach { storyIdeasU ->
        onButton(label = storyIdeasU, color = Color.Red, section = Section.RIGHT, instant = false) {
            furhat.say {
                +Gestures.BrowRaise
                +storyIdeasU
                +Gestures.Wink
            }
        }
    }
}


val originality1ENT = listOf(
        "Once upon a time, there were two kids on the beach with their dog, and they also had a robot, a robot like me",
        "and then the girl played with her dog for a long time",
        "let's say that they had to get the ball away from the bee, because the bee wanted to pop it",
        "and there was a horse, and the horse came to play with the kids and the dog",
        "and now, there was a robot, that was sad because he was on earth, and he wanted to be on his planet",
        "and then, a robot hides the treasure chest",
        "and there was a robot, that was blue and yellow"
)

val originality2ENT = listOf(
        "Once upon a time, there was an alien robot destroying the world.",
        "Let's say that the boy is allergic to mosquitos, he can't even be touched",
        "let's say that there was a magic chicken that had a very good sense of smell",
        "the girl keeps on jumping and jumping and jumping around",
        "and now, there was a robot, that was an astronaut, and he was very mad because the bee had a lot of money, and he didn't",
        "then the robot wanted to bring the girl and boy to his robotic house",
        "then the robot was shaking and shaking and shaking so that her eyes turned red"
)

val originality3ENT = listOf(
        "Once upon a time, there was a little boy called Caleb who always wanted to go to the bathroom",
        "and the girl says: \"If my dog runs away, what are we going to do now?\"",
        "and then a horse opened the treasure chest, there was a tiny bit of a coin and he ate it, then he transformed himself into a coin!",
        "and then, the kids disappeared and the dog was worried about the kids. He said, \"Where did they go?\". He was curious!",
        "and the dog came and he saw a bone on the water, he picked it and he turned into a unicorn dog",
        "then the robot said \"let's swim\" and then they changed into their swimming suits and started to swim in the lake with the shark and fish.",
        "then the robot has a missile system and killed them all with its bombs"
)
