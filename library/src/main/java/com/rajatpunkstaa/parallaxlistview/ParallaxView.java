package com.rajatpunkstaa.parallaxlistview;

import android.view.View;

/**
 * Created by rajatpunkstaa on 21/10/2015.
 */
interface ParallaxView {
    /**
     * sets the view as a parallax header
     *
     * @param v header view
     */
    void setParallaxView(View v);

    void setScrollEvent(ParallaxScrollEvent scrollEvent);

    Parameters getParameters();

    void setParameters(Parameters params);
}
