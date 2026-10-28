package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahpi implements ahpk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ahpj a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TimeUnit e;

    public /* synthetic */ ahpi(ahpj ahpjVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.$cid = i;
        this.a = ahpjVar;
        this.b = runnable;
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
    }

    @Override // defpackage.ahpk
    public final ScheduledFuture a(avgj avgjVar) {
        int i = this.$cid;
        Runnable runnable = this.b;
        if (i != 0) {
            ahpj ahpjVar = this.a;
            adab adabVar = new adab(ahpjVar, runnable, avgjVar, 16);
            TimeUnit timeUnit = this.e;
            long j = this.d;
            return ahpjVar.b.scheduleAtFixedRate(adabVar, this.c, j, timeUnit);
        }
        ahpj ahpjVar2 = this.a;
        adab adabVar2 = new adab(ahpjVar2, runnable, avgjVar, 15);
        TimeUnit timeUnit2 = this.e;
        long j2 = this.d;
        return ahpjVar2.b.scheduleWithFixedDelay(adabVar2, this.c, j2, timeUnit2);
    }
}
