package defpackage;

import android.os.Build;
import android.provider.MediaStore;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hoy implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hoy(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        ListenableFuture listenableFutureAs;
        ListenableFuture listenableFutureAs2;
        int i = 9;
        int i2 = 7;
        int i3 = 15;
        int i4 = 1;
        int i5 = 10;
        switch (this.$cid) {
            case 0:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return ahng.n(Optional.empty());
                }
                boolean z = this.a;
                Object obj2 = this.b;
                weh wehVar = (weh) optional.get();
                if (wehVar instanceof anjx) {
                    anjx anjxVar = (anjx) wehVar;
                    return ((hpb) obj2).l(anjxVar, anjxVar.e(), anjxVar.c.z, true, z);
                }
                if (!(wehVar instanceof anuk)) {
                    return ahng.n(Optional.empty());
                }
                anuk anukVar = (anuk) wehVar;
                if (!hpb.s(anukVar)) {
                    return ((hpb) obj2).l(anukVar, anukVar.j(), anukVar.h(), false, z);
                }
                hpb hpbVar = (hpb) obj2;
                return ahno.as(hpbVar.f(anukVar.j()), new iak(obj2, anukVar, z, i4), hpbVar.d);
            case 1:
                wtr wtrVar = (wtr) obj;
                aihf aihfVarCreateBuilder = apqf.a.createBuilder();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apqg.b);
                Object obj3 = this.b;
                aihi aihiVar = (aihi) obj3;
                aihiVar.c(aihlVarCheckIsLite);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
                Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
                boolean z2 = this.a;
                String str = ((apqg) objC).c;
                aihfVarCreateBuilder.copyOnWrite();
                apqf apqfVar = (apqf) aihfVarCreateBuilder.instance;
                str.getClass();
                apqfVar.c |= 1;
                apqfVar.f = str;
                aihfVarCreateBuilder.copyOnWrite();
                apqf apqfVar2 = (apqf) aihfVarCreateBuilder.instance;
                apqfVar2.d = 3;
                apqfVar2.e = Boolean.valueOf(z2);
                apqf apqfVar3 = (apqf) aihfVarCreateBuilder.build();
                wtx wtxVarB = wtrVar.b();
                wtxVarB.n(vxg.a((ajwo) obj3));
                wtxVarB.e(apqfVar3);
                return wtrVar.d(wtxVarB);
            case 2:
                boolean z3 = this.a;
                agke agkeVar = (agke) obj;
                Object obj4 = this.b;
                return ahno.ar(z3 ? ((hpk) obj4).b.c((List) Collection.EL.stream(agkeVar).map(new hpa(i2)).collect(aghu.a)) : ((hpk) obj4).b.b((List) Collection.EL.stream(agkeVar).map(new hpa(i2)).collect(aghu.a)), new gqa(obj4, agkeVar, i), ((hpk) obj4).e);
            case 3:
                annv annvVar = (annv) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(annvVar.g());
                arrayList.addAll(annvVar.j());
                return ((hpk) this.b).d.m((List) Collection.EL.stream(arrayList).map(new hpa(i5)).collect(aghu.a), this.a);
            case 4:
                annv annvVar2 = (annv) obj;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(annvVar2.e());
                arrayList2.addAll(annvVar2.i());
                return ((hpk) this.b).d.m((List) Collection.EL.stream(arrayList2).map(new hpa(i5)).collect(aghu.a), this.a);
            case 5:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                boolean z4 = this.a;
                Object obj5 = this.b;
                annv annvVar3 = (annv) optional2.get();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(annvVar3.e());
                arrayList3.addAll(annvVar3.i());
                arrayList3.addAll(annvVar3.g());
                arrayList3.addAll(annvVar3.j());
                return ((hpb) ((jgc) obj5).f).m((List) Collection.EL.stream(arrayList3).map(new hsw(5)).collect(Collectors.toList()), !z4);
            case 6:
                boolean zEquals = Objects.equals((Boolean) obj, Boolean.TRUE);
                boolean z5 = this.a;
                Object obj6 = this.b;
                if (!zEquals) {
                    if (z5) {
                        iuf iufVar = (iuf) obj6;
                        taf.j(ahno.ar(((klc) iufVar.h.io()).e(), new itg(obj6, 11), iufVar.c), new ihw(19));
                    }
                    int i6 = 12;
                    iuf iufVar2 = (iuf) obj6;
                    ListenableFuture listenableFutureE = iufVar2.E(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, ish.k, null, null, "date_modified DESC", new gpa(obj6, i6));
                    return Build.VERSION.SDK_INT >= 29 ? ahno.as(listenableFutureE, new isv(obj6, i6), iufVar2.c) : ahno.as(listenableFutureE, new isv(obj6, 8), iufVar2.c);
                }
                if (z5) {
                    ((hfn) ((iuf) obj6).i.io()).ag();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    iuf iufVar3 = (iuf) obj6;
                    listenableFutureAs = ahno.as(((hfn) iufVar3.g.io()).U(), new isv(obj6, i5), iufVar3.c);
                } else {
                    iuf iufVar4 = (iuf) obj6;
                    listenableFutureAs = ahno.as(iufVar4.j(), new isv(obj6, i2), iufVar4.c);
                }
                return ahno.ar(listenableFutureAs, new itg(obj6, i5), ((iuf) obj6).c);
            case 7:
                boolean zEquals2 = Objects.equals((Boolean) obj, Boolean.TRUE);
                boolean z6 = this.a;
                Object obj7 = this.b;
                int i7 = 20;
                if (zEquals2) {
                    if (z6) {
                        ((iuo) obj7).l.ag();
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        iuo iuoVar = (iuo) obj7;
                        listenableFutureAs2 = ahno.as(iuoVar.k.U(), new isv(obj7, 16), iuoVar.c);
                    } else {
                        iuo iuoVar2 = (iuo) obj7;
                        listenableFutureAs2 = ahno.as(iuoVar2.k(), new isv(obj7, 14), iuoVar2.c);
                    }
                    return ahno.ar(listenableFutureAs2, new itg(obj7, i7), ((iuo) obj7).c);
                }
                int i8 = 2;
                if (z6) {
                    iuo iuoVar3 = (iuo) obj7;
                    taf.j(ahno.ar(iuoVar3.j.e(), new iun(obj7, i4), iuoVar3.c), new iul(i8));
                }
                iuo iuoVar4 = (iuo) obj7;
                ListenableFuture listenableFutureG = iuoVar4.G(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, ish.k, null, null, "date_modified DESC", new isl(iuoVar4.b, ((wbz) iuoVar4.f.io()).c()));
                if (Build.VERSION.SDK_INT >= 29) {
                    return ahno.ar(listenableFutureG, new itg(obj7, i3), iuoVar4.c);
                }
                itg itgVar = new itg(obj7, 17);
                Executor executor = iuoVar4.c;
                ListenableFuture listenableFutureAr = ahno.ar(listenableFutureG, itgVar, executor);
                ListenableFuture listenableFutureK = iuoVar4.k();
                return ahno.av(listenableFutureAr, listenableFutureK).k(new itv(obj7, listenableFutureAr, listenableFutureK, i7), executor);
            default:
                aeiy aeiyVar = (aeiy) obj;
                aehd aehdVar = (aehd) this.b;
                aehdVar.h = aeiyVar;
                lqa lqaVar = (lqa) aeiyVar.h;
                ListenableFuture listenableFutureE2 = lqaVar.E();
                aajs aajsVar = new aajs(aeiyVar, i3);
                ?? r7 = aeiyVar.b;
                ListenableFuture listenableFutureAs3 = ahno.as(listenableFutureE2, aajsVar, r7);
                ryh ryhVar = new ryh(aeiyVar, 10);
                ?? r6 = aeiyVar.a;
                ahno.at(listenableFutureAs3, ryhVar, r6);
                aehdVar.u.c("ds_as");
                if (this.a) {
                    return aeiyVar.b();
                }
                byte[] bArr = null;
                if (!aehdVar.t) {
                    String strC = aeiy.c();
                    aeiv aeivVar = (aeiv) aeiyVar.d;
                    aeivVar.d(42);
                    aeivVar.d(43);
                    return ahno.aq(new wan(aeiyVar, strC, i3, bArr), r7);
                }
                arkf arkfVar = aehdVar.n;
                aeiv aeivVar2 = (aeiv) aeiyVar.d;
                aeivVar2.d(42);
                aeivVar2.c("ds_mls");
                String strValueOf = String.valueOf(arkfVar.z);
                return ahno.as(lqaVar.D(strValueOf), new aaoq(aeiyVar, strValueOf, i, bArr), r6);
        }
    }
}
