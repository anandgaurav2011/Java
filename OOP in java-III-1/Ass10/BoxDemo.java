public class BoxDemo
{
  public static void main(String [] args)
  {
    int i;
    Box [] arr={new Box(1,2,3),new Box(3,4,5),new Box(2,2,2)};
    for(i=0;i<arr.length;i++)
    {
      arr[i].volume();
    }
  }
}