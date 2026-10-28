package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddt implements ddr {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private cwj c;
    private final String d;
    private final bwb e;
    private final deg f;
    private final boolean[] g = new boolean[4];
    private final dds h = new dds();
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;
    private final kwq r;

    public ddt(kwq kwqVar, String str) {
        bwb bwbVar;
        this.r = kwqVar;
        this.d = str;
        if (kwqVar != null) {
            this.f = new deg(178);
            bwbVar = new bwb();
        } else {
            bwbVar = null;
            this.f = null;
        }
        this.e = bwbVar;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        int i;
        long j;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j2;
        double d;
        int i6;
        int i7;
        this.c.getClass();
        int i8 = bwbVar.c;
        int i9 = bwbVar.d;
        byte[] bArr = bwbVar.b;
        this.i += (long) bwbVar.d();
        this.c.c(bwbVar, bwbVar.d());
        while (true) {
            int iB = bxf.b(bArr, i8, i9, this.g);
            if (iB == i9) {
                break;
            }
            int i10 = iB + 3;
            int i11 = bwbVar.b[i10] & 255;
            int i12 = iB - i8;
            if (this.k) {
                i = i9;
            } else {
                if (i12 > 0) {
                    this.h.a(bArr, i8, iB);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                dds ddsVar = this.h;
                if (ddsVar.b) {
                    int i14 = ddsVar.c - i13;
                    ddsVar.c = i14;
                    if (ddsVar.d == 0 && i11 == 181) {
                        ddsVar.d = i14;
                        i = i9;
                        i11 = 181;
                    } else {
                        ddsVar.b = false;
                        String str = this.b;
                        str.getClass();
                        String str2 = this.d;
                        byte[] bArrCopyOf = Arrays.copyOf(ddsVar.e, i14);
                        int i15 = bArrCopyOf[4] & 255;
                        byte b = bArrCopyOf[5];
                        i = i9;
                        int i16 = bArrCopyOf[6] & 255;
                        int i17 = (i15 << 4) | ((b & 255) >> 4);
                        int i18 = (bArrCopyOf[7] & 240) >> 4;
                        int i19 = ((b & 15) << 8) | i16;
                        if (i18 == 2) {
                            i3 = i19 << 2;
                            i4 = i17 * 3;
                        } else if (i18 != 3) {
                            if (i18 != 4) {
                                f = 1.0f;
                            } else {
                                i3 = i19 * 121;
                                i4 = i17 * 100;
                            }
                            bsd bsdVar = new bsd();
                            bsdVar.a = str;
                            bsdVar.a(str2);
                            bsdVar.e("video/mpeg2");
                            bsdVar.u = i17;
                            bsdVar.v = i19;
                            bsdVar.B = f;
                            bsdVar.r = Collections.singletonList(bArrCopyOf);
                            bse bseVar = new bse(bsdVar);
                            i5 = (bArrCopyOf[7] & 15) - 1;
                            j2 = 0;
                            if (i5 >= 0 && i5 < 8) {
                                d = a[i5];
                                byte b2 = bArrCopyOf[ddsVar.d + 9];
                                i6 = (b2 & 96) >> 5;
                                i7 = b2 & 31;
                                if (i6 != i7) {
                                    d *= (((double) i6) + 1.0d) / ((double) (i7 + 1));
                                }
                                j2 = (long) (1000000.0d / d);
                            }
                            Pair pairCreate = Pair.create(bseVar, Long.valueOf(j2));
                            this.c.b((bse) pairCreate.first);
                            this.l = ((Long) pairCreate.second).longValue();
                            this.k = true;
                        } else {
                            i3 = i19 << 4;
                            i4 = i17 * 9;
                        }
                        f = i3 / i4;
                        bsd bsdVar2 = new bsd();
                        bsdVar2.a = str;
                        bsdVar2.a(str2);
                        bsdVar2.e("video/mpeg2");
                        bsdVar2.u = i17;
                        bsdVar2.v = i19;
                        bsdVar2.B = f;
                        bsdVar2.r = Collections.singletonList(bArrCopyOf);
                        bse bseVar2 = new bse(bsdVar2);
                        i5 = (bArrCopyOf[7] & 15) - 1;
                        j2 = 0;
                        if (i5 >= 0) {
                            d = a[i5];
                            byte b3 = bArrCopyOf[ddsVar.d + 9];
                            i6 = (b3 & 96) >> 5;
                            i7 = b3 & 31;
                            if (i6 != i7) {
                                d *= (((double) i6) + 1.0d) / ((double) (i7 + 1));
                            }
                            j2 = (long) (1000000.0d / d);
                        }
                        Pair pairCreate2 = Pair.create(bseVar2, Long.valueOf(j2));
                        this.c.b((bse) pairCreate2.first);
                        this.l = ((Long) pairCreate2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i9;
                    if (i11 == 179) {
                        ddsVar.b = true;
                        i11 = 179;
                    }
                }
                ddsVar.a(dds.a, 0, 3);
            }
            deg degVar = this.f;
            if (degVar != null) {
                if (i12 > 0) {
                    degVar.a(bArr, i8, iB);
                    i2 = 0;
                } else {
                    i2 = -i12;
                }
                if (degVar.d(i2)) {
                    int iE = bxf.e(degVar.b, degVar.c);
                    bwb bwbVar2 = this.e;
                    int i20 = bwp.a;
                    bwbVar2.N(degVar.b, iE);
                    this.r.D(this.o, bwbVar2);
                }
                if (i11 == 178) {
                    if (bwbVar.b[iB + 2] == 1) {
                        degVar.c(178);
                    }
                    i11 = 178;
                }
            }
            if (i11 == 0 || i11 == 179) {
                int i21 = i - iB;
                if (this.q && this.k) {
                    j = -9223372036854775807L;
                    long j3 = this.o;
                    if (j3 != -9223372036854775807L) {
                        j = -9223372036854775807L;
                        this.c.e(j3, this.p ? 1 : 0, ((int) (this.i - this.n)) - i21, i21, null);
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (!this.j || this.q) {
                    this.n = this.i - ((long) i21);
                    long j4 = this.m;
                    if (j4 == j) {
                        long j5 = this.o;
                        j4 = j5 != j ? j5 + this.l : j;
                    }
                    this.o = j4;
                    z = false;
                    this.p = false;
                    this.m = j;
                    z2 = true;
                    this.j = true;
                } else {
                    z2 = true;
                    z = false;
                }
                this.q = i11 == 0 ? z2 : z;
            } else if (i11 == 184) {
                this.p = true;
            }
            i8 = i10;
            i9 = i;
        }
        if (!this.k) {
            this.h.a(bArr, i8, i9);
        }
        deg degVar2 = this.f;
        if (degVar2 != null) {
            degVar2.a(bArr, i8, i9);
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.b = devVar.b();
        this.c = cvkVar.s(devVar.a(), 2);
        kwq kwqVar = this.r;
        if (kwqVar != null) {
            kwqVar.E(cvkVar, devVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ddr
    public final void c() {
        cwj cwjVar = this.c;
        cwjVar.getClass();
        long j = this.o;
        if (j != -9223372036854775807L) {
            boolean z = this.p;
            cwjVar.e(j, z ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        bxf.i(this.g);
        dds ddsVar = this.h;
        ddsVar.b = false;
        ddsVar.c = 0;
        ddsVar.d = 0;
        deg degVar = this.f;
        if (degVar != null) {
            degVar.b();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
