package defpackage;

import io.grpc.Status;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avep implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public avep(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [avhl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [avhl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [auzz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                this.a.a(true);
                break;
            case 1:
                ((aven) this.a).w();
                break;
            case 2:
                this.a.a(false);
                break;
            case 3:
                avhb avhbVar = ((avgp) this.a).a;
                ahno.P(avhbVar.C.get(), "Channel must have been shut down");
                avhbVar.E = true;
                avhbVar.l(false);
                avhbVar.i();
                avhbVar.j();
                break;
            case 4:
                avhl avhlVar = ((aver) this.a).f;
                avjy avjyVar = avjy.SUBCHANNEL_SHUTDOWN;
                ahno.P(((avgp) avhlVar).a.C.get(), "Channel must have been shut down");
                break;
            case 5:
                ((aveu) this.a).h.v();
                break;
            case 6:
                ((aveu) this.a).h.s();
                break;
            case 7:
                ((aveu) this.a).f();
                break;
            case 8:
                ((aveu) this.a).h.r();
                break;
            case 9:
                ((aveu) this.a).h.i();
                break;
            case 10:
                ((avet) this.a).a.d();
                break;
            case 11:
                avge avgeVar = (avge) this.a;
                avgeVar.v = null;
                avgeVar.d.a(2, "CONNECTING after backoff");
                avgeVar.b(auzd.a);
                avgeVar.g();
                break;
            case 12:
                avge avgeVar2 = (avge) this.a;
                if (avgeVar2.p.a == auzd.d) {
                    avgeVar2.d.a(2, "CONNECTING as requested");
                    avgeVar2.b(auzd.a);
                    avgeVar2.g();
                }
                break;
            case 13:
                avge avgeVar3 = (avge) ((aves) this.a).a;
                avhm avhmVar = avgeVar3.k;
                avgeVar3.w = null;
                avgeVar3.k = null;
                avhmVar.e(Status.m.withDescription("InternalSubchannel closed transport due to address change"));
                break;
            case 14:
                ?? r7 = this.a;
                avge avgeVar4 = (avge) r7;
                avgeVar4.d.a(2, "Terminated");
                avhb avhbVar2 = avgeVar4.a.b.i;
                avhbVar2.x.remove(r7);
                auzw.b(avhbVar2.J.c, r7);
                avhbVar2.j();
                break;
            case 15:
                avgc avgcVar = (avgc) this.a;
                avge avgeVar5 = avgcVar.c;
                avgeVar5.u = null;
                if (avgeVar5.q != null) {
                    ahno.P(avgeVar5.o == null, "Unexpected non-null activeTransport");
                    avgcVar.a.e(avgeVar5.q);
                } else {
                    avef avefVar = avgeVar5.n;
                    avef avefVar2 = avgcVar.a;
                    if (avefVar == avefVar2) {
                        avgeVar5.o = avefVar2;
                        avgeVar5.n = null;
                        avgb avgbVar = avgeVar5.h;
                        avgeVar5.r = avgbVar.a();
                        avgeVar5.b(auzd.b);
                        avkc avkcVar = avgeVar5.s;
                        String str = avgeVar5.t;
                        String strD = avgc.d(avgbVar.a());
                        String strC = avgc.c(avgbVar.a(), auzm.b);
                        String strB = avgc.b((avcb) avgbVar.a().a(avfk.a));
                        avby avbyVar = avkc.c;
                        agke agkeVarQ = agke.q(str);
                        agke agkeVarR = agke.r(strD, strC);
                        avbj avbjVar = avkcVar.a;
                        avbjVar.a(avbyVar, agkeVarQ, agkeVarR);
                        avbjVar.b(avkc.e, agke.q(str), agke.s(strB, strD, strC));
                    }
                }
                break;
            case 16:
                avgc avgcVar2 = (avgc) this.a;
                avef avefVar3 = avgcVar2.a;
                avge avgeVar6 = avgcVar2.c;
                Collection collection = avgeVar6.l;
                collection.remove(avefVar3);
                if (avgeVar6.p.a == auzd.e && collection.isEmpty()) {
                    avgeVar6.e();
                    break;
                }
                break;
            case 17:
                ((avhb) this.a).g(true);
                break;
            case 18:
                avhb avhbVar3 = (avhb) this.a;
                avhbVar3.I.a(2, "Entering SHUTDOWN state");
                avhbVar3.q.a(auzd.e);
                break;
            case 19:
                avhb avhbVar4 = (avhb) this.a;
                if (!avhbVar4.D) {
                    avhbVar4.D = true;
                    avhbVar4.i();
                }
                break;
            default:
                avhb avhbVar5 = (avhb) this.a;
                if (avhbVar5.v != null) {
                    avhbVar5.l(true);
                    aver averVar = avhbVar5.A;
                    averVar.d(null);
                    avhbVar5.K.d(avhb.f);
                    avhbVar5.I.a(2, "Entering IDLE state");
                    avhbVar5.q.a(auzd.d);
                    avft avftVar = avhbVar5.R;
                    Object[] objArr = {avhbVar5.z, averVar};
                    for (int i = 0; i < 2; i++) {
                        if (avftVar.a.contains(objArr[i])) {
                            avhbVar5.h();
                        }
                        break;
                    }
                    break;
                }
                break;
        }
    }
}
