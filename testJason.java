import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by RENT on 2016-10-17.
 */
public class testJason {


    @Test
    public void generateJason() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();


        Person person = new Person();
        person.setAge(18);
        person.setName("John");
        person.setSurname("Dumbar");


        String json = gson.toJson(person);


        System.out.println(json);

    }
        @Test
        public void shouldParseUrl () throws Exception {
            //given
            String url = "http://echo.jsontest.com/name/adam/surname/kalisiak";
            String json = readUrl(url);
            System.out.println(json);
            Gson gson = new Gson();


            //when
            Person person = gson.fromJson(json, Person.class);
            //then
            System.out.println(person);
        }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

}

