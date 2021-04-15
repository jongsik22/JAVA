#include <iostream>
using namespace std;

class Container {
	int size;
public:
	Container() { size = 10; }
	void fill();
	void consume();
	int getSize();
};

void Container::fill() {
	size = 10;
}
void Container::consume() {
	size -= 1;
}
int Container::getSize() {
	return size;
}

class CoffeeVendingMachine {
	Container tong[3];
	// 커피, 물, 설탕
	void fill();
	void selectEspresso();
	void selectAmericano();
	void selectSugarCoffee();
	void show();
public:
	void run();
};

void CoffeeVendingMachine::fill() {
	for (int i = 0; i < 3; i++)	{
		tong[i].fill();
	}
	show();
}
void CoffeeVendingMachine::selectEspresso() {
	tong[0].consume();
	tong[1].consume();
}
void CoffeeVendingMachine::selectAmericano() {
	tong[0].consume();
	tong[1].consume();
	tong[1].consume();
}
void CoffeeVendingMachine::selectSugarCoffee() {
	tong[0].consume();
	tong[1].consume();
	tong[1].consume();
	tong[2].consume();
}
void CoffeeVendingMachine::show() {
	cout << "커피 " << tong[0].getSize() << ", 물 " << tong[1].getSize() << ", 설탕 " << tong[2].getSize() << endl;
}
void CoffeeVendingMachine::run() {
	int n;
	cout << "***** 커피자판기를 작동합니다.*****" << endl;
	while (true) {
		cout << "메뉴를 눌러주세요(1 : 에스프레소, 2 : 아메리카노, 3 : 설탕커피, 4 : 잔량보기, 5 : 채우기)>>";
		cin >> n;
		if (n == 1) {
			if (tong[0].getSize() >= 1 && tong[1].getSize() >= 1) {
				selectEspresso();
				cout << "에스프레소 드세요." << endl;
			}
			else {
				cout << "원료가 부족합니다." << endl;
			}
		}
		else if (n == 2) {
			if (tong[0].getSize() >= 1 && tong[1].getSize() >= 2) {
				selectAmericano();
				cout << "아메리카노 드세요." << endl;
			}
			else {
				cout << "원료가 부족합니다." << endl;
			}
		}
		else if (n == 3) {
			if (tong[0].getSize() >= 1 && tong[1].getSize() >= 1 && tong[2].getSize() >= 1) {
				selectSugarCoffee();
				cout << "설탕커피 드세요." << endl;
			}
			else {
				cout << "원료가 부족합니다." << endl;
			}
		}
		else if (n == 4) {
			show();
		}
		else if (n == 5) {
			fill();
		}
	}
}

int main() {
	CoffeeVendingMachine c;
	c.run();
}