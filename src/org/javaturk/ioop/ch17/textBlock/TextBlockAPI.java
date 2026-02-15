package org.javaturk.ioop.ch17.textBlock;

public class TextBlockAPI {

    public static void main(String[] args) {
        useString();
        equality();
//        formatted();
//        strip();
//        stripIndent();
//        translateEscapes();
    }


    public static void useString(){
        String s = """
                
                I
                love
                Java!
                """;
        String reversed = reverse(s);
        System.out.println(s);
        System.out.println(reversed);

        System.out.println();

        reversed = reverse("""
                
                I
                love
                Java!
                """);

        System.out.println(
                reversed = reverse("""
                
                I
                love
                Java!
                """.toUpperCase()));
    }

    public static String reverse(String s){
        System.out.println("Length: " + s.length());
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void equality(){
        String poem1 = "         Leylim Ley\n" +
                "Döndüm daldan düşen kuru yaprağa\n" +
                "Seher yeli dağıt beni kır beni\n" +
                "Götür tozlarımı burdan uzağa\n" +
                "Yarin çıplak ayağına sür beni\n" +
                "...\n" +
                "Sabahattin Ali";

        String poem2 = """     
                         Leylim Ley         
                Döndüm daldan düşen kuru yaprağa
                Seher yeli dağıt beni kır beni
                Götür tozlarımı burdan uzağa
                Yarin çıplak ayağına sür beni
                ...
                Sabahattin Ali""";

        System.out.println(poem1);
        System.out.println(poem2);
        System.out.println("\npoem1 == poem2 : " + (poem1 == poem2));
        System.out.println("poem1.equals(poem2) : " + poem1.equals(poem2));
    }

    public static void formatted(){
        String output = """
         Name: %s
         Phone: %s
         Address: %s
         Salary: $%.2f
         """.formatted("Akin", "123 456 7890", "Abc Street No 28 Bigcity 10000", 5_000.00);
        System.out.println(output);
    }

    public static void strip(){
        String s = "   I love Javaaaa        ";
        System.out.printf("%-20s >%20s<\n", "s:", s);
        System.out.printf("%-20s >%20s<\n", "stripLeading():", s.stripLeading());
        System.out.printf("%-20s >%20s<\n", "stripTrailing():", s.stripTrailing());
        System.out.printf("%-20s >%14s<\n", "strip():", s.strip());
    }

    /**
     * https://bugs.openjdk.org/browse/JDK-8223776?focusedCommentId=14268527&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#comment-14268527
     */
    public static void stripIndent(){
        String poem = """
                      
                            Leylim Ley
                               Döndüm daldan düşen kuru yaprağa     
                                    Seher yeli dağıt beni kır beni     
                                    Götür tozlarımı burdan uzağa    
                            Yarin çıplak ayağına sür beni    
                                
                               Sabahattin Ali
                      """;
        System.out.println("Poem: " + poem);
        String poemIndent = poem.stripIndent();
        System.out.println("stripIndent(): " + poemIndent);

        System.out.println("******************************************");

        poem = """
                          
     Leylim Ley
     Döndüm daldan düşen kuru yaprağa
     Seher yeli dağıt beni kır beni
     Götür tozlarımı burdan uzağa
     Yarin çıplak ayağına sür beni
                                
                        Sabahattin Ali
  """;
        System.out.println("Poem: " + poem);
        poemIndent = poem.stripIndent();
        System.out.println("stripIndent(): " + poemIndent);
    }

    public static void translateEscapes(){
        String string1 = """
         What I love is "Java". It is 'fun'!
         """;

        String string2 = """
         What I love is \"Java\".  It is \'fun\'!
         """;

        String string3 = string2.translateEscapes();

        if(string1 == string2)
            System.out.println("The same");
        else System.out.println("Different");

        if(string1 == string3)
            System.out.println("The same");
        else System.out.println("Different");

        if(string2 == string3)
            System.out.println("The same");
        else System.out.println("Different");

        System.out.println();

        if(string1.equals(string2))
            System.out.println("The same");
        else System.out.println("Different");

        if(string1.equals(string3))
            System.out.println("The same");
        else System.out.println("Different");

        if(string2.equals(string3))
            System.out.println("The same");
        else System.out.println("Different");
    }
}
