#include <iostream>
#include <string>
using namespace std;

class Date {
	int year;
	int month;
	int day;
	string Y;
	string M;
	string D;
public:
	Date();
	Date(int y, int m, int d);
	Date(string s);
	int getYear();
	int getMonth();
	int getDay();
	void show();
};
Date::Date(int y, int m, int d) {
	year = y;
	month = m;
	day = d;
}
Date::Date(string s) {
	int cnt = 0;
	for (int i = 0; i < s.length(); i++) {
		if (s[i] != '/') {
			if (cnt == 0) {
				Y += s[i];
				year = stoi(Y);
			}
			if (cnt == 1) {
				M += s[i];
				month = stoi(M);
			}
			if (cnt == 2) {
				D += s[i];
				day = stoi(D);
			}
		}
		else {
			cnt++;
		}
	}
}
int Date::getYear() {
	return year;
}
int Date::getMonth() {
	return month;
}
int Date::getDay() {
	return day;
}
void Date::show() {
	cout << year << "³â" << month << "¿ù" << day << "ÀÏ" << endl;
}
int main() {
	Date birth(2014, 3, 20);
	Date independenceDay("1111/2/33");
	independenceDay.show();
	cout << birth.getYear() << ',' << birth.getMonth() << ',' << birth.getDay() << endl;
}