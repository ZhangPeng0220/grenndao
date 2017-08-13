package com.example.grenndao30;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.grenndao30.gen.DaoMaster;
import com.example.grenndao30.gen.DaoSession;
import com.example.grenndao30.gen.UserDao;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private UserDao userDao;
    private Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(getApplicationContext(), "lenve.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
        User user = new User(null,"zhangsan" + random.nextInt(9999) ,"张三");
        userDao.insert(user);
    }
    public void add(View view){
        User user = new User(null,"zhangsan" + random.nextInt(9999) ,"张三");
        userDao.insert(user);
        List<User> list = userDao.queryBuilder()
                .where(UserDao.Properties.Nickname.eq("张三") ).build().list();
        for (int i = 0; i < list.size(); i++) {
            Log.d("google_lenve", "search: " + list.get(i).getUsername());
        }
    }

}
