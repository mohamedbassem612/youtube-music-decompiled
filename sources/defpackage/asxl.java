package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class asxl extends mew implements mes {
    public boolean e;
    public volatile mew f;

    public asxl() {
        super(asxk.a);
        this.e = false;
    }

    public void aR() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 16, this.f);
            this.e = false;
        }
    }

    public final boolean aS() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final mew aT() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.f = new mew(cp(true != a ? 12 : 16, aszg.a), (boolean[]) null);
        }
        return this.f == null ? aszf.a : this.f;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public asxl(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
