using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            
            //Exercicio5
            int A, B, C, delta;
            double rDelta, r1, r2;
            Console.WriteLine("Informe A");
            A = int.Parse(Console.ReadLine());

            Console.WriteLine("Informe B");
            B = int.Parse(Console.ReadLine());

            Console.WriteLine("Iforme C");
            C = int.Parse(Console.ReadLine());

            delta = B * B - 4 * A * C;
            rDelta = Math.Sqrt(delta);
            r1 = (-B + rDelta) / 2 * A;
            r2 = (-B - rDelta) / 2 * A;

            Console.WriteLine("X1 = {0}", r1);
            Console.WriteLine("X2 = {0}", r2);
            




            

     
        }
    }
}
