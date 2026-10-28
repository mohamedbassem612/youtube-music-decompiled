package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aswq extends mew implements mes {
    public volatile aswt e;
    public volatile aswe f;
    public volatile aswb g;
    volatile aswt h;
    public volatile mew i;
    public volatile mew j;
    public volatile mew k;
    public volatile mew l;

    public aswq() {
        super(aswp.a);
    }

    public final boolean aR() {
        return (this.h == null && (Memory.peekByte(this.c + 9) & 32) == 0) ? false : true;
    }

    public final boolean aS() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final aswt aT() {
        if (this.h == null && (Memory.peekByte(this.c + 9) & 32) != 0) {
            this.h = new aswt(cp(true != a ? 56 : 88, asws.a));
        }
        if (this.h != null) {
            return this.h;
        }
        mfc mfcVar = aswt.e;
        return aswr.a;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
