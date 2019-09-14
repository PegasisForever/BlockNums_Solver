import java.util.*

class BlockNums() {
    val temNums: Vector<Vector<Int>> = Vector()
    var blockX = 0
    var blockY = 0

    init {
        val randomNums: Vector<Int> = Vector(0)
        for (i in 1..16) {
            randomNums.addElement(i)
        }

        for (x in 0..3) {
            val list: Vector<Int> = Vector(0)
            for (y in 0..3) {
                val num = randomNums[Random().nextInt((randomNums.size - 1) + 1)]
                list.addElement(num)
                randomNums.removeElement(num)
                if (num == 16) {
                    blockX = x
                    blockY = y
                }
            }
            temNums.addElement(list)
        }
    }

    val nums = Nums(temNums, blockX, blockY)


    fun up(isPrint: Boolean = false): Boolean {
        return nums.up(isPrint)
    }

    fun down(isPrint: Boolean = false): Boolean {
        return nums.down(isPrint)
    }

    fun left(isPrint: Boolean = false): Boolean {
        return nums.left(isPrint)
    }

    fun right(isPrint: Boolean = false): Boolean {
        return nums.right(isPrint)
    }


    override fun toString(): String {
        return nums.toString()
    }
}