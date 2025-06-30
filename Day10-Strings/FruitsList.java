public class FruitsList {
    public static void main(String[] args) {
        String str="apple,banana,grapes";
        String[]fruits=str.split(",");
        
        for(String fruit:fruits){
            System.out.println("Fruits: "+fruit);
        }
    }
}
