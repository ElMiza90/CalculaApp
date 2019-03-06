package com.example.calcularapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
int a,b,sumar,restar,multiplicar,dividir;
TextView Tsuma,Tresta,Tmultipliacion,Tdivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=8;
        b=2;
        Log.d("NOTAS DEL DESAROLLADOR","Si Funcionan las notas");
        suma(a,b);
        resta(a,b);
        multipliacion(a,b);
        division(a,b);
        Log.d("NOTAS DEL DESAROLLADOR","Operaciones exitosas");
    }
    private void suma(int a,int b){
        String sumaString;
        sumar=a+b;
        sumaString=Integer.toString(sumar);
        Log.d("NOTAS DEL DESAROLLADOR","El resultado de la suma es "+sumaString );
        Tsuma=findViewById(R.id.suma);
        Tsuma.setText(sumaString);
    }
    private void resta(int a,int b) {
        String restaString;
        restar = a - b;
        restaString=Integer.toString(restar);
        Log.d("NOTAS DEL DESAROLLADOR", "El resultado de la resta es "+restaString);
        Tresta=findViewById(R.id.resta);
        Tresta.setText(restaString);
    }
    private void multipliacion(int a, int b){
        String multiplicacionString;
        multiplicar=a*b;
        multiplicacionString=Integer.toString(multiplicar);
        Log.d("NOTAS DEL DESAROLLADOR","El resultado de la multiplacion es "+multiplicacionString);
        Tmultipliacion=findViewById(R.id.multiplicacion);
        Tmultipliacion.setText(multiplicacionString);
    }
    private void division(int a,int b){
        String divisionString;
        dividir=a/b;
        divisionString=Integer.toString(dividir);
        Log.d("NOTAS DEL DESAROLLADOR","El resultado de la division es "+divisionString);
        Tdivision=findViewById(R.id.division);
        Tdivision.setText(divisionString);
    }
}