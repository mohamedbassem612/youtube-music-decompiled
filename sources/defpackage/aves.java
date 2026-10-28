package defpackage;

import android.net.Network;
import android.util.Log;
import android.widget.Toast;
import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.net.ConnectivityManagerWrapper;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aves implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public aves(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v59, types: [awuc, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        avhm avhmVar;
        avjg avjgVar;
        int i = 0;
        avjb avjbVar = null;
        switch (this.$cid) {
            case 0:
                ((avet) this.a).a.e((auym) this.b);
                return;
            case 1:
                ((aveu) this.b).h.h((Status) this.a);
                return;
            case 2:
                ((avet) this.b).a.c((avbe) this.a);
                return;
            case 3:
                ((avev) this.b).b.m((avbr) this.a);
                return;
            case 4:
                List list = Collections.EMPTY_LIST;
                avev avevVar = (avev) this.a;
                avevVar.b.m(new avbr(avcf.b(Status.m.withDescription("Unable to resolve host ".concat(String.valueOf(avevVar.a.j))).c((Throwable) this.b)), auyo.a, null));
                return;
            case 5:
                ?? r0 = this.b;
                avge avgeVar = (avge) this.a;
                avgb avgbVar = avgeVar.h;
                SocketAddress socketAddressB = avgbVar.b();
                avgbVar.c = r0;
                avgbVar.c();
                avgeVar.i = r0;
                auzd auzdVar = avgeVar.p.a;
                auzd auzdVar2 = auzd.b;
                if (auzdVar == auzdVar2 || avgeVar.p.a == auzd.a) {
                    while (true) {
                        if (i < avgbVar.c.size()) {
                            int iIndexOf = ((auzm) avgbVar.c.get(i)).e.indexOf(socketAddressB);
                            if (iIndexOf == -1) {
                                i++;
                            } else {
                                avgbVar.a = i;
                                avgbVar.b = iIndexOf;
                            }
                        } else if (avgeVar.p.a == auzdVar2) {
                            avhmVar = avgeVar.o;
                            avgeVar.o = null;
                            avgbVar.c();
                            avgeVar.b(auzd.d);
                        } else {
                            avgeVar.n.e(Status.m.withDescription("InternalSubchannel closed pending transport due to address change"));
                            avgeVar.n = null;
                            avgbVar.c();
                            avgeVar.g();
                        }
                        avhmVar = null;
                    }
                } else {
                    avhmVar = null;
                }
                if (avhmVar != null) {
                    if (avgeVar.w != null) {
                        avgeVar.k.e(Status.m.withDescription("InternalSubchannel closed transport early due to address change"));
                        avgeVar.w.a();
                        avgeVar.w = null;
                    }
                    avgeVar.k = avhmVar;
                    avgeVar.w = avgeVar.g.d(new avep(this, 13), 5L, TimeUnit.SECONDS, avgeVar.b);
                    return;
                }
                return;
            case 6:
                avge avgeVar2 = (avge) this.b;
                auzd auzdVar3 = avgeVar2.p.a;
                auzd auzdVar4 = auzd.e;
                if (auzdVar3 != auzdVar4) {
                    Status status = (Status) this.a;
                    avgeVar2.q = status;
                    avhm avhmVar2 = avgeVar2.o;
                    avef avefVar = avgeVar2.n;
                    avgeVar2.o = null;
                    avgeVar2.n = null;
                    avgeVar2.b(auzdVar4);
                    avgeVar2.h.c();
                    if (avgeVar2.l.isEmpty()) {
                        avgeVar2.e();
                    }
                    avgeVar2.g.c();
                    axoz axozVar = avgeVar2.v;
                    if (axozVar != null) {
                        axozVar.a();
                        avgeVar2.v = null;
                        avgeVar2.u = null;
                    }
                    axoz axozVar2 = avgeVar2.w;
                    if (axozVar2 != null) {
                        axozVar2.a();
                        avgeVar2.k.e(status);
                        avgeVar2.w = null;
                        avgeVar2.k = null;
                    }
                    if (avhmVar2 != null) {
                        avhmVar2.e(status);
                    }
                    if (avefVar != null) {
                        avefVar.e(status);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((avge) this.b).m.c(this.a, false);
                return;
            case 8:
                ArrayList arrayList = new ArrayList(((avge) this.b).l);
                int size = arrayList.size();
                while (i < size) {
                    ((avhm) arrayList.get(i)).f((Status) this.a);
                    i++;
                }
                return;
            case 9:
                ((avgt) this.b).u((Status) this.a);
                return;
            case 10:
                avgy avgyVar = (avgy) this.b;
                if (avgyVar.a.get() != avhb.f) {
                    ((avgx) this.a).l();
                    return;
                }
                avhb avhbVar = avgyVar.c;
                if (avhbVar.y == null) {
                    avhbVar.y = new LinkedHashSet();
                    avhbVar.R.c(avhbVar.z, true);
                }
                Collection collection = avhbVar.y;
                Object obj = this.a;
                collection.add(obj);
                ((avgx) obj).k();
                return;
            case 11:
                this.b.run();
                Object obj2 = this.a;
                ((avgx) obj2).k.c.o.execute(new avgv(obj2, 4));
                return;
            case 12:
                Object obj3 = this.a;
                Object obj4 = ((awim) obj3).b;
                Object obj5 = ((avjh) obj4).m;
                synchronized (obj5) {
                    if (((avjb) ((awim) obj3).a).c) {
                        i = 1;
                    } else {
                        ((avjh) obj4).r = ((avjh) obj4).r.a((avjf) this.b);
                        if (((avjh) obj4).w(((avjh) obj4).r) && ((avjgVar = ((avjh) obj4).p) == null || avjgVar.a())) {
                            avjbVar = new avjb(obj5);
                            ((avjh) obj4).y = avjbVar;
                        } else {
                            ((avjh) obj4).r = ((avjh) obj4).r.b();
                            ((avjh) obj4).y = null;
                        }
                    }
                    break;
                }
                if (i != 0) {
                    avjf avjfVar = (avjf) this.b;
                    avjfVar.a.n(new avje((avjh) ((awim) this.a).b, avjfVar));
                    avjfVar.a.h(Status.b.withDescription("Unneeded hedging"));
                    return;
                }
                if (avjbVar != null) {
                    Object obj6 = ((awim) this.a).b;
                    awim awimVar = new awim(obj6, avjbVar, 1);
                    avjh avjhVar = (avjh) obj6;
                    avjbVar.b(avjhVar.i.schedule(awimVar, avjhVar.k.b, TimeUnit.NANOSECONDS));
                }
                ((avjh) ((awim) this.a).b).f((avjf) this.b);
                return;
            case 13:
                ((avje) this.b).b.w.c((avbe) this.a);
                return;
            case 14:
                ((avje) ((atvv) this.a).b).b.f((avjf) this.b);
                return;
            case 15:
                ((avje) this.a).b.f((avjf) this.b);
                return;
            case 16:
                ((avje) this.b).b.w.e((auym) this.a);
                return;
            case 17:
                this.a.e((awuq) this.b, awmy.a);
                return;
            case 18:
                ((axkr) this.b).b.mObserver.onNetworkDisconnect(ConnectivityManagerWrapper.networkToNetId((Network) this.a));
                return;
            case 19:
                int i2 = axlw.b;
                try {
                    ((axow) this.b).onRequestFinished((RequestFinishedInfo) this.a);
                    return;
                } catch (Exception e) {
                    Log.e("cn_HttpEngineWrapper", "Exception thrown from observation task", e);
                    return;
                }
            default:
                Toast.makeText(((axmr) this.b).b, (CharSequence) this.a, 1).show();
                return;
        }
    }

    public /* synthetic */ aves(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ aves(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public aves(Object obj, Object obj2, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }
}
