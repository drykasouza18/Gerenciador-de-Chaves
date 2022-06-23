package com.mycompany.empchaves;

import com.mycompany.empchaves.Conexao.Conexao;

public class Inicio {

    public static void main(String[] args) {
        /* TelaInicial ti = new TelaInicial();
        ti.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ti.setVisible(true);*/
        
        Conexao.conectar("jdbc:mysql://10.0.0.14:3306/CORPORERM", "rm", "rm");
    }
}
