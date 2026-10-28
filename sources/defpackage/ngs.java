package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ngs extends mew implements mxi {
    ArrayList d;

    final void aR() {
        if (this.d == null) {
            this.d = bD(8);
        }
    }

    @Override // defpackage.mxi
    public final int g(int i) {
        aR();
        return ((Integer) this.d.get(i)).intValue();
    }

    @Override // defpackage.mxi
    public final int h() {
        aR();
        return this.d.size();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
