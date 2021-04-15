#include <iostream>
using namespace std;

int main() {
	cout << "정수 5개 입력 : ";
	int *a = new int[5];
	double sum = 0;
	for (int i = 0; i < 5; i++) {
		cin >> a[i];
		sum += a[i];
	}
	double avg = sum / 5;
	cout << "평균 : " << avg << endl;
}