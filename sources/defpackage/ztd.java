package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ztd extends txl {
    public final zus N;
    public final zuj O;
    public int P;
    public final zvg Q;
    public final zvg R;
    public final zvg S;
    public final zvg T;
    public final zvg U;
    public final zvg V;
    public final zvg W;
    public final zvg X;
    public final zvg Y;
    public final zvg Z;
    public final zvg aa;
    public final zvg[] ab;
    public final CopyOnWriteArrayList ac;
    public long ad;
    public long ae;
    public boolean af;
    public boolean ag;
    private final zua ah;
    private txf ai;
    private final zvg aj;
    private final zvg ak;
    private long al;
    private long am;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztd(zua zuaVar, zus zusVar) {
        super(16, 0, zti.a, zusVar.F().l(8388608L));
        this.ah = zuaVar;
        this.N = zusVar;
        long jA = zusVar.a();
        this.am = jA;
        boolean zL = zusVar.F().l(4L);
        boolean z = !zL;
        zvg zvgVar = new zvg(true, jA, 2, zL);
        this.Q = zvgVar;
        zvg zvgVar2 = new zvg(z, jA, 1, zL);
        this.R = zvgVar2;
        int i = 1;
        zvg zvgVar3 = new zvg(false, jA, 2, zL);
        this.T = zvgVar3;
        zvg zvgVar4 = new zvg(false, jA, 2, zL);
        this.S = zvgVar4;
        zvg zvgVar5 = new zvg(false, jA, 2, zL);
        this.U = zvgVar5;
        zvg zvgVar6 = new zvg(false, jA, 2, zL);
        this.V = zvgVar6;
        zvg zvgVar7 = new zvg(false, jA, 2, zL);
        this.W = zvgVar7;
        zvg zvgVar8 = new zvg(false, jA, 2, zL);
        this.X = zvgVar8;
        zvg zvgVar9 = new zvg(false, jA, 2, zL);
        this.Y = zvgVar9;
        zvg zvgVar10 = new zvg(false, jA, 2, zL);
        this.Z = zvgVar10;
        zvg zvgVar11 = new zvg(false, jA, 2, zL);
        this.aj = zvgVar11;
        zvg zvgVar12 = new zvg(false, jA, 2, zL);
        this.aa = zvgVar12;
        zvg zvgVar13 = new zvg(false, jA, 2, zL);
        this.ak = zvgVar13;
        zvg[] zvgVarArr = {zvgVar, zvgVar2, zvgVar3, zvgVar4, zvgVar5, zvgVar6, zvgVar7, zvgVar8, zvgVar9, zvgVar10, zvgVar11, zvgVar12, zvgVar13};
        this.ab = zvgVarArr;
        if (zL) {
            for (int i2 = 0; i2 < 13; i2++) {
                zvgVarArr[i2].c(z, jA);
            }
        }
        zuj zujVar = new zuj();
        this.O = zujVar;
        this.ac = new CopyOnWriteArrayList();
        l(new zun(zujVar, i));
    }

    @Override // defpackage.txl
    public final txb D(txi txiVar) {
        int iB = (int) b(this.P, this.j);
        while (iB != 0) {
            int i = this.n;
            int i2 = (iB << 3) + ((char) i);
            int iC = (int) ((((Memory.peekByte(this.f + ((long) (i2 >> 3))) & 255) >>> (i2 & 7)) & 1) == 0 ? 0L : c(i2 + 1, (i >>> 16) - 1));
            if (iC != 0) {
                int i3 = this.o;
                int i4 = i3 & 7;
                long j = this.f + ((long) iB) + ((long) ((i3 >> 3) & 8191));
                int i5 = (1 << (i3 >>> 16)) - 1;
                if ((((Memory.peekByte(j) & 255) >>> i4) & i5) != 0) {
                    Memory.pokeByte(j, (byte) (Memory.peekByte(j) & (~(i5 << i4))));
                }
            }
            iB = iC;
        }
        return txb.a;
    }

    @Override // defpackage.txl
    public final txh E() {
        txg txgVar = new txg();
        txgVar.d(0);
        txgVar.b(this.N.A() - 3600000);
        txgVar.f();
        txgVar.e();
        txgVar.g();
        txgVar.c(160);
        txgVar.d(12);
        txgVar.h();
        return txgVar.a();
    }

    @Override // defpackage.txl
    public final boolean N(boolean z) {
        if (this.m && this.h != 2) {
            throw new IllegalStateException("mmcb !loaded");
        }
        this.P = this.t;
        this.ai = new txf(this, SemanticState.ReadOnly, 65615);
        return z;
    }

    @Override // defpackage.txl
    public final txk[] P() {
        return new txk[]{new txk(this.P, 10)};
    }

    public final File T() {
        return this.N.F().i();
    }

    final void U(int i, long j) {
        ztd ztdVar;
        if ((i & 16777216) == 0 && (j > this.al || this.T.c)) {
            V(j);
        }
        zuj zujVar = this.O;
        long jA = this.T.a(j);
        aihf aihfVar = zujVar.b;
        aihfVar.copyOnWrite();
        akkr akkrVar = (akkr) aihfVar.instance;
        akkr akkrVar2 = akkr.a;
        akkrVar.b |= 1073741824;
        akkrVar.J = jA;
        long jA2 = this.Q.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar3 = (akkr) aihfVar.instance;
        akkrVar3.b |= Integer.MIN_VALUE;
        akkrVar3.K = jA2;
        long jA3 = this.U.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar4 = (akkr) aihfVar.instance;
        akkrVar4.c |= 1;
        akkrVar4.L = jA3;
        long jA4 = this.R.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar5 = (akkr) aihfVar.instance;
        akkrVar5.c |= 2;
        akkrVar5.M = jA4;
        long jA5 = this.S.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar6 = (akkr) aihfVar.instance;
        akkrVar6.c |= 4;
        akkrVar6.N = jA5;
        long jA6 = this.V.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar7 = (akkr) aihfVar.instance;
        akkrVar7.c |= 8;
        akkrVar7.O = jA6;
        long jA7 = this.W.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar8 = (akkr) aihfVar.instance;
        akkrVar8.c |= 16;
        akkrVar8.P = jA7;
        long jA8 = this.X.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar9 = (akkr) aihfVar.instance;
        akkrVar9.c |= 32;
        akkrVar9.Q = jA8;
        long jA9 = this.Y.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar10 = (akkr) aihfVar.instance;
        akkrVar10.c |= 64;
        akkrVar10.R = jA9;
        long jA10 = this.Z.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar11 = (akkr) aihfVar.instance;
        akkrVar11.c |= SemanticState.Focused;
        akkrVar11.S = jA10;
        long jA11 = this.aa.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar12 = (akkr) aihfVar.instance;
        akkrVar12.c |= SemanticState.Hidden;
        akkrVar12.T = jA11;
        long jA12 = this.aj.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar13 = (akkr) aihfVar.instance;
        akkrVar13.c |= SemanticState.LiveRegion;
        akkrVar13.U = jA12;
        long jA13 = this.ak.a(j);
        aihfVar.copyOnWrite();
        akkr akkrVar14 = (akkr) aihfVar.instance;
        akkrVar14.c |= SemanticState.ReadOnly;
        akkrVar14.V = jA13;
        long j2 = akkrVar14.W + (j - this.am);
        aihfVar.copyOnWrite();
        akkr akkrVar15 = (akkr) aihfVar.instance;
        akkrVar15.c |= SemanticState.Obscured;
        akkrVar15.W = j2;
        this.am = j;
        if (this.h == 2) {
            txf txfVar = this.ai;
            int i2 = this.P;
            int i3 = this.k;
            int iC = (int) c((i2 << 3) + ((char) i3), i3 >>> 16);
            aihf aihfVarCreateBuilder = atpo.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            atpo atpoVar = (atpo) aihfVarCreateBuilder.instance;
            akkr akkrVar16 = (akkr) aihfVar.build();
            akkrVar16.getClass();
            atpoVar.d = akkrVar16;
            atpoVar.b |= 1;
            Iterator it = this.ah.iterator();
            while (it.hasNext()) {
                aihf aihfVar2 = ((zsz) it.next()).j.f;
                aihfVarCreateBuilder.copyOnWrite();
                atpo atpoVar2 = (atpo) aihfVarCreateBuilder.instance;
                akkq akkqVar = (akkq) aihfVar2.build();
                akkqVar.getClass();
                aiie aiieVar = atpoVar2.c;
                if (!aiieVar.c()) {
                    atpoVar2.c = aihn.mutableCopy(aiieVar);
                }
                atpoVar2.c.add(akkqVar);
            }
            txfVar.d(((atpo) aihfVarCreateBuilder.build()).toByteString(), Alert.DURATION_SHOW_INDEFINITELY);
            int i4 = txfVar.b + 10;
            int i5 = 0;
            int iB = 0;
            while (true) {
                if (i5 < 2) {
                    ztdVar = this;
                    iB = ztdVar.B(i4, 0L, 10, 0);
                    if (iB > 0) {
                        break;
                    }
                    long j3 = ((akkr) aihfVar.instance).aV + 1;
                    aihfVar.copyOnWrite();
                    akkr akkrVar17 = (akkr) aihfVar.instance;
                    akkrVar17.d |= 131072;
                    akkrVar17.aV = j3;
                    i5++;
                    this = ztdVar;
                } else {
                    ztdVar = this;
                    break;
                }
            }
            if (iB <= 0) {
                ztdVar.q();
                return;
            }
            txfVar.f(iB, 10);
            int i6 = ztdVar.o;
            int i7 = i6 >> 3;
            int i8 = i6 >>> 16;
            int i9 = i6 & 7;
            int i10 = (1 << i8) - 1;
            long j4 = ztdVar.f + ((long) iB) + ((long) (i7 & 8191));
            Memory.pokeByte(j4, (byte) ((Memory.peekByte(j4) & (~(i10 << i9))) | ((i10 & 1) << i9)));
            ztdVar.G(iB, i2, 10);
            if (iC != 0) {
                int i11 = ztdVar.o;
                long j5 = ztdVar.f + ((long) iC) + ((long) ((i11 >> 3) & 8191));
                Memory.pokeByte(j5, (byte) (Memory.peekByte(j5) & (~(((1 << (i11 >>> 16)) - 1) << (i11 & 7)))));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
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
    final void V(long j) {
        long freeSpace = 0;
        if (this.ad > 0) {
            try {
                freeSpace = T().getFreeSpace();
            } catch (Exception unused) {
            }
            this.T.f((freeSpace > this.ad ? 1 : (freeSpace == this.ad ? 0 : -1)) >>> 31, j);
            this.al = j + this.ae;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0241  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:90:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.txl, com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public final txb d() throws Throwable {
        int i;
        aigj aigjVarJ;
        atpo atpoVar;
        akkr akkrVar;
        int iBi;
        zsz[] zszVarArr;
        int length;
        zsz zszVar;
        txl txlVar;
        int i2;
        aihf aihfVar = this.O.b;
        aihfVar.clear();
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (super.d() == txb.a) {
                Iterator it = this.ah.iterator();
                while (it.hasNext()) {
                    zui zuiVar = ((zsz) it.next()).j;
                    aihf aihfVar2 = zuiVar.f;
                    aihfVar2.clear();
                    int i5 = zuiVar.e;
                    aihfVar2.copyOnWrite();
                    akkq akkqVar = (akkq) aihfVar2.instance;
                    akkq akkqVar2 = akkq.a;
                    akkqVar.g = i5 - 1;
                    akkqVar.b |= 1;
                }
                int i6 = this.P;
                int i7 = this.k;
                int i8 = i6 << 3;
                int iC = (int) c(((char) i7) + i8, i7 >>> 16);
                int iB = (int) b(i6, this.j);
                while (true) {
                    long jC = 0;
                    if (iB == 0 || iB == iC) {
                        break;
                    }
                    int i9 = this.o;
                    long j = this.f + ((long) iB) + ((long) ((i9 >> 3) & 8191));
                    Memory.pokeByte(j, (byte) (Memory.peekByte(j) & (~(((1 << (i9 >>> 16)) - 1) << (i9 & 7)))));
                    int i10 = this.n;
                    int i11 = (iB << 3) + ((char) i10);
                    if ((((Memory.peekByte(this.f + ((long) (i11 >> 3))) & 255) >>> (i11 & 7)) & 1) != 0) {
                        jC = c(i11 + 1, (i10 >>> 16) - 1);
                    }
                    iB = (int) jC;
                }
                if (iC > 0) {
                    txf txfVar = this.ai;
                    txfVar.getClass();
                    txfVar.c(iC, 10);
                    int i12 = iC << 3;
                    txl txlVar2 = txfVar.c;
                    int i13 = txlVar2.q;
                    if (((int) txlVar2.c(((char) i13) + i12, i13 >>> 16)) != 10) {
                        i = 1;
                        int i14 = txlVar2.q;
                        int iC2 = ((int) txlVar2.c(i12 + ((char) i14), i14 >>> 16)) - 10;
                        if (iC2 > 0) {
                            byte[] bArr = new byte[iC2];
                            txlVar2.t(iC + 10, bArr, iC2);
                            aigj aigjVar = aigj.d;
                            try {
                                aigjVarJ = aigj.J(bArr);
                                txlVar = txfVar.c;
                                i2 = txfVar.a;
                                if ((((i << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + ((long) iC)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) != 0) {
                                    super.I(txb.n);
                                }
                                if (aigjVarJ != null) {
                                    atpoVar = (atpo) aihn.parseFrom(atpo.a, aigjVarJ, ExtensionRegistryLite.getGeneratedRegistry());
                                    TimeUnit.MINUTES.toMillis(c((this.P << 3) + 49, 61));
                                } else {
                                    atpoVar = null;
                                }
                                if (atpoVar != null) {
                                    zuj zujVar = this.O;
                                    akkrVar = atpoVar.d;
                                    if (akkrVar == null) {
                                        akkrVar = akkr.a;
                                    }
                                    zujVar.b.mergeFrom((aihn) akkrVar);
                                    for (akkq akkqVar3 : atpoVar.c) {
                                        zua zuaVar = this.ah;
                                        iBi = a.bi(akkqVar3.g);
                                        if (iBi == 0) {
                                            iBi = i;
                                        }
                                        zszVarArr = zuaVar.a;
                                        length = zszVarArr.length;
                                        do {
                                            length--;
                                            if (length < 0) {
                                                zszVar = null;
                                                break;
                                            }
                                            zszVar = zszVarArr[length];
                                        } while (zszVar.k != iBi);
                                        if (zszVar != null) {
                                            zszVar.j.f.mergeFrom((aihn) akkqVar3);
                                        }
                                    }
                                }
                                if (i3 != 0) {
                                    aihf aihfVar3 = this.O.b;
                                    aihfVar3.copyOnWrite();
                                    akkr akkrVar2 = (akkr) aihfVar3.instance;
                                    akkr akkrVar3 = akkr.a;
                                    akkrVar2.b |= 268435456;
                                    akkrVar2.H = i;
                                }
                                return txb.a;
                            } catch (aiik e) {
                                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                            }
                        }
                        super.I(txb.I);
                    } else {
                        if (txlVar2.a != null) {
                            try {
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(txfVar.b(iC));
                                    try {
                                        aigjVarJ = aigj.I(fileInputStream);
                                        if (txlVar2.O()) {
                                            int iD = aigjVarJ.d();
                                            int i15 = 1;
                                            long jA = 0;
                                            while (i15 <= 8) {
                                                jA = (jA << 8) | ((long) (aigjVarJ.a(iD - i15) & 255));
                                                i15++;
                                                i4 = i4;
                                            }
                                            i = i4;
                                            try {
                                                aigjVarJ = aigjVarJ.e(0, iD - 8);
                                                if (txl.s(aigjVarJ) != jA) {
                                                    super.I(txb.J);
                                                    fileInputStream.close();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                try {
                                                    fileInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                    throw th2;
                                                }
                                            }
                                        } else {
                                            i = 1;
                                        }
                                        fileInputStream.close();
                                        txlVar = txfVar.c;
                                        i2 = txfVar.a;
                                        if ((((i << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + ((long) iC)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) != 0 && (aigjVarJ = MemoryMappedBuffer.e(aigjVarJ)) == null) {
                                            super.I(txb.n);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i = i4;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 1;
                                    super.I(txb.r);
                                    e.getMessage();
                                }
                            } catch (Exception e3) {
                                e = e3;
                                super.I(txb.r);
                                e.getMessage();
                                aigjVarJ = null;
                                if (aigjVarJ != null) {
                                    try {
                                        atpoVar = (atpo) aihn.parseFrom(atpo.a, aigjVarJ, ExtensionRegistryLite.getGeneratedRegistry());
                                    } catch (aiik unused) {
                                        k(i6, this.j, 0L);
                                        int i16 = this.k;
                                        w(i8 + ((char) i16), i16 >>> 16, 0L);
                                        i3 = i;
                                        atpoVar = null;
                                    }
                                    TimeUnit.MINUTES.toMillis(c((this.P << 3) + 49, 61));
                                } else {
                                    atpoVar = null;
                                }
                                if (atpoVar != null) {
                                    zuj zujVar2 = this.O;
                                    akkrVar = atpoVar.d;
                                    if (akkrVar == null) {
                                        akkrVar = akkr.a;
                                    }
                                    zujVar2.b.mergeFrom((aihn) akkrVar);
                                    while (r0.hasNext()) {
                                        zua zuaVar2 = this.ah;
                                        iBi = a.bi(akkqVar3.g);
                                        if (iBi == 0) {
                                            iBi = i;
                                        }
                                        zszVarArr = zuaVar2.a;
                                        length = zszVarArr.length;
                                        do {
                                            length--;
                                            if (length < 0) {
                                                zszVar = null;
                                                break;
                                            }
                                            zszVar = zszVarArr[length];
                                        } while (zszVar.k != iBi);
                                        if (zszVar != null) {
                                            zszVar.j.f.mergeFrom((aihn) akkqVar3);
                                        }
                                    }
                                }
                                if (i3 != 0) {
                                    aihf aihfVar4 = this.O.b;
                                    aihfVar4.copyOnWrite();
                                    akkr akkrVar4 = (akkr) aihfVar4.instance;
                                    akkr akkrVar5 = akkr.a;
                                    akkrVar4.b |= 268435456;
                                    akkrVar4.H = i;
                                }
                                return txb.a;
                            }
                            if (aigjVarJ != null) {
                                atpoVar = (atpo) aihn.parseFrom(atpo.a, aigjVarJ, ExtensionRegistryLite.getGeneratedRegistry());
                                TimeUnit.MINUTES.toMillis(c((this.P << 3) + 49, 61));
                            } else {
                                atpoVar = null;
                            }
                            if (atpoVar != null) {
                                zuj zujVar3 = this.O;
                                akkrVar = atpoVar.d;
                                if (akkrVar == null) {
                                    akkrVar = akkr.a;
                                }
                                zujVar3.b.mergeFrom((aihn) akkrVar);
                                while (r0.hasNext()) {
                                    zua zuaVar3 = this.ah;
                                    iBi = a.bi(akkqVar3.g);
                                    if (iBi == 0) {
                                        iBi = i;
                                    }
                                    zszVarArr = zuaVar3.a;
                                    length = zszVarArr.length;
                                    do {
                                        length--;
                                        if (length < 0) {
                                            zszVar = null;
                                            break;
                                        }
                                        zszVar = zszVarArr[length];
                                    } while (zszVar.k != iBi);
                                    if (zszVar != null) {
                                        zszVar.j.f.mergeFrom((aihn) akkqVar3);
                                    }
                                }
                            }
                            if (i3 != 0) {
                                aihf aihfVar5 = this.O.b;
                                aihfVar5.copyOnWrite();
                                akkr akkrVar6 = (akkr) aihfVar5.instance;
                                akkr akkrVar7 = akkr.a;
                                akkrVar6.b |= 268435456;
                                akkrVar6.H = i;
                            }
                            return txb.a;
                        }
                        i = 1;
                        aigjVarJ = (aigj) txfVar.a().get(iC);
                        if (aigjVarJ != null) {
                            txlVar = txfVar.c;
                            i2 = txfVar.a;
                            if ((((i << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + ((long) iC)) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) != 0) {
                                super.I(txb.n);
                            }
                            if (aigjVarJ != null) {
                                atpoVar = (atpo) aihn.parseFrom(atpo.a, aigjVarJ, ExtensionRegistryLite.getGeneratedRegistry());
                                TimeUnit.MINUTES.toMillis(c((this.P << 3) + 49, 61));
                            } else {
                                atpoVar = null;
                            }
                            if (atpoVar != null) {
                                zuj zujVar4 = this.O;
                                akkrVar = atpoVar.d;
                                if (akkrVar == null) {
                                    akkrVar = akkr.a;
                                }
                                zujVar4.b.mergeFrom((aihn) akkrVar);
                                while (r0.hasNext()) {
                                    zua zuaVar4 = this.ah;
                                    iBi = a.bi(akkqVar3.g);
                                    if (iBi == 0) {
                                        iBi = i;
                                    }
                                    zszVarArr = zuaVar4.a;
                                    length = zszVarArr.length;
                                    do {
                                        length--;
                                        if (length < 0) {
                                            zszVar = null;
                                            break;
                                        }
                                        zszVar = zszVarArr[length];
                                    } while (zszVar.k != iBi);
                                    if (zszVar != null) {
                                        zszVar.j.f.mergeFrom((aihn) akkqVar3);
                                    }
                                }
                            }
                            if (i3 != 0) {
                                aihf aihfVar6 = this.O.b;
                                aihfVar6.copyOnWrite();
                                akkr akkrVar8 = (akkr) aihfVar6.instance;
                                akkr akkrVar9 = akkr.a;
                                akkrVar8.b |= 268435456;
                                akkrVar8.H = i;
                            }
                            return txb.a;
                        }
                        super.I(txb.p);
                    }
                } else {
                    i = 1;
                }
                aigjVarJ = null;
                if (aigjVarJ != null) {
                    atpoVar = (atpo) aihn.parseFrom(atpo.a, aigjVarJ, ExtensionRegistryLite.getGeneratedRegistry());
                    TimeUnit.MINUTES.toMillis(c((this.P << 3) + 49, 61));
                } else {
                    atpoVar = null;
                }
                if (atpoVar != null) {
                    zuj zujVar5 = this.O;
                    akkrVar = atpoVar.d;
                    if (akkrVar == null) {
                        akkrVar = akkr.a;
                    }
                    zujVar5.b.mergeFrom((aihn) akkrVar);
                    while (r0.hasNext()) {
                        zua zuaVar5 = this.ah;
                        iBi = a.bi(akkqVar3.g);
                        if (iBi == 0) {
                            iBi = i;
                        }
                        zszVarArr = zuaVar5.a;
                        length = zszVarArr.length;
                        do {
                            length--;
                            if (length < 0) {
                                zszVar = null;
                                break;
                            }
                            zszVar = zszVarArr[length];
                        } while (zszVar.k != iBi);
                        if (zszVar != null) {
                            zszVar.j.f.mergeFrom((aihn) akkqVar3);
                        }
                    }
                }
                if (i3 != 0) {
                    aihf aihfVar7 = this.O.b;
                    aihfVar7.copyOnWrite();
                    akkr akkrVar10 = (akkr) aihfVar7.instance;
                    akkr akkrVar11 = akkr.a;
                    akkrVar10.b |= 268435456;
                    akkrVar10.H = i;
                }
                return txb.a;
            }
            if (!o() || i3 != 0) {
                aihfVar.copyOnWrite();
                akkr akkrVar12 = (akkr) aihfVar.instance;
                akkr akkrVar13 = akkr.a;
                akkrVar12.b |= 536870912;
                akkrVar12.I = true;
                return txb.o;
            }
            i3 = 1;
        }
    }

    @Override // com.google.android.libraries.youtube.common.util.MemoryMappedBuffer
    public final boolean q() {
        if (this.h == 3) {
            return false;
        }
        this.P = 0;
        this.ai = null;
        return super.q();
    }
}
