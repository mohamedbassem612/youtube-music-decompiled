package com.google.android.apps.youtube.music.ui.components.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.advm;
import defpackage.ixv;
import defpackage.ixx;
import defpackage.ixy;
import defpackage.ixz;
import defpackage.iyd;
import defpackage.jij;
import defpackage.vxz;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LoadingFrameLayout extends ixv {
    public final Context a;
    public ixz b;
    public ixx c;
    public int d;
    public vxz e;
    public jij f;
    private ixz g;

    public LoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 1;
        context.getClass();
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iyd.a, i, 0);
        k(typedArrayObtainStyledAttributes.getResourceId(2, R.layout.loading_status_progress_view));
        i(typedArrayObtainStyledAttributes.getResourceId(0, R.layout.loading_status_empty_view));
        j(typedArrayObtainStyledAttributes.getResourceId(1, R.layout.loading_status_swipe_refresh_view));
        typedArrayObtainStyledAttributes.recycle();
        h(2);
    }

    private final void i(int i) {
        this.b = new ixz(this, 5, i, R.id.empty_message_text);
    }

    private final void j(int i) {
        this.c = new ixx(this, i);
    }

    private final void k(int i) {
        this.g = new ixz(this, 2, i, 0);
    }

    public final void c(advm advmVar) {
        this.c.c = advmVar;
    }

    public final void d(ixy ixyVar) {
        this.c.d = ixyVar;
    }

    public final void e(Supplier supplier) {
        ixz ixzVar = this.b;
        if (ixzVar != null) {
            ixzVar.g = supplier;
        }
        ixz ixzVar2 = this.g;
        if (ixzVar2 != null) {
            ixzVar2.g = supplier;
        }
        ixx ixxVar = this.c;
        if (ixxVar != null) {
            ixxVar.g = supplier;
        }
    }

    public final void f(CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        g(charSequence, null, 0, z, z2, z3, Boolean.FALSE);
    }

    public final void g(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, boolean z2, boolean z3, Boolean bool) {
        this.c.h(charSequence);
        this.c.g(charSequence2);
        this.c.e(z);
        this.c.f(z2);
        this.c.c(z3);
        this.c.b(i);
        this.c.d(bool.booleanValue());
        h(4);
    }

    public final void h(int i) {
        if (this.d != i) {
            int i2 = i == 3 ? 0 : 8;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setVisibility(i2);
            }
            this.g.i(i);
            this.c.i(i);
            ixz ixzVar = this.b;
            if (ixzVar != null) {
                ixzVar.i(i);
            }
            this.d = i;
        }
    }

    public LoadingFrameLayout(Context context, int i, int i2) {
        super(context);
        this.d = 1;
        context.getClass();
        this.a = context;
        k(i2);
        j(i);
    }

    public LoadingFrameLayout(Context context, int i, int i2, int i3) {
        super(context);
        this.d = 1;
        context.getClass();
        this.a = context;
        k(i2);
        i(i3);
        j(i);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingFrameLayout(Context context) {
        super(context);
        this.d = 1;
        context.getClass();
        this.a = context;
        k(R.layout.loading_status_progress_view);
        i(R.layout.loading_status_empty_view);
        j(R.layout.loading_status_swipe_refresh_view);
    }
}
