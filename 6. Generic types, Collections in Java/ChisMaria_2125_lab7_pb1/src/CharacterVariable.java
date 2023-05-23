public class CharacterVariable implements Generator<Character> {
    public Character next(Character var) {
        return ++var;
    }

    public CharacterVariable() {

    }
}
