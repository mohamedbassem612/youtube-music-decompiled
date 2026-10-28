package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atnq extends mew implements mes {
    boolean e;
    volatile asxe f;
    public volatile asxe g;
    volatile asxe h;

    public atnq() {
        super(atnp.a);
        this.e = false;
    }

    public void aS() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 24, this.f);
            this.e = false;
        }
    }

    public final boolean aU() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final boolean aV() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final asxe aW() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.f = new asxe(cp(true != a ? 12 : 24, asxd.a));
        }
        if (this.f != null) {
            return this.f;
        }
        int i = asxe.A;
        return asxc.a;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
    }

    public atnq(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
