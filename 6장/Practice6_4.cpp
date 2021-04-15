#include <iostream>
#include <string>
using namespace std;

class myVector {
	int *mem;
	int size;
public:
	myVector(int n = 100, int val = 0);
	~myVector() { delete [] mem;}

};

myVector::myVector(int n, int val) {
	mem = new int[n];
	size = n;
	for (int i = 0; i < size; i++) {
		mem[i] = val;
		cout << mem[i] << ' ';
	}
}

int main() {
	myVector m(32, 9);
	
}