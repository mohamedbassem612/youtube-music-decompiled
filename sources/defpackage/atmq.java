package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atmq extends mew implements mes {
    public final AtomicReference e;

    public atmq() {
        super(atmp.a);
        this.e = new AtomicReference();
    }

    public final void aR() {
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(8, atcm.a, new njk(15)));
        }
    }

    public atmq(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
