package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vzp implements tvh {
    final /* synthetic */ hed a;

    public vzp(hed hedVar) {
        this.a = hedVar;
    }

    @Override // defpackage.tvh
    public final ListenableFuture a() {
        return this.a.A();
    }

    @Override // defpackage.tvh
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        wvl wvlVarB = this.a.B();
        wvlVarB.c = (Boolean) obj;
        return wvlVarB.a();
    }
}
