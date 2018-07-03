package br.org.catolicasc.chat;

import javax.swing.*;

public class ClientServer {

    public static void main(String[] args) {

        Object[] selectioValues = {"Server", "Client"};
        String initialSection = "Server";

        Object selection = JOptionPane.showInputDialog(null, "Login as : ", "MyChatApp", JOptionPane.QUESTION_MESSAGE, null, selectioValues, initialSection);
        if (selection.equals("Server")) {
            String[] arguments = new String[]{};
            new MultiThreadChatServerSync().main(arguments);
        } else if (selection.equals("Client")) {
            String IPServer = JOptionPane.showInputDialog("Digite o endereço IP do servidor, EX: localhost");
            String[] arguments = new String[]{IPServer};
            new ChatClient().main(arguments);
        }

    }

}
