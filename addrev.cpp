#include<bits/stdc++.h>

using namespace std;

int reverse(int n){
	int rev = 0;
	while(n){
		rev = rev * 10 + n%10;
		n/=10;
	}
	return rev;
}
int main(){
	int T;
	std::cin>>T;
	while(T--){
		int a; int b;
		std::cin>>a>>b;
		int add = reverse(a) + reverse(b);
		add = reverse(add);
		std::cout<<add<<endl;
	}
}
