package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atbx extends mew implements mes {
    volatile atba e;
    volatile mew f;
    volatile mew g;
    volatile mew h;
    volatile mew i;
    public volatile ateu j;

    public atbx() {
        super(atbw.a);
        new AtomicReference();
    }

    public final boolean aR() {
        return (this.e == null && (Memory.peekByte(this.c + 9) & 64) == 0) ? false : true;
    }

    public final boolean aS() {
        return (this.i == null && (Memory.peekByte(this.c + 9) & 32) == 0) ? false : true;
    }

    public final boolean aT() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    public final boolean aU() {
        return (this.g == null && (Memory.peekByte(this.c + 9) & 4) == 0) ? false : true;
    }

    public final boolean aV() {
        return (this.h == null && (Memory.peekByte(this.c + 9) & 8) == 0) ? false : true;
    }

    public final int aW() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 24L : 20L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    public final atba aX() {
        if (this.e == null) {
            if ((Memory.peekByte(this.c + 9) & 64) != 0) {
                this.e = new atba(cp(true == a ? 96 : 64, ataz.a));
            }
        }
        return this.e == null ? atay.a : this.e;
    }

    public final mew aY() {
        if (this.i == null && (Memory.peekByte(this.c + 9) & 32) != 0) {
            this.i = new mew(cp(true != a ? 60 : 88, atbj.a));
        }
        return this.i == null ? atbi.a : this.i;
    }

    public final mew aZ() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 128) != 0) {
            this.f = new mew(cp(true != a ? 36 : 64, atcm.a));
        }
        return this.f == null ? atcl.a : this.f;
    }

    public final mew ba() {
        if (this.g == null && (Memory.peekByte(this.c + 9) & 4) != 0) {
            this.g = new mew(cp(true != a ? 48 : 72, atcm.a));
        }
        return this.g == null ? atcl.a : this.g;
    }

    public final mew bb() {
        if (this.h == null && (Memory.peekByte(this.c + 9) & 8) != 0) {
            this.h = new mew(cp(true != a ? 52 : 80, atcm.a));
        }
        return this.h == null ? atcl.a : this.h;
    }

    public final int bc() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 44L : 32L), false);
        if (iPeekInt == 0) {
            i = 1;
        } else if (iPeekInt == 1) {
            i = 2;
        } else if (iPeekInt == 2) {
            i = 3;
        } else if (iPeekInt == 3) {
            i = 4;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final int bd() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 40L : 28L), false);
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

    public atbx(UpbMessage upbMessage) {
        super(upbMessage);
        new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
