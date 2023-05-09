public class main {
    public static void main(String[] args) {
        ListaDupla simpsons = new ListaDupla();

        //1) Adicione Homer e Marge na lista e depois imprima o resultado.
        simpsons.adiciona("Homer");
        simpsons.adiciona("Marge");
        System.out.println(simpsons.Imprimir());

        //2) Esvazie a lista e imprima.
        simpsons.esvaziarLista();
        System.out.println(simpsons.Imprimir());

        //3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
        simpsons.adiciona("Homer");
        simpsons.adiciona(0, "Bart");
        simpsons.adiciona(1, "Moll");
        System.out.println(simpsons.Imprimir());

        //4) Esvazie a lista.
        simpsons.esvaziarLista();

        //5) Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista.
        simpsons.adiciona("Homer");
        simpsons.adiciona("Bart");
        simpsons.adicionaComeco("Lisa");
        System.out.println(simpsons.Imprimir());
        System.out.println(simpsons.tamanho());

        //6) Esvazie a lista e imprima.
        simpsons.esvaziarLista();
        System.out.println(simpsons.Imprimir());

        //7) Adicione Homer, Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista.
        simpsons.adiciona("Homer");
        simpsons.adiciona("Maggie");
        simpsons.adiciona(0,"Bart");
        simpsons.adiciona(1, "Marge");
        System.out.println(simpsons.Imprimir());
        if(simpsons.contem("Lisa")){
            System.out.println("Lisa esta na lista");
        }else System.out.println("Lisa nao esta na lista");

        //8) Esvazie a lista.
        simpsons.esvaziarLista();

        //9) Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista.
        simpsons.adiciona("Homer");
        simpsons.adiciona("Bart");
        System.out.println(simpsons.Imprimir());
        System.out.println(simpsons.tamanho());

        //10) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        if(simpsons.contem("Marge")){
            System.out.println("Marge esta na lista");
        }else System.out.println("Marge nao esta na lista");

        if(simpsons.contem("Homer")){
            System.out.println("Homer esta na lista");
        }else System.out.println("Homer nao esta na lista");

        if(simpsons.contem("Bart")){
            System.out.println("Bart esta na lista");
        }else System.out.println("Bart nao esta na lista");

        if(simpsons.contem("Maggie")){
            System.out.println("Maggie esta na lista");
        }else System.out.println("Maggie nao esta na lista");

        System.out.println(simpsons.Imprimir());
        System.out.println(simpsons.tamanho());

        //11) Esvazie a lista.
        simpsons.esvaziarLista();

        //12) Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned Flanders no Começo da lista e Sr. Burns no Final da lista imprima a lista
        simpsons.adicionaComeco("Homer");
        simpsons.adicionaComeco("Bart");
        simpsons.adiciona("Marge");
        simpsons.adiciona(1, "Maggie");
        simpsons.adicionaComeco("Ned Flanders");
        simpsons.adicionaFim("Sr. Burns");
        System.out.println(simpsons.Imprimir());

        //13) Remova do fim da lista e imprima a lista.
        simpsons.removeFim();
        System.out.println(simpsons.Imprimir());

        //14) Remova a posição 1, depois imprima a lista e o tamanho da lista.
        simpsons.removeInicio();
        System.out.println(simpsons.Imprimir());
        System.out.println(simpsons.tamanho());

        //15) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        if(simpsons.contem("Marge")){
            System.out.println("Marge esta na lista");
        }else System.out.println("Marge nao esta na lista");

        if(simpsons.contem("Homer")){
            System.out.println("Homer esta na lista");
        }else System.out.println("Homer nao esta na lista");

        if(simpsons.contem("Bart")){
            System.out.println("Bart esta na lista");
        }else System.out.println("Bart nao esta na lista");

        if(simpsons.contem("Maggie")){
            System.out.println("Maggie esta na lista");
        }else System.out.println("Maggie nao esta na lista");

        System.out.println(simpsons.Imprimir());
        System.out.println(simpsons.tamanho());

        //16) Remova do começo da lista, depois imprima a lista e o tamanho da lista.
        simpsons.removeInicio();
        System.out.println(simpsons.Imprimir());
        System.out.println(simpsons.tamanho());

        //17) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        if(simpsons.contem("Marge")){
            System.out.println("Marge esta na lista");
        }else System.out.println("Marge nao esta na lista");

        if(simpsons.contem("Homer")){
            System.out.println("Homer esta na lista");
        }else System.out.println("Homer nao esta na lista");

        if(simpsons.contem("Bart")){
            System.out.println("Bart esta na lista");
        }else System.out.println("Bart nao esta na lista");

        if(simpsons.contem("Maggie")){
            System.out.println("Maggie esta na lista");
        }else System.out.println("Maggie nao esta na lista");

        System.out.println(simpsons.Imprimir());
        System.out.println(simpsons.tamanho());

        //18) Esvazie a lista e imprima.
        simpsons.esvaziarLista();
        System.out.println(simpsons.Imprimir());
    }
}
