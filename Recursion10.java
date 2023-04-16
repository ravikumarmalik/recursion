public class Recursion10 {

    public static void removeDuplicateString(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(index);
        if (map[currChar-'a']==true){
            //duplicate
            removeDuplicateString(str,index+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            removeDuplicateString(str,index+1,newStr.append(currChar),map);

        }

    }
    public static void main(String[] args) {
        String str="apnacollege";
        removeDuplicateString(str,0,new StringBuilder(""),new boolean[26]);//apncoleg

    }
}
