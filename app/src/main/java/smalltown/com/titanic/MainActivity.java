package smalltown.com.titanic;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import smalltown.com.titanic.library.Titanic;
import smalltown.com.titanic.library.TitanicTextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TitanicTextView tv = (TitanicTextView) findViewById(R.id.my_text_view);

        // 设置显示的字体
        tv.setTypeface(Typefaces.get(this, "Satisfy-Regular.ttf"));

        // 开始动画效果
        new Titanic().start(tv);
    }

}
