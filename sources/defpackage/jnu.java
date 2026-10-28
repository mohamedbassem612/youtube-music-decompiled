package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jnu implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jnu(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [axp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v25, types: [afgg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = 4;
        int i2 = 19;
        byte[] bArr = null;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                return ahno.ap(new iug(this.a, 10), this.b);
            case 1:
                awuq awuqVar = aqr.a;
                ?? r0 = this.a;
                ayq ayqVar = (ayq) this.b;
                return aqr.a(ayqVar.b, new bev(ayqVar, (axp) r0, (awoq) null, 2));
            case 2:
                int i4 = onb.a;
                Object obj = this.b;
                zpw zpwVar = (zpw) obj;
                Object obj2 = zpwVar.j;
                olp olpVar = (olp) obj2;
                ListenableFuture listenableFutureE = olpVar.e();
                olm olmVar = new olm(obj2, 6);
                long j = afwl.a;
                ahdb ahdbVar = new ahdb(afty.c(false), olmVar, 1);
                Executor executor = olpVar.g;
                int i5 = ahcs.c;
                ahcq ahcqVar = new ahcq(listenableFutureE, ahdbVar);
                listenableFutureE.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
                Object obj3 = this.a;
                ahcr ahcrVar = new ahcr(ahcqVar, new afwi(afty.c(false), new gqq(obj3, i2)));
                ?? r6 = zpwVar.o;
                ahcqVar.addListener(ahcrVar, MoreExecutors.c(r6, ahcrVar));
                ahcq ahcqVar2 = new ahcq(ahcrVar, new ahdb(afty.c(false), new idm(obj, obj3, i, bArr), 1));
                ahcrVar.addListener(ahcqVar2, MoreExecutors.c(r6, ahcqVar2));
                return ahcqVar2;
            case 3:
                ArrayList arrayList = new ArrayList();
                while (true) {
                    ?? r1 = this.a;
                    if (i3 >= r1.size()) {
                        return new aher(arrayList);
                    }
                    ?? r2 = this.b;
                    oiw oiwVar = (oiw) r1.get(i3);
                    Future future = (Future) r2.get(i3);
                    ahno.R(future.isDone(), "Future was expected to be done: %s", future);
                    oip oipVar = (oip) a.i(future);
                    if (oipVar != null) {
                        arrayList.add(new omh(oiwVar, oipVar));
                    }
                    i3++;
                }
                break;
            case 4:
                Object obj4 = this.b;
                return afxd.f(((qru) ((qrx) obj4).b).b()).h(new olm(obj4, 14), MoreExecutors.directExecutor()).g(new olh(this.a, 8), MoreExecutors.directExecutor());
            case 5:
                zpw zpwVar2 = (zpw) ((wac) this.a).a.io();
                String str = (String) this.b;
                switch (str.hashCode()) {
                    case -2105562759:
                        if (str.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                            return ((omj) zpwVar2.a).c(new ojf(zpwVar2.j, i3), zpwVar2.o);
                        }
                        break;
                    case -1202768674:
                        if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                            return zpwVar2.f(false);
                        }
                        break;
                    case -69128772:
                        if (str.equals("MDD.CHARGING.PERIODIC.TASK")) {
                            ListenableFuture listenableFutureG = zpwVar2.g();
                            hqm hqmVar = new hqm(zpwVar2, i);
                            long j2 = afwl.a;
                            ahdb ahdbVar2 = new ahdb(afty.c(false), hqmVar, 1);
                            ?? r3 = zpwVar2.o;
                            ahdb ahdbVar3 = new ahdb(afty.c(false), ahdbVar2, 1);
                            int i6 = ahcs.c;
                            ahcq ahcqVar3 = new ahcq(listenableFutureG, ahdbVar3);
                            listenableFutureG.addListener(ahcqVar3, MoreExecutors.c(r3, ahcqVar3));
                            return ahcqVar3;
                        }
                        break;
                    case 437964371:
                        if (str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                            return zpwVar2.f(true);
                        }
                        break;
                }
                int i7 = onb.a;
                return ahng.m(new IllegalArgumentException("Unknown task tag sent to MDD.handleTask() ".concat(str)));
            case 6:
                return this.b.a((affd) this.a);
            case 7:
                afgk afgkVar = (afgk) this.b.io();
                ListenableFuture listenableFutureA = afgkVar.a((afgp) this.a);
                vzs vzsVar = new vzs(afgkVar, 16);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i8 = ahcs.c;
                ahcr ahcrVar2 = new ahcr(listenableFutureA, vzsVar);
                listenableFutureA.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor, ahcrVar2));
                return ahcrVar2;
            case 8:
                vzs vzsVar2 = new vzs(this.a, i2);
                Object obj5 = this.b;
                return ((abhh) ((afip) obj5).a).s(vzsVar2, MoreExecutors.directExecutor());
            default:
                long j3 = afwl.a;
                ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), this.b, 1));
                ((afnj) this.a).e.execute(ahfoVar);
                return ahfoVar;
        }
    }

    public /* synthetic */ jnu(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
