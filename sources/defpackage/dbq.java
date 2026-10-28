package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dbq implements cwj {
    public final cwj a;
    public bse c;
    public boolean d;
    private final dbl e;
    private dbn i;
    private int f = 0;
    private int g = 0;
    private byte[] h = bwp.e;
    public final bwb b = new bwb();

    public dbq(cwj cwjVar, dbl dblVar) {
        this.a = cwjVar;
        this.e = dblVar;
    }

    private final void h(int i) {
        int length = this.h.length;
        int i2 = this.g;
        if (length - i2 < i) {
            int i3 = i2 - this.f;
            int iMax = Math.max(i3 << 1, i + i3);
            byte[] bArr = this.h;
            byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
            System.arraycopy(bArr, this.f, bArr2, 0, i3);
            this.f = 0;
            this.g = i3;
            this.h = bArr2;
        }
    }

    @Override // defpackage.cwj
    public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
        return g(brvVar, i, z);
    }

    @Override // defpackage.cwj
    public final void b(bse bseVar) {
        String str = bseVar.q;
        str.getClass();
        ahno.F(bsy.b(str) == 3);
        if (!bseVar.equals(this.c)) {
            this.c = bseVar;
            dbl dblVar = this.e;
            this.i = dblVar.c(bseVar) ? dblVar.b(bseVar) : null;
        }
        dbn dbnVar = this.i;
        cwj cwjVar = this.a;
        if (dbnVar == null) {
            cwjVar.b(bseVar);
            return;
        }
        bsd bsdVar = new bsd(bseVar);
        bsdVar.e("application/x-media3-cues");
        bsdVar.k = str;
        bsdVar.t = Long.MAX_VALUE;
        bsdVar.N = this.e.a(bseVar);
        cwjVar.b(new bse(bsdVar));
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void c(bwb bwbVar, int i) {
        d(bwbVar, i, 0);
    }

    @Override // defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        if (this.i == null) {
            this.a.d(bwbVar, i, i2);
            return;
        }
        h(i);
        bwbVar.K(this.h, this.g, i);
        this.g += i;
    }

    @Override // defpackage.cwj
    public final void e(final long j, final int i, int i2, int i3, cwi cwiVar) {
        int i4;
        if (this.i == null) {
            this.a.e(j, i, i2, i3, cwiVar);
            return;
        }
        ahno.G(cwiVar == null, "DRM on subtitles is not supported");
        int i5 = (this.g - i3) - i2;
        try {
            i4 = i5;
            try {
                this.i.c(this.h, i4, i2, dbm.a, new bvh() { // from class: dbp
                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
                    @Override // defpackage.bvh
                    public final void a(Object obj) {
                        dbq dbqVar = this.a;
                        abnx abnxVar = (abnx) obj;
                        dbqVar.c.getClass();
                        byte[] bArrG = om.g(abnxVar.d, abnxVar.b);
                        bwb bwbVar = dbqVar.b;
                        bwbVar.M(bArrG);
                        int length = bArrG.length;
                        cwj cwjVar = dbqVar.a;
                        cwjVar.c(bwbVar, length);
                        long j2 = abnxVar.a;
                        long j3 = j;
                        if (j2 == -9223372036854775807L) {
                            ahno.O(dbqVar.c.v == Long.MAX_VALUE);
                        } else {
                            long j4 = dbqVar.c.v;
                            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                        }
                        cwjVar.e(j3, 1 | i, length, 0, null);
                    }
                });
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.d) {
                    throw runtimeException;
                }
                bvx.f("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.f = i6;
        if (i6 == this.g) {
            this.f = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) throws EOFException {
        if (this.i == null) {
            return this.a.g(brvVar, i, z);
        }
        h(i);
        int iA = brvVar.a(this.h, this.g, i);
        if (iA != -1) {
            this.g += iA;
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void f() {
    }
}
