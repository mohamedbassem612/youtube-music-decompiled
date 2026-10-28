package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyz extends ViewGroup {
    public final Context a;
    public View b;
    public PopupWindow c;
    View d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Rect q;

    public adyz(Context context) {
        super(context);
        this.a = context;
        this.d = null;
    }

    public final void a(View view) {
        removeAllViews();
        addView(view);
        view.setMinimumWidth(this.j);
        this.d = view;
        if (this.o) {
            this.l = aecm.j(this.a, this.b);
            this.m = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.d;
        if (view != null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.p) {
                int i7 = this.i;
                int i8 = this.h;
                view.layout(i7, i8, i5 - i7, i6 - i8);
            } else {
                view.layout(0, 0, i5, i6);
            }
            if (z) {
                if (!this.p) {
                    i5 += this.i << 1;
                    i6 += this.h << 1;
                }
                int i9 = i5;
                int i10 = i6;
                Point pointL = aecm.l(this.a, this.b, this.l, i9, i10, this.e, this.f, this.g, this.n, this.o);
                if (this.p) {
                    pointL.offset(-this.q.left, -this.q.top);
                    i9 += this.q.left + this.q.right;
                    i10 += this.q.top + this.q.bottom;
                }
                this.c.update(pointL.x, pointL.y, i9, i10, true);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.d;
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        Context context = this.a;
        Size sizeM = aecm.m(context, this.b, this.l, this.e, this.f, this.g, this.o);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.k, Integer.MIN_VALUE), 0);
        if (!this.m) {
            if (view.getMeasuredHeight() > sizeM.getHeight() - (this.h << 1)) {
                int i3 = this.l;
                int i4 = 8;
                if (i3 != 3 && i3 != 6) {
                    i4 = 7;
                }
                int i5 = i4;
                this.l = i5;
                sizeM = aecm.m(context, this.b, i5, this.e, this.f, this.g, this.o);
            }
            this.m = true;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min(sizeM.getWidth() - (this.i << 1), this.k), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(sizeM.getHeight() - (this.h << 1), Integer.MIN_VALUE));
        if (this.p) {
            setMeasuredDimension(view.getMeasuredWidth() + (this.i << 1), view.getMeasuredHeight() + (this.h << 1));
        } else {
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
