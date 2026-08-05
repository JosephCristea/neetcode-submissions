class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> box1 = new HashSet<>();
        HashSet<Character> box2 = new HashSet<>();
        HashSet<Character> box3 = new HashSet<>();
        HashSet<Character> row = new HashSet<>();


        for(int i = 0; i < board.length; i++) {

            for(int j = 0; j < board[i].length; j++) {
                
                if(j < 3) {
                    if(board[i][j] != ('.') && box1.contains(board[i][j])) {
                        //System.out.println("Box 1: " + i);
                        return false;
                    } else {
                        box1.add(board[i][j]);
                    }             
                } else if (j < 6) {
                    if(board[i][j] != ('.') && box2.contains(board[i][j])) {
                        //System.out.println("Box 2: " + i);
                        return false;
                    } else {
                        box2.add(board[i][j]);
                    }       
                } else {
                    if(board[i][j] != ('.') && box3.contains(board[i][j])) {
                        //System.out.println("Box 3: " + i);
                        return false;
                    } else {
                        box3.add(board[i][j]);
                    }       
                }

                if(board[i][j] != ('.') && row.contains(board[i][j])) {
                    //System.out.println("Row: " + i);
                    return false;
                } else {
                    row.add(board[i][j]);
                }
            }

                if((i + 1) % 3 == 0) {
                    box1.clear();
                    box2.clear();
                    box3.clear();
                }
                row.clear();
        }


        HashSet<Character> col = new HashSet<>();

        for(int i = 0; i < board.length; i++) {

            for(int j = 0; j < board[i].length; j++) {

                if(board[j][i] != ('.') && col.contains(board[j][i])) {
                    return false; 
                } else {
                    col.add(board[j][i]);
                }

            }

            col.clear();
        }

      return true;

        
    }
}
