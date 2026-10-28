package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bor implements dor {
    @Override // defpackage.dor
    public final void a(dow dowVar) {
        if (!(dowVar instanceof bpp)) {
            Objects.toString(dowVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(dowVar.toString()));
        }
        bou.b(dowVar, (bpp) dowVar);
        alh.c(dowVar);
    }
}
