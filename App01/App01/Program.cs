using System.Text;

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

            String text = "MADAM";
            // Console.WriteLine(Reverse2(text.ToUpper()));
            Console.WriteLine(isPalindrome2(text));
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
        static String Reverse(String s)
        {
            if (!String.IsNullOrEmpty(s))
            {
                int length = s.Length;
                StringBuilder reversed = new StringBuilder(length);
                for (int i = 1;i < length; i++)
                {
                    reversed.Append(s[length-i]);
                }
                return reversed.ToString();
            }
            else { return s; }
        }
        static String Reverse2(String s)
        {
            if (!String.IsNullOrEmpty(s))
            {
                char[] chars = s.ToCharArray();
                Array.Reverse(chars);
                return new String(chars);
            }
            else { return s; }
        }

        static Boolean isPalindrome(String s)
        {
            String normalized = s.ToLower();
            StringBuilder reversed = new StringBuilder(normalized.Length);
            for (int i = normalized.Length - 1; i >= 0; i--)
            {
                reversed.Append(normalized[i]);
            }
            //Console.WriteLine(reversed.ToString());
            if (normalized.Equals(reversed.ToString()))
            {
                return true;
            }
            return false;
        }
        static Boolean isPalindrome2(String s)
        {
            String normalized = s.ToLower();
            int lentgth = normalized.Length;
            for (int i = 0; i < lentgth /2; i++)
            {
                if (normalized[i] != normalized[lentgth - i -1])
                {
                    return false;
                }
            }
            return true;

        }
      
    }
}
