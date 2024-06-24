class king
{
    enum game
    {
        START,
        KILL,
        STOP,
        BOOYAH
    }
    public static void main(String[] args)
    {
        game a=game.BOOYAH;
        System.out.println(a);

      switch (a) {
        case START:
            System.out.println("The get start ready to kill");
            break;
        case KILL:
           System.out.println("You kill some one GOOD JOB");
           break;
        case STOP:
           System.out.println("Your being kill by some one GAME ENDS");
           break;
        case BOOYAH:
           System.out.println("You win the game");
           break;
        default:
            break;
      }
    }
}