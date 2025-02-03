import java.util.List;
import java.util.ArrayList;

public class pascalstriangle {

    public List<List<Integer>> gen(int numRows) {

        List<List<Integer>> triangle= new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for(int j=0; j<numRows; j++) {
                if(j==0||j==i) {
                    row.add(1);
                }
                else {
                    row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                }

                triangle.add(row);
            }
        }

        return triangle;
    }
} 