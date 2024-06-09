using System.Net.NetworkInformation;

namespace Arrays
{
    internal class Program
    {
        static void Main01(string[] args)
        {
            int[] nums; //declare
            double[] doubleNumbers = new double[5]; //declare and allocate
            string[] availablePets = { "cat", "dog", "fish" };
            string[] unavailablePets = { "parrot", "snake", "crocodile" };

            Array.ForEach( availablePets, Console.WriteLine );
            Console.WriteLine();
            Array.ForEach(unavailablePets, Console.WriteLine );

            int indexOfAvailavlePet = 2;
            int indexOfUnavailablePet = 0;
            string availablePet = availablePets[indexOfAvailavlePet];
            string unavailablePet = unavailablePets[indexOfUnavailablePet];

            availablePets[indexOfAvailavlePet] = unavailablePet;
            unavailablePets[indexOfUnavailablePet] = availablePet;

            Console.WriteLine("after replacing");
            Array.ForEach(availablePets, Console.WriteLine);
            Console.WriteLine();
            Array.ForEach(unavailablePets, Console.WriteLine);
        }
        public static void Main(String[] args)
        {
            int[] nums = { 10, 15, -5, 45, 81, -45 };
            int max = int.MaxValue;
            int length = nums.Length;
            Console.WriteLine("Max Product from this array is: ");
            if (nums.Length < 2)
            {
                Console.WriteLine(max);
                return;
            }

            Array.Sort(nums);
            max = Math.Max(nums[0] * nums[1], nums[length - 1] * nums[length-2]);
            Console.WriteLine(max);
            return;
        }
    }
}
