#include <iostream>
#include <string>
using namespace std;

class ArrayUtility2 {
public:
	static int* concat(int s1[], int s2[], int size);
	static int* remove(int s1[], int s2[], int size, int &retSize);
};

int* ArrayUtility2::concat(int s1[], int s2[], int size) {
	int *s3;
	s3 = new int[size];
	for (int i = 0; i < size / 2; i++) {
		s3[i] = s1[i];
		s3[(size / 2) + i] = s2[i];
	}
	return s3;
}
int* ArrayUtility2::remove(int s1[], int s2[], int size, int &retSize) {
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < size; j++) {
			if (s1[i] == s2[j]) {
				s1[i] = NULL;
			}
		}
	}
	for (int i = 0; i < size; i++) {
		if (s1[i] != NULL) {
			retSize++;
		}
	}
	int *s4 = new int[retSize];
	int cnt = 0;
	for (int i = 0; i < size; i++) {
		if (s1[i] != NULL) {
			s4[cnt] = s1[i];
			cnt++;
		}
	}
	return s4;
}

int main() {
	int x[5];
	int y[5];
	int retSize = 0;
	cout << "정수를 5개 입력하라. 배열 x에 삽입한다>>";
	for (int i = 0; i < 5; i++) {
		cin >> x[i];
	}
	cout << "정수를 5개 입력하라. 배열 y에 삽입한다>>";
	for (int i = 0; i < 5; i++) {
		cin >> y[i];
	}
	int *p = ArrayUtility2::concat(x, y, 10);
	cout << "합친 정수 배열을 출력한다." << endl;
	for (int i = 0; i < 10; i++) {
		cout << p[i] << ' ';
	}
	cout << endl;
	int *p1 = ArrayUtility2::remove(x, y, 5, retSize);
	cout << "배열 x[]에서 y[]를 뺀 결과를 출력한다 개수는 " << retSize << endl;
	for (int i = 0; i < retSize; i++) {
		cout << p1[i] << ' ';
	}
}