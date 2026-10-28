package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ngq extends mew implements mxh {
    ArrayList d;
    ArrayList e;

    final void aR() {
        if (this.e == null) {
            this.e = bD(true != a ? 12 : 16);
        }
    }

    final void aS() {
        if (this.d == null) {
            this.d = bD(8);
        }
    }

    @Override // defpackage.mxh
    public final int g(int i) {
        aR();
        return ((Integer) this.e.get(i)).intValue();
    }

    @Override // defpackage.mxh
    public final int h() {
        aR();
        return this.e.size();
    }

    @Override // defpackage.mxh
    public final int i(int i) {
        aS();
        return ((Integer) this.d.get(i)).intValue();
    }

    @Override // defpackage.mxh
    public final int j() {
        aS();
        return this.d.size();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
