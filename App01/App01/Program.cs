namespace App01
{
    internal class Program
    {
        static void Main01(string[] args)
        {
            //Console.WriteLine(normalizeString(" RaJkUMar, , "));
            //Console.WriteLine(isUppercase("RAJKUMAR"));
            Console.WriteLine(IsComplexPassword("Rajkumar@2000"));
        }

        static String normalizeString(String s)
        {
            return s.ToLower().Trim().Replace(",", "");
        }

        static Boolean isUppercase(String s)
        {
            return s.All(char.IsUpper);
        }

        static Boolean IsComplexPassword(String s)
        {
            return s.Any(char.IsUpper) && s.Any(char.IsDigit) && s.Contains('@') && s.Length >= 8 ;
                }
    }

    internal class Program2
    {
        public static void Main(string[] args)
        {
            // String input = "HELLO";
            // Console.WriteLine( input.ToLower().Contains("ll"));
            //parseContents("rajkumar");
           // Console.WriteLine(isAtEvenIndex("", 'a'));

            String text = " hello my name is rajkumar karnakar,i live in pune ";
            String[] words = text.Split(" ");
            Console.WriteLine("from array of words");
            for (int i = 0; i < words.Length; i++)
            {
                Console.WriteLine(words[i]);
                
            }
        }

        static void parseContents(String contents)
        {
            Console.WriteLine("Option 1");
            foreach (char c in contents)
            {
                Console.WriteLine(c);
            }

            Console.WriteLine("Option 2");
            for (int i = 0; i < contents.Length; i++)
            {
                char c = contents[i];
                Console.WriteLine(c);
            }
        }
        static Boolean isAtEvenIndex(String s, char item)
        {
            if (String.IsNullOrEmpty(s))
                return false;
            for (int i = 0; i < s.Length/2+1; i += 2)
            {
                char ch = s[i];
                if (ch == item)
                    return true;
            }
            return false;
        }
      
    }
}
