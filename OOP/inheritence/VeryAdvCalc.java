class VeryAdvCalc extends AdvCalc //Multi level inheretence [VeryAdvCalc taking methodes from AdvCalc and AdvCalc taking methodes from Calc]
{
 public double power(int n,int n1)
 {
  return Math.pow(n,n1);
 }
}