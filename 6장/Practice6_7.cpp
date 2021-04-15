#include <iostream>
#include <string>
#include <ctime>
#include <cstdlib>
using namespace std;
class Random {
public:
	static void seed() { srand((unsigned)time(0)); }
	static int nextInt(int min = 0, int max = 32767);
	static char nextAlphabet();
	static double nextDouble();
};
int Random::nextInt(int min, int max) {
	int n;
	while (true) {
		n = rand();
		if (n >= min && n <= max) {
			break;
		}
	}
	return n;
}
char Random::nextAlphabet() {
	char c;
	while (true) {
		c = rand();
		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			break;
		}
	}
	return c;
}
double Random::nextDouble() {
	double a, b, d;
	while (true) {
		a = rand();
		b = rand();
		d = a / b;
		if (d > 0 && d < 1) {
			break;
		}
	}
	return d;
}
int main() {
	srand((unsigned)time(0));
	cout << "1에서 100까지 랜덤한 정수 10개를 출력합니다." << endl;
	for (int i = 0; i < 10; i++) {
		cout << Random::nextInt(1,100) << ' ';
	}
	cout << endl;
	cout << "알파벳을 랜덤하게 10개를 출력합니다." << endl;
	for (int i = 0; i < 10; i++) {
		cout << Random::nextAlphabet() << ' ';
	}
	cout << endl;
	cout << "랜덤한 실수를 10개를 출력합니다." << endl;
	for (int i = 0; i < 10; i++) {
		cout << Random::nextDouble() << ' ';
	}
	cout << endl;
}