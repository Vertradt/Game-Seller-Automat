package automat;

import java.util.Scanner;

class Custumer {

    String doChoose() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    int pay() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
