package com.rajatpunkstaa.parallaxlistview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.RelativeLayout;

/**
 * Created by rajatpunkstaa on 21/10/2015.
 */
public class CustomRelativeWrapper extends RelativeLayout {

    private int mOffset;

    public CustomRelativeWrapper(Context context) {
        super(context);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.clipRect(new Rect(getLeft(), getTop(), getRight(), getBottom() + mOffset));
        super.dispatchDraw(canvas);
    }

    public void setClipY(int offset) {
        mOffset = offset;
        invalidate();
    }
}

