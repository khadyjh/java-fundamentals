package inheritance;


public abstract class BigOne {
        private String name;

        public BigOne(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public abstract void addReview(Review review);

        public String calculatePriceCategory(int pc){
            if(pc==1){
                return "$";
            }else if(pc==2){
                return "$$";
            }else if(pc==3){
                return "$$$";
            }


            return "";
        }


        @Override
        public String toString() {
            return "BigOne{" +
                    "name='" + name + '\'' +
                    '}';
        }
}

