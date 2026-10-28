package com.google.android.libraries.youtube.rendering.ui.widget.loadingframe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aeiz;
import defpackage.aeja;
import defpackage.aejb;
import defpackage.aejc;
import defpackage.taq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class LoadingFrameLayout extends FrameLayout {
    private aejb a;
    private aejb b;
    public final Context c;
    public int d;
    private aeiz e;

    public LoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        context.getClass();
        this.c = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aejc.a, i, 0);
        h(typedArrayObtainStyledAttributes.getResourceId(2, R.layout.loading_frame_status_progress_view));
        d(typedArrayObtainStyledAttributes.getResourceId(0, R.layout.loading_frame_status_empty_view));
        f(typedArrayObtainStyledAttributes.getResourceId(1, R.layout.loading_frame_status_error_view));
        typedArrayObtainStyledAttributes.recycle();
        c();
    }

    private final void d(int i) {
        this.a = new aejb(this, 4, i, R.id.empty_message_text);
    }

    private final void h(int i) {
        this.b = new aejb(this, 1, i, 0);
    }

    public void a() {
        g(2);
    }

    public void b(CharSequence charSequence, boolean z) {
        this.e.c(charSequence);
        this.e.b(z);
        g(3);
    }

    public void c() {
        taq.d();
        g(1);
    }

    public final void e(aeja aejaVar) {
        this.e.a = aejaVar;
    }

    public final void f(int i) {
        this.e = new aeiz(this, i);
    }

    public final void g(int i) {
        if (this.d != i) {
            int i2 = i == 2 ? 0 : 8;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setVisibility(i2);
            }
            this.b.d(i);
            this.e.d(i);
            aejb aejbVar = this.a;
            if (aejbVar != null) {
                aejbVar.d(i);
            }
            this.d = i;
        }
    }

    public LoadingFrameLayout(Context context, int i, int i2) {
        super(context);
        this.d = 0;
        context.getClass();
        this.c = context;
        h(i2);
        f(i);
    }

    public LoadingFrameLayout(Context context, int i, int i2, int i3) {
        this(context, i, i2);
        d(i3);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingFrameLayout(Context context) {
        this(context, R.layout.loading_frame_status_error_view, R.layout.loading_frame_status_progress_view, R.layout.loading_frame_status_empty_view);
    }
}
