package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class atey extends mew implements mes {
    public atey() {
        super(atex.a);
    }

    public final int aT() {
        int iAS = a.aS(Memory.peekInt(this.c + 16, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.mew, defpackage.mxl
    public final float co() {
        throw null;
    }
}
