package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class atjv extends mew implements mes {
    volatile atey e;
    volatile atey f;
    public volatile ateu g;

    public atjv() {
        super(atju.a);
    }

    public final boolean aR() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    public final atey aS() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.e = new atey(cp(true != a ? 16 : 64, atex.a));
        }
        return this.e == null ? atew.a : this.e;
    }

    public final atey aT() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.f = new atey(cp(true != a ? 20 : 72, atex.a));
        }
        return this.f == null ? atew.a : this.f;
    }

    @Override // defpackage.mew, defpackage.mxk
    public final boolean cm() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
