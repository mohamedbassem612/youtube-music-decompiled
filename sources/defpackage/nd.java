package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nd {
    public final np a;
    private int c = Integer.MIN_VALUE;
    final Rect b = new Rect();

    public nd(np npVar) {
        this.a = npVar;
    }

    public static nd p(np npVar, int i) {
        return i != 0 ? new nc(npVar) : new nb(npVar);
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public abstract void n(int i);

    public final int o() {
        if (this.c == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.c;
    }

    public final void q() {
        this.c = k();
    }
}
