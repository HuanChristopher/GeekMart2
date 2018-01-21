
// Classe desativada

/*package br.ufrpe.geekMart;

import br.ufrpe.geekMart.negocio.*;
import br.ufrpe.geekMart.classesBasicas.*;
import java.util.Scanner;

public class ClasseTeste {

    public static void main(String[] args) {
        ClasseTeste.MenuInicial();
    }

        public static void MenuInicial(){
            Scanner scan = new Scanner(System.in);
            Fachada fachada = Fachada.getInstancia();
            Endereco batcaverna = new Endereco();
            Cliente cliente = new Cliente();
            Cliente cTeste = new Cliente();
            cTeste.setNome("Bruce Wayne");
            cTeste.setCpf("123456789");
            cTeste.setEmail("batman@waynecompany.com");
            cTeste.setTelefone("9999-9999");
            cTeste.setSenha("robin");
            cTeste.setEndereco(batcaverna);
            batcaverna.setLogradouro("Alameda do Morcego");
            batcaverna.setNumero("666");
            batcaverna.setBairro("Vamp");
            batcaverna.setCidade("Gothan");
            batcaverna.setEstado("PE");
            batcaverna.setCep("987654-321");
            batcaverna.setComplemento("Caverna");
            fachada.cadastrarUsuario(cTeste);
            Anuncio anuncio = new Anuncio();
            Loja loja = new Loja();
            String nome, cpf, telefone, email;
            String logradouro, numero, bairro, cidade, estado, cep, complemento, senha;
            String login = null, password = null, titulo, cep2, estado2, titulod, titulop, tituloa, tituloj;
            double preco;
            Endereco adress = new Endereco();
            boolean loop = true, loop2 = true;
            ControleDeLogin loginn = ControleDeLogin.getInstancia();
            boolean retorno, retorno2;
            Administrador adm = new Administrador();
            Administrador administ = new Administrador();
            administ.setCpf("cpfteste");
            administ.setSenha("senhateste");
            administ.setNome("Adm");
            administ.setEmail("adm@adm");
            fachada.cadastrarAdministrador(administ);


            System.out.println("#############################################################");
            System.out.println("##~~~~~~~~~~~~~~~~~~~~~~~GEEKMART~~~~~~~~~~~~~~~~~~~~~~~~~~##");
            System.out.println("#############################################################");


            System.out.println("BEM VINDO AO GEEKMART\nESCOLHA SUA OPÇÃO:");
            while (loop != false) {
                System.out.println("VOCÊ JÁ POSSUI CADASTRO?");
                System.out.println("[1] NÃO\n[2] SIM");
                String schoice01 = scan.nextLine();
                int choice01 = Integer.valueOf(schoice01);

                switch (choice01) {

                    case 1:
                        System.out.println("~~~~NOVO CADASTRO DE CLIENTE~~~~");
                        System.out.println("Informar nome do cliente:");
                        nome = scan.nextLine();
                        cliente.setNome(nome);
                        System.out.println("Informar CPF:");
                        cpf = scan.nextLine();
                        cliente.setCpf(cpf);
                        System.out.println("Informar endereço:");
                        System.out.println("A)Logradouro:");
                        logradouro = scan.nextLine();
                        adress.setLogradouro(logradouro);
                        System.out.println("Informar numero:");
                        numero = scan.nextLine();
                        adress.setNumero(numero);
                        System.out.println("Informar bairro:");
                        bairro = scan.nextLine();
                        adress.setBairro(bairro);
                        System.out.println("Informar cidade:");
                        cidade = scan.nextLine();
                        adress.setCidade(cidade);
                        System.out.println("Informar estado:");
                        estado = scan.nextLine();
                        adress.setEstado(estado);
                        System.out.println("Informar CEP:");
                        cep = scan.nextLine();
                        adress.setCep(cep);
                        System.out.println("Informar complemento:");
                        complemento = scan.nextLine();
                        adress.setComplemento(complemento);
                        cliente.setEndereco(adress);
                        System.out.println("Informar telefone:");
                        telefone = scan.nextLine();
                        cliente.setTelefone(telefone);
                        System.out.println("Informar email:");
                        email = scan.nextLine();
                        cliente.setEmail(email);
                        System.out.println("Escolha uma senha:");
                        senha = scan.nextLine();
                        cliente.setSenha(senha);
                        cliente.setAnuncios(anuncio);
                        cliente.setLoja(loja);
                        System.out.println("~~CADASTRO COMPLETO~~");
                        fachada.cadastrarUsuario(cliente);
                        System.out.println("Cliente: " + nome);
                        System.out.println("CPF: " + cpf);
                        System.out.println("Endereço: " + logradouro + "," + numero + " " + "(" + complemento + ") " + bairro + " " + cidade + " " + " " + estado + " " + cep + " ");
                        System.out.println("Telefone: " + telefone);
                        System.out.println("Email: " + email);

                        loop = false;
                        break;

                    case 2:
                        loop = false;
                        System.out.println("~~~~~~~~~~");
                        break;

                    default:
                        System.out.println("~~Opção Incorreta~~");
                        break;
                }
            }

            System.out.println("****FAZER LOGIN****");
            while (loop2 != false) {
                System.out.println("Cliente, digite seu cpf :");
                login = scan.nextLine();
                System.out.println("Cliente, digite sua senha:");
                password = scan.nextLine();
                retorno = loginn.autenticarLoginAdm(password, login);
                if (retorno != true) {
                    retorno2 = loginn.autenticarLogin(password, login);
                    if (retorno2 == false) {
                        System.out.println("Login falhou.Tente Novamente.");
                    } else {
                        System.out.println("\nCliente " + fachada.buscaUsuario(login).getNome() + " logado com sucesso.\n");
                        loop2 = false;
                        ClasseTeste.MenuCliente(login);
                    }
                } else {
                    System.out.println("\nAdministrador " + fachada.buscarAdministrador(login).getNome() + " logado com sucesso.\n");

                    loop2 = false;
                    ClasseTeste.MenuAdm();
                }

            }

        }



        public static void MenuCliente(String login) {
            Scanner scan = new Scanner(System.in);
            String titulo, titulo2, cep2, estado2, titulod, titulop, tituloa, tituloj, descricao,descricao2,cep3,estado3;
            Anuncio anuncio = new Anuncio();
            boolean loop3 = true;
            double preco,preco2;
            Cliente cliente = new Cliente();
            Fachada fachada = Fachada.getInstancia();
            cliente = (Cliente) fachada.buscaUsuario(login);
            Loja loja = new Loja();
            loja.setCliente(cliente);
            loja.setAnuncios(cliente.getAnuncios());
            String telefone, email;
            String logradouro, numero, bairro, cidade, estado, cep, complemento, senha,leandro;
            Endereco adress = new Endereco();

            System.out.println("****MENU CLIENTE****");
            while (loop3 != false) {
                System.out.println("[1]CRIAR ANUNCIO\n[2]DELETAR ANUNCIO\n[3]PROCURAR ANUNCIO\n[4]ALTERAR ANUNCIO\n" +
                        "[5]CRIAR LOJA\n[6]DELETAR LOJA\n[7]PROCURAR LOJA\n[8]ALTERAR LOJA\n" +
                        "[9]ALTERAR CADASTRO\n[10]SAIR");
                int choice03 = scan.nextInt();
                scan.nextLine();
                switch (choice03) {
                    case 1: {
                        anuncio.setCliente(cliente);
                        System.out.println("Informar título do anúncio:");
                        titulo = scan.nextLine();
                        anuncio.setTitulo(titulo);
                        System.out.println("Informar preço do anúncio:");
                        preco = scan.nextDouble();
                        leandro = scan.nextLine();
                        anuncio.setPreco(preco);
                        System.out.println("Informar descrição do anúncio:");
                        descricao = scan.nextLine();
                        anuncio.setDescricao(descricao);
                        System.out.println("Informar cep:");
                        cep2 = scan.nextLine();
                        anuncio.setCep(cep2);
                        System.out.println("Informar estado:");
                        estado2 = scan.nextLine();
                        anuncio.setEstado(estado2);
                        String[] categorias = ClasseTeste.MenuCategoria();
                        anuncio.setCategoria(categorias);
                        anuncio.setData();
                        fachada.adicionarAnuncio(anuncio);
                        cliente.setAnuncios(anuncio);
                        System.out.println("~~~ANUNCIO CRIADO~~~");
                        System.out.println("Título: "+titulo);
                        System.out.println("Preço: "+preco);
                        System.out.println("Descrição: "+descricao);
                        System.out.println("Localidade: Estado "+estado2+" CEP: "+cep2);
                        System.out.println("Categoria: "+categorias[0] + "\n '-> Subcategoria: "+categorias[1] + "\n");
                        break;
                    }


                    case 2: {
                        System.out.println("Informar título do anúncio que será deletado:");
                        titulod = scan.nextLine();
                        fachada.removerAnuncio(titulod);
                        System.out.println("~~~ANUNCIO DELETADO~~~");
                        break;
                    }

                    case 3: {
                        System.out.println("Informar título do anúncio que será procurado:");
                        titulop = scan.nextLine();
                        Anuncio temp = fachada.buscarAnuncio(titulop);
                        if (temp != null) {
                            System.out.println(temp.toString());
                        } else {
                            System.out.println("O anuncio não foi encontrado.");
                        }
                        break;
                    }

                    case 4: {
                        System.out.println("Informar título do anúncio que será alterado:");
                        tituloa = scan.nextLine();
                        Anuncio temp4 = fachada.buscarAnuncio(tituloa);
                        if (temp4 != null) {
                            System.out.println("Informar novo título do anúncio:");
                            titulo2 = scan.nextLine();
                            temp4.setTitulo(titulo2);
                            System.out.println("Informar novo preço do anúncio:");
                            preco2 = scan.nextDouble();
                            String eita = scan.nextLine();
                            temp4.setPreco(preco2);
                            System.out.println("Informar nova descrição do anúncio:");
                            descricao2 = scan.nextLine();
                            temp4.setDescricao(descricao2);
                            System.out.println("Informar novo cep:");
                            cep3 = scan.nextLine();
                            temp4.setCep(cep3);
                            System.out.println("Informar novo estado:");
                            estado3 = scan.nextLine();
                            temp4.setEstado(estado3);
                            System.out.println("~~~ANUNCIO ALTERADO~~~");
                            System.out.println("Título: "+titulo2);
                            System.out.println("Preço: "+preco2);
                            System.out.println("Descrição: "+descricao2);
                            System.out.println("Localidade: Estado "+estado3+" CEP: "+cep3);
                        } else {
                            System.out.println("O anuncio não foi encontrado.");
                        }
                        break;
                    }

                    case 5: {
                        System.out.println("Informar título do loja:");
                        tituloj = scan.nextLine();
                        loja.setNome(tituloj);
                        System.out.println("Informar descrição da loja:");
                        descricao = scan.nextLine();
                        loja.setDescricao(descricao);
                        System.out.println("Informar cep:");
                        cep2 = scan.nextLine();
                        loja.setCep(cep2);
                        System.out.println("Informar estado:");
                        estado2 = scan.nextLine();
                        loja.setEstado(estado2);
                        System.out.println("Informar telefone: ");
                        telefone = scan.nextLine();
                        loja.setTelefone(telefone);
                        loja.setAnuncios(cliente.getAnuncios());
                        fachada.novaLoja(login, loja);
                        cliente.setLoja(loja);
                        System.out.println("~~~LOJA CRIADA~~~");
                        System.out.println("Título: "+tituloj);
                        System.out.println("Dono da Loja: "+cliente.getNome());
                        System.out.println("Descrição: "+descricao);
                        System.out.println("Localidade: Estado "+estado2+" CEP: "+cep2);
                        break;
                    }

                    case 6: {
                        fachada.removerLoja(login);
                        System.out.println("~~~LOJA DELETADA~~~");
                        break;
                    }

                    case 7: {
                        System.out.println("Informar nome da loja que será procurada:");
                        titulop = scan.nextLine();
                        Loja tempo = fachada.buscarLoja(titulop);
                        if (tempo != null) {
                            System.out.println(tempo.toString());
                        } else {
                            System.out.println("A loja não foi encontrada.");
                        }
                        break;
                    }

                    case 8: {
                        System.out.println("Informar  título do loja que será alterado:");
                        tituloj = scan.nextLine();
                        Loja tempo = fachada.buscarLoja(tituloj);
                        if (tempo != null) {
                            System.out.println("Informar novo título do loja");
                            String titulon = scan.nextLine();
                            loja.setNome(titulon);
                            System.out.println("Informar nova descrição da loja:");
                            descricao = scan.nextLine();
                            loja.setDescricao(descricao);
                            System.out.println("Informar novo cep:");
                            cep2 = scan.nextLine();
                            loja.setCep(cep2);
                            System.out.println("Informar novo estado:");
                            estado2 = scan.nextLine();
                            loja.setEstado(estado2);
                            System.out.println("~~~LOJA ALTERADA~~~");
                            System.out.println("Título: "+titulon);
                            System.out.println("Dono da Loja: "+cliente.getNome());
                            System.out.println("Descrição: "+descricao);
                            System.out.println("Localidade: Estado "+estado2+" CEP: "+cep2);
                        } else {
                            System.out.println("A loja não foi encontrada.");
                        }
                        break;
                    }

                    case 9: {
                        System.out.println("Informar os dados que serão  alterados:");
                        System.out.println("Informar endereço:");
                        System.out.println("A)Logradouro:");
                        logradouro = scan.nextLine();
                        adress.setLogradouro(logradouro);
                        System.out.println("Informar numero:");
                        numero = scan.nextLine();
                        adress.setNumero(numero);
                        System.out.println("Informar bairro:");
                        bairro = scan.nextLine();
                        adress.setBairro(bairro);
                        System.out.println("Informar cidade:");
                        cidade = scan.nextLine();
                        adress.setCidade(cidade);
                        System.out.println("Informar estado:");
                        estado = scan.nextLine();
                        adress.setEstado(estado);
                        System.out.println("Informar CEP:");
                        cep = scan.nextLine();
                        adress.setCep(cep);
                        System.out.println("Informar complemento:");
                        complemento = scan.nextLine();
                        adress.setComplemento(complemento);
                        cliente.setEndereco(adress);
                        System.out.println("Informar telefone:");
                        telefone = scan.nextLine();
                        cliente.setTelefone(telefone);
                        System.out.println("Informar email:");
                        email = scan.nextLine();
                        cliente.setEmail(email);
                        System.out.println("Escolha uma senha:");
                        senha = scan.nextLine();
                        cliente.setSenha(senha);
                        System.out.println("~~CADASTRO ALTERADO~~");
                        System.out.println("Cliente: "+cliente.getNome());
                        System.out.println("CPF: "+cliente.getCpf());
                        System.out.println("Endereço: "+logradouro+","+numero+" "+"("+complemento+") "+bairro+" "+cidade+" "+" "+estado+" "+cep+" ");
                        System.out.println("Telefone: "+telefone);
                        System.out.println("Email: "+email);
                        break;
                    }

                    case 10:{
                        ClasseTeste.MenuInicial();
                    }

                    default: {
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                    }
                }
            }
        }


        public static void MenuAdm(){
            Scanner scan = new Scanner(System.in);
            Fachada fachada = Fachada.getInstancia();
            String titulod, titulop, nome, cpf, email, senha;
            boolean loop6=true;
            Administrador adm = new Administrador();
            System.out.println("****MENU ADMINISTRADOR****");
            while (loop6 != false) {
                System.out.println("[1]BLOQUEAR CLIENTE\n[2]DELETAR ANUNCIO\n[3]PROCURAR ANUNCIO\n[4]DELETAR CLIENTE\n" +
                        "[5]DESBLOQUEAR CLIENTE\n[6]PROCURAR CLIENTE\n[7]CADASTRAR NOVO ADM\n" +
                        "[8]ALTERAR CADASTRO\n[9]SAIR");
                int choice04 = scan.nextInt();
                scan.nextLine();
                switch (choice04) {
                    case 1: {
                        System.out.println("Informar CPF do Cliente que será Bloqueado:");
                        String cpfbloc = scan.nextLine();
                        Usuario temp = fachada.buscaUsuario(cpfbloc);
                        if (temp != null) {
                            fachada.bloquearUsuario(cpfbloc);
                            System.out.println("~~~USUARIO BLOQUEADO~~~");
                        } else {
                            System.out.println("Cliente não foi encontrado.");
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Informar título do anúncio que será deletado:");
                        titulod = scan.nextLine();
                        Anuncio temp = fachada.buscarAnuncio(titulod);
                        if (temp != null) {
                            fachada.removerAnuncio(titulod);
                            System.out.println("~~~ANUNCIO DELETADO~~~");
                        } else {
                            System.out.println("Anuncio não foi encontrado.");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Informar título do anúncio que será procurado:");
                        titulop = scan.nextLine();
                        Anuncio temp = fachada.buscarAnuncio(titulop);
                        if (temp != null) {
                            System.out.println("~~~ANUNCIO ENCONTRADO~~~");
                        } else {
                            System.out.println("Anuncio não foi encontrado.");
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Informar CPF do Cliente que será deletado:");
                        String num = scan.nextLine();
                        Usuario t = fachada.buscaUsuario(num);
                        if (t != null) {
                            fachada.removerUsuario(t.getCpf());
                            System.out.println("~~~CLIENTE DELETADO~~~");
                        } else {
                            System.out.println("Cliente não foi encontrado.");
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("Informar CPF do Cliente que será Desbloqueado:");
                        String cpfunbloc = scan.nextLine();
                        Usuario t = fachada.buscaUsuario(cpfunbloc);
                        if (t != null) {
                            fachada.desbloquearUsuario(cpfunbloc);
                            System.out.println("~~~USUARIO DESBLOQUEADO~~~");
                        } else {
                            System.out.println("Cliente não foi encontrado.");
                        }
                        break;
                    }
                    case 6: {
                        System.out.println("Informar CPF do cliente que será procurado:");
                        String num2 = scan.nextLine();
                        Usuario t2 = fachada.buscaUsuario(num2);
                        if (t2 != null) {
                            System.out.println("Cliente achado foi o: "+t2.getNome());
                        } else {
                            System.out.println("Cliente não foi encontrado.");
                        }
                        break;
                    }
                    case 7: {
                        System.out.println("~~~~NOVO CADASTRO DE ADM~~~~");
                        System.out.println("Informar nome do ADM:");
                        nome = scan.nextLine();
                        adm.setNome(nome);
                        System.out.println("Informar CPF:");
                        cpf = scan.nextLine();
                        adm.setCpf(cpf);
                        System.out.println("Informar email:");
                        email = scan.nextLine();
                        adm.setEmail(email);
                        System.out.println("Escolha uma senha:");
                        senha = scan.nextLine();
                        adm.setSenha(senha);
                        System.out.println("~~CADASTRO COMPLETO~~");
                        fachada.cadastrarAdministrador(adm);
                        System.out.println("Nome: "+nome);
                        System.out.println("CPF: "+cpf);
                        System.out.println("email: "+email);
                        break;
                    }
                    case 8: {
                        System.out.println("~~~~ALTERAR CADASTRO DE ADM~~~~");
                        System.out.println("Informar email:");
                        email = scan.nextLine();
                        adm.setEmail(email);
                        System.out.println("Escolha uma senha:");
                        senha = scan.nextLine();
                        adm.setSenha(senha);
                        System.out.println("~~CADASTRO COMPLETO~~");
                        System.out.println("email: "+email);
                        break;
                    }
                    case 9:{
                        ClasseTeste.MenuInicial();
                    }
                    default: {
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                    }
                }
            }
        }



    public static String[] MenuCategoria() {
        Scanner scan = new Scanner(System.in);
        Categorias categorias = new Categorias();
        String[] results = new String[2];
        System.out.println("~~~~ESCOLHA A CATEGORIA~~~~");
        System.out.println(Categorias.toStringPrincipal());
        int opcao1 = scan.nextInt();
        results[0] = Categorias.getCategoria(--opcao1);
        System.out.println("~~~~ESCOLHA A SUBCATEGORIA~~~~");
        System.out.println(Categorias.toStringSubcategorias(++opcao1));
        int opcao2 = scan.nextInt();
        results[1] = Categorias.getCategoria(Categorias.pegarCategoriaEscolhida(opcao1, opcao2));
        return results;
    }
} */