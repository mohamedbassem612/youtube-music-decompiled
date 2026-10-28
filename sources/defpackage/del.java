package defpackage;

import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class del implements cvi {
    private boolean c;
    private boolean d;
    private boolean e;
    private long f;
    private cvk g;
    private boolean h;
    private cuy i;
    private final nzd j = new nzd(0);
    private final bwb b = new bwb(SemanticState.Obscured);
    private final SparseArray a = new SparseArray();
    private final der k = new der(null);

    private final void h() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ((dek) sparseArray.valueAt(i)).a.c();
            i++;
        }
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.g = cvkVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        nzd nzdVar = this.j;
        if (nzdVar.f() != -9223372036854775807L) {
            long jD = nzdVar.d();
            if (jD != -9223372036854775807L && jD != 0 && jD != j2) {
                nzdVar.i(j2);
            }
        } else {
            nzdVar.i(j2);
        }
        cuy cuyVar = this.i;
        if (cuyVar != null) {
            cuyVar.a(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            dek dekVar = (dek) sparseArray.valueAt(i);
            dekVar.e = false;
            dekVar.a.f();
            i++;
        }
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        byte[] bArr = new byte[14];
        cvb cvbVar = (cvb) cvjVar;
        cvbVar.n(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        cvbVar.m(bArr[13] & 7, false);
        cvbVar.n(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x032e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) {
        ?? r13;
        int i;
        ddr ddtVar;
        int i2;
        long jB;
        long j;
        cvk cvkVar = this.g;
        cvkVar.getClass();
        cvb cvbVar = (cvb) cvjVar;
        long j2 = cvbVar.a;
        if (j2 != -1) {
            der derVar = this.k;
            if (!derVar.b) {
                if (!derVar.d) {
                    int iMin = (int) Math.min(20000L, j2);
                    long j3 = j2 - ((long) iMin);
                    if (cvbVar.b != j3) {
                        qhaVar.a = j3;
                        return 1;
                    }
                    bwb bwbVar = derVar.a;
                    bwbVar.L(iMin);
                    cvjVar.k();
                    cvbVar.n(bwbVar.b, 0, iMin, false);
                    int i3 = bwbVar.c;
                    for (int i4 = bwbVar.d - 4; i4 >= i3; i4--) {
                        if (der.d(bwbVar.b, i4) == 442) {
                            bwbVar.P(i4 + 4);
                            long jB2 = der.b(bwbVar);
                            if (jB2 != -9223372036854775807L) {
                                j = jB2;
                                derVar.f = j;
                                derVar.d = true;
                                return 0;
                            }
                        }
                    }
                    j = -9223372036854775807L;
                    derVar.f = j;
                    derVar.d = true;
                    return 0;
                }
                if (derVar.f == -9223372036854775807L) {
                    derVar.c(cvjVar);
                    return 0;
                }
                if (derVar.c) {
                    i2 = 0;
                    long j4 = derVar.e;
                    if (j4 == -9223372036854775807L) {
                        derVar.c(cvjVar);
                    } else {
                        nzd nzdVar = derVar.h;
                        derVar.g = nzdVar.c(derVar.f) - nzdVar.b(j4);
                        derVar.c(cvjVar);
                    }
                } else {
                    int iMin2 = (int) Math.min(20000L, j2);
                    if (cvbVar.b != 0) {
                        qhaVar.a = 0L;
                        return 1;
                    }
                    bwb bwbVar2 = derVar.a;
                    bwbVar2.L(iMin2);
                    cvjVar.k();
                    i2 = 0;
                    cvbVar.n(bwbVar2.b, 0, iMin2, false);
                    int i5 = bwbVar2.c;
                    int i6 = bwbVar2.d;
                    while (true) {
                        if (i5 >= i6 - 3) {
                            jB = -9223372036854775807L;
                            break;
                        }
                        if (der.d(bwbVar2.b, i5) == 442) {
                            bwbVar2.P(i5 + 4);
                            jB = der.b(bwbVar2);
                            if (jB != -9223372036854775807L) {
                                break;
                            }
                        }
                        i5++;
                    }
                    derVar.e = jB;
                    derVar.c = true;
                }
                return i2;
            }
        }
        if (this.h) {
            r13 = 1;
        } else {
            r13 = 1;
            this.h = true;
            der derVar2 = this.k;
            long j5 = derVar2.g;
            if (j5 != -9223372036854775807L) {
                cuy cuyVar = new cuy(new cut(), new dej(derVar2.h), j5, j5 + 1, 0L, j2, 188L, 1000);
                this.i = cuyVar;
                this.g.z(cuyVar.a);
                r13 = 1;
            } else {
                cvkVar.z(new cvy(-9223372036854775807L, 0L));
            }
        }
        cuy cuyVar2 = this.i;
        if (cuyVar2 != null && cuyVar2.b()) {
            return cuyVar2.f(cvjVar, qhaVar);
        }
        cvjVar.k();
        long jE = j2 != -1 ? j2 - cvjVar.e() : -1L;
        if (jE != -1 && jE < 4) {
            h();
            return -1;
        }
        bwb bwbVar3 = this.b;
        if (!cvjVar.n(bwbVar3.b, r8, 4, r13)) {
            h();
            return -1;
        }
        bwbVar3.P(r8);
        int i7 = bwbVar3.i();
        if (i7 == 441) {
            h();
            return -1;
        }
        if (i7 == 442) {
            cvbVar.n(bwbVar3.b, r8, 10, r8);
            bwbVar3.P(9);
            cvbVar.p((bwbVar3.n() & 7) + 14, false);
        } else if (i7 == 443) {
            cvbVar.n(bwbVar3.b, r8, 2, r8);
            bwbVar3.P(r8);
            cvbVar.p(bwbVar3.s() + 6, r8);
        } else {
            if ((i7 >> 8) == r13) {
                int i8 = i7 & 255;
                SparseArray sparseArray = this.a;
                dek dekVar = (dek) sparseArray.get(i8);
                if (!this.c) {
                    if (dekVar == null) {
                        ddr ddrVar = null;
                        if (i8 == 189) {
                            ddk ddkVar = new ddk(null, r8, "video/mp2p");
                            this.d = r13;
                            this.f = cvbVar.b;
                            ddrVar = ddkVar;
                        } else {
                            if ((i7 & 224) == 192) {
                                ddtVar = new ded(null, r8, "video/mp2p");
                                this.d = r13;
                                this.f = cvbVar.b;
                            } else if ((i7 & 240) == 224) {
                                ddtVar = new ddt(null, "video/mp2p");
                                this.e = r13;
                                this.f = cvbVar.b;
                            }
                            ddrVar = ddtVar;
                        }
                        if (ddrVar != null) {
                            ddrVar.b(this.g, new dev(Integer.MIN_VALUE, i8, SemanticState.Hidden));
                            dek dekVar2 = new dek(ddrVar, this.j, i8 == 189 ? r13 : 0);
                            sparseArray.put(i8, dekVar2);
                            dekVar = dekVar2;
                        }
                    }
                    long j6 = 1048576;
                    if (this.d && this.e) {
                        j6 = 8192 + this.f;
                    }
                    if (cvbVar.b > j6) {
                        this.c = r13;
                        this.g.t();
                    }
                }
                cvbVar.n(bwbVar3.b, 0, 2, false);
                bwbVar3.P(0);
                int iS = bwbVar3.s() + 6;
                if (dekVar == null) {
                    cvbVar.p(iS, false);
                    return 0;
                }
                bwbVar3.L(iS);
                cvbVar.o(bwbVar3.b, 0, iS, false);
                bwbVar3.P(6);
                dqp dqpVar = dekVar.h;
                bwbVar3.K((byte[]) dqpVar.c, 0, 3);
                dqpVar.q(0);
                dqpVar.s(8);
                dekVar.c = dqpVar.u();
                dekVar.d = dqpVar.u();
                dqpVar.s(6);
                bwbVar3.K((byte[]) dqpVar.c, 0, dqpVar.i(8));
                dqpVar.q(0);
                dekVar.f = 0L;
                if (dekVar.c) {
                    dqpVar.s(4);
                    long jI = dqpVar.i(3);
                    dqpVar.s(r13);
                    int i9 = dqpVar.i(15) << 15;
                    dqpVar.s(r13);
                    long jI2 = dqpVar.i(15);
                    dqpVar.s(r13);
                    if (!dekVar.e && dekVar.d) {
                        dqpVar.s(4);
                        long jI3 = ((long) dqpVar.i(3)) << 30;
                        dqpVar.s(r13);
                        int i10 = dqpVar.i(15) << 15;
                        dqpVar.s(r13);
                        long jI4 = dqpVar.i(15);
                        dqpVar.s(r13);
                        dekVar.g.b(jI3 | ((long) i10) | jI4);
                        dekVar.e = r13;
                    }
                    dekVar.f = dekVar.g.b((jI << 30) | ((long) i9) | jI2);
                }
                if (dekVar.b) {
                    i = 4;
                    if (bwbVar3.d() >= 4) {
                        int iH = bwbVar3.h();
                        if ((iH < 128 || iH > 143) && (iH < 160 || iH > 167)) {
                            i = 4;
                        } else {
                            i = 4;
                            bwbVar3.Q(4);
                        }
                    }
                } else {
                    i = 4;
                }
                ddr ddrVar2 = dekVar.a;
                ddrVar2.e(dekVar.f, i);
                ddrVar2.a(bwbVar3);
                ddrVar2.d();
                bwbVar3.O(bwbVar3.e());
                return 0;
            }
            cvbVar.p(r13, r8);
        }
        return r8;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
