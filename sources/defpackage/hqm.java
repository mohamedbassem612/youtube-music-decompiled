package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqm implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hqm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v102, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, ola] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        ahcs ahcrVar;
        ListenableFuture aherVar;
        int i = 20;
        int i2 = 9;
        int i3 = 3;
        int i4 = 7;
        int i5 = 5;
        int i6 = 2;
        int i7 = 6;
        int i8 = 1;
        int i9 = 0;
        switch (this.$cid) {
            case 0:
                ListenableFuture listenableFutureD = ((aaqt) obj).d();
                jan janVar = (jan) this.a;
                ListenableFuture listenableFutureM = janVar.m();
                hys hysVar = new hys(i8);
                long j = afwl.a;
                ahcr ahcrVar2 = new ahcr(listenableFutureM, new afwi(afty.c(false), hysVar));
                ?? r2 = janVar.f;
                listenableFutureM.addListener(ahcrVar2, MoreExecutors.c(r2, ahcrVar2));
                ListenableFuture listenableFutureL = janVar.l();
                return new ahud(new ahek(false, agke.p(new ListenableFuture[]{listenableFutureD, listenableFutureL, ahcrVar2})), (byte[]) null).k(new hql(janVar, listenableFutureD, listenableFutureL, ahcrVar2, 0), r2);
            case 1:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    aherVar = new aher(Boolean.FALSE);
                } else {
                    Object obj2 = this.a;
                    annv annvVar = (annv) optional.get();
                    afx afxVar = new afx(0);
                    List listH = annvVar.h();
                    hpd hpdVar = ((hpk) obj2).c;
                    afxVar.add(hpdVar.j(listH));
                    afxVar.add(hpdVar.j(annvVar.k()));
                    Collection.EL.stream(annvVar.e()).forEach(new hpf(obj2, afxVar, i8));
                    Collection.EL.stream(annvVar.i()).forEach(new hpf(obj2, afxVar, i9));
                    Collection.EL.stream(annvVar.g()).forEach(new hpf(obj2, afxVar, i6));
                    Collection.EL.stream(annvVar.j()).forEach(new hpf(obj2, afxVar, i3));
                    Iterable iterable = (Iterable) Collection.EL.stream(afxVar).map(new hds(i7)).map(new hds(i4)).collect(aghu.b);
                    iterable.getClass();
                    awcy awcyVar = new awcy(iterable);
                    avnn avnnVar = atqp.l;
                    avmc avmcVarAn = awcyVar.D(avoi.a, true, Alert.DURATION_SHOW_INDEFINITELY).B(new hgu(i7)).an(Boolean.FALSE);
                    tzj tzjVar = new tzj();
                    avmcVarAn.F(new tzi(tzjVar));
                    aherVar = tzjVar;
                }
                return aherVar;
            case 2:
                boolean zEquals = Objects.equals((Boolean) obj, Boolean.TRUE);
                Object obj3 = this.a;
                if (zEquals) {
                    iuo iuoVar = (iuo) obj3;
                    return ahno.ar(iuoVar.k.Y(), new itg(obj3, 19), iuoVar.c);
                }
                ebs ebsVar = new ebs(obj3, i4);
                Executor executor = ((iuo) obj3).d;
                long j2 = afwl.a;
                ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), ebsVar, 1));
                executor.execute(ahfoVar);
                gqq gqqVar = new gqq(obj3, 13);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                afwi afwiVar = new afwi(afty.c(false), gqqVar);
                int i10 = ahcs.c;
                ahcrVar = new ahcr(ahfoVar, afwiVar);
                ahfoVar.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
                return ahcrVar;
            case 3:
                return ((zpw) this.a).g();
            case 4:
                int i11 = onb.a;
                zpw zpwVar = (zpw) this.a;
                Object obj4 = zpwVar.j;
                olp olpVar = (olp) obj4;
                ListenableFuture listenableFutureE = olpVar.e();
                idm idmVar = new idm(obj4, zpwVar.i, i2);
                long j3 = afwl.a;
                ahdb ahdbVar = new ahdb(afty.c(false), idmVar, 1);
                Executor executor2 = olpVar.g;
                int i12 = ahcs.c;
                ahcrVar = new ahcq(listenableFutureE, ahdbVar);
                listenableFutureE.addListener(ahcrVar, MoreExecutors.c(executor2, ahcrVar));
                return ahcrVar;
            case 5:
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((omh) it.next()).b);
                }
                omn omnVar = (omn) this.a;
                ListenableFuture listenableFutureE2 = omnVar.j.e();
                wnj wnjVar = new wnj(omnVar, arrayList, hashSet, i8);
                long j4 = afwl.a;
                afwi afwiVar2 = new afwi(afty.c(false), wnjVar);
                ?? r0 = omnVar.b;
                int i13 = ahcs.c;
                ahcrVar = new ahcr(listenableFutureE2, afwiVar2);
                listenableFutureE2.addListener(ahcrVar, MoreExecutors.c(r0, ahcrVar));
                return ahcrVar;
            case 6:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj5 = this.a;
                    if (!it2.hasNext()) {
                        omn omnVar2 = (omn) obj5;
                        ListenableFuture listenableFutureJ = omnVar2.j.j(arrayList2);
                        gqq gqqVar2 = new gqq(obj5, i);
                        ?? r1 = omnVar2.b;
                        long j5 = afwl.a;
                        afwi afwiVar3 = new afwi(afty.c(false), gqqVar2);
                        int i14 = ahcs.c;
                        ahcrVar = new ahcr(listenableFutureJ, afwiVar3);
                        listenableFutureJ.addListener(ahcrVar, MoreExecutors.c(r1, ahcrVar));
                        return ahcrVar;
                    }
                    omh omhVar = (omh) it2.next();
                    oiw oiwVar = omhVar.a;
                    oip oipVar = omhVar.b;
                    long jA = nsp.a(oipVar);
                    Long lValueOf = Long.valueOf(jA);
                    int i15 = onb.a;
                    lValueOf.getClass();
                    omn omnVar3 = (omn) obj5;
                    if (nsp.k(jA, (omj) omnVar3.d)) {
                        ((ong) omnVar3.a).k(1051, oipVar.d, oipVar.f, oipVar.s, oipVar.t);
                        arrayList2.add(oiwVar);
                        if (nsp.i(oipVar)) {
                            nsp.l((Context) omnVar3.g, (agev) omnVar3.e, oipVar, (ayq) omnVar3.k);
                        }
                    }
                }
                break;
            case 7:
                Object obj6 = this.a;
                omn omnVar4 = (omn) obj6;
                ListenableFuture listenableFutureC = omnVar4.j.c();
                hqm hqmVar = new hqm(obj6, i7);
                long j6 = afwl.a;
                ahdb ahdbVar2 = new ahdb(afty.c(false), hqmVar, 1);
                ?? r3 = omnVar4.b;
                int i16 = ahcs.c;
                ahcq ahcqVar = new ahcq(listenableFutureC, ahdbVar2);
                listenableFutureC.addListener(ahcqVar, MoreExecutors.c(r3, ahcqVar));
                ahcq ahcqVar2 = new ahcq(ahcqVar, new ahdb(afty.c(false), new hqm(obj6, 10), 1));
                ahcqVar.addListener(ahcqVar2, MoreExecutors.c(r3, ahcqVar2));
                return ahcqVar2;
            case 8:
                Object obj7 = this.a;
                omn omnVar5 = (omn) obj7;
                ListenableFuture listenableFutureC2 = omnVar5.f.c();
                idm idmVar2 = new idm(obj7, (Set) obj, i5);
                long j7 = afwl.a;
                ahdb ahdbVar3 = new ahdb(afty.c(false), idmVar2, 1);
                ?? r4 = omnVar5.b;
                int i17 = ahcs.c;
                ahcq ahcqVar3 = new ahcq(listenableFutureC2, ahdbVar3);
                listenableFutureC2.addListener(ahcqVar3, MoreExecutors.c(r4, ahcqVar3));
                aherVar = ahcqVar3;
                return aherVar;
            case 9:
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (true) {
                    Object obj8 = this.a;
                    if (!it3.hasNext()) {
                        omn omnVar6 = (omn) obj8;
                        ListenableFuture listenableFutureK = omnVar6.j.k();
                        idm idmVar3 = new idm(obj8, arrayList3, i7);
                        ?? r5 = omnVar6.b;
                        long j8 = afwl.a;
                        ahdb ahdbVar4 = new ahdb(afty.c(false), idmVar3, 1);
                        int i18 = ahcs.c;
                        ahcrVar = new ahcq(listenableFutureK, ahdbVar4);
                        listenableFutureK.addListener(ahcrVar, MoreExecutors.c(r5, ahcrVar));
                        return ahcrVar;
                    }
                    oip oipVar2 = (oip) it3.next();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    oio oioVar = oipVar2.c;
                    if (oioVar == null) {
                        oioVar = oio.a;
                    }
                    omn omnVar7 = (omn) obj8;
                    if (nsp.k(Math.min(timeUnit.toMillis(oioVar.c), nsp.a(oipVar2)), (omj) omnVar7.d)) {
                        ((ong) omnVar7.a).k(1052, oipVar2.d, oipVar2.f, oipVar2.s, oipVar2.t);
                        if (nsp.i(oipVar2)) {
                            nsp.l((Context) omnVar7.g, (agev) omnVar7.e, oipVar2, (ayq) omnVar7.k);
                        }
                    } else {
                        arrayList3.add(oipVar2);
                    }
                }
                break;
            case 10:
                Object obj9 = this.a;
                omn omnVar8 = (omn) obj9;
                ListenableFuture listenableFutureC3 = omnVar8.j.c();
                hqm hqmVar2 = new hqm(obj9, i5);
                long j9 = afwl.a;
                ahdb ahdbVar5 = new ahdb(afty.c(false), hqmVar2, 1);
                ?? r6 = omnVar8.b;
                int i19 = ahcs.c;
                ahcq ahcqVar4 = new ahcq(listenableFutureC3, ahdbVar5);
                listenableFutureC3.addListener(ahcqVar4, MoreExecutors.c(r6, ahcqVar4));
                ahcq ahcqVar5 = new ahcq(ahcqVar4, new ahdb(afty.c(false), new hqm(obj9, 8), 1));
                ahcqVar4.addListener(ahcqVar5, MoreExecutors.c(r6, ahcqVar5));
                return ahcqVar5;
            case 11:
                if (!((Boolean) obj).booleanValue()) {
                    ((ong) ((omn) this.a).a).j(1036);
                    onb.c("%s: Failed to write back stale groups!", "ExpirationHandler");
                }
                return aher.a;
            case 12:
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = ((List) obj).iterator();
                while (true) {
                    Object obj10 = this.a;
                    if (!it4.hasNext()) {
                        return new kjc(new ahek(false, agke.j(arrayList4))).N(new okp(i9), ((xgg) obj10).k);
                    }
                    oiw oiwVar2 = (oiw) it4.next();
                    xgg xggVar = (xgg) obj10;
                    if (!xggVar.v(oiwVar2.d)) {
                        arrayList4.add(xggVar.s(xggVar.m.g(oiwVar2), new okn(obj10, (aihn) oiwVar2, 4)));
                    }
                }
                break;
            case 13:
                omh omhVar2 = (omh) obj;
                oiw oiwVar3 = omhVar2.a;
                oip oipVar3 = omhVar2.b;
                boolean z = oiwVar3.f;
                Object obj11 = this.a;
                if (!z || !nsp.i(oipVar3)) {
                    ((ong) ((xgg) obj11).d).n(xgg.x(oipVar3), 2);
                    return aher.a;
                }
                xgg xggVar2 = (xgg) obj11;
                xggVar2.l.x();
                return xggVar2.s(!nsp.i(oipVar3) ? ahng.n(Boolean.TRUE) : ooi.d(xggVar2.m(oipVar3)).e(new kjh(obj11, oipVar3, i6), xggVar2.k), new okn(obj11, (aihn) oipVar3, 11));
            case 14:
                return ((olp) this.a).c.b();
            case 15:
                Object obj12 = this.a;
                olp olpVar2 = (olp) obj12;
                ListenableFuture listenableFutureA = olpVar2.d.a();
                hqm hqmVar3 = new hqm(obj12, 14);
                long j10 = afwl.a;
                ahdb ahdbVar6 = new ahdb(afty.c(false), hqmVar3, 1);
                Executor executor3 = olpVar2.g;
                int i20 = ahcs.c;
                ahcq ahcqVar6 = new ahcq(listenableFutureA, ahdbVar6);
                listenableFutureA.addListener(ahcqVar6, MoreExecutors.c(executor3, ahcqVar6));
                aherVar = ahcqVar6;
                return aherVar;
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    return aher.a;
                }
                Object obj13 = this.a;
                onb.h("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
                return ((olp) obj13).b();
            case 17:
                if (((Boolean) obj).booleanValue()) {
                    return aher.a;
                }
                Object obj14 = this.a;
                onb.h("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                return ((olp) obj14).b();
            case 18:
                ArrayList arrayList5 = new ArrayList();
                for (omh omhVar3 : (List) obj) {
                    Object obj15 = this.a;
                    oiw oiwVar4 = omhVar3.a;
                    ooi ooiVarD = ooi.d(aher.a);
                    oll ollVar = new oll(omhVar3, i5);
                    Executor executor4 = ((olp) obj15).g;
                    arrayList5.add(ooiVarD.f(ollVar, executor4).f(new olb(obj15, omhVar3, i), executor4));
                }
                return new kjc(new ahek(false, agke.j(arrayList5))).N(new okp(i7), MoreExecutors.directExecutor());
            case 19:
                olp olpVar3 = (olp) this.a;
                olpVar3.k.j(1053);
                omn omnVar9 = olpVar3.n;
                ListenableFuture listenableFutureE3 = omnVar9.j.e();
                hqm hqmVar4 = new hqm(omnVar9, i2);
                long j11 = afwl.a;
                ahdb ahdbVar7 = new ahdb(afty.c(false), hqmVar4, 1);
                int i21 = ahcs.c;
                ?? r7 = omnVar9.b;
                ahcq ahcqVar7 = new ahcq(listenableFutureE3, ahdbVar7);
                listenableFutureE3.addListener(ahcqVar7, MoreExecutors.c(r7, ahcqVar7));
                ahcq ahcqVar8 = new ahcq(ahcqVar7, new ahdb(afty.c(false), new hqm(omnVar9, i4), 1));
                ahcqVar7.addListener(ahcqVar8, MoreExecutors.c(r7, ahcqVar8));
                return ahcqVar8;
            default:
                olp olpVar4 = (olp) this.a;
                SharedPreferences sharedPreferences = olpVar4.b.getSharedPreferences(qnl.aO("gms_icing_mdd_manager_metadata", olpVar4.f), 0);
                if (sharedPreferences.getBoolean("mdd_migrated_to_offroad", false)) {
                    return aher.a;
                }
                int i22 = onb.a;
                ListenableFuture listenableFutureB = olpVar4.b();
                olh olhVar = new olh(sharedPreferences, i9);
                Executor executor5 = olpVar4.g;
                long j12 = afwl.a;
                ahcr ahcrVar3 = new ahcr(listenableFutureB, new afwi(afty.c(false), olhVar));
                listenableFutureB.addListener(ahcrVar3, MoreExecutors.c(executor5, ahcrVar3));
                aherVar = ahcrVar3;
                return aherVar;
        }
    }
}
