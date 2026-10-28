package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nog extends mew implements nev {
    final AtomicReference d;

    public nog() {
        super(nof.a);
        this.d = new AtomicReference();
    }

    @Override // defpackage.nev
    public final int a() {
        aR();
        return ((ArrayList) this.d.get()).size();
    }

    final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 12 : 16, nod.a, new njk(3)));
        }
    }

    @Override // defpackage.nev
    public final /* bridge */ /* synthetic */ nes b() {
        aR();
        return (noe) ((ArrayList) this.d.get()).get(0);
    }

    public nog(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
