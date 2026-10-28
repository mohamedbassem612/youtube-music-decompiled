package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tiz {
    public final tmf a;
    public final boolean b;
    public volatile boolean c;
    public final /* synthetic */ tja e;
    private volatile int g;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean(false);

    public tiz(tja tjaVar, tmf tmfVar, boolean z) {
        this.e = tjaVar;
        this.a = tmfVar;
        this.b = z;
    }

    public final void a(toe toeVar) {
        if (this.f.compareAndSet(false, true)) {
            tja tjaVar = this.e;
            int i = tqr.a;
            if (tjaVar.d.k(1073830881)) {
                taq.o(tjaVar.b);
            } else {
                tjaVar.c();
            }
            tjk tjkVar = tjaVar.f;
            if (tjkVar == null) {
                awrc.b("callbacks");
                tjkVar = null;
            }
            tjkVar.b(toeVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    public final void b(toe toeVar) {
        Duration durationD;
        int i = tqr.a;
        tja tjaVar = this.e;
        boolean zK = tjaVar.d.k(1073830968);
        if (zK && tjaVar.b.D()) {
            durationD = null;
        } else {
            tns tnsVar = tjaVar.b;
            if ((tnsVar instanceof toc) && this.c && !((toc) tnsVar).T()) {
                durationD = null;
            } else {
                if (!tnsVar.E()) {
                    Objects.checkIndex(0, 5);
                    if (!(toeVar instanceof tod) && !(toeVar instanceof tmg) && !(toeVar instanceof thb) && !(toeVar instanceof tey)) {
                        durationD = null;
                    }
                }
                durationD = tnsVar.h().d(toeVar);
            }
        }
        if (durationD == null) {
            a(toeVar);
        } else {
            tjaVar.b();
            awro.t(tjaVar.c.H(tjaVar.b), null, 0, new tix(durationD, zK, tjaVar, this, toeVar, (awoq) null, 0), 3);
        }
    }

    public final void c(UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.d();
        d(urlResponseInfo, cronetException);
    }

    public final void d(UrlResponseInfo urlResponseInfo, Throwable th) {
        toe tniVar;
        int i;
        List listL;
        if (this.d.compareAndSet(false, true)) {
            if (th instanceof tkf) {
                tkf tkfVar = (tkf) th;
                int i2 = tkfVar.a;
                switch (i2) {
                    case 3:
                    case 9:
                    case 11:
                        i = 400;
                        break;
                    case 4:
                        i = 504;
                        break;
                    case 5:
                        i = 404;
                        break;
                    case 6:
                    case 10:
                        i = 409;
                        break;
                    case 7:
                        i = 403;
                        break;
                    case 8:
                        i = 429;
                        break;
                    case 12:
                        i = 501;
                        break;
                    case 13:
                    case 15:
                    default:
                        i = 500;
                        break;
                    case 14:
                        i = 503;
                        break;
                    case 16:
                        i = 401;
                        break;
                }
                if (i2 == 4) {
                    Throwable thInitCause = new tod().initCause(tkfVar);
                    thInitCause.getClass();
                    tniVar = (tod) thInitCause;
                } else if (i2 == 14) {
                    tniVar = new tni(tkfVar);
                } else {
                    byte[] bArr = tkfVar.b;
                    if (urlResponseInfo == null || (listL = taq.l(urlResponseInfo)) == null) {
                        listL = awno.a;
                    }
                    tniVar = taq.w(new tnm(i, bArr, false, listL), i);
                }
            } else if ((th instanceof NetworkException) && ((NetworkException) th).immediatelyRetryable()) {
                Throwable thInitCause2 = new tod().initCause(th);
                thInitCause2.getClass();
                tniVar = (tod) thInitCause2;
            } else {
                tniVar = th instanceof toe ? (toe) th : new tni(th);
            }
            tja tjaVar = this.e;
            int i3 = tqr.a;
            if (tjaVar.d.k(1073830968)) {
                awro.t(tjaVar.c.H(tjaVar.b), null, 0, new tiy(this, tniVar, (awoq) null, 0), 3);
            } else {
                b(tniVar);
            }
        }
    }

    public final void e(UrlResponseInfo urlResponseInfo, tnm tnmVar) {
        if (this.d.get()) {
            return;
        }
        this.c = true;
        if (!taq.v(urlResponseInfo.getHttpStatusCode())) {
            d(urlResponseInfo, taq.w(tnmVar, urlResponseInfo.getHttpStatusCode()));
            return;
        }
        tja tjaVar = this.e;
        tjk tjkVar = null;
        if (!tjaVar.g()) {
            tjk tjkVar2 = tjaVar.f;
            if (tjkVar2 == null) {
                awrc.b("callbacks");
            } else {
                tjkVar = tjkVar2;
            }
            tjkVar.c(tnmVar);
            return;
        }
        long jB = tjaVar.e.b();
        int i = this.g;
        this.g = i + 1;
        tjk tjkVar3 = tjaVar.f;
        if (tjkVar3 == null) {
            awrc.b("callbacks");
        } else {
            tjkVar = tjkVar3;
        }
        tjkVar.c(new tmy(tnmVar, tjaVar.g, jB, i, this.b));
    }
}
