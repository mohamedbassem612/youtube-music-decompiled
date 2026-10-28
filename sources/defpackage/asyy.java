package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class asyy extends mew implements mes {
    public volatile mew e;

    public asyy() {
        super(asyx.a);
    }

    public final boolean aS() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final mew aT() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.e = new mew(cp(true != a ? 20 : 24, asyr.a));
        }
        return this.e == null ? asyp.a : this.e;
    }

    public asyy(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
