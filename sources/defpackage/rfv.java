package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rfv implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rfv(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.lang.Thread$UncaughtExceptionHandler] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.$cid == 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            synchronized (obj) {
                ((rfz) obj2).b = th;
                obj.notify();
            }
            return;
        }
        Object obj3 = this.b;
        ?? r13 = this.a;
        try {
            try {
                ahub ahubVarB = aftt.b(th);
                if (ahubVarB != null) {
                    Object obj4 = ahubVarB.a;
                    qgk qgkVarB = qgk.b(((afvy) obj4).b);
                    if (qgkVarB != null && qgkVarB.a() != null && !qgkVarB.c()) {
                        UUID uuid = ((afvy) obj4).c;
                        long mostSignificantBits = (uuid.getMostSignificantBits() ^ uuid.getLeastSignificantBits()) & Long.MAX_VALUE;
                        if (mostSignificantBits == 0) {
                            mostSignificantBits = 1;
                        }
                        Long lValueOf = Long.valueOf(mostSignificantBits);
                        aigu aiguVarC = aikw.c(((afvy) obj4).d);
                        agke agkeVar = (agke) Stream.CC.concat(Collection.EL.stream(qgkVarB.b).map(new qdi(5)), Collection.EL.stream(qgkVarB.a.entrySet()).map(new qdi(6))).collect(aghu.a);
                        aihf aihfVarCreateBuilder = axgg.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        axgg axggVar = (axgg) aihfVarCreateBuilder.instance;
                        axggVar.b |= 1;
                        axggVar.c = 0;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgg axggVar2 = (axgg) aihfVarCreateBuilder.instance;
                        axggVar2.f = 2;
                        axggVar2.b |= 8;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgg axggVar3 = (axgg) aihfVarCreateBuilder.instance;
                        aiie aiieVar = axggVar3.g;
                        if (!aiieVar.c()) {
                            axggVar3.g = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(agkeVar, axggVar3.g);
                        lValueOf.getClass();
                        aihfVarCreateBuilder.copyOnWrite();
                        axgg axggVar4 = (axgg) aihfVarCreateBuilder.instance;
                        axggVar4.b |= 4;
                        axggVar4.e = mostSignificantBits;
                        if (aiguVarC != null) {
                            aihfVarCreateBuilder.copyOnWrite();
                            axgg axggVar5 = (axgg) aihfVarCreateBuilder.instance;
                            axggVar5.d = aiguVarC;
                            axggVar5.b |= 2;
                        }
                        axgg axggVar6 = (axgg) aihfVarCreateBuilder.build();
                        qfg qfgVar = ((qgl) obj3).a;
                        qfc qfcVarA = qfd.a();
                        qfcVarA.e(true);
                        aihf aihfVarCreateBuilder2 = axhz.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        axhz axhzVar = (axhz) aihfVarCreateBuilder2.instance;
                        axggVar6.getClass();
                        axhzVar.o = axggVar6;
                        axhzVar.b |= 524288;
                        qfcVarA.g((axhz) aihfVarCreateBuilder2.build());
                        qfcVarA.b = null;
                        qfgVar.a(qfcVarA.a());
                    }
                }
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/cui/CuiMetricServiceImpl", "onApplicationStartup", 148, "CuiMetricServiceImpl.java")).t("Failed to end CUI.");
            }
        } finally {
            if (r13 != 0) {
                r13.uncaughtException(thread, th);
            }
        }
    }
}
