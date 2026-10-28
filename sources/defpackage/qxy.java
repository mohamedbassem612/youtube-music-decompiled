package defpackage;

import android.media.AudioDeviceInfo;
import android.util.SparseArray;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxy implements cgf {
    private static final rbm B = new rbm("qxy");
    private dfh A;
    public bug a;
    public bug b;
    public double c;
    public long d;
    public long e;
    public long f;
    public agke g;
    public agke h;
    public buf i;
    public boolean l;
    public qxn m;
    public qcb n;
    private btb o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private int u;
    private long x;
    private boolean y;
    private qxn z;
    public float j = 1.0f;
    private float v = 1.0f;
    public float k = 1.0f;
    private float w = 1.0f;

    public qxy() {
        o();
    }

    private final long J(long j) {
        return (long) ((((j - this.p) - this.t) / this.v) + this.r + this.s);
    }

    private final boolean K() {
        ByteBuffer byteBufferB;
        dfh dfhVar = this.A;
        if (dfhVar == null) {
            return false;
        }
        do {
            byteBufferB = this.i.b();
            if (!byteBufferB.hasRemaining()) {
                return true;
            }
            dfhVar.d(this.u, byteBufferB);
        } while (!byteBufferB.hasRemaining());
        return false;
    }

    @Override // defpackage.cgf
    public final void D(float f) {
        dfh dfhVar;
        this.w = f;
        int i = this.u;
        if (i == -1 || (dfhVar = this.A) == null) {
            return;
        }
        dfhVar.e(i, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cgf
    public final boolean E(ByteBuffer byteBuffer, long j, int i) {
        int i2;
        int iPosition;
        float[] fArr;
        if (this.l) {
            return false;
        }
        int i3 = 1;
        if (this.u == -1) {
            long J = J(j);
            new rbc(B, rbd.a).a("startTimeUs=%d", Long.valueOf(J));
            dfh dfhVar = this.A;
            bug bugVar = this.a;
            if (dfhVar == null || bugVar == null) {
                i2 = 0;
            } else {
                try {
                    dfhVar.b();
                    dfhVar.b();
                    bug bugVar2 = dfhVar.d;
                    int i4 = bugVar2.b;
                    int i5 = bugVar.b;
                    if (i5 != i4 || !att.j(bugVar) || !att.j(bugVar2)) {
                        throw new bui("Can not add source. MixerFormat=".concat(String.valueOf(String.valueOf(dfhVar.d))), bugVar);
                    }
                    long jU = bwp.u(J - dfhVar.f, i5);
                    int i6 = dfhVar.c;
                    dfhVar.c = i6 + 1;
                    SparseArray sparseArray = dfhVar.b;
                    int i7 = bugVar.c;
                    int i8 = dfhVar.d.c;
                    i2 = 0;
                    if (i8 == 1) {
                        switch (i7) {
                            case 1:
                                fArr = new float[]{1.0f};
                                break;
                            case 2:
                                fArr = new float[]{0.7071f, 0.7071f};
                                i3 = 1;
                                break;
                            case 3:
                                fArr = new float[]{0.7071f, 0.7071f, 1.0f};
                                i3 = 1;
                                break;
                            case 4:
                                fArr = new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
                                i3 = 1;
                                break;
                            case 5:
                                fArr = new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
                                i3 = 1;
                                break;
                            case 6:
                                fArr = new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
                                i3 = 1;
                                break;
                            default:
                                throw new UnsupportedOperationException(a.bP(i7, "Default constant power channel mixing coefficients for ", "->1 are not implemented."));
                        }
                    } else if (i8 == 2) {
                        switch (i7) {
                            case 1:
                                fArr = new float[]{0.7071f, 0.7071f};
                                break;
                            case 2:
                                fArr = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
                                break;
                            case 3:
                                fArr = new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
                                break;
                            case 4:
                                fArr = new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
                                break;
                            case 5:
                                fArr = new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
                                break;
                            case 6:
                                fArr = new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
                                break;
                            default:
                                throw new UnsupportedOperationException(a.bP(i7, "Default constant power channel mixing coefficients for ", "->2 are not implemented."));
                        }
                    } else {
                        if (i7 != i8) {
                            throw new UnsupportedOperationException(a.cj(i8, i7, "Default constant power channel mixing coefficients for ", "->", " are not implemented."));
                        }
                        fArr = new float[i8 * i8];
                        for (int i9 = 0; i9 < i8; i9++) {
                            fArr[(i8 * i9) + i9] = 1.0f;
                        }
                    }
                    sparseArray.append(i6, new dfg(dfhVar, bugVar, new avbs(i7, i8, fArr), jU));
                    int i10 = cat.a;
                    this.u = i6;
                    dfhVar.e(i6, this.w);
                } catch (bui e) {
                    throw new InternalError("Incompatible source audio format", e);
                }
            }
            qxn qxnVar = this.z;
            if (qxnVar != null) {
                qxnVar.a();
            }
            this.x = j;
            qcb qcbVar = this.n;
            if (qcbVar != null) {
                long J2 = J(j) - this.r;
                qyh qyhVar = (qyh) qcbVar.a;
                qxx qxxVar = qyhVar.h;
                qxxVar.d = (long) ((((long) qxxVar.c) * J2) / qxxVar.b);
                qxu qxuVar = qyhVar.g;
                qxuVar.d = (long) ((J2 * ((long) qxuVar.c)) / qxuVar.b);
            }
        } else {
            i2 = 0;
        }
        if (this.i.h()) {
            iPosition = i2;
            while (K() && byteBuffer.hasRemaining()) {
                int iPosition2 = byteBuffer.position();
                this.i.f(byteBuffer);
                iPosition = byteBuffer.position() - iPosition2;
            }
        } else {
            int iPosition3 = byteBuffer.position();
            dfh dfhVar2 = this.A;
            if (dfhVar2 != null) {
                dfhVar2.d(this.u, byteBuffer);
            }
            iPosition = byteBuffer.position() - iPosition3;
        }
        bug bugVar3 = this.b;
        this.x = j + Math.round((((double) iPosition) / ((double) (bugVar3 != null ? bugVar3.e : i3))) * this.c);
        return !byteBuffer.hasRemaining() ? i3 : i2;
    }

    @Override // defpackage.cgf
    public final boolean F() {
        return true;
    }

    @Override // defpackage.cgf
    public final boolean G() {
        return this.y;
    }

    @Override // defpackage.cgf
    public final boolean H(bse bseVar) {
        return Objects.equals(bseVar.q, "audio/raw") && bseVar.L == 2;
    }

    public final void I() {
        this.l = false;
    }

    @Override // defpackage.cgf
    public final int a(bse bseVar) {
        return H(bseVar) ? 2 : 0;
    }

    @Override // defpackage.cgf
    public final long b() {
        return -9223372036854775807L;
    }

    @Override // defpackage.cgf
    public final long c(boolean z) {
        return this.x;
    }

    @Override // defpackage.cgf
    public final btb d() {
        btb btbVar = this.o;
        return btbVar == null ? btb.a : btbVar;
    }

    @Override // defpackage.cgf
    public final /* synthetic */ cff e() {
        return null;
    }

    @Override // defpackage.cgf
    public final /* synthetic */ cfl f(bse bseVar) {
        return cfl.a;
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void g(cfz cfzVar) throws cga {
        ahbo ahboVar = cfzVar.c;
        if (ahboVar != null) {
            ahboVar.g();
        }
        bse bseVar = cfzVar.a;
        int i = bseVar.K;
        this.b = new bug(i, bseVar.I, bseVar.L);
        this.c = 1000000.0d / ((double) i);
        buf bufVar = new buf(this.g);
        this.i = bufVar;
        try {
            this.a = bufVar.a(this.b);
            this.i.c();
        } catch (bui e) {
            throw new cga(e, bseVar);
        }
    }

    @Override // defpackage.cgf
    public final void i() {
        this.p = this.q;
        this.r = this.d;
        this.s = this.e;
        this.t = this.f;
        this.v = this.j;
        this.w = this.k;
        qxn qxnVar = this.m;
        this.z = qxnVar;
        if (qxnVar != null) {
            this.A = qxnVar.a.e;
        }
        this.g = this.h;
        this.u = -1;
        this.y = false;
        buf bufVar = this.i;
        if (bufVar != null) {
            bufVar.c();
        }
        if (this.b != null) {
            buf bufVar2 = new buf(this.g);
            this.i = bufVar2;
            try {
                this.a = bufVar2.a(this.b);
                this.i.c();
            } catch (bui e) {
                rbc rbcVar = new rbc(B, rbd.e);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("Failed to update audio processors.", new Object[0]);
            }
        }
    }

    @Override // defpackage.cgf
    public final void m() {
        if (this.y || this.l) {
            return;
        }
        if (this.u != -1) {
            if (this.i.h()) {
                if (!this.i.g()) {
                    this.i.e();
                }
                if (!K() || !this.i.g()) {
                    return;
                }
            }
            dfh dfhVar = this.A;
            if (dfhVar != null) {
                int i = this.u;
                dfhVar.b();
                dfhVar.j = Math.max(dfhVar.j, dfhVar.a(i).a);
                dfhVar.b.delete(i);
                int i2 = cat.a;
                dfhVar.c();
            }
            this.u = -1;
        } else {
            rbc rbcVar = new rbc(B, rbd.a);
            rbcVar.c();
            rbcVar.a("Got end of stream without ever receiving audio.", new Object[0]);
            qxn qxnVar = this.z;
            if (qxnVar != null) {
                qxnVar.a();
            }
        }
        this.y = true;
    }

    @Override // defpackage.cgf
    public final void o() {
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.s = 0L;
        this.e = 0L;
        this.t = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.v = 1.0f;
        this.j = 1.0f;
        this.w = 1.0f;
        this.k = 1.0f;
        agke agkeVar = agpi.a;
        this.g = agkeVar;
        this.h = agkeVar;
        this.i = new buf(this.g);
        this.z = null;
        this.m = null;
        this.A = null;
        this.u = -1;
        this.x = Long.MIN_VALUE;
        this.y = false;
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void q(cfu cfuVar) {
        throw new UnsupportedOperationException("AudioSink doesn't support setAudioOutputProvider");
    }

    @Override // defpackage.cgf
    public final void x(long j) {
        this.q = j;
    }

    @Override // defpackage.cgf
    public final void y(btb btbVar) {
        this.o = btbVar;
    }

    @Override // defpackage.cgf
    public final void h() {
    }

    @Override // defpackage.cgf
    public final void j() {
    }

    @Override // defpackage.cgf
    public final void k() {
    }

    @Override // defpackage.cgf
    public final void l() {
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void A(AudioDeviceInfo audioDeviceInfo) {
    }

    @Override // defpackage.cgf
    public final void B(boolean z) {
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void C(int i) {
    }

    @Override // defpackage.cgf
    public final void p(brq brqVar) {
    }

    @Override // defpackage.cgf
    public final void r(int i) {
    }

    @Override // defpackage.cgf
    public final void s(brr brrVar) {
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void t(bvd bvdVar) {
    }

    @Override // defpackage.cgf
    public final void u(cgc cgcVar) {
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void w(int i) {
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void z(cfd cfdVar) {
    }

    @Override // defpackage.cgf
    public final /* synthetic */ void v(int i, int i2) {
    }
}
