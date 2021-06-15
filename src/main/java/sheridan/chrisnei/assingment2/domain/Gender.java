package sheridan.chrisnei.assingment2.domain;

/**
 * An enum representing the gender of a pet
 */
public enum Gender {

    /**
     * A constant representing a female gender
     */
    FEMALE {
        @Override
        public String toString() {
            return "Female";
        }
    },

    /**
     * A constant representing a male gender
     */
    MALE {
        @Override
        public String toString() {
            return "MALE";
        }
    }
}
