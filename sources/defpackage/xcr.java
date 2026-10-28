package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcr extends qa {
    private final int a;

    public xcr(int i) {
        super((byte[]) null);
        this.a = i;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        rect.getClass();
        view.getClass();
        oeVar.getClass();
        super.c(rect, view, recyclerView, oeVar);
        if (recyclerView.c(view) <= 0) {
            int i = bac.a;
            if (recyclerView.getLayoutDirection() == 0) {
                rect.left = this.a;
                rect.right = 0;
            } else {
                rect.left = 0;
                rect.right = this.a;
            }
        }
    }
}
