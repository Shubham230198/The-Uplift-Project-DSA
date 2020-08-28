# Ananya Chaurasia
Sorting Alogorithms

## 1.Selection Sort
###### Sorted in ascending order

#include <bits/stdc++.h>
using namespace std;

void selection_sort(int a[],int n){
    for(int i=0;i<n-1;i++){
        int min_index=i;
         for(int j=i+1;j<=(n-1);j++){
             if(a[j]<a[min_index]){
                 min_index=j;
                }
              
            }
            swap(a[i],a[min_index]);
        } 
        
   }

int main()
{
   int n;
   cin>>n;
   int a[n];
   for(int i=0;i<n;i++){
        cin>>a[i];
    }
   
   selection_sort(a,n);
   
   for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
   

    return 0;
}

## 2.Bubble Sort
###### Sorted in ascending order

#include <bits/stdc++.h>
using namespace std;

void bubble_sort(int a[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<(n-1-i);j++){
            if(a[j]>a[j+1]){
                swap(a[j],a[j+1]);
            }
        }
    }
}

int main()
{
   int n;
   cin>>n;
   int a[n];
   for(int i=0;i<n;i++){
        cin>>a[i];
    }
   
   bubble_sort(a,n);
   
   for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
   

    return 0;
}


## 3.Insertion Sort
###### Sorted in ascending order

#include <bits/stdc++.h>
using namespace std;

void insertion_sort(int a[],int n){
    for(int i=1;i<n;i++){
        int temp = a[i];
        int j=(i-1);
        while(j>=0 && a[j]>temp){
            a[j+1]=a[j];
            j--;
        }
       a[j+1]=temp;
    }
}

int main()
{
   int n;
   cin>>n;
   int a[n];
   for(int i=0;i<n;i++){
        cin>>a[i];
    }
   
   insertion_sort(a,n);
   
   for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
   

    return 0;
}


## Merge Sort

#include<bits/stdc++.h>
using namespace std;

void merge(int*a,int s,int e){
    int mid=(s+e)/2;
    int i=s;
    int j=mid+1;
    int k=s;
    
    int temp[100];
    while(i<=mid && j<=e){
        if(a[i] < a[j]){
            temp[k]=a[i];
            i++;
            k++;
        }
        else{
            temp[k]=a[j];
            k++;
            j++;
        }
    }
    
     while(i<=mid){
        temp[k]=a[i];
        k++;
        i++;
     }
     
     while(j<=e){
         temp[k]=a[j];
         k++;
         j++;
     }
     
    for(int i=0;i<k;i++){
        a[i]=temp[i];
    } 
  
 }
 
 void mergesort(int *a,int s,int e){
     if(s>=e){
        return; 
     }
     
     int mid =(s+e)/2;
     mergesort(a,s,mid);
     mergesort(a,mid+1,e);
     merge(a,s,e);
 }

int main() {
  int n;
  cin>>n;
  int a[10000];
   for(int i=0;i<n;i++){
       cin>>a[i];
   }
  
   mergesort(a,0,n-1);
   
   for(int i=0;i<n;i++){
       cout<<a[i]<<" ";
   }
	return 0;
}

## Quick Sort

#include<bits/stdc++.h>
using namespace std;

void swap(int* a, int* b) 
{ 
	int t = *a; 
	*a = *b; 
	*b = t; 
} 

int partition (int arr[], int low, int high) 
{ 
	int pivot = arr[high]; // pivot 
	int i = (low - 1); // Index of smaller element 

	for (int j = low; j <= high - 1; j++) 
	{ 
		
		if (arr[j] < pivot) 
		{ 
			i++;
			swap(&arr[i], &arr[j]); 
		} 
	} 
	swap(&arr[i + 1], &arr[high]); 
	return (i + 1); 
} 


void quickSort(int arr[], int low, int high) 
{ 
	if (low < high) 
	{ 
	
		int pi = partition(arr, low, high); 
		quickSort(arr, low, pi - 1); 
		quickSort(arr, pi + 1, high); 
	} 
} 

void printArray(int arr[], int size) 
{ 
	int i; 
	for (i = 0; i < size; i++) 
		cout << arr[i] << " "; 
	cout << endl; 
} 

int main() 
{ 
	int arr[] = {10, 7, 8, 9, 1, 5}; 
	int n = sizeof(arr) / sizeof(arr[0]); 
	quickSort(arr, 0, n - 1); 
	printArray(arr, n); 
	return 0; 
} 

