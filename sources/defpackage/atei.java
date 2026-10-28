package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atei extends mew implements mes {
    boolean d;
    boolean e;
    volatile atna f;
    volatile atks g;

    public atei() {
        super(ateh.a);
        this.d = false;
        this.e = false;
    }

    public void aR() {
        if (this.e) {
            bO(8, 2);
            bR(true != a ? 16 : 24, this.g);
            this.e = false;
        }
    }

    public void aS() {
        if (this.d) {
            bO(8, 1);
            bR(true != a ? 12 : 16, this.f);
            this.d = false;
        }
    }

    public final boolean aW() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    public final boolean aX() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final atks aY() {
        if (this.g == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.g = new atks(cp(true != a ? 16 : 24, atkr.a));
        }
        return this.g == null ? atkq.a : this.g;
    }

    public final atna aZ() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.f = new atna(cp(true != a ? 12 : 16, atmz.a));
        }
        return this.f == null ? atmy.a : this.f;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
        aR();
    }

    public atei(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
        this.e = false;
    }
}
