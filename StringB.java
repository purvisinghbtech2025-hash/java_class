public class StringB {
    public static void main(String[] args){
    String str="hello";
    for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        System.out.print(ch);
    }
    System.out.println();
    StringBuffer st=new StringBuffer( "Purvi");
    st.reverse();
    st.append("Hello");
    System.out.println(st);
    
}
}
