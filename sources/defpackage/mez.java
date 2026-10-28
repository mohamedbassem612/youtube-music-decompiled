package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mez extends mfc {
    private final int c;

    public mez(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.mfc
    public final void a(long j) {
        Memory.pokeInt(j + ((long) this.c), this.a, false);
    }
}
