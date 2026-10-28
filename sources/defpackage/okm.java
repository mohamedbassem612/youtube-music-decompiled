package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class okm implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ okm(abnl abnlVar, abnp abnpVar, String str, agek agekVar, vyo vyoVar, int i) {
        this.$cid = i;
        this.b = abnlVar;
        this.a = abnpVar;
        this.c = str;
        this.e = agekVar;
        this.d = vyoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r15v0, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r4v12, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, wco] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        ListenableFuture listenableFutureG;
        Optional optionalEmpty;
        ListenableFuture listenableFutureE;
        ListenableFuture listenableFutureE2;
        Optional optionalOf;
        int iAU;
        int iAU2;
        int i = 5;
        int i2 = 0;
        int i3 = 19;
        int i4 = 2;
        switch (this.$cid) {
            case 0:
                oip oipVar = (oip) obj;
                Object obj2 = this.c;
                Object obj3 = this.b;
                Object obj4 = this.a;
                if (oipVar == null) {
                    xgg xggVar = (xgg) obj4;
                    return xggVar.s(xggVar.i((oiw) obj3, true), new okn(obj3, obj2, 6));
                }
                ((AtomicReference) obj2).set(oipVar);
                oio oioVar = oipVar.c;
                if (oioVar == null) {
                    oioVar = oio.a;
                }
                int i5 = oioVar.g + 1;
                aihf builder = oipVar.toBuilder();
                aihf builder2 = oioVar.toBuilder();
                builder2.copyOnWrite();
                oio oioVar2 = (oio) builder2.instance;
                oioVar2.b |= 16;
                oioVar2.g = i5;
                builder.copyOnWrite();
                oip oipVar2 = (oip) builder.instance;
                oio oioVar3 = (oio) builder2.build();
                oioVar3.getClass();
                oipVar2.c = oioVar3;
                oipVar2.b |= 1;
                oip oipVar3 = (oip) builder.build();
                boolean z = (oioVar.b & 8) != 0;
                boolean z2 = !z;
                if (!z) {
                    long jF = ((omj) ((xgg) obj4).i).f();
                    oio oioVar4 = oipVar3.c;
                    if (oioVar4 == null) {
                        oioVar4 = oio.a;
                    }
                    aihf builder3 = oioVar4.toBuilder();
                    builder3.copyOnWrite();
                    oio oioVar5 = (oio) builder3.instance;
                    oioVar5.b |= 8;
                    oioVar5.f = jF;
                    oio oioVar6 = (oio) builder3.build();
                    aihf builder4 = oipVar3.toBuilder();
                    builder4.copyOnWrite();
                    oip oipVar4 = (oip) builder4.instance;
                    oioVar6.getClass();
                    oipVar4.c = oioVar6;
                    oipVar4.b |= 1;
                    oipVar3 = (oip) builder4.build();
                }
                ListenableFuture listenableFutureN = ahng.n(oipVar3);
                int i6 = 18;
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = oipVar3.o.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((xgg) obj4).l((oin) it.next(), oipVar3));
                    }
                    kjc kjcVar = new kjc(ahng.i(arrayList));
                    iug iugVar = new iug(arrayList, 19);
                    ?? r2 = ((xgg) obj4).k;
                    listenableFutureN = ooi.d(kjcVar.N(iugVar, r2)).e(new iun(oipVar3, i6), r2);
                }
                ?? r15 = this.e;
                Object obj5 = this.d;
                ooi ooiVarD = ooi.d(listenableFutureN);
                okn oknVar = new okn(obj4, (aihn) obj3, i2);
                xgg xggVar2 = (xgg) obj4;
                ?? r5 = xggVar2.k;
                return ooi.d(ooiVarD.f(oknVar, r5).f(new iak(xggVar2, z2, listenableFutureN, i4), r5)).c(IOException.class, new gpr(18), r5).f(new iaj(xggVar2, (oir) obj5, (oiw) obj3, (ahcy) r15, 12), r5);
            case 1:
                agev agevVar = (agev) obj;
                boolean zG = agevVar.g();
                Object obj6 = this.b;
                ?? r16 = this.a;
                Object obj7 = this.c;
                Object obj8 = this.d;
                if (zG) {
                    hwz hwzVar = ((hsj) obj8).j;
                    aamt aamtVar = (aamt) agevVar.c();
                    if (igs.c(((hfn) hwzVar.a).g(aamtVar.a)) && hfn.m(aamtVar.n)) {
                        aamt aamtVar2 = (aamt) agevVar.c();
                        String str = (String) obj7;
                        r16.k().c(str);
                        aaew aaewVar = (aaew) obj6;
                        aaewVar.S(str, aamg.ACTIVE);
                        if (aamtVar2.e || aaewVar.L(str)) {
                            r16.l().p(str, true);
                            optionalOf = Optional.of(aamtVar2.a);
                        } else {
                            ((tbt) hwzVar.b).e(new aahx(str, 2));
                            optionalOf = Optional.empty();
                        }
                        return ahng.n(optionalOf);
                    }
                }
                Object obj9 = this.e;
                if (agevVar.g() && !((aamt) agevVar.c()).j()) {
                    aamt aamtVar3 = (aamt) agevVar.c();
                    String str2 = ((anyr) obj9).i;
                    hsj hsjVar = (hsj) obj8;
                    abfv abfvVar = hsjVar.l;
                    if (kro.aR(aamtVar3.b())) {
                        listenableFutureE2 = ahng.n(Boolean.FALSE);
                    } else {
                        Object obj10 = abfvVar.a;
                        String strB = aamtVar3.b();
                        if (ahno.aa(strB)) {
                            listenableFutureE = ahng.n(Boolean.FALSE);
                        } else {
                            abxv abxvVar = (abxv) obj10;
                            listenableFutureE = ahcs.e(tzk.e(abxvVar.a.b(abxvVar.c.e()).g(wfs.g(aknw.b.a(), strB)).g(aknu.class)), new aaat(obj10, strB, i, null), abxvVar.d);
                        }
                        listenableFutureE2 = ahcs.e(listenableFutureE, new aagw(aamtVar3, i3), abfvVar.b);
                    }
                    return ahno.ar(listenableFutureE2, new hsh(hsjVar, aamtVar3, (aaew) obj6, (String) obj7, (aaqn) r16, str2, 0), hsjVar.c);
                }
                hsj hsjVar2 = (hsj) obj8;
                String str3 = (String) obj7;
                aaex aaexVar = (aaex) obj6;
                if (igs.c(((hfn) hsjVar2.j.a).g(aaexVar.aj(str3))) && aaexVar.ah(str3) == aamg.DELETED) {
                    aaew aaewVar2 = (aaew) obj6;
                    if (aaewVar2.P(str3, aamg.ACTIVE, hsjVar2.g.e(), ((anyr) obj9).d.G())) {
                        aaewVar2.L(str3);
                        optionalEmpty = Optional.ofNullable(aaexVar.aj(str3));
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                    return ahng.n(optionalEmpty);
                }
                anyr anyrVar = (anyr) obj9;
                if ((anyrVar.c & 4) != 0) {
                    anzd anzdVar = anyrVar.f;
                    if (anzdVar == null) {
                        anzdVar = anzd.a;
                    }
                    String str4 = anyrVar.i;
                    ankd ankdVar = anyrVar.g;
                    if (ankdVar == null) {
                        ankdVar = ankd.a;
                    }
                    listenableFutureG = ahng.n(Optional.of(hsj.h(anzdVar, str4, ankdVar, anyrVar.h)));
                } else {
                    listenableFutureG = hsjVar2.g(str3);
                }
                return ahno.ar(listenableFutureG, new hro(hsjVar2, (aaqn) r16, (aaew) obj6, anyrVar, 2), hsjVar2.d);
            case 2:
                oky okyVar = (oky) obj;
                okyVar.name();
                oin oinVar = (oin) this.d;
                String str5 = oinVar.c;
                oip oipVar5 = (oip) this.b;
                String str6 = oipVar5.d;
                int i7 = onb.a;
                ojb ojbVar = (ojb) ahng.v(this.c);
                int iOrdinal = okyVar.ordinal();
                Object obj11 = this.e;
                Object obj12 = this.a;
                if (iOrdinal == 1) {
                    xgg xggVar3 = (xgg) obj11;
                    return xggVar3.s(xggVar3.B(oipVar5, oinVar, ojbVar, (oiz) obj12, ojbVar.g, oipVar5.l, 3), new gpr(19));
                }
                if (iOrdinal == 3) {
                    return ((xgg) obj11).z(oipVar5, oinVar, (oiz) obj12, ojbVar, 4);
                }
                if (iOrdinal == 4) {
                    oiv oivVarA = oiv.a(ojbVar.d);
                    if (oivVarA == null) {
                        oivVarA = oiv.NONE;
                    }
                    if (oivVarA == oiv.DOWNLOAD_COMPLETE && (iAU = a.aU(oinVar.m)) != 0 && iAU == 2) {
                        return ((xgg) obj11).A(oipVar5, oinVar, (oiz) obj12, ojbVar, 6);
                    }
                }
                String str7 = oinVar.c;
                String str8 = oipVar5.d;
                return aher.a;
            case 3:
                oky okyVar2 = (oky) obj;
                okyVar2.name();
                oin oinVar2 = (oin) this.d;
                String str9 = oinVar2.c;
                oip oipVar6 = (oip) this.b;
                String str10 = oipVar6.d;
                int i8 = onb.a;
                int iOrdinal2 = okyVar2.ordinal();
                Object obj13 = this.c;
                Object obj14 = this.e;
                Object obj15 = this.a;
                if (iOrdinal2 == 1) {
                    long j = oipVar6.l;
                    ojb ojbVar2 = (ojb) obj14;
                    if (!xgg.w(ojbVar2, j)) {
                        return aher.a;
                    }
                    String str11 = oinVar2.c;
                    String str12 = oipVar6.d;
                    oiz oizVar = (oiz) obj15;
                    xgg xggVar4 = (xgg) obj13;
                    return xggVar4.s(xggVar4.B(oipVar6, oinVar2, ojbVar2, oizVar, ojbVar2.g, j, 27), new abpm(xggVar4, oipVar6, oinVar2, oizVar, j, 1));
                }
                if (iOrdinal2 == 3) {
                    return ((xgg) obj13).z(oipVar6, oinVar2, (oiz) obj15, (ojb) obj14, 5);
                }
                if (iOrdinal2 == 4 && (iAU2 = a.aU(oinVar2.m)) != 0 && iAU2 == 2) {
                    return ((xgg) obj13).A(oipVar6, oinVar2, (oiz) obj15, (ojb) obj14, 7);
                }
                int iAU3 = a.aU(oinVar2.m);
                if (iAU3 != 0 && iAU3 == 2) {
                    xgg.D((ong) ((xgg) obj13).d, oipVar6, oinVar2, 16);
                }
                String str13 = oinVar2.c;
                String str14 = oipVar6.d;
                return ((xgg) obj13).t(oipVar6, oinVar2, (oiz) obj15, oipVar6.l);
            case 4:
                int i9 = ((ojb) obj).h;
                this.b.i();
                Object obj16 = this.d;
                Object obj17 = this.e;
                if (i9 < 5) {
                    int i10 = onb.a;
                    try {
                        ((ayq) obj17).aa((Uri) obj16);
                    } catch (IOException e) {
                        onb.g(e, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", this.c);
                        return ahng.m(e);
                    }
                    break;
                } else {
                    Object obj18 = this.a;
                    int i11 = onb.a;
                    ((ong) obj18).j(1115);
                }
                return aher.a;
            case 5:
                agke agkeVar = agpi.a;
                if (!((Boolean) obj).booleanValue()) {
                    return ahng.n(agkeVar);
                }
                ?? r0 = this.a;
                avmb avmbVar = (avmb) this.c;
                avlb avlbVarV = ((avlb) this.e).v(avmbVar);
                int i12 = tqr.a;
                if (r0.l(1074355139, 2)) {
                    avlbVarV = avlbVarV.r(avmbVar);
                }
                return rrx.f(ape.f(new sdf(avlbVarV, 1)), agkeVar, 30L, ((rrx) this.d).c);
            case 6:
                return acqf.e((wgi) obj, (abnl) this.d, (abnp) this.b, (String) this.c, this.e, (vyo) ((acqf) this.a).c);
            default:
                return acqf.e((wgi) obj, (abnl) this.b, (abnp) this.a, (String) this.c, this.e, (vyo) this.d);
        }
    }

    public /* synthetic */ okm(acqf acqfVar, abnl abnlVar, abnp abnpVar, String str, agek agekVar, int i) {
        this.$cid = i;
        this.a = acqfVar;
        this.d = abnlVar;
        this.b = abnpVar;
        this.c = str;
        this.e = agekVar;
    }

    public /* synthetic */ okm(hsj hsjVar, String str, aaqn aaqnVar, aaew aaewVar, anyr anyrVar, int i) {
        this.$cid = i;
        this.d = hsjVar;
        this.c = str;
        this.a = aaqnVar;
        this.b = aaewVar;
        this.e = anyrVar;
    }

    public /* synthetic */ okm(oii oiiVar, String str, ong ongVar, ayq ayqVar, Uri uri, int i) {
        this.$cid = i;
        this.b = oiiVar;
        this.c = str;
        this.a = ongVar;
        this.e = ayqVar;
        this.d = uri;
    }

    public /* synthetic */ okm(rrx rrxVar, avlb avlbVar, avmb avmbVar, rmp rmpVar, tqj tqjVar, int i) {
        this.$cid = i;
        this.d = rrxVar;
        this.e = avlbVar;
        this.c = avmbVar;
        this.b = rmpVar;
        this.a = tqjVar;
    }

    public /* synthetic */ okm(xgg xggVar, oin oinVar, oip oipVar, ListenableFuture listenableFuture, oiz oizVar, int i) {
        this.$cid = i;
        this.e = xggVar;
        this.d = oinVar;
        this.b = oipVar;
        this.c = listenableFuture;
        this.a = oizVar;
    }

    public /* synthetic */ okm(xgg xggVar, oin oinVar, oip oipVar, ojb ojbVar, oiz oizVar, int i) {
        this.$cid = i;
        this.c = xggVar;
        this.d = oinVar;
        this.b = oipVar;
        this.e = ojbVar;
        this.a = oizVar;
    }

    public /* synthetic */ okm(xgg xggVar, oiw oiwVar, AtomicReference atomicReference, oir oirVar, ahcy ahcyVar, int i) {
        this.$cid = i;
        this.a = xggVar;
        this.b = oiwVar;
        this.c = atomicReference;
        this.d = oirVar;
        this.e = ahcyVar;
    }
}
