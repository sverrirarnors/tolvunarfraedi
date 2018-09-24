/*
Ímyndið ykkur að þið séuð að fjárfesta á hlutabréfamarkaði.
Þið kaupið hlutabréf í fyrirtæki X á genginu 10 og gerið ráð fyrir því að
á hverjum degi séu 52% líkur á að gengið hækki um 1 og
48% líkur á að gengið lækki um 1 (gengið stendur aldrei í stað!).
Til að forðast of mikið tap þá ætlið þið að selja bréfin ef gengið fer niður í 5 og
til að leysa út gróða seljið þið ef bréfin ná genginu 20.
Þið viljið fá að vita hversu líklegt er að þið seljið bréfin með gróða og
hver sé líkleg útkoma ykkar að meðaltali


Java forritið Fjarfestir.java, sem fær inn heiltölurnar
upph, tap, grodi, T og kommutöluna likur og hermir hegðun hlutabréfanna þar til þið seljið þau.
(g.r.f. að tap < upph < grodi).
Forritið ykkar á að prenta út hversu hlutfallslega oft þið seljið með gróða,
meðalútkomu ykkar eftir T itranir
og hversu lengi þið eigið bréfin að meðaltali.
*/

public class FjarfestirEnar {
    public static void main(String[] args) {

		// inntaksgildin sem setja á inn

    	int upph  = Integer.parseInt(args[0]);		// Inntaksgildið upph er upphafsgengi hlutabréfanna
        int tap   = Integer.parseInt(args[1]);		// tap er gengið þegar þið seljið með tapi
        int grodi = Integer.parseInt(args[2]);		// grodi er gengið þegar þið seljið með gróða
        int T  = Integer.parseInt(args[3]);			// Inntaksbreytan T er fjöldi ítrana sem þið eigið að framkvæma til að nálga útkomuna.
    	double likur  = Double.parseDouble(args[4]);  /* Inntaksbreytan likur (0 < likur < 1)
													   inniheldur líkurnar á því að hlutabréfin hækki um 1.
													   Líkurnar á því að gengið lækki um 1 eru þá 1 − likur. */

		int dagar = 0;
		int arðgreiðslur = 0;

        // keyrsla hvern dag
        for (int t = 0; t < T; t++) {

            int stada = upph;
            while (stada > tap && stada < grodi) {
              System.out.println("Einn dagur");
                dagar++;
                if (Math.random() < likur) stada++;     // gengi hækkar um 1
                else                       stada--;     // gengi lækkar um 1
            }

            if (stada == grodi) {
            arðgreiðslur++;
            }

        }

        // print results
        System.out.println("Hlutfall sala með gróða = " + 100.0 * arðgreiðslur / T);
//        System.out.println("Meðalútkoma fjárfestis = " + ((20*(arðgreiðslur))+(5*(1.0-arðgreiðslur))) / T);
        System.out.println("Meðalfjöldi daga sem bréfin voru í eigu = " + 1.0 * dagar / T);


    }
}
