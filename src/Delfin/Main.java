package Delfin;

import Filehandler.FileHandler;
import Members.Member;
import UI.UserInterface;

import java.util.ArrayList;

public class Main {

  private ArrayList<Member> members;



  public void start() {

    UserInterface ui = new UserInterface(this);

    ui.start();
  }

  public Main() {
    members = new ArrayList<>();
  }

  public static void main(String[] args) {

    Main main = new Main();
    main.loadDatabase();
    main.start();

  }

  public void loadDatabase() {
    FileHandler fileHandler = new FileHandler();
    members = fileHandler.loadMembersFromFile();
  }

  public void saveDatabase() {
    FileHandler fileHandler = new FileHandler();
    fileHandler.saveMembersToFile(members);
  }

}
