package defpackage;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhy implements avas {
    public avic a;
    final /* synthetic */ avie b;

    public avhy(avie avieVar) {
        this.b = avieVar;
    }

    @Override // defpackage.avas
    public final void a(auze auzeVar) {
        avie avieVar = this.b;
        if (avieVar.p) {
            avie.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{auzeVar, this.a.a});
            return;
        }
        avie.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{auzeVar, this.a.a});
        this.a.d = auzeVar;
        avhz avhzVar = avieVar.k;
        if (avhzVar.f() && this.a == avieVar.j.get(avhzVar.b())) {
            avieVar.i(this.a);
        }
    }
}
