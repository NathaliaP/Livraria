using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            int m1 = t / 30;
            int m2 = t % 30;
            int h = t / 365;
            Console.WriteLine("{0} ano (s)",h);
            Console.WriteLine("{0} mes (s)", m1);
            Console.WriteLine("{0} dia (s)", m2);
        }
    }
}
