public class Sorting23 {

    int [] data;
    int jumData;

    Sorting23(int Data [], int jmlData ){
        jumData=jmlData;
        data=new int[jmlData];
        for (int i = 0; i < jmlData; i++) {
            data[i]= Data[i];
        }
    }

    void bubleSort(){
        int temp = 0;
        for(int i=0; i<jumData-1; i++){
            for(int j=1; j<jumData-i; i++){
                if(data[j-1]>data[j]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    void tampil(){
        for (int i=0; i<jumData; i++){
            System.out.println(data[i]+ " ");
        }
        System.out.println();
    }
}