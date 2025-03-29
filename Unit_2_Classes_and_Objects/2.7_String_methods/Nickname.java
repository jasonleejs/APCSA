public class Nickname
{
  private String firstName;
  private String lastName;
  private String nickname;
  
  public Nickname(String realFirstName, String realLastName, String nickname)
  {
    this.firstName = realFirstName;
    this.lastName = realLastName;
    this.nickname = nickname;
  }

  public String toString()
  {
    return "(" + nickname + ") " + firstName + " " + lastName;
  }
}

