package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njo extends mew implements nad {
    public njo() {
        super(njn.a);
    }

    @Override // defpackage.nad
    public final boolean g() {
        return Memory.peekByte(this.c + 9) != 0;
    }
}
