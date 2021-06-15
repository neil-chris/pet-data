package sheridan.chrisnei.assingment2.domain;

public enum PetGender {
    FEMALE {
        @Override
        public String toString() {
            return "Female";
        }
    },

    MALE {
        @Override
        public String toString() {
            return "MALE";
        }
    }
}
