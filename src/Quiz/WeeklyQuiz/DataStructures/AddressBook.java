package Quiz.WeeklyQuiz.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;

    AddressBook() {
        this.contacts = new ArrayList<Contact>();
    }

    // 연락처 추가
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    // 연락처 출력
    public void displayContacts(Contact contact) {

    }

    // 연락처 검색
//    public Contact searchContact(String name) {}

    public static void main(String[] args) {
        int choice = 0;
        String name = "";
        String phoneNumber = "";
        String company = "";
        String relationship = "";

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("* * * * * * * * * * *");
            System.out.println("1. 비즈니스 연락처 출력");
            System.out.println("2. 개인 연락처 출력");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.println("* * * * * * * * * * *");
            System.out.println();
            System.out.print("메뉴를 선택해주세요 : ");
            choice = sc.nextInt();
            System.out.println();

            if (choice == 1) {
                System.out.print("이름을 입력하세요: ");
                name = sc.nextLine();
                System.out.print("전화번호를 입력하세요: ");
                phoneNumber = sc.nextLine();
                System.out.print("회사명을 입력하세요: ");
                company = sc.nextLine();
                addressBook.addContact(new BusinessContact(name, phoneNumber, company));
                continue;
            }
            else if (choice == 2) {
                System.out.print("이름을 입력하세요: ");
                name = sc.nextLine();
                System.out.print("전화번호를 입력하세요: ");
                phoneNumber = sc.nextLine();
                System.out.print("관계를 입력하세요: ");
                relationship = sc.nextLine();
                addressBook.addContact(new PersonalContact(name, phoneNumber, relationship));
                continue;
            }
            else if (choice == 3) {

            }
        }
    }
}
