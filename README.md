# About
Circle menu for android.可旋转的环形菜单。   

# Usage 
The files you will need: CircleMenu.java. You can copy and paste it into your project, and then refactor it.   
```xml
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <cn.qqtheme.framework.widget.CircleMenu
        android:id="@+id/circle_menu_items"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

    <ImageView
        android:id="@+id/circle_menu_center"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_gravity="center"
        android:contentDescription="@null"
        android:src="@drawable/ic_launcher" />

</FrameLayout>
```

```java
        String[] itemTexts = new String[]{
            "新建皮肤 ",
            "导入皮肤",
            "我的皮肤",
            "我的素材",
            "建议反馈",
            "更多作品",
            "版本更新"
        };
        int[] itemIcons = new int[]{
            R.drawable.ic_skin_create,
            R.drawable.ic_skin_import,
            R.drawable.ic_skin_manage,
            R.drawable.ic_skin_material,
            R.drawable.ic_about,
            R.drawable.ic_product,
            R.drawable.ic_upgrade
        };
    
        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.main_menu);
        circleMenu.setRotating(true);//是否启用旋转
        circleMenu.setItems(itemTexts, itemIcons);//显示文字及图标
        //circleMenu.setItems(itemIcons);//只显示图标
        circleMenu.setIconSize(60);//图标大小，单位为dp
        circleMenu.setOnItemClickListener(new CircleMenu.OnItemClickListener() {
            @Override
            public void onItemClick(CircleMenu.ItemView view) {
                Toast.makeText(MainActivity.this, itemTexts[view.getPosition()], Toast.LENGTH_SHORT).show();
            }
        });
```

# Thanks
修改自szugyi的Android-CircleMenu，支持文字及图标显示，感谢原作者的无私奉献：   
https://github.com/szugyi/Android-CircleMenu   
如果动画不需要兼容android3.0以下，可以删掉nineoldandroids，改用android.animation.*包   

# Compatible
如果需要兼容到android 2.X，需要导入nineoldandroids，
把android.animation.Animator和android.animation.ObjectAnimator替换为
com.nineoldandroid.animation.Animator和com.nineoldandroid.animation.ObjectAnimator。   

# Screenshots
![效果图](/screenshots/demo.gif)   

# Contact
李玉江, QQ:1032694760, Email:liyujiang_tk@yeah.net
