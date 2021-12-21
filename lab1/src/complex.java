import static java.lang.Math.atan;
import static java.lang.Math.sqrt;

public class complex {
    public double Re, Im;

    complex(){}
    complex (double Re, double Im){
        this.Re=Re;
        this.Im=Im;
    }
    static complex sum (complex a, complex b){
        double newRe=a.Re+b.Re;
        double newIm=a.Im+b.Im;
        complex result=new complex(newRe, newIm);
        return result;
    }
    static complex sub (complex a, complex b){
        double newRe=a.Re-b.Re;
        double newIm=a.Im-b.Im;
        complex result=new complex(newRe, newIm);
        return result;
    }
    public double abs(){
        double absValue=sqrt(Re*Re+Im*Im);
        return absValue;
    }
    public double arg(){
        double argValue=0;
            if(Re>0){
                argValue=atan(Im/Re);
            }
            if(Re<0 && Im>=0) {
                argValue=3.14+atan(Im/Re);
            }
            if(Re<0 && Im<0){
                argValue=-3.14+atan(Im/Re);
            }
            if(Re==0 && Im>0){
                argValue=3.14/2;
            }
            if(Re==0 && Im<0){
                argValue=-3.14/2;
            }
         return argValue;

    }
}