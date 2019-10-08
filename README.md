# Card Game
The game supports below functionalities
1. MultiPlayer support
2. Shuffling of cards
3. Dealing a card

## How is Winner Decided?
1. The player with High card in each round wins that round
2. The player winning maximum number of rounds wins the game
3. There can be more than 1 player winning the game  
  => This is because, 2 or more players can win same number of times overall  
    for eg:  
          Round 1 => Player 1 wins  
          Round 2 => Player 2 wins  
          Round 3 => Player 1 wins  
          Round 4 => Player 3 wins  
          Round 5 => Player 2 wins  
Here both Player 1 and 2 wins same number of times, hence both players are declared winner
