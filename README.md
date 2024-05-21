# Storytelling with Social Robots
## Short Version 

This is a short version of Storytelling Application for the project *Boost Your Creativity with Social Robots*. The project implements the social robot Furhat that engages children in storytelling creation, as well as different 
activities such as a small talk and self-disclosure task, to understand how children interact with robots.
The interaction is designed to be engaging and educational, encouraging children to express their verbal creativity.

## Table of Contents
1. [Stages of Interaction](#stages-of-interaction)
    - [Storytelling](#storytelling)
    - [Small Talk](#small-talk)
    - [Self-Disclosure](#self-disclosure)
2. [Hardware Requirements](#hardware-requirements)
3. [Installation](#installation)
4. [Usage](#usage)
5. [Publications](#publications)
6. [Contributing](#contributing)
7. [License](#license)

## Stages of Interaction
The interaction comprises three stages: 

### Small Talk
*Autonomous Conversation using NLU* 

During the small talk stage, the social robot engages the child in casual conversation. 
This helps build rapport and makes the interaction more enjoyable and natural. 
The robot uses various prompts to keep the conversation flowing and make the child feel comfortable.

### Storytelling
*Tele-operated Activity*

In the storytelling stage, the robot encourages children to come up with creative ideas for stories. 
The robot may provide prompts or suggestions to help spark the child's imagination. This stage aims to develop 
the child's narrative skills and creativity.

### Self-Disclosure
*Autonomous Conversation using NLU*

The self-disclosure stage allows the child to share personal experiences and feelings. The social robot encourages 
the child to talk about things they are good at, things they find challenging, and other personal topics. 
This stage aims to build trust.

## Hardware Requirements
- **Computer**: A computer capable of running the virtual agent software.
- **Microphone**: A good quality microphone to capture the child's voice clearly.
- **Speakers**: Quality speakers to ensure the child can hear the virtual agent properly.

## Installation
1. **Clone the Repository**:
    ```sh
    git clone https://github.com/yourusername/storytelling-interaction.git
    cd storytelling-interaction
    ```
2. **Install Dependencies**:
   Ensure you have Kotlin and any other required dependencies installed. You may use a build tool like Gradle.
    ```sh
    ./gradlew build
    ```
3. **Run the Application**:
    ```sh
    ./gradlew run
    ```

## Usage
Once the application is running, follow the on-screen instructions to start the interaction. The virtual agent will guide the child through the storytelling, small talk, and self-disclosure stages.

### Sample Code
```kotlin
val SmallTalkIntro = state(Interaction) {
    onButton("Hello", color = Color.Blue, section = Section.LEFT) {
        furhat.say("Hello. My name is Niky. What is your name?")
    }
    onButton("NiceMeetU") {
        furhat.gesture(Gestures.Smile)
        furhat.say("Nice to meet you. ${furhat.voice.pause("2000ms")}" +
                " ${furhat.voice.emphasis("I am so happy to play with you today!")}" +
                " ${furhat.voice.pause("1000ms")}" +
                "Have you played with robots before?")
    }
    // Add more buttons and responses as needed
}

```
## Publications
- Calvo-Barajas, N., & Castellano, G. (2022, August). Understanding children’s trust development through repeated interactions with a virtual social robot. In 2022 31st IEEE International Conference on Robot and Human Interactive Communication (RO-MAN) (pp. 1451-1458). IEEE.
- Calvo-Barajas, N., & Castellano, G. (2022, September). "I have an idea!" enhancing children's verbal creativity through repeated interactions with a virtual robot. In Proceedings of the 22nd ACM International Conference on Intelligent Virtual Agents (pp. 1-8).
- Calvo-Barajas, N., & Akkuzu, A., & Castellano, G. (2024, In Press). Balancing Human Likeness in Social Robots: Impact on Children's Lexical Alignment and Self-disclosure for Trust Assessment





