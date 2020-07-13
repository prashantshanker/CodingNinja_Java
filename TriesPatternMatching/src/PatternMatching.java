import java.util.Scanner;
import java.util.ArrayList;

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

	public boolean patternMatching(ArrayList<String> input, String pattern) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < input.size(); i++) {
			prifixAdd(input.get(i), output);
			suffixAdd(input.get(i), output);
			midAdd(input.get(i), output);
		}
		for (int i = 0; i < output.size(); i++) {
			if (output.get(i).contains(pattern)) {
				return true;
			}
		}
		return false;
	}

	private void midAdd(String string, ArrayList<String> input) {
		if (string.length() == 0) {
			return;
		}
		if (!input.contains(string)) {
			input.add(string);
		}
		if (string.length() == 1) {
			return;
		}
		suffixAdd((string.substring(1, string.length() - 1)), input);
	}

	private void suffixAdd(String string, ArrayList<String> input) {
		if (string.length() == 0) {
			return;
		}
		if (!input.contains(string)) {
			input.add(string);
		}
		if (string.length() == 1) {
			return;
		}
		suffixAdd((string.substring(0, string.length() - 1)), input);
	}

	private void prifixAdd(String string, ArrayList<String> input) {
		if (string.length() == 0) {
			return;
		}
		if (!input.contains(string)) {
			input.add(string);
		}
		if (string.length() == 1) {
			return;
		}
		prifixAdd((string.substring(1)), input);
	}
}

public class PatternMatching {
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
		System.out.println(t.patternMatching(input, pattern));
	}
}
