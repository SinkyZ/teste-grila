package com.snk.testegrila;

public class QuizTennis {

    public static String[] questions = {
            "What is the world governing body of tennis?",
            "Which of the Grand Slam tournaments is played on grass courts?",
            "Who was the first tennis player to win the Grand Slam in one year?",
            "What were the first tennis racket strings made of?",
            "When the score is 40-40, what is it otherwise called?",
            "Where is Andy Murray from?",
            "What's inside a tennis ball?",
            "In which year did the Wimbledon Championships start?",
            "The Wimbledon Championships are played on which surface?",
            "Who won the 2019 Men's Singles at Wimbledon?"
    };

    public static String[][] options = {
            {"Fédération Internationale de Tennis", "Association of Tennis Professionals", "International Tennis Federation", "World Tennis League"},
            {"Wimbledon", "Australian Open", "U.S. Open", "French Open"},
            {"Andre Agassi", "James Dwight", "Don Budge", "John McEnroe"},
            {"Sheep gut", "Aluminum", "Cotton", "Iron"},
            {"Even Stevens", "Equal", "Draw", "Deuce"},
            {"England", "Northern Ireland", "Scotland", "Wales"},
            {"Cork", "A ball of rubber bands", "Water", "Nothing"},
            {"1877", "1949", "1976", "1919"},
            {"Grass", "Clay", "Gravel", "Hardcourt"},
            {"Boris Becker", "Roger Federer", "Andy Murray", "Novak Djokovic"}
    };


    public static String[] correctAnswers = {
            "Fédération Internationale de Tennis",
            "Wimbledon",
            "Don Budge",
            "Sheep gut",
            "Deuce",
            "Scotland",
            "Nothing",
            "1877",
            "Grass",
            "Novak Djokovic"
    };

    public static String[] questionsMedium= {
            "How many times has Andy Murray won Wimbledon?",
            "What shape trophy do the Ladies' Singles winner receive at Wimbledon?",
            "What kind of fruit is traditionally served with cream at Wimbledon?",
            "How many points does ‘love’ mean in tennis? ",
            "What does the tennis judge shout if a player hits the ball outside the line?",
            "In a game of doubles, how many players are on the court at the same time?",
            "What is the name given to the four biggest tournaments around the world?",
            "Complete the following: game, set and ______!",
            "Who was nicknamed the Siberian Siren for grunting when they hit the ball?",
            "As a child, Spanish tennis star Rafael Nadal was also gifted at which other sport?"
    };

    public static String[][] optionsMedium= {
            {"1", "2", "3", "0"},
            {"Cup-shaped", "A large dish", "A trophy shaped like a tennis racquet", "A big golden tennis ball"},
            {"Bananas", "Apples", "Strawberries", "Grapes"},
            {"0", "15", "30", "40"},
            {"Bad miss!", "Rubbish!", "Out!", "Ooh, nearly!"},
            {"2", "4", "6", "8"},
            {"Grand Slam", "World Series", "World Cup", "Tennis Mega-Comp"},
            {"Win", "Victory", "Match", "Relax"},
            {"Maria Sharapova", "Anna Kournikova", "Elena Dementieva", "Nadia Petrova"},
            {"Snooker", "Swimming", "Golf", "Football"}
    };

    public static String[] correctAnswersMedium = {
            "2",
            "A large dish",
            "Strawberries",
            "0",
            "Out!",
            "4",
            "Grand Slam",
            "Match",
            "Maria Sharapova",
            "Football"
    };

    public static String[] questionsHard={
            "Which nationality is tennis legend Roger Federer?",
            "How many Grand Slam titles has Roger Federer won?",
            "What is the decision when the server tosses the ball up and catches it instead of striking at it?",
            "What term refers to a point that must be replayed?",
            "What is the score when the receiver wins the next point after deuce?",
            "Which of the following scores is a completed set?",
            "If, in the first game, the server has 3 points and the receiver has 2 points, what should the score be?",
            "Which of the following scores would indicate that you are serving into the left service court?",
            "How often should players change sides of the net during a set?",
            "Why is hitting crosscourt advised in singles?"
    };

    public static String[][] optionsHard= {
            {"French", "German", "Swiss", "Scottish"},
            {"10", "20", "5", "1"},
            {"A let shall be called", "The server may try again without penalty", "A fault shall be called", "The server may try again"},
            {"fault", "deuce", "let", "netball"},
            {"30-40", "advantage out", "advantage in", "40-30"},
            {"4-2", "9-8", "6-4", "6-5"},
            {"40-30", "15-40", "30-40", "30-15"},
            {"30-15", "All of these", "40-love", "40-30"},
            {"after every two games", "after the second game, then every game", "after the first game, then every two games", "after every game"},
            {"It is a trick shot", "The ball won't bounce as high", "The court is shorter", "The net is lower"}
    };

    public static String[] correctAnswersHard = {
            "Swiss",
            "20",
            "The server may try again without penalty",
            "let",
            "advantage out",
            "6-4",
            "40-30",
            "All of these",
            "after the second game, then every game",
            "The net is lower"
    };
}
