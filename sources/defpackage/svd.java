package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class svd implements svn {
    final /* synthetic */ ajwo a;
    final /* synthetic */ sve b;

    public svd(sve sveVar, ajwo ajwoVar) {
        this.a = ajwoVar;
        this.b = sveVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ttm] */
    @Override // defpackage.svn
    public final void a(Throwable th) {
        sve sveVar = this.b;
        ((sud) sveVar.f).i();
        sveVar.e.e(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, zwy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.svn
    public final void b(byte[] bArr) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alds.b);
        ajwo ajwoVar = this.a;
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        sve sveVar = this.b;
        aapz aapzVar = (aapz) sveVar.c;
        wux wuxVar = new wux(aapzVar.b, aapzVar.c.e());
        wuxVar.a = ((alds) objC).c;
        wuxVar.n(ajwoVar.c);
        wuxVar.b = aigj.v(bArr);
        Object obj = aapzVar.e;
        ?? r0 = sveVar.g;
        ListenableFuture listenableFutureB = ((wnh) obj).b(wuxVar, r0, null);
        if (((vxz) aapzVar.f).l(3, 45370961L, false)) {
            yno.ef(aapzVar.d, listenableFutureB, r0, 173);
        }
        taf.i(listenableFutureB, r0, new roc(sveVar, 5), new ixb(sveVar, 5), null);
    }
}
