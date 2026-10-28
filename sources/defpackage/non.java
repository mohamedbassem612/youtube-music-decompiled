package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class non extends mew implements nfb {
    final AtomicReference d;
    volatile mew e;

    public non() {
        super(nom.a);
        this.d = new AtomicReference();
    }

    final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 12 : 16, noo.a, new ngh(10)));
        }
    }

    @Override // defpackage.nfb
    public final int g() {
        aR();
        return ((ArrayList) this.d.get()).size();
    }

    @Override // defpackage.nfb
    public final /* synthetic */ mzg h() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 24, nij.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.nfb
    public final /* bridge */ /* synthetic */ nfc i(int i) {
        aR();
        return (nop) ((ArrayList) this.d.get()).get(i);
    }

    @Override // defpackage.nfb
    public final boolean j() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public non(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
