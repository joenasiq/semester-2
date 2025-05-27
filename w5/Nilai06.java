package w5;

public class Nilai06 {
    int nilaiTertinggiDC(int[] arr,int l,int r) {
        if (l==r) {
            return l;
        }
        int mid=(l+r)/2;
        int maxL=nilaiTertinggiDC(arr,l,mid);
        int maxR = nilaiTertinggiDC(arr,mid+1,r);
        return(arr[maxL]>arr[maxR]) ? maxL:maxR;
    }
    int nilaiTerendahDC(int[] arr,int l,int r) {
        if (l==r) {
            return l;
        }
        int mid=(l+r)/2;
        int minL=nilaiTerendahDC(arr,l,mid);
        int minR=nilaiTerendahDC(arr,mid+1,r);
        return(arr[minL]<arr[minR]) ? minL:minR;
    }
    double rataUASBF(int[] arr) {
        int total=0;
        for (int nilai:arr) {
            total+=nilai;
        }
        return(double)total/arr.length;
    }
}