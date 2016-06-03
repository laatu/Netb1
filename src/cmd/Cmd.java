package cmd;

import java.awt.List;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Cmd {
	public static void main(String[] args) throws IOException {
		run("dir");
	}
	public static void run(String argument) throws IOException {
        java.util.List <String> command = new ArrayList <String>();
        OsCheck.OSType osType = OsCheck.getOperatingSystemType();
        System.out.println("OS: " + osType);
        String shell;
        if(osType.toString().equals("Windows")) {
            command.add("cmd.exe");
            command.add("/c");
        } else {
            // shell = "/bin/bash";
            shell="gnome-terminal";
            command.add(shell);
        }
        command.add(argument);
        InputStream inputStream = null;
        InputStream errorStream = null;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            inputStream = process.getInputStream();
            errorStream = process.getErrorStream();

            System.out.println("Process InputStream: " + new Scanner(inputStream,"UTF-8").useDelimiter("\\A"));
            // // System.out.println("Process ErrorStream: " + IOUtils.toString(errorStream, "utf-8"));
            System.out.println("Process ErrorStream: " + new Scanner(errorStream,"UTF-8").useDelimiter("\\A"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream .close();
            }
            if (errorStream != null) {
                errorStream.close();
            }
        }
    }
}
