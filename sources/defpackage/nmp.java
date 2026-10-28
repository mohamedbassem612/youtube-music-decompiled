package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmp extends mew implements ndd {
    final AtomicReference d;

    public nmp() {
        super(nmo.a);
        this.d = new AtomicReference();
    }

    final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(8, nmm.a, new ngh(9)));
        }
    }

    @Override // defpackage.ndd
    public final int g() {
        aR();
        return ((ArrayList) this.d.get()).size();
    }

    @Override // defpackage.ndd
    public final /* bridge */ /* synthetic */ ncz h(int i) {
        aR();
        return (mew) ((ArrayList) this.d.get()).get(i);
    }

    public nmp(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
