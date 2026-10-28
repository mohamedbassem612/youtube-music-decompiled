package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iwv extends qa {
    private final int a;
    private final int b;
    private final int c;

    public iwv(int i, int i2, int i3) {
        super((byte[]) null);
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        int i = this.a;
        rect.left = i;
        rect.right = i;
        if (this.c > 1) {
            int i2 = this.b;
            rect.top = i2;
            rect.bottom = i2;
        }
    }
}
