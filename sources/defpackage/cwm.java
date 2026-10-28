package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwm implements cvi {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = bwp.ah("#!AMR\n");
    private static final byte[] d = bwp.ah("#!AMR-WB\n");
    private final int f;
    private final cwj g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private long l;
    private int n;
    private long o;
    private cvk p;
    private cwj q;
    private cwj r;
    private cvz s;
    private boolean t;
    private long u;
    private boolean v;
    private final byte[] e = new byte[1];
    private int m = -1;

    public cwm(int i) {
        this.f = i;
        cvf cvfVar = new cvf();
        this.g = cvfVar;
        this.r = cvfVar;
    }

    private final int h(cvj cvjVar) throws bsz {
        if (this.k == 0) {
            try {
                cvjVar.k();
                byte[] bArr = this.e;
                ((cvb) cvjVar).n(bArr, 0, 1, false);
                byte b2 = bArr[0];
                if ((b2 & 131) > 0) {
                    throw new bsz(a.bR(b2, "Invalid padding bits for frame header "), null, true, 1);
                }
                boolean z = this.h;
                int i = (b2 >> 3) & 15;
                if (!z ? !(i < 12 || i > 14) : !(i < 10 || i > 13)) {
                    throw new bsz(a.cg(i, true != z ? "NB" : "WB", "Illegal AMR ", " frame type "), null, true, 1);
                }
                int i2 = z ? b[i] : a[i];
                this.j = i2;
                this.k = i2;
                int i3 = this.m;
                if (i3 == -1) {
                    this.l = ((cvb) cvjVar).b;
                    this.m = i2;
                    i3 = i2;
                }
                if (i3 == i2) {
                    this.n++;
                }
                cvz cvzVar = this.s;
                if (cvzVar instanceof cvt) {
                    cvt cvtVar = (cvt) cvzVar;
                    long j = this.o + this.i + 20000;
                    long j2 = ((cvb) cvjVar).b + ((long) i2);
                    if (!cvtVar.g(j)) {
                        cvtVar.f(j, j2);
                    }
                    if (this.t && k(j, this.u)) {
                        this.t = false;
                        this.r = this.q;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.r.a(cvjVar, this.k, true);
        if (iA == -1) {
            return -1;
        }
        int i4 = this.k - iA;
        this.k = i4;
        if (i4 <= 0) {
            this.r.e(this.o + this.i, 1, this.j, 0, null);
            this.i += 20000;
        }
        return 0;
    }

    private static boolean i(cvj cvjVar, byte[] bArr) {
        cvjVar.k();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((cvb) cvjVar).n(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean j(cvj cvjVar) {
        byte[] bArr = c;
        if (i(cvjVar, bArr)) {
            this.h = false;
            ((cvb) cvjVar).p(bArr.length, false);
            return true;
        }
        byte[] bArr2 = d;
        if (!i(cvjVar, bArr2)) {
            return false;
        }
        this.h = true;
        ((cvb) cvjVar).p(bArr2.length, false);
        return true;
    }

    private static final boolean k(long j, long j2) {
        return Math.abs(j2 - j) < 20000;
    }

    @Override // defpackage.cvi
    public final /* synthetic */ List a() {
        return agpi.a;
    }

    @Override // defpackage.cvi
    public final void b(cvk cvkVar) {
        this.p = cvkVar;
        cwj cwjVarS = cvkVar.s(0, 1);
        this.q = cwjVarS;
        this.r = cwjVarS;
        cvkVar.t();
    }

    @Override // defpackage.cvi
    public final void d(long j, long j2) {
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.u = j2;
        cvz cvzVar = this.s;
        if (!(cvzVar instanceof cvt)) {
            if (j == 0 || !(cvzVar instanceof cva)) {
                this.o = 0L;
                return;
            } else {
                this.o = ((cva) cvzVar).j(j);
                return;
            }
        }
        long jE = ((cvt) cvzVar).e(j);
        this.o = jE;
        if (k(jE, this.u)) {
            return;
        }
        this.t = true;
        this.r = this.g;
    }

    @Override // defpackage.cvi
    public final boolean e(cvj cvjVar) {
        return j(cvjVar);
    }

    @Override // defpackage.cvi
    public final int g(cvj cvjVar, qha qhaVar) throws bsz {
        int i;
        this.q.getClass();
        int i2 = bwp.a;
        cvb cvbVar = (cvb) cvjVar;
        if (cvbVar.b == 0 && !j(cvjVar)) {
            throw new bsz("Could not find AMR header.", null, true, 1);
        }
        if (!this.v) {
            this.v = true;
            boolean z = this.h;
            String str = true != z ? "audio/amr" : "audio/amr-wb";
            String str2 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i3 = true != z ? 8000 : 16000;
            int i4 = z ? b[8] : a[7];
            cwj cwjVar = this.q;
            bsd bsdVar = new bsd();
            bsdVar.a(str);
            bsdVar.e(str2);
            bsdVar.p = i4;
            bsdVar.G = 1;
            bsdVar.I = i3;
            cwjVar.b(new bse(bsdVar));
        }
        int iH = h(cvjVar);
        long j = cvbVar.a;
        if (this.s == null) {
            if (this.f == 0 || !((i = this.m) == -1 || i == this.j)) {
                this.s = new cvy(-9223372036854775807L, 0L);
            } else if (this.n >= 20 || iH == -1) {
                cva cvaVar = new cva(j, this.l, (int) ((((long) i) * 8000000) / 20000), i, false, true);
                this.s = cvaVar;
                cwj cwjVar2 = this.q;
                cvaVar.a();
                cwjVar2.f();
            }
            cvz cvzVar = this.s;
            if (cvzVar != null) {
                this.p.z(cvzVar);
            }
        }
        if (iH != -1) {
            return 0;
        }
        cvz cvzVar2 = this.s;
        if (!(cvzVar2 instanceof cvt)) {
            return -1;
        }
        ((cvt) cvzVar2).a = this.o + this.i;
        this.p.z(cvzVar2);
        this.q.f();
        return -1;
    }

    @Override // defpackage.cvi
    public final void c() {
    }

    @Override // defpackage.cvi
    public final /* synthetic */ void f() {
    }
}
