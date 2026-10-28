package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qhs implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qhs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [kjc] */
    /* JADX WARN: Type inference failed for: r0v17, types: [ayq] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r3v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v105, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v31, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v53, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v71, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v74, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        ?? kjcVar;
        aobk aobkVar;
        int i = 16;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                return (qhh) this.a.io();
            case 1:
                Object obj = this.a;
                int i3 = qgq.a;
                long jCeil = qgp.a;
                if (jCeil == 0) {
                    synchronized (qgp.class) {
                        jCeil = qgp.a;
                        if (jCeil == 0) {
                            float fFloatValue = ((Float) qgp.a((Context) obj).e(Float.valueOf(60.0f))).floatValue();
                            jCeil = (long) Math.ceil(1.0E9d / ((double) (fFloatValue >= 1.0f ? fFloatValue : 60.0f)));
                            qgp.a = jCeil;
                        }
                        break;
                    }
                }
                return Long.valueOf(jCeil);
            case 2:
                AtomicReference atomicReference = qkh.a;
                qpm qpmVar = new qpm();
                qpmVar.f = this.a;
                Object obj2 = qpmVar.f;
                obj2.getClass();
                if (qpmVar.a == null) {
                    qpmVar.a = qkh.b;
                }
                if (qpmVar.e == null) {
                    qpmVar.e = aguu.al(new qhs(obj2, 3));
                }
                if (qpmVar.d == null) {
                    qpmVar.d = new qhs(qpmVar, 6);
                }
                if (qpmVar.c == null) {
                    Object obj3 = qpmVar.f;
                    ArrayList arrayList = new ArrayList();
                    Collections.addAll(arrayList, new qpp(new afwv((Context) obj3)), new qpt());
                    qpmVar.c = aguu.al(new qhs(arrayList, 4));
                }
                if (qpmVar.b == null) {
                    qpmVar.b = new qhs(qpmVar, 7);
                }
                return new qkh((Context) qpmVar.f, qpmVar.a, qpmVar.e, qpmVar.d, qpmVar.c, qpmVar.b);
            case 3:
                AtomicReference atomicReference2 = qkh.a;
                khn khnVar = lll.a;
                kjcVar = new kjc(new llq((Context) this.a));
                break;
            case 4:
                AtomicReference atomicReference3 = qkh.a;
                kjcVar = new ayq((List) this.a);
                break;
            case 5:
                AtomicReference atomicReference4 = qkh.a;
                return (qmy) ((agfa) this.a.io()).a;
            case 6:
                return new agfa(new qmt(((qpm) this.a).a));
            case 7:
                Object obj4 = ((qpm) this.a).f;
                AtomicReference atomicReference5 = qkh.a;
                try {
                    return agev.i(((Context) obj4).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused) {
                    return agdf.a;
                }
            case 8:
                qkl qklVar = qkm.a;
                return qkc.a((Context) this.a);
            case 9:
                Object obj5 = this.a;
                qnf qnfVar = (qnf) obj5;
                ahey aheyVar = (ahey) qnfVar.e.io();
                aheyVar.getClass();
                kjc kjcVar2 = (kjc) qnfVar.d.io();
                kjcVar2.getClass();
                aheo aheoVarQ = ((aheo) ahbz.e(aheo.p(kjc.A(((llq) kjcVar2.a).c())), qkt.class, new one(i), aheyVar)).q(new onn(obj5, 9), aheyVar);
                aheoVarQ.addListener(new qca(aheoVarQ, 14), aheyVar);
                return aheoVarQ;
            case 10:
                ahey aheyVar2 = (ahey) this.a.io();
                aheyVar2.getClass();
                return aheyVar2.schedule(new fxv(10), 10000L, TimeUnit.MILLISECONDS);
            case 11:
                return ((rsa) this.a).a.p().P().l(500L, TimeUnit.MILLISECONDS).E();
            case 12:
                return txz.b((Context) this.a);
            case 13:
                String packageName = ((Context) this.a).getPackageName();
                return packageName == null ? "" : packageName;
            case 14:
                return (ttm) this.a.io();
            case 15:
                return (szy) this.a.io();
            case 16:
                return ((avlh) ((tfm) this.a).c).P().H(new tfk(i2)).p();
            case 17:
                return ((avlh) ((tfm) this.a).c).P().H(new rtq(15)).p();
            case 18:
                return ((avlh) ((tfm) this.a).c).P().H(new rtq(i)).p();
            case 19:
                return ((toj) this.a).a.p().P().l(250L, TimeUnit.MILLISECONDS).E();
            default:
                kjcVar = new HashSet();
                Iterator it = ((toj) this.a).d.q(0, 45371833L).b.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 0:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_UNKNOWN;
                            break;
                        case 1:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP;
                            break;
                        case 2:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_TCP;
                            break;
                        case 3:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_QUIC;
                            break;
                        case 4:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP_CACHED_ESTIMATE;
                            break;
                        case 5:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_HTTP_FROM_PLATFORM;
                            break;
                        case 6:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_DEPRECATED_HTTP_EXTERNAL_ESTIMATE;
                            break;
                        case 7:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_TRANSPORT_CACHED_ESTIMATE;
                            break;
                        case 8:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_TRANSPORT_FROM_PLATFORM;
                            break;
                        case 9:
                            aobkVar = aobk.NETWORK_QUALITY_OBSERVATION_SOURCE_H2_PINGS;
                            break;
                        default:
                            aobkVar = null;
                            break;
                    }
                    if (aobkVar != null) {
                        kjcVar.add(aobkVar);
                    }
                }
                break;
        }
        return kjcVar;
    }
}
