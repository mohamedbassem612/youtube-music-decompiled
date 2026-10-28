package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahph implements ahpk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ahpj a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TimeUnit c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ahph(ahpj ahpjVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.$cid = i;
        this.a = ahpjVar;
        this.d = obj;
        this.b = j;
        this.c = timeUnit;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.ahpk
    public final ScheduledFuture a(avgj avgjVar) {
        int i = this.$cid;
        ?? r3 = this.d;
        if (i != 0) {
            ahpj ahpjVar = this.a;
            vtq vtqVar = new vtq(ahpjVar, (Object) r3, avgjVar, 17, (char[]) null);
            TimeUnit timeUnit = this.c;
            return ahpjVar.b.schedule(vtqVar, this.b, timeUnit);
        }
        ahpj ahpjVar2 = this.a;
        adab adabVar = new adab(ahpjVar2, (Runnable) r3, avgjVar, 14);
        TimeUnit timeUnit2 = this.c;
        return ahpjVar2.b.schedule(adabVar, this.b, timeUnit2);
    }
}
