package kiyotakagoto.bizcard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BizCardActivity extends Activity {
	
	// 一覧表示用ListView
	private ListView listView = null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        this.listView = (ListView)findViewById(R.id.list);
        
        ArrayAdapter<String> arrayAdapter
            = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        
        arrayAdapter.add("新規追加");
        
        listView.setAdapter(arrayAdapter);
    }
}