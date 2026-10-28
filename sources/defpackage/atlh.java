package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atlh extends mew implements mes {
    boolean d;
    public volatile atln e;

    public atlh() {
        super(atlg.a);
        this.d = false;
    }

    public void aR() {
        if (this.d) {
            bO(8, 8);
            bR(true != a ? 24 : 32, this.e);
            this.d = false;
        }
    }

    public final atln aV() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 8) != 0) {
            this.e = new atln(cp(true != a ? 24 : 32, atlm.a));
        }
        return this.e == null ? atlk.a : this.e;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public atlh(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
    }
}
