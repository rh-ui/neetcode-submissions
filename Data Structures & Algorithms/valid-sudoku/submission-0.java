class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] lignes = new HashSet[9];
        HashSet<Character>[] colonnes = new HashSet[9];
        HashSet<Character>[] subBoxes = new HashSet[9];

        for (int k = 0; k < 9; k++) {
            lignes[k] = new HashSet<>();
            colonnes[k] = new HashSet<>();
            subBoxes[k] = new HashSet<>();
        }

        char c;
        int b;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                c = board[i][j];
                if (c == '.')
                    continue;

                b = (i / 3) * 3 + (j / 3);

                 if (lignes[i].contains(c) || colonnes[j].contains(c) || subBoxes[b].contains(c)) {
                    return false;
                }

                lignes[i].add(c);
                colonnes[j].add(c);
                subBoxes[b].add(c);

                // System.out.println("Ligne " + i + " : " + lignes[i]);
                // System.out.println("colonnes " + j + " : " + colonnes[j]);
                // System.out.println("subBoxes " + b + " : " + lignes[b]);
            }

            
        }

        return true;
    }
}
