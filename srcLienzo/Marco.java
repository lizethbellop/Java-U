public class Marco extends Lienzo {


    public Marco(int size){
        this.size = size + 2;
        this.lienzo = new char [this.size][this.size];

        for(int i = 0; i < this.size; i++){
            if(i == 0 || i== this.size - 1){
                for(int j = 0; j < this.size; j++)
                    lienzo[i][j] = '-';
            }
            else{
                lienzo[i][0] = '|';
                lienzo[i][this.size - 1] = '|';
            }
        }

        for(int i = 1; i < this.size - 1; i++){
            for(int j = 1; j < this.size -1; j++)
                lienzo[i][j] = ' ';
        }
    }

    @Override
    public void setPen(int x, int y, char c) {
        super.setPen(x+1, y+1, c);
    }
}
