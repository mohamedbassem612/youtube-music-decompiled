package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duj extends azw {
    public duv a;
    private final LinearLayoutManager b;

    public duj(LinearLayoutManager linearLayoutManager) {
        super(null);
        this.b = linearLayoutManager;
    }

    @Override // defpackage.azw
    public final void v(int i, float f, int i2) {
        if (this.a == null) {
            return;
        }
        float f2 = -f;
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.b;
            if (i3 >= linearLayoutManager.getChildCount()) {
                return;
            }
            View childAt = linearLayoutManager.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(linearLayoutManager.getChildCount())));
            }
            this.a.a(childAt, (linearLayoutManager.getPosition(childAt) - i) + f2);
            i3++;
        }
    }

    @Override // defpackage.azw
    public final void u(int i) {
    }

    @Override // defpackage.azw
    public final void w(int i) {
    }
}
