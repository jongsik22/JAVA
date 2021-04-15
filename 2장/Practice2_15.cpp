#include <iostream>
#include <string>
using namespace std;
int main() {
	char a[100];
	string A;
	int b = 0;
	int c = 0;
	while (true)
	{
		cout << "? ";
		for (int i = 0; i < 3; i++) {
			cin.getline(a, 100, ' ');
			if (i == 0)
			{
				b = atoi(a);
			}
			else if (i == 1)
			{
				A = a;
			}
			else if (i == 2)
			{
				c = atoi(a);
			}
		}
		if (A == "+")
		{
			cout << b << ' ' << A << ' ' << c << " = " << b + c << "\n";
		}
		else if (A == "-")
		{
			cout << b << ' ' << A << ' ' << c << " = " << b - c << "\n";
		}
		else if (A == "*")
		{
			cout << b << ' ' << A << ' ' << c << " = " << b * c << "\n";
		}
		else if (A == "/")
		{
			cout << b << ' ' << A << ' ' << c << " = " << b / c << "\n";
		}
		else if (A == "%")
		{
			cout << b << ' ' << A << ' ' << c << " = " << b % c << "\n";
		}
	}
}
