/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroPaciente;


import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author Guilherme
 */
public class AplicacaoComboBoxCadastroPaciente extends AplicacaoTextCadastroPaciente{
    //classe rap de int
    JComboBox<String> comboDia = new JComboBox<>();
    JComboBox<String> comboMes = new JComboBox<>();
    JComboBox<String> comboAno = new JComboBox<>();
    JComboBox<String> comboDef = new JComboBox<>(); //se possui ou n deficiencia

    
    public AplicacaoComboBoxCadastroPaciente (){
        add(comboDia);
        
        
        //adicionando itens ao dia
        comboDia.addItem("01");
        comboDia.addItem("02");
        comboDia.addItem("03");
        comboDia.addItem("04");
        comboDia.addItem("05");
        comboDia.addItem("06");
        comboDia.addItem("07");
        comboDia.addItem("08");
        comboDia.addItem("09");
        comboDia.addItem("10");
        comboDia.addItem("11");
        comboDia.addItem("12");
        comboDia.addItem("13");
        comboDia.addItem("14");
        comboDia.addItem("15");
        comboDia.addItem("16");
        comboDia.addItem("17");
        comboDia.addItem("18");
        comboDia.addItem("19");
        comboDia.addItem("20");
        comboDia.addItem("21");
        comboDia.addItem("22");
        comboDia.addItem("23");
        comboDia.addItem("24");
        comboDia.addItem("25");
        comboDia.addItem("26");
        comboDia.addItem("27");
        comboDia.addItem("28");
        comboDia.addItem("29");
        comboDia.addItem("30");
        comboDia.addItem("31");
        //colocando o item 1 como selecionado ao inicializar
        comboDia.setSelectedIndex(0);
        comboDia.setBounds(190, 200, 40, 20);
        
        add(comboMes);
        
        //adicionando itens ao mes
        comboMes.addItem("01");
        comboMes.addItem("02");
        comboMes.addItem("03");
        comboMes.addItem("04");
        comboMes.addItem("05");
        comboMes.addItem("06");
        comboMes.addItem("07");
        comboMes.addItem("08");
        comboMes.addItem("09");
        comboMes.addItem("10");
        comboMes.addItem("11");
        comboMes.addItem("12");
        
        
        //colocando o item 1 como selecionado ao inicializar
        comboMes.setSelectedIndex(0);
        comboMes.setBounds(240, 200, 50, 20);
        
        add(comboAno);
        
        //adicionando itens ao ano
        comboAno.addItem("1910");
        comboAno.addItem("1911");
        comboAno.addItem("1912");
        comboAno.addItem("1913");
        comboAno.addItem("1914");
        comboAno.addItem("1915");
        comboAno.addItem("1917");
        comboAno.addItem("1918");
        comboAno.addItem("1919");
        
        comboAno.addItem("1920");
        comboAno.addItem("1922");
        comboAno.addItem("1923");
        comboAno.addItem("1924");
        comboAno.addItem("1925");
        comboAno.addItem("1926");
        comboAno.addItem("1927");
        comboAno.addItem("1928");
        comboAno.addItem("1929");
        
        comboAno.addItem("1930");
        comboAno.addItem("1931");
        comboAno.addItem("1932");
        comboAno.addItem("1933");
        comboAno.addItem("1934");
        comboAno.addItem("1935");
        comboAno.addItem("1936");
        comboAno.addItem("1937");
        comboAno.addItem("1938");
        comboAno.addItem("1939");
        
        comboAno.addItem("1940");
        comboAno.addItem("1941");
        comboAno.addItem("1942");
        comboAno.addItem("1943");
        comboAno.addItem("1944");
        comboAno.addItem("1945");
        comboAno.addItem("1946");
        comboAno.addItem("1947");
        comboAno.addItem("1948");
        comboAno.addItem("1949");
        
        comboAno.addItem("1950");
        comboAno.addItem("1951");
        comboAno.addItem("1952");
        comboAno.addItem("1953");
        comboAno.addItem("1954");
        comboAno.addItem("1955");
        comboAno.addItem("1956");
        comboAno.addItem("1957");
        comboAno.addItem("1958");
        comboAno.addItem("1959");
        
        comboAno.addItem("1960");
        comboAno.addItem("1961");
        comboAno.addItem("1962");
        comboAno.addItem("1963");
        comboAno.addItem("1964");
        comboAno.addItem("1965");
        comboAno.addItem("1966");
        comboAno.addItem("1967");
        comboAno.addItem("1968");
        comboAno.addItem("1969");
        
        comboAno.addItem("1970");
        comboAno.addItem("1971");
        comboAno.addItem("1972");
        comboAno.addItem("1973");
        comboAno.addItem("1974");
        comboAno.addItem("1975");
        comboAno.addItem("1976");
        comboAno.addItem("1977");
        comboAno.addItem("1978");
        comboAno.addItem("1979");
        
        comboAno.addItem("1980");
        comboAno.addItem("1981");
        comboAno.addItem("1982");
        comboAno.addItem("1983");
        comboAno.addItem("1984");
        comboAno.addItem("1985");
        comboAno.addItem("1986");
        comboAno.addItem("1987");
        comboAno.addItem("1988");
        comboAno.addItem("1989");
        
        comboAno.addItem("1990");
        comboAno.addItem("1991");
        comboAno.addItem("1992");
        comboAno.addItem("1993");
        comboAno.addItem("1994");
        comboAno.addItem("1995");
        comboAno.addItem("1996");
        comboAno.addItem("1997");
        comboAno.addItem("1998");
        comboAno.addItem("1999");
        
        comboAno.addItem("2000");
        comboAno.addItem("2001");
        comboAno.addItem("2002");
        comboAno.addItem("2003");
        comboAno.addItem("2004");
        comboAno.addItem("2005");
        comboAno.addItem("2006");
        comboAno.addItem("2007");
        comboAno.addItem("2008");
        comboAno.addItem("2009");
        
        comboAno.addItem("2010");
        comboAno.addItem("2011");
        comboAno.addItem("2012");
        comboAno.addItem("2013");
        comboAno.addItem("2014");
        comboAno.addItem("2015");
        comboAno.addItem("2016");
        comboAno.addItem("2017");
        comboAno.addItem("2018");
        comboAno.addItem("2019");
        
        comboAno.addItem("2020");
        comboAno.addItem("2021");
        comboAno.addItem("2022");
        
        
        
        
       
        //colocando o item 1 como selecionado ao inicializar
        comboAno.setSelectedIndex(0);
        comboAno.setBounds(300, 200, 60, 20);
        
        
        add(comboDef);
        
        //adicionando itens 
       
        comboDef.addItem(" ");       
        comboDef.addItem("Não");
        comboDef.addItem("Sim");

        
        //colocando o item 1 como selecionado ao inicializar
        comboDef.setSelectedIndex(0);
        comboDef.setBounds(190, 280, 50, 20);
        
        
        
        getContentPane().add(comboDef);
        getContentPane().add(comboDia);
        getContentPane().add(comboMes);
        getContentPane().add(comboAno);

    }
    
    public static void main(String[] args) {
        new AplicacaoComboBoxCadastroPaciente().show();
    }
    
}
