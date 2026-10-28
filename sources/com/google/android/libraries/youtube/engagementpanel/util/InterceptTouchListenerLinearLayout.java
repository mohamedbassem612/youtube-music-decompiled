package com.google.android.libraries.youtube.engagementpanel.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import defpackage.vvk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class InterceptTouchListenerLinearLayout extends LinearLayout {
    private vvk a;

    public InterceptTouchListenerLinearLayout(Context context) {
        super(context);
    }

    public final void a(vvk vvkVar) {
        this.a = vvkVar;
        setOnTouchListener(vvkVar);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vvk vvkVar = this.a;
        return vvkVar != null ? vvkVar.a(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    public InterceptTouchListenerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptTouchListenerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
