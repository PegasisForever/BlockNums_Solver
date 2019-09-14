import java.util.*


fun randomGo(game: BlockNums, result: Array<Array<Int>>, depth: Int = 10):Boolean {
    var isEnd = false
    var percurrentState = HashMap<Vector<String>, Nums>()
    percurrentState[Vector(0)] = game.nums.copy()

    var currentState = HashMap<Vector<String>, Nums>()


    val doneState: Vector<Nums> = Vector()
    doneState.addElement(game.nums.copy())
    fun isExist(v: Nums): Boolean {
        for (state in doneState) {
            if (v == state) return true
        }
        return false
    }

    var isEqual = true
    for (x in 0..3) for (y in 0..3) {
        if ((result[y][x] == 0) or (result[y][x] == game.nums.nums[x][y])) else isEqual = false
    }

    if (isEqual) {
        return true
    }

    var answer: Vector<String> = Vector(0)
    for (step in 1..depth) {
        println("depth:$step  percurrentState:${percurrentState.size}  doneState=${doneState.size}")

        percurrentState.entries.forEach {

            var tem = it.value.copy()
            if (tem.up()) {
                if (!isExist(tem)) {
                    val path: Vector<String> = copyPath(it.key)
                    path.addElement("up")

                    currentState[path] = tem
                    doneState.addElement(tem)
                }
            }

            tem = it.value.copy()
            if (tem.down()) {
                if (!isExist(tem)) {
                    val path: Vector<String> = copyPath(it.key)
                    path.addElement("down")

                    currentState[path] = tem
                    doneState.addElement(tem)
                }
            }

            tem = it.value.copy()
            if (tem.left()) {
                if (!isExist(tem)) {
                    val path: Vector<String> = copyPath(it.key)
                    path.addElement("left")

                    currentState[path] = tem
                    doneState.addElement(tem)
                }
            }

            tem = it.value.copy()
            if (tem.right()) {
                if (!isExist(tem)) {
                    val path: Vector<String> = copyPath(it.key)
                    path.addElement("right")

                    currentState[path] = tem
                    doneState.addElement(tem)
                }
            }

        }

        currentState.entries.forEach {

            var isEqual = true
            for (x in 0..3) for (y in 0..3) {
                if ((result[y][x] == 0) or (result[y][x] == it.value.nums[x][y])) else isEqual = false
            }

            if (isEqual) {
                isEnd = true
                answer = it.key
            }

        }
        if (isEnd) break

        percurrentState = copyState(currentState)
        currentState = HashMap<Vector<String>, Nums>()
    }


    println("------------------------------")
    if (isEnd) {
        for (step in answer) {
            when (step) {
                "up" -> game.up(true)
                "down" -> game.down(true)
                "left" -> game.left(true)
                "right" -> game.right(true)
            }
        }
    } else {
        println("Can't solve")
        return false
    }

    return true
}