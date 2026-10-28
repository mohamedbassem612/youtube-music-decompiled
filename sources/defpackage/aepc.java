package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aepc implements ahcy {
    final /* synthetic */ String a;
    final /* synthetic */ aepd b;

    public aepc(aepd aepdVar, String str) {
        this.a = str;
        this.b = aepdVar;
    }

    @Override // defpackage.ahcy
    public final /* bridge */ /* synthetic */ ListenableFuture a(Object obj) {
        aciz acizVar = (aciz) obj;
        return acizVar != null ? ahng.n(acizVar) : this.b.b(this.a, false);
    }
}
