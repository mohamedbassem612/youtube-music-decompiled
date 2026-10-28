package com.google.android.libraries.youtube.player.features.storyboard;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.abls;
import defpackage.ablu;
import defpackage.agrf;
import defpackage.tuk;
import defpackage.twm;
import defpackage.tym;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ScrubbedPreviewView extends FrameLayout {
    public ImageView a;
    public TextView b;
    public ObjectAnimator c;
    public final Rect d;
    public boolean e;
    private int f;

    public ScrubbedPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = false;
        c(context, attributeSet, 0, R.style.ScrubbedPreview);
    }

    private final void b() {
        int integer = getResources().getInteger(R.integer.fade_duration_fast);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        this.c = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(integer);
        this.c.addListener(new ablu(this));
    }

    private final void c(Context context, AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(context).inflate(R.layout.scrubbed_preview, this);
        this.a = (ImageView) findViewById(R.id.thumbnail);
        this.b = (TextView) findViewById(R.id.timestamp);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, abls.a, i, i2);
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                agrf agrfVar = twm.a;
                displayMetrics.getClass();
                this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) (((double) (displayMetrics.density * 90.0f)) + 0.5d));
                tym.h(this.a, tym.g(Math.round(this.f * typedArrayObtainStyledAttributes.getFloat(0, 1.778f)), this.f), ViewGroup.LayoutParams.class);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        b();
        tuk.l(this, false);
    }

    public final void a() {
        if (this.e) {
            this.c.reverse();
            this.e = false;
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public ScrubbedPreviewView(Context context) {
        super(context);
        this.d = new Rect();
        this.e = false;
        c(context, null, 0, 0);
    }

    public ScrubbedPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Rect();
        this.e = false;
        c(context, attributeSet, i, 0);
    }

    public ScrubbedPreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = new Rect();
        this.e = false;
        c(context, attributeSet, i, i2);
    }
}
