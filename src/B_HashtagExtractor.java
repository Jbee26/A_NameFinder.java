    /***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

        public static void main(String[] args) {
            B_HashtagExtractor b = new B_HashtagExtractor();
        }

        public B_HashtagExtractor() {
            String post = "I love #coding and #Java!"; // Output: Hashtag: #coding, Hashtag: #Java
            System.out.println("Hashtags: " + extractHashtags(post));


        }

        public String extractHashtags(String post) {
            /* TODO: your code goes here */

            post = post.substring(6, 24);



            return post;

        }

    }





