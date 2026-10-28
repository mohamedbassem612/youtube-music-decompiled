package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adus extends qa {
    public int a;
    public int b;

    public adus(int i, int i2) {
        super((byte[]) null);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        rect.getClass();
        view.getClass();
        oeVar.getClass();
        np npVar = recyclerView.n;
        GridLayoutManager gridLayoutManager = npVar instanceof GridLayoutManager ? (GridLayoutManager) npVar : null;
        if (gridLayoutManager == null) {
            super.c(rect, view, recyclerView, oeVar);
            return;
        }
        int iC = recyclerView.c(view);
        if (iC != -1) {
            mm mmVar = gridLayoutManager.g;
            int i = gridLayoutManager.b;
            int iB = mmVar.b(iC);
            if (i <= 1 || iB == i) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = this.b;
            } else {
                rect.left = 0;
                rect.right = this.a;
                rect.bottom = this.b;
            }
        }
    }
}
