package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdd extends avaq {
    final avai a;
    final avaa b;
    final avdl c;
    final avdm d;
    List e;
    avge f;
    boolean g;
    boolean h;
    final /* synthetic */ avhb i;
    axoz j;

    public avdd(avhb avhbVar, avai avaiVar) {
        this.i = avhbVar;
        this.e = avaiVar.a;
        this.a = avaiVar;
        avaa avaaVarB = avaa.b("Subchannel", avhbVar.b());
        this.b = avaaVarB;
        avdm avdmVar = new avdm(avaaVarB, avhbVar.n.a(), "Subchannel for ".concat(avaiVar.a.toString()));
        this.d = avdmVar;
        this.c = new avdl(avdmVar, avhbVar.n);
    }

    @Override // defpackage.avaq
    public final void a() {
        this.i.o.c();
        ahno.P(this.g, "not started");
        if (this.h) {
            return;
        }
        this.f.a();
    }

    @Override // defpackage.avaq
    public final void b() {
        axoz axozVar;
        avhb avhbVar = this.i;
        avcj avcjVar = avhbVar.o;
        avcjVar.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!avhbVar.E || (axozVar = this.j) == null) {
                return;
            }
            axozVar.a();
            this.j = null;
        }
        if (avhbVar.E) {
            this.f.f(avhb.c);
        } else {
            this.j = avcjVar.d(new avgg(new avgv(this, 5)), 5L, TimeUnit.SECONDS, avhbVar.k.a());
        }
    }

    @Override // defpackage.avaq
    public final void c(avas avasVar) {
        avhb avhbVar = this.i;
        avcj avcjVar = avhbVar.o;
        avcjVar.c();
        ahno.P(!this.g, "already started");
        ahno.P(!this.h, "already shutdown");
        ahno.P(!avhbVar.E, "Channel is being terminated");
        this.g = true;
        String strB = avhbVar.b();
        avdz avdzVar = avhbVar.k;
        ScheduledExecutorService scheduledExecutorServiceA = avdzVar.a();
        avga avgaVar = new avga(this, avasVar);
        avdk avdkVarA = avhbVar.V.a();
        avbj avbjVar = avhbVar.v.b.T;
        avaa avaaVar = this.b;
        avdl avdlVar = this.c;
        List list = avhbVar.r;
        avai avaiVar = this.a;
        String str = avhbVar.s;
        auzw auzwVar = avhbVar.J;
        avge avgeVar = new avge(avaiVar, strB, str, avdzVar, scheduledExecutorServiceA, avcjVar, avgaVar, auzwVar, avdkVarA, avaaVar, avdlVar, list, avhbVar.j, avbjVar);
        auzt auztVar = new auzt();
        auztVar.a = "Child Subchannel started";
        auztVar.b = auzu.b;
        auztVar.b(avhbVar.n.a());
        auztVar.c = avgeVar;
        avhbVar.H.b(auztVar.a());
        this.f = avgeVar;
        auzw.a(auzwVar.c, avgeVar);
        avhbVar.x.add(avgeVar);
    }

    @Override // defpackage.avaq
    public final void d(List list) {
        this.i.o.c();
        this.e = list;
        avge avgeVar = this.f;
        list.getClass();
        avge.i(list);
        ahno.G(!list.isEmpty(), "newAddressGroups is empty");
        avgeVar.g.execute(new aves(avgeVar, DesugarCollections.unmodifiableList(new ArrayList(list)), 5, (short[]) null));
    }

    public final String toString() {
        return this.b.toString();
    }
}
