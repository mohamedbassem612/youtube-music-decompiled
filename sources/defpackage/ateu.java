package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ateu extends mew implements mes {
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public volatile atey i;
    public volatile atey j;
    public volatile atey k;
    public volatile atey l;
    public volatile atey m;
    public volatile atey n;
    public volatile atey o;
    public volatile atey p;
    public volatile atey q;

    public ateu() {
        super(atet.a);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
    }

    public void aR() {
        if (this.f) {
            bO(8, 4);
            bR(true != a ? 20 : 32, this.k);
            this.f = false;
        }
    }

    public void aS() {
        if (this.h) {
            bO(8, 32);
            bR(true == a ? 56 : 32, this.n);
            this.h = false;
        }
    }

    public void aT() {
        if (this.g) {
            bO(8, 16);
            bR(true != a ? 28 : 48, this.m);
            this.g = false;
        }
    }

    public void aU() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 16, this.i);
            this.e = false;
        }
    }

    public final atey aV() {
        if (this.k == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.k = new atey(cp(true != a ? 20 : 32, atex.a));
        }
        return this.k == null ? atew.a : this.k;
    }

    public final atey aW() {
        if (this.n == null) {
            if ((Memory.peekByte(this.c + 8) & 32) != 0) {
                this.n = new atey(cp(true == a ? 56 : 32, atex.a));
            }
        }
        return this.n == null ? atew.a : this.n;
    }

    public final atey aX() {
        if (this.m == null && (Memory.peekByte(this.c + 8) & 16) != 0) {
            this.m = new atey(cp(true != a ? 28 : 48, atex.a));
        }
        return this.m == null ? atew.a : this.m;
    }

    public final atey aY() {
        if (this.i == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.i = new atey(cp(true != a ? 12 : 16, atex.a));
        }
        return this.i == null ? atew.a : this.i;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aU();
        aR();
        aT();
        aS();
    }

    public ateu(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
    }
}
