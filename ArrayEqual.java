class ArrayEqual{
    public static void main(String[] args){
        int[] a = {1,2,4,5,6, 40};
        int[] b = {1,2,4,5,6,40};

        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                if(a[i] == b[i]){
                    
                    if(a.length == i+1){
                        System.out.println("These arrays are equal");
                    }
                    continue;
                }
                else{
                    System.out.println("These arrays are different");
                }
            }

        }

        

    }
}