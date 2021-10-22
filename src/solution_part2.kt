// Write a kotlin program that has two `players` with there `healthPoints` and let the program
// check if the healthPoint is less than 90 out 100 print `the player's health is fine` and if
// the healthPoint is less than 50 print `the player's health is awful

//part2
fun main() {
 val player1 = "player1"
 val lifePontPlayer1 = 100
 val player2 = "player2"
 val lifePointPlyer2 = 45

 if (lifePontPlayer1>90) {
  println("player $player1 your health is fine")
 } else {
  println("player $player1  your healthing ")
 }

 if (lifePointPlyer2>= 50) {
  println("player $player2 your need healthing ")
 }else {
  println("player $player2 your health is awful")
 }




}
