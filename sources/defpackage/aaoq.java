package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaoq implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aaoq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws Exception {
        int i = 2;
        int i2 = 0;
        int i3 = 15;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                Exception exc = (Exception) obj;
                exc.getClass();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(exc)) {
                        return this.b.a(exc);
                    }
                }
                zvp.b(zvn.a, zvm.C, "Encountered unexpected exception during fallback", exc);
                throw exc;
            case 1:
                agke agkeVar = (agke) obj;
                vre vreVar = new vre(agke.n(this.a), 11);
                aalp aalpVar = (aalp) this.b;
                Optional optional = aalpVar.h;
                optional.isPresent();
                ListenableFuture listenableFuture = (ListenableFuture) Optional.ofNullable(((kyr) optional.get()).A(vreVar.a)).orElse(ahng.n(agpn.b));
                aagw aagwVar = new aagw(agkeVar, i3);
                Executor executor = aalpVar.b;
                return ahno.ar(ahno.ar(listenableFuture, aagwVar, executor), new aagw(agkeVar, 16), executor);
            case 2:
                return aaou.c(this.b, 0, this.a);
            case 3:
                aapa aapaVar = (aapa) this.b;
                return ((aapd) aapaVar.b.io()).a(acqf.d((wgi) obj, (abnl) this.a, aapaVar.d));
            case 4:
                return this.a.apply(new abpx((abnl) obj, (abnp) this.b));
            case 5:
                wtr wtrVar = (wtr) obj;
                taq.c();
                wtx wtxVarB = wtrVar.b();
                aihf aihfVarCreateBuilder = apqf.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                apqf apqfVar = (apqf) aihfVarCreateBuilder.instance;
                apqfVar.c |= 1;
                apqfVar.f = (String) this.b;
                aihfVarCreateBuilder.copyOnWrite();
                apqf apqfVar2 = (apqf) aihfVarCreateBuilder.instance;
                Object obj2 = this.a;
                obj2.getClass();
                apqfVar2.d = 2;
                apqfVar2.e = obj2;
                wtxVarB.e((apqf) aihfVarCreateBuilder.build());
                return wtrVar.d(wtxVarB);
            case 6:
                return ((ayq) obj).j(new vvg(this.b, (String) this.a, i));
            case 7:
                acqf acqfVar = (acqf) this.b;
                return ahno.ar(((abzs) aguu.aw((Context) acqfVar.a, abzs.class, (affd) obj)).b().t(ajgq.ENGAGEMENT_TYPE_PLAYBACK, this.a, 60000, true), new abzr(i2), acqfVar.d);
            case 8:
                aeiy aeiyVar = (aeiy) this.b;
                dvo dvoVar = (dvo) obj;
                aeiv aeivVar = (aeiv) aeiyVar.d;
                aeivVar.a();
                if (dvoVar == null) {
                    aeivVar.d(27);
                    return ahng.n(null);
                }
                return ahno.ar(((lqa) aeiyVar.h).F((String) this.a, dvoVar.c()), new acpb(dvoVar, i3), MoreExecutors.directExecutor());
            case 9:
                String str = (String) obj;
                Object obj3 = this.b;
                aeiy aeiyVar2 = (aeiy) obj3;
                aeiv aeivVar2 = (aeiv) aeiyVar2.d;
                aeivVar2.c("ds_mlc");
                if (!ahno.aa(str)) {
                    aeivVar2.d(24);
                    return ahno.aq(new wan(obj3, str, 13, bArr), aeiyVar2.b);
                }
                Object obj4 = this.a;
                String strC = aeiy.c();
                aeivVar2.c("ds_cs");
                aeivVar2.d(43);
                return ahno.as(ahno.aq(new wan(obj3, strC, 14, bArr), aeiyVar2.b), new aaoq(obj3, obj4, 8, bArr), aeiyVar2.a);
            case 10:
                agkz agkzVarF = ahng.ae(this.a, (Set) obj).f();
                abhh abhhVar = ((afja) this.b).h;
                return abhhVar.o(abhhVar.m(agkzVarF, null, true));
            case 11:
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    if (!it2.hasNext()) {
                        return ahno.au(arrayList).l(new afno(obj6, obj5, 3, bArr), ((afsi) obj6).b);
                    }
                    dzs dzsVar = (dzs) it2.next();
                    UUID uuid = ((WorkerParameters) obj5).a;
                    UUID uuid2 = dzsVar.a;
                    if (!uuid.equals(uuid2)) {
                        arrayList.add(((afsi) obj6).c.c(uuid2));
                    }
                }
                break;
            case 12:
                afsi afsiVar = (afsi) this.a;
                if (afsiVar.d.m()) {
                    afsc afscVar = afsiVar.a;
                    WorkerParameters workerParameters = (WorkerParameters) this.b;
                    if (!workerParameters.c.contains(afsi.e(((afsl) afscVar).b()))) {
                        return afsiVar.c.c(workerParameters.a);
                    }
                }
                return aher.a;
            default:
                Object obj7 = this.a;
                Object obj8 = this.b;
                SettableFuture settableFutureCreate = SettableFuture.create();
                ahuu ahuuVar = (ahuu) obj7;
                UrlRequest.Builder builderAllowDirectExecutor = ((CronetEngine) obj).newUrlRequestBuilder(ahuuVar.a, new ahuo(settableFutureCreate, ((ahup) obj8).c, ahuuVar), MoreExecutors.directExecutor()).allowDirectExecutor();
                String str2 = ahuuVar.g;
                if (str2 != null) {
                    builderAllowDirectExecutor.setHttpMethod(str2);
                }
                for (Map.Entry entry : ahuuVar.c.j()) {
                    builderAllowDirectExecutor.addHeader(((ahur) entry.getKey()).a, (String) entry.getValue());
                }
                ahut ahutVar = ahuuVar.d;
                if (builderAllowDirectExecutor instanceof ExperimentalUrlRequest.Builder) {
                    ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) builderAllowDirectExecutor;
                    Integer num = ahuuVar.j;
                    if (num != null) {
                        builder.setTrafficStatsUid(num.intValue());
                    }
                    Integer num2 = ahuuVar.k;
                    if (num2 != null) {
                        builder.setTrafficStatsTag(num2.intValue());
                    }
                    Long l = ahuuVar.h;
                    if (l != null) {
                        builder.bindToNetwork(l.longValue());
                    }
                }
                builderAllowDirectExecutor.setPriority(ahuuVar.f);
                ahup.b.getAndIncrement();
                UrlRequest urlRequestBuild = builderAllowDirectExecutor.build();
                settableFutureCreate.addListener(new ahun(settableFutureCreate, urlRequestBuild), MoreExecutors.directExecutor());
                urlRequestBuild.start();
                return settableFutureCreate;
        }
    }

    public /* synthetic */ aaoq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
