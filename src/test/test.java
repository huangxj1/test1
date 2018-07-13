package test;


// abcdsdeabcdmkj
// 13 0~14-13 1~14-13
// 12 0~14-12 1~14-12

public class test {
    public static void main(String[] args) {
        String str = "abcdsdeabcdmkj";
        boolean flag = false;
        for (int i = str.length()-1; i > 0; i--){
            for (int j = 0; j < str.length()-i; j++){
                String str1 = str.substring(j,j+i);
                System.out.println("111" + str1);

                for (int w = 1; w < str.length()-i; w++ ){
                    String str2 = str.substring(w,w+i);
                    System.out.println("222" + str2);
                    if (str2.contains(str1)){
                        System.out.println("最长的重复字符串为：" + str1);
                        flag = true;
                    }
                }

            }
        }
    }
}
