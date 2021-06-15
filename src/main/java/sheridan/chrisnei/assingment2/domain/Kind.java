package sheridan.chrisnei.assingment2.domain;

/**
 * An enum representing a pet kind
 */
public enum Kind {

    /**
     * A constant representing a dog
     */
    DOG {
        @Override
        public String toString() {
            return "Dog";
        }
    },

    /**
     * A constant representing a cat
     */
    CAT {
        @Override
        public String toString() {
            return "Cat";
        }
    },

    /**
     * A constant representing a rabbit
     */
    RABBIT {
        @Override
        public String toString() {
            return "Rabbit";
        }
    }

}
