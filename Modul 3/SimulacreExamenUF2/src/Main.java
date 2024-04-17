//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public void init(){
            int[] vector;
            int a = 5;
            float b = 30.0f;
            vector = initVector(a, b);
        }

        public static int[] initVector(int x, float y){
            int[] vector = new int[a];
            for(int i = 0; i vector.length - 2; i++){
                vector[i] = (int) y;
                y -= x ;
            }
            return vector;
        }
    }
}