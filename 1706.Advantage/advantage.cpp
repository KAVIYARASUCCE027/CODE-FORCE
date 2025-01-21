#include<bits/stdc++.h>

int main(){
    int t;
    int n;
    cin>>t;
    while(t--){
        cin>>n;
        vector<int> vec(n);
        int max1=INT_MIN,max2=INT_MIN;
        int maxindex=-1;
        for(int i=0;i<n;i++){
            cin>>vec[i];
            if(vec[i]>max1){
                max2=max1;
                max1=vec[i];
                maxindex=i;
            }
            else if(vec[i]>max2){
                max2=vec[i];
            }
        }
        
        
        for(int j=0;j<n;j++){
            if(j==maxindex){
                cout<< vec[j]-max2 <<" ";
            }
            else{
                cout<< vec[i]-max1 <<" ";
            }
        }
        
    }
}