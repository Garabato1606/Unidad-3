
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int [10];
        for (int i = 0; i < iArreglo.length; i++) {
            iArreglo[i] = (int)(Math.random() * 100);
        }
        Imprimirarreglo(iArreglo);
        SelectionSort(iArreglo);
        Imprimirarreglo(iArreglo);
    }
    
     public static void Imprimirarreglo(int[] iArre){
        for (int i : iArre) {// FOR(INT I = ; I<IARRE.LENGTH; I++;
            System.out.print("["+ i + "]");
        }
        System.out.println("");
    }
    public static void SelectionSort (int [] iArre){
        for (int i = 0; i < iArre.length; i++) {
           int min = i ; //SIEMPRE EL PRIMER ELEMENTO ES EL MAS PEQUEÑO    
            for (int j = i + 1; j < iArre.length; j++) {
                if (iArre[j]<iArre[min]) { 
                        min=j;
                } 

            }
                //INTERCAMBIAMOS
                int temp = iArre[min];
                iArre[min]=iArre[i];
                iArre[i]=temp;
        }
    
    }
}
