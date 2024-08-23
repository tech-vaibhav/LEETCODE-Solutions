import java.util.Arrays;

public class DuplicateInString {
    public static void main(String[] args) {
        String str="abaabc";
        printDuplicates(str);
    }
    public static void printDuplicates(String str){
        int len=str.length();

        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        String sortedstr= new String(chars);


        for(int i=0;i<len;i++){
            int count=1; //for duplicate element we have to make count=1
            while(i<len-1 && sortedstr.charAt(i)== sortedstr.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                System.out.println(sortedstr.charAt(i)+" is duplicate"+" count="+count);

            }
        }
    }
}
