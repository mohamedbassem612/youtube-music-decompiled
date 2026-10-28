package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asxu extends mew implements mes {
    ArrayList d;

    public asxu() {
        super(asxt.a);
    }

    public final int aR(int i) {
        aT();
        return ((Integer) this.d.get(i)).intValue();
    }

    public final int aS() {
        aT();
        return this.d.size();
    }

    final void aT() {
        if (this.d == null) {
            this.d = bD(8);
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
