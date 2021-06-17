package sheridan.chrisnei.assingment2.model;

import lombok.extern.slf4j.Slf4j;

/**
 * An enum representing a pet kind
 */
@Slf4j
public enum Kind {

    /**
     * A constant representing a dog
     */
    DOG {
        @Override
        public String toString() {
            log.info("Invoked Kind.DOG.toString() method");
            return "Dog";
        }
    },

    /**
     * A constant representing a cat
     */
    CAT {
        @Override
        public String toString() {
            log.info("Invoked Kind.CAT.toString()");
            return "Cat";
        }
    },

    /**
     * A constant representing a rabbit
     */
    RABBIT {
        @Override
        public String toString() {
            log.info("Invoked Kind.RABBIT.toString()");
            return "Rabbit";
        }
    }

}
