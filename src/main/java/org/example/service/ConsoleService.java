package org.example.service;

import org.example.model.CryptoModel;

import java.util.Scanner;

import static org.example.constants.Constants.ENTER_FILE_NAME_SAVE;
import static org.example.constants.Constants.ENTER_KEY;

public class ConsoleService {
    CryptoModel cryptoModel = new CryptoModel();

    private final Scanner scanner;
    public ConsoleService(Scanner scanner){
        this.scanner = scanner;
    }


    public CryptoModel enterData (String enterFileNameToEncrypt) {
        CryptoService cryptoService = new CryptoService();

        System.out.println(enterFileNameToEncrypt);
        cryptoModel.setFileSourcePath(scanner.nextLine());

        System.out.println(ENTER_FILE_NAME_SAVE);
        cryptoModel.setFileSavePath(scanner.nextLine());

        System.out.println(ENTER_KEY);
        cryptoModel.setKey(scanner.nextInt());

        return cryptoModel;
    }
}
