package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jeu extends qa {
    private final int a;

    public jeu(int i) {
        super((byte[]) null);
        this.a = i;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        int i = bac.a;
        int layoutDirection = recyclerView.getLayoutDirection();
        int i2 = this.a;
        if (layoutDirection == 0) {
            rect.left = i2;
        } else {
            rect.right = i2;
        }
    }
}
