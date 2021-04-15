#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "문자열 입력 : ";
	string s;
	getline(cin, s);
	int sum = 0;
	int a = -1;
	while (true) {
		a = s.find('a', a + 1);
		if (a == -1) {
			break;
		}
		sum++;
	}
	cout << "문자 a는 " << sum << "개";
}