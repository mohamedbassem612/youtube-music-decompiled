package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atmi extends mew implements mes {
    boolean e;
    volatile mew f;
    volatile mew g;
    volatile mew h;
    public volatile atks i;
    public volatile atna j;
    public volatile atlh k;
    volatile arzk l;

    public atmi() {
        super(atmh.a);
        this.e = false;
    }

    public void aS() {
        if (this.e) {
            bO(9, 2);
            bR(true != a ? 40 : 64, this.k);
            this.e = false;
        }
    }

    public final boolean aV() {
        return (this.k == null && (Memory.peekByte(this.c + 9) & 2) == 0) ? false : true;
    }

    public final boolean aW() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    public final boolean aX() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    public final boolean aY() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    public final mew aZ() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 32) != 0) {
            this.f = new mew(cp(true != a ? 24 : 40, atcm.a));
        }
        return this.f == null ? atcl.a : this.f;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
    }

    public final mew ba() {
        if (this.g == null && (Memory.peekByte(this.c + 8) & 64) != 0) {
            this.g = new mew(cp(true != a ? 28 : 48, atcm.a));
        }
        return this.g == null ? atcl.a : this.g;
    }

    public final mew bb() {
        if (this.h == null && (Memory.peekByte(this.c + 8) & 128) != 0) {
            this.h = new mew(cp(true != a ? 32 : 56, atcm.a));
        }
        return this.h == null ? atcl.a : this.h;
    }

    public final atna bc() {
        if (this.j == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.j = new atna(cp(true != a ? 20 : 32, atmz.a));
        }
        return this.j == null ? atmy.a : this.j;
    }

    public atmi(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
