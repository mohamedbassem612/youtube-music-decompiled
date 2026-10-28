package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hri implements aant {
    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        return aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        return ahng.n(aanp.a);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        agjz agjzVar = new agjz(4);
        for (int i = 0; i < ((agpi) agkeVar).d; i++) {
            agjzVar.h(aanp.a);
        }
        return ahng.n(agjzVar.g());
    }
}
