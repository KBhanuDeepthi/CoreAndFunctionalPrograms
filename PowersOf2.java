
class PowersOf2{
public static void main(String[] args){

  int num=2;
  int power=1;
  int count=0;
  while(power!=1024){

    power=(power*num);
    count++;
    System.out.println(+num+ "^" +count+ "=" +power);
  }
}
}
