#include <iostream>
#include <string>
using namespace std;

int main() {
	string s, find, repl;
	int num;
	cout << "여러줄의 문자열을 입력하세요. 입력의 끝은 &문자입니다." << endl;
	getline(cin, s, '&');
	cin.ignore();
	cout << "\n";
	cout << "find : ";
	getline(cin, find);
	cout << "replace : ";
	getline(cin, repl);
	while (true) {
		num = s.find(find);
		if (num != -1)
		{
			s.replace(num, find.length(), repl);
		}
		else {
			break;
		}
	}
	
	cout << s;
}
