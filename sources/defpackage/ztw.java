package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ztw {
    public final ztr a;
    public final zum b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    long l;
    long m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    private final zsu s;
    private final ztm t;
    private final List u;
    private final boolean v;

    public ztw(zsu zsuVar, ztm ztmVar, ztr ztrVar) {
        this.s = zsuVar;
        this.t = ztmVar;
        this.a = ztrVar;
        this.v = (zsuVar.m & 1048576) != 0;
        this.u = new ArrayList();
        this.b = new zum(ztrVar);
    }

    static final void e(zty ztyVar) {
        aihf aihfVar;
        aihf aihfVar2;
        zui zuiVar = ztyVar.d.j;
        boolean z = ztyVar.q;
        int i = ztyVar.j + 1;
        int i2 = ztyVar.t;
        int i3 = ztyVar.o;
        int i4 = ztyVar.s;
        if (i <= 1) {
            int iA = zui.a(i3, zui.b);
            while (true) {
                aihfVar = zuiVar.f;
                if (((akkq) aihfVar.instance).B.size() > iA) {
                    break;
                }
                aihfVar.copyOnWrite();
                akkq akkqVar = (akkq) aihfVar.instance;
                akkqVar.f();
                akkqVar.B.h(0);
            }
            int iD = ((akkq) aihfVar.instance).B.d(iA) + 1;
            aihfVar.copyOnWrite();
            akkq akkqVar2 = (akkq) aihfVar.instance;
            akkqVar2.f();
            akkqVar2.B.f(iA, iD);
            int iA2 = zui.a(i4, zui.d);
            while (((akkq) aihfVar.instance).C.size() <= iA2) {
                aihfVar.copyOnWrite();
                akkq akkqVar3 = (akkq) aihfVar.instance;
                akkqVar3.a();
                akkqVar3.C.h(0);
            }
            int iD2 = ((akkq) aihfVar.instance).C.d(iA2) + 1;
            aihfVar.copyOnWrite();
            akkq akkqVar4 = (akkq) aihfVar.instance;
            akkqVar4.a();
            akkqVar4.C.f(iA2, iD2);
            return;
        }
        int iA3 = zui.a(i, zui.a);
        while (true) {
            aihfVar2 = zuiVar.f;
            if (((akkq) aihfVar2.instance).x.size() > iA3) {
                break;
            }
            aihfVar2.copyOnWrite();
            akkq akkqVar5 = (akkq) aihfVar2.instance;
            akkqVar5.e();
            akkqVar5.x.h(0);
        }
        int iD3 = ((akkq) aihfVar2.instance).x.d(iA3) + 1;
        aihfVar2.copyOnWrite();
        akkq akkqVar6 = (akkq) aihfVar2.instance;
        akkqVar6.e();
        akkqVar6.x.f(iA3, iD3);
        int iA4 = zui.a(i2, zui.c);
        while (((akkq) aihfVar2.instance).z.size() <= iA4) {
            aihfVar2.copyOnWrite();
            akkq akkqVar7 = (akkq) aihfVar2.instance;
            akkqVar7.b();
            akkqVar7.z.h(0);
        }
        int iD4 = ((akkq) aihfVar2.instance).z.d(iA4) + 1;
        aihfVar2.copyOnWrite();
        akkq akkqVar8 = (akkq) aihfVar2.instance;
        akkqVar8.b();
        akkqVar8.z.f(iA4, iD4);
        int iA5 = zui.a(i3, zui.b);
        while (((akkq) aihfVar2.instance).y.size() <= iA5) {
            aihfVar2.copyOnWrite();
            akkq akkqVar9 = (akkq) aihfVar2.instance;
            akkqVar9.d();
            akkqVar9.y.h(0);
        }
        int iD5 = ((akkq) aihfVar2.instance).y.d(iA5) + 1;
        aihfVar2.copyOnWrite();
        akkq akkqVar10 = (akkq) aihfVar2.instance;
        akkqVar10.d();
        akkqVar10.y.f(iA5, iD5);
        int iA6 = zui.a(i4, zui.d);
        while (((akkq) aihfVar2.instance).A.size() <= iA6) {
            aihfVar2.copyOnWrite();
            akkq akkqVar11 = (akkq) aihfVar2.instance;
            akkqVar11.c();
            akkqVar11.A.h(0);
        }
        int iD6 = ((akkq) aihfVar2.instance).A.d(iA6) + 1;
        aihfVar2.copyOnWrite();
        akkq akkqVar12 = (akkq) aihfVar2.instance;
        akkqVar12.c();
        akkqVar12.A.f(iA6, iD6);
    }

    static final void f(zty ztyVar) {
        zui zuiVar = ztyVar.d.j;
        int i = ztyVar.v;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            aihf aihfVar = zuiVar.f;
            long j = ((akkq) aihfVar.instance).q + 1;
            aihfVar.copyOnWrite();
            akkq akkqVar = (akkq) aihfVar.instance;
            akkqVar.c |= SemanticState.Multiline;
            akkqVar.q = j;
            return;
        }
        if (i2 == 2) {
            aihf aihfVar2 = zuiVar.f;
            int i3 = ((akkq) aihfVar2.instance).t + 1;
            aihfVar2.copyOnWrite();
            akkq akkqVar2 = (akkq) aihfVar2.instance;
            akkqVar2.c |= 65536;
            akkqVar2.t = i3;
            return;
        }
        if (i2 == 3) {
            aihf aihfVar3 = zuiVar.f;
            int i4 = ((akkq) aihfVar3.instance).s + 1;
            aihfVar3.copyOnWrite();
            akkq akkqVar3 = (akkq) aihfVar3.instance;
            akkqVar3.c |= 32768;
            akkqVar3.s = i4;
            return;
        }
        if (i2 == 4) {
            aihf aihfVar4 = zuiVar.f;
            long j2 = ((akkq) aihfVar4.instance).r + 1;
            aihfVar4.copyOnWrite();
            akkq akkqVar4 = (akkq) aihfVar4.instance;
            akkqVar4.c |= 16384;
            akkqVar4.r = j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    final ztv a(int i, long j, long j2) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3;
        int i8;
        int i9;
        zsx zsxVarJ;
        zty ztyVar;
        zty ztyVarB;
        i = i;
        c();
        ztm ztmVar = this.t;
        zuj zujVar = ztmVar.f.O;
        int i10 = this.e;
        ztr ztrVar = this.a;
        int i11 = 0;
        this.q = i10 >= ztrVar.M;
        this.m = Long.MAX_VALUE;
        this.l = Long.MAX_VALUE;
        this.e = 0;
        this.d = 0;
        this.c = 0;
        this.h = 0;
        this.g = 0;
        this.f = 0;
        int i12 = i & 262144;
        this.o = i12 != 0;
        boolean z = ztmVar.g().size() >= ztrVar.K;
        this.p = z;
        boolean z2 = this.o;
        int i13 = i & SemanticState.Multiline;
        boolean z3 = i13 != 0;
        if (!z2) {
            this.r = ztrVar.o;
            if (z3) {
                this.i = ztrVar.F;
                this.j = ztrVar.G;
                i4 = ztrVar.H;
            } else if ((16777280 & i) == 16777216) {
                this.i = ztrVar.C;
                this.j = ztrVar.D;
                i4 = ztrVar.E;
            } else {
                if (z) {
                    i2 = ztrVar.I;
                } else {
                    i2 = ztrVar.z;
                }
                this.i = i2;
                if (z) {
                    i3 = ztrVar.J;
                } else {
                    i3 = ztrVar.A;
                }
                this.j = i3;
                if (this.q) {
                    i4 = ztrVar.L;
                } else {
                    i4 = ztrVar.B;
                }
            }
            this.k = i4;
        } else if (z3 && ztrVar.P) {
            z3 = true;
            this.r = ztrVar.o;
            if (z3) {
                this.i = ztrVar.F;
                this.j = ztrVar.G;
                i4 = ztrVar.H;
            } else if ((16777280 & i) == 16777216) {
                this.i = ztrVar.C;
                this.j = ztrVar.D;
                i4 = ztrVar.E;
            } else {
                if (z) {
                    i2 = ztrVar.I;
                } else {
                    i2 = ztrVar.z;
                }
                this.i = i2;
                if (z) {
                    i3 = ztrVar.J;
                } else {
                    i3 = ztrVar.A;
                }
                this.j = i3;
                if (this.q) {
                    i4 = ztrVar.L;
                } else {
                    i4 = ztrVar.B;
                }
            }
            this.k = i4;
        } else {
            this.r = ztrVar.p;
            int i14 = ztrVar.N;
            this.j = i14;
            this.i = i14;
            this.k = ztrVar.O;
        }
        this.n = (33554432 & i) == 0;
        long j4 = j - ((long) ztrVar.Z);
        List list = this.u;
        Iterator it = list.iterator();
        while (true) {
            i5 = i11;
            i6 = i12;
            if (!it.hasNext()) {
                break;
            }
            zty ztyVar2 = (zty) it.next();
            if (ztyVar2.a.h != 2) {
                boolean z4 = ztyVar2.n;
                it.remove();
            } else if (!ztyVar2.i()) {
                it.remove();
            } else if (ztyVar2.n) {
                if (ztyVar2.l - j4 > 0) {
                    g(ztyVar2);
                } else {
                    if (ztyVar2.i()) {
                        ztyVar2.k(j);
                        ztyVar2.u = 3;
                    }
                    aihf aihfVar = ztyVar2.d.j.f;
                    long j5 = ((akkq) aihfVar.instance).Y + 1;
                    aihfVar.copyOnWrite();
                    akkq akkqVar = (akkq) aihfVar.instance;
                    akkqVar.d |= SemanticState.ReadOnly;
                    akkqVar.Y = j5;
                    it.remove();
                }
            }
            i11 = i5;
            i12 = i6;
        }
        char c = 1;
        int i15 = 4;
        if (this.n) {
            zua zuaVar = ztmVar.e;
            for (zuo zuoVar : ztmVar.h()) {
                zuoVar.Z();
                int iY = aguu.y(new ztx(zuoVar, i15));
                zuoVar.Y();
                int iB = (int) zuoVar.b(zuoVar.Z, zuoVar.j);
                zuoVar.W(iB);
                int i16 = iB == 0 ? i5 : (iB + zuoVar.ab) - 1;
                while (i16 != 0) {
                    zuoVar.ad(i16);
                    int iC = (int) zuoVar.c((i16 << 3) + 39, 8);
                    zuoVar.af(i16, iC);
                    zsz zszVarA = zuaVar.a(iC);
                    zua zuaVar2 = zuaVar;
                    zuoVar = zuoVar;
                    int i17 = i16;
                    list = list;
                    i13 = i13;
                    while (true) {
                        int i18 = iY;
                        iY = i18;
                        if (!d(zuoVar, i17, j2, i18, zszVarA)) {
                            break;
                        }
                        iY++;
                    }
                    int iB2 = (int) zuoVar.b(i17, 2555904);
                    zuoVar.W(iB2);
                    i16 = iB2 == 0 ? i5 : (iB2 + zuoVar.ab) - 1;
                    zuaVar = zuaVar2;
                }
                i15 = 4;
            }
        }
        int i19 = i13;
        List list2 = list;
        long j6 = j2 - ((long) ztrVar.S);
        int i20 = (i & 16384) != 0 ? 1 : i5;
        int i21 = (i20 == 0 || !ztrVar.u) ? i5 : 1;
        int i22 = ((i & 32768) == 0 || !ztrVar.v) ? i5 : 1;
        int i23 = (i19 == 0 && ztrVar.q) ? 1 : i5;
        int i24 = (i20 == 0 || !ztrVar.r) ? i5 : 1;
        for (zuo zuoVar2 : ztmVar.h()) {
            long j7 = j6;
            boolean z5 = zuoVar2.W;
            int i25 = zud.h;
            zuoVar2.Z();
            ztx ztxVar = new ztx(zuoVar2, i25);
            while (ztxVar.hasNext()) {
                z5 = z5;
                int iNextInt = ztxVar.nextInt();
                int i26 = zuoVar2.o;
                ztxVar = ztxVar;
                i24 = i24;
                long j8 = zuoVar2.f;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ztyVar = null;
                        break;
                    }
                    ztyVar = (zty) it2.next();
                    if (ztyVar.a == zuoVar2 && ztyVar.b == iNextInt) {
                        break;
                    }
                }
                if (ztyVar == null) {
                    if (this.v) {
                        try {
                            ztyVarB = b(zuoVar2, iNextInt);
                        } catch (RuntimeException e) {
                            if (zti.a) {
                                throw e;
                            }
                            String str = ztf.K;
                            Locale locale = Locale.US;
                            Integer numValueOf = Integer.valueOf(iNextInt);
                            i21 = i21;
                            i23 = i23;
                            Long lValueOf = Long.valueOf(zuoVar2.P);
                            Object[] objArr = new Object[2];
                            objArr[i5] = numValueOf;
                            objArr[c] = lValueOf;
                            twu.d(str, 6, String.format(locale, "Failed to add tracked request for dispatch %d in page %d", objArr), e);
                        }
                    } else {
                        ztyVarB = b(zuoVar2, iNextInt);
                    }
                    ztyVar = ztyVarB;
                    ztyVar.e("new");
                } else {
                    i21 = i21;
                    i23 = i23;
                    ztyVar.e("existing");
                }
                if (!ztyVar.n && !ztyVar.m) {
                    if (!z5 || ztyVar.i < j7) {
                        ztyVar.e("setStale");
                        ztyVar.m = c;
                        if (ztyVar.i()) {
                            zud zudVar = ztyVar.c;
                            int i27 = ztyVar.b;
                            zudVar.l(i27);
                            zudVar.k(i27);
                            zudVar.i();
                            long j9 = zudVar.i.f + ((long) i27) + 12;
                            Memory.pokeByte(j9, (byte) ((Memory.peekByte(j9) & (-129)) | SemanticState.Focused));
                        }
                        ztyVar.e("stale");
                    } else {
                        i21 = i21;
                        i23 = i23;
                    }
                }
                i21 = i21;
                i23 = i23;
                c = 1;
            }
            j6 = j7;
            c = 1;
        }
        int i28 = i24;
        int i29 = i21;
        int i30 = i23;
        Throwable th = null;
        Iterator it3 = this.u.iterator();
        while (it3.hasNext()) {
            zty ztyVar3 = (zty) it3.next();
            ztyVar3.e("pass2");
            if (ztyVar3.a.h != 2 || ztyVar3.n) {
                i5 = 0;
                th = null;
            } else if (this.n) {
                int i31 = ztyVar3.h;
                int i32 = ztyVar3.j;
                if (i32 > 0) {
                    ztr ztrVar2 = this.a;
                    if (i32 > ztrVar2.Y.a(i31)) {
                        e(ztyVar3);
                        zui zuiVar = ztyVar3.d.j;
                        ztyVar3.j(new zsy(new ztg(zuiVar, 7), new jmj(zuiVar, 11)));
                    } else {
                        if (this.h >= this.k) {
                            if (i28 == 0 || i31 > 0) {
                                h(ztyVar3);
                            } else {
                                i31 = i5;
                            }
                        }
                        long j10 = ztyVar3.k;
                        if (j10 == 0) {
                            i8 = 3;
                        } else if (ztyVar3.b() < j) {
                            i8 = 5;
                        } else if (i29 != 0) {
                            i8 = 2;
                        } else {
                            if (i22 != 0) {
                                j3 = 1000;
                                if (j10 + (((long) ztrVar2.x.a(i31)) * 1000) < j) {
                                    i8 = 4;
                                    ztyVar3.e("retry");
                                }
                            }
                            h(ztyVar3);
                        }
                        j3 = 1000;
                        ztyVar3.e("retry");
                    }
                } else {
                    j3 = 1000;
                    i8 = 1;
                }
                if (ztyVar3.m && this.g >= this.j) {
                    h(ztyVar3);
                } else if (this.f + this.g < this.i || (i30 != 0 && i31 <= 0)) {
                    ztyVar3.r = i;
                    ztyVar3.s = this.b.c;
                    ztyVar3.v = i8;
                    ztyVar3.e("send");
                    boolean z6 = ztyVar3.n;
                    zsz zszVar = ztyVar3.d;
                    zui zuiVar2 = zszVar.j;
                    if (ztyVar3.j > 0) {
                        aihf aihfVar2 = zuiVar2.f;
                        long j11 = ((akkq) aihfVar2.instance).l + 1;
                        aihfVar2.copyOnWrite();
                        akkq akkqVar2 = (akkq) aihfVar2.instance;
                        akkqVar2.c |= 32;
                        akkqVar2.l = j11;
                        int i33 = ztyVar3.v;
                        int i34 = i33 - 1;
                        if (i33 == 0) {
                            throw th;
                        }
                        if (i34 == 1) {
                            long j12 = akkqVar2.n + 1;
                            aihfVar2.copyOnWrite();
                            akkq akkqVar3 = (akkq) aihfVar2.instance;
                            akkqVar3.c |= SemanticState.ReadOnly;
                            akkqVar3.n = j12;
                        } else if (i34 == 2) {
                            int i35 = akkqVar2.p + 1;
                            aihfVar2.copyOnWrite();
                            akkq akkqVar4 = (akkq) aihfVar2.instance;
                            akkqVar4.c |= SemanticState.Obscured;
                            akkqVar4.p = i35;
                        } else if (i34 == 3) {
                            int i36 = akkqVar2.o + 1;
                            aihfVar2.copyOnWrite();
                            akkq akkqVar5 = (akkq) aihfVar2.instance;
                            akkqVar5.c |= SemanticState.Modal;
                            akkqVar5.o = i36;
                        } else if (i34 == 4) {
                            long j13 = akkqVar2.m + 1;
                            aihfVar2.copyOnWrite();
                            akkq akkqVar6 = (akkq) aihfVar2.instance;
                            akkqVar6.c |= SemanticState.LiveRegion;
                            akkqVar6.m = j13;
                        }
                    }
                    aihf aihfVar3 = zuiVar2.f;
                    long j14 = ((akkq) aihfVar3.instance).aa + 1;
                    aihfVar3.copyOnWrite();
                    akkq akkqVar7 = (akkq) aihfVar3.instance;
                    akkqVar7.d |= SemanticState.Multiline;
                    akkqVar7.aa = j14;
                    zus zusVar = this.t.d;
                    long jZ = zusVar.z();
                    if (ztyVar3.i()) {
                        i9 = i22;
                        ztyVar3.t = ztyVar3.j > 0 ? Math.max(i5, (int) ((j - ztyVar3.k) / j3)) : 0;
                        ztyVar3.l = j;
                        ztyVar3.h(j);
                        zsxVarJ = zszVar.j(ztyVar3);
                        if (zsxVarJ.a == zsw.c) {
                            ztyVar3.f(true);
                        }
                    } else {
                        i9 = i22;
                        zsxVarJ = new zsx(zsw.e, th);
                    }
                    zsw zswVar = zsxVarJ.a;
                    if (zswVar == zsw.e) {
                        it3 = it3;
                        i19 = i19;
                    } else {
                        if ((i & 16) == 0) {
                            long j15 = ((akkq) aihfVar3.instance).ab + 1;
                            aihfVar3.copyOnWrite();
                            akkq akkqVar8 = (akkq) aihfVar3.instance;
                            akkqVar8.d |= 16384;
                            akkqVar8.ab = j15;
                            long jX = ((akkq) aihfVar3.instance).ad + zusVar.x(jZ);
                            aihfVar3.copyOnWrite();
                            akkq akkqVar9 = (akkq) aihfVar3.instance;
                            akkqVar9.d |= 65536;
                            akkqVar9.ad = jX;
                        }
                        if (zswVar == zsw.b) {
                            e(ztyVar3);
                            ztyVar3.j(zsxVarJ.b);
                        } else {
                            if (zswVar == zsw.a) {
                                f(ztyVar3);
                                ztyVar3.k(j);
                            } else {
                                long j16 = ((akkq) aihfVar3.instance).h + 1;
                                aihfVar3.copyOnWrite();
                                akkq akkqVar10 = (akkq) aihfVar3.instance;
                                akkqVar10.c |= 2;
                                akkqVar10.h = j16;
                                long j17 = akkqVar10.ac + 1;
                                aihfVar3.copyOnWrite();
                                akkq akkqVar11 = (akkq) aihfVar3.instance;
                                akkqVar11.d |= 32768;
                                akkqVar11.ac = j17;
                                if (zswVar == zsw.d) {
                                    ztyVar3.j(new zsy(new ztg(zuiVar2, 3), new jmj(zuiVar2, 10)));
                                } else {
                                    boolean z7 = ztyVar3.n;
                                    g(ztyVar3);
                                }
                            }
                            i19 = i19;
                            it3 = it3;
                            i22 = i9;
                            i5 = 0;
                            th = null;
                        }
                    }
                    h(ztyVar3);
                    i19 = i19;
                    it3 = it3;
                    i22 = i9;
                    i5 = 0;
                    th = null;
                } else {
                    h(ztyVar3);
                }
            } else {
                h(ztyVar3);
            }
        }
        int i37 = i19;
        int i38 = this.f + this.g;
        aihf aihfVar4 = zujVar.b;
        long j18 = i38;
        if (j18 > ((akkr) aihfVar4.instance).aB) {
            aihfVar4.copyOnWrite();
            akkr akkrVar = (akkr) aihfVar4.instance;
            akkrVar.d |= 16384;
            akkrVar.aB = j18;
        }
        if (this.n) {
            int i39 = this.f;
            int i40 = this.g;
            int i41 = this.h;
            int i42 = this.c;
            int i43 = this.d;
            int i44 = this.e;
            if (i6 != 0) {
                int[] iArr = zuj.a;
                int iA = zuj.a(i39, iArr);
                while (((akkr) aihfVar4.instance).aI.size() <= iA) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar2 = (akkr) aihfVar4.instance;
                    akkrVar2.a();
                    akkrVar2.aI.h(0);
                }
                int iD = ((akkr) aihfVar4.instance).aI.d(iA) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar3 = (akkr) aihfVar4.instance;
                akkrVar3.a();
                akkrVar3.aI.f(iA, iD);
                int iA2 = zuj.a(i40, iArr);
                while (((akkr) aihfVar4.instance).aJ.size() <= iA2) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar4 = (akkr) aihfVar4.instance;
                    akkrVar4.m();
                    akkrVar4.aJ.h(0);
                }
                int iD2 = ((akkr) aihfVar4.instance).aJ.d(iA2) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar5 = (akkr) aihfVar4.instance;
                akkrVar5.m();
                akkrVar5.aJ.f(iA2, iD2);
                int iA3 = zuj.a(i41, iArr);
                while (((akkr) aihfVar4.instance).aK.size() <= iA3) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar6 = (akkr) aihfVar4.instance;
                    akkrVar6.g();
                    akkrVar6.aK.h(0);
                }
                int iD3 = ((akkr) aihfVar4.instance).aK.d(iA3) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar7 = (akkr) aihfVar4.instance;
                akkrVar7.g();
                akkrVar7.aK.f(iA3, iD3);
                int iA4 = zuj.a(i42, iArr);
                while (((akkr) aihfVar4.instance).aL.size() <= iA4) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar8 = (akkr) aihfVar4.instance;
                    akkrVar8.d();
                    akkrVar8.aL.h(0);
                }
                int iD4 = ((akkr) aihfVar4.instance).aL.d(iA4) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar9 = (akkr) aihfVar4.instance;
                akkrVar9.d();
                akkrVar9.aL.f(iA4, iD4);
                int iA5 = zuj.a(i43, iArr);
                while (((akkr) aihfVar4.instance).aM.size() <= iA5) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar10 = (akkr) aihfVar4.instance;
                    akkrVar10.p();
                    akkrVar10.aM.h(0);
                }
                int iD5 = ((akkr) aihfVar4.instance).aM.d(iA5) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar11 = (akkr) aihfVar4.instance;
                akkrVar11.p();
                akkrVar11.aM.f(iA5, iD5);
                int iA6 = zuj.a(i44, iArr);
                while (((akkr) aihfVar4.instance).aN.size() <= iA6) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar12 = (akkr) aihfVar4.instance;
                    akkrVar12.j();
                    akkrVar12.aN.h(0);
                }
                int iD6 = ((akkr) aihfVar4.instance).aN.d(iA6) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar13 = (akkr) aihfVar4.instance;
                akkrVar13.j();
                akkrVar13.aN.f(iA6, iD6);
            } else if (i37 != 0) {
                int[] iArr2 = zuj.a;
                int iA7 = zuj.a(i39, iArr2);
                while (((akkr) aihfVar4.instance).aO.size() <= iA7) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar14 = (akkr) aihfVar4.instance;
                    akkrVar14.b();
                    akkrVar14.aO.h(0);
                }
                int iD7 = ((akkr) aihfVar4.instance).aO.d(iA7) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar15 = (akkr) aihfVar4.instance;
                akkrVar15.b();
                akkrVar15.aO.f(iA7, iD7);
                int iA8 = zuj.a(i40, iArr2);
                while (((akkr) aihfVar4.instance).aP.size() <= iA8) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar16 = (akkr) aihfVar4.instance;
                    akkrVar16.n();
                    akkrVar16.aP.h(0);
                }
                int iD8 = ((akkr) aihfVar4.instance).aP.d(iA8) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar17 = (akkr) aihfVar4.instance;
                akkrVar17.n();
                akkrVar17.aP.f(iA8, iD8);
                int iA9 = zuj.a(i41, iArr2);
                while (((akkr) aihfVar4.instance).aQ.size() <= iA9) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar18 = (akkr) aihfVar4.instance;
                    akkrVar18.h();
                    akkrVar18.aQ.h(0);
                }
                int iD9 = ((akkr) aihfVar4.instance).aQ.d(iA9) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar19 = (akkr) aihfVar4.instance;
                akkrVar19.h();
                akkrVar19.aQ.f(iA9, iD9);
                int iA10 = zuj.a(i42, iArr2);
                while (((akkr) aihfVar4.instance).aR.size() <= iA10) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar20 = (akkr) aihfVar4.instance;
                    akkrVar20.e();
                    akkrVar20.aR.h(0);
                }
                int iD10 = ((akkr) aihfVar4.instance).aR.d(iA10) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar21 = (akkr) aihfVar4.instance;
                akkrVar21.e();
                akkrVar21.aR.f(iA10, iD10);
                int iA11 = zuj.a(i43, iArr2);
                while (((akkr) aihfVar4.instance).aS.size() <= iA11) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar22 = (akkr) aihfVar4.instance;
                    akkrVar22.q();
                    akkrVar22.aS.h(0);
                }
                int iD11 = ((akkr) aihfVar4.instance).aS.d(iA11) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar23 = (akkr) aihfVar4.instance;
                akkrVar23.q();
                akkrVar23.aS.f(iA11, iD11);
                int iA12 = zuj.a(i44, iArr2);
                while (((akkr) aihfVar4.instance).aT.size() <= iA12) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar24 = (akkr) aihfVar4.instance;
                    akkrVar24.k();
                    akkrVar24.aT.h(0);
                }
                int iD12 = ((akkr) aihfVar4.instance).aT.d(iA12) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar25 = (akkr) aihfVar4.instance;
                akkrVar25.k();
                akkrVar25.aT.f(iA12, iD12);
            } else {
                int[] iArr3 = zuj.a;
                int iA13 = zuj.a(i39, iArr3);
                while (((akkr) aihfVar4.instance).aC.size() <= iA13) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar26 = (akkr) aihfVar4.instance;
                    akkrVar26.c();
                    akkrVar26.aC.h(0);
                }
                int iD13 = ((akkr) aihfVar4.instance).aC.d(iA13) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar27 = (akkr) aihfVar4.instance;
                akkrVar27.c();
                akkrVar27.aC.f(iA13, iD13);
                int iA14 = zuj.a(i40, iArr3);
                while (((akkr) aihfVar4.instance).aD.size() <= iA14) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar28 = (akkr) aihfVar4.instance;
                    akkrVar28.o();
                    akkrVar28.aD.h(0);
                }
                int iD14 = ((akkr) aihfVar4.instance).aD.d(iA14) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar29 = (akkr) aihfVar4.instance;
                akkrVar29.o();
                akkrVar29.aD.f(iA14, iD14);
                int iA15 = zuj.a(i41, iArr3);
                while (((akkr) aihfVar4.instance).aE.size() <= iA15) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar30 = (akkr) aihfVar4.instance;
                    akkrVar30.i();
                    akkrVar30.aE.h(0);
                }
                int iD15 = ((akkr) aihfVar4.instance).aE.d(iA15) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar31 = (akkr) aihfVar4.instance;
                akkrVar31.i();
                akkrVar31.aE.f(iA15, iD15);
                int iA16 = zuj.a(i42, iArr3);
                while (((akkr) aihfVar4.instance).aF.size() <= iA16) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar32 = (akkr) aihfVar4.instance;
                    akkrVar32.f();
                    akkrVar32.aF.h(0);
                }
                int iD16 = ((akkr) aihfVar4.instance).aF.d(iA16) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar33 = (akkr) aihfVar4.instance;
                akkrVar33.f();
                akkrVar33.aF.f(iA16, iD16);
                int iA17 = zuj.a(i43, iArr3);
                while (((akkr) aihfVar4.instance).aG.size() <= iA17) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar34 = (akkr) aihfVar4.instance;
                    akkrVar34.r();
                    akkrVar34.aG.h(0);
                }
                int iD17 = ((akkr) aihfVar4.instance).aG.d(iA17) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar35 = (akkr) aihfVar4.instance;
                akkrVar35.r();
                akkrVar35.aG.f(iA17, iD17);
                int iA18 = zuj.a(i44, iArr3);
                while (((akkr) aihfVar4.instance).aH.size() <= iA18) {
                    aihfVar4.copyOnWrite();
                    akkr akkrVar36 = (akkr) aihfVar4.instance;
                    akkrVar36.l();
                    akkrVar36.aH.h(0);
                }
                i7 = 0;
                int iD18 = ((akkr) aihfVar4.instance).aH.d(iA18) + 1;
                aihfVar4.copyOnWrite();
                akkr akkrVar37 = (akkr) aihfVar4.instance;
                akkrVar37.l();
                akkrVar37.aH.f(iA18, iD18);
            }
            i7 = 0;
        } else {
            i7 = 0;
        }
        long j19 = this.m;
        long jMax = j19 == Long.MAX_VALUE ? Long.MAX_VALUE : Math.max(0L, j19 - j);
        ztm ztmVar2 = this.t;
        zvb zvbVar = ztmVar2.c;
        zuo zuoVarD = ztmVar2.d();
        long jMin = ztmVar2.g().size() > 1 ? j2 + ((long) this.a.aj) : Long.MAX_VALUE;
        zuoVarD.Y();
        int iB3 = (int) zuoVarD.b(zuoVarD.Z, zuoVarD.j);
        zuoVarD.W(iB3);
        int i45 = iB3 == 0 ? i7 : (iB3 + zuoVarD.ab) - 1;
        while (i45 != 0) {
            for (int i46 = i7; i46 < 4; i46++) {
                zuoVarD.ad(i45);
                zuoVarD.ac(i46);
                int iT = zuoVarD.T(zuoVarD.ac + i45 + (zuoVarD.ae * i46));
                if (iT != 0) {
                    long jB = zvbVar.b(i46);
                    long j20 = zuoVarD.G;
                    int i47 = zuoVarD.r;
                    jMin = Math.min(jMin, j20 + zuoVarD.c((iT << 3) + ((char) i47), i47 >>> 16) + jB);
                }
            }
            int iB4 = (int) zuoVarD.b(i45, 2555904);
            zuoVarD.W(iB4);
            i45 = iB4 == 0 ? 0 : (iB4 + zuoVarD.ab) - 1;
            i7 = 0;
        }
        long jMax2 = jMin == Long.MAX_VALUE ? Long.MAX_VALUE : Math.max(0L, jMin - j2);
        long j21 = this.l;
        ztr ztrVar3 = this.a;
        return new ztv(this.n, this.i, this.j, this.k, this.c, this.d, this.e, this.f, this.g, this.h, this.p, this.q, j21 == Long.MAX_VALUE ? Long.MAX_VALUE : Math.max(ztrVar3.af, (j21 + ((long) ztrVar3.Z)) - j), jMax, jMax2);
    }

    final zty b(zuo zuoVar, int i) {
        zty ztyVar = new zty(this.s, zuoVar, i);
        this.u.add(ztyVar);
        return ztyVar;
    }

    public final void c() {
        if (zti.a && !this.t.d.E()) {
            throw ugi.e("!locked");
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:135:0x05de  */
    final boolean d(zuo zuoVar, int i, long j, int i2, zsz zszVar) {
        int i3;
        boolean z;
        long j2;
        ztr ztrVar;
        int i4;
        long jMax;
        int i5;
        boolean z2;
        int i6;
        aihf aihfVar;
        int i7;
        int i8;
        int i9;
        zvb zvbVar;
        int iC;
        ztm ztmVar = this.t;
        zvb zvbVar2 = ztmVar.c;
        int iA = zuoVar.A();
        zui zuiVar = zszVar.j;
        ztr ztrVar2 = this.a;
        if (iA >= ztrVar2.T) {
            boolean z3 = zuoVar.W;
            zuoVar.Z();
            zuoVar.X(i);
            zue zueVar = new zue(zuoVar, i, 2);
            long j3 = j - ztrVar2.aa;
            while (true) {
                if (zueVar.d != 0) {
                    if (z3) {
                        i3 = zueVar.c;
                    } else {
                        zuoVar.Y();
                        i3 = zuoVar.ad - 1;
                    }
                    z = z3;
                    if (i2 >= this.r && i3 > 0) {
                        String str = ztf.K;
                    } else if (z && !this.o) {
                        j2 = j3;
                        long jB = j - ((long) zvbVar2.b(i3));
                        zuo zuoVar2 = zueVar.a;
                        int i10 = zueVar.d << 3;
                        long j4 = zuoVar2.G;
                        int i11 = zuoVar2.r;
                        if ((j4 + zuoVar2.c(i10 + ((char) i11), i11 >>> 16)) - jB <= 0) {
                            break;
                        }
                        zueVar.d = zueVar.a(0);
                        z3 = z;
                        j3 = j2;
                    } else {
                        j2 = j3;
                        break;
                    }
                } else {
                    String str2 = ztf.K;
                }
            }
            aihf aihfVar2 = zuiVar.f;
            long j5 = ((akkq) aihfVar2.instance).aB + 1;
            aihfVar2.copyOnWrite();
            akkq akkqVar = (akkq) aihfVar2.instance;
            akkqVar.e |= SemanticState.ReadOnly;
            akkqVar.aB = j5;
            int iMax = Math.max(ztrVar2.W, 1);
            ahbo ahboVar = ztrVar2.V;
            ahbo ahboVar2 = ztrVar2.U;
            int iA2 = ahboVar.a(i3);
            int i12 = 1;
            int iMin = Math.min(zszVar.l(), ahboVar2.a(i3));
            int[] iArr = new int[iMin];
            int i13 = -1;
            long jMax2 = 0;
            long jMin = Long.MAX_VALUE;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = i3;
            int i19 = iA2;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (zueVar.d != 0) {
                    if (z) {
                        i8 = zueVar.c;
                    } else {
                        zuoVar.Y();
                        i8 = zuoVar.ad - 1;
                    }
                    if (i8 != i13) {
                        if (i15 != 0 && z) {
                            zuo zuoVar3 = zueVar.a;
                            long j6 = zuoVar3.G;
                            int i22 = zuoVar3.r;
                            jMax2 = Math.max(jMax2, j6 + zuoVar3.c((i15 << 3) + ((char) i22), i22 >>> 16) + ((long) i20));
                        }
                        int iMin2 = Math.min(i19, ahboVar.a(i8));
                        iMin = Math.min(iMin, ahboVar2.a(i8));
                        i19 = iMin2;
                        i13 = i8;
                        i20 = zvbVar2.b[i8];
                        i15 = 0;
                        i16 = 0;
                    } else {
                        iMax = iMax;
                        ztrVar2 = ztrVar2;
                    }
                    if (i14 >= iMin) {
                        jMax = jMax2;
                        i4 = i17;
                        jMin = jMin;
                        ztrVar = ztrVar2;
                        break;
                    }
                    int iNextInt = zueVar.nextInt();
                    long j7 = iNextInt;
                    i13 = i13;
                    zuo zuoVar4 = zueVar.a;
                    int i23 = iNextInt << 3;
                    jMax2 = jMax2;
                    long j8 = zuoVar4.G;
                    int i24 = zuoVar4.r;
                    if (j8 + zuoVar4.c(i23 + ((char) i24), i24 >>> 16) < j2) {
                        int i25 = zueVar.b;
                        int i26 = zuoVar4.o;
                        int i27 = i26 & 7;
                        i9 = iMin;
                        zvbVar = zvbVar2;
                        long j9 = zuoVar4.f + j7;
                        int i28 = i26 >>> 16;
                        long j10 = j9 + ((long) ((i26 >> 3) & 8191));
                        int i29 = (i12 << i28) - 1;
                        if ((((Memory.peekByte(j10) & 255) >>> i27) & i29) != 0) {
                            Memory.pokeByte(j10, (byte) (Memory.peekByte(j10) & (~(i29 << i27))));
                            zuoVar4.ai.e(iNextInt, zuoVar4.ah);
                            zuoVar4.af(0, i25);
                            if (i25 != 255) {
                                int[] iArr2 = zuoVar4.Q;
                                iArr2[i25] = iArr2[i25] - 1;
                            }
                        }
                        long j11 = ((akkq) aihfVar2.instance).aG + 1;
                        aihfVar2.copyOnWrite();
                        akkq akkqVar2 = (akkq) aihfVar2.instance;
                        akkqVar2.e |= 32768;
                        akkqVar2.aG = j11;
                    } else {
                        i9 = iMin;
                        zvbVar = zvbVar2;
                        txf txfVar = zuoVar4.ai;
                        double d = zuoVar4.X;
                        int i30 = zuoVar4.ah;
                        txl txlVar = txfVar.c;
                        int i31 = txlVar.q;
                        if (((int) txlVar.c(i23 + ((char) i31), i31 >>> 16)) != i30) {
                            int i32 = txlVar.q;
                            iC = ((int) txlVar.c(i23 + ((char) i32), i32 >>> 16)) - i30;
                        } else if (txlVar.a != null) {
                            iC = (int) txfVar.b(iNextInt).length();
                        } else {
                            aigj aigjVar = (aigj) txfVar.a().get(iNextInt);
                            iC = aigjVar != null ? aigjVar.d() : 0;
                        }
                        int i33 = txfVar.a;
                        if ((((i12 << (i33 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + j7) + ((long) ((i33 >> 3) & 8191))) & 255) >>> (i33 & 7))) == i12) {
                            iC = (int) (d * ((double) iC));
                        }
                        if (iC == 0) {
                            int i34 = zueVar.b;
                            int i35 = zuoVar4.o;
                            int i36 = i35 & 7;
                            long j12 = zuoVar4.f + j7 + ((long) ((i35 >> 3) & 8191));
                            int i37 = (1 << (i35 >>> 16)) - 1;
                            if ((i37 & ((Memory.peekByte(j12) & 255) >>> i36)) != 0) {
                                Memory.pokeByte(j12, (byte) (Memory.peekByte(j12) & (~(i37 << i36))));
                                zuoVar4.ai.e(iNextInt, zuoVar4.ah);
                                zuoVar4.af(0, i34);
                                if (i34 != 255) {
                                    int[] iArr3 = zuoVar4.Q;
                                    iArr3[i34] = iArr3[i34] - 1;
                                }
                            }
                            long j13 = ((akkq) aihfVar2.instance).aH + 1;
                            aihfVar2.copyOnWrite();
                            akkq akkqVar3 = (akkq) aihfVar2.instance;
                            akkqVar3.e |= 65536;
                            akkqVar3.aH = j13;
                        } else {
                            int i38 = i21 + iC;
                            int i39 = iMax;
                            if (i14 < i39 || i38 <= i19) {
                                int i40 = i17;
                                ztr ztrVar3 = ztrVar2;
                                int i41 = i14 + 1;
                                iArr[i14] = iNextInt;
                                if (i16 == 0) {
                                    if (z) {
                                        long j14 = zuoVar4.G;
                                        int i42 = zuoVar4.r;
                                        jMin = Math.min(jMin, j14 + zuoVar4.c(i23 + ((char) i42), i42 >>> 16) + ((long) i20));
                                    }
                                    i16 = iNextInt;
                                } else {
                                    i41 = i41;
                                }
                                i17 = i40;
                                i14 = i41;
                                i12 = 1;
                                iMax = i39;
                                i21 = i38;
                                zvbVar2 = zvbVar;
                                i15 = iNextInt;
                                ztrVar2 = ztrVar3;
                                iMin = i9;
                            } else {
                                i21 = i38 - iC;
                                int i43 = i17 + 1;
                                ztrVar = ztrVar2;
                                if (i17 < ztrVar.X) {
                                    i17 = i43;
                                    ztrVar2 = ztrVar;
                                    iMax = i39;
                                    zvbVar2 = zvbVar;
                                    iMin = i9;
                                    i12 = 1;
                                } else {
                                    i4 = i43;
                                }
                            }
                        }
                    }
                    ztrVar2 = ztrVar2;
                    iMax = iMax;
                    zvbVar2 = zvbVar;
                    iMin = i9;
                    i12 = 1;
                } else {
                    jMax2 = jMax2;
                    ztrVar = ztrVar2;
                    i4 = i17;
                }
                jMax = jMax2;
                break;
            }
            if (i14 != 0) {
                if (i15 != 0 && z) {
                    zuo zuoVar5 = zueVar.a;
                    long j15 = zuoVar5.G;
                    int i44 = zuoVar5.r;
                    jMax = Math.max(jMax, j15 + zuoVar5.c((i15 << 3) + ((char) i44), i44 >>> 16) + ((long) i20));
                }
                int i45 = (!z || jMax < j - ((long) ztrVar.S)) ? 1 : 0;
                zuoVar.Y();
                zuoVar.Z();
                zud zudVar = zuoVar.aj;
                zudVar.j();
                zuo zuoVar6 = zudVar.i;
                zuoVar6.ad(i);
                zuoVar6.af(i, (int) zuoVar6.c((i << 3) + 39, 8));
                int i46 = zszVar.i;
                zuoVar6.ad(i);
                int i47 = i45;
                aigj aigjVarJd = zszVar.jd(new zsv((zuoVar6.R && i == zuoVar6.V) ? zuoVar6.S : zuoVar6.f(zuoVar6.ag + i, 0, StandardCharsets.UTF_8)));
                zub zubVar = zudVar.j;
                int iIntValue = ((Integer) zudVar.k.get()).intValue();
                zud zudVar2 = zubVar.f;
                zudVar2.j();
                zubVar.e = i14;
                zuo zuoVar7 = zudVar2.i;
                long j16 = jMax;
                int iR = zuoVar7.R(null, iArr, i14);
                zubVar.c = iR;
                int[] iArr4 = new int[iR];
                zuoVar7.R(iArr4, iArr, i14);
                long j17 = jMin;
                int i48 = zuoVar7.l;
                byte[] bArr = new byte[MemoryMappedBuffer.u(null, i48, iArr4, iR)];
                MemoryMappedBuffer.u(bArr, i48, iArr4, iR);
                aigj aigjVarZ = aigj.z(bArr);
                if (aigjVarJd != null) {
                    zubVar.d = aigjVarJd.d();
                    aigjVarZ = aigjVarZ.t(aigjVarJd);
                } else {
                    zubVar.d = 0;
                }
                txf txfVar2 = zubVar.b;
                txfVar2.d(aigjVarZ, iIntValue);
                int i49 = zud.g;
                int i50 = i49 + txfVar2.b;
                boolean z4 = zuoVar6.m;
                if (z4) {
                    i5 = 2;
                    if (zuoVar6.h != 2) {
                        throw new IllegalStateException("mmcb !loaded");
                    }
                } else {
                    i5 = 2;
                }
                long jMin2 = Math.min(j, zuoVar6.H);
                if (z4 && zuoVar6.h != i5) {
                    throw new IllegalStateException("mmcb !loaded");
                }
                int iB = zuoVar6.B(i50, Math.max(jMin2, zuoVar6.G), i49, 0);
                if (iB <= 0) {
                    zubVar.b();
                    aihfVar = aihfVar2;
                    z2 = true;
                } else {
                    int i51 = zuoVar6.o;
                    int i52 = i14;
                    long j18 = iB;
                    int i53 = (i51 >> 3) & 8191;
                    int i54 = i51 >>> 16;
                    int i55 = i51 & 7;
                    int i56 = (1 << i54) - 1;
                    long j19 = zuoVar6.f + j18 + ((long) i53);
                    Memory.pokeByte(j19, (byte) ((Memory.peekByte(j19) & (~(i56 << i55))) | ((i56 & 1) << i55)));
                    long j20 = zuoVar6.f + j18 + 13;
                    Memory.pokeByte(j20, (byte) ((Memory.peekByte(j20) & (-64)) | (i18 & 63)));
                    int i57 = zud.b;
                    zuoVar6.aa(i);
                    if (i == 0) {
                        i6 = 0;
                        z2 = true;
                    } else {
                        z2 = true;
                        i6 = (i - zuoVar6.ab) + 1;
                    }
                    int i58 = iB << 3;
                    char c = (char) i57;
                    int i59 = i57 >>> 16;
                    int i60 = c + i58;
                    zuoVar6.w(i60, i59, i6);
                    zudVar.k(iB);
                    zudVar.i();
                    long j21 = zuoVar6.f + j18 + 12;
                    Memory.pokeByte(j21, (byte) ((Memory.peekByte(j21) & (-129)) | ((i47 << 7) & SemanticState.Focused)));
                    long j22 = zuoVar6.G;
                    int i61 = zuoVar6.r;
                    long jMin3 = Math.min(j, j22 + zuoVar6.c(((char) i61) + i58, i61 >>> 16) + 15728580000L);
                    zudVar.k(iB);
                    int i62 = i58 + 78;
                    zuoVar6.w(i62, 18, zudVar.e(iB, jMin3, 60000));
                    int i63 = zud.c;
                    zuoVar7.w(((char) i63) + i58, i63 >>> 16, zubVar.e);
                    int i64 = zud.d;
                    zuoVar7.w(((char) i64) + i58, i64 >>> 16, zubVar.c);
                    int i65 = zud.e;
                    zuoVar7.w(((char) i65) + i58, i65 >>> 16, zubVar.d);
                    txfVar2.f(iB, zubVar.a);
                    zubVar.b();
                    zuoVar6.Y();
                    zuoVar6.ac(i18);
                    zuoVar6.G(iB, zuoVar6.aa + (i18 << 3), i49);
                    zudVar.k(iB);
                    zudVar.d(iB, zuoVar6.c(i62, 18), 60000);
                    int i66 = zuoVar6.q;
                    zuoVar6.c(((char) i66) + i58, i66 >>> 16);
                    int i67 = zuoVar6.r;
                    zuoVar6.c(i58 + ((char) i67), i67 >>> 16);
                    zudVar.a(iB);
                    zuoVar6.W((int) zuoVar6.c(i60, i59));
                    zudVar.k(iB);
                    zuoVar6.L(iB, i49);
                    aihfVar = aihfVar2;
                    long j23 = ((akkq) aihfVar.instance).aI + ((long) i52);
                    aihfVar.copyOnWrite();
                    akkq akkqVar4 = (akkq) aihfVar.instance;
                    akkqVar4.e |= 131072;
                    akkqVar4.aI = j23;
                    zudVar.h(iB, iArr, i52, 2);
                }
                if (iB > 0) {
                    long j24 = ((akkq) aihfVar.instance).aC + 1;
                    aihfVar.copyOnWrite();
                    akkq akkqVar5 = (akkq) aihfVar.instance;
                    akkqVar5.e |= SemanticState.Modal;
                    akkqVar5.aC = j24;
                } else {
                    if (iB == -1) {
                        long j25 = ((akkq) aihfVar.instance).aE + 1;
                        aihfVar.copyOnWrite();
                        akkq akkqVar6 = (akkq) aihfVar.instance;
                        akkqVar6.e |= SemanticState.Multiline;
                        akkqVar6.aE = j25;
                        i7 = -1;
                    } else {
                        long j26 = ((akkq) aihfVar.instance).aF + 1;
                        aihfVar.copyOnWrite();
                        akkq akkqVar7 = (akkq) aihfVar.instance;
                        akkqVar7.e |= 16384;
                        akkqVar7.aF = j26;
                    }
                    if (i7 > 0) {
                        b(zuoVar, i7);
                        if (i47 == 0) {
                            zus zusVar = ztmVar.d;
                            zusVar.y(j);
                            int i68 = ztrVar.S;
                            zusVar.y(j17);
                            zusVar.y(j16);
                        }
                    }
                    if ((zueVar.d == 0 || i4 > 0) && i7 > 0) {
                    }
                }
                i7 = iB;
                if (i7 > 0) {
                    b(zuoVar, i7);
                    if (i47 == 0) {
                        zus zusVar2 = ztmVar.d;
                        zusVar2.y(j);
                        int i69 = ztrVar.S;
                        zusVar2.y(j17);
                        zusVar2.y(j16);
                    }
                }
                return zueVar.d == 0 ? z2 : z2;
            }
        } else {
            aihf aihfVar3 = zuiVar.f;
            long j27 = ((akkq) aihfVar3.instance).aD + 1;
            aihfVar3.copyOnWrite();
            akkq akkqVar8 = (akkq) aihfVar3.instance;
            akkqVar8.e |= SemanticState.Obscured;
            akkqVar8.aD = j27;
        }
        return false;
    }

    final void g(zty ztyVar) {
        if (zti.a && !ztyVar.n) {
            throw ugi.e("!inFlight");
        }
        this.l = Math.min(this.l, ztyVar.l);
        if (ztyVar.m) {
            this.g++;
        } else {
            this.f++;
        }
        if (ztyVar.j > 0) {
            this.h++;
        }
    }

    final void h(zty ztyVar) {
        boolean z = ztyVar.n;
        if (ztyVar.m) {
            this.d++;
        } else {
            this.c++;
        }
        if (ztyVar.j > 0) {
            this.m = Math.min(this.m, ztyVar.b());
            this.e++;
        }
    }
}
