package br.com.hygor.main;

import java.io.PrintWriter;

/**
 * @author Hygor Dias
 */

public class ClassGenerator {

    public static void main(String[] args){

        String path = "src/br/com/hygor/uri/cpp/starter/";
        String ext = ".cpp";
        String pack = "package br.com.hygor.uri.java.starter";
        String[] nomes = {"_1001_Extremamente_Basico","_1002_area_do_Circulo","_1003_Soma_Simples","_1004_Produto_Simples","_1005_Media_1","_1006_Media_2","_1007_Diferenca","_1008_Salario","_1009_Salario_com_Bonus","_1010_Calculo_Simples","_1011_Esfera","_1012_area","_1013_O_Maior","_1014_Consumo","_1015_Distancia_Entre_Dois_Pontos","_1016_Distancia","_1017_Gasto_de_Combustivel","_1018_Cedulas","_1019_Conversao_de_Tempo","_1020_Idade_em_Dias","_1021_Notas_e_Moedas","_1035_Teste_de_Selecao_1","_1036_Formula_de_Bhaskara","_1037_Intervalo","_1040_Media_3","_1041_Coordenadas_de_um_Ponto","_1042_Sort_Simples","_1043_Triangulo","_1044_Multiplos","_1045_Tipos_de_Triangulos","_1046_Tempo_de_Jogo","_1047_Tempo_de_Jogo_com_Minutos","_1048_Aumento_de_Salario","_1049_Animal","_1050_DDD","_1051_Imposto_de_Renda","_1052_Mes","_1059_Numeros_Pares","_1060_Numeros_Positivos","_1061_Tempo_de_um_Evento","_1064_Positivos_e_Media","_1065_Pares_entre_Cinco_Numeros","_1066_Pares_impares_Positivos_e_Negativos","_1067_Numeros_impares","_1070_Seis_Numeros_impares","_1071_Soma_de_Impares_Consecutivos_I","_1072_Intervalo_2","_1073_Quadrado_de_Pares","_1074_Par_ou_impar","_1075_Resto_2","_1078_Tabuada","_1079_Medias_Ponderadas","_1080_Maior_e_Posicao","_1094_Experiencias","_1095_Sequencia_IJ_1","_1096_Sequencia_IJ_2","_1097_Sequencia_IJ_3","_1098_Sequencia_IJ_4","_1099_Soma_de_impares_Consecutivos_II","_1101_Sequencia_de_Numeros_e_Soma","_1113_Crescente_e_Decrescente","_1114_Senha_Fixa","_1115_Quadrante","_1116_Dividindo_X_por_Y","_1117_Validacao_de_Nota","_1118_Varias_Notas_Com_Validacao","_1131_Grenais","_1132_Multiplos_de_13","_1133_Resto_da_Divisao","_1134_Tipo_de_Combustivel","_1142_PUM","_1143_Quadrado_e_ao_Cubo","_1144_Sequencia_Logica","_1145_Sequencia_Logica_2","_1146_Sequencias_Crescentes","_1149_Somando_Inteiros_Consecutivos","_1150_Ultrapassando_Z","_1151_Fibonacci_Facil","_1153_Fatorial_Simples","_1154_Idades","_1155_Sequencia_S","_1156_Sequencia_S_II","_1157_Divisores_I","_1158_Soma_de_impares_Consecutivos_III","_1159_Soma_de_Pares_Consecutivos","_1160_Crescimento_Populacional","_1164_Numero_Perfeito","_1165_Numero_Primo","_1172_Substituicao_em_Vetor_I","_1173_Preenchimento_de_Vetor_I","_1174_Selecao_em_Vetor_I","_1175_Troca_em_Vetor_I","_1176_Fibonacci_em_Vetor","_1177_Preenchimento_de_Vetor_II","_1178_Preenchimento_de_Vetor_III","_1179_Preenchimento_de_Vetor_IV","_1180_Menor_e_Posicao","_1181_Linha_na_Matriz","_1182_Coluna_na_Matriz","_1183_Acima_da_Diagonal_Principal","_1184_Abaixo_da_Diagonal_Principal","_1185_Acima_da_Diagonal_Secundaria","_1186_Abaixo_da_Diagonal_Secundaria","_1187_area_Superior","_1188_area_Inferior","_1189_area_Esquerda","_1190_area_Direita","_1435_Matriz_Quadrada_I","_1478_Matriz_Quadrada_II","_1534_Matriz_123","_1541_Construindo_Casas","_1557_Matriz_Quadrada_III","_1564_Vai_Ter_Copa","_1589_Bob_Conduite","_1759_Ho_Ho_Ho","_1789_A_Corrida_de_Lesmas","_1827_Matriz_Quadrada_IV","_1828_Bazinga","_1837_Prefacio","_1847_Bem_vindos_e_Bem_vindas_ao_Inverno","_1848_Corvo_Contador","_1858_A_Resposta_de_Theon","_1864_Nossos_Dias_Nunca_Voltarao","_1865_Mjölnir","_1866_Conta","_1914_De_Quem_e_a_Vez","_1921_Guilherme_e_Suas_Pipas","_1924_Vitoria_e_a_Indecisao","_1929_Triangulo","_1930_Tomadas","_1933_Tri_du","_1957_Converter_para_Hexadecimal","_1958_Notacao_Cientifica","_1959_Poligonos_Regulares_Simples","_1960_Numeracao_Romana_para_Numeros_de_Pagina","_1961_Pula_Sapo","_1962_Ha_Muito_Muito_Tempo_Atras","_1963_O_Filme","_1973_Jornada_nas_Estrelas","_1983_O_Escolhido","_1984_O_Enigma_do_Pronalandia","_1985_MacPRONALTS","_2003_Domingo_de_Manha","_2006_Identificando_o_Cha","_2028_Sequencia_de_Sequencia","_2029_Reservatorio_de_Mel","_2031_Pedra_Papel_Ataque_Aereo","_2057_Fuso_Horario","_2059_impar_Par_ou_Roubo","_2060_Desafio_de_Bino","_2061_As_Abas_de_Pericles","_2126_Procurando_Subsequencias","_2139_Natal_de_Pedrinho","_2140_Duas_Notas","_2143_A_Volta_do_Radar","_2146_Senha","_2147_Galopeira","_2152_Pepe_Ja_Tirei_a_Vela","_2159_Numero_Aproximado_de_Primos","_2160_Nome_no_Formulario","_2161_Raiz_Quadrada_de_10","_2162_Picos_e_Vales","_2163_O_Despertar_da_Forca","_2164_Fibonacci_Rapido","_2165_Tuitando","_2166_Raiz_Quadrada_de_2","_2167_Falha_do_Motor","_2168_Crepusculo_em_Portland","_2172_Evento","_2176_Paridade","_2203_Tempestade_de_Corvos","_2221_Batalha_de_Pomekons","_2222_Brincando_com_Conjuntos","_2234_Cachorros_Quentes","_2235_Andando_no_Tempo","_2310_Voleibol","_2311_Saltos_Ornamentais","_2313_Qual_Triangulo","_2334_Patinhos","_2338_Morse","_2483_Feliz_Nataaal","_2486_C_Mais_ou_Menos","_2493_Jogo_do_Operador","_2502_Decifrando_a_Carta_Criptografada","_2510_Batmain","_2520_O_ultimo_Analogimon","_2523_A_Mensagem_de_Will","_2533_Estagio","_2534_Exame_Geral","_2540_Impeachment_do_Lider","_2542_Iu_Di_Oh","_2543_Jogatina_UFPR","_2544_Kage_Bunshin_no_Jutsu","_2547_Montanha_Russa","_2551_Novo_Recorde","_2552_PaodeQuejoSweeper","_2554_Pizza_Antes_de_BH","_2581_I_am_Toorg","_2582_System_of_a_Download","_2626_Turma_do_JB6","_2627_Bonde_de_Automatos","_2628_Caca_ao_Tesouro","_2629_Rodoido","_2630_Escala_de_Cinza","_2631_Formando_Duplas","_2632_Magic_and_Sword","_2633_Churras_no_Yuri","_2634_Em_Prol_da_Ciencia","_2635_Navegador_Web","_2636_3_RSA","_2637_Casa_do_Batera","_2638_Construcao_de_um_Aeroporto","_2639_Cluedo","_2640_Missao_Improvavel","_2641_Dinheiro_por_Nada","_2642_Necessidade_por_Velocidade","_2643_Posterizar","_2644_Replicate_Replicate_Rfplicbte","_2645_Scenery","_2646_Secret_Chamber_at_Mount_Rushmore","_2647_Son_of_Pipe_Stream","_2648_Tarot_Sham_Boast","_2649_Visual_PythonPP","_2650_Construindo_Muralhas","_2653_Dijkstra","_2663_Fase","_2670_Maquina_de_Cafe","_2674_Super_Primos:_Ativar","_2679_Sucessor_Par","_2682_Detector_de_Falhas","_2684_Ajude_o_Professor_Webscript","_2685_A_Mudanca","_2686_A_Mudanca_Continua_","_2687_Dominacao_Bacteriana","_2688_Escolhendo_um_Lugar","_2689_Jogo_do_Miao","_2690_Nova_Senha_RA","_2691_O_Matematico","_2692_Teclado_Zoeiro","_2693_Van","_2695_Arrumando_Lajotas","_2698_Dispositivo_Assombrado","_2699_Enigma","_2700_Angariando_Fundos","_2701_Portas_da_Incerteza","_2702_Escolha_Dificil","_2703_Estradas_Imperiais","_2704_Sapo_Saltador","_2705_Mantenha_Coberto","_2706_Linearville","_2708_Turistas_no_Parque_Huacachina","_2709_As_Moedas_de_Robbie","_2710_Jogo_da_Matriz","_2712_Rodizio_Veicular","_2715_Dividindo_os_Trabalhos_I"};

        //String[] nomes = {"_1001_Extremamente_Basico4"};

        for(int i = 0; i < nomes.length; i++){

            try{
                String name = path + nomes[i].toLowerCase() + ext;
                PrintWriter writer = new PrintWriter(name, "UTF-8");
                String template =

                                "\n//"+
                                "\n// @author Hygor Dias"+
                                "\n// @github github.com/zygor06"+
                                "\n// " +
                                "\n"+
                                "\n#include <iostream>"+
                                "\nusing namespace std;"+
                                        "\n"+
                                        "\n"+
                                        "\nint main(){"+
                                        "\n"+
                                        "\n    //Implementar resolucao do exercicio "+ nomes[i] +
                                        "\n"+
                                        "\n}\n";

                writer.print(template);
                writer.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
