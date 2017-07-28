import java.util.ArrayList;

public class Prime {
    public String getSequence(int i){
        double primeNum;
        double counter =0;
        ArrayList<Double> primeList = new ArrayList<Double>();
        for (int j = 0; j <= i; j++) {
            primeList.add((double) j);
        }
        primeNum = primeList.get(primeList.size()-1);
        return String.valueOf( (int) primeNum);
    }
}
