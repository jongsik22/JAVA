#include <iostream>
#include <cstring>
using namespace std;
int main() {
	cout << "에스프레소 2000원, 아메리카노 2300원, 카푸치노 2500원입니다.\n";
	char a[100]; //종류
	int b; //개수
	int c; //가격
	int sum = 0; //매출
	while (true) {
		cout << "주문 >> ";
		cin >> a >> b;
		if (strcmp(a, "에스프레소") == 0) {
			c = 2000 * b;
			cout << 2000 * b << "원 입니다.\n";
			sum += c;
		}
		else if (strcmp(a, "아메리카노") == 0) {
			c = 2300 * b;
			cout << 2300 * b << "원 입니다.\n";
			sum += c;
		}
		else if (strcmp(a, "카푸치노") == 0) {
			c = 2500 * b;
			cout << 2500 * b << "원 입니다.\n";
			sum += c;
		}
		else {
			cout << "다시 주문해 주세요.\n";
		}
		if (sum >= 20000)
		{
			cout << "오늘은 " << sum << "원을 판매하여 카페를 닫습니다.";
			break;
		}
	}
}