import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	public int count;

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

	private boolean search(TrieNode root, String word) {
		if (word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if (child == null) {
			return false;
		}

		return search(child, word.substring(1));

	}

	public boolean search(String word) {
		return search(root, word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}

		if (root.isTerminating) {
			System.out.println(word);
		}

		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}

	public void print() {
		print(this.root, "");
	}

	public boolean isPalindromePair(ArrayList<String> words) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			isPalindrome(words.get(i), output);
		}
		for (int i = 0; i < output.size(); i++) {
			for (int j = 0; j < words.size(); j++) {
				if (output.get(i).contains(words.get(j))) {
					return true;
				}
			}
		}
		return false;
	}

	public static void isPalindrome(String str, ArrayList<String> output) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}
		output.add(s);
	}
}

public class PalinfromePair {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static ArrayList<String> takeInput() throws IOException {
		ArrayList<String> words = new ArrayList<>();

		int n = Integer.parseInt(br.readLine().trim());

		if (n == 0) {
			return words;
		}

		String[] listOfWords;
		listOfWords = br.readLine().split("\\s");

		for (int i = 0; i < n; ++i) {
			words.add(listOfWords[i]);
		}

		return words;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Trie root = new Trie();

		ArrayList<String> words = takeInput();
		System.out.println(root.isPalindromePair(words));
	}

}
