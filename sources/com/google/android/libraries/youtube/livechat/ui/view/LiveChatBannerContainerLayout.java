package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.ttn;
import defpackage.xxj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class LiveChatBannerContainerLayout extends RelativeLayout {
    public boolean a;
    public boolean b;
    public xxj c;
    private final ttn d;
    private boolean e;
    private boolean f;
    private float g;
    private float h;

    public LiveChatBannerContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = false;
        this.g = 0.0f;
        this.h = 0.0f;
        this.d = new ttn(context, 200, 1, 20);
    }

    private final void a(MotionEvent motionEvent) {
        ttn ttnVar = this.d;
        ttnVar.b(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            ttnVar.d(motionEvent);
            this.g = motionEvent.getRawY();
            this.h = motionEvent.getRawY();
            this.e = false;
            this.f = false;
            return;
        }
        if (actionMasked == 1) {
            xxj xxjVar = this.c;
            if (xxjVar == null || !b(motionEvent)) {
                animate().translationY(0.0f).setDuration(100L);
            } else {
                xxjVar.d();
            }
            ttnVar.c();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                xxj xxjVar2 = this.c;
                if (xxjVar2 == null || !b(motionEvent)) {
                    animate().translationY(0.0f).setDuration(100L);
                } else {
                    xxjVar2.d();
                }
                this.e = false;
                ttnVar.c();
                return;
            }
            return;
        }
        float rawY = motionEvent.getRawY() - this.h;
        if (!this.e && Math.abs(rawY) >= 6.0f) {
            this.e = true;
        }
        if (!this.b ? rawY < 0.0f : rawY > 0.0f) {
            setTranslationY(getTranslationY() + rawY);
            this.h = motionEvent.getRawY();
        }
        int height = getHeight();
        float rawY2 = this.g - motionEvent.getRawY();
        float f = height * 0.2f;
        if (!this.b ? rawY2 >= f : rawY2 <= (-f)) {
            z = true;
        }
        if (this.e && z) {
            this.f = true;
        }
    }

    private final boolean b(MotionEvent motionEvent) {
        int height = getHeight();
        float rawY = this.g - motionEvent.getRawY();
        if (!this.e) {
            return false;
        }
        int iE = this.d.e(motionEvent, 1);
        if (this.b) {
            if (iE != 1 && rawY > (-height) * 0.5f) {
                return false;
            }
        } else if (iE != 2 && rawY < height * 0.5f) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            return false;
        }
        a(motionEvent);
        return this.f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            a(motionEvent);
        }
        return true;
    }

    public LiveChatBannerContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveChatBannerContainerLayout(Context context) {
        this(context, null);
    }
}
