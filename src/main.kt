fun main(args: Array<String>) {
    //var passTime = 0
    //var alltime = 0
    //while (true) {
    val game = BlockNums()
    randomGo(game, arrayOf(
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 16, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 1, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 16, 1, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 0, 0, 0),
            arrayOf(0, 16, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 2, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 0, 0, 0),
            arrayOf(0, 16, 2, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 16, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 4, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 4, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 4, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 16, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 4, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 3, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 4, 0),
            arrayOf(0, 0, 3, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)




    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 16, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 5, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(0, 16, 5, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 0, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 0, 0, 0),
            arrayOf(0, 16, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 0, 0, 0),
            arrayOf(0, 0, 6, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 16, 6, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 0, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 0, 0),
            arrayOf(0, 0, 16, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 0, 0),
            arrayOf(0, 0, 8, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 8, 0),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 8, 0),
            arrayOf(0, 0, 16, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 8, 0),
            arrayOf(0, 7, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 8, 0),
            arrayOf(0, 0, 7, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)



    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(0, 0, 0, 0),
            arrayOf(0, 9, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(9, 0, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(9, 0, 16, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(9, 0, 10, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(9, 10, 0, 0),
            arrayOf(0, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(10, 0, 0, 0),
            arrayOf(9, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(10, 11, 0, 0),
            arrayOf(9, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(10, 11, 12, 0),
            arrayOf(9, 0, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(10, 12, 0, 0),
            arrayOf(9, 11, 0, 0)
    ), 10)
    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(10, 12, 16, 15),
            arrayOf(9, 11, 13, 14)
    ), 10)

    randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(10, 11, 12, 15),
            arrayOf(9, 13, 14, 16)
    ), 10)

    val pass = randomGo(game, arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(9, 10, 11, 12),
            arrayOf(13, 14, 15, 16)
    ), 10)

    //if (pass) passTime++
    //alltime++

    //println("$passTime/$alltime")

    //}


}