package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avdf extends avat {
    final /* synthetic */ avdg f;
    private final aval g;
    private avat h;
    private avav i;

    public avdf(avdg avdgVar, aval avalVar) {
        this.f = avdgVar;
        this.g = avalVar;
        avav avavVar = avdgVar.a;
        this.i = avavVar;
        this.h = avavVar.a(avalVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // defpackage.avat
    public final Status a(avap avapVar) {
        avjs avjsVar = (avjs) avapVar.c;
        if (avjsVar == null) {
            avjsVar = new avjs(this.f.a, null);
        }
        avav avavVar = this.i;
        if (avavVar != null) {
            if (!avjsVar.a.c().equals(avavVar.c())) {
                aval avalVar = this.g;
                avalVar.f(auzd.a, new avak(avan.a));
                this.h.c();
                avav avavVar2 = avjsVar.a;
                this.i = avavVar2;
                avat avatVar = this.h;
                this.h = avavVar2.a(avalVar);
                avalVar.a().b(2, "Load balancer changed from {0} to {1}", avatVar.getClass().getSimpleName(), this.h.getClass().getSimpleName());
            }
        } else {
            aval avalVar2 = this.g;
            avalVar2.f(auzd.a, new avak(avan.a));
            this.h.c();
            avav avavVar3 = avjsVar.a;
            this.i = avavVar3;
            avat avatVar2 = this.h;
            this.h = avavVar3.a(avalVar2);
            avalVar2.a().b(2, "Load balancer changed from {0} to {1}", avatVar2.getClass().getSimpleName(), this.h.getClass().getSimpleName());
        }
        Object obj = avjsVar.b;
        if (obj != null) {
            this.g.a().b(1, "Load-balancing config: {0}", obj);
        }
        avat avatVar3 = this.h;
        auyo auyoVar = auyo.a;
        return avatVar3.a(new avap(avapVar.a, avapVar.b, obj));
    }

    @Override // defpackage.avat
    public final void b(Status status) {
        this.h.b(status);
    }

    @Override // defpackage.avat
    public final void c() {
        this.h.c();
        this.h = null;
    }
}
