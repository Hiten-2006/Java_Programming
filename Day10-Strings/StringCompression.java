public class StringCompression {
    public static void main(String[]args){
        String str="aabbbcccddd";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();){
            char currentChar=str.charAt(i);
            int count=1;
            while(i+1<str.length()&&str.charAt(i)==currentChar){
                count++;
                i++;
            }
            sb.append(currentChar);
            sb.append(count);
            i++;
        }   
        System.out.println("Compressed: "+sb.toString());
    }
}
