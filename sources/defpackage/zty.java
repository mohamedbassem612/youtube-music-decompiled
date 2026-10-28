package defpackage;

import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zty {
    private int A;
    public final zuo a;
    public final int b;
    public final zud c;
    public final zsz d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;
    public final long i;
    public int j;
    public long k;
    public long l;
    public boolean m;
    boolean n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    private final zsu w;
    private final ztm x;
    private final int y;
    private final long z;

    public zty(zsu zsuVar, zuo zuoVar, int i) {
        int i2 = zuoVar.h;
        int i3 = zuoVar.o;
        long j = zuoVar.f;
        this.w = zsuVar;
        this.a = zuoVar;
        this.b = i;
        ztm ztmVar = zuoVar.O;
        this.x = ztmVar;
        zuoVar.Y();
        zuoVar.Z();
        zud zudVar = zuoVar.aj;
        this.c = zudVar;
        this.u = 1;
        this.z = zudVar.f(i);
        int iA = zudVar.a(i);
        this.h = iA;
        zudVar.k(i);
        int i4 = i << 3;
        this.i = zudVar.d(i, zudVar.i.c(i4 + 78, 18), 60000);
        zudVar.k(i);
        long j2 = i;
        this.j = Memory.peekByte(zudVar.i.f + j2 + 12) & 63;
        zudVar.k(i);
        this.m = 1 == ((Memory.peekByte((zudVar.i.f + j2) + 12) & 255) >>> 7);
        this.n = zudVar.l(i);
        this.v = 1;
        this.s = -1;
        this.o = 0;
        this.p = -1;
        zudVar.k(i);
        zuo zuoVar2 = zudVar.i;
        int i5 = zud.a;
        long jB = zuoVar2.b(i, i5);
        long jD = jB == 0 ? 0L : zudVar.d(i, jB - 1, 1000);
        zus zusVar = ztmVar.d;
        long jA = zusVar.A();
        if (jD != 0 && (jD <= jA - 3888000000L || jD > jA)) {
            zudVar.k(i);
            zudVar.i();
            zudVar.i.k(i, i5, 0L);
            jD = 0;
        }
        this.k = jD != 0 ? zusVar.y(jD) : 0L;
        this.A = a(ztmVar.j, iA, this.j);
        zuo zuoVar3 = zudVar.i;
        int i6 = zud.b;
        int iC = (int) zuoVar3.c(i4 + ((char) i6), i6 >>> 16);
        zuoVar3.W(iC);
        int i7 = iC == 0 ? 0 : (iC + zuoVar3.ab) - 1;
        this.y = i7;
        zuoVar.V(i7);
        zuoVar.ad(i7);
        this.e = (zuoVar.R && i7 == zuoVar.V) ? zuoVar.S : zuoVar.f(zuoVar.ag + i7, 0, StandardCharsets.UTF_8);
        zuoVar.ad(i7);
        this.f = (zuoVar.R && i7 == zuoVar.V) ? zuoVar.T : zuoVar.f(zuoVar.ag + i7, 1, StandardCharsets.UTF_8);
        zuoVar.ad(i7);
        this.g = ((int) zuoVar.c(((zuoVar.af + i7) << 3) + 14, 1)) == 1;
        zua zuaVar = ztmVar.e;
        zuoVar.ad(i7);
        int iC2 = (int) zuoVar.c((i7 << 3) + 39, 8);
        zuoVar.af(i7, iC2);
        this.d = zuaVar.a(iC2);
    }

    static int a(ztr ztrVar, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        double dA = ((double) ztrVar.x.a(i)) * Math.pow(ztrVar.y.a(i), i2 - 1);
        int iA = ztrVar.w.a(i);
        return dA <= ((double) iA) ? (int) dA : iA;
    }

    final long b() {
        return this.k + (((long) this.A) * 1000);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01df  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    public final agke c() {
        int[] iArr;
        int i;
        long j;
        aigj aigjVarZ;
        long j2;
        txl txlVar;
        int i2;
        aigj aigjVar;
        aigj aigjVarE;
        e("getEvents");
        zud zudVar = this.c;
        int i3 = this.b;
        int[] iArr2 = zudVar.g(i3).a;
        zui zuiVar = this.d.j;
        byte b = -1;
        long j3 = 1;
        if (iArr2 == null) {
            aihf aihfVar = zuiVar.f;
            long j4 = ((akkq) aihfVar.instance).ag + 1;
            aihfVar.copyOnWrite();
            akkq akkqVar = (akkq) aihfVar.instance;
            akkqVar.d |= 524288;
            akkqVar.ag = j4;
            zudVar.j();
            zudVar.k(i3);
            zuo zuoVar = zudVar.i;
            int i4 = zud.c;
            long jC = ((akkq) aihfVar.instance).ah + ((long) ((int) zuoVar.c((i3 << 3) + ((char) i4), i4 >>> 16)));
            aihfVar.copyOnWrite();
            akkq akkqVar2 = (akkq) aihfVar.instance;
            akkqVar2.d |= 1048576;
            akkqVar2.ah = jC;
            this.o = 0;
            this.p = -1;
            return agpi.a;
        }
        ztm ztmVar = this.x;
        agjz agjzVarF = agke.f(iArr2.length);
        int i5 = this.j;
        long jA = ztmVar.d.A() - ztmVar.j.aa;
        int i6 = 0;
        int iD = 0;
        while (i6 < iArr2.length) {
            int i7 = iArr2[i6];
            zuo zuoVar2 = this.a;
            int i8 = i7 << 3;
            long j5 = j3;
            byte b2 = b;
            long j6 = zuoVar2.G;
            int i9 = zuoVar2.r;
            long jC2 = j6 + zuoVar2.c(((char) i9) + i8, i9 >>> 16);
            if (zuoVar2.W || jC2 >= jA) {
                if (i5 > 0) {
                    if ((((Memory.peekByte((zuoVar2.f + ((long) i7)) + 9) & 255) >>> 6) & 1) != 1) {
                        aihf aihfVar2 = zuiVar.f;
                        long j7 = ((akkq) aihfVar2.instance).an + j5;
                        aihfVar2.copyOnWrite();
                        akkq akkqVar3 = (akkq) aihfVar2.instance;
                        akkqVar3.d |= 67108864;
                        akkqVar3.an = j7;
                    }
                    i6++;
                    j3 = j5;
                    b = b2;
                    iArr2 = iArr;
                    i5 = i;
                    jA = j;
                }
                txf txfVar = zuoVar2.ai;
                int i10 = zuoVar2.ah;
                txl txlVar2 = txfVar.c;
                txfVar.c(i7, i10);
                iArr = iArr2;
                int i11 = txlVar2.q;
                i = i5;
                j = jA;
                if (((int) txlVar2.c(((char) i11) + i8, i11 >>> 16)) != i10) {
                    int i12 = txlVar2.q;
                    int iC = ((int) txlVar2.c(i8 + ((char) i12), i12 >>> 16)) - i10;
                    if (iC <= 0) {
                        txlVar2.I(txb.I);
                    } else {
                        byte[] bArr = new byte[iC];
                        txlVar2.t(i10 + i7, bArr, iC);
                        aigjVarZ = aigj.z(bArr);
                        j2 = i7;
                        txlVar = txfVar.c;
                        i2 = txfVar.a;
                        if ((((1 << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + j2) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) != 0) {
                            aigjVarE = MemoryMappedBuffer.e(aigjVarZ);
                            if (aigjVarE == null) {
                                txlVar.I(txb.n);
                            } else {
                                aigjVar = aigjVarE;
                            }
                        } else {
                            aigjVar = aigjVarZ;
                        }
                        if (aigjVar == null) {
                            aihf aihfVar3 = zuiVar.f;
                            long j8 = ((akkq) aihfVar3.instance).ao + j5;
                            aihfVar3.copyOnWrite();
                            akkq akkqVar4 = (akkq) aihfVar3.instance;
                            akkqVar4.d |= 134217728;
                            akkqVar4.ao = j8;
                        } else {
                            iD += aigjVar.d();
                            agjzVarF.h(new zuq(aigjVar, jC2));
                        }
                        i6++;
                        j3 = j5;
                        b = b2;
                        iArr2 = iArr;
                        i5 = i;
                        jA = j;
                    }
                } else if (txlVar2.a != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(txfVar.b(i7));
                        try {
                            aigjVarZ = aigj.I(fileInputStream);
                            if (txlVar2.O()) {
                                int iD2 = aigjVarZ.d();
                                long jA2 = 0;
                                int i13 = 1;
                                while (i13 <= 8) {
                                    jA2 = (jA2 << 8) | ((long) (aigjVarZ.a(iD2 - i13) & 255));
                                    i13++;
                                    iD2 = iD2;
                                }
                                aigjVarZ = aigjVarZ.e(0, iD2 - 8);
                                if (txl.s(aigjVarZ) != jA2) {
                                    txlVar2.I(txb.J);
                                    fileInputStream.close();
                                }
                            }
                            fileInputStream.close();
                            j2 = i7;
                            txlVar = txfVar.c;
                            i2 = txfVar.a;
                            if ((((1 << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + j2) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) != 0) {
                                aigjVarE = MemoryMappedBuffer.e(aigjVarZ);
                                if (aigjVarE == null) {
                                    txlVar.I(txb.n);
                                } else {
                                    aigjVar = aigjVarE;
                                }
                            } else {
                                aigjVar = aigjVarZ;
                            }
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        txfVar.c.I(txb.r);
                        e.getMessage();
                    }
                    if (aigjVar == null) {
                        aihf aihfVar4 = zuiVar.f;
                        long j9 = ((akkq) aihfVar4.instance).ao + j5;
                        aihfVar4.copyOnWrite();
                        akkq akkqVar5 = (akkq) aihfVar4.instance;
                        akkqVar5.d |= 134217728;
                        akkqVar5.ao = j9;
                    } else {
                        iD += aigjVar.d();
                        agjzVarF.h(new zuq(aigjVar, jC2));
                    }
                    i6++;
                    j3 = j5;
                    b = b2;
                    iArr2 = iArr;
                    i5 = i;
                    jA = j;
                } else {
                    aigjVarZ = (aigj) txfVar.a().get(i7);
                    if (aigjVarZ == null) {
                        txfVar.c.I(txb.p);
                    } else {
                        j2 = i7;
                        txlVar = txfVar.c;
                        i2 = txfVar.a;
                        if ((((1 << (i2 >>> 16)) - 1) & ((Memory.peekByte((txlVar.f + j2) + ((long) ((i2 >> 3) & 8191))) & 255) >>> (i2 & 7))) != 0) {
                            aigjVarE = MemoryMappedBuffer.e(aigjVarZ);
                            if (aigjVarE == null) {
                                txlVar.I(txb.n);
                            } else {
                                aigjVar = aigjVarE;
                            }
                        } else {
                            aigjVar = aigjVarZ;
                        }
                        if (aigjVar == null) {
                            aihf aihfVar5 = zuiVar.f;
                            long j10 = ((akkq) aihfVar5.instance).ao + j5;
                            aihfVar5.copyOnWrite();
                            akkq akkqVar6 = (akkq) aihfVar5.instance;
                            akkqVar6.d |= 134217728;
                            akkqVar6.ao = j10;
                        } else {
                            iD += aigjVar.d();
                            agjzVarF.h(new zuq(aigjVar, jC2));
                        }
                        i6++;
                        j3 = j5;
                        b = b2;
                        iArr2 = iArr;
                        i5 = i;
                        jA = j;
                    }
                }
                aigjVar = null;
                if (aigjVar == null) {
                    aihf aihfVar6 = zuiVar.f;
                    long j11 = ((akkq) aihfVar6.instance).ao + j5;
                    aihfVar6.copyOnWrite();
                    akkq akkqVar7 = (akkq) aihfVar6.instance;
                    akkqVar7.d |= 134217728;
                    akkqVar7.ao = j11;
                } else {
                    iD += aigjVar.d();
                    agjzVarF.h(new zuq(aigjVar, jC2));
                }
                i6++;
                j3 = j5;
                b = b2;
                iArr2 = iArr;
                i5 = i;
                jA = j;
            } else {
                aihf aihfVar7 = zuiVar.f;
                long j12 = ((akkq) aihfVar7.instance).al + j5;
                aihfVar7.copyOnWrite();
                akkq akkqVar8 = (akkq) aihfVar7.instance;
                akkqVar8.d |= 16777216;
                akkqVar8.al = j12;
            }
            iArr = iArr2;
            i = i5;
            j = jA;
            i6++;
            j3 = j5;
            b = b2;
            iArr2 = iArr;
            i5 = i;
            jA = j;
        }
        agke agkeVarG = agjzVarF.g();
        this.o = iD;
        this.p = ((agpi) agkeVarG).d;
        return agkeVarG;
    }

    public final akku d() {
        return zvb.e(this.h);
    }

    public void e(String str) {
        if (zti.a) {
            zuo zuoVar = this.a;
            int i = zuoVar.h;
            int i2 = zuoVar.o;
            long j = zuoVar.f;
            this.c.f(this.b);
        }
    }

    final void f(boolean z) {
        e("inFlight");
        this.n = z;
        if (i()) {
            zud zudVar = this.c;
            int i = this.b;
            int i2 = zud.f;
            int i3 = i2 >> 3;
            long j = zudVar.i.f + ((long) i);
            int i4 = i2 >>> 16;
            int i5 = i2 & 7;
            int i6 = (1 << i4) - 1;
            long j2 = j + ((long) (i3 & 8191));
            Memory.pokeByte(j2, (byte) ((Memory.peekByte(j2) & (~(i6 << i5))) | (((z ? 1 : 0) & i6) << i5)));
        }
    }

    public final void g(Object obj) {
        zsu zsuVar = this.w;
        ztz ztzVar = new ztz(this, obj, zsuVar.p);
        szn sznVar = zsuVar.d;
        sznVar.c(ztzVar, sznVar.b.b());
    }

    final void h(long j) {
        e("retryBaseline");
        this.k = j;
        if (i()) {
            zud zudVar = this.c;
            int i = this.b;
            long jW = j == 0 ? 0L : this.x.d.w(j);
            zudVar.k(i);
            zudVar.i();
            zudVar.i.k(i, zud.a, jW != 0 ? 1 + zudVar.e(i, jW, 1000) : 0L);
        }
    }

    final boolean i() {
        zuo zuoVar = this.a;
        zuoVar.N.E();
        if (this.u != 1) {
            return false;
        }
        if (zuoVar.h != 2) {
            this.u = 5;
            aihf aihfVar = this.d.j.f;
            long j = ((akkq) aihfVar.instance).ap + 1;
            aihfVar.copyOnWrite();
            akkq akkqVar = (akkq) aihfVar.instance;
            akkqVar.d |= 268435456;
            akkqVar.ap = j;
            return false;
        }
        if (this.c.c(this.b, this.z) != 0) {
            return true;
        }
        this.u = 4;
        aihf aihfVar2 = this.d.j.f;
        long j2 = ((akkq) aihfVar2.instance).aq + 1;
        aihfVar2.copyOnWrite();
        akkq akkqVar2 = (akkq) aihfVar2.instance;
        akkqVar2.d |= 536870912;
        akkqVar2.aq = j2;
        return false;
    }

    final void j(zsy zsyVar) {
        if (i()) {
            if (zsyVar != null) {
                zsyVar.a.run();
                int iC = this.p;
                if (iC == -1) {
                    zud zudVar = this.c;
                    int i = this.b;
                    zudVar.j();
                    zudVar.k(i);
                    int i2 = zud.c;
                    iC = (int) zudVar.i.c((i << 3) + ((char) i2), i2 >>> 16);
                }
                zsyVar.b.accept(iC);
            }
            f(false);
            zud zudVar2 = this.c;
            int i3 = this.b;
            long j = this.z;
            zudVar2.j();
            int iC2 = zudVar2.c(i3, j);
            if (iC2 != 0) {
                ahno.O(iC2 != 3);
                int[] iArr = zudVar2.g(i3).a;
                zudVar2.h(i3, iArr, iArr != null ? iArr.length : 0, 0);
            }
            this.u = 2;
        }
    }

    final void k(long j) {
        if (i()) {
            h(j);
            this.l = 0L;
            f(false);
            if (this.q) {
                this.q = false;
            } else {
                int i = this.j + 1;
                e("setRequestCount");
                this.j = i;
                if (i()) {
                    zud zudVar = this.c;
                    int i2 = this.b;
                    zudVar.k(i2);
                    zudVar.i();
                    long j2 = zudVar.i.f + ((long) i2) + 12;
                    Memory.pokeByte(j2, (byte) ((Memory.peekByte(j2) & (-64)) | (i & 63)));
                }
            }
            this.A = a(this.x.j, this.h, this.j);
            this.r = 0;
            this.v = 1;
            this.s = -1;
        }
    }
}
