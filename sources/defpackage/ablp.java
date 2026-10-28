package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ablp {
    private final long a;
    private final Consumer b;
    private String g;
    private acjb h;
    private long i;
    private long j;
    private int m;
    private int n;
    private final abmt o;
    private final tyy p;
    private final boolean q;
    private ywu c = null;
    private final Set d = new HashSet();
    private final Set e = new HashSet();
    private final Set f = new HashSet();
    private long k = -1;
    private long l = -1;

    public ablp(abmt abmtVar, tyy tyyVar) {
        this.o = abmtVar;
        this.p = tyyVar;
        this.q = abmtVar.L();
        this.a = abmtVar.g.c(26, 45688271L, 5000L);
        this.b = new aaer(tyyVar, 14);
    }

    private final ywu g(long j, yvs yvsVar, Supplier supplier, long j2, boolean z) {
        return new ywu(j, yvsVar, this.o.g.l(221, 45700055L, false), this.b, z, supplier, j2);
    }

    private final String h(aawz aawzVar, String str) {
        long j;
        int i;
        if (aawzVar.e) {
            j = this.k;
            i = this.n;
        } else {
            j = this.l;
            i = this.m;
        }
        long j2 = aawzVar.b;
        return "sq." + aawzVar.a + ";start." + j2 + ";other_sq." + j + ";ad_id." + str + ";deleted." + i;
    }

    private final void i(String str, String str2) {
        ahhp ahhpVar;
        if (!this.o.ae() || (ahhpVar = (ahhp) this.p.a()) == null) {
            return;
        }
        ahhpVar.b(str, str2, false);
    }

    private final synchronized void j() {
        ywu ywuVar = this.c;
        if (ywuVar != null) {
            ywuVar.e();
            this.c = null;
            this.g = null;
        }
        this.i = -1L;
        this.j = -1L;
        this.m = 0;
        this.n = 0;
    }

    private final void k(aawz aawzVar) {
        if (aawzVar.e) {
            this.l = aawzVar.a;
        } else if (aawzVar.d) {
            this.k = aawzVar.a;
        }
    }

    private final boolean l(yvs yvsVar) {
        if (this.q) {
            if (yvsVar.b == 2 && !yvsVar.f) {
                return true;
            }
        } else if (yvsVar.b == 2 && yvsVar.c >= 0) {
            return true;
        }
        return false;
    }

    private static final boolean m(wjf wjfVar) {
        return wjfVar != null && wjfVar.f().aA();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02a8 A[Catch: all -> 0x0309, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0015, B:9:0x001a, B:11:0x002e, B:39:0x0071, B:14:0x0035, B:18:0x003e, B:31:0x005c, B:23:0x0047, B:42:0x0090, B:44:0x0096, B:47:0x009c, B:49:0x00a6, B:51:0x00ac, B:53:0x00b4, B:55:0x00c0, B:57:0x00c8, B:59:0x00ce, B:61:0x00d4, B:63:0x00da, B:64:0x00dc, B:66:0x00e7, B:95:0x024e, B:67:0x010e, B:68:0x012f, B:69:0x0130, B:71:0x013b, B:72:0x0165, B:73:0x0185, B:74:0x0186, B:76:0x018d, B:78:0x0195, B:80:0x019b, B:82:0x01a3, B:84:0x01a9, B:85:0x01ac, B:87:0x01b7, B:88:0x01db, B:89:0x01fb, B:90:0x01fc, B:92:0x0204, B:93:0x022d, B:94:0x024d, B:99:0x0254, B:102:0x025e, B:108:0x0270, B:104:0x0264, B:106:0x026a, B:111:0x0278, B:113:0x0284, B:115:0x0294, B:117:0x029c, B:119:0x02ae, B:120:0x02cb, B:118:0x02a8, B:121:0x02cc, B:123:0x02d2, B:125:0x02da, B:127:0x02de, B:129:0x02e4, B:138:0x0302, B:130:0x02e5, B:134:0x02f1, B:137:0x02ff), top: B:145:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    public final synchronized void a(aawz aawzVar, acjb acjbVar, wjf wjfVar, long j, long j2, Supplier supplier) {
        ywu ywuVar;
        long millis;
        int i;
        boolean z;
        String str;
        this.h = acjbVar;
        ahha ahhaVar = aawzVar.f;
        if (ahhaVar == null) {
            k(aawzVar);
            return;
        }
        String strD = ((ywx) ahhaVar.a).d("Cuepoint-Identifier");
        yvs yvsVarA = ahhaVar.a();
        if (yvsVarA != null) {
            int i2 = yvsVarA.b;
            if (i2 == 0) {
                str = "prefetch";
            } else {
                int i3 = 2;
                if (this.q) {
                    if (i2 == 1) {
                        i2 = 1;
                        z = true;
                        if (z) {
                            str = "predict";
                        } else {
                            i3 = i2;
                        }
                    } else if (i2 != 2) {
                        z = false;
                        if (z) {
                            str = "predict";
                        } else {
                            i3 = i2;
                        }
                    } else if (yvsVarA.f) {
                        z = true;
                        i2 = 2;
                        if (z) {
                            str = "predict";
                        } else {
                            i3 = i2;
                        }
                    }
                } else if (i2 == 1) {
                    i2 = 1;
                    z = true;
                    if (z) {
                        str = "predict";
                    } else {
                        i3 = i2;
                    }
                } else if (i2 != 2) {
                    z = false;
                    if (z) {
                        str = "predict";
                    } else {
                        i3 = i2;
                    }
                } else if (yvsVarA.c < 0) {
                    z = true;
                    i2 = 2;
                    if (z) {
                        str = "predict";
                    } else {
                        i3 = i2;
                    }
                }
                if (l(yvsVarA)) {
                    str = "start";
                } else if (i3 == 3) {
                    str = "continue";
                } else {
                    str = i3 == 4 ? "stop" : "unknown";
                }
            }
            i("blockrcv", yvsVarA.a + '-' + str);
        }
        if (strD == null || yvsVarA == null || !(l(yvsVarA) || (i = yvsVarA.b) == 3 || i == 4)) {
            j();
        } else {
            Set set = this.f;
            boolean zContains = set.contains(strD);
            if (aawzVar.c != null || acjbVar.Q(strD)) {
                i(true != acjbVar.Q(strD) ? "pbltr" : "pbltf", strD);
                set.add(strD);
                j();
                k(aawzVar);
                return;
            }
            long j3 = aawzVar.b;
            if (acjbVar.t(j3) != null) {
                set.add(strD);
                if (aawzVar.e) {
                    abmt abmtVar = this.o;
                    if (abmtVar.R() && m(wjfVar)) {
                        long j4 = this.j;
                        if (j4 != -1 && j4 != aawzVar.a) {
                            this.n = 0;
                        }
                        long jM = abmtVar.m();
                        int i4 = this.n;
                        if (jM > i4) {
                            this.n = i4 + 1;
                            this.j = aawzVar.a;
                            i("vtiwna", h(aawzVar, strD));
                            throw g(0L, yvsVarA, supplier, abmtVar.l(), abmtVar.ae());
                        }
                        i("kmwva", "sq." + aawzVar.a + ";start." + j3 + ";ad_id." + strD);
                    } else {
                        long j5 = aawzVar.a;
                        if (j5 != this.j) {
                            this.j = j5;
                            this.n++;
                            i("vtiwna", h(aawzVar, strD));
                            throw g(0L, yvsVarA, supplier, abmtVar.l(), abmtVar.ae());
                        }
                        this.j = -1L;
                        this.n = 0;
                        i("kmwva", "sq." + j5 + ";start." + j3 + ";ad_id." + strD);
                    }
                } else if (aawzVar.d) {
                    abmt abmtVar2 = this.o;
                    if (abmtVar2.R() && m(wjfVar)) {
                        long j6 = this.i;
                        if (j6 != -1 && j6 != aawzVar.a) {
                            this.m = 0;
                        }
                        long jM2 = abmtVar2.m();
                        int i5 = this.m;
                        if (jM2 > i5) {
                            this.m = i5 + 1;
                            this.i = aawzVar.a;
                            i("atiwna", h(aawzVar, strD));
                            throw g(0L, yvsVarA, supplier, abmtVar2.l(), abmtVar2.ae());
                        }
                        i("kmwva", "sq." + aawzVar.a + ";start." + j3 + ";ad_id." + strD);
                    } else {
                        long j7 = aawzVar.a;
                        if (j7 != this.i) {
                            this.i = j7;
                            this.m++;
                            i("atiwna", h(aawzVar, strD));
                            throw g(0L, yvsVarA, supplier, abmtVar2.l(), abmtVar2.ae());
                        }
                        i("kmwva", "sq." + j7 + ";start." + j3 + ";ad_id." + strD);
                        this.i = -1L;
                        this.m = 0;
                    }
                }
                k(aawzVar);
                return;
            }
            Set set2 = this.d;
            if (!set2.contains(strD)) {
                if ((zContains && m(wjfVar)) || (m(wjfVar) && !l(yvsVarA))) {
                    j();
                    k(aawzVar);
                    return;
                }
                set2.add(strD);
                set.add(strD);
                if (m(wjfVar)) {
                    abmt abmtVar3 = this.o;
                    if (abmtVar3.g.l(204, 45688270L, false)) {
                        millis = this.a;
                        if (abmtVar3.cb()) {
                            millis = Math.max(millis, (j - j2) - abmtVar3.l());
                        }
                    } else {
                        millis = ywu.a.toMillis();
                    }
                } else {
                    millis = ywu.a.toMillis();
                }
                i("iblt", Long.toString(millis));
                abmt abmtVar4 = this.o;
                ywu ywuVarG = g(millis, yvsVarA, supplier, abmtVar4.l(), abmtVar4.ae());
                this.c = ywuVarG;
                this.g = strD;
                throw ywuVarG;
            }
            if (set2.contains(strD) && strD.equals(this.g) && (ywuVar = this.c) != null && ywuVar.g()) {
                throw ywuVar;
            }
        }
        k(aawzVar);
    }

    public final synchronized void b(long j) {
        ywu ywuVar = this.c;
        if (ywuVar != null && ywuVar.g() && j > ywuVar.a() - this.o.l()) {
            i("raub", Long.toString(ywuVar.b()));
            ywuVar.f();
        }
    }

    public final synchronized void c() {
        String str;
        ywu ywuVar = this.c;
        if (ywuVar != null) {
            if (!ywuVar.g() && (str = this.g) != null && this.d.contains(str)) {
                i("pbltt", this.g);
                this.e.add(this.g);
            }
            j();
        }
    }

    public final synchronized boolean d() {
        ywu ywuVar = this.c;
        return ywuVar != null && ywuVar.g();
    }

    public final synchronized boolean e(String str) {
        return this.e.contains(str);
    }

    public final synchronized boolean f(long j) {
        boolean zH;
        String str;
        ywu ywuVar = this.c;
        zH = false;
        if (ywuVar != null) {
            acjb acjbVar = this.h;
            if (acjbVar == null || (str = this.g) == null || !acjbVar.Q(str)) {
                abmt abmtVar = this.o;
                zH = ywuVar.h(j, abmtVar.n() > 0 ? abmtVar.n() : 200L);
            } else {
                j();
            }
        }
        return zH;
    }
}
