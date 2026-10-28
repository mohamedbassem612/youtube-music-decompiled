package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dkt extends qa {
    public Drawable a;
    public int b;
    public boolean c;
    final /* synthetic */ dky d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkt(dky dkyVar) {
        super((byte[]) null);
        this.d = dkyVar;
        this.c = true;
    }

    private final boolean m(View view, RecyclerView recyclerView) {
        oh ohVarJ = recyclerView.j(view);
        if (!(ohVarJ instanceof dlj) || !((dlj) ohVarJ).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild < recyclerView.getChildCount() - 1) {
            z = true;
            oh ohVarJ2 = recyclerView.j(recyclerView.getChildAt(iIndexOfChild + 1));
            if (!(ohVarJ2 instanceof dlj) || !((dlj) ohVarJ2).u) {
                return false;
            }
        }
        return z;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        if (m(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.qa
    public final void n(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (m(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.b + y);
                    this.a.draw(canvas);
                }
            }
        }
    }
}
