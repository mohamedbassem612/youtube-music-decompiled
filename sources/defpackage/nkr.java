package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkr extends mew implements nbe {
    static final mfc d = nkq.a.d(1);
    ArrayList e;

    final void aR() {
        if (this.e == null) {
            this.e = bD(d.b);
        }
    }

    @Override // defpackage.nbe
    public final int g() {
        aR();
        return this.e.size();
    }

    @Override // defpackage.nbe
    public final int h(int i) {
        aR();
        int iBe = a.be(((Integer) this.e.get(i)).intValue());
        if (iBe == 0) {
            return 1;
        }
        return iBe;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
