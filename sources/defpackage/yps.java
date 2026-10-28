package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yps extends bxw implements byw {
    private final byw b;
    private final boolean c;
    private final zjr d;
    private volatile boolean e;
    private final wiu f;
    private final xeu g;
    private final ywn h;
    private String i;
    private ByteBuffer j;
    private ypu k;

    public yps(byw bywVar, zjr zjrVar, wiu wiuVar, xeu xeuVar, ywn ywnVar) {
        super(true);
        this.b = bywVar;
        this.d = zjrVar;
        this.c = bywVar instanceof cah;
        this.f = wiuVar;
        this.g = xeuVar;
        this.h = ywnVar;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byt {
        int iA;
        int iN;
        ypu ypuVar = this.k;
        if (ypuVar == null) {
            iA = this.b.a(bArr, i, i2);
        } else {
            try {
                cah cahVar = ypuVar.a;
                if (!ypw.c(cahVar.d())) {
                    iA = cahVar.a(bArr, i, i2);
                } else if (ypuVar.d) {
                    iA = -1;
                } else if (i2 == 0) {
                    iA = 0;
                } else {
                    int iA2 = ypuVar.a(bArr, i, i2);
                    while (true) {
                        if (iA2 == 0) {
                            ByteBuffer byteBuffer = ypuVar.b;
                            byteBuffer.clear();
                            int i3 = ypuVar.c;
                            if (i3 == 0) {
                                iN = cahVar.n(byteBuffer);
                            } else {
                                agfp agfpVarB = agfp.b(agdd.a);
                                int i4 = 0;
                                do {
                                    int iN2 = cahVar.n(byteBuffer);
                                    if (iN2 == -1) {
                                        if (i4 != 0) {
                                            break;
                                        }
                                        break;
                                    }
                                    i4 += iN2;
                                    if (i4 >= i2 || byteBuffer.remaining() <= 0) {
                                        break;
                                    }
                                } while (agfpVarB.a(TimeUnit.MILLISECONDS) < i3);
                                iN = i4;
                            }
                            if (iN == -1) {
                                break;
                            }
                            byteBuffer.flip();
                            ypuVar.h.pushData(byteBuffer);
                            iA2 = ypuVar.a(bArr, i, i2);
                        } else {
                            iA = iA2;
                        }
                    }
                    ypuVar.d = true;
                    iA = -1;
                }
            } catch (ypv unused) {
                iA = ypuVar.a.a(bArr, i, i2);
            }
        }
        g(iA);
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[PHI: r4
      0x0046: PHI (r4v1 long) = (r4v0 long), (r4v12 long) binds: [B:11:0x003d, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    @Override // defpackage.bye
    public final long b(byi byiVar) {
        StringBuilder sb;
        long j;
        if (!this.c) {
            i(byiVar);
            long jB = this.b.b(byiVar);
            j(byiVar);
            this.e = true;
            return jB;
        }
        Uri uri = byiVar.a;
        if (!TextUtils.equals(uri.getPath(), "/videoplayback")) {
            return this.b.b(byiVar);
        }
        tyt tytVar = new tyt(uri);
        tytVar.e("ump", "1");
        long j2 = byiVar.h;
        if (j2 == 0) {
            j2 = 0;
            if (byiVar.i != -1) {
                sb = new StringBuilder();
                sb.append(j2);
                sb.append('-');
                j = byiVar.i;
                if (j != -1) {
                    sb.append((j + j2) - 1);
                }
                tytVar.e("range", sb.toString());
            }
        } else {
            sb = new StringBuilder();
            sb.append(j2);
            sb.append('-');
            j = byiVar.i;
            if (j != -1) {
                sb.append((j + j2) - 1);
            }
            tytVar.e("range", sb.toString());
        }
        byh byhVar = new byh(byiVar);
        byhVar.a = tytVar.a();
        byhVar.g = 0L;
        byhVar.b = byiVar.b + j2;
        byhVar.h = -1L;
        zjr zjrVar = this.d;
        if (zjrVar.cI()) {
            Object objA = byiVar.l;
            if (objA instanceof ypq) {
                ypq ypqVar = (ypq) objA;
                if (ypqVar.i.isEmpty()) {
                    ypp yppVar = new ypp(ypqVar);
                    yppVar.j(tok.MEDIA_NET_UMP_DATA_SOURCE);
                    objA = yppVar.a();
                }
            } else {
                ypp yppVarA = ypq.a();
                yppVarA.j(tok.MEDIA_NET_UMP_DATA_SOURCE);
                objA = yppVarA.a();
            }
            byhVar.k = objA;
        }
        byi byiVarA = byhVar.a();
        i(byiVar);
        byw bywVar = this.b;
        long jB2 = bywVar.b(byiVarA);
        if (yno.aA(this.f, byiVarA, this.i)) {
            this.h.w("ppp", "ump");
            this.i = byiVarA.a.getQueryParameter("cpn");
        }
        try {
            if (ypw.c(d())) {
                ByteBuffer byteBuffer = this.j;
                if (byteBuffer == null) {
                    this.j = ByteBuffer.allocateDirect(32768);
                } else {
                    byteBuffer.clear();
                }
                this.k = new ypu((cah) bywVar, byiVarA, this.j, this.g, this.h, zjrVar);
            }
        } catch (ypv unused) {
        }
        j(byiVar);
        this.e = true;
        return jB2;
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.b.c();
    }

    @Override // defpackage.bxw, defpackage.bye
    public final Map d() {
        return this.b.d();
    }

    @Override // defpackage.bye
    public final void f() {
        ypu ypuVar = this.k;
        if (ypuVar != null) {
            ypuVar.h.dispose();
        }
        this.k = null;
        this.b.f();
        if (this.e) {
            h();
            this.e = false;
        }
    }

    @Override // defpackage.byw
    public final int k() {
        return this.b.k();
    }

    @Override // defpackage.byw
    public final void l() {
        this.b.l();
    }

    @Override // defpackage.byw
    public final void m(String str, String str2) {
        this.b.m(str, str2);
    }
}
