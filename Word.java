
/**
 * A word and its frequency in a book.
 * 
 * Note to students:  you need to add code as well methods to the
 *                    class to complete the project.
 * 
 * @author  Susan King
 * @author  Richa Bhattacharya
 * @version Feb 21 2017
 */
public class Word implements Comparable
{
    // instance variables 
    private String word;  
    private int frequency;  // how often word appears in a text file

    /**
     * Constructor for objects of class Word.
     * 
     * @param text the string of characters of the word
     */
    public Word(String text)
    {
        frequency = 1;
        word = text;
        // initialise frequency to 1 because the text has
        // appeared the first time in the file
    }

    /**
     * The "word" has already appeared in the file, so 1 is 
     * added to frequence since it as appeared again.
     */
    public void addOne( )
    {
        frequency++;
    }
   
    /**
     * Retrieve the text string word.
     * 
     * @return the text of the current Word object
     */
    public String getWord( )
    {
        return word;
    }
    
    /**
     * Retrieve the frequency of the word
     * 
     * @return the frequency of the current Word object
     */
    public int getFrequency()
    {
        return frequency;
    }
    /**
     * Compare lexicalgraphically this current Word object and 
     * the Word obj.  
     * 
     * @param obj  the object to compare the current Word object to
     * 
     * @return   0 if this current Word object's word has equal to obj's word;
     *         < 0 if this current Word object's word comes earlier
     *             in the alphabet than obj's word;
     *         > 0 if this current Word object's word comes later 
     *             in the alphabet that obj's word
     */
    public int compareTo(Object obj )
    {
        return this.compareTo(obj);
    }

    /**
     * Compares the frequencies of the two words 
     * 
     * @param obj   the object the is being compared to the current object
     * 
     * @return 
     *            0 if they have the same frequency
     *           >0 if current word's frequency is greater than obj
     *           <0 if current word's frequency is less than obj
     */
    public int compareFrequencyTo (Object obj)
    {
        Word object = (Word) obj;
        return this.getFrequency() - object.getFrequency();
    }
    
    /**
     * Return the text of the word and its frequency as a String.
     * 
     * @return text and frequency
     */
    public String toString( )
    {
        return String.format("%-15s %6d", word, frequency);
    }
    
}
