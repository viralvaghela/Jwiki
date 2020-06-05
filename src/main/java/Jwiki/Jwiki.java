package Jwiki;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Jwiki {
    final String BASE_URL="https://en.wikipedia.org/api/rest_v1/page/summary/";
    String subject=null;
    String displayTitle="";
    String imageURL="";
    String extractText="";

    public Jwiki(String subject)
    {
        this.subject=subject;
        getData();

    }

    private void getData() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(BASE_URL+subject)
                .get()
                .build();
        try {
            Response response=client.newCall(request).execute();
            String data = response.body().string();
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject)parser.parse(data);

            //get title from JSON response
            displayTitle= (String) jsonObject.get("displaytitle");

            //first create a image object and then get image URL
            JSONObject jsonObjectOriginalImage = (JSONObject) jsonObject.get("originalimage");
            imageURL= (String) jsonObjectOriginalImage.get("source");


            //get text
            extractText = (String)jsonObject.get("extract");

        }
        catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getExtractText() {
        return extractText;
    }
}
