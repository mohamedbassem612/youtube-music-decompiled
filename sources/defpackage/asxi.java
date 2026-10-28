package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class asxi extends mew implements mes {
    public volatile atcs e;
    public volatile mew f;
    public volatile mew g;

    public asxi() {
        super(asxh.a);
    }

    public final boolean aT() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    public final boolean aU() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final atcs aV() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 16) != 0) {
            this.e = new atcs(cp(true != a ? 28 : 40, atcr.a));
        }
        return this.e == null ? atcq.a : this.e;
    }

    public asxi(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
