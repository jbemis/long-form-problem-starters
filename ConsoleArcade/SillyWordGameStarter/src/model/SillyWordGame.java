package model;

import java.util.Iterator;
import java.util.List;

public class SillyWordGame implements Iterable<Phrase> {

    private List<Phrase> phrases;


    public SillyWordGame(List<Phrase> phrases) {
        this.phrases = phrases;

    }

    //EFFECTS: returns all phrases in this game
    public List<Phrase> getAllPhrases() {
        return phrases;
    }


    @Override
    public Iterator<Phrase> iterator() {
        return new PhrasesNeedingWordsIterator();
    }

    private class PhrasesNeedingWordsIterator implements Iterator<Phrase> {
        private int numWordsNeeded;
        private Iterator<Phrase> phraseIterator;

        public PhrasesNeedingWordsIterator() {
            phraseIterator = phrases.iterator();
            calculateNumWordsNeeded();
        }

        private void calculateNumWordsNeeded() {
            Iterator<Phrase> it = phrases.iterator();
            while(it.hasNext()) {
                if (it.next().needsWord())
                    numWordsNeeded++;
            }
        }

        @Override
        public boolean hasNext() {
            return (numWordsNeeded > 0);
        }

        @Override
        public Phrase next() {
            Phrase phrase = phraseIterator.next();
            while(!phrase.needsWord()){
                phrase = phraseIterator.next();
            }
            numWordsNeeded--;
            return phrase;
        }

        public void remove(){

        }
    }
}
