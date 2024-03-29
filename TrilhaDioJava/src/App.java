import ConhecendoJava.SintaxeJava.TiposVariaveis.TiposDeVariaveis;
import ConhecendoJava.SintaxeJava.Operadores.Operadores;
import ConhecendoJava.SintaxeJava.Metodos.Metodos;
import ConhecendoJava.SintaxeJava.Escopo.Escopo;
import ConhecendoJava.SintaxeJava.PalavrasReservadas.PalavrasReservadas;
import EstruturaDeDadosJava.ArvoreBinaria.ArvoreBinaria;
import EstruturaDeDadosJava.ArvoreBinaria.Model.Obj;
import EstruturaDeDadosJava.EncadeamentoNo.ObjNo;
import EstruturaDeDadosJava.Fila.Fila;
import EstruturaDeDadosJava.ListaCircular.ListaCircular;
import EstruturaDeDadosJava.ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import EstruturaDeDadosJava.ListaEncadeada.ListaEncadeada;
import EstruturaDeDadosJava.Pilha.Pilha;

import java.util.Scanner;

public class App {
    static TiposDeVariaveis variaveis = new TiposDeVariaveis();
    static Operadores operadores = new Operadores();
    static Metodos metodos = new Metodos();
    static Escopo escopo = new Escopo();
    static PalavrasReservadas palavrasReservadas = new PalavrasReservadas();

    public static void main(String[] args) throws Exception {

        // Comandos para impressão do assunto
        // SelecionarAssunto();

        // Encadeando 4 nós = no1->no2->no3->no4

        ObjNo<String> no1 = new ObjNo<String>("Conteúdo 1");
        ObjNo<String> no2 = new ObjNo<String>("Conteúdo 2");
        no1.setProximo(no2);
        ObjNo<String> no3 = new ObjNo<String>("Conteúdo 3");
        no2.setProximo(no3);
        // System.out.println(no1.getConteudo());

        // criando e editando uma pilha
        Pilha<Integer> minhaPilha = new Pilha<Integer>();

        minhaPilha.push(1);
        minhaPilha.push(2);
        minhaPilha.push(3);
        minhaPilha.push(4);
        minhaPilha.push(5);
        minhaPilha.push(6);

        // System.out.println(minhaPilha);
        // System.out.println(minhaPilha.pop());
        // System.out.println(minhaPilha);

        minhaPilha.push(100);
        // System.out.println(minhaPilha);

        // Cria uma fila
        Fila<String> minhaFila = new Fila<String>();

        // Adiciona elementos a fila
        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        // System.out.println(minhaFila);

        // Remove o primeiro elemento da fila
        // System.out.println(minhaFila.dequeue());
        // System.out.println(minhaFila);

        minhaFila.enqueue("Último");
        // System.out.println(minhaFila);
        // System.out.println(minhaFila.first());
        // System.out.println(minhaFila);

        // Cria lista encadeada
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<String>();

        minhaListaEncadeada.add("Entrada 01");
        minhaListaEncadeada.add("Entrada 02");
        minhaListaEncadeada.add("Entrada 03");
        minhaListaEncadeada.add("Entrada 04");
        minhaListaEncadeada.add("Entrada 05");

        // System.out.println(minhaListaEncadeada);
        // System.out.println(minhaListaEncadeada.remove(4));
        // System.out.println(minhaListaEncadeada);

        ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<String>();
        minhaListaDuplamenteEncadeada.add("Entrada 01");
        minhaListaDuplamenteEncadeada.add("Entrada 02");
        minhaListaDuplamenteEncadeada.add("Entrada 03");
        minhaListaDuplamenteEncadeada.add("Entrada 04");
        minhaListaDuplamenteEncadeada.add("Entrada 05");
        // System.out.println(minhaListaDuplamenteEncadeada);
        // System.out.println(minhaListaDuplamenteEncadeada.get(3));
        minhaListaDuplamenteEncadeada.add(0, "Entrada 00");
        // System.out.println(minhaListaDuplamenteEncadeada);
        minhaListaDuplamenteEncadeada.add(5, "Entrada 4.5");
        // System.out.println(minhaListaDuplamenteEncadeada);
        minhaListaDuplamenteEncadeada.remove(0);
        // System.out.println(minhaListaDuplamenteEncadeada);

        ListaCircular<String> minhaListaCircular = new ListaCircular<String>();
        // System.out.println(minhaListaCircular);
        minhaListaCircular.add("Entrada 01");
        minhaListaCircular.add("Entrada 02");
        minhaListaCircular.add("Entrada 03");
        minhaListaCircular.add("Entrada 04");
        minhaListaCircular.add("Entrada 05");
        // System.out.println(minhaListaCircular);
        // System.out.println(minhaListaCircular.get(0));
        // System.out.println(minhaListaCircular.get(1));
        // System.out.println(minhaListaCircular.get(2));
        // System.out.println(minhaListaCircular.get(3));
        // System.out.println(minhaListaCircular.get(4));
        // System.out.println(minhaListaCircular.get(5));
        // System.out.println(minhaListaCircular.get(6));
        // System.out.println(minhaListaCircular.get(7));
        // System.out.println(minhaListaCircular.get(8));
        // System.out.println(minhaListaCircular.get(9));
        minhaListaCircular.remove(0);
        // System.out.println(minhaListaCircular);
        minhaListaCircular.remove(3);
        // System.out.println(minhaListaCircular);

        ArvoreBinaria<Obj> minhaArvoreBinaria = new ArvoreBinaria<Obj>();
        minhaArvoreBinaria.inserir(new Obj(13));
        minhaArvoreBinaria.inserir(new Obj(10));
        minhaArvoreBinaria.inserir(new Obj(25));
        minhaArvoreBinaria.inserir(new Obj(2));
        minhaArvoreBinaria.inserir(new Obj(12));
        minhaArvoreBinaria.inserir(new Obj(20));
        minhaArvoreBinaria.inserir(new Obj(31));
        minhaArvoreBinaria.inserir(new Obj(29));

        minhaArvoreBinaria.exibirInOrdem();
        minhaArvoreBinaria.exibirPosOrdem();
        minhaArvoreBinaria.exibirPreOrdem();

        minhaArvoreBinaria.remover(new Obj(13));

        minhaArvoreBinaria.exibirInOrdem();
        minhaArvoreBinaria.exibirPosOrdem();
        minhaArvoreBinaria.exibirPreOrdem();

    }

    public static void selecionarAssunto() {
        int numeroAssunto;
        String texto = "Digite o número conrrespondente ao assunto que queria saber:\n";
        texto = texto.concat("1. Tipos de variáveis em java\n");
        texto = texto.concat("2. Operadores em java\n");
        texto = texto.concat("3. Métodos em java\n");
        texto = texto.concat("4. Escopo em java\n");
        texto = texto.concat("5. Palavras reservadas em java\n");
        texto = texto.concat("Digite qualquer outro número para sair\n");
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        numeroAssunto = scanner.nextInt();

        while ((numeroAssunto < 6) && (numeroAssunto > 0)) {
            switch (numeroAssunto) {
                case 1:
                    variaveis.selecionarSubTopico();
                    break;

                case 2:
                    operadores.selecionarSubTopico();
                    break;

                case 3:
                    metodos.imprimirAnotacoesMetodos();
                    break;

                case 4:
                    escopo.imprimirEscopo();
                    break;

                case 5:
                    palavrasReservadas.imprimirPalavrasReservadas();
                    break;
            }

            System.out.println(texto);
            numeroAssunto = scanner.nextInt();
        }

    }

}
