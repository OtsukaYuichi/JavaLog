package jp.techacademy.yuichi.otsuka.javalog;

/**
 * Created by OtsukaYuichi on 2016/08/08.
 */

import android.util.Log;

class Dog {

    String name;
    int age;

    //コンストラクタ
    public Dog() {
        name = "";
        age = 0;
    }

    //メソッド
    public void say() {
        Log.d("javatest", "ワンワン");
    }
}
