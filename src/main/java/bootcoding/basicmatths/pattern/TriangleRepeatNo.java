package bootcoding.basicmatths.pattern;

public class TriangleRepeatNo {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1; i<=n;i++){
            for (int j=0; j<i;j++){
                System.out.print(" "+i);
            }
            System.out.println( );
        }
    }
}
