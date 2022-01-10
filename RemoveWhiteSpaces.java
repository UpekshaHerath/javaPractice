class RemoveWhiteSpaces{
    public static void main(String[] args){
        String str = " U pek s  ha";
        System.out.println("Before removing the white spaces : " + str);
        str = str.replaceAll("\\s" , ""); //we can use this method to do many things
        System.out.println("After removing the white spaces : " + str);

    }
}