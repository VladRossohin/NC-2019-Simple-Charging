export class User {
  id: string;
  login: string;
  firstName: string;
  lastName: string;
  email: string;
  role: string;
  static cloneBase(user: User) {
    const clonedUser: User = new User();
    clonedUser.id = user.id;
    clonedUser.login = user.login;
    clonedUser.firstName = user.firstName;
    clonedUser.lastName = user.lastName;
    clonedUser.email = user.email;
    clonedUser.role = user.role;

    return clonedUser;
  }
}

export class UserStr {

}
