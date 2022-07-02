# Snakes-and-Ladders
A redesign of the popular Player vs Player Board Game 
## Game Interface:
#### Screenshots:
<a href="https://user-images.githubusercontent.com/88545875/176979100-3080c7c5-2ea1-4f40-92c2-c7b0a37ea5cb.png"><img src="https://user-images.githubusercontent.com/88545875/176979100-3080c7c5-2ea1-4f40-92c2-c7b0a37ea5cb.png" align="left" height="160" width="90" ></a>

<a href="https://user-images.githubusercontent.com/88545875/176978862-b1b3a210-6fbd-4c80-9515-1f283f0c7464.png"><img src="https://user-images.githubusercontent.com/88545875/176978862-b1b3a210-6fbd-4c80-9515-1f283f0c7464.png" align="left" height="160" width="90" ></a>

<a href="https://user-images.githubusercontent.com/88545875/176978930-841e6c1f-4aad-44eb-85db-481a35db8a72.png"><img src="https://user-images.githubusercontent.com/88545875/176978930-841e6c1f-4aad-44eb-85db-481a35db8a72.png" align="left" height="160" width="90" ></a>

<a href="https://user-images.githubusercontent.com/88545875/176979027-154a0ea5-28a5-447f-8646-dd811c4ea33d.png"><img src="https://user-images.githubusercontent.com/88545875/176979027-154a0ea5-28a5-447f-8646-dd811c4ea33d.png" align="left" height="160" width="90" ></a>

<a href="https://user-images.githubusercontent.com/88545875/176979067-5b3919ab-ff3e-405c-a2bd-a36094bdf9fa.png"><img src="https://user-images.githubusercontent.com/88545875/176979067-5b3919ab-ff3e-405c-a2bd-a36094bdf9fa.png" align="left" height="160" width="90" ></a>

#### Gameplay Clip: 
https://user-images.githubusercontent.com/88545875/176979580-1925bdad-257c-4f3c-865c-c0a95088f896.mp4

## Rules of the Game:

#### Unlocking:
The players unlock their tokens by receiving 1 on a die roll. The player cannot move till their token has been unlocked. Once unlocked, the token may move.

#### Movement Rules:
After unlocking, the players will move their pieces from left to right, starting at 1, following the numbers on the board, then the next row from right to left and repeat. If a player rolls a 4, then the player would move their piece four places.

#### Snakes
When a player lands on a top of a snake, their playing piece will slide down to the bottom of the snake.
Whereas landing on the bottom of a snake the player will remain in the same spot until their next turn.

#### Ladders
When a player lands at the base of a ladder, it immediately climbs to the top of the ladder.
Whereas landing at the top of a ladder the player will stay there until the next turn. The player does not move to the bottom of the ladder.

#### Winning the Game
The first player that reaches the highest space on the board, 100, wins the game. To win the player will need to roll the exact number to get you to the last space. If the player rolls a higher number than needed to land exactly on 100, their piece does not move and remains there until their next turn, when they can roll again.

(source: https://www.ymimports.com/pages/how-to-play-snakes-and-ladders)
## About the code
### UML Diagram:
![img17](https://user-images.githubusercontent.com/88545875/176978591-829545b1-352b-4fde-aca7-cefbeac54b36.jpg)
### Concepts used:
    -JavaFx 
    -Multithreading 
    -Encapsulation, Polymorphism and Extraction 
    -Error handling 


### Basic Features:
    -Movement animations 
    -Fluid Die roll animation
    -Ladder climbing


### Extra Features:
Alongside the standard gameplay features, the following features have been implemented

    -Ripple effect on tap
    -Player Menus(Pause menu, winscreen etc.)
    -Multipoint fluid snake tracing animation(implemented using path transitions on polylines)
    -Ingame player display bar switches between players turns
    -Cleaner window UI of the JavaFx window
