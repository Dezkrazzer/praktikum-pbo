// L0125105_Lazuardi Akbar Imani

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WordPerfect {
	private static ArrayList<String> textFileContent = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	private static boolean appRunning = true;
	private static String commandInput = "";

	public static void main(String[] args) {
		while (appRunning) {
			ConsoleCleaner.clearScreen();

			printStripes(getLongestRowLength() + 3);
			System.out.print("\n");

			for (int i = 0; i < textFileContent.size(); i++) {
				System.out.print(String.format("%d. %s\n", i + 1, textFileContent.get(i)));
			}

			printStripes(getLongestRowLength() + 3);
			System.out.print("\n");

			System.out.print(">");
			commandInput = scanner.nextLine().toLowerCase().trim();

			if (commandInput.isEmpty()) continue;

			if (!commandInput.startsWith("\\")) {
				textFileContent.add(commandInput);
				continue;
			}

			commandInput = commandInput.substring(1);

			if (commandInput.equals("exit")) {
				System.exit(0);
			} else if (commandInput.equals("edit")) {
				int lineNumber = 0;
				try {
					System.out.print("Enter line number to edit: ");
					lineNumber = scanner.nextInt();
					scanner.nextLine();
					if (lineNumber < 1 || lineNumber > textFileContent.size()) continue;

					System.out.print("Enter text: ");
					textFileContent.set(lineNumber - 1, scanner.nextLine().toLowerCase().trim());
				} catch (Exception e) {
					scanner.nextLine();
					continue;
				}
			} else if (commandInput.equals("delete")) {
				int lineNumber = 0;
				try {
					System.out.print("Enter line number to delete: ");
					lineNumber = scanner.nextInt();
					scanner.nextLine();
					if (lineNumber < 1 || lineNumber > textFileContent.size()) continue;

					textFileContent.remove(lineNumber - 1);
				} catch (Exception e) {
					scanner.nextLine();
					continue;
				}
			} else if (commandInput.equals("insert")) {
				int lineNumber = 0;
				int newLineCount = 0;
				try {
					System.out.print("Enter line number to insert below it: ");
					lineNumber = scanner.nextInt();
					scanner.nextLine();
					if (lineNumber < 1 || lineNumber > textFileContent.size()) continue;

					System.out.print("How many lines to insert: ");
					newLineCount = scanner.nextInt();
					scanner.nextLine();

					for (int i = 0; i < newLineCount; i++) {
						textFileContent.add(lineNumber, "");
					}
				} catch (Exception e) {
					scanner.nextLine();
					continue;
				}
			} else if (commandInput.equals("save")) {
				System.out.print("Enter file path to save: ");
				String filePath = scanner.nextLine().trim();
				if (filePath.isEmpty()) {
					System.out.println("File path cannot be empty.");
					pauseBeforeRefresh();
					continue;
				}

				try {
					Path path = Paths.get(filePath);
					Files.write(path, textFileContent, StandardCharsets.UTF_8);
					System.out.println("File saved successfully.");
				} catch (InvalidPathException e) {
					System.out.println("Invalid file path: " + e.getMessage());
					pauseBeforeRefresh();
				} catch (IOException e) {
					System.out.println("Unable to save file: " + e.getMessage());
					pauseBeforeRefresh();
				}
			} else if (commandInput.equals("open")) {
				System.out.print("Enter file path to open: ");
				String filePath = scanner.nextLine().trim();
				if (filePath.isEmpty()) {
					System.out.println("File path cannot be empty.");
					pauseBeforeRefresh();
					continue;
				}

				try {
					Path path = Paths.get(filePath);
					textFileContent = new ArrayList<>(
							Files.readAllLines(path, StandardCharsets.UTF_8));
					System.out.println("File opened successfully.");
				} catch (InvalidPathException e) {
					System.out.println("Invalid file path: " + e.getMessage());
					pauseBeforeRefresh();
				} catch (IOException e) {
					System.out.println("Unable to open file: " + e.getMessage());
					pauseBeforeRefresh();
				}
			}

			commandInput = "";
		}
	}

	private static void pauseBeforeRefresh() {
		System.out.print("Press Enter to continue...");
		scanner.nextLine();
	}

	private static int getLongestRowLength() {
		int longest = 0;
		for (int i = 0; i < textFileContent.size(); i++) {
			if (longest < textFileContent.get(i).length()) {
				longest = textFileContent.get(i).length();
			}
		}
		return longest;
	}

	private static void printStripes(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("=");
		}
	}
}

class ConsoleCleaner {
	public static void clearScreen() {
		try {
			String os = System.getProperty("os.name").toLowerCase();
			if (os.contains("win")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
			}
		} catch (Exception e) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
	}
}