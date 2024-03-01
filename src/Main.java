import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString.(Region.values()));
//   Region[] regions = Region.values();
   for(Region region : Region.values()){
       System.out.println(region.getEsspecily());
   }
    }
}