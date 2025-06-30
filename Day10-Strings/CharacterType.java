public class CharacterType {
    public static void main(String[]args){
        String str="Hi I Am Hiten 123!";
        int vowels=0;
        int consonents=0,digits=0,spaces=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                if("aeiou".indexOf(ch)!=-1)
                vowels++;
                else
                consonents++;
            }else if(ch>='0'&&ch<='9'){
                digits++;
            }else if(ch==' '){
                spaces++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonents: "+consonents);
        System.out.println("Digits: "+digits);
        System.out.println("Spaces: "+spaces);
    }
}
