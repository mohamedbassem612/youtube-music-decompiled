package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class atax extends mew implements mes {
    final AtomicReference f;
    boolean g;

    public atax() {
        super(ataw.a);
        this.f = new AtomicReference();
        this.g = false;
    }

    public void aR() {
        if (this.g) {
            AtomicReference atomicReference = this.f;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(8);
            } else {
                aN((ArrayList) atomicReference.get());
            }
            this.g = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public atax(UpbMessage upbMessage) {
        super(upbMessage);
        this.f = new AtomicReference();
        this.g = false;
    }
}
