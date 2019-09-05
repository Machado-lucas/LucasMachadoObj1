package br.edu.ifsul.control;

import br.edu.ifsul.model.Socio;

import java.util.*;


public class SocioApp {

    public static void main(String[] args) {
        Socio socio1 = new Socio();
        Socio socio2 = new Socio();

        Socio socio3 = new Socio(3, "Roberto", "Silveira", "rbt@gmail.com", 3);
        Socio socio4 = new Socio(4, "Jubileu", "Jubileia", "jbl@gmail.com", 10);

        Socio socio5 = new Socio(5, "Felipe");
        Socio socio6 = new Socio(6 , "Joao");

        System.out.println(socio1);
        System.out.println(socio2);
        System.out.println(socio3);
        System.out.println(socio4);
        System.out.println(socio5);
        System.out.println(socio6);

        socio1.setId(1);
        socio1.setNome("Lucas");
        socio1.setSobrenome("Machado");
        socio1.setEmail("12@11");
        socio1.setNumDependentes(1);

        System.out.println(socio1.getId());
        System.out.println(socio1.getNome());
        System.out.println(socio1.getSobrenome());
        System.out.println(socio1.getEmail());
        System.out.println(socio1.getNumDependentes());

        socio2.setId(2);
        socio2.setNome("Maria");
        socio2.setSobrenome("Joaquina");
        socio2.setEmail("30@11");
        socio2.setNumDependentes(2);

        System.out.println(socio2.getId());
        System.out.println(socio2.getNome());
        System.out.println(socio2.getSobrenome());
        System.out.println(socio2.getEmail());
        System.out.println(socio2.getNumDependentes());

        List<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        socios.add(socio5);
        socios.add(socio6);

        for (int i = 0; i < socios.size(); i++){
            if(socios.get(i).getId() == 2){
                System.out.println("Socio com id = 2:");
                System.out.println(socios.get(i));
            }
            System.out.println(socios.get(i));
        }

        List<Socio> sociosReverso = socios;
        Collections.reverse(sociosReverso);

        for (int i = 0; i < sociosReverso.size(); i++){
            System.out.println(sociosReverso.get(i));
        }

        Map<Integer, Socio>socioMap = new HashMap<>();
        socioMap.put(socio1.hashCode(), socio1);
        socioMap.put(socio2.hashCode(), socio2);
        socioMap.put(socio3.hashCode(), socio3);
        socioMap.put(socio4.hashCode(), socio4);
        socioMap.put(socio5.hashCode(), socio5);
        socioMap.put(socio6.hashCode(), socio6);

        System.out.println(socioMap);

    }

}
