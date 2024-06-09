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
        public static void Main02(String[] args)
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



internal class Answer
    {

        // Change these Boolean values to control whether you see 
        // the expected result and/or hints.
        public static void Main(String[] args)
        {
            string text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the " +
                "industry's standard dummy text ever since the 1500s, when an unknown printer" +
                " took a galley of type and scrambled it to make a type specimen book. It has survived not only" +
                " five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum" +
                " passages, and more recently with desktop publishing software like" +
                " Aldus PageMaker including versions of Lorem Ipsum.";
            string learnerResult = Answer.FindMostRepeatedWord(text);
            Console.WriteLine("Most repeated word is: " + learnerResult);
        }

        static List<String> Normalize(String text)
        {
            string lowerCased = text.Trim().ToLower();
            String[] words = lowerCased.Split('[', '\n', '\t', '\r', '.', ',', ':', ';'
            , '?', '!', '(', ')', '{', '}', ']', ' ');
            List<String> commonWords = new List<string>(){
            "the","a","or","an","it","and", "but","is","are","of","on","to","was","were","in","i","that","your","his","their","her","you","me","they","at","be"
        };

            return words
                    .Where(word => !commonWords.Contains(word) && word.Length != 0)
                    .ToList();
        }

        public static string FindMostRepeatedWord(string text)
        {
            // Your code goes here.
            List<String> uncommonWords = Normalize(text);
            if (uncommonWords.Count == 0)
                return "";

            Dictionary<string, int> wordCountDict = new Dictionary<string, int>();

            foreach (string word in uncommonWords)
            {
                wordCountDict.TryGetValue(word, out int freq);

                wordCountDict[word] = freq + 1;
            }

            int max = 0;
            string mostRepeatedWoerd = "";
            foreach (var entry in wordCountDict)
            {
                if (entry.Value > max)
                {
                    mostRepeatedWoerd = entry.Key;
                    max = entry.Value;
                }
            }




            return mostRepeatedWoerd;
        }

    }

}
