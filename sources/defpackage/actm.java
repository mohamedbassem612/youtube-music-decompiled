package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class actm implements actn {
    private static final agkz o = agkz.u("r_vtsk", "r_tr", "r_ofs", "r_ofe", "r_as", "r_ac", "r_fa", "r_fc", "r_fs", "r_fr", "r_fd", "r_fcp", "r_nav", "r_bind", "r_pfcv", "r_pfvc", "r_lns", "r_lnsc", "r_ts", "r_fips", "r_uil", "r_rips", "r_ripe", "r_wipbc", "r_rrwsr", "aa", "r_ipl", "r_sgs", "r_sge", "r_or", "r_sqs", "r_sqr", "r_sqe", "r_sqch");
    public final awmd a;
    public final mbc c;
    public final awmd d;
    public final tre e;
    public final Context f;
    public xir g;
    public long h;
    public boolean i;
    String j;
    private final tqj p;
    private String q;
    public final Object b = new Object();
    public int m = 1;
    public int n = 1;
    public acvn k = acvn.c;
    public volatile boolean l = false;
    private final Set r = new HashSet();
    private final aghp s = new agjo(16);

    public actm(awmd awmdVar, mbc mbcVar, awmd awmdVar2, tre treVar, tqj tqjVar, Context context) {
        this.a = awmdVar;
        this.c = mbcVar;
        this.d = awmdVar2;
        this.e = treVar;
        this.p = tqjVar;
        this.f = context;
    }

    public final long a(long j, String str) {
        if (this.g != null) {
            tre treVar = this.e;
            int i = trd.x;
            treVar.g(88, 1);
            synchronized (this.b) {
                if (this.g != null && !this.i) {
                    tsv.e(this.f, Ctry.SHORTS_PLAYBACK, "");
                    tqj tqjVar = this.p;
                    int i2 = tqr.a;
                    if (!tqjVar.k(1073829998)) {
                        f("aa");
                    }
                    this.i = true;
                }
            }
            d();
            tsv.e(this.f, Ctry.SHORTS_PLAYBACK, "");
        }
        tsv.d(this.f, Ctry.SHORTS_PLAYBACK, "");
        this.j = str;
        return j == 0 ? this.c.f().toEpochMilli() : j;
    }

    public final long b(boolean z, String str) {
        synchronized (this.b) {
            if (k(str)) {
                this.e.c(65);
                if (this.g != null) {
                    f("r_wrr");
                    long epochMilli = this.c.f().toEpochMilli();
                    aihf aihfVarCreateBuilder = amjf.a.createBuilder();
                    int i = 2 << (z ? 1 : 0);
                    aihfVarCreateBuilder.copyOnWrite();
                    amjf amjfVar = (amjf) aihfVarCreateBuilder.instance;
                    amjfVar.d = i - 1;
                    amjfVar.b |= 2;
                    amjf amjfVar2 = (amjf) aihfVarCreateBuilder.build();
                    boolean zEquals = Objects.equals(this.j, "cold");
                    String str2 = this.j;
                    if (str2 == null) {
                        str2 = "warm";
                    }
                    aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
                    if (z && !zEquals) {
                        str2 = "hot";
                    }
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVarCreateBuilder2.instance;
                    amiuVar.b |= SemanticState.Focused;
                    amiuVar.j = str2;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amiu amiuVar2 = (amiu) aihfVarCreateBuilder2.instance;
                    amjfVar2.getClass();
                    amiuVar2.S = amjfVar2;
                    amiuVar2.d |= 131072;
                    this.g.h((amiu) aihfVarCreateBuilder2.build());
                    return epochMilli - this.h;
                }
            }
            return 0L;
        }
    }

    public final Optional c() {
        return Optional.ofNullable(this.g);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Map] */
    public final void d() {
        boolean zAk = ((hno) this.d.io()).ak();
        synchronized (this.b) {
            if (this.g != null) {
                aeiy aeiyVar = (aeiy) this.a.io();
                xir xirVar = this.g;
                if (xirVar != null) {
                    if (((hno) aeiyVar.g).aB()) {
                        if (aeiyVar.g()) {
                            Object obj = aeiyVar.f;
                            synchronized (obj) {
                                try {
                                    for (Map.Entry entry : ((LruCache) obj).snapshot().entrySet()) {
                                        if (entry.getValue() == xirVar) {
                                            ((LruCache) obj).remove(entry.getKey());
                                            break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            ?? r2 = aeiyVar.a;
                            synchronized (r2) {
                                try {
                                    Collection.EL.removeIf(r2.entrySet(), new aciy(xirVar, 5));
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } else if (aeiyVar.g()) {
                        Object obj2 = aeiyVar.c;
                        synchronized (obj2) {
                            try {
                                for (Map.Entry entry2 : ((LruCache) obj2).snapshot().entrySet()) {
                                    if (entry2.getValue() == xirVar) {
                                        ((LruCache) obj2).remove((apfp) entry2.getKey());
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        ?? r3 = aeiyVar.h;
                        synchronized (r3) {
                            try {
                                Collection.EL.removeIf(r3.entrySet(), new aciy(xirVar, 6));
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
                if (zAk) {
                    this.s.a().remove(this.q);
                }
                this.g = null;
                this.q = null;
                this.m = 1;
            }
            tqj tqjVar = this.p;
            int i = tqr.a;
            if (tqjVar.k(1073830961)) {
                this.q = null;
                this.i = false;
            }
        }
    }

    public final void e() {
        Iterator it;
        Object obj = this.b;
        synchronized (obj) {
            it = this.r.iterator();
            while (it.hasNext()) {
                actl actlVar = (actl) it.next();
                if (k(actlVar.a())) {
                    synchronized (obj) {
                        try {
                            if (this.g != null && k(actlVar.a())) {
                                f(actlVar.b());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            return;
        }
        it.remove();
    }

    public final void f(String str) {
        synchronized (this.b) {
            xir xirVar = this.g;
            if (xirVar != null) {
                xirVar.n(str);
            }
        }
        if (o.contains(str)) {
            this.e.h.g(str);
        }
    }

    public final void g(String str, long j) {
        if (j > 0) {
            synchronized (this.b) {
                xir xirVar = this.g;
                if (xirVar != null) {
                    xirVar.o(str, j);
                }
            }
            if (o.contains(str)) {
                mbc mbcVar = this.c;
                long jB = mbcVar.b() - (mbcVar.f().toEpochMilli() - j);
                this.e.h.b.b(str, jB, jB);
            }
        }
    }

    @Deprecated
    public final void h(String str) {
        synchronized (this.b) {
            if (this.g != null && ahno.aa(this.q) && str != null) {
                this.q = str;
            }
        }
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        afvn afvnVarB = aawb.b(aazjVar, "RPCAC");
        try {
            synchronized (this.b) {
                if (this.g != null) {
                    String str = aazjVar.g;
                    if (!TextUtils.isEmpty(str)) {
                        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                        str.getClass();
                        amiuVar.b |= 32768;
                        amiuVar.n = str;
                        this.g.h((amiu) aihfVarCreateBuilder.build());
                    }
                }
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(String str, String str2) {
        synchronized (this.b) {
            if (this.g != null && ahno.aa(this.q) && str != null) {
                this.q = str;
                if (!ahno.aa(str2)) {
                    ((agjo) this.s).g(str2, str, true);
                }
            }
        }
    }

    public final void j(apfp apfpVar, apfu apfuVar) {
        synchronized (this.b) {
            if (this.g != null) {
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aawr.D(apfpVar, apfuVar, aihfVarCreateBuilder);
                if (apfpVar != null) {
                    this.m = aawr.B(apfpVar);
                }
                this.g.h((amiu) aihfVarCreateBuilder.build());
            }
        }
    }

    public final boolean k(String str) {
        boolean z;
        synchronized (this.b) {
            String str2 = this.q;
            z = true;
            if (str2 != null && !str2.equals(str) && !str2.equals(this.s.get(str))) {
                z = false;
            }
        }
        return z;
    }

    public final boolean l() {
        int i = tqr.a;
        return this.p.k(1073829102);
    }

    public final void m(int i, int i2, apfp apfpVar, xir xirVar, long j, String str, apfu apfuVar) {
        long jA = a(j, str);
        if (xirVar == null) {
            awmd awmdVar = this.a;
            xir xirVarD = ((aeiy) awmdVar.io()).d(apfpVar);
            ((aeiy) awmdVar.io()).f(xirVarD);
            if (!l()) {
                xirVarD.l(jA);
            }
            xirVar = xirVarD;
        }
        aihf aihfVarC = aawr.C(i);
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        if (((hno) this.d.io()).bb() && apfpVar != null && (apfpVar.d & 262144) != 0) {
            String str2 = apfpVar.U;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            str2.getClass();
            amiuVar.b |= 32;
            amiuVar.i = str2;
        }
        aawr.D(apfpVar, apfuVar, aihfVarCreateBuilder);
        n(i, i2, xirVar, jA, aihfVarC, aihfVarCreateBuilder);
    }

    public final void n(int i, int i2, xir xirVar, long j, aihf aihfVar, aihf aihfVar2) {
        amjf amjfVar = ((amiu) aihfVar2.instance).S;
        if (amjfVar == null) {
            amjfVar = amjf.a;
        }
        aihf builder = amjfVar.toBuilder();
        builder.copyOnWrite();
        amjf amjfVar2 = (amjf) builder.instance;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        amjfVar2.c = i3;
        amjfVar2.b |= 1;
        builder.copyOnWrite();
        amjf amjfVar3 = (amjf) builder.instance;
        amjfVar3.d = 1;
        amjfVar3.b |= 2;
        builder.copyOnWrite();
        amjf amjfVar4 = (amjf) builder.instance;
        amjfVar4.e = 0;
        amjfVar4.b |= 4;
        int iBc = a.bc(amjfVar4.c);
        if (iBc != 0 && iBc == 3) {
            builder.copyOnWrite();
            amjf amjfVar5 = (amjf) builder.instance;
            amjfVar5.j = 2;
            amjfVar5.b |= SemanticState.Focused;
        }
        if (this.k == acvn.b && ((hno) this.d.io()).aZ()) {
            builder.copyOnWrite();
            amjf amjfVar6 = (amjf) builder.instance;
            amjfVar6.b |= SemanticState.ReadOnly;
            amjfVar6.k = true;
        }
        if (((hno) this.d.io()).aP()) {
            boolean z = this.l;
            builder.copyOnWrite();
            amjf amjfVar7 = (amjf) builder.instance;
            amjfVar7.b |= SemanticState.Multiline;
            amjfVar7.m = z;
        }
        aihfVar2.copyOnWrite();
        amiu amiuVar = (amiu) aihfVar2.instance;
        amjf amjfVar8 = (amjf) builder.build();
        amjfVar8.getClass();
        amiuVar.S = amjfVar8;
        amiuVar.d |= 131072;
        aihfVar2.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVar2.instance;
        amiw amiwVar = (amiw) aihfVar.build();
        amiwVar.getClass();
        amiuVar2.N = amiwVar;
        amiuVar2.d |= 8;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            long j2 = this.h;
            if (j2 > 0) {
                long j3 = j - j2;
                if (j3 < 2147483647L) {
                    aihfVar2.copyOnWrite();
                    amiu amiuVar3 = (amiu) aihfVar2.instance;
                    amiuVar3.b |= 134217728;
                    amiuVar3.v = (int) j3;
                }
            }
        }
        String str = this.j;
        if (str != null) {
            aihfVar2.copyOnWrite();
            amiu amiuVar4 = (amiu) aihfVar2.instance;
            amiuVar4.b |= SemanticState.Focused;
            amiuVar4.j = str;
        }
        xirVar.h((amiu) aihfVar2.build());
        synchronized (this.b) {
            this.g = xirVar;
            this.i = false;
            this.h = j;
            this.n = i2;
        }
    }
}
