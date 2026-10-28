package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.CommonApis;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kkf extends kid {
    public static final WeakHashMap b = new WeakHashMap();
    public final kko c;
    private final kki d;

    public kkf(int i, kik kikVar, kki kkiVar) {
        int i2 = kikVar.d;
        int i3 = i2 <= 0 ? 35 : i2;
        int i4 = kikVar.e;
        this.c = new kko(i - 2, kikVar.c, i3, i4 <= 0 ? i3 : i4, kikVar.f);
        this.d = kkiVar;
    }

    @Override // defpackage.kid
    public final ListenableFuture a(kiy kiyVar) {
        kkp kkpVar;
        ListenableFuture listenableFutureE;
        kko kkoVar = this.c;
        if (kkoVar.b <= 0.0d) {
            return ahng.n(kiz.a);
        }
        Instant instant = kiyVar.a;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            kkpVar = (kkp) weakHashMap.get(Integer.valueOf(kkoVar.hashCode()));
        }
        if (kkpVar == null || !instant.isBefore(kkpVar.a())) {
            ListenableFuture listenableFutureBp = qnl.bp(this.d.a(this.c));
            ahng.x(listenableFutureBp, new hfb(this, 19), MoreExecutors.directExecutor());
            listenableFutureE = ahcs.e(listenableFutureBp, new kke(0), MoreExecutors.directExecutor());
        } else {
            listenableFutureE = ahng.n(Boolean.valueOf(kkpVar.a));
        }
        return ahcs.e(listenableFutureE, new iun(this, 2), MoreExecutors.directExecutor());
    }

    @Override // defpackage.kid
    public final auli b() {
        kkp kkpVar;
        aihf aihfVarCreateBuilder = aulg.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aulg aulgVar = (aulg) aihfVarCreateBuilder.instance;
        aulgVar.b |= 1;
        kko kkoVar = this.c;
        aulgVar.c = (float) kkoVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        aulg aulgVar2 = (aulg) aihfVarCreateBuilder.instance;
        aulgVar2.b |= 2;
        aulgVar2.d = kkoVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        aulg aulgVar3 = (aulg) aihfVarCreateBuilder.instance;
        int i = 8;
        aulgVar3.b |= 8;
        aulgVar3.f = kkoVar.d;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            kkpVar = (kkp) weakHashMap.get(Integer.valueOf(kkoVar.hashCode()));
        }
        if (kkpVar != null) {
            int iP = ahng.P(ChronoUnit.DAYS.between(kkpVar.a().minus(Duration.ofDays(this.c.c)), Instant.now()));
            aihfVarCreateBuilder.copyOnWrite();
            aulg aulgVar4 = (aulg) aihfVarCreateBuilder.instance;
            aulgVar4.b |= 4;
            aulgVar4.e = iP;
        }
        int i2 = this.c.a;
        if (i2 != 0) {
            switch (i2) {
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                case 13:
                    i = 15;
                    break;
                case 14:
                    i = 16;
                    break;
                case 15:
                    i = 17;
                    break;
                case 16:
                    i = 18;
                    break;
                case 17:
                    i = 19;
                    break;
                case 18:
                    i = 20;
                    break;
                case 19:
                    i = 21;
                    break;
                case 20:
                    i = 22;
                    break;
                default:
                    switch (i2) {
                        case 100000:
                            i = 100002;
                            break;
                        case 100001:
                            i = 100003;
                            break;
                        case 100002:
                            i = 100004;
                            break;
                        case 100003:
                            i = 100005;
                            break;
                        case 100004:
                            i = 100006;
                            break;
                        case 100005:
                            i = 100007;
                            break;
                        case 100006:
                            i = 100008;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    break;
            }
        } else {
            i = 2;
        }
        int i3 = i != 0 ? i : 0;
        if (i3 == 0) {
            i3 = 2;
        }
        aihf aihfVarCreateBuilder2 = auli.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        auli auliVar = (auli) aihfVarCreateBuilder2.instance;
        auliVar.c = CommonApis.q(i3);
        auliVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        auli auliVar2 = (auli) aihfVarCreateBuilder2.instance;
        aulg aulgVar5 = (aulg) aihfVarCreateBuilder.build();
        aulgVar5.getClass();
        auliVar2.d = aulgVar5;
        auliVar2.b |= 2;
        return (auli) aihfVarCreateBuilder2.build();
    }
}
