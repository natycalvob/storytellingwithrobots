package furhatos.app.characterparams.nlu

import furhatos.nlu.ComplexEnumEntity
import furhatos.nlu.EnumEntity
import furhatos.nlu.Intent
import furhatos.nlu.ListEntity
import furhatos.util.Language

// Entity for good things the user can do
class Thing : EnumEntity(stemming = true, speechRecPhrases = true) {
    override fun getEnum(lang: Language): List<String> {
        return listOf("running", "jumping", "swimming", "climbing", "dancing", "yoga", "skating", "riding a bike",
                "playing soccer", "playing basketball", "tennis", "golf", "martial arts", "gymnastics",
                "horse riding", "drawing", "painting", "sculpting", "sewing", "knitting", "origami",
                "building models", "playing the piano", "playing the guitar", "playing the violin", "cooking",
                "baking", "math", "science", "reading", "writing", "solving puzzles", "playing chess",
                "playing strategy games", "memory games", "coding", "learning languages", "history knowledge",
                "geography knowledge", "making friends", "helping others", "public speaking", "acting",
                "singing", "playing in a band", "storytelling", "listening to others", "empathy",
                "conflict resolution", "creative writing", "composing music", "designing clothes",
                "crafting", "photography", "filmmaking", "animation", "graphic design", "decorating",
                "gardening", "navigating", "planning trips", "organizing events", "taking care of pets",
                "teaching others", "making friends", "problem-solving", "helping others", "being polite", "sharing",
                "listening to others", "being empathetic", "respecting others' feelings", "being inclusive", "playing football",
                "playing video games", "playing soccer")
    }
}


// Intent for sharing good things
class ShareGoodThing(val Thing: Thing? = null) : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
                "@Thing", "I am good at @Thing",
                "I'm really good at @Thing",
                "I'm great at @Thing",
                "I'm awesome at @Thing",
                "I rock at @Thing",
                "I'm super at @Thing",
                "I'm fantastic at @Thing",
                "I'm amazing at @Thing",
                "I'm a pro at @Thing",
                "I'm a whiz at @Thing",
                "I'm a champ at @Thing",
                "I'm really skilled at @Thing",
                "I'm really talented at @Thing",
                "I'm really smart at @Thing",
                "I'm really quick at @Thing",
                "I'm really clever at @Thing",
                "I'm really creative at @Thing",
                "I'm really strong at @Thing",
                "I'm really fast at @Thing",
                "I'm really cool at @Thing",
                "I'm really funny at @Thing",
                "I like @Thing", "I do @Thing", "I help @Thing",
                "I can @Thing", "Yes, I know how to @Thing", "I know how to @Thing"
        )
    }
}


// Intent for sharing bad things
class ShareBadThing(val Thing: Thing? = null) : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
                "@Thing",
                "I am not good @Thing", "I am not good @Thing",
                "I'm not very good at @Thing",
                "I'm not good at @Thing",
                "I'm not great at @Thing",
                "I'm not awesome at @Thing",
                "I'm not super at @Thing",
                "I'm not fantastic at @Thing",
                "I'm not amazing at @Thing",
                "I'm not a pro at @Thing",
                "I'm not a whiz at @Thing",
                "I'm not a champ at @Thing",
                "I'm not really skilled at @Thing",
                "I'm not really talented at @Thing",
                "I'm not really smart at @Thing",
                "I'm not really quick at @Thing",
                "I'm not really clever at @Thing",
                "I'm not really creative at @Thing",
                "I'm not really strong at @Thing",
                "I'm not really fast at @Thing",
                "I'm not really cool at @Thing",
                "I'm not really funny at @Thing",
                "I'm still learning @Thing", "I don't like @Thing",
                "I can't @Thing", "I don't @Thing", "couldn't @Thing",
                "I don't know how to @Thing"
        )
    }
}
