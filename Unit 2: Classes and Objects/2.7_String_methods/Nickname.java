public class Nickname
{
  private String firstName;
  private String lastName;
  private String nickname;
  public Nickname(String realFirstName, String realLastName, String moniker)
  {
    firstName = realFirstName;
    lastName = realLastName;
    nickname = moniker;
  }
  public String toString()
  {
    return firstName + " (" + nickname + ") " + lastName;
  }
}

