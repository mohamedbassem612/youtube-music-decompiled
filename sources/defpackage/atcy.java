package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atcy extends mew implements mes {
    public volatile atdm e;
    volatile mew f;
    public volatile mew g;
    public volatile mew h;
    public volatile mew i;
    public volatile mew j;
    public volatile mew k;
    public volatile mew l;
    public volatile mew m;
    volatile mew n;
    public volatile mew o;
    public volatile mew p;
    public volatile mew q;
    public volatile mew r;
    public volatile mew s;
    public volatile mew t;
    public volatile ateu u;

    public atcy() {
        super(atcx.a);
    }

    public final atdm aR() {
        if (this.e == null && (Memory.peekByte(this.c + 10) & 32) != 0) {
            this.e = new atdm(cp(true != a ? 96 : 184, atdl.a));
        }
        return this.e == null ? atdj.a : this.e;
    }

    public final mew aS() {
        if (this.n == null && (Memory.peekByte(this.c + 10) & 16) != 0) {
            this.n = new mew(cp(true != a ? 92 : 176, atcm.a));
        }
        return this.n == null ? atcl.a : this.n;
    }

    public final mew aT() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.f = new mew(cp(true != a ? 12 : 16, atcm.a));
        }
        return this.f == null ? atcl.a : this.f;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
