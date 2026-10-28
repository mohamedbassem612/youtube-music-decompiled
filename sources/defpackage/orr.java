package defpackage;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class orr {
    public agfr a;
    public Object b;
    public agfr c;
    public agfr d;
    public SparseArray e;
    public int f;
    public mew g;
    private int h;
    private int i;
    private float j;
    private byte k;

    public final ors a() {
        if (this.k == 7) {
            return new ors(this.a, this.b, this.c, this.g, this.f, this.d, this.e, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" viewKey");
        }
        if ((this.k & 2) == 0) {
            sb.append(" nodeId");
        }
        if ((this.k & 4) == 0) {
            sb.append(" displayDensity");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.j = f;
        this.k = (byte) (this.k | 4);
    }

    public final void c(int i) {
        this.i = i;
        this.k = (byte) (this.k | 2);
    }

    public final void d(int i) {
        this.h = i;
        this.k = (byte) (this.k | 1);
    }

    @Deprecated
    public final void e(View view) {
        this.a = view == null ? null : new agfu(view);
    }
}
