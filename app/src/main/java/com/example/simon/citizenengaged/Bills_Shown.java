package com.example.simon.citizenengaged;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Bills_Shown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills__shown);

    }

    /*   <WebView
        android:id="@+id/BillsShown"
        android:layout_width="378dp"
        android:layout_height="553dp"
        tools:layout_editor_absoluteX="-9dp"
        tools:layout_editor_absoluteY="-11dp">

        <EditText
            android:id="@+id/areaOfInterest"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_x="92dp"
            android:layout_y="384dp"
            android:ems="10"
            android:inputType="textPersonName"
            android:text="Name"
            android:visibility="invisible" />
    </WebView>*/


  /*  private WebView wv;
    String BillsSHown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Intent intent = getIntent();
       // String areaOfInterest = intent.getStringExtra("zipCodeInput");
        //TextView dispplayZip = (TextView) findViewById(R.id.zipCode);
        //dispplayZip.setText("http://ziplook.house.gov/htbin/findrep?ZIP=" + zipCode);
        BillsSHown = ("https://www.govtrack.us/congress/bills/" + "subjects/agriculture_and_food/5816");
        // String PrimeDiv = "contentNav";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills__shown);
        //final WebView wv = (WebView) findViewById(R.id.RepShown);
        wv = (WebView) findViewById(R.id.BillsShown);
        wv.getSettings().setJavaScriptEnabled(false);
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setDatabaseEnabled(true);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(false);

        wv.loadUrl(BillsSHown);
    }*/
}

/*                //new thread
        new LoadData().execute();
    }
    private class  LoadData extends AsyncTask<Void,Void,Void>
    {
        String primeDiv="contentNav";
        String html=new String();
        Document doc = null;
        @Override
        protected Void doInBackground(Void... params) {

            try {

                doc = Jsoup.connect(repsWeb).timeout(100000).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //get total document

            Elements alldivs=doc.select("div");
            ArrayList<String> list=new ArrayList<String>();

            for(org.jsoup.nodes.Element e: alldivs)
            {
                if(!e.id().equals(""))
                    list.add(e.id());
            }
            //removing all <div> without "div2"
            for(int i=0;i<list.size();i++)
            {
                if(!list.get(i).equals(primeDiv))
                    doc.select("div[id="+list.get(i)+"]").remove();
            }

            html=alldivs.outerHtml();

            return null;
        }
        @Override
        protected void onPostExecute(Void result) {

            super.onPostExecute(result);
            wv.loadDataWithBaseURL(null,doc.html(),
                    "text/html", "utf-8", null);

        }
    }
@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}*/
