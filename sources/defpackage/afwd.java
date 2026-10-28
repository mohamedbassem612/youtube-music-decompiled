package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwd {
    public static final agrf a = agrf.h("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final mbc b;
    public final awmd c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final afuk h;
    private final awmd i;
    private final aftz j;

    public afwd(afuk afukVar, mbc mbcVar, awmd awmdVar, awmd awmdVar2, aftz aftzVar, Map map, Map map2) {
        int iA;
        this.h = afukVar;
        this.b = mbcVar;
        this.c = awmdVar;
        this.i = awmdVar2;
        this.j = aftzVar;
        if (map.isEmpty()) {
            this.f = 500;
        } else {
            agpn agpnVar = (agpn) map;
            if (agpnVar.d != 1) {
                throw new IllegalArgumentException("Please only specify the max number of spans once.");
            }
            this.f = ((afue) aguu.C(((agpl) agpnVar.keySet()).iterator())).a();
        }
        if (map2.isEmpty()) {
            iA = 900000;
            this.g = 900000;
        } else {
            agpn agpnVar2 = (agpn) map2;
            if (agpnVar2.d != 1) {
                throw new IllegalArgumentException("Please only specify the trace deadline limit once.");
            }
            iA = ((afvr) aguu.C(((agpl) agpnVar2.keySet()).iterator())).a();
            this.g = iA;
        }
        this.e = new AtomicLong(iA);
    }

    private static final void e(afvl afvlVar, String str) {
        aftl aftlVar;
        if (afvlVar == null || afvlVar == afur.a || (afvlVar instanceof aful) || aftk.a == 1) {
            return;
        }
        if (afvlVar instanceof afto) {
            String strI = afty.i(afvlVar);
            strI.getClass();
            if (!awrc.c("", strI)) {
                strI = ": ".concat(strI);
            }
            aftlVar = new aftl(strI, str, ((afto) afvlVar).h());
        } else {
            aftlVar = new aftl(str);
        }
        avkz.d(aftlVar, afwq.a());
        if (aftk.a != 3) {
            throw aftlVar;
        }
        ((agrc) ((agrc) afvz.a.b().i(agso.a, "TraceManager")).j(aftlVar).k("com/google/apps/tiktok/tracing/TraceManager$Companion", "reportDuplicateTraceException", 144, "TraceManager.kt")).w("Duplicate trace %s", new qdv(str));
    }

    private final afvl f(String str, afuy afuyVar, long j, long j2, int i, int i2) {
        UUID uuidB = this.j.b();
        String strKg = afsx.kg(uuidB);
        uuidB.getLeastSignificantBits();
        aihf aihfVarCreateBuilder = afwm.a.createBuilder();
        long leastSignificantBits = uuidB.getLeastSignificantBits();
        aihfVarCreateBuilder.copyOnWrite();
        afwm afwmVar = (afwm) aihfVarCreateBuilder.instance;
        afwmVar.b |= 2;
        afwmVar.d = leastSignificantBits;
        long mostSignificantBits = uuidB.getMostSignificantBits();
        aihfVarCreateBuilder.copyOnWrite();
        afwm afwmVar2 = (afwm) aihfVarCreateBuilder.instance;
        afwmVar2.b |= 1;
        afwmVar2.c = mostSignificantBits;
        aihfVarCreateBuilder.copyOnWrite();
        afwm afwmVar3 = (afwm) aihfVarCreateBuilder.instance;
        afwmVar3.b |= 4;
        afwmVar3.f = j;
        aihfVarCreateBuilder.copyOnWrite();
        afwm afwmVar4 = (afwm) aihfVarCreateBuilder.instance;
        afwmVar4.b |= 8;
        afwmVar4.g = j2 / 1000000;
        aihfVarCreateBuilder.copyOnWrite();
        afwm afwmVar5 = (afwm) aihfVarCreateBuilder.instance;
        afwmVar5.i = 1;
        afwmVar5.b |= 64;
        afwm afwmVar6 = (afwm) aihfVarCreateBuilder.build();
        afwy afwyVar = new afwy(str, i2, afuyVar, i);
        afwz afwzVar = new afwz(this, uuidB, strKg, afwmVar6, afwyVar, j2, false, this.b);
        afvh afvhVar = (afvh) afty.d.get();
        afum afumVar = new afum(afwyVar, afwzVar, afvhVar);
        afuk afukVar = this.h;
        if (afukVar.d.compareAndSet(false, true)) {
            afukVar.c.execute(new acem(afukVar, 14, null));
        }
        afuj afujVar = new afuj(afumVar, afukVar.b);
        afuk.a.put(afujVar, Boolean.TRUE);
        afui afuiVar = afujVar.a;
        Executor executor = (Executor) this.c.io();
        afwzVar.f = afuiVar;
        afuiVar.addListener(afwzVar, executor);
        this.d.put(uuidB, afwzVar);
        afty.e(afvhVar, afumVar);
        return afumVar;
    }

    public final void a(String str) {
        afvh afvhVarA = afty.a();
        afvl afvlVar = afvhVarA.c;
        afty.d(new afuh(str, afuh.a, afuh.b, afux.a, afvhVarA));
        try {
            for (ahub ahubVar : (Set) this.i.io()) {
            }
            afty.e(afvhVarA, afvlVar);
        } catch (Throwable th) {
            afty.e(afvhVarA, afvlVar);
            throw th;
        }
    }

    public final afun b(String str, afuy afuyVar, int i) {
        final afvl afvlVar = ((afvh) afty.d.get()).c;
        e(afvlVar, str);
        mbc mbcVar = this.b;
        final afvl afvlVarF = f(str, afuyVar, mbcVar.f().toEpochMilli(), mbcVar.c(), 1, i);
        return afvlVar != ((afum) afvlVarF).b ? new afun() { // from class: afwa
            @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                afvlVarF.close();
                afty.e((afvh) afty.d.get(), afvlVar);
            }
        } : afvlVarF;
    }

    public final afun c(afuy afuyVar, long j, long j2) {
        final afvl afvlVar = ((afvh) afty.d.get()).c;
        e(afvlVar, "Application creation");
        final afvl afvlVarF = f("Application creation", afuyVar, j, j2, 1, 140);
        return afvlVar != ((afum) afvlVarF).b ? new afun() { // from class: afwb
            @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                afvlVarF.close();
                afty.d(afvlVar);
            }
        } : afvlVarF;
    }

    public final afvk d(String str, afuy afuyVar, int i) {
        afvl afvlVarB = afty.b();
        e(afvlVarB, str);
        mbc mbcVar = this.b;
        return new afwc(new afuu(f(str, afuyVar, mbcVar.f().toEpochMilli(), mbcVar.c(), 2, i), false), afvlVarB);
    }
}
