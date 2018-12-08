class Rotacionar {

    public static void main(String[] args) {

        String s1 = "worf";
        String s2 = Text.rotate(s1);
        System.out.println(s1); // worf
        System.out.println(s2); // fwor
        System.out.println(s2.equals("fwor") == true); // true
        String s3 = Text.rotate(s2);
        System.out.println(s3); // rfwo
        System.out.println(s3.equals("rfwo") == true); // true
        System.out.println(Text.rotate("kira").equals("akir") == true);
        System.out.println(Text.rotate(Text.rotate(s3)).equals("worf") == true);
        // Casos Especiais
        System.out.println(Text.rotate("").equals("") == true);
        System.out.println(Text.rotate("a").equals("a") == true);
        System.out.println(Text.rotate("aa").equals("aa") == true);
        // Adicione mais 2 Casos de Teste
        System.out.println(Text.rotate("a").equals("b") == false); // true
        System.out.println(Text.rotate("socorrammeemmarrocos").equals("socorrammeemmarrocos") == true); // true
    }

}
