package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        String viewLine = "";
        /* Print the board to the console (see examples) */
        
        System.out.println(" 012/n");
        for(int i=0;i<3;i++){
            viewLine = i + " ";
            for(int j=0;j<3;j++){
                viewLine += model.getMark(i,j);
            }
            System.out.println(viewLine);
        }


    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */
        if (model.isXTurn() == true){
            System.out.println("Player 1 (X) move");
        }
        else{
            System.out.println("Player 2 (O) move");
        }
    }
    public void showInputError() {

        /* Display an error if input is invalid (see examples) */
        //if(isValidSquare(row,col) == false){
            System.out.println("Invalid move, try again!");
        //}

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}