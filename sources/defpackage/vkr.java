package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkr {
    public final vkm a;
    public final agke b;
    public final auir c;
    public final ListenableFuture d;
    public final boolean e;
    public final zs f;

    public vkr(zs zsVar, agke agkeVar, auir auirVar, vkm vkmVar, ListenableFuture listenableFuture, boolean z) {
        this.f = zsVar;
        this.b = agkeVar;
        this.c = auirVar;
        this.a = vkmVar;
        this.d = listenableFuture;
        this.e = z;
    }

    public final vkq a() {
        vkq vkqVarF = this.f.F(this.c);
        vkqVarF.getClass();
        return vkqVarF;
    }

    public final Optional b(auir auirVar) {
        return auirVar == auir.FONT_FAMILY_UNSPECIFIED ? Optional.empty() : Optional.ofNullable(this.f.F(auirVar));
    }
}
