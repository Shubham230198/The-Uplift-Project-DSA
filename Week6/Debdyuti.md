## Debdyuti
Sorting Algorithms

# Selection Sort:
    void selectionSort(int arr[])
    {       
       int len = arr.length;
        for (int i = 0; i < len-1; i++)
        {
            int min = i;
            for (int j = i+1; j < len; j++)
             if (arr[j] < arr[min])
                    min = j;
 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
  
    public static void main(String args[])
    {
       
          int arr[]=new Int[];    
        Scanner input=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=input.nextInt();
        }
        
        selectionSort(arr);
         for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        }
    
     }
     
   # Insertion Sort: 
    public static void insertionSort(int arr[]) 
	{  
        int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = arr[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( arr [j] > key ) ) 
            {  
            System.out.println("Comparing "+ key  + " and " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr);
        }  
    }
    
      public static void main(String args[])
    {
       
          int arr[]=new Int[];    
        Scanner input=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=input.nextInt();
        }
        
        insertionSort(arr);
         for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        }
    
     }
     
     
     
   # Bubble Sort: 
     void bubbleSort(int arr[])
     {
     for (int i = 0; i < ( num - 1 ); i++)
     {
			for (int j = 0; j < num - i - 1; j++)
      {
				if (array[j] > array[j+1])
        {
					int swap = array[j];
					array[j]   = array[j+1];
					array[j+1] = swap;
				}
			}
		}
    }
     
       public static void main(String args[])
    {
       
          int arr[]=new Int[];    
        Scanner input=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=input.nextInt();
        }
        
        bubbleSort(arr);
         for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        }
    
     }
     
   # Merge Sort:
     
     void mergeSort(int arr[], int beg, int end)  
    {  
        int mid;  
         if(beg<end)  
        {  
        mid = (beg+end)/2;  
        mergeSort(arr,beg,mid);  
        mergeSort(arr,mid+1,end);  
        merge(arr,beg,mid,end);  
         }  
      }
      
      void merge(int arr[], int beg, int mid, int end)  
    {  
    int i=beg,j=mid+1,k,index = beg;  
    int temp[10];  
    while(i<=mid && j<=end)  
    {  
        if(arr[i]<arr[j])  
        {  
            temp[index] = arr[i];  
            i = i+1;  
        }  
        else   
        {  
            temp[index] = arr[j];  
            j = j+1;   
        }  
        index++;  
    }  
    if(i>mid)  
    {  
        while(j<=end)  
        {  
            temp[index] = arr[j];  
            index++;  
            j++;  
        }  
    }  
    else   
    {  
        while(i<=mid)  
        {  
            temp[index] = arr[i];  
            index++;  
            i++;  
        }  
    }  
    k = beg;  
    while(k<index)  
    {  
        arr[k]=temp[k];  
        k++;  
    }  
}  
     
     
     
   # QuickSort:
     
     int Partition(int A[], int n, int low, int high)
    {
    int pivot = A[high];
    int i = low - 1;
    for (int j = low; j < high; j++){
        if(A[j] < pivot){
            i++;
            swap(A[i], A[j]);
        }
    }
    i++;
    swap(A[i], A[high]);

    return i;
}

void QuickSort(int A[], int n, int low, int high){

    if(low >= high){
        return;
    }

    int Index = Partition(A, n, low, high);

    QuickSort(A, n, low, Index - 1);
    QuickSort(A, n, Index + 1, high);
}

int main()
{
    int arr[10] = {3, 12, 5, 2, 9, 1, 6, 7, 4, 8};
    int n = 10;
    int l = 0;
    int h = n - 1;

    QuickSort(arr, n, l, h);

    for (int i = 0; i < n; i++)
    {
       System.out.println(arr[i]+" ");
    }
}
    
