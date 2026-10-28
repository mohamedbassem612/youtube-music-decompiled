package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import j$.util.Collection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sqb extends spx implements rsd {
    public final smc b;
    public final sga c;
    public aaxo d;
    public boolean e;
    public final zdj f;
    private final vxe g;
    private final vyo h;
    private final abmt i;
    private final awmd j;
    private final Set k;
    private final SparseArray l;
    private avmn m;
    private long n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final snz s;

    public sqb(snz snzVar, skl sklVar, smc smcVar, String str, aaxo aaxoVar, adws adwsVar, zdj zdjVar, sga sgaVar, vxe vxeVar, vyo vyoVar, awmd awmdVar, abmt abmtVar) {
        this.d = null;
        this.s = snzVar;
        smcVar.getClass();
        this.b = smcVar;
        this.c = sgaVar;
        this.g = vxeVar;
        this.h = vyoVar;
        this.i = abmtVar;
        this.j = awmdVar;
        this.l = C(smcVar, vyoVar);
        this.k = new HashSet();
        int i = 1;
        for (int i2 = 1; i2 < 4; i2++) {
            this.k.add(Integer.valueOf(i2));
        }
        this.d = aaxoVar;
        this.f = zdjVar;
        if (zdjVar != null) {
            zdjVar.b = this;
        }
        sgaVar.e(sklVar.e, str);
        sgaVar.d(Long.valueOf(sklVar.a()), sklVar.b());
        sgaVar.e = new skm(smcVar);
        sgaVar.b = this.d;
        this.m = adwsVar.b().ak(new sqk(this, i));
    }

    private static SparseArray C(smc smcVar, vyo vyoVar) {
        SparseArray sparseArray = new SparseArray();
        if (smcVar.ab() != null && !smcVar.ab().isEmpty()) {
            for (aivk aivkVar : smcVar.ab()) {
                int iMin = (smcVar.n.aA() && afxw.e(vyoVar).aG) ? Math.min(aivkVar.d, smcVar.a() * 1000) : aivkVar.d;
                List arrayList = (List) sparseArray.get(iMin);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aivkVar);
                sparseArray.put(iMin, arrayList);
            }
        }
        return sparseArray;
    }

    private static agke D(List list) {
        if (list == null || list.isEmpty()) {
            return agpi.a;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aivk aivkVar = (aivk) it.next();
            if (aivkVar != null && (aivkVar.b & 1) != 0) {
                try {
                    Uri uriC = tyu.c(aivkVar.c);
                    if (uriC != null && !uriC.equals(Uri.EMPTY)) {
                        linkedList.add(uriC);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return agke.n(linkedList);
    }

    private final void E(long j) {
        long j2;
        long j3;
        int i;
        SparseArray sparseArray;
        this.n = j;
        sga sgaVar = this.c;
        sgaVar.d = j;
        if (this.e) {
            j2 = 1000;
            j3 = -1000;
            i = 0;
        } else {
            j3 = -1000;
            if (j > 1000) {
                if (this.r) {
                    return;
                }
                smc smcVar = this.b;
                long jOrElse = Collection.EL.stream(smcVar.X()).filter(new sde(9)).mapToInt(new ddc(8)).findFirst().orElse(-1);
                if (smcVar.n.aA() || this.i.ao() || jOrElse > 0) {
                    ((ruu) this.j.io()).a("impressionmissed", String.format(Locale.US, "adcpn.%s;millis.%d;delay.%d;window.%d;delta.%d;", smcVar.o, Long.valueOf(j), Long.valueOf(jOrElse), 1000L, Long.valueOf(j - 1000)));
                }
                this.r = true;
                return;
            }
            i = 0;
            this.p = true;
            zdj zdjVar = this.f;
            ofg ofgVarM = zdjVar != null ? zdjVar.m() : null;
            snz snzVar = this.s;
            smc smcVar2 = this.b;
            j2 = 1000;
            snzVar.e(smcVar2.X());
            B(smcVar2.ae(), ofgVarM);
            if (smcVar2.p() != null) {
                A(smcVar2.p().b, ofgVarM, sgaVar);
            }
            this.e = true;
            long jOrElse2 = Collection.EL.stream(smcVar2.X()).filter(new sde(10)).mapToInt(new ddc(8)).findFirst().orElse(-1);
            if (smcVar2.n.aA() || this.i.ao() || jOrElse2 > 0) {
                ((ruu) this.j.io()).a("impressionpinged", String.format(Locale.US, "adcpn.%s;millis.%d;delay.%d;", smcVar2.o, Long.valueOf(j), Long.valueOf(jOrElse2)));
            }
        }
        smc smcVar3 = this.b;
        long jA = smcVar3.a();
        Set set = this.k;
        Iterator it = set.iterator();
        while (true) {
            long j4 = jA * j2;
            if (!it.hasNext()) {
                if (this.q || !H(j, j4)) {
                    break;
                    break;
                }
                zdj zdjVar2 = this.f;
                B(smcVar3.S(), zdjVar2 != null ? zdjVar2.j() : null);
                this.q = true;
                break;
            }
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (H(j, (((long) iIntValue) * j4) / 4)) {
                zdj zdjVar3 = this.f;
                B(j(smcVar3, iIntValue), zdjVar3 != null ? zdjVar3.p(iIntValue) : null);
                set.remove(num);
                break;
            }
        }
        HashSet hashSet = new HashSet();
        int i2 = i;
        while (true) {
            sparseArray = this.l;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            long j5 = iKeyAt;
            if (j >= j5 + j3 && j <= j5 + j2) {
                this.s.e((List) sparseArray.get(iKeyAt));
                hashSet.add(Integer.valueOf(iKeyAt));
            }
            i2++;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sparseArray.remove(((Integer) it2.next()).intValue());
        }
    }

    private final void F(List list, zzi... zziVarArr) {
        vxe vxeVar = this.g;
        if (vxeVar == null || list.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        if (zziVarArr.length != 0) {
            map.put("MacrosConverters.CustomConvertersKey", zziVarArr);
        }
        yno.eA(vxeVar, list, map);
    }

    private final void G() {
        zdj zdjVar = this.f;
        if (zdjVar != null) {
            zdjVar.s();
            zdjVar.r();
            zdjVar.b = null;
        }
    }

    private static boolean H(long j, long j2) {
        return j >= (-1000) + j2 && j <= j2 + 1000;
    }

    public final void A(List list, ofg ofgVar, sga sgaVar) {
        F(list, sgaVar.c(ofgVar));
    }

    public final void B(List list, ofg ofgVar) {
        this.s.d(list, this.c.c(ofgVar));
    }

    @Override // defpackage.rsd
    public final ogm a() {
        int iA = this.b.a() * 1000;
        int i = (int) this.n;
        abnr abnrVar = this.d.a;
        return new ogm(iA, i, abnrVar == abnr.FULLSCREEN, abnrVar == abnr.BACKGROUND);
    }

    @Override // defpackage.rsd
    public final Set b(ogj ogjVar) {
        List listD;
        LinkedList linkedList = new LinkedList();
        int iOrdinal = ogjVar.ordinal();
        smc smcVar = this.b;
        switch (iOrdinal) {
            case 0:
                listD = D(smcVar.ae());
                break;
            case 1:
                listD = D(smcVar.V());
                break;
            case 2:
                listD = D(smcVar.Z());
                break;
            case 3:
                listD = D(smcVar.af());
                break;
            case 4:
                listD = D(smcVar.S());
                break;
            case 5:
                listD = D(smcVar.ac());
                break;
            case 6:
                listD = D(smcVar.aa());
                break;
            case 7:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                listD = Collections.EMPTY_LIST;
                break;
            case 8:
                listD = D(smcVar.K());
                break;
            case 10:
                listD = D(smcVar.ad());
                break;
            case 14:
                listD = D(smcVar.P());
                break;
            case 15:
                listD = D(smcVar.O());
                break;
            case 16:
                listD = D(smcVar.N());
                break;
            case 17:
                listD = D(smcVar.W());
                break;
            case 18:
                listD = D(smcVar.T());
                break;
            case 19:
                listD = D(smcVar.L());
                break;
            case 20:
                listD = D(smcVar.M());
                break;
        }
        linkedList.addAll(listD);
        return zzj.b(linkedList, this.c.a);
    }

    @Override // defpackage.rsd
    public final void c(ofg ofgVar) {
        if (this.p) {
            smc smcVar = this.b;
            B(smcVar.L(), ofgVar);
            if (smcVar.p() != null) {
                aivd aivdVar = smcVar.p().m;
                if (aivdVar == null) {
                    aivdVar = aivd.a;
                }
                A(aivdVar.b, ofgVar, this.c);
            }
        }
    }

    @Override // defpackage.rsd
    public final void d(ofg ofgVar) {
        if (this.p) {
            smc smcVar = this.b;
            B(smcVar.M(), ofgVar);
            if (smcVar.p() != null) {
                aivd aivdVar = smcVar.p().m;
                if (aivdVar == null) {
                    aivdVar = aivd.a;
                }
                A(aivdVar.c, ofgVar, this.c);
            }
        }
    }

    @Override // defpackage.rsd
    public final void e(ofg ofgVar) {
        if (this.p) {
            smc smcVar = this.b;
            B(smcVar.N(), ofgVar);
            if (smcVar.p() != null) {
                A(smcVar.p().p, ofgVar, this.c);
            }
        }
    }

    @Override // defpackage.rsd
    public final void f(ofg ofgVar) {
        if (this.p) {
            smc smcVar = this.b;
            B(smcVar.O(), ofgVar);
            if (smcVar.p() != null) {
                A(smcVar.p().o, ofgVar, this.c);
            }
        }
    }

    @Override // defpackage.rsd
    public final void g(ofg ofgVar) {
        if (this.p) {
            smc smcVar = this.b;
            B(smcVar.P(), ofgVar);
            if (smcVar.p() != null) {
                A(smcVar.p().n, ofgVar, this.c);
            }
        }
    }

    @Override // defpackage.spx
    public final sga h() {
        return this.c;
    }

    @Override // defpackage.spx
    public final String i() {
        return this.b.o;
    }

    @Override // defpackage.spx
    public final void k() {
        smc smcVar = this.b;
        if ((smcVar.n.aA() || afxw.e(this.h).cv) && this.e) {
            zdj zdjVar = this.f;
            B(smcVar.K(), zdjVar != null ? zdjVar.i() : null);
        }
    }

    @Override // defpackage.spx
    public final void m(int i, int i2) {
        smc smcVar = this.b;
        if ((smcVar.n.aA() || this.i.ao()) && this.e) {
            zdj zdjVar = this.f;
            B(smcVar.ad(), zdjVar != null ? zdjVar.q() : null);
        }
    }

    @Override // defpackage.spx
    public final void n(long j) {
        E(j);
    }

    @Override // defpackage.spx
    public final void o() {
        if (this.e) {
            snz snzVar = this.s;
            smc smcVar = this.b;
            snzVar.e(smcVar.Q());
            if (smcVar.p() != null) {
                F(smcVar.p().k, new zzi[0]);
            }
        }
    }

    @Override // defpackage.spx
    public final void s() {
        this.o = false;
        sga sgaVar = this.c;
        sgaVar.c = false;
        if (this.e) {
            zdj zdjVar = this.f;
            ofg ofgVarN = zdjVar != null ? zdjVar.n() : null;
            smc smcVar = this.b;
            B(smcVar.aa(), ofgVarN);
            if (smcVar.p() != null) {
                A(smcVar.p().d, ofgVarN, sgaVar);
            }
        }
    }

    @Override // defpackage.spx
    public final void t() {
        zdj zdjVar;
        if (!this.e || (zdjVar = this.f) == null) {
            return;
        }
        zdjVar.t();
    }

    @Override // defpackage.spx
    public final void u() {
        if (this.o) {
            return;
        }
        this.o = true;
        sga sgaVar = this.c;
        sgaVar.c = true;
        if (this.e) {
            zdj zdjVar = this.f;
            ofg ofgVarO = zdjVar != null ? zdjVar.o() : null;
            smc smcVar = this.b;
            B(smcVar.ac(), ofgVarO);
            if (smcVar.p() != null) {
                A(smcVar.p().e, ofgVarO, sgaVar);
            }
        }
    }

    @Override // defpackage.spx
    public final void w() {
        smc smcVar = this.b;
        if (smcVar.n.aA() && afxw.e(this.h).aF) {
            this.s.e(smcVar.R());
            if (smcVar.p() != null) {
                F(smcVar.p().i, new zzi[0]);
            }
        }
    }

    @Override // defpackage.spx
    public final void x(aazk aazkVar) {
        if (aazkVar.h) {
            E(aazkVar.a);
        }
    }

    @Override // defpackage.spx
    public final void y(aazn aaznVar) {
        if (this.e) {
            int i = aaznVar.a;
            if (i == 9 || i == 10) {
                G();
            }
        }
    }

    @Override // defpackage.spx
    public final void z() {
        if (this.e) {
            G();
        }
        Object obj = this.m;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.m = null;
        }
    }

    @Override // defpackage.spx
    public final void q() {
    }

    @Override // defpackage.spx
    public final void r() {
    }

    @Override // defpackage.spx
    public final void v() {
    }

    @Override // defpackage.spx
    public final void l(sgm sgmVar) {
    }

    @Override // defpackage.spx
    public final void p(zhz zhzVar) {
    }

    public sqb(snz snzVar, smc smcVar, String str, aaxo aaxoVar, adws adwsVar, zdj zdjVar, sga sgaVar, vxe vxeVar, String str2, Long l, slm slmVar, vyo vyoVar, awmd awmdVar, abmt abmtVar) {
        this.d = null;
        this.s = snzVar;
        smcVar.getClass();
        this.b = smcVar;
        this.c = sgaVar;
        this.g = vxeVar;
        this.h = vyoVar;
        this.i = abmtVar;
        this.j = awmdVar;
        this.l = C(smcVar, vyoVar);
        this.k = new HashSet();
        int i = 1;
        for (int i2 = 1; i2 < 4; i2++) {
            this.k.add(Integer.valueOf(i2));
        }
        this.d = aaxoVar;
        this.f = zdjVar;
        if (zdjVar != null) {
            zdjVar.b = this;
        }
        sgaVar.e(str2, str);
        sgaVar.d(l, slmVar);
        sgaVar.e = new skm(smcVar);
        sgaVar.b = this.d;
        this.m = adwsVar.b().ak(new sqk(this, i));
    }
}
