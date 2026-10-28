package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import j$.lang.Iterable$EL;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adcw {
    public fhd a;
    public final assm b;
    public final nuc c;
    public final nsl d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final agkj h;
    public final List i = DesugarCollections.synchronizedList(new ArrayList());
    public final axlj j;
    private final awmd k;
    private final boolean l;
    private String m;
    private aijp n;
    private final Map o;

    public adcw(fhd fhdVar, assm assmVar, axlj axljVar, nuc nucVar, awmd awmdVar, nsl nslVar, String str, String str2, boolean z, agkj agkjVar, Map map, aijp aijpVar, boolean z2, boolean z3) {
        this.a = fhdVar;
        this.b = assmVar;
        this.j = axljVar;
        this.c = nucVar;
        this.k = awmdVar;
        this.d = nslVar;
        this.e = str;
        this.n = aijpVar;
        this.m = str2;
        this.g = z;
        this.h = agkjVar;
        this.o = map;
        this.l = z2;
        this.f = z3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public static aigj a(aqhl aqhlVar, String str) {
        apji apjiVarS;
        if (str == null) {
            apjiVarS = null;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -2064014842) {
                if (iHashCode != -1809995403) {
                    if (iHashCode == 2124035899 && str.equals("suspense_placeholder_data_key")) {
                        apjiVarS = acfz.T(aqhlVar);
                    } else {
                        apjiVarS = null;
                    }
                } else if (str.equals("suspense_content_data_key")) {
                    apjiVarS = acfz.R(aqhlVar);
                } else {
                    apjiVarS = null;
                }
            } else if (str.equals("suspense_error_data_key")) {
                apjiVarS = acfz.S(aqhlVar);
            } else {
                apjiVarS = null;
            }
        }
        if (apjiVarS == null) {
            return null;
        }
        adal adalVar = new adal();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVarS.c(aihlVarCheckIsLite);
        Object objK = apjiVarS.j.k(aihlVarCheckIsLite.d);
        return aigj.v(adalVar.a((akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
    }

    final synchronized aijp b() {
        return this.n;
    }

    final synchronized String c() {
        return this.l ? this.j.v(this.e) : this.m;
    }

    public final void d(String str, alap alapVar) {
        if (str == null) {
            str = this.e;
        }
        String str2 = str;
        aqhn aqhnVarT = this.j.t(str2);
        if (aqhnVarT != null) {
            Container container = (Container) this.k.io();
            nsl nslVar = this.d;
            String orCreateBlockRegistryRef = nslVar.G;
            agbc agbcVar = null;
            if (orCreateBlockRegistryRef == null) {
                BlockRegistryProvider blockRegistryProvider = nslVar.H;
                orCreateBlockRegistryRef = blockRegistryProvider != null ? blockRegistryProvider.getOrCreateBlockRegistryRef() : null;
            }
            if (orCreateBlockRegistryRef == null) {
                this.c.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "BlockRegistryBlock not found for Suspense. Likely a surface integration issue.", new Object[0]);
            } else {
                byte[] bArrE = new mav(container, new adcu(orCreateBlockRegistryRef)).e(777393138, Optional.empty());
                if (bArrE.length == 0) {
                    this.c.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "ContinuationBlock not found for Suspense. Likely a surface integration issue.", new Object[0]);
                } else {
                    aihf aihfVarCreateBuilder = asid.a.createBuilder();
                    aigj aigjVarV = aigj.v(bArrE);
                    aihfVarCreateBuilder.copyOnWrite();
                    asid asidVar = (asid) aihfVarCreateBuilder.instance;
                    asidVar.c = aigjVarV.B();
                    asidVar.b |= 1;
                    agbcVar = (agbc) container.c(new afzb(7), (asid) aihfVarCreateBuilder.build());
                }
            }
            if (agbcVar != null) {
                Optional.empty();
                Optional optionalEmpty = Optional.empty();
                aihf aihfVarCreateBuilder2 = asic.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                asic asicVar = (asic) aihfVarCreateBuilder2.instance;
                asicVar.c = aqhnVarT;
                asicVar.b = 1;
                Optional optionalOf = Optional.of((asic) aihfVarCreateBuilder2.build());
                if (alapVar != null) {
                    optionalEmpty = Optional.of(alapVar);
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                agbb agbbVar = new agbb(optionalOf, optionalEmpty);
                aihf aihfVarCreateBuilder3 = asia.a.createBuilder();
                Optional optional = agbbVar.a;
                adyu adyuVar = new adyu(aihfVarCreateBuilder3, 11);
                optional.isPresent();
                Object obj = adyuVar.a;
                Object obj2 = optional.get();
                aihf aihfVar = (aihf) obj;
                aihfVar.copyOnWrite();
                asia asiaVar = (asia) aihfVar.instance;
                asiaVar.c = (asic) obj2;
                asiaVar.b |= 1;
                Optional optional2 = agbbVar.b;
                adyu adyuVar2 = new adyu(aihfVarCreateBuilder3, 12);
                if (true == optional2.isPresent()) {
                    Object obj3 = optional2.get();
                    aihf aihfVar2 = (aihf) adyuVar2.a;
                    aihfVar2.copyOnWrite();
                    asia asiaVar2 = (asia) aihfVar2.instance;
                    asiaVar2.d = (alap) obj3;
                    asiaVar2.b |= 2;
                }
                InstanceProxy instanceProxyD = agbcVar.d();
                if (instanceProxyD instanceof agbd) {
                    ahud ahudVar = ((agbd) instanceProxyD).a;
                }
                asia asiaVar3 = (asia) aihfVarCreateBuilder3.build();
                asib asibVar = asib.a;
                mba mbaVarC = agbcVar.c(70292770, asiaVar3, aihn.getParserForClass(asib.class), new aeqk(agbcVar, 17));
                this.i.add(mbaVarC);
                mbaVarC.a(new hrr((Object) this, (Object) atomicBoolean, (Object) str2, 17, (byte[]) null), new hnw(this, atomicBoolean, str2, mbaVarC, 10));
            }
        }
    }

    public final synchronized void e() {
        if (this.g) {
            Iterable$EL.forEach(this.h.keySet(), new acfb(this, 7));
        } else {
            this.j.D(this.m, this);
        }
    }

    public final synchronized void f(String str) {
        if (this.g) {
            Iterable$EL.forEach(this.h.keySet(), new aalb(this, str, 5, null));
        } else {
            this.j.E(str, this.m, this);
        }
    }

    final synchronized void g(String str) {
        this.m = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized void h(String str, String str2) {
        if (this.l) {
            axlj axljVar = this.j;
            if (!Objects.equals(axljVar.v(str), str2)) {
                axljVar.c.put(str, str2);
                return;
            }
        }
        if (!this.m.equals(str2)) {
            g(str2);
        }
    }

    final void i(adel adelVar, avmm avmmVar, nsr nsrVar) {
        if (this.g) {
            agjw agjwVarValues = this.h.values();
            agjwVarValues.getClass();
            agkh agkhVar = new agkh(4);
            agqr it = agjwVarValues.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                aqhl aqhlVar = (aqhl) next;
                aiie aiieVar = aqhlVar.g;
                aiieVar.getClass();
                ArrayList<aqhs> arrayList = new ArrayList();
                for (Object obj : aiieVar) {
                    if (((aqhs) obj).c == 2) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                for (aqhs aqhsVar : arrayList) {
                    aqhp aqhpVar = aqhsVar.c == 2 ? (aqhp) aqhsVar.d : aqhp.a;
                    aqhpVar.getClass();
                    arrayList2.add(aqhpVar.c);
                }
                agke agkeVarT = aguu.T(arrayList2);
                if (!agkeVarT.isEmpty()) {
                    agkhVar.e(aqhlVar.e, agkeVarT);
                }
            }
            j$.util.Map.EL.forEach(agkhVar.d(false), new adcv(this, avmmVar, nsrVar, 0));
            return;
        }
        assm assmVar = this.b;
        aqhl aqhlVar2 = assmVar.c;
        if (aqhlVar2 == null) {
            aqhlVar2 = aqhl.a;
        }
        aqhp aqhpVar2 = aqhlVar2.l;
        if (aqhpVar2 == null) {
            aqhpVar2 = aqhp.a;
        }
        if ((aqhpVar2.b & 1) != 0) {
            aqhl aqhlVar3 = assmVar.c;
            if (aqhlVar3 == null) {
                aqhlVar3 = aqhl.a;
            }
            if (adelVar != null && (adelVar.c & 4) != 0) {
                aqhp aqhpVar3 = aqhlVar3.l;
                if (aqhpVar3 == null) {
                    aqhpVar3 = aqhp.a;
                }
                String str = this.e;
                String str2 = aqhpVar3.c;
                aijp aijpVar = adelVar.g;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                l(str, str2, aijpVar, null);
            }
            String str3 = aqhlVar3.h;
            aqhp aqhpVar4 = aqhlVar3.l;
            if (aqhpVar4 == null) {
                aqhpVar4 = aqhp.a;
            }
            j(avmmVar, nsrVar, str3, aqhpVar4.c);
        }
    }

    final void j(avmm avmmVar, nsr nsrVar, String str, String str2) {
        avmmVar.c(nsrVar.a(str2).af(new adhh(this, str2, str, 1)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    final void k() {
        if (this.g) {
            Iterable$EL.forEach(this.h.keySet().g(), new aalb(this.j, this, 6));
            return;
        }
        axlj axljVar = this.j;
        aqhl aqhlVar = this.b.c;
        if (aqhlVar == null) {
            aqhlVar = aqhl.a;
        }
        axljVar.a.put(aqhlVar.h, this);
    }

    public final synchronized void l(String str, String str2, aijp aijpVar, alap alapVar) {
        boolean z = this.g;
        aijp aijpVar2 = z ? (aijp) this.o.get(str2) : this.n;
        if (aijpVar2 != null) {
            aijp aijpVar3 = aikz.a;
            if (aiky.a(aijpVar, aijpVar2) <= 0) {
                return;
            }
        }
        if (z) {
            this.o.put(str2, aijpVar);
            if (this.f) {
                axlj axljVar = this.j;
                aqhl aqhlVar = (aqhl) this.h.get(str);
                axljVar.getClass();
                str2.getClass();
                acfz.ao(axljVar, aqhlVar, str2, null);
            }
        } else {
            this.n = aijpVar;
        }
        d(str, alapVar);
    }

    public final boolean m(String str) {
        boolean zContains = this.j.r(str).contains("suspense_error_data_key");
        if (this.g) {
            return zContains;
        }
        aqhl aqhlVar = this.b.c;
        if (aqhlVar == null) {
            aqhlVar = aqhl.a;
        }
        return (aqhlVar.b & 64) != 0 || zContains;
    }

    final synchronized void n(aihf aihfVar) {
        j$.util.Map.EL.forEach(this.o, new gpd(aihfVar, 16));
    }
}
