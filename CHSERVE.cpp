#include<bits/stdc++.h>

using namespace std;

int main(){
	long long int T;
	cin>>T;
	while(T--){
		long long int P1, P2, K;
		cin>>P1>>P2>>K;
		long long int sum = P2 + P1;
		long long int div = sum/K;
		if(div%2==0){
			cout<<"CHEF"<<endl;
		}
		else
			cout<<"COOK"<<endl;
	}
}
