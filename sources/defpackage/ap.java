package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ap {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    ap ab;
    ap ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final ao i;
    final ao j;
    final ao k;
    final ao l;
    final ao m;
    final ao n;
    final ao o;
    final ao p;
    public final ArrayList q;
    public ap r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public ap() {
        ao aoVar = new ao(this, 2);
        this.i = aoVar;
        ao aoVar2 = new ao(this, 3);
        this.j = aoVar2;
        ao aoVar3 = new ao(this, 4);
        this.k = aoVar3;
        ao aoVar4 = new ao(this, 5);
        this.l = aoVar4;
        ao aoVar5 = new ao(this, 6);
        this.m = aoVar5;
        ao aoVar6 = new ao(this, 8);
        this.n = aoVar6;
        ao aoVar7 = new ao(this, 9);
        this.o = aoVar7;
        this.p = new ao(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(aoVar);
        arrayList.add(aoVar2);
        arrayList.add(aoVar3);
        arrayList.add(aoVar4);
        arrayList.add(aoVar6);
        arrayList.add(aoVar7);
        arrayList.add(aoVar5);
    }

    private final void A(am amVar, boolean z, boolean z2, ao aoVar, ao aoVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        an anVarE = amVar.e(aoVar);
        an anVarE2 = amVar.e(aoVar2);
        an anVarE3 = amVar.e(aoVar.b);
        an anVarE4 = amVar.e(aoVar2.b);
        int iA = aoVar.a();
        int iA2 = aoVar2.a();
        int i8 = this.K;
        boolean z5 = i8 != 8;
        int i9 = i8 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (anVarE3 == null) {
            if (anVarE4 == null) {
                ak akVarA = amVar.a();
                akVarA.g(anVarE, i);
                amVar.g(akVarA);
                if (z3) {
                    return;
                }
                if (z) {
                    amVar.g(am.c(amVar, anVarE2, anVarE, i4, true));
                    return;
                }
                if (z6) {
                    ak akVarA2 = amVar.a();
                    akVarA2.h(anVarE2, anVarE, i9);
                    amVar.g(akVarA2);
                    return;
                } else {
                    ak akVarA3 = amVar.a();
                    akVarA3.g(anVarE2, i2);
                    amVar.g(akVarA3);
                    return;
                }
            }
            ak akVarA4 = amVar.a();
            akVarA4.h(anVarE2, anVarE4, -iA2);
            amVar.g(akVarA4);
            if (z) {
                amVar.g(am.c(amVar, anVarE2, anVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ak akVarA5 = amVar.a();
                akVarA5.h(anVarE2, anVarE, i9);
                amVar.g(akVarA5);
                return;
            } else {
                ak akVarA6 = amVar.a();
                akVarA6.g(anVarE, i);
                amVar.g(akVarA6);
                return;
            }
        }
        if (anVarE4 == null) {
            ak akVarA7 = amVar.a();
            akVarA7.h(anVarE, anVarE3, iA);
            amVar.g(akVarA7);
            if (z) {
                amVar.g(am.c(amVar, anVarE2, anVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ak akVarA8 = amVar.a();
                akVarA8.h(anVarE2, anVarE, i9);
                amVar.g(akVarA8);
                return;
            } else {
                ak akVarA9 = amVar.a();
                akVarA9.g(anVarE2, i2);
                amVar.g(akVarA9);
                return;
            }
        }
        if (!z6) {
            int i10 = i6;
            if (z3) {
                amVar.i(anVarE, anVarE3, iA, 3);
                amVar.j(anVarE2, anVarE4, -iA2, 3);
                amVar.g(am.b(amVar, anVarE, anVarE3, iA, f, anVarE4, anVarE2, iA2, true));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -iA2;
            if (i5 == 1) {
                if (i10 <= i9) {
                    i10 = i9;
                }
                if (i7 > 0) {
                    if (i7 < i10) {
                        i10 = i7;
                    } else {
                        amVar.j(anVarE2, anVarE, i7, 3);
                    }
                }
                amVar.n(anVarE2, anVarE, i10, 3);
                amVar.i(anVarE, anVarE3, iA, 2);
                amVar.j(anVarE2, anVarE4, i11, 2);
                amVar.m(anVarE, anVarE3, iA, f, anVarE4, anVarE2, iA2);
                return;
            }
            if (i10 != 0 || i7 != 0) {
                if (i7 > 0) {
                    amVar.j(anVarE2, anVarE, i7, 3);
                }
                amVar.i(anVarE, anVarE3, iA, 2);
                amVar.j(anVarE2, anVarE4, i11, 2);
                amVar.m(anVarE, anVarE3, iA, f, anVarE4, anVarE2, iA2);
                return;
            }
            ak akVarA10 = amVar.a();
            akVarA10.h(anVarE, anVarE3, iA);
            amVar.g(akVarA10);
            ak akVarA11 = amVar.a();
            akVarA11.h(anVarE2, anVarE4, i11);
            amVar.g(akVarA11);
            return;
        }
        if (z) {
            amVar.g(am.c(amVar, anVarE2, anVarE, i4, true));
        } else {
            ak akVarA12 = amVar.a();
            akVarA12.h(anVarE2, anVarE, i9);
            amVar.g(akVarA12);
        }
        int i12 = aoVar.h;
        if (i12 != aoVar2.h) {
            int i13 = -iA2;
            if (i12 == 2) {
                ak akVarA13 = amVar.a();
                akVarA13.h(anVarE, anVarE3, iA);
                amVar.g(akVarA13);
                an anVarF = amVar.f();
                ak akVarA14 = amVar.a();
                akVarA14.j(anVarE2, anVarE4, anVarF, i13);
                amVar.g(akVarA14);
                return;
            }
            an anVarF2 = amVar.f();
            ak akVarA15 = amVar.a();
            akVarA15.i(anVarE, anVarE3, anVarF2, iA);
            amVar.g(akVarA15);
            ak akVarA16 = amVar.a();
            akVarA16.h(anVarE2, anVarE4, i13);
            amVar.g(akVarA16);
            return;
        }
        if (anVarE3 == anVarE4) {
            amVar.g(am.b(amVar, anVarE, anVarE3, 0, 0.5f, anVarE4, anVarE2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -iA2;
        int i15 = aoVar.i;
        an anVarF3 = amVar.f();
        ak akVarA17 = amVar.a();
        akVarA17.i(anVarE, anVarE3, anVarF3, iA);
        if (i15 != 2) {
            amVar.k(akVarA17, (int) (-akVarA17.d.a(anVarF3)));
        }
        amVar.g(akVarA17);
        int i16 = aoVar2.i;
        an anVarF4 = amVar.f();
        ak akVarA18 = amVar.a();
        akVarA18.j(anVarE2, anVarE4, anVarF4, i14);
        if (i16 != 2) {
            amVar.k(akVarA18, (int) (-akVarA18.d.a(anVarF4)));
        }
        amVar.g(akVarA18);
        amVar.g(am.b(amVar, anVarE, anVarE3, iA, f, anVarE4, anVarE2, iA2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int iMax;
        int i = this.t;
        if (this.ae != 3) {
            return i;
        }
        int i2 = this.d;
        int i3 = this.g;
        if (i2 == 1) {
            iMax = Math.max(i3, i);
        } else if (i3 > 0) {
            this.t = i3;
            iMax = i3;
        } else {
            iMax = 0;
        }
        int i4 = this.h;
        return (i4 <= 0 || i4 >= iMax) ? iMax : i4;
    }

    public final int f() {
        int iMax;
        int i = this.s;
        if (this.ad != 3) {
            return i;
        }
        int i2 = this.c;
        int i3 = this.e;
        if (i2 == 1) {
            iMax = Math.max(i3, i);
        } else if (i3 > 0) {
            this.s = i3;
            iMax = i3;
        } else {
            iMax = 0;
        }
        int i4 = this.f;
        return (i4 <= 0 || i4 >= iMax) ? iMax : i4;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void k(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void l(int i) {
        if (i < 0) {
            i = 0;
        }
        this.E = i;
    }

    public final void m(int i) {
        if (i < 0) {
            i = 0;
        }
        this.D = i;
    }

    public void n(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void o(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void p(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void q() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean r() {
        return this.C > 0;
    }

    public final boolean s() {
        return this.r == null;
    }

    public ao t(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ')';
    }

    public final void u(int i, ap apVar, int i2, int i3, int i4) {
        t(i).d(apVar.t(i2), i3, i4, 2, 0, true);
    }

    public final void v(int i) {
        this.ad = i;
        if (i == 2) {
            p(this.F);
        }
    }

    public final void w(int i) {
        this.ae = i;
        if (i == 2) {
            j(this.G);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:141:0x0204  */
    /* JADX WARN: Code duplicated, block: B:151:0x0263  */
    /* JADX WARN: Code duplicated, block: B:152:0x029c  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:182:0x031e  */
    /* JADX WARN: Code duplicated, block: B:185:0x033f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0376  */
    /* JADX WARN: Code duplicated, block: B:189:0x0386  */
    /* JADX WARN: Code duplicated, block: B:198:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:203:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:204:0x0408  */
    /* JADX WARN: Code duplicated, block: B:206:0x040f  */
    /* JADX WARN: Code duplicated, block: B:207:0x041c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0423  */
    /* JADX WARN: Code duplicated, block: B:212:0x042a  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r0v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
    	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:280)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5, types: [ap] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [ap] */
    /* JADX WARN: Type inference failed for: r43v0, types: [ap] */
    public void x(am amVar) {
        boolean z;
        boolean z2;
        int i;
        ao aoVar;
        int i2;
        float f;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        an anVar;
        an anVar2;
        ao aoVar2;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        int i6;
        int i7;
        boolean z9;
        an anVar3;
        am amVar2;
        ?? r0;
        ak akVarA;
        int i8;
        an anVar4;
        an anVar5;
        int i9;
        int i10;
        an anVar6;
        ao aoVar3;
        ao aoVar4;
        int i11;
        boolean z10;
        ao aoVar5;
        an anVarE;
        an anVarE2;
        an anVarE3;
        an anVarE4;
        ao aoVar6;
        boolean z11;
        ao aoVar7;
        boolean z12;
        ap apVar;
        ap apVar2;
        ap apVar3;
        ap apVar4;
        ap apVar5;
        ap apVar6;
        am amVar3 = amVar;
        ao aoVar8 = this.j;
        ao aoVar9 = this.i;
        ao aoVar10 = this.l;
        ao aoVar11 = this.k;
        an anVarE5 = amVar3.e(aoVar9);
        an anVarE6 = amVar3.e(aoVar11);
        an anVarE7 = amVar3.e(aoVar8);
        an anVarE8 = amVar3.e(aoVar10);
        ao aoVar12 = this.m;
        an anVarE9 = amVar3.e(aoVar12);
        ap apVar7 = this.r;
        if (apVar7 != null) {
            ao aoVar13 = aoVar9.b;
            if ((aoVar13 == null || aoVar13.b != aoVar9) && ((aoVar6 = aoVar11.b) == null || aoVar6.b != aoVar11)) {
                z11 = false;
            } else {
                ((aq) apVar7).A(this, 0);
                z11 = true;
            }
            ao aoVar14 = aoVar8.b;
            if ((aoVar14 == null || aoVar14.b != aoVar8) && ((aoVar7 = aoVar10.b) == null || aoVar7.b != aoVar10)) {
                z12 = false;
            } else {
                ((aq) this.r).A(this, 1);
                z12 = true;
            }
            ap apVar8 = this.r;
            if (apVar8.ad != 2 || z11) {
                z11 = z11;
            } else {
                ao aoVar15 = aoVar9.b;
                if (aoVar15 == null || (apVar6 = aoVar15.a) != apVar8) {
                    an anVarE10 = amVar3.e(apVar8.i);
                    ak akVarA2 = amVar3.a();
                    akVarA2.i(anVarE5, anVarE10, amVar3.f(), 0);
                    amVar3.g(akVarA2);
                } else if (apVar6 == apVar8) {
                    aoVar9.i = 2;
                }
                ao aoVar16 = aoVar11.b;
                if (aoVar16 == null || (apVar5 = aoVar16.a) != (apVar4 = this.r)) {
                    an anVarE11 = amVar3.e(this.r.k);
                    ak akVarA3 = amVar3.a();
                    akVarA3.i(anVarE11, anVarE6, amVar3.f(), 0);
                    amVar3.g(akVarA3);
                } else if (apVar5 == apVar4) {
                    aoVar11.i = 2;
                }
            }
            ap apVar9 = this.r;
            if (apVar9.ae == 2 && !z12) {
                ao aoVar17 = aoVar8.b;
                if (aoVar17 == null || (apVar3 = aoVar17.a) != apVar9) {
                    an anVarE12 = amVar3.e(apVar9.j);
                    ak akVarA4 = amVar3.a();
                    akVarA4.i(anVarE7, anVarE12, amVar3.f(), 0);
                    amVar3.g(akVarA4);
                } else if (apVar3 == apVar9) {
                    aoVar8.i = 2;
                }
                ao aoVar18 = aoVar10.b;
                if (aoVar18 == null || (apVar2 = aoVar18.a) != (apVar = this.r)) {
                    an anVarE13 = amVar3.e(this.r.l);
                    ak akVarA5 = amVar3.a();
                    akVarA5.i(anVarE13, anVarE8, amVar3.f(), 0);
                    amVar3.g(akVarA5);
                } else if (apVar2 == apVar) {
                    aoVar10.i = 2;
                }
            }
            z2 = z12;
            z = z11;
        } else {
            z = false;
            z2 = false;
        }
        int i12 = this.s;
        int i13 = this.D;
        int i14 = i12 < i13 ? i13 : i12;
        int i15 = this.t;
        boolean z13 = z;
        int i16 = this.E;
        int i17 = i15 >= i16 ? i15 : i16;
        int i18 = this.ad;
        boolean z14 = i18 != 3;
        int i19 = this.ae;
        boolean z15 = i19 != 3;
        if (!z14 && aoVar9 != null && aoVar11 != null && (aoVar9.b == null || aoVar11.b == null)) {
            z14 = true;
        }
        if (z15 || aoVar8 == null || aoVar10 == null) {
            i = i14;
        } else {
            ao aoVar19 = aoVar8.b;
            i = i14;
            if ((aoVar19 == null || aoVar10.b == null) && (this.C == 0 || (aoVar12 != null && (aoVar19 == null || aoVar12.b == null)))) {
                z15 = true;
            }
        }
        int i20 = this.v;
        float f2 = this.u;
        if (f2 > 0.0f) {
            aoVar = aoVar10;
            if (this.K != 8) {
                int i21 = 3;
                if (i18 != 3) {
                    if (i18 == i21) {
                        i = (int) (i15 * f2);
                        f = f2;
                        i17 = i17;
                        i3 = 2;
                        i2 = 0;
                        z3 = false;
                        z14 = true;
                    } else if (i19 == i21) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        i17 = (int) (i12 * f2);
                        f = f2;
                        i = i;
                        i3 = 2;
                        i2 = 1;
                        z3 = false;
                        z15 = true;
                    }
                } else if (i19 == 3) {
                    if (z14) {
                        if (z15) {
                            i2 = i20;
                            f = f2;
                            i3 = 2;
                            i18 = 3;
                        } else {
                            f = f2;
                            i3 = 2;
                            i18 = 3;
                            i2 = 0;
                        }
                    } else if (z15) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        f = f2;
                        i3 = 2;
                        i18 = 3;
                        i2 = 1;
                    } else {
                        i2 = i20;
                        f = f2;
                        i3 = 2;
                        i18 = 3;
                    }
                    z3 = true;
                } else {
                    i18 = 3;
                    i21 = 3;
                    if (i18 == i21) {
                        i = (int) (i15 * f2);
                        f = f2;
                        i17 = i17;
                        i3 = 2;
                        i2 = 0;
                        z3 = false;
                        z14 = true;
                    } else if (i19 == i21) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        i17 = (int) (i12 * f2);
                        f = f2;
                        i = i;
                        i3 = 2;
                        i2 = 1;
                        z3 = false;
                        z15 = true;
                    }
                }
            }
            if (z3 || !(i2 == 0 || i2 == -1)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i18 == i3 || !(this instanceof aq)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (this.a != i3) {
                i4 = i17;
                anVar = anVarE7;
                anVar2 = anVarE8;
                aoVar2 = aoVar12;
                anVarE9 = anVarE9;
                z6 = false;
            } else if (z4 || aoVar9.b == null || aoVar11.b == null) {
                anVarE9 = anVarE9;
                z6 = false;
                int i22 = this.w;
                i4 = i17;
                anVar = anVarE7;
                anVar2 = anVarE8;
                aoVar2 = aoVar12;
                amVar3 = amVar;
                A(amVar3, z5, z14, aoVar9, aoVar11, i22, i22 + i, i, i13, this.H, z4, z13, this.c, this.e, this.f);
            } else {
                an anVarE14 = amVar3.e(aoVar9);
                an anVarE15 = amVar3.e(aoVar11);
                an anVarE16 = amVar3.e(aoVar9.b);
                an anVarE17 = amVar3.e(aoVar11.b);
                amVar3.i(anVarE14, anVarE16, aoVar9.a(), 3);
                amVar3.j(anVarE15, anVarE17, -aoVar11.a(), 3);
                if (z13) {
                    z6 = false;
                } else {
                    z6 = false;
                    amVar3.m(anVarE14, anVarE16, aoVar9.a(), this.H, anVarE17, anVarE15, aoVar11.a());
                }
                amVar3 = amVar;
                i4 = i17;
                anVar = anVarE7;
                anVar2 = anVarE8;
                aoVar2 = aoVar12;
            }
            if (this.b != 2) {
                if (this.ae == 2 || !(this instanceof aq)) {
                    z7 = z6;
                } else {
                    z7 = true;
                }
                i5 = i2;
                if (z3 || !(i5 == 1 || i5 == -1)) {
                    z8 = z6;
                } else {
                    z8 = true;
                }
                i6 = this.C;
                if (i6 > 0) {
                    anVar6 = anVar;
                    amVar3.n(anVarE9, anVar6, i6, 5);
                    aoVar3 = aoVar2;
                    if (aoVar3.b != null) {
                        i11 = this.C;
                        aoVar4 = aoVar3;
                    } else {
                        aoVar4 = aoVar;
                        i11 = i4;
                    }
                    if (z8) {
                        if (aoVar8.b != null) {
                            aoVar5 = aoVar;
                            if (aoVar5.b != null) {
                                anVarE = amVar3.e(aoVar8);
                                anVarE2 = amVar3.e(aoVar5);
                                anVarE3 = amVar3.e(aoVar8.b);
                                anVarE4 = amVar3.e(aoVar5.b);
                                amVar3.i(anVarE, anVarE3, aoVar8.a(), 3);
                                amVar3.j(anVarE2, anVarE4, -aoVar5.a(), 3);
                                if (!z2) {
                                    amVar.m(anVarE, anVarE3, aoVar8.a(), this.I, anVarE4, anVarE2, aoVar5.a());
                                }
                                amVar2 = amVar;
                                r0 = this;
                                i7 = i5;
                                anVar3 = anVar6;
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = z6;
                    }
                    int i23 = this.x;
                    amVar2 = amVar;
                    i7 = i5;
                    A(amVar2, z7, z15, aoVar8, aoVar4, i23, i23 + i11, i11, this.E, this.I, z10, z2, this.d, this.g, this.h);
                    amVar2.n(anVar2, anVar6, i4, 5);
                    r0 = this;
                    anVar3 = anVar6;
                } else {
                    i7 = i5;
                    boolean z16 = z2;
                    boolean z17 = z15;
                    ao aoVar20 = aoVar;
                    an anVar7 = anVar;
                    an anVar8 = anVar2;
                    if (!z8) {
                        z9 = z6;
                    } else if (r30.b != null || aoVar20.b == null) {
                        z9 = true;
                    } else {
                        an anVarE18 = amVar3.e(r30);
                        an anVarE19 = amVar3.e(aoVar20);
                        an anVarE20 = amVar3.e(r30.b);
                        an anVarE21 = amVar3.e(aoVar20.b);
                        amVar3.i(anVarE18, anVarE20, r30.a(), 3);
                        amVar3.j(anVarE19, anVarE21, -aoVar20.a(), 3);
                        if (!z16) {
                            amVar.m(anVarE18, anVarE20, r30.a(), this.I, anVarE21, anVarE19, aoVar20.a());
                        }
                        amVar2 = amVar;
                        r0 = this;
                        anVar3 = anVar7;
                        anVar2 = anVar8;
                    }
                    int i24 = this.x;
                    int i25 = this.E;
                    float f3 = this.I;
                    int i26 = this.d;
                    anVar2 = anVar8;
                    int i27 = this.g;
                    anVar3 = anVar7;
                    int i28 = this.h;
                    amVar2 = amVar;
                    ?? r1 = this;
                    r1.A(amVar2, z7, z17, r30, aoVar20, i24, i24 + i4, i4, i25, f3, z9, z16, i26, i27, i28);
                    r0 = r1;
                }
                if (z3) {
                    akVarA = amVar2.a();
                    i8 = i7;
                    if (i8 == 0) {
                        akVarA.e(anVarE6, anVarE5, anVar2, anVar3, f);
                        amVar2.g(akVarA);
                        return;
                    }
                    anVar4 = anVar3;
                    anVar5 = anVar2;
                    if (i8 == 1) {
                        akVarA.e(anVar5, anVar4, anVarE6, anVarE5, f);
                        amVar2.g(akVarA);
                        return;
                    }
                    i9 = r0.e;
                    if (i9 > 0) {
                        amVar2.i(anVarE6, anVarE5, i9, 3);
                    }
                    i10 = r0.g;
                    if (i10 > 0) {
                        amVar2.i(anVar5, anVar4, i10, 3);
                    }
                    akVarA.e(anVarE6, anVarE5, anVar5, anVar4, f);
                    an anVarD = amVar2.d();
                    an anVarD2 = amVar2.d();
                    anVarD.c = 4;
                    anVarD2.c = 4;
                    akVarA.c(anVarD, anVarD2);
                    amVar2.g(akVarA);
                }
            }
        }
        aoVar = aoVar10;
        i2 = i20;
        f = f2;
        i17 = i17;
        i = i;
        i3 = 2;
        z3 = false;
        if (z3) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (i18 == i3) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (this.a != i3) {
            i4 = i17;
            anVar = anVarE7;
            anVar2 = anVarE8;
            aoVar2 = aoVar12;
            anVarE9 = anVarE9;
            z6 = false;
        } else if (z4) {
            anVarE9 = anVarE9;
            z6 = false;
            int i29 = this.w;
            i4 = i17;
            anVar = anVarE7;
            anVar2 = anVarE8;
            aoVar2 = aoVar12;
            amVar3 = amVar;
            A(amVar3, z5, z14, aoVar9, aoVar11, i29, i29 + i, i, i13, this.H, z4, z13, this.c, this.e, this.f);
        } else {
            anVarE9 = anVarE9;
            z6 = false;
            int i210 = this.w;
            i4 = i17;
            anVar = anVarE7;
            anVar2 = anVarE8;
            aoVar2 = aoVar12;
            amVar3 = amVar;
            A(amVar3, z5, z14, aoVar9, aoVar11, i210, i210 + i, i, i13, this.H, z4, z13, this.c, this.e, this.f);
        }
        if (this.b != 2) {
            if (this.ae == 2) {
                z7 = z6;
            } else {
                z7 = z6;
            }
            i5 = i2;
            if (z3) {
                z8 = z6;
            } else {
                z8 = z6;
            }
            i6 = this.C;
            if (i6 > 0) {
                anVar6 = anVar;
                amVar3.n(anVarE9, anVar6, i6, 5);
                aoVar3 = aoVar2;
                if (aoVar3.b != null) {
                    i11 = this.C;
                    aoVar4 = aoVar3;
                } else {
                    aoVar4 = aoVar;
                    i11 = i4;
                }
                if (z8) {
                    if (aoVar8.b != null) {
                        aoVar5 = aoVar;
                        if (aoVar5.b != null) {
                            anVarE = amVar3.e(aoVar8);
                            anVarE2 = amVar3.e(aoVar5);
                            anVarE3 = amVar3.e(aoVar8.b);
                            anVarE4 = amVar3.e(aoVar5.b);
                            amVar3.i(anVarE, anVarE3, aoVar8.a(), 3);
                            amVar3.j(anVarE2, anVarE4, -aoVar5.a(), 3);
                            if (!z2) {
                                amVar.m(anVarE, anVarE3, aoVar8.a(), this.I, anVarE4, anVarE2, aoVar5.a());
                            }
                            amVar2 = amVar;
                            r0 = this;
                            i7 = i5;
                            anVar3 = anVar6;
                        }
                    }
                    z10 = true;
                } else {
                    z10 = z6;
                }
                int i211 = this.x;
                amVar2 = amVar;
                i7 = i5;
                A(amVar2, z7, z15, aoVar8, aoVar4, i211, i211 + i11, i11, this.E, this.I, z10, z2, this.d, this.g, this.h);
                amVar2.n(anVar2, anVar6, i4, 5);
                r0 = this;
                anVar3 = anVar6;
            } else {
                i7 = i5;
                boolean z18 = z2;
                boolean z19 = z15;
                ao aoVar21 = aoVar;
                an anVar9 = anVar;
                an anVar10 = anVar2;
                if (!z8) {
                    if (r30.b != null) {
                    }
                    z9 = true;
                } else {
                    z9 = z6;
                }
                int i212 = this.x;
                int i213 = this.E;
                float f4 = this.I;
                int i214 = this.d;
                anVar2 = anVar10;
                int i215 = this.g;
                anVar3 = anVar9;
                int i216 = this.h;
                amVar2 = amVar;
                ?? r2 = this;
                r2.A(amVar2, z7, z19, r30, aoVar21, i212, i212 + i4, i4, i213, f4, z9, z18, i214, i215, i216);
                r0 = r2;
            }
            if (z3) {
                akVarA = amVar2.a();
                i8 = i7;
                if (i8 == 0) {
                    akVarA.e(anVarE6, anVarE5, anVar2, anVar3, f);
                    amVar2.g(akVarA);
                    return;
                }
                anVar4 = anVar3;
                anVar5 = anVar2;
                if (i8 == 1) {
                    akVarA.e(anVar5, anVar4, anVarE6, anVarE5, f);
                    amVar2.g(akVarA);
                    return;
                }
                i9 = r0.e;
                if (i9 > 0) {
                    amVar2.i(anVarE6, anVarE5, i9, 3);
                }
                i10 = r0.g;
                if (i10 > 0) {
                    amVar2.i(anVar5, anVar4, i10, 3);
                }
                akVarA.e(anVarE6, anVarE5, anVar5, anVar4, f);
                an anVarD3 = amVar2.d();
                an anVarD4 = amVar2.d();
                anVarD3.c = 4;
                anVarD4.c = 4;
                akVarA.c(anVarD3, anVarD4);
                amVar2.g(akVarA);
            }
        }
    }

    public void y() {
        int i;
        int i2;
        int iP = am.p(this.i);
        int iP2 = am.p(this.j);
        int iP3 = am.p(this.k) - iP;
        int iP4 = am.p(this.l) - iP2;
        this.w = iP;
        this.x = iP2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && iP3 < (i2 = this.s)) {
            iP3 = i2;
        }
        if (this.ae == 1 && iP4 < (i = this.t)) {
            iP4 = i;
        }
        this.s = iP3;
        this.t = iP4;
        int i3 = this.E;
        if (iP4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (iP3 < i4) {
            this.s = i4;
        }
    }

    public void z(ahto ahtoVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
