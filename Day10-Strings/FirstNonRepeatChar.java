import java.util.HashMap;
public class FirstNonRepeatChar {
    public static void main(String[]args){
        String str="aabbccde";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean  found=false;
        for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          if(map.get(ch)==1){
            System.out.println("Non Repeating Character: "+ch);
            found=true;
            break;
          }
        }
        if(!found){
            System.out.println("No Non-repeating Elements");
        }
    }    
} 
