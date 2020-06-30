package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Bracket {
	Bracket(char type, int position) {
		this.type = type;
		this.position = position;
	}

	boolean Match(char c) {
		if (this.type == '[' && c == ']')
			return true;
		if (this.type == '{' && c == '}')
			return true;
		if (this.type == '(' && c == ')')
			return true;
		return false;
	}

	char type;
	int position;
}
public class Paranthesis {
	public static void main(String[] args) throws IOException {
		InputStreamReader input_stream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input_stream);
		String text = reader.readLine();

		Stack<Bracket> paranth = new Stack<Bracket>();
		for (int position = 0; position < text.length(); ++position) {
			char next = text.charAt(position);

			if (next == '(' || next == '[' || next == '{') {
				Bracket brack = new Bracket(next, position);
				paranth.push(brack);
			}

			else if (next == ')' || next == ']' || next == '}') {
				if (paranth.isEmpty()) {
					System.out.println(position + 1);
					return;
				}
				Bracket top = paranth.pop();
				if (!top.Match(next)) {
					System.out.println(position + 1);
					return;
				}
			}

		}
		if (!paranth.isEmpty()) {
			System.out.println(paranth.peek().position + 1);
		} else {
			System.out.println("Success");
		}

	}


}
