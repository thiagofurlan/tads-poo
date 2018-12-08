class Main {

    public static void main(String[] args) {

        // Main.java, main method
        List lista = new List();
        // lista vazia
        System.out.println(lista.count() == 0);
        System.out.println(lista.isEmpty() == true);
        System.out.println(lista.get(0) == null);
        // adicionando elemento no fim
        lista.append("a");
        // lista tem um elemento
        System.out.println(lista.isEmpty() == false);
        System.out.println(lista.count() == 1);
        System.out.println(lista.get(0).equals("a"));
        // adicionando mais 4 elementos
        lista.append(2);
        lista.append("c");
        lista.append("d");
        lista.append("e");
        // lista tem 5 elementos
        System.out.println(lista.count() == 5);
        // descobrindo o índice
        System.out.println(lista.indexOf("a") == 0);
        System.out.println(lista.indexOf(2) == 1);
        System.out.println(lista.indexOf("e") == 4);
        System.out.println(lista.indexOf("f") == -1);
        System.out.println(lista.indexOf(3) == -1);
        // índices
        System.out.println(lista.get(1).equals(2));
        System.out.println(lista.get(2).equals("c"));
        // índice fora do tamanho retorna null
        System.out.println(lista.get(5) == null);
        // perguntando se há um elemento
        System.out.println(lista.has("a") == true);
        System.out.println(lista.has(3) == false);
        System.out.println(lista.has("f") == false);
        System.out.println(lista.has(2) == true);
        // consultas não fazem alteração
        System.out.println(lista.count() == 5);
        // nulos não podem ser adicionados
        lista.append(null);
        System.out.println(lista.count() == 5);
        // se um elemento for eliminado com sucesso: true, senão: false
        // delete é por índice
        System.out.println(lista.delete(1) == true); // eliminando o item 1
        System.out.println(lista.delete(9) == false);
        // agora a lista tem 4 elementos
        System.out.println(lista.count() == 4);
        // que são estes
        System.out.println(lista.get(0).equals("a"));
        System.out.println(lista.get(1).equals("c"));
        System.out.println(lista.get(2).equals("d"));
        System.out.println(lista.get(3).equals("e"));
        // eliminando mais um
        System.out.println(lista.delete(2) == true);
        // agora são 3
        System.out.println(lista.count() == 3);
        // pode ser usado o remover que recebe um objeto
        // remove é por objeto
        System.out.println(lista.remove("c") == true); // se encontrado, e removido, true
        // agora tem 2
        System.out.println(lista.count() == 2);
        System.out.println(lista.get(0).equals("a"));
        System.out.println(lista.get(1).equals("e"));
        // reset reinicia a lista (zera tudo)
        lista.reset();
        // tudo zerado
        System.out.println(lista.count() == 0);
        System.out.println(lista.isEmpty() == true);
        System.out.println(lista.get(0) == null);
        // adicionando 2
        lista.append("Chell");
        lista.append("Alucard");
        // tem 2
        System.out.println(lista.count() == 2);
        System.out.println(lista.isEmpty() == false);
        System.out.println(lista.get(0).equals("Chell"));
        System.out.println(lista.get(1).equals("Alucard"));
        // prepend adiciona no começo da lista
        lista.prepend("Sagat");
        // tem 3
        System.out.println(lista.count() == 3);
        System.out.println(lista.get(0).equals("Sagat"));
        System.out.println(lista.get(1).equals("Chell"));
        System.out.println(lista.get(2).equals("Alucard"));
        // insert coloca numa posição específica
        lista.insert("Claire Redfield", 1); // índice 1
        // // tem 4
        System.out.println(lista.count() == 4);
        // Claire é o índice 1
        System.out.println(lista.get(0).equals("Sagat"));
        System.out.println(lista.get(1).equals("Claire Redfield"));
        System.out.println(lista.get(2).equals("Chell"));
        System.out.println(lista.get(3).equals("Alucard"));
        // não pode inserir em índices não existentes
        lista.insert("Zelda", -1);
        lista.insert("Zelda", 5);
        // foram negados
        System.out.println(lista.count() == 4);
        // mas inserir no fim pode!
        lista.insert("Zelda", 4);
        // final, 5 elementos, Zelda é o quinto
        System.out.println(lista.count() == 5);
        System.out.println(lista.get(0).equals("Sagat"));
        System.out.println(lista.get(1).equals("Claire Redfield"));
        System.out.println(lista.get(2).equals("Chell"));
        System.out.println(lista.get(3).equals("Alucard"));
        System.out.println(lista.get(4).equals("Zelda"));

    }

}
