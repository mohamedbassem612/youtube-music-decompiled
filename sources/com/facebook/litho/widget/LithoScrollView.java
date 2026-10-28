package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.ComponentTree;
import defpackage.abh;
import defpackage.fiv;
import defpackage.fjn;
import defpackage.fjw;
import defpackage.fpr;
import defpackage.fqm;
import defpackage.fvc;
import defpackage.fvd;
import defpackage.heg;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class LithoScrollView extends NestedScrollView implements fiv {
    public final fjw h;
    public ViewTreeObserver.OnPreDrawListener i;
    public boolean j;
    public fqm k;
    public abh l;
    public heg m;

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fjw fjwVar = new fjw(context);
        this.h = fjwVar;
        addView(fjwVar);
    }

    @Override // defpackage.fiv
    public final void a(List list) {
        list.add(this.h);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        heg hegVar = this.m;
        if (hegVar != null) {
            hegVar.h(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        try {
            super.draw(canvas);
            fqm fqmVar = this.k;
            if (fqmVar != null) {
                fqmVar.a(this);
            }
        } catch (Throwable th) {
            fjw fjwVar = this.h;
            ComponentTree componentTree = fjwVar.w;
            if (componentTree == null) {
                throw th;
            }
            fvd fvdVarA = fvc.a();
            String strValueOf = String.valueOf(componentTree.g());
            fvdVarA.a(2, "Root component: ".concat(strValueOf), th, fpr.a(fjwVar.y));
            throw new fjn(null, componentTree, th);
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void j(int i) {
        super.j(i);
        fqm fqmVar = this.k;
        if (fqmVar != null) {
            fqmVar.d();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) throws Throwable {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.j) {
            this.h.D();
        }
        abh abhVar = this.l;
        if (abhVar != null) {
            abhVar.a = getScrollY();
        }
        fqm fqmVar = this.k;
        if (fqmVar != null) {
            fqmVar.b(this);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        fqm fqmVar = this.k;
        if (fqmVar != null) {
            fqmVar.c(this, motionEvent);
        }
        return zOnTouchEvent;
    }

    @Override // defpackage.fit
    public final heg x() {
        return this.m;
    }

    @Override // defpackage.fit
    public final void y(heg hegVar) {
        this.m = hegVar;
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoScrollView(Context context) {
        this(context, null);
    }
}
