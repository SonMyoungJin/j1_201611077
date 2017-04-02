package com.sd.sort.v0;

public class SorterMainV0 {
  
  public static void main(String[] args) {
    String[] dataSt={"John","Adam", "Skrien","Smith","Jones"};
    sort(dataSt);
    
    Integer[] dataIn={new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    sort(dataIn);
    
    for(int i=0;i<dataSt.length;i++) {
      System.out.println("dataSt["+i+"]="+dataSt[i]);
    }
    
    for(int i=0;i<dataIn.length;i++) {
      System.out.println("dataIn["+i+"]="+dataIn[i]);
    }
  }
  
  public static void sort(Integer[] data){
    
    for(int i=data.length-1;i>=0;i--) {
      int indexOfMax=0;
      for(int j=1;j<=i;j++) {
        if(data[j]>data[indexOfMax]) {
        indexOfMax=j;
        }
        Integer temp=data[i];
        data[i]=data[indexOfMax];
        data[indexOfMax]=temp;
      }
    }
    
    
  }
  public static void sort(String[] data){
    
    for(int i=data.length-1;i>=0;i--) {
      int indexOfMax=0;
      for(int j=1;j<=i;j++) {
        if(data[j].compareTo(data[indexOfMax])>0) {
          indexOfMax=j;
        }
        String temp=data[i];
        data[i]=data[indexOfMax];
        data[indexOfMax]=temp;
      }
    }
  }
}