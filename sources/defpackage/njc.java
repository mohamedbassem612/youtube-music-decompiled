package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class njc extends mew implements mzu {
    static final mfc d = njb.a.d(1);
    volatile String e;

    @Override // defpackage.mzu
    public final String a() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }
}
