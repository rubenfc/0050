
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    public int multiplicacionEntera(int a, int b)
    {
        int incremento = a;
        int tablaDeA = a;
        int index = 0; 
        while(index < (b-1))
        {
            index++;
            tablaDeA = tablaDeA + incremento;    
        }

        return tablaDeA;
    }

    public int divisionEntera(int dividendo, int divisor)
    {

        int cociente = 0;
        while(dividendo >= divisor )
        {
            dividendo = dividendo - divisor;
            cociente++;
        }

        return cociente;
    }

    public int modulo(int dividendo, int divisor)
    {

        while(dividendo >= divisor)
        {
            dividendo = dividendo - divisor;

        }

        return dividendo;
    }

    public int potencia (int base, int esponente)
    {

        int index = 0;
        int resultado = base;
        int resultadoTotal = resultado;
        int contador = 1;
        if(esponente == 0)
        {
            resultadoTotal = 1;
        }
        else if (esponente == 1)
        {
            resultadoTotal = base;
        }

        else 
        {   
            while(index <= base)
            {
                resultado += base;
                index ++;
            }

            while(contador < esponente)
            {
                resultadoTotal += resultadoTotal;
                contador ++;
            }    
        }
        return resultadoTotal;
    }

    public int raiz(int numero)
    {
        int solucion = 2;
        int contador = solucion;
        int index = 0;
        boolean resultado = false;
        while(resultado == false && solucion <= 32)
        {
            contador += solucion;
            index ++;
            if(numero - contador == 0)
            {
                resultado = true;
            }

            else if(index > solucion)
            {
                index = 0;
                solucion ++;
                contador = solucion;
            }
        }

        if(solucion == 32)
        {
            solucion = -1;
            System.out.println("error");
        }

        return solucion;
    }
}
