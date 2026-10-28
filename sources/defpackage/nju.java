package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nju extends mew implements nah {
    final AtomicReference d;

    public nju() {
        super(njt.a);
        this.d = new AtomicReference();
    }

    @Override // defpackage.nah
    public final int a() {
        aR();
        return ((ArrayList) this.d.get()).size();
    }

    final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 12 : 16, njv.a, new njk(2)));
        }
    }

    @Override // defpackage.nah
    public final /* bridge */ /* synthetic */ nai b(int i) {
        aR();
        return (njw) ((ArrayList) this.d.get()).get(i);
    }

    public nju(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
