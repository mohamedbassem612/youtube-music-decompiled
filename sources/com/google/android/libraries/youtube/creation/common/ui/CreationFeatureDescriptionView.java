package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.dfy;
import defpackage.uhx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CreationFeatureDescriptionView extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public Animation d;
    public boolean e;
    boolean f;

    public CreationFeatureDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.creation_feature_description_view, this);
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.subtitle);
        this.c = (TextView) findViewById(R.id.subtext);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uhx.b, 0, 0);
            try {
                this.f = typedArrayObtainStyledAttributes.getBoolean(0, false);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public final void a(Animation animation) {
        animation.setAnimationListener(new dfy(this, 8));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f || getVisibility() != 0 || !this.e) {
            return false;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        a(alphaAnimation);
        Animation animation = this.d;
        if (animation != null) {
            animation.cancel();
        }
        startAnimation(alphaAnimation);
        return false;
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        super.startAnimation(animation);
        this.d = animation;
    }
}
