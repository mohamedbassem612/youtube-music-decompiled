package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class feg implements fem {
    private final int a;
    private final int b;
    public fdx c;

    public feg(int i, int i2) {
        if (!ffs.i(i, i2)) {
            throw new IllegalArgumentException(a.bQ(i2, i, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.fem
    public final fdx d() {
        return this.c;
    }

    @Override // defpackage.fem
    public final void f(fdx fdxVar) {
        this.c = fdxVar;
    }

    @Override // defpackage.fem
    public final void g(fed fedVar) {
        fedVar.d(this.a, this.b);
    }

    @Override // defpackage.fcz
    public final void k() {
    }

    @Override // defpackage.fcz
    public final void l() {
    }

    @Override // defpackage.fcz
    public final void m() {
    }

    @Override // defpackage.fem
    public void a(Drawable drawable) {
    }

    @Override // defpackage.fem
    public void e(Drawable drawable) {
    }

    @Override // defpackage.fem
    public final void h(fed fedVar) {
    }
}
