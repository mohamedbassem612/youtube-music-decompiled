package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class ybx implements awzd, awqy {
    final /* synthetic */ ycd a;

    public ybx(ycd ycdVar) {
        this.a = ycdVar;
    }

    @Override // defpackage.awzd
    public final /* bridge */ /* synthetic */ Object emit(Object obj, awoq awoqVar) throws Throwable {
        Object objC = this.a.c((alpn) obj, awoqVar);
        return objC != awox.a ? awmy.a : objC;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof awzd) && (obj instanceof awqy)) {
            return awrc.c(getFunctionDelegate(), ((awqy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.awqy
    public final awmf getFunctionDelegate() {
        return new awrb(2, this.a, ycd.class, "handleDiscoveryResponse", "handleDiscoveryResponse(Lcom/google/protos/youtube/api/innertube/InnertubeGetActiveDevicesService$GetActiveDevicesResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
