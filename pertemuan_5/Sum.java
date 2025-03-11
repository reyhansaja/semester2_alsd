public class Sum {
    double keuntungan[];

    Sum(int el){
        keuntungan =  new double[el];
    }

    double TotalBF(){
        double total = 0;
        for (int i=0; i<keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double TotalDC(double arr[], int l, int r){
        if (l == r) {
            return arr[l];
        }

        int mid = (l+r)/2;
        double lsum = TotalDC(arr, l, mid);
        double rsum = TotalDC(arr, mid+1, r);
        return lsum+rsum;
    }
}
