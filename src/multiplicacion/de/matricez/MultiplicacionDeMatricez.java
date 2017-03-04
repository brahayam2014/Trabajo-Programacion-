
package multiplicacion.de.matricez;

//@BRAHAYAM CARDENAS CARDENAS 



import java.util.Scanner; // para la lectura de datos 



public  class MultiplicacionDeMatricez {

   public static void main(String[] args) {
        
      Scanner ac =new Scanner(System.in);
      System.out.print("ingrese el numero de filas  de la  matriz a");
      int m=ac.nextInt();
      System.out.print("ingrese el nuemro de columnas  matriz a");
      int n=ac.nextInt();
      System.out.print("ingrese el numero de columnas  matriz b");
      int p=ac.nextInt();
      
      // no solicite al usuario el numero de filas de la matriz (b) por que tiene que ser el mismo
      // que el nuemro de columnas de la matriz (a) PARA PODER SER MULTIPLICADAS!!
      
       int ma[][]=new int[m][n]; 
       int mb[][]=new int[n][p]; 
       
       int mc[][]=new int[m][p]; 
      
      //matriz a llena la matriz
      
      
       
      
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              ma[i][j]=(i+1)*j;
              
          }
      }
      
      //matriz b llena la matriz
      
      for(int i=0;i<n;i++){
          for(int j=0;j<p;j++){
              mb[i][j]=(j+1)*i;
          }                                             //m=filas a
      }                                                 //n=columnas a
                                                       //p =columnas b
      //matriz c multiplica las matricez
      
      for(int i=0;i<m;i++){
          for(int j=0;j<p;j++){
              for(int k=0;k<n;k++){
                  mc[i][j]+=ma[i][k]*mb[k][j];
              }
          }
     }     
       
      //mostramos las matrices a,b,c
      
      
      System.out.println("Matriz A");
      show (ma,m,n);
      
      System.out.println("Matriz B");
      show (mb,n,p);
      
      System.out.println("Matruiz C");
      show (mc,m,p);
      
     
     
}
      
    public static void show (int m[][],int f,int c){
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
        
        
        
    

   

   
       
     
      
      
    
    





