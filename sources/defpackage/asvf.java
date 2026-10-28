package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asvf extends mew implements mes {
    public final AtomicReference d;

    public asvf() {
        super(asve.a);
        this.d = new AtomicReference();
    }

    public final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(8, asvg.a, new njk(6)));
        }
    }

    public asvf(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
