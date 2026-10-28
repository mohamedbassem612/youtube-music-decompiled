package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nko extends mew implements nbd {
    volatile nkr d;

    public nko() {
        super(nkn.a);
        new AtomicReference();
    }

    @Override // defpackage.nbd
    public final /* synthetic */ nbe g() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nkr nkrVar = new nkr(cp(true != a ? 20 : 24, nkq.a));
        this.d = nkrVar;
        return nkrVar;
    }

    @Override // defpackage.nbd
    public final boolean h() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public nko(UpbMessage upbMessage) {
        super(upbMessage);
        new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
