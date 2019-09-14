import java.util.*

data class Nums(val nums: Vector<Vector<Int>>, var blockX: Int, var blockY: Int) {

    fun up(isPrint: Boolean = false): Boolean {
        if (blockY - 1 >= 0) {
            nums[blockX][blockY] = nums[blockX][blockY - 1]
            nums[blockX][blockY - 1] = 16

            blockY -= 1

            if (isPrint) {
                println("Move up")
                println(this)
            }
            return true
        }
        if (isPrint) {
            println("Not able to move up")
            println(this)
        }
        return false
    }

    fun down(isPrint: Boolean = false): Boolean {
        if (blockY + 1 <= 3) {
            nums[blockX][blockY] = nums[blockX][blockY + 1]
            nums[blockX][blockY + 1] = 16

            blockY += 1

            if (isPrint) {
                println("Move down")
                println(this)
            }
            return true
        }
        if (isPrint) {
            println("Not able to move down")
            println(this)
        }
        return false
    }

    fun left(isPrint: Boolean = false): Boolean {
        if (blockX - 1 >= 0) {
            nums[blockX][blockY] = nums[blockX - 1][blockY]
            nums[blockX - 1][blockY] = 16

            blockX -= 1

            if (isPrint) {
                println("Move left")
                println(this)
            }
            return true
        }
        if (isPrint) {
            println("Not able to move left")
            println(this)
        }
        return false
    }

    fun right(isPrint: Boolean = false): Boolean {
        if (blockX + 1 <= 3) {
            nums[blockX][blockY] = nums[blockX + 1][blockY]
            nums[blockX + 1][blockY] = 16

            blockX += 1

            if (isPrint) {
                println("Move right")
                println(this)
            }
            return true
        }
        if (isPrint) {
            println("Not able to move right")
            println(this)
        }
        return false
    }

    override fun toString(): String {
        var str = ""
        for (y in 0..3) {
            str += "|"
            for (x in 0..3) {
                if (nums[x][y] < 10) {
                    str += "${nums[x][y]} |"
                } else if (nums[x][y] < 16) {
                    str += "${nums[x][y]}|"
                } else {
                    str += "  |"
                }
            }
            str += "\n"
        }
        return str
    }

    fun copy(): Nums = Nums(copyNums(nums), blockX, blockY)
}

fun blankNums(): Vector<Vector<Int>> {
    val temNums: Vector<Vector<Int>> = Vector()
    for (x in 0..3) {
        val list: Vector<Int> = Vector(0)
        for (y in 0..3) {
            list.addElement(0)
        }
        temNums.addElement(list)
    }
    return temNums
}

fun copyNums(nums: Vector<Vector<Int>>): Vector<Vector<Int>> {
    val copyed = blankNums()
    for (x in 0..3) for (y in 0..3) {
        copyed[x][y] = nums[x][y]
    }
    return copyed
}

fun copyPath(path: Vector<String>): Vector<String> {
    val copyed: Vector<String> = Vector(0)
    for (i in 0..path.size - 1) {
        copyed.addElement(path[i])
    }
    return copyed
}

fun copyState(state: HashMap<Vector<String>, Nums>): HashMap<Vector<String>, Nums> {
    val coped = HashMap<Vector<String>, Nums>()
    state.entries.forEach {
        coped[copyPath(it.key)] = it.value.copy()
    }
    return coped
}