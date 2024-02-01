package io.github.keeganr87.stringpadder;


/**
 * Pads a {@link String}
 * <p>
 * The instances of classes that implement this interface are thread-safe and immutable.
 * </p>
 */
public interface StringPadder {

    /**
     * Returns a new {@link String} that right-aligns the characters in the specified String by padding them with spaces
     * on the left, for a specified total length.
     *
     * @param stringToPad the {@link String} to be padded
     * @param totalLength total length of the new {@link String}
     * @return the padded {@link String}
     */
    String padLeft(String stringToPad, int totalLength);

    String padLeft(String stringToPad, int totalLength, char paddingCharacter);

    String padRight(String stringToPad, int totalLength);

    String padRight(String stringToPad, int totalLength, char paddingCharacter);
}
