class Solution {
    public int solution(int n, String control) {
        int resultNum = n;
    
        for (int i=0; i<control.length(); i++) {
            switch(control.charAt(i)) {
                case 'w':    
                    resultNum += 1;    
                    break;
                    
                case 's':    
                    resultNum -= 1;    
                    break;
                    
                case 'd':    
                    resultNum += 10;   
                    break;
                    
                case 'a':    
                    resultNum -= 10;   
                    break;
            }
        }
        return resultNum;
    }
}