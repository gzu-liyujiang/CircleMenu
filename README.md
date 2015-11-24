# About
Circle menu for android.可旋转的环形菜单。   
抽取自我的小软件“输入法皮肤控v1.3.6”，见：http://ime.qqtheme.cn

# Usage 
The files you will need: CircleMenu.java、MenuItem.java、Utils.Java.   
You can copy and paste them into your project, and then refactor them.   
```xml
    <cn.qqtheme.circlemenu.widget.CircleMenu
        android:id="@+id/main_menu"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center" />
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
    
        final CircleMenu circleMenu = (CircleMenu) findViewById(R.id.main_menu);
        circleMenu.setRotating(true);//是否启用旋转
        circleMenu.setItems(itemTexts, itemIcons);//显示文字及图标
        //circleMenu.setItems(itemIcons);//只显示图标
        circleMenu.setIconSize(60);//图标大小，单位为px
        circleMenu.setCenterImage(R.drawable.ic_menu_center);//中间圆环内图标
        circleMenu.setOnItemClickListener(new CircleMenu.OnItemClickListener() {
            @Override
            public void onItemClick(MenuItem view) {
                Toast.makeText(MainActivity.this, itemTexts[view.getPosition()], Toast.LENGTH_SHORT).show();
            }
        });
        circleMenu.setOnCenterClickListener(new CircleMenu.OnCenterClickListener() {
            @Override
            public void onCenterClick() {
                Toast.makeText(MainActivity.this, "点击圆环中心", Toast.LENGTH_SHORT).show();
            }
        });
```

# Thanks
修改自szugyi的Android-CircleMenu，支持文字及图标显示，感谢原作者的无私奉献：   
https://github.com/szugyi/CircleMenu。   
如果动画不需要兼容android3.0以下，可以删掉nineoldandroids，改用android.animation.*包   

# Screenshots
![效果图](/screenshots/demo.jpg)   
<video src="/screenshots/demo.mp4" controls="controls">
您的浏览器不支持video标签。
</video>

# Contact
李玉江, QQ:1032694760, Email:liyujiang_tk@yeah.net
