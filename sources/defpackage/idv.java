package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class idv implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ idv(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37, types: [affg] */
    /* JADX WARN: Type inference failed for: r0v51, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r14v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32, types: [agke, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6, types: [gnq] */
    /* JADX WARN: Type inference failed for: r15v7, types: [gnq] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        ?? gnqVar;
        ?? affgVar;
        switch (this.$cid) {
            case 0:
                aiml aimlVar = (aiml) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((aimj) obj).b), this.b, aiml.a);
                agjz agjzVar = new agjz(4);
                for (aimk aimkVar : aimlVar.b) {
                    Object obj2 = this.a;
                    int i = aimkVar.b;
                    if (i == 1) {
                        agjzVar.h(((idx) obj2).f.s((aoun) aimkVar.c));
                    } else if (i == 2) {
                        idx idxVar = (idx) obj2;
                        agjzVar.h(idxVar.f.C((aouu) aimkVar.c, idxVar.d));
                    }
                }
                agrx agrxVar = agso.a;
                aimlVar.b.size();
                return agjzVar.g();
            case 1:
                gnqVar = (gnq) obj;
                if (!((gmy) this.a).p.l(206, 45734052L, false)) {
                    Object obj3 = this.b;
                    if (hdu.c.contains(obj3) || hdu.e.contains(obj3)) {
                        aihf aihfVarCreateBuilder = alme.a.createBuilder();
                        aihf aihfVarCreateBuilder2 = almj.a.createBuilder();
                        aihf aihfVarCreateBuilder3 = almg.a.createBuilder();
                        aihf aihfVarCreateBuilder4 = aqjj.a.createBuilder();
                        aihf aihfVarCreateBuilder5 = aqjg.a.createBuilder();
                        apoq apoqVarB = gmy.b((String) obj3);
                        aihfVarCreateBuilder5.copyOnWrite();
                        aqjg aqjgVar = (aqjg) aihfVarCreateBuilder5.instance;
                        apoqVarB.getClass();
                        aqjgVar.c = apoqVarB;
                        aqjgVar.b |= 1;
                        aihfVarCreateBuilder4.copyOnWrite();
                        aqjj aqjjVar = (aqjj) aihfVarCreateBuilder4.instance;
                        aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder5.build();
                        aqjgVar2.getClass();
                        aqjjVar.i = aqjgVar2;
                        aqjjVar.b |= 16384;
                        aihfVarCreateBuilder3.copyOnWrite();
                        almg almgVar = (almg) aihfVarCreateBuilder3.instance;
                        aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder4.build();
                        aqjjVar2.getClass();
                        almgVar.c = aqjjVar2;
                        almgVar.b = 58174010;
                        aihfVarCreateBuilder2.bq(aihfVarCreateBuilder3);
                        aihfVarCreateBuilder.copyOnWrite();
                        alme almeVar = (alme) aihfVarCreateBuilder.instance;
                        almj almjVar = (almj) aihfVarCreateBuilder2.build();
                        almjVar.getClass();
                        almeVar.c = almjVar;
                        almeVar.b = 58173949;
                        alme almeVar2 = (alme) aihfVarCreateBuilder.build();
                        aihh aihhVar = (aihh) gnqVar.a.a.toBuilder();
                        aihhVar.copyOnWrite();
                        almd almdVar = (almd) aihhVar.instance;
                        almeVar2.getClass();
                        almdVar.f = almeVar2;
                        almdVar.b |= 64;
                        gnqVar = new gnq(new wfy((almd) aihhVar.build()), gnqVar.b);
                    }
                }
                return gnqVar;
            case 2:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    affgVar = this.b;
                    if (!it.hasNext()) {
                        return affgVar;
                    }
                    oip oipVar = ((omh) it.next()).b;
                    if (nsp.i(oipVar)) {
                        Iterator it2 = oipVar.o.iterator();
                        while (it2.hasNext()) {
                            omn omnVar = (omn) this.a;
                            affgVar.add(nsp.b(nsp.c((Context) omnVar.g, (agev) omnVar.e, oipVar), (oin) it2.next()));
                        }
                    }
                }
                break;
            case 3:
                oiy oiyVar = (oiy) obj;
                long jF = ((oni) this.a).d.f();
                Long lValueOf = Long.valueOf(jF);
                aijp aijpVar = oiyVar.c;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                long jA = aikz.a(aijpVar);
                Long lValueOf2 = Long.valueOf(jA);
                aihf builder = oiyVar.toBuilder();
                lValueOf.getClass();
                aijp aijpVarC = aikz.c(jF / 1000, (int) ((jF % 1000) * 1000000));
                builder.copyOnWrite();
                oiy oiyVar2 = (oiy) builder.instance;
                aijpVarC.getClass();
                oiyVar2.c = aijpVarC;
                oiyVar2.b |= 1;
                oiy oiyVar3 = (oiy) builder.build();
                if ((oiyVar.b & 1) != 0) {
                    Object obj4 = this.b;
                    lValueOf.getClass();
                    long jF2 = oni.f(jF);
                    lValueOf2.getClass();
                    long jF3 = jF2 - oni.f(jA);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    ((AtomicReference) obj4).set(new agfa(Integer.valueOf(ahng.P(jF3 / 86400000))));
                }
                return oiyVar3;
            case 4:
                String str = (String) obj;
                String str2 = ((kic) this.a).g;
                return axfd.S(str2, str, (byte[]) ((axfd) ((omj) this.b).a).d.get(new agew(str, str2)));
            case 5:
                agjz agjzVar2 = new agjz(4);
                agqr it3 = ((agkj) obj).values().iterator();
                while (it3.hasNext()) {
                    Object obj5 = this.b;
                    waa waaVar = (waa) it3.next();
                    if (waaVar.f((aihl) obj5)) {
                        agjzVar2.h(((vzt) this.a).i.g(waaVar, 2));
                    }
                }
                return agjzVar2.g();
            case 6:
                yds ydsVar = (yds) this.a;
                ((tpq) ydsVar.b.io()).c();
                int[] iArr = ydsVar.d;
                ydu yduVar = (ydu) this.b;
                System.arraycopy(iArr, 0, yduVar.c, 0, 28);
                System.arraycopy(ydsVar.e, 0, yduVar.d, 0, 28);
                yduVar.f.kk(Boolean.TRUE);
                return null;
            case 7:
                afhn afhnVar = (afhn) obj;
                affd affdVar = afhnVar.a;
                afhq afhqVar = afhnVar.b;
                afhm afhmVar = (afhm) this.b;
                ahno.P(afhmVar.a, "Trying to propagate AccountInfo for invalid account.");
                affgVar = new affg(affdVar, afhqVar, afhmVar, null, (afff) this.a);
                return affgVar;
            case 8:
                afuu afuuVarD = afwt.d(113, "AccountUiService useAccount", afux.a, true);
                try {
                    affg affgVar2 = new affg((affd) this.a, afhq.a, null, null, (afff) this.b);
                    afuuVarD.close();
                    return affgVar2;
                } catch (Throwable th) {
                    try {
                        afuuVarD.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 9:
                gnqVar = (agke) obj;
                int size = gnqVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj6 = this.a;
                    Object obj7 = this.b;
                    afhq afhqVar2 = (afhq) gnqVar.get(i2);
                    ahno.V(((String) obj7).equals(afhqVar2.f), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", obj6, obj7, afhqVar2.f);
                }
                return gnqVar;
            case 10:
                Iterator it4 = DesugarCollections.unmodifiableMap(((afiu) obj).d).values().iterator();
                while (true) {
                    Object obj8 = this.a;
                    if (!it4.hasNext()) {
                        throw new afig("No account is found for ".concat((String) obj8));
                    }
                    afiw afiwVar = (afiw) it4.next();
                    afhq afhqVar3 = afiwVar.d;
                    if (afhqVar3 == null) {
                        afhqVar3 = afhq.a;
                    }
                    if (afhqVar3.f.equals(obj8)) {
                        afhq afhqVar4 = afiwVar.d;
                        if (afhqVar4 == null) {
                            afhqVar4 = afhq.a;
                        }
                        if (afhqVar4.c.equals(this.b)) {
                            return affd.a(afiwVar.c);
                        }
                    }
                }
                break;
            default:
                afio afioVar = (afio) this.a.apply((afiu) obj);
                ((AtomicReference) this.b).set(afioVar.a);
                return afioVar.b;
        }
    }

    public /* synthetic */ idv(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
