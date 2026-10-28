package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class olm implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ olm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v50, types: [java.lang.Object, qrh] */
    /* JADX WARN: Type inference failed for: r14v66, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, onc] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, ola] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        ListenableFuture listenableFuture;
        ListenableFuture aherVar;
        int i = 15;
        int i2 = 12;
        int i3 = 17;
        int i4 = 7;
        int i5 = 16;
        int i6 = 2;
        int i7 = 1;
        int i8 = 0;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                olp olpVar = (olp) obj2;
                ListenableFuture listenableFutureD = olpVar.d.d();
                hqm hqmVar = new hqm(obj2, i5);
                long j = afwl.a;
                ahdb ahdbVar = new ahdb(afty.c(false), hqmVar, 1);
                Executor executor = olpVar.g;
                int i9 = ahcs.c;
                ahcq ahcqVar = new ahcq(listenableFutureD, ahdbVar);
                listenableFutureD.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
                aherVar = ahcqVar;
                break;
            case 1:
                Object obj3 = this.a;
                olp olpVar2 = (olp) obj3;
                omn omnVar = olpVar2.l;
                String strAO = qnl.aO("gms_icing_mdd_shared_file_manager_metadata", (agev) omnVar.e);
                Context context = (Context) omnVar.g;
                SharedPreferences sharedPreferences = context.getSharedPreferences(strAO, 0);
                if (sharedPreferences.contains("migrated_to_new_file_key")) {
                    if (sharedPreferences.getBoolean("migrated_to_new_file_key", false)) {
                        qnl.bj(context);
                    }
                    sharedPreferences.edit().remove("migrated_to_new_file_key").commit();
                }
                aher aherVar2 = new aher(Boolean.TRUE);
                hqm hqmVar2 = new hqm(obj3, i3);
                Executor executor2 = olpVar2.g;
                long j2 = afwl.a;
                ahdb ahdbVar2 = new ahdb(afty.c(false), hqmVar2, 1);
                int i10 = ahcs.c;
                ahcq ahcqVar2 = new ahcq(aherVar2, ahdbVar2);
                aherVar2.addListener(ahcqVar2, MoreExecutors.c(executor2, ahcqVar2));
                aherVar = ahcqVar2;
                break;
            case 2:
                return ((olp) this.a).c.f();
            case 3:
                Object obj4 = this.a;
                olp olpVar3 = (olp) obj4;
                oii oiiVar = olpVar3.i;
                ListenableFuture listenableFuture2 = aher.a;
                oiiVar.o();
                ooi ooiVarD = ooi.d(listenableFuture2);
                hqm hqmVar3 = new hqm(obj4, 19);
                Executor executor3 = olpVar3.g;
                return ooiVarD.f(hqmVar3, executor3).c(Exception.class, new hqn(i4), executor3);
            case 4:
                olp olpVar4 = (olp) this.a;
                olpVar4.i.u();
                return ooi.d(olpVar4.j.c()).b(IOException.class, new hys(i5), MoreExecutors.directExecutor()).e(new hys(i3), MoreExecutors.directExecutor());
            case 5:
                Integer num = (Integer) obj;
                ArrayList arrayList = new ArrayList();
                int i11 = onb.a;
                Object obj5 = this.a;
                olp olpVar5 = (olp) obj5;
                ListenableFuture listenableFutureE = olpVar5.e();
                olm olmVar = new olm(obj5, i4);
                long j3 = afwl.a;
                ahdb ahdbVar3 = new ahdb(afty.c(false), olmVar, 1);
                Executor executor4 = olpVar5.g;
                int i12 = ahcs.c;
                ahcq ahcqVar3 = new ahcq(listenableFutureE, ahdbVar3);
                listenableFutureE.addListener(ahcqVar3, MoreExecutors.c(executor4, ahcqVar3));
                arrayList.add(ahcqVar3);
                oii oiiVar2 = olpVar5.i;
                oiiVar2.A();
                AtomicReference atomicReference = new AtomicReference(new HashMap());
                xgg xggVar = olpVar5.m;
                int i13 = 8;
                arrayList.add(xggVar.o(new idm(xggVar, atomicReference, i13)));
                oiiVar2.D();
                ?? r9 = xggVar.m;
                arrayList.add(xggVar.s(r9.d(), new hqm(xggVar, i2)));
                oiiVar2.C();
                oiiVar2.x();
                arrayList.add(xggVar.o(new hqm(xggVar, 13)));
                int iIntValue = num.intValue();
                syn synVar = olpVar5.p;
                arrayList.add(((ong) synVar.c).a(new onj(synVar, iIntValue, i7)));
                int iIntValue2 = num.intValue();
                onp onpVar = olpVar5.e;
                arrayList.add(((ong) onpVar.g).c(new onj(onpVar, iIntValue2, i8)));
                isi isiVar = olpVar5.o;
                isiVar.c.B();
                int i14 = 5;
                arrayList.add(((ong) isiVar.a).b(new ojf(isiVar.b.b(), i14)));
                if (olpVar5.h.g()) {
                    arrayList.add(xggVar.s(r9.d(), new ods(xggVar, i)));
                }
                olpVar5.b.getSharedPreferences(qnl.aO("gms_icing_mdd_manager_metadata", olpVar5.f), 0).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
                oiiVar2.r();
                ola olaVar = olpVar5.c;
                int i15 = 18;
                arrayList.add(new kjc(new ahek(false, agke.p(new ListenableFuture[]{ooi.d(olaVar.c()).e(new hys(i15), executor4).f(new hqm(obj5, i15), executor4), ooi.d(olaVar.e()).e(new olh(obj5, i6), executor4).f(new hqn(6), executor4)}))).N(new okp(i14), MoreExecutors.directExecutor()));
                return new kjc(new ahek(false, agke.j(arrayList))).N(new okp(i13), executor4);
            case 6:
                return ((olp) this.a).c.c();
            case 7:
                olp olpVar6 = (olp) this.a;
                SharedPreferences sharedPreferences2 = olpVar6.b.getSharedPreferences(qnl.aO("gms_icing_mdd_manager_metadata", olpVar6.f), 0);
                if (!sharedPreferences2.contains("gms_icing_mdd_reset_trigger")) {
                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                    olpVar6.i.G();
                    editorEdit.putInt("gms_icing_mdd_reset_trigger", 0).commit();
                }
                int i16 = sharedPreferences2.getInt("gms_icing_mdd_reset_trigger", 0);
                olpVar6.i.G();
                if (i16 >= 0) {
                    return aher.a;
                }
                sharedPreferences2.edit().putInt("gms_icing_mdd_reset_trigger", 0).commit();
                int i17 = onb.a;
                olpVar6.k.j(1045);
                return olpVar6.a();
            case 8:
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (!it.hasNext()) {
                        return new kjc(new ahek(false, agke.j(arrayList2))).O(new jnu(list, arrayList2, 3), ((omc) obj6).a);
                    }
                    arrayList2.add(((omc) obj6).g((oiw) it.next()));
                }
                break;
            case 9:
                oiy oiyVar = (oiy) obj;
                oja ojaVar = oiyVar.f;
                if (ojaVar == null) {
                    ojaVar = oja.a;
                }
                if ((ojaVar.b & 1) == 0) {
                    Object obj7 = this.a;
                    olh olhVar = new olh(obj7, 4);
                    oni oniVar = (oni) obj7;
                    Executor executor5 = oniVar.a;
                    return ooi.d(oniVar.c.a(olhVar, executor5)).f(new olm(obj7, 10), executor5).e(new qmd(i7), executor5);
                }
                oja ojaVar2 = oiyVar.f;
                if (ojaVar2 == null) {
                    ojaVar2 = oja.a;
                }
                if (ojaVar2 == null) {
                    return aher.a;
                }
                aherVar = new aher(ojaVar2);
                break;
                break;
            case 10:
                return ((oni) this.a).c.c();
            case 11:
                return this.a.b((MessageLite) obj);
            case 12:
                Uri uri = (Uri) obj;
                Uri uriA = rmp.A(uri, ".bak");
                try {
                    ayq ayqVar = ((qrt) this.a).f;
                    if (ayqVar.ac(uriA)) {
                        ayqVar.ab(uriA, uri);
                        break;
                    }
                    return aher.a;
                } catch (IOException e) {
                    return ahng.m(e);
                }
            case 13:
                Object obj8 = this.a;
                synchronized (((qrt) obj8).d) {
                    listenableFuture = ((qrt) obj8).e;
                    break;
                }
                return listenableFuture;
            case 14:
                return ((qrx) this.a).c();
            case 15:
                Object objApply = this.a.apply(obj);
                if (objApply == null) {
                    return aher.a;
                }
                aherVar = new aher(objApply);
                break;
            case 16:
                return ((qrx) this.a).c.a();
            case 17:
                return ((qrx) this.a).b.h();
            case 18:
                rqz rqzVar = (rqz) this.a;
                final abhh abhhVarD = rqzVar.a.d();
                final afmw afmwVar = afmw.DONT_CARE;
                afmwVar.getClass();
                Object obj9 = abhhVarD.b;
                final ahpu ahpuVar = rqzVar.c;
                final Instant instantF = ahpuVar.a.f();
                ListenableFuture listenableFutureD2 = ((afid) obj9).d();
                abhh abhhVar = (abhh) ((abhh) abhhVarD.a).b;
                ListenableFuture listenableFutureR = ((abhh) abhhVar.b).r();
                abzy abzyVar = new abzy(i2);
                ?? r2 = abhhVar.a;
                long j4 = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), abzyVar);
                int i18 = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureR, afwiVar);
                listenableFutureR.addListener(ahcrVar, MoreExecutors.c(r2, ahcrVar));
                aheo aheoVarG = new ahdm(new ahek(true, agke.p(new ListenableFuture[]{listenableFutureD2, ahcrVar})).a(new ahcz(afty.c(false), new fzs(listenableFutureD2, ahcrVar, i), 1), MoreExecutors.directExecutor())).d(new afwf(afty.c(false), new ahdd() { // from class: afmu
                    @Override // defpackage.ahdd
                    public final ahdm a(ahud ahudVar, Object obj10) {
                        afmt afmtVar = (afmt) obj10;
                        if (afmtVar.a() && afmtVar.b()) {
                            Instant instant = instantF;
                            afmw afmwVar2 = afmwVar;
                            ahno.P(afmtVar.a(), "Cannot get timestamp for a CacheResult that does not have content");
                            ahno.P(afmtVar.b(), "Cannot get timestamp for an invalid CacheResult");
                            if (afmtVar.b.a.isAfter(instant.minus(afmwVar2.k))) {
                                return new ahdm(aher.a);
                            }
                        }
                        abhh abhhVar2 = abhhVarD;
                        ahpu ahpuVar2 = ahpuVar;
                        ListenableFuture listenableFutureB = ((afid) abhhVar2.b).b();
                        ((ahpu) ahpuVar2.b).k(listenableFutureB);
                        agel agelVar = new agel();
                        Executor executorDirectExecutor = MoreExecutors.directExecutor();
                        int i19 = ahcs.c;
                        ahcr ahcrVar2 = new ahcr(listenableFutureB, agelVar);
                        listenableFutureB.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor, ahcrVar2));
                        return new ahdm(ahcrVar2);
                    }
                }), MoreExecutors.directExecutor()).g();
                agel agelVar = new agel();
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                ahcr ahcrVar2 = new ahcr(aheoVarG, agelVar);
                aheoVarG.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor, ahcrVar2));
                return ahcrVar2;
            case 19:
                rqz rqzVar2 = (rqz) this.a;
                zwa zwaVarE = rqzVar2.b.e();
                return rqzVar2.d.x(rmp.c(zwaVarE), rmp.d(zwaVarE));
            default:
                ((sym) this.a).c.ap();
                return ahng.m((Throwable) obj);
        }
        return aherVar;
    }
}
