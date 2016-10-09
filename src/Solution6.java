import java.util.Scanner;
/*题目描述
•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理
*/
/*public class Solution6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	while(sc.hasNext())
	{
		String str=sc.nextLine();
		//str=str+"00000000";
		if(str.length()%8!=0)
		{
			str=str+"0000000";
		}
			while(str.length()>=8)
			{
			System.out.println(str.substring(0,8));
			str=str.substring(8);
			}
	
	}
}
}*/

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            StringBuffer sb=new StringBuffer(s);
            if(s.length()%8!=0){
                int n=8-s.length()%8;
                for(int i=0;i<n;i++){
                    sb.append("0");
                }
            }
            while(sb.length()>=8){
                System.out.println(sb.substring(0, 8));
                sb=sb.delete(0, 8);
            }
        }
    }
}
