package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atim extends atiq implements mes {
    public boolean d = false;
    public boolean e = false;

    @Override // defpackage.atiq
    public final void aR() {
        if (this.g) {
            if (this.d) {
                this.d = false;
                bG();
            }
            AtomicReference atomicReference = this.f;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 12 : 40);
            } else {
                bS(1, (ArrayList) atomicReference.get());
            }
            this.g = false;
        }
    }
}
