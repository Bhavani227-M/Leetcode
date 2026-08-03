lass Solution {
    public int thirdMax(int[] a) {
        Arrays.sort(a);
        int count =1;
        int third = a[a.length-1];
        for(int i = a.length -2;i>=0;i--){
            if(a[i]!=a[i+1]){
                count++;
                third=a[i];
                if(count == 3){
                    return third;
                }
                
            }
            
        }
        return a[a.length-1];
        
}
}
