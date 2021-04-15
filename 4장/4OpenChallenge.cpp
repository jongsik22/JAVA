#include <iostream>
#include <string>
using namespace std;
class Player {
	string name;
public:
	string getName() { return name; }
	void setName(string p) { name = p; }
};
class WordGame {
	Player *p;
	int members;
	string word;
public:
	void setMembers(int n) { members = n; }
	void run();
};

void WordGame::run() {
	string first = "아버지";
	cout << "끝말잇기 게임을 시작합니다." << endl;
	cout << "게임에 참가하는 인원은 몇명입니까? ";
	cin >> members;
	setMembers(members);
	p = new Player[members];
	string namee;
	for (int i = 0; i < members; i++) {
		cout << "참가자의 이름을 입력하세요. 빈칸 없이 >>";
		cin >> namee;
		p[i].setName(namee);
	}
	cout << "시작하는 단어는 아버지 입니다." << endl;
	int cnt = 0;
	while (true) {
		cout << p[cnt].getName() << ">> ";
		cin >> word;
		
		if (word.length() < 4) {
			break;
		}
		if ((first.at(first.length() - 2) == word.at(0)) && (first.at(first.length() - 1) == word.at(1))) {
			first = word;
			cnt++;
			if (cnt == 3) {
				cnt = 0;
			}
		}
		else {
			break;
		}
		
	}
}
int main() {
	WordGame game;
	game.run();
	

}