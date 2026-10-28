package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atje extends mew implements mes {
    public boolean e;
    public volatile mew f;
    public volatile mew g;
    public volatile mew h;
    public volatile mew i;
    public volatile atiq j;
    public volatile atiq k;
    public volatile atiq l;

    public atje() {
        super(atjd.a);
        this.e = false;
    }

    public void aR() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 24, this.j);
            this.e = false;
        }
    }

    public final boolean aS() {
        return (this.k == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    public final boolean aT() {
        return (this.l == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final boolean aU() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final mew aV() {
        if (this.h == null && (Memory.peekByte(this.c + 8) & 128) != 0) {
            this.h = new mew(cp(true != a ? 40 : 64, atcm.a));
        }
        return this.h == null ? atcl.a : this.h;
    }

    public final mew aW() {
        if (this.i == null && (Memory.peekByte(this.c + 9) & 1) != 0) {
            this.i = new mew(cp(true != a ? 44 : 72, atcm.a));
        }
        return this.i == null ? atcl.a : this.i;
    }

    public final mew aX() {
        if (this.g == null && (Memory.peekByte(this.c + 8) & 64) != 0) {
            this.g = new mew(cp(true != a ? 36 : 56, atcm.a));
        }
        return this.g == null ? atcl.a : this.g;
    }

    public final mew aY() {
        if (this.f == null) {
            if ((Memory.peekByte(this.c + 8) & 32) != 0) {
                this.f = new mew(cp(true == a ? 48 : 32, atcm.a));
            }
        }
        return this.f == null ? atcl.a : this.f;
    }

    public final int aZ() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 28L : 16L), false);
        if (iPeekInt == 0) {
            i = 1;
        } else if (iPeekInt == 1) {
            i = 2;
        } else if (iPeekInt == 2) {
            i = 3;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public final atiq ba() {
        if (this.k == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.k = new atiq(cp(true != a ? 16 : 32, atip.a));
        }
        if (this.k != null) {
            return this.k;
        }
        int i = atiq.i;
        return atin.a;
    }

    public final atiq bb() {
        if (this.l == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.l = new atiq(cp(true != a ? 20 : 40, atip.a));
        }
        if (this.l != null) {
            return this.l;
        }
        int i = atiq.i;
        return atin.a;
    }

    public final atiq bc() {
        if (this.j == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.j = new atiq(cp(true != a ? 12 : 24, atip.a));
        }
        if (this.j != null) {
            return this.j;
        }
        int i = atiq.i;
        return atin.a;
    }

    public atje(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
