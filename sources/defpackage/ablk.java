package defpackage;

import android.util.Pair;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablk implements ablg {
    public final abmt a;
    public String b;
    public acip c;
    public abyv d;
    public acfx g;
    public ablj l;
    public acga n;
    private acjb o;
    private boolean q;
    public int m = 3;
    public tyy e = new aavp(4);
    public long f = -1;
    final Map h = new HashMap();
    volatile ConcurrentHashMap i = new ConcurrentHashMap();
    final Map j = new HashMap();
    final Set k = new HashSet();
    private avmm p = new avmm();

    public ablk(abmt abmtVar) {
        this.a = abmtVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0029 A[DONT_INVERT, PHI: r0
      0x0029: PHI (r0v4 int) = (r0v2 int), (r0v0 int), (r0v0 int), (r0v6 int) binds: [B:17:0x0024, B:13:0x001b, B:8:0x0011, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x0032 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x0043  */
    /* JADX WARN: Code duplicated, block: B:33:0x0046  */
    /* JADX WARN: Code duplicated, block: B:35:0x004d  */
    private final Optional j(yvs yvsVar) {
        String str;
        int i = yvsVar.b;
        if (i == 0) {
            str = "prefetch";
        } else {
            boolean z = this.q;
            if (z) {
                if (i != 1) {
                    if (i == 2) {
                        if (!yvsVar.f) {
                            i = 2;
                        }
                    }
                    if (z ? !(i != 2 || yvsVar.c < 0) : !(i != 2 || yvsVar.f)) {
                        str = "start";
                    } else if (i == 3) {
                        str = "continue";
                    } else {
                        if (i != 4) {
                            return Optional.empty();
                        }
                        str = "stop";
                    }
                }
                str = "predict";
            } else {
                if (i == 1) {
                    i = 1;
                } else if (i == 2) {
                    i = 2;
                } else if (z) {
                    if (i == 3) {
                        str = "continue";
                    } else {
                        if (i != 4) {
                            return Optional.empty();
                        }
                        str = "stop";
                    }
                } else if (i == 3) {
                    str = "continue";
                } else {
                    if (i != 4) {
                        return Optional.empty();
                    }
                    str = "stop";
                }
                if (yvsVar.c < 0) {
                    str = "predict";
                } else if (z) {
                    if (i == 3) {
                        str = "continue";
                    } else {
                        if (i != 4) {
                            return Optional.empty();
                        }
                        str = "stop";
                    }
                } else if (i == 3) {
                    str = "continue";
                } else {
                    if (i != 4) {
                        return Optional.empty();
                    }
                    str = "stop";
                }
            }
        }
        return Optional.of(str);
    }

    private final synchronized void k(aawz aawzVar) throws Throwable {
        Throwable th;
        try {
            try {
                long j = aawzVar.a;
                Long lValueOf = Long.valueOf(1 + j);
                long j2 = aawzVar.b;
                long jLongValue = ((Long) j$.util.Map.EL.getOrDefault(this.h, lValueOf, Long.valueOf(j2))).longValue();
                Map map = this.j;
                abli abliVar = (abli) map.get(Long.valueOf((-1) + j));
                if (abliVar != null) {
                    try {
                        this.n.i(abliVar, acgb.a(abliVar.l(), Math.max(abliVar.k(), j2)));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (aawzVar.f == null || aawzVar.c == null) {
                    String str = this.b;
                    abli abliVar2 = new abli(this, str, c(str), -1L, j2, jLongValue);
                    this.n.g(abliVar2);
                    map.put(Long.valueOf(j), abliVar2);
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // defpackage.ablg
    public final void a() {
        g();
        this.p.dispose();
    }

    @Override // defpackage.ablg
    public final void b(avlh avlhVar) {
        this.p = new avmm();
        abmt abmtVar = this.a;
        this.q = abmtVar.L();
        int i = 1;
        this.p.c(avlhVar.i(new abwr(i)).ak(new abid(this, 17)));
        this.p.c(avlhVar.p().X(new ablh(0)).ak(new abid(this, 18)));
        this.p.c(avlhVar.p().W(new vvb(new abfb(4), 7)).i(new abwr(i)).ak(new abid(this, 19)));
        this.p.c(aawb.w(avlhVar, new abfb(5)).ak(new abid(this, 20)));
        if (abmtVar.ae()) {
            this.p.c(avlhVar.p().H(new ablh(2)).ak(new abid(this, 16)));
        }
    }

    public final wjf c(String str) {
        acjd acjdVarC = this.o.c(str);
        if (acjdVarC instanceof aciw) {
            return ((aciw) acjdVarC).i;
        }
        return null;
    }

    public final synchronized void d() {
        this.i.clear();
        this.j.clear();
        this.h.clear();
        this.k.clear();
        this.g = null;
        acga acgaVar = this.n;
        if (acgaVar != null) {
            acgaVar.p(abli.class);
        }
    }

    @Override // defpackage.ablg
    public final boolean e(long j) {
        return Collection.EL.stream(this.i.values()).anyMatch(new uqr(j, 8));
    }

    public final synchronized void f(Pair pair) {
        int i;
        boolean z;
        abnx[] abnxVarArr;
        int i2;
        int i3;
        aawy aawyVar;
        ablk ablkVar = this;
        synchronized (this) {
            try {
                String str = ablkVar.b;
                if (str == null || !str.equals(((acip) pair.first).au())) {
                    ablkVar.b = ((acip) pair.first).au();
                    ablkVar.c = (acip) pair.first;
                    ablkVar.o = ((acip) pair.first).x();
                    ablkVar.d();
                }
                aawz aawzVar = (aawz) pair.second;
                ahha ahhaVar = aawzVar.f;
                aawy aawyVar2 = aawzVar.c;
                Map map = ablkVar.h;
                long j = aawzVar.a;
                map.put(Long.valueOf(j), Long.valueOf(aawzVar.b));
                if (aawzVar.d) {
                    ablkVar.k(aawzVar);
                    yvs yvsVarA = ahhaVar != null ? ahhaVar.a() : null;
                    abmt abmtVar = ablkVar.a;
                    boolean z2 = false;
                    if (abmtVar.ae() && yvsVarA != null) {
                        ahhp ahhpVar = (ahhp) ablkVar.e.a();
                        Optional optionalJ = ablkVar.j(yvsVarA);
                        if (ahhpVar != null && !optionalJ.isEmpty()) {
                            ahhpVar.b("pcprcv", yvsVarA.a + '-' + ((String) optionalJ.get()), false);
                        }
                    }
                    if (ahhaVar != null && aawyVar2 != null) {
                        abnx[] abnxVarArrC = aawyVar2.c();
                        int length = abnxVarArrC.length;
                        int i4 = 0;
                        while (i4 < length) {
                            abnx abnxVar = abnxVarArrC[i4];
                            ConcurrentHashMap concurrentHashMap = ablkVar.i;
                            Object obj = abnxVar.d;
                            if (concurrentHashMap.containsKey(obj)) {
                                abli abliVar = (abli) ablkVar.i.get(obj);
                                if (abliVar != null) {
                                    ablkVar.n.i(abliVar, acgb.a(Math.min(abliVar.l(), abnxVar.a), Math.max(abliVar.k(), abnxVar.b)));
                                    z = z2;
                                    i2 = i4;
                                    i3 = length;
                                    abnxVarArr = abnxVarArrC;
                                    aawyVar = aawyVar2;
                                } else {
                                    i3 = length;
                                    i2 = i4;
                                    aawyVar = aawyVar2;
                                    z = z2;
                                    abnxVarArr = abnxVarArrC;
                                }
                            } else {
                                int i5 = length;
                                int i6 = i4;
                                abnx[] abnxVarArr2 = abnxVarArrC;
                                wjf wjfVarC = ablkVar.c((String) obj);
                                try {
                                    z = z2;
                                    abnxVarArr = abnxVarArr2;
                                    ablkVar = this;
                                    i2 = i6;
                                    i3 = i5;
                                    aawyVar = aawyVar2;
                                    abli abliVar2 = new abli(ablkVar, (String) obj, wjfVarC, abnxVar.c, abnxVar.a, abnxVar.b);
                                    ablkVar.n.g(abliVar2);
                                    if (!ablkVar.i((String) obj)) {
                                        ablkVar.i.put(obj, abliVar2);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            i4 = i2 + 1;
                            aawyVar2 = aawyVar;
                            abnxVarArrC = abnxVarArr;
                            length = i3;
                            z2 = z;
                        }
                        aawy aawyVar3 = aawyVar2;
                        boolean z3 = z2;
                        abnx[] abnxVarArr3 = abnxVarArrC;
                        int length2 = abnxVarArr3.length;
                        if (length2 > 0) {
                            if (length2 > 1) {
                                ablkVar.k.remove(abnxVarArr3[z3 ? 1 : 0].d);
                            }
                            Object obj2 = abnxVarArr3[length2 - 1].d;
                            boolean zAdd = ablkVar.k.add(obj2);
                            ahhp ahhpVar2 = (ahhp) ablkVar.e.a();
                            if (zAdd && yvsVarA != null && (i = yvsVarA.b) != 2 && i != 1 && i != 0 && ahhpVar2 != null && abmtVar.ae()) {
                                ahhpVar2.b("underdec", "cpn." + ((String) obj2) + ";missing.begin;cuepoint." + ((String) ablkVar.j(yvsVarA).orElse("unknown")) + ";seq." + j, z3);
                            }
                        }
                        if (aawyVar3.b() || (yvsVarA != null && yvsVarA.b == 4)) {
                            ablkVar.k.removeAll((java.util.Collection) DesugarArrays.stream(abnxVarArr3).map(new aalr(16)).collect(Collectors.toCollection(new yoj(10))));
                            String str2 = ablkVar.b;
                            ablkVar.n.g(new abli(ablkVar, str2, ablkVar.c(str2), -1L, aawyVar3.a() + 1, aawyVar3.a() + 1));
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void g() {
        this.l = null;
        this.m = 3;
        d();
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, wjf] */
    public final void h(ablj abljVar, ablj abljVar2, long j, boolean z, boolean z2, boolean z3) {
        ?? r3;
        ?? r13 = abljVar.c;
        if (r13 == 0 || (r3 = abljVar2.c) == 0) {
            return;
        }
        Object obj = abljVar.b;
        Object obj2 = abljVar2.b;
        aaza aazaVar = new aaza((String) obj, (String) obj2, r3.G(), this.b, j, abljVar.a, z, z2, z3, r13, (Objects.equals(obj, this.b) || z || z3 || z2 || !this.k.contains(obj)) ? false : true);
        this.c.ba().kk(aazaVar);
        String str = aazaVar.a;
        if (!aazaVar.g) {
            boolean zI = i(str);
            abyv abyvVar = this.d;
            if (!zI) {
                abyvVar.f = true;
                return;
            } else {
                if (abyvVar.f) {
                    abyvVar.l();
                    this.d.f = false;
                    return;
                }
                return;
            }
        }
        if (i(str)) {
            abyv abyvVar2 = this.d;
            abyvVar2.f = true;
            abyvVar2.k(aazaVar.e, str, aazaVar.j, 0);
        } else {
            if (i(str)) {
                return;
            }
            abyv abyvVar3 = this.d;
            if (abyvVar3.f) {
                abyvVar3.f = false;
            }
        }
    }

    public final boolean i(String str) {
        return str.equals(this.b);
    }
}
