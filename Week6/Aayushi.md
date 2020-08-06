## Aayushi
Sorting Algorithms.

## Selection sort

void selection_sort(int a[],int n)

{
   
   int minIdx;
   
   for(int i=0;i<n-1;i++)
   
   {
	
  minIdx=0;
	
  for(int j=i+1;j<n;j++)
	
  {
	   
     if(a[j]<arr[minIdx])
	   
     {
		
    minIdx=j;
	   
     }
	   
	   swap(a[minIdx],a[i]);
   
   }

}

## Bubble sort

void bubble_sort(int a[],int n)

{
   
   for(int i=0;i<n-1;i++)
   
   {
	
  for(int j=0;j<n-i-1;j++)
	
  {
	   
     if(a[j]>a[j+1])
	   
     {
	      
        swap(a[j],a[j+1]);
	  
    }
	
  }
    
    }

}

## Insertion sort

void insertion_sort(int a[],int n)

{

for(int i=1;i<n;i++)

{

int key=a[i];

int j=i-1;

while(j>=0 && a[j]>key)

{

a[j+1]=a[j];

j--;

}

a[j+1]=key;

}

}

## Merge sort

void merge(int a[],int low,int mid,int high)

{
  
  int n1=mid-low+1;
  
  int n2=high-mid;
  
  int temp1[n1],temp2[n2];
  
  for(int i=0;i<n1;i++)
  
  {
    
    temp1[i]=a[low+i];
 
 }
  
  for(int j=0;j<n2;j++)
  
  {
     
     temp2[j]=a[mid+1+j];
  
  }
  
  int i=0;
  
  int j=0;
  
  int k=low;
  
  while(i<n1 && j<n2)
  
  {
    
    if(temp1[i]<temp2[i]){
    
    a[i]=temp1[i];
    
    i++;
    
  }
  
  else {
      a[k]=temp2[j];
      
      j++;
   }
   
   k++;
 }
 
 while (i < n1) { 
        
    arr[k] = L[i]; 
        
    i++; 
       
    k++; 
    
 } 
  
 while (j < n2) { 
        
    arr[k] = R[j]; 
        
    j++; 
        
    k++; 
    
    }

}
void merge_sort(int a[],int low,int high)
{
   int mid=(low+high)/2;
   merge_sort(a,0,mid);
   merge_sort(a,mid+1,high);
   merge(a,l,mid,high);
}

## Quick Sort

int partition(int a[],int low,int high){

int pivot=a[high];

int i=low-1;

for(int j=low;j<high;j--){
  
  if(ar[j]<pivot){
    
    i++;
    
    int temp=a[i];
    
    a[i]=a[j];
    
    a[j]=temp;
  
  }

}

i++;

int temp=a[i];

a[i]=a[high];

a[high]=temp;

return i;

}


void sort(int a[],int low,int high){

if(low>=high){

return;

}

int pIdx=partition(a,low,high);

sort(a,low,pIdx-1);

sort(a,pIdx+1,high);

}
