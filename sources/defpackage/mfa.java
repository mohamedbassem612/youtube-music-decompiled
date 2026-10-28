package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfa extends mfc {
    private final int c;
    private final int d;

    public mfa(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.mfc
    public final void a(long j) {
        long j2 = j + ((long) this.c);
        Memory.pokeByte(j2, (byte) (Memory.peekByte(j2) | this.d));
    }
}
