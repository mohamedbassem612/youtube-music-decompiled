package defpackage;

import com.google.android.libraries.youtube.media.interfaces.HttpResponse;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ysx implements Runnable {
    final /* synthetic */ ysy a;
    private final byi b;
    private final zjr c;

    public ysx(ysy ysyVar, byi byiVar, zjr zjrVar) {
        this.a = ysyVar;
        this.b = byiVar;
        this.c = zjrVar;
    }

    private final void a() {
        try {
            this.a.b.b(true);
        } catch (ypv unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, zjd] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, zjd] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, zjd] */
    @Override // java.lang.Runnable
    public final void run() {
        byw bywVar;
        int iA;
        ysy ysyVar;
        afvx afvxVarAd = tym.ad(trx.ONESIE_NETWORK_EXECUTE);
        try {
            try {
                try {
                    try {
                        ysy ysyVar2 = this.a;
                        ysyVar2.c.b.H();
                        byw bywVar2 = ysyVar2.a;
                        bywVar2.b(this.b);
                        boolean zM = this.c.j.m(239, 45656527L);
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(16384);
                        ypx ypxVar = ysyVar2.b;
                        int iK = bywVar2.k();
                        Map mapD = bywVar2.d();
                        synchronized (zik.class) {
                            ((yss) ypxVar).a.onHttpResponse(new HttpResponse(iK, yno.c(mapD)));
                        }
                        byte[] bArr = null;
                        while (true) {
                            if (zM) {
                                iA = ((zir) this.a.a).w(byteBufferAllocateDirect);
                            } else {
                                if (bArr == null) {
                                    bArr = new byte[16384];
                                }
                                iA = this.a.a.a(bArr, 0, 16384);
                            }
                            ysyVar = this.a;
                            if (iA == -1) {
                                break;
                            }
                            yre yreVar = ysyVar.c;
                            int i = yreVar.a;
                            if (i < 100000) {
                                if (i == 0 && iA > 0) {
                                    yreVar.b.J();
                                }
                                int i2 = yreVar.a + iA;
                                yreVar.a = i2;
                                if (i2 > 100000) {
                                    yreVar.b.I();
                                }
                            }
                            if (zM) {
                                byteBufferAllocateDirect.flip();
                                ysyVar.b.a(byteBufferAllocateDirect);
                                byteBufferAllocateDirect.clear();
                            } else {
                                byteBufferAllocateDirect.clear();
                                bArr.getClass();
                                byteBufferAllocateDirect.put(bArr, 0, iA);
                                byteBufferAllocateDirect.flip();
                                ysyVar.b.a(byteBufferAllocateDirect);
                            }
                        }
                        ysyVar.b.b(false);
                        bywVar = ysyVar.a;
                    } catch (IOException unused) {
                    }
                } catch (IOException e) {
                    a();
                    this.a.c.a(new ypv("IO error " + e.getMessage(), e));
                    bywVar = this.a.a;
                } catch (RuntimeException e2) {
                    a();
                    ysy ysyVar3 = this.a;
                    ysyVar3.c.a(e2);
                    bywVar = ysyVar3.a;
                } catch (ypv e3) {
                    a();
                    ysy ysyVar4 = this.a;
                    ysyVar4.c.a(e3);
                    bywVar = ysyVar4.a;
                }
                bywVar.f();
                afvxVarAd.close();
            } catch (Throwable th) {
                try {
                    this.a.a.f();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                afvxVarAd.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
