class RemoveSpecialCharsInString{
    public static void main(String[] args){
        String s = "latin String #%%^$#%^^&^%&$# 24354521086";
        //Other than these charactors if these is any charactor replace them with empty charactors
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        //output : latinString24354521086
        //If we need to remove the numbers
        String a1 = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(a1);
    }
}