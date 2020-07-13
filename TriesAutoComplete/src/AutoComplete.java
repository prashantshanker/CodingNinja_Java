import java.util.ArrayList;
import java.util.Scanner;

public class AutoComplete {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Trie t = new Trie();
		int n = s.nextInt();
		ArrayList<String> input = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String word = s.next();
			input.add(word);
		}
		String pattern = s.next();
		t.autoComplete(input, pattern);
	}
}

class TrieNode {
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word) {
		if (word.length() == 0) {
			root.isTerminating = true;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word) {
		add(root, word);
	}

	public void autoComplete(ArrayList<String> input, String word) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < input.size(); i++) {
			if (input.get(i).contains(word)) {
				autoCompleteHelper(input.get(i), word, output);
			}
		}
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}

	private void autoCompleteHelper(String string, String word, ArrayList<String> output) {
		for (int i = 0; i < word.length(); i++) {
			if (string.charAt(i) != word.charAt(i)) {
				return;
			}
		}
		if (!output.contains(string)) {
			output.add(string);
		}
	}
}
