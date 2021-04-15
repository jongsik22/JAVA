#include <iostream>
using namespace std;

int main() {
	int a;
	int b;
	cout << "*******************************************\n";
	while (true) {
		cout << "짬뽕 : 1, 짜장 : 2, 군만두 : 3, 종료 : 4 >> ";
		cin >> a;
		if (a <= 3 && a >= 1) {
			cout << "몇인분? ";
			cin >> b;
			if (a == 1)
			{
				cout << "짬뽕 " << b << "인분 나왔습니다.\n";
			}
			else if (a == 2)
			{
				cout << "짜장 " << b << "인분 나왔습니다.\n";
			}
			else if (a == 3)
			{
				cout << "군만두 " << b << "인분 나왔습니다.\n";
			}
		}
		else if (a == 4)
		{
			cout << "오늘 영업은 끝났습니다. ";
			break;
		}
		else {
			cout << "다시 주문하세요.\n";
		}
		
	}
}