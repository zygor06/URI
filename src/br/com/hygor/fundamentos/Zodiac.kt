package br.com.hygor.fundamentos

fun printMessage(x: Int){
    when(x){
        0  -> printm("hou(monkey)", "witty,intelligent,ambitious and adventurous")
        1  -> printm("ji(rooster)", "observant,hardworking,resourceful,courageous and talented")
        2  -> printm("gou(dog)", "loyal,honest,amiable,kind,cautious and prudent")
        3  -> printm("zhu(pig)", "diligen,compassionate,generous,easy-going and gentle")
        4  -> printm("shu(rat)", "quick-witted,resourceful and versatile")
        5  -> printm("niu(ox)", "decisive,honest,dependable and hardworking")
        6  -> printm("hu(tiger)", "brave,competitive,unpredictable and self-confident")
        7  -> printm("tu(rabbit)", "gentle,quiet,elegant,alert,quick,skillful,kind and patient")
        8  -> printm("long(dragon)", "confident,intelligent,ambitious,presevering and hardworking")
        9  -> printm("she(snake)", "intelligent,courageous,confident,insightful and communicative")
        10 -> printm("ma(horse)", "animated,kind,straightforward,active and energetic")
        11 -> printm("yang(goat)", "gentle,shy,stable,sympathetic and adventurous")
    }
}

fun printm(s1:String, s2:String){
    System.out.printf("You are born in the year of %s in Chinese year and you are %s\n", s1, s2)
}

fun main(args: Array<String>) {
    var birth_date:Int = readLine()!!.toInt()
    printMessage(birth_date % 12)
}