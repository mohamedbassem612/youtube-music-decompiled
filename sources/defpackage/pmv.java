package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pmv extends awpk implements awqk {
    int a;
    final /* synthetic */ aicw b;
    final /* synthetic */ pmz c;
    final /* synthetic */ plx d;
    final /* synthetic */ pmi e;
    final /* synthetic */ pmo f;
    final /* synthetic */ plb g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmv(aicw aicwVar, pmz pmzVar, plx plxVar, pmi pmiVar, pmo pmoVar, plb plbVar, long j, long j2, awoq awoqVar) {
        super(2, awoqVar);
        this.b = aicwVar;
        this.c = pmzVar;
        this.d = plxVar;
        this.e = pmiVar;
        this.f = pmoVar;
        this.g = plbVar;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        pmv pmvVar = new pmv(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, awoqVar);
        pmvVar.j = obj;
        return pmvVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pmv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00de -> B:26:0x00c5). Please report as a decompilation issue!!! */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        aicw aicwVar;
        Iterator it;
        awox awoxVar = awox.a;
        if (this.a != 0) {
            it = (Iterator) this.j;
            try {
                atqp.j(obj);
            } catch (Exception e) {
                ((agsj) ((agsj) pmz.a.c()).j(e)).t("Error while waiting for SystemTrayPushHandler to complete.");
            }
        } else {
            atqp.j(obj);
            awut awutVar = (awut) this.j;
            ArrayList arrayList = new ArrayList();
            aicw aicwVar2 = this.b;
            int i = aicwVar2.b;
            if ((i & 4) != 0) {
                pmz pmzVar = this.c;
                agsn agsnVar = pmz.a;
                aicwVar = aicwVar2;
                if (((agev) pmzVar.b.io()).g()) {
                    pmt pmtVar = new pmt(pmzVar, this.d, this.e, aicwVar, this.f, this.g, this.h, this.i, null);
                    aicwVar = aicwVar;
                    arrayList.add(awro.r(awutVar, awov.a, 1, pmtVar));
                } else {
                    ((agsj) pmz.a.b()).t("Received a notification thread, but the system tray push handler is missing.");
                }
            } else {
                aicwVar = aicwVar2;
                if ((i & 8) != 0) {
                    pmu pmuVar = new pmu(this.c, aicwVar, this.d, this.e, this.g, (awoq) null, 0);
                    aicwVar = aicwVar;
                    arrayList.add(awro.r(awutVar, awov.a, 1, pmuVar));
                }
            }
            aieo aieoVar = aicwVar.g;
            if (aieoVar == null) {
                aieoVar = aieo.a;
            }
            if (aieoVar.c > 0) {
                pmz pmzVar2 = this.c;
                agsn agsnVar2 = pmz.a;
                if (((agev) pmzVar2.b.io()).g()) {
                    arrayList.add(awro.r(awutVar, awov.a, 1, new egh(pmzVar2, this.d, aicwVar, this.g, (awoq) null, 9)));
                } else {
                    ((agsj) pmz.a.b()).t("Received notifications count info, but the system tray push handler is missing.");
                }
            }
            it = arrayList.iterator();
        }
        while (it.hasNext()) {
            awuz awuzVar = (awuz) it.next();
            this.j = it;
            this.a = 1;
            if (awuzVar.c(this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
