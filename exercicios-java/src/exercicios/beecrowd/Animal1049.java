package exercicios.beecrowd;

import java.util.Scanner;

public class Animal1049 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String grupo = input.next();
		String specie = input.next();
		String tipo = input.next();
		String animal = "";
		
		if (grupo.equals("vertebrado")) {
			if (specie.equals("ave")) {
				if (tipo.equals("carnivoro")) {
					animal = "aguia";
				}else if (tipo.equals("onivoro")) {
					animal = "pomba";
				}
			}else if (specie.equals("mamifero")) {
				if (tipo.equals("onivoro")) {
					animal = "homem";
				}else if (tipo.equals("herbivoro")) {
					animal = "vaca";
				}
			}
		}else if (grupo.equals("invertebrado")) {
			if (specie.equals("inseto")) {
				if (tipo.equals("hematofago")) {
					animal = "pulga";
				}else if (tipo.equals("herbivoro")) {
					animal = "lagarta";
				}
			}else if (specie.equals("anelideo")) {
				if (tipo.equals("hematofago")) {
					animal = "sanguessuga";
				}else if (tipo.equals("onivoro")) {
					animal = "minhoca";
				}
			}
		}
		
		System.out.println(animal);
		
		input.close();
	}
}
