package defpackage;

import android.os.Looper;
import app.rive.ImageAsset;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acjo implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ acjo(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [acip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [acip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v40, types: [awuz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r3v9, types: [axat, java.lang.Object] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws Throwable {
        Object[] objArr = 0;
        int i = 10;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                aazk aazkVar = (aazk) obj;
                aazkVar.getClass();
                String strAu = this.b.au();
                strAu.getClass();
                acjr acjrVar = (acjr) this.a;
                acjrVar.b.aA().kk(acjrVar.a(aazkVar, strAu));
                return awmy.a;
            case 1:
                aazk aazkVar2 = (aazk) obj;
                aazkVar2.getClass();
                String strAu2 = this.b.au();
                strAu2.getClass();
                acjr acjrVar2 = (acjr) this.a;
                acjrVar2.b.bg().kk(acjrVar2.a(aazkVar2, strAu2));
                return awmy.a;
            case 2:
                ((acky) this.b).f.set(false);
                ((awwf) this.a).c();
                return awmy.a;
            case 3:
                acpu acpuVar = (acpu) obj;
                acpuVar.getClass();
                acpv acpvVar = (acpv) this.a;
                acpvVar.g = acpuVar;
                if (!acpuVar.a) {
                    acpvVar.a();
                }
                ((acoi) ((avgj) this.b).a).N();
                return awmy.a;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    return avlh.K();
                }
                return avlh.F(1000L, 1000L, TimeUnit.MILLISECONDS, (avmb) ((adif) this.b).a).H(new acpr(new acsc(this.a, 6), i));
            case 5:
                ImageAsset imageAsset = (ImageAsset) obj;
                imageAsset.getClass();
                awqk awqkVar = ((adps) this.b).i;
                if (awqkVar != null) {
                    awqkVar.invoke(this.a, imageAsset);
                }
                return awmy.a;
            case 6:
                acjx acjxVarAe = aawb.ae((ajla) obj);
                return acjxVarAe == null ? ahng.m(new IllegalStateException()) : ((adtv) this.a).aw(acjxVarAe, (adto) this.b);
            case 7:
                aihf aihfVarCreateBuilder = asir.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                asir asirVar = (asir) aihfVarCreateBuilder.instance;
                asirVar.b |= 1;
                asirVar.c = (String) this.a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aihfVarCreateBuilder.copyOnWrite();
                asir asirVar2 = (asir) aihfVarCreateBuilder.instance;
                asirVar2.b |= 2;
                asirVar2.d = zBooleanValue;
                agbq agbqVar = ((aetk) this.b).a;
                InstanceProxy instanceProxyD = agbqVar.d();
                agcl agclVar = instanceProxyD instanceof agbr ? ((agbr) instanceProxyD).a : null;
                if (agclVar != null) {
                    agclVar.b((asir) aihfVarCreateBuilder.build());
                } else {
                    asir asirVar3 = (asir) aihfVarCreateBuilder.build();
                    aigv aigvVar = aigv.a;
                }
                return awmy.a;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                if (!bool2.booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                ?? r13 = this.a;
                Object obj2 = this.b;
                String str = (String) r13.getKey();
                str.getClass();
                afnp afnpVar = (afnp) obj2;
                omj omjVarD = afnpVar.d();
                omr omrVar = new omr();
                omrVar.i("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                omrVar.k(str);
                omrVar.j(Long.valueOf(afnpVar.d));
                ListenableFuture listenableFutureAa = omjVarD.aa(omrVar.p());
                listenableFutureAa.getClass();
                return ahno.as(listenableFutureAa, new aekb(new actf(i), i), afnpVar.b);
            case 9:
                List list = (List) obj;
                list.getClass();
                Set setEntrySet = this.a.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : setEntrySet) {
                    if (!list.contains(((Map.Entry) obj3).getKey())) {
                        arrayList.add(obj3);
                    }
                }
                awoa awoaVar = new awoa(10);
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj4 = this.b;
                    int i3 = 9;
                    if (!it.hasNext()) {
                        List listF = awoaVar.f();
                        return ahno.au(listF).k(new aegt(listF, i3), ((afnp) obj4).b);
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    afnp afnpVar2 = (afnp) obj4;
                    ListenableFuture listenableFutureAq = ahno.aq(new afno(obj4, entry, i2), afnpVar2.c);
                    afjn.d(134, listenableFutureAq, "Client StartupAfterPackageReplacedListener failed for key: %s", new ahve(ahvd.a, entry.getKey()));
                    awoaVar.add(ahno.as(ahno.am(ahno.ax(listenableFutureAq).k(new fxv(20), MoreExecutors.directExecutor()), Exception.class, new aeqk(new actf(i3), 14), MoreExecutors.directExecutor()), new aekb(new acjo(obj4, entry, 8, objArr == true ? 1 : 0), 7), afnpVar2.b));
                }
                break;
            case 10:
                avgj avgjVar = (avgj) obj;
                avgjVar.getClass();
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    throw new IllegalStateException("Check failed.");
                }
                ?? r3 = this.a;
                afqo afqoVar = (afqo) this.b;
                awut awutVar = afqoVar.b;
                afws.b(awutVar);
                awro.s(awutVar, aewp.k(), 4, new ybe((awoq) null, afqoVar, (axat) r3, avgjVar, 3));
                return awmy.a;
            case 11:
                bhj bhjVar = (bhj) obj;
                bhi bhiVar = ahrg.c;
                Object obj5 = this.a;
                bhjVar.e(bhiVar, obj5);
                ahrg.j(bhjVar, (String) obj5);
                return null;
            case 12:
                ((awxs) this.a).a.removeCallbacks(this.b);
                return awmy.a;
            default:
                Throwable th = (Throwable) obj;
                Object obj6 = this.a;
                if (th == null) {
                    ((axcp) obj6).a(this.b.f());
                } else {
                    ((axcp) obj6).b(th);
                }
                return awmy.a;
        }
    }

    public /* synthetic */ acjo(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
