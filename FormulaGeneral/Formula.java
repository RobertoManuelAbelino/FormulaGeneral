import javax.swing.*;
/**Declaracion de la clase Formula
 * @author Roberto Manuel Abelino : numControl 18161174
 * @version 1.0 final
 */
public class Formula
{
    private static double a,b,c,raiz,x1,x2;
    /** Metodo main
     * Metodo que se usa para poder hallar los valores de x1 y x2 usando la formula general
     * Si algunas variables como raiz o a son negativo y 0 repsectivamente, el codigo termina mostrando un mensaje que nos dice que los valores no se pueden hallar
     */
    public static void main(String args[]){
      while(true)
       try{
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de a"));
        break;
       }catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Por favor ingresa un numero");
        }  
      while(true)
       try{
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de b"));
        break;
       }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Por favor ingresa un numero");
       }
      while(true) 
       try{
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de c"));
        break;
       }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Por favor ingresa un numero");
       }
      raiz = b-(4*a*c);
      if(a==0){
       JOptionPane.showMessageDialog(null,"el dividendo es 0 por lo tanto no se puede dividir");
       return;}
      if(raiz<0)   
       JOptionPane.showMessageDialog(null,"El resultado dentro de la raiz es negativa: "+raiz);
       else{
            x1=(-b+Math.pow(raiz, 0.5))/(2*a);
            x2=(-b-Math.pow(raiz, 0.5))/(2*a);
            String s = String.format("Los valores de x son:\nx1= %3.2f \nx2= %3.2f",x1,x2);
            JOptionPane.showMessageDialog(null, s);
        }
    }
}