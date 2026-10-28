package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class asxa extends mew implements mes {
    public boolean e;
    public volatile atgg f;

    public asxa() {
        super(aswz.a);
        this.e = false;
    }

    public void aS() {
        if (this.e) {
            bO(8, 4);
            bR(true != a ? 20 : 24, this.f);
            this.e = false;
        }
    }

    public final boolean aT() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final int aU() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 24L : 20L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    public final atgg aV() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.f = new atgg(cp(true != a ? 20 : 24, atgf.a));
        }
        if (this.f != null) {
            return this.f;
        }
        int i = atgg.l;
        return atge.a;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
    }

    public asxa(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
