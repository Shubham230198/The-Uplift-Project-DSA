## Sneha
Sorting Alogorithms


## SELECTION SORT 
```
#include <iostream>
#include <vector>
using namespace std;
int main() {
  int n;
  int temp = 0;
  vector<int> v;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int x;
    cin>>x;
    v.push_back(x);
  }
  
  for(int i=0;i<n;i++)
  { int min = i;
    for(int j=i+1;j<n;j++)
    {
      if(v[j]<v[min])
      {
        min = j;
      }
    }
    temp = v[i];
    v[i] = v[min];
    v[min] = temp;

  }
  cout<<"Selection Sort: ";
  for(int i=0;i<n;i++)
  {
    cout<<v[i]<<" ";
  }
  return 0;
}
```

## BUBBLE SORT
```
#include <iostream>
#include <vector>
using namespace std;
int main() {
  int n;
  int temp = 0;
  vector<int> v;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int x;
    cin>>x;
    v.push_back(x);
  }
  
  for(int i=0;i<n;i++)
  { 
    for(int j=0;j<n-i-1;j++)
    {
      if(v[j]>v[j+1])
      {
       temp = v[j];
       v[j] = v[j+1];
       v[j+1] = temp;
      }
    }
   

  }
  cout<<"Bubble Sort: ";
  for(int i=0;i<n;i++)
  {
    cout<<v[i]<<" ";
  }
  return 0;
}
```

## INSERTION SORT
```
#include <iostream>
#include <vector>
using namespace std;
int main() {
  int n;
  int temp = 0;
  vector<int> v;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int x;
    cin>>x;
    v.push_back(x);
  }
   int key,j ;
  for(int i=1;i<n;i++)
  { 
    key = v[i];
    j = i-1;

   while(j>=0 && v[j]>key)
   {
     v[j+1]=v[j];
     j = j-1;
   }
   v[j+1]= key;

  }
  cout<<"Insertion Sort: ";
  for(int i=0;i<n;i++)
  {
    cout<<v[i]<<" ";
  }
  return 0;
}
```


## MERGE SORT
```
#include <iostream>
#include <vector>
using namespace std;
void print(vector<int> v)
{
  for(int i = 0; i < v.size(); i++) cout << v[i] << " ";
  cout << endl;
}

vector<int> merge(vector<int> left, vector<int> right)
{
   vector<int> result;
   while ((int)left.size() > 0 || (int)right.size() > 0) {
      if ((int)left.size() > 0 && (int)right.size() > 0) {
         if ((int)left.front() <= (int)right.front()) {
            result.push_back((int)left.front());
            left.erase(left.begin());
         }
   else {
            result.push_back((int)right.front());
            right.erase(right.begin());
         }
      }  else if ((int)left.size() > 0) {
            for (int i = 0; i < (int)left.size(); i++)
               result.push_back(left[i]);
            break;
      }  else if ((int)right.size() > 0) {
            for (int i = 0; i < (int)right.size(); i++)
               result.push_back(right[i]);
            break;
      }
   }
   return result;
}

vector<int> mergeSort(vector<int> m)
{
   if (m.size() <= 1)
      return m;

   vector<int> left, right, result;
   int middle = ((int)m.size()+ 1) / 2;

   for (int i = 0; i < middle; i++) {
      left.push_back(m[i]);
   }

   for (int i = middle; i < (int)m.size(); i++) {
      right.push_back(m[i]);
   }

   left = mergeSort(left);
   right = mergeSort(right);
   result = merge(left, right);

   return result;
}
  int main() {
  int n;
  int temp = 0;
  vector<int> v;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int x;
    cin>>x;
    v.push_back(x);
  }

 v= mergeSort(v);
 cout<<"Merge Sort: ";

 print(v);
  return 0;
}
```

## QUICK SORT
```
#include <iostream>
#include <vector>
using namespace std;

int partition(int A[],int low, int high)
{
  int temp = 0;
  int pivot = A[high];
  int i = low -1;

  for(int j = low; j<high; j++)
  {
    if(A[j]<pivot)
    {
      i++;
      temp = A[i];
      A[i] = A[j];
      A[j] = temp;

    }

  }
      temp = A[i+1];
      A[i+1] = A[high];
      A[high] = temp;
      return i+1;
}	
void quicksort(int A[],int low, int high)
{
 if(low<high)
 { int p = partition(A,low, high);

  quicksort(A, low,p-1);
  quicksort(A, p+1, high);}

}
int main() {
  int n;
  int temp = 0;
  cin>>n;
  int *A =NULL;
  A = new int[n];
  for(int i=0;i<n;i++)
  {
    cin>>A[i];
  }
  quicksort(A,0,n-1);
  cout<<"Quick Sort: ";
  for(int i=0;i<n;i++)
  {
    cout<<A[i]<<" ";
  }
  return 0;
}
```