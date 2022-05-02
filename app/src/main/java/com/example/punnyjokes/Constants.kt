package com.example.punnyjokes

object Constants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS = "correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Why did the crab never share?",
            R.drawable.jigglypuff,
            "All of the below",
            "Because he’s a crabby person",
            "Because he's shellfish",
            "Because he’s Eugene Harold Krabs",
            1
        )

        questionList.add(que1)
//========================================================
        val que2 = Question(
            2,
            "What does a dolphin say when he’s confused?",
            R.drawable.jigglypuff,
            "Can you please be more Pacific",
            "Can you please be more Atlantic",
            "Can you please be more Indian",
            "Can you please be more Arctic",
            1
        )

        questionList.add(que2)
//========================================================
        val que3 = Question(
            3,
            "What is a cat’s favorite book?",
            R.drawable.jigglypuff,
            "litterature",
            "The Great Catsby",
            "Answer 3",
            "Answer 4",
            2
        )

        questionList.add(que3)
//========================================================
        val que4 = Question(
            4,
            "What did the buffalo say to the younger buffalo?",
            R.drawable.jigglypuff,
            "Bison",
            "Ello mate",
            "Nelson",
            "Nelson pelt",
            1
        )

        questionList.add(que4)
//========================================================
        val que5 = Question(
            5,
            "What would bears be without Bees?",
            R.drawable.jigglypuff,
            "Ears",
            "Pears",
            "Sears",
            "Beers",
            1
        )

        questionList.add(que5)
//========================================================
        val que6 = Question(
            6,
            "What is every whale's favorite greeting?",
            R.drawable.jigglypuff,
            "Whale hello there",
            "Aloha",
            "Ni hao",
            "Bellena",
            1
        )

        questionList.add(que6)
//========================================================
        val que7 = Question(
            7,
            "Why do cows have hooves instead of feet?",
            R.drawable.jigglypuff,
            "Because they are lactose",
            "Because they are hoovering",
            "Because they are blind",
            "Because they need some milk",
            1
        )

        questionList.add(que7)
//========================================================
        val que8 = Question(
            8,
            "What do you call a bunch of pandas who are sick? ",
            R.drawable.jigglypuff,
            "Pandamic",
            "Po",
            "Epicpanda",
            "Slime",
            1
        )

        questionList.add(que8)
//========================================================
        val que9 = Question(
            9,
            "What is the difference between a panda and a polar bear?",
            R.drawable.jigglypuff,
            "roughly 1,000 miles",
            "roughly 1,000 kilometers",
            "Color",
            "Eye color",
            1
        )

        questionList.add(que9)
//========================================================
        val que10 = Question(
            10,
            "Why did the wolf cross the road?",
            R.drawable.jigglypuff,
            "To chase the chicken",
            "To hear what the fox say",
            "Because the chicken did",
            "The chicken was after him",
            4
        )

        questionList.add(que10)

        return questionList
    }
}