package sheridan.chrisnei.assingment2.model;

import lombok.extern.slf4j.Slf4j;

/**
 * An enum representing the gender of a pet
 */
@Slf4j
public enum Gender {

    /**
     * A constant representing a female gender
     */
    FEMALE {
        @Override
        public String toString() {
            log.info("Gender.FEMALE.toString()");
            return "Female";
        }
    },

    /**
     * A constant representing a male gender
     */
    MALE {
        @Override
        public String toString() {
            log.info("Gender.MALE.toString()");
            return "Male";
        }
    }
}
