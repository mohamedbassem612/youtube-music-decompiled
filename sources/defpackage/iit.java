package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iit implements iiw {
    @Override // defpackage.iiw
    public final ListenableFuture a(aosu aosuVar) {
        aost aostVarA = aost.a(aosuVar.f);
        if (aostVarA == null) {
            aostVarA = aost.UNKNOWN;
        }
        return ahng.n(aostVarA);
    }
}
