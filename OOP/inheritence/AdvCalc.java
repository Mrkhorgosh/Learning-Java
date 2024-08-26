class AdvCalc extends Calc // single level inheretence [AdvCalc class using methodes from Calc]
{
 public double div(double n,double n1)         // multiple inheretence not possible in java
 {
  return n/n1;
 } 
 public int multi(int n,int n1)
 {
  return n*n1;
 } 
}