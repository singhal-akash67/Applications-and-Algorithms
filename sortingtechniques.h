#ifndef sorting_h
#define sorting_h
void insertionsort(int *array,int n)
{
    for(int i=1;i<n;i++)
    {
        for(int j=i;j>0;j--)
        {
            if(array[j]<array[j-1])
                swap(array[j],array[j-1]);
            else
                break;
        }
    }
    return;
}
void bubblesort(int *array,int n)
{
    for(int i=0;i<n;i++)
    {
        bool y=true;
        for(int j=0;j<n;j++)
        {
            if(array[j]>array[j+1])
            {
                swap(array[j],array[j+1]);
                y=false;
            }
        }
        if(y==true)
            return;
    }
    return;

}
void selectionsort(int *array,int n)
{
    for(int i=0;i<n-1;i++)
    {
        int min=array[i];
        int minindex=i;
        for(int j=i+1;j<n;j++)
        {
            if(array[j]<min)
            {
                min=array[j];
                minindex=j;
            }
        }
        array[minindex]=array[i];
        array[i]=min;
    }
    return;
}
void quicksort(int *array,int end,int start=0)
{
    if(start>=end-1)
        return;
    int pivot=end-1;
    int changed=pivot;
    for(int i=start;i<pivot;i++)
    {
        if(array[i]>array[pivot])
        {
            if(changed==pivot)
                changed=i;
        }
        else if(array[i]<array[pivot]&&changed!=pivot)
        {
            swap(array[i],array[changed]);
            changed++;
        }
    }
    swap(array[pivot],array[changed]);
    quicksort(array,changed);
    quicksort(array,end,changed+1);
}
void merge(int *array,int start,int mid,int end)
{
    int n=mid-start+1;
    int m=end-mid;
    int *array1=new int[n];
    int *array2=new int[m];
    for(int i=0,j=start;i<n;i++,j++)
    {
        array1[i]=array[j];
    }
    for(int i=0,j=mid+1;i<m;i++,j++)
    {
        array2[i]=array[j];
    }
    for(int i=start,j=0,k=0;i<=end;i++)
    {
        if(j<n&&k<m)
        {
            if(array1[j]<array2[k])
            {
                array[i]=array1[j];
                j++;
            }
            else
            {
                array[i]=array2[k];
                k++;

            }
        }
        else
        {
            if(j==n)
            {
                array[i]=array2[k];
                k++;
            }
            else
            {
                array[i]=array1[j];
                j++;
            }

        }
    }
    delete array1,array2;
}
void mergesort(int *array,int end,int start=0)
{
    if(start>=end-1)
        return;
    int mid=(start+end-1)/2;
    mergesort(array,mid);
    mergesort(array,end,mid+1);
    merge(array,start,mid,end-1);
}
void maxheapify(int *array,int index,int n)
{
    int left=index*2+1;
    int right=index*2+2;
    int greater=index;
    if(left<=n&&array[left]>array[greater])
        greater=left;
    if(right<=n&&array[right]>array[greater])
        greater=right;
    if(index!=greater)
    {
        swap(array[index],array[greater]);
        maxheapify(array,greater,n);
    }
    else
        return;
}
void buildheap(int *array,int n)
{
    for(int i=n/2;i>=0;i--)
    {
        maxheapify(array,i,n);
    }
}
void helperfunctionforheapsort(int *array,int n)
{
    for(int temp=n;temp>0;)
    {
        swap(array[0],array[temp]);
        temp--;
        maxheapify(array,0,temp);
    }
}
void heapsort(int *array,int n)
{
    buildheap(array,n-1);
    helperfunctionforheapsort(array,n-1);

}
#endif // sorting_h
