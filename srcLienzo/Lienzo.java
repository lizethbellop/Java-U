public class Lienzo {
    protected int size;
    protected char [][] lienzo;

    public Lienzo(int size){
        this.size = size;
        this.lienzo = new char[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                lienzo[i][j] = ' ';
            }
        }
    }

    public Lienzo(){
        this.size = 10;
        this.lienzo = new char[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                lienzo[i][j] = ' ';
            }
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLienzo(char[][] lienzo) {
        this.lienzo = lienzo;
    }

    public char[][] getLienzo() {
        return lienzo;
    }

    public int getSize() {
        return size;
    }

    public void setPen(int x, int y, char c){
        lienzo[size - 1 - y][x] = c;
    }

    public void dibujar(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j ++){
                System.out.print(lienzo[i][j]);
            }
            System.out.println();
        }
    }
}
