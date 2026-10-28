package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asvc extends mew implements mes {
    public final AtomicReference d;

    public asvc() {
        super(asvb.a);
        this.d = new AtomicReference();
    }

    public final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(8, asus.a, new njk(5)));
        }
    }

    public asvc(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
