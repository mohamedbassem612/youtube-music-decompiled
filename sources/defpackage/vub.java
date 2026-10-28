package defpackage;

import j$.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vub implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vub(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = 3;
        switch (this.$cid) {
            case 0:
                ((vuk) this.a).s.c((avmn) obj);
                break;
            case 1:
                ((vuk) this.a).s.c((avmn) obj);
                break;
            case 2:
                ((vuk) this.a).t = ((Integer) obj).intValue();
                break;
            case 3:
                ((vuk) this.a).s.c((avmn) obj);
                break;
            case 4:
                ((avmm) this.a).c((avmn) obj);
                break;
            case 5:
                ((aqi) this.a).b((ajvu) obj);
                break;
            case 6:
                ((aqi) this.a).d((Throwable) obj);
                break;
            case 7:
                ((vyo) this.a).c = (alik) obj;
                boolean z = vyl.c.b;
                break;
            case 8:
                ((aqi) this.a).b((alik) obj);
                break;
            case 9:
                ((aqi) this.a).d((Throwable) obj);
                break;
            case 10:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((oid) it.next()).b.iterator();
                    while (it2.hasNext()) {
                        ohz ohzVar = ((oic) it2.next()).b;
                        if (ohzVar == null) {
                            ohzVar = ohz.a;
                        }
                        Object obj2 = this.a;
                        vzt vztVar = (vzt) obj2;
                        afxd.f(vztVar.a(ohzVar)).h(new row(obj2, ohzVar, 11), vztVar.e);
                    }
                }
                break;
            case 11:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                vzt vztVar2 = (vzt) this.a;
                vztVar2.h = zBooleanValue;
                if (bool.booleanValue()) {
                    vztVar2.b(vztVar2.g, false);
                    zpw zpwVar = (zpw) vztVar2.c.io();
                    ((omj) zpwVar.a).c(new iud(zpwVar.j, i), zpwVar.o);
                }
                break;
            case 12:
                ((wdf) ((xqy) this.a).a).v((Throwable) obj);
                break;
            case 13:
                ((wdf) this.a).v((Throwable) obj);
                break;
            case 14:
                ((xev) this.a).a((amuh) obj);
                break;
            case 15:
                ((awli) this.a).kk((Boolean) obj);
                break;
            case 16:
                agrx agrxVar = agso.a;
                ((xkw) this.a).j.kk((Boolean) obj);
                break;
            case 17:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                agrx agrxVar2 = agso.a;
                xkw xkwVar = (xkw) this.a;
                xkwVar.e.kk(bool2);
                boolean z2 = !zBooleanValue2;
                xkwVar.g.kk(xkwVar.e(z2));
                xkwVar.h.kk(xkwVar.f(z2));
                xkwVar.i.kk(xkwVar.d(z2));
                break;
            case 18:
                ((xmw) this.a).a();
                break;
            case 19:
                xpe xpeVar = (xpe) obj;
                agrx agrxVar3 = agso.a;
                algp algpVar = xpeVar.b;
                xop xopVar = (xop) this.a;
                Map map = xopVar.a;
                map.put(algpVar, xpeVar);
                agkj agkjVarH = agkj.h(map);
                if (agkjVarH.size() == 3) {
                    if (!Collection.EL.stream(agkjVarH.entrySet()).anyMatch(new gqn(16))) {
                        xopVar.b.a(false);
                    } else {
                        xopVar.e();
                    }
                }
                break;
            default:
                agrx agrxVar4 = agso.a;
                ((xwv) ((xqy) this.a).a).b = (aazk) obj;
                break;
        }
    }
}
