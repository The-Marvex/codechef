#include<bits/stdc++.h>

using namespace std;

bool prime(int n){
	if (n <= 1)  
		return false;
    if (n <= 3)  
    	return true;

    if (n%2 == 0 || n%3 == 0) 
    	return false;
 
    for (int i=5; i*i<=n; i=i+6)
        if (n%i == 0 || n%(i+2) == 0)
           return false;
 
    return true;
}
int main(){
	int T;
	std::cin>>T;
	while(T--){
		int a; int b;
		std::cin>>a>>b;
		for (int i = a; i <= b; ++i)
		{
			if(prime(i))
				std::cout<<i<<endl;
		}
		std::cout<<endl;
	}
}
