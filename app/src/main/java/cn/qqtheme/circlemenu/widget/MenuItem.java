package cn.qqtheme.circlemenu.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.DrawableRes;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Custom text and icon for the {@link CircleMenu} class.
 *
 * @author 李玉江[QQ:1032694760]
 * @since 2015/11/25
 * Created By Android Studio
 */
public class MenuItem extends LinearLayout {
    private TextView textView;
    private ImageView imageView;
    // Angle is used for the positioning on the circle
    private float angle = 0;
    // Position represents the index of this view in the view groups children array
    private int position = 0;
    // The text of the view
    private String text;

    /**
     * Return the angle of the view.
     *
     * @return Returns the angle of the view in degrees.
     */
    public float getAngle() {
        return angle;
    }

    /**
     * Set the angle of the view.
     *
     * @param angle The angle to be set for the view.
     */
    public void setAngle(float angle) {
        this.angle = angle;
    }

    /**
     * Return the position of the view.
     *
     * @return Returns the position of the view.
     */
    public int getPosition() {
        return position;
    }

    /**
     * Set the position of the view.
     *
     * @param position The position to be set for the view.
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Return the text of the view.
     *
     * @return Returns the text of the view.
     */
    public String getText() {
        return text;
    }

    /**
     * Set the text of the view.
     *
     * @param text The text to be set for the view.
     */
    public void setText(String text) {
        this.text = text;
        textView.setText(text);
    }

    public void setIcon(Bitmap icon, int iconSize) {
        iconSize = Utils.toPx(getContext(), iconSize);
        imageView.setImageBitmap(Utils.scale(icon, iconSize, iconSize));
    }

    public void setIcon(@DrawableRes int icon, int iconSize) {
        setIcon(BitmapFactory.decodeResource(getResources(), icon), iconSize);
    }

    public void setTextVisible(boolean iconVisible) {
        textView.setVisibility(iconVisible ? VISIBLE : GONE);
    }

    /**
     * @param context
     */
    public MenuItem(Context context) {
        super(context);
        int wrapContent = ViewGroup.LayoutParams.WRAP_CONTENT;
        setLayoutParams(new ViewGroup.LayoutParams(wrapContent, wrapContent));
        setOrientation(VERTICAL);
        setGravity(Gravity.CENTER);
        textView = new TextView(context);
        imageView = new ImageView(context);
        addView(imageView);
        addView(textView);
    }

}