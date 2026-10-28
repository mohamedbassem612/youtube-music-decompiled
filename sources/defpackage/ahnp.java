package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahnp implements knw {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.knw
    public final void a(boolean z) {
        synchronized (ahnr.a) {
            for (ahnr ahnrVar : new ArrayList(ahnr.b.values())) {
                if (ahnrVar.d.get()) {
                    for (hhb hhbVar : ahnrVar.f) {
                        if (!z) {
                            ((ahqz) ((ahnr) hhbVar.a).e.a()).c();
                        }
                    }
                }
            }
        }
    }
}
