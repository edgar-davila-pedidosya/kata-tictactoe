package tictactoe

fun main() {
    val board = Board()
    board.addMove("Player 1", position = Pair(1,1))
    board.addMove("Player 2", position = Pair(1,1))
}