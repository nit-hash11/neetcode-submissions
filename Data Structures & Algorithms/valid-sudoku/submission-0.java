class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<String, Set<Character>> sqMap = new HashMap<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='.') continue;
                String sqKey = (i/3) + "," + (j/3);
                if(rowMap.computeIfAbsent(i, k->new HashSet<>()).contains(board[i][j])
                || colMap.computeIfAbsent(j, k->new HashSet<>()).contains(board[i][j])
                || sqMap.computeIfAbsent(sqKey, k->new HashSet<>()).contains(board[i][j]))
                    return false;
                rowMap.get(i).add(board[i][j]);
                colMap.get(j).add(board[i][j]);
                sqMap.get(sqKey).add(board[i][j]);
            }
        }
        return true;
    }
}
