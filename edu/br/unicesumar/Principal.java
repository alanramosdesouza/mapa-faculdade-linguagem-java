/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.br.unicesumar;

import edu.br.unicesumar.entidade.CadastroPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 * R.A: 18628865
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<CadastroPaciente> listaCadastroPaciente = new ArrayList<CadastroPaciente>();
        CadastroPaciente cp = new CadastroPaciente();   
        
        while(true){
        
        String cpfStr = JOptionPane.showInputDialog("Digite o CPF: "); 
        cp.setCpf(cpfStr);
        if(cpfStr.equals("Sair")|| cpfStr.equals("sair") || cpfStr.equals("SAIR")){
            break;
        }
        String nomeStr = JOptionPane.showInputDialog("Digite o Nome: "); 
        cp.setNome(nomeStr);
        String sexoStr = JOptionPane.showInputDialog("Digite o Sexo: ");  
        cp.setSexo(sexoStr);
        String idadeStr = JOptionPane.showInputDialog("Digite a Idade: ");
        cp.setIdade(Integer.parseInt(idadeStr));
        
        listaCadastroPaciente.add(cp);
       
        System.out.println("Cadastro: ");
        System.out.println(cp);
        
       
       Integer sintomas1 = JOptionPane.showConfirmDialog(null, "Tem febre? ");
       if(sintomas1 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas1 == 0){
            sintomas1 = 5;
       }else{
           sintomas1 = 0;
       }
       Integer sintomas2 = JOptionPane.showConfirmDialog(null, "Tem dor de cabeça? ");
       if(sintomas2 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas2 == 0){
            sintomas2 = 1;
       }else{
           sintomas2 = 0;
       }
       Integer sintomas3 = JOptionPane.showConfirmDialog(null, "Tem secreção nasal ou espirros? ");
       if(sintomas3 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas3 == 0){
            sintomas3 = 1;
       }else{
           sintomas3 = 0;
       }
       Integer sintomas4 = JOptionPane.showConfirmDialog(null, "Está com irritação ou dor na garganta? ");
       if(sintomas4 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas4 == 0){
            sintomas4 = 1;
       }else{
           sintomas4 = 0;
       }
       Integer sintomas5 = JOptionPane.showConfirmDialog(null, "Está tendo tosse seca? ");
       if(sintomas5 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas5 == 0){
            sintomas5 = 3;
       }else{
           sintomas5 = 0;
       }
       Integer sintomas6 = JOptionPane.showConfirmDialog(null, "Está com dificuldade para respirar? ");
       if(sintomas6 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas6 == 0){
            sintomas6 = 10;
       }else{
           sintomas6 = 0;
       }
       Integer sintomas7 = JOptionPane.showConfirmDialog(null, "Sente dores no corpo? ");
       if(sintomas7 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas7 == 0){
            sintomas7 = 1;
       }else{
           sintomas7 = 0;
       }
       Integer sintomas8 = JOptionPane.showConfirmDialog(null, "Tem diarréia? ");
       if(sintomas8 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas8 == 0){
            sintomas8 = 1;
       }else{
           sintomas8 = 0;
       }
       Integer sintomas9 = JOptionPane.showConfirmDialog(null, "Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19? ");
       if(sintomas9 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas9 == 0){
            sintomas9 = 10;
       }else{
           sintomas9 = 0;
       }
       Integer sintomas10 = JOptionPane.showConfirmDialog(null, "Esteve em locais com grande aglomeração?  ");
       if(sintomas10 == 2){
           System.out.println("Operação cancelada");
           break;
       }if(sintomas10 == 0){
            sintomas10 = 3;
       }else{
           sintomas10 = 0;
       }
       int somaSintomas = sintomas1 + sintomas2 + sintomas3 + sintomas4 + sintomas5
                       + sintomas6 + sintomas7 + sintomas8 + sintomas9 + sintomas10;
       if(somaSintomas <= 9){
       JOptionPane.showMessageDialog(null,"Se dirija para ala Baixo Risco");
       }
       if(somaSintomas >= 9 && somaSintomas <= 19){
       JOptionPane.showMessageDialog(null,"Se dirija para ala Médio Risco");
       }
       if(somaSintomas >= 20){
       JOptionPane.showMessageDialog(null,"Se dirija URGENTEMENTE para ala de Risco Alto");
       }
       
    }

    }
}
    

