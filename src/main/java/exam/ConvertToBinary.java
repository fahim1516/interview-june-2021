package exam;

public class ConvertToBinary {
  
  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    if (n < 0)
      return "Invalid number. Please input positive number.";
    if(n==0)
        return "0";

    int[] binaryNum = new int[1000];
    int i = 0;
    int temp = n;
    while (temp > 0)
      {
	binaryNum[i] = temp % 2;
	temp = temp / 2;
	i++;
      }
    StringBuilder sb = new StringBuilder ();
    for (int j = i - 1; j >= 0; j--)
      sb.append (binaryNum[j]);
    return sb.toString ();
  }
}
