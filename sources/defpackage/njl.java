package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class njl extends mew implements naa {
    final AtomicReference d;

    public njl() {
        super(njj.a);
        this.d = new AtomicReference();
    }

    @Override // defpackage.naa
    public final int a() {
        aR();
        return ((ArrayList) this.d.get()).size();
    }

    final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(8, njd.a, new njk(0)));
        }
    }

    @Override // defpackage.naa
    public final /* bridge */ /* synthetic */ nje b(int i) {
        aR();
        return (nje) ((ArrayList) this.d.get()).get(i);
    }

    public njl(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
