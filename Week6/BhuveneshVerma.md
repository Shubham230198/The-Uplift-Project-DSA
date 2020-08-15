## Bhuvenesh Verma
Sorting Alogorithms

  ## Selection Sort
  ```  
  #include<bits/stdc++.h>
  using namespace std;

  void SelectionSort(int A[], int n){
      for (int i = 0; i < n - 1; i++){ //outer loop for number of passes
          int j, k;
          for (j = k = i; j < n; j++){ // inner loop for comparisons
              if(A[j] < A[k]){
                  k = j;
              }
          }
          swap(A[i], A[k]);
      }
  }

  int main(){
      int arr[10] = {3, 12, 5, 2, 9, 1, 6, 7, 4, 8};
      int n = 10;

      SelectionSort(arr, n);

      for (int i = 0; i < n; i++){
          cout << arr[i] << " ";
      }
  }
  ```
----------------------------------------------------------------------------------------------------------------------------------------------------------- 
  ## Bubble Sort
  ```
  #include <bits/stdc++.h>
  using namespace std;

  void BubbleSort(int A[], int n)
  {
      for (int i = 0; i < n - 1; i++)
      { //outer loop for number of passes
          for (int j = 0; j < n - i -1; j++)
          { // inner loop for comparisons
              if (A[j] > A[j+1])
              {
                  swap(A[j], A[j + 1]);
              }
          }
      }
  }

  int main()
  {
      int arr[10] = {3, 12, 5, 2, 9, 1, 6, 7, 4, 8};
      int n = 10;

       BubbleSort(arr, n);

      for (int i = 0; i < n; i++)
      {
          cout << arr[i] << " ";
      }
  }
  ```
----------------------------------------------------------------------------------------------------------------------------------------------------------- 
  ## Insertion Sort
  ```
  #include <bits/stdc++.h>
  using namespace std;

  void InsertionSort(int A[], int n){
      for (int i = 1; i < n; i++){
          int item = A[i];
          int j = i - 1;

          while (A[j] > item && j >= 0){
              A[j + 1] = A[j];
              j = j - 1;
          }
          A[j + 1] = item;
      }
  }

  int main()
  {
      int arr[10] = {3, 12, 5, 2, 9, 1, 6, 7, 4, 8};
      int n = 10;

      InsertionSort(arr, n);

      for (int i = 0; i < n; i++)
      {
          cout << arr[i] << " ";
      }
  }
  ```
----------------------------------------------------------------------------------------------------------------------------------------------------------- 
  ## QuickSort
  ```
  #include <bits/stdc++.h>
  using namespace std;

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
          cout << arr[i] << " ";
      }
  }
  ```
----------------------------------------------------------------------------------------------------------------------------------------------------------- 
  ## MergeSort
  ```
  #include <bits/stdc++.h>
  using namespace std;

  void merge(int A[], int mid, int low, int high){
      int i = low, j = mid + 1, k = low;
      int res[high + 1];

      while(i <= mid && j <= high){
          if(A[i] < A[j]){
              res[k++] = A[i++];
          }
          else{
              res[k++] = A[j++];
          }
      }

      while(i <= mid){
          res[k++] = A[i++];
      }
      while (j <= high){
          res[k++] = A[j++];
      }

      for (int i = low; i <= high; i++){
          A[i] = res[i];
      }
  }

  void MergeSort(int A[], int low, int high){
      int mid;

      if(low < high){
          mid = (low + high) / 2;
          MergeSort(A, low, mid);
          MergeSort(A, mid + 1, high);
          merge(A, mid, low, high);
      }
  }

  int main()
  {
      int arr[10] = {3, 12, 5, 2, 9, 1, 6, 7, 4, 8};
      int n = 10;
      int l = 0;
      int h = n - 1;

      MergeSort(arr, l, h);

      for (int i = 0; i < n; i++)
      {
          cout << arr[i] << " ";
      }
  }
  ```
