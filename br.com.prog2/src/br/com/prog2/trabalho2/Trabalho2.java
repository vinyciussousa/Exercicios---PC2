package br.com.prog2.trabalho2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Trabalho2 {

	public static void main(String[] args) {
		double salBruto;
		double salLiquido = 0;
		double salLiquidoP;
		double inss;
		double irpf = 0;
		int dependentes;
		double dDependentes;
		do {
			String leitura1 = JOptionPane.showInputDialog("Digite o salário bruto.\n(Digite 0 (zero) para sair.)\n");
			salBruto = Double.parseDouble(leitura1);
			if (salBruto == 0) {
				break;
			}
			else {
				if(salBruto <= 1751.81) {
					inss = salBruto*0.08;
				}
				else if (salBruto >= 1751.82 && salBruto <= 2919.72) {
					inss = salBruto*0.09;
				}
				else if (salBruto >= 2919.73 && salBruto <= 5839.45) {
					inss = salBruto*0.11;
				}
				else {
					inss = 642.33;
				}
				String leitura2 = JOptionPane.showInputDialog("Digite o número de dependentes.");
				dependentes = Integer.parseInt(leitura2);
				
				dDependentes = dependentes*189.59;
				
				salLiquidoP = salBruto - inss - dDependentes;
				
				if (salLiquidoP <= 1903.98) {
					salLiquido = salBruto - inss;
					dDependentes = 0;
					irpf = 0;
				}
				else if(salLiquidoP >= 1903.99 && salLiquidoP <= 2826.65) {
					irpf = ((salBruto - inss - dDependentes) * 0.075) - 142.80;
					salLiquido = salBruto - inss - irpf;
				}
				else if(salLiquidoP >= 2826.66 && salLiquidoP <= 3751.05) {
					irpf = ((salBruto - inss - dDependentes) * 0.15) - 354.80;
					salLiquido = salBruto - inss - irpf;
				}
				else if(salLiquidoP >= 3751.06 && salLiquidoP <= 4664.68) {
					irpf = ((salBruto - inss - dDependentes) * 0.225) - 636.13;
					salLiquido = salBruto - inss - irpf;
				}
				else if(salLiquidoP > 4664.68) {
					irpf = ((salBruto - inss - dDependentes) * 0.275) - 869.36;
					salLiquido = salBruto - inss - irpf;
				}
				
				DecimalFormat formatador = new DecimalFormat("0.00");
				
				JOptionPane.showMessageDialog(null, "Salário Bruto: R$"+formatador.format(salBruto)+"\n"+"Dependentes: "+dependentes+"\n"+"INSS: R$"+formatador.format(inss)+"\n"+"IRPF: R$"+formatador.format(irpf)+"\n"+"Salário Líquido: R$"+formatador.format(salLiquido)+"\n");
			}
		} while (salBruto != 0);

	}

}
