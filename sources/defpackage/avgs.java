package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avgs extends aval {
    avat a;
    final /* synthetic */ avhb b;

    public avgs(avhb avhbVar) {
        this.b = avhbVar;
    }

    @Override // defpackage.aval
    public final auys a() {
        return this.b.I;
    }

    @Override // defpackage.aval
    public final /* bridge */ /* synthetic */ avaq b(avai avaiVar) {
        avhb avhbVar = this.b;
        avhbVar.o.c();
        ahno.P(!avhbVar.E, "Channel is being terminated");
        return new avdd(avhbVar, avaiVar);
    }

    @Override // defpackage.aval
    public final avcj c() {
        return this.b.o;
    }

    @Override // defpackage.aval
    public final ScheduledExecutorService d() {
        return this.b.l;
    }

    @Override // defpackage.aval
    public final void e() {
        avcj avcjVar = this.b.o;
        avcjVar.c();
        avcjVar.execute(new avgv(this, 1));
    }

    @Override // defpackage.aval
    public final void f(auzd auzdVar, avar avarVar) {
        avhb avhbVar = this.b;
        avhbVar.o.c();
        if (this != avhbVar.v || avhbVar.w) {
            return;
        }
        avhbVar.m(avarVar);
        if (auzdVar != auzd.e) {
            avhbVar.I.b(2, "Entering {0} state with picker: {1}", auzdVar, avarVar);
            avhbVar.q.a(auzdVar);
        }
    }
}
