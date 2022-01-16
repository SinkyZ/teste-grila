package com.snk.testegrila;

public class Quiz {

    /**
     * Aici ne sunt retinute intrebarile, optiunile si raspunsurile Quiz-urilor de Istorie in functie de dificultate.
     */

    public static String[] questions = {
            "Which of these locations was never under Ottoman rule?",
            "World War I began in which year?",
            "Adolf Hitler was born in which country?",
            "John F. Kennedy was assassinated in:",
            "The disease that ravaged and killed a third of Europe's population in the 14th century is known as:",
            "The Hundred Years War was fought between what two countries?",
            "Who was the first Western explorer to reach China?",
            "In which year did India get independence from Britain?",
            "American involvement in the Korean War took place in which decade?",
            "The Magna Carta was published by the King of which country?"
    };

    public static String[][] options = {
            {"Macedonia", "Egypt", "Vienna", "Kosovo"},
            {"1923", "1938", "1917", "1914"},
            {"France", "Germany", "Austria", "Hungary"},
            {"New York", "Austin", "Dallas", "Miami"},
            {"The White Death", "The Black Plague", "Smallpox", "The Bubonic Plague"},
            {"Italy and Carthage", "England and Germany", "France and England", "Spain and France"},
            {"Magelan", "Cook", "Marco Polo", "Sir Francis Drake"},
            {"1944", "1945", "1946", "1947"},
            {"1970s", "1950s", "1920s", "1960s"},
            {"France", "Austria", "Italy", "England"}
    };


    public static String[] correctAnswers = {
            "Vienna",
            "1914",
            "Austria",
            "Dallas",
            "The Bubonic Plague",
            "France and England",
            "Marco Polo",
            "1947",
            "1950s",
            "England"
    };

    public static String[] questionsMedium= {
            "In which area of the world did the Ancient Mayan population live?",
            "Who is the historical leader who is said to have been responsible for the deaths of anywhere between 10 and 70 million people?",
            "Which US state was its own country from 1777 to 1791?",
            "The Challenger Disaster took place on which date?",
            "The 1936 Berlin Olympics are also known as _________.",
            "In which year did the Euro completely replace many European currencies?",
            "Hong Kong was considered a British colony until which year?",
            "South Africa's system of racial segregation was known as _________.",
            "Operation Desert Storm commenced in which year?",
            "Mahmoud Ahmadinejad was the President of which country from 2005 until 2013?"
    };

    public static String[][] optionsMedium= {
            {"Easter Peru, northren Ecuador", "Northern United States, southern Canada", "Southern Mexico, Guatemala, northern Belize, western Honduras", "Eastern Chile, western Argentina"},
            {"Genghis Khan", "Ganghis Khan", "Joseph Stalin", "Napoleon Bonaparte"},
            {"Massachusetts", "Maine", "New Hampshire", "Vermont"},
            {"November6, 1987", "December 28, 1984", "January 28, 1986", "January2, 1989"},
            {"Hitler's Olympics", "The SS Olympics", "Kristallnacht Olympics", "The Racist Olympics"},
            {"1992", "1982", "2002", "2012"},
            {"1997", "1987", "2000", "1967"},
            {"Discrimination Law", "Separatism", "Sheltered Society", "Apartheid"},
            {"1995", "1991", "1989", "1993"},
            {"Syria", "Iran", "Iraq", "Kuwait"}
    };

    public static String[] correctAnswersMedium = {
            "Southern Mexico, Guatemala, northern Belize, western Honduras",
            "Genghis Khan",
            "Vermont",
            "January 28, 1986",
            "Hitler's Olympics",
            "2002",
            "1997",
            "Apartheid",
            "1991",
            "Iran"
    };

    public static String[] questionsHard={
            "In which year was Pearl Harbour Attacked?",
            "Charles Lindbergh achieved the first non-stop flight from New York to Paris in which year?",
            "Who were the first people to ever successfully climb Mount Everest on May 29, 1953?",
            "This airship crash is known as the ___________.",
            "The United States used nuclear weapons against which Japanese cities during World War II?",
            "Mao Zedong, or Chairman Mao, ruled which country?",
            "The Moon Landing took place on which date?",
            "The nuclear standoff between the Soviet Union and the United States in 1962 is known as ____________.",
            "The Concorde airplane flew from 1969 until which year?",
            "Richard Nixon resigned from the US Presidency on which date?"
    };

    public static String[][] optionsHard= {
            {"1940", "1943", "1941", "1946"},
            {"1925", "1937", "1927", "1931"},
            {"Edward Norway and Tzing Nuray", "Tenzing Norgay and Edmund Hillary", "Edmun Guster and Goll Zing", "Nico Rusxi and Elliot Fargoe"},
            {"Hindenburg disaster", "Lead Zeppelin crash", "Hanover impact", "Heisenburg accident"},
            {"Kyoto & Osaka", "Hiroshima & Nagasaki", "Tokyo & Nagasaki", "Hiroshima & Sapporo"},
            {"North Korea", "Thailand", "Vietnam", "China"},
            {"August 15, 1969", "June 5, 1968", "July 20, 1969", "July 13, 1971"},
            {"Haiti Missile Panic", "Atlantic Missile Alarm", "The Cuban Missile Crisis", "The Barbados Bomb Scare"},
            {"2003", "1995", "2005", "1999"},
            {"August 9, 1974", "July 28, 1977", "August 4, 1971", "April 17, 1973"}

    };

    public static String[] correctAnswersHard = {
            "1941",
            "1927",
            "Tenzing Norgay and Edmund Hillary",
            "Hindenburg disaster",
            "Hiroshima & Nagasaki",
            "China",
            "July 20, 1969",
            "The Cuban Missile Crisis",
            "2003",
            "August 9, 1974"
    };

}

