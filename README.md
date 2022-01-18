# Snakes-and-Ladders
The complete code(Along with all the assets) of the Snakes and Ladders game developed using JavaFx

########################## ABOUT THE CODE ########################## 

Concepts used:
-JavaFx 
-Multithreading 
-Encapsulation, Polymorphism and Extraction 
-Error handling 

Basic Features:
-Movement animations 
-Fluid Die roll animation
-Ladder climbing

Extra Features:
 Alongside the standard gameplay features, the following features have been implemented
-Ripple effect on tap
-Player Menus(Pause menu, winscreen etc.)
-Multipoint fluid snake tracing animation(implemented using path transitions on polylines)
-Ingame player display bar switches between players turns
-Cleaner window UI of the JavaFx window

########################## ABOUT THE GAME ########################## 

source:https://www.ymimports.com/pages/how-to-play-snakes-and-ladders

Unlocking:
The players unlock their tokens by receiving 1 on a die roll. The player cannot move till their token has been unlocked. Once unlocked, the token may move.

Rules:
After unlocking, the players will move their pieces from left to right, starting at 1, following the numbers on the board, then the next row from right to left and repeat. If a player rolls a 4, then the player would move their piece four places.

Snakes
When a player lands on a top of a snake, their playing piece will slide down to the bottom of the snake.
Whereas landing on the bottom of a snake the player will remain in the same spot until their next turn.

Ladders
When a player lands at the base of a ladder, it immediately climbs to the top of the ladder.
Whereas landing at the top of a ladder the player will stay there until the next turn. The player does not move to the bottom of the ladder.

Winning the Game
The first player that reaches the highest space on the board, 100, wins the game. To win the player will need to roll the exact number to get you to the last space. If the player rolls a higher number than needed to land exactly on 100, their piece does not move and remains there until their next turn, when they can roll again.
 
