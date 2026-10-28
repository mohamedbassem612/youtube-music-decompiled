package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asxr extends mew implements mes {
    ArrayList d;
    public ArrayList e;

    public asxr() {
        super(asxq.a);
    }

    public final int aR(int i) {
        aU();
        return ((Integer) this.e.get(i)).intValue();
    }

    public final int aS(int i) {
        aV();
        return ((Integer) this.d.get(i)).intValue();
    }

    public final int aT() {
        aV();
        return this.d.size();
    }

    public final void aU() {
        if (this.e == null) {
            this.e = bD(true != a ? 12 : 16);
        }
    }

    final void aV() {
        if (this.d == null) {
            this.d = bD(8);
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
