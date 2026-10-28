package defpackage;

import com.google.android.libraries.youtube.media.interfaces.HttpResponse;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ypd extends UrlRequest.Callback {
    final /* synthetic */ ype a;
    private ByteBuffer b;
    private int c = 0;

    public ypd(ype ypeVar) {
        this.a = ypeVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.q.c();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        QoeError qoeError;
        ype ypeVar = this.a;
        if (ypeVar.d() || ypeVar.c()) {
            return;
        }
        mbc mbcVar = ypeVar.j;
        tlk tlkVar = ypeVar.q;
        long jB = mbcVar.b();
        tlkVar.d();
        ArrayList arrayListA = ype.a(ypeVar.w);
        if (!ypeVar.y.i()) {
            qoeError = new QoeError("net.unavailable", arrayListA);
        } else if (cronetException instanceof NetworkException) {
            NetworkException networkException = (NetworkException) cronetException;
            arrayListA.add(new QoeErrorDetail("info", "cronet"));
            arrayListA.add(new QoeErrorDetail("nerrcode", String.valueOf(networkException.getErrorCode())));
            arrayListA.add(new QoeErrorDetail("cerrcode", String.valueOf(networkException.getCronetInternalErrorCode())));
            if (networkException instanceof QuicException) {
                arrayListA.add(new QoeErrorDetail("qerrcode", String.valueOf(((QuicException) networkException).getQuicDetailedErrorCode())));
                if (networkException instanceof axnr) {
                    throw null;
                }
            } else if (networkException instanceof axnq) {
                throw null;
            }
            if (networkException.getErrorCode() == 1) {
                qoeError = new QoeError("net.dns", arrayListA);
            } else if (ypeVar.p.c && networkException.getErrorCode() == 2) {
                qoeError = new QoeError("net.unavailable", arrayListA);
            } else if (ypeVar.t.get()) {
                qoeError = new QoeError("net.read", arrayListA);
            } else {
                qoeError = new QoeError("net.connect", arrayListA);
            }
        } else if (ypeVar.t.get()) {
            qoeError = new QoeError("net.connect", arrayListA);
        } else {
            qoeError = new QoeError("net.read", arrayListA);
        }
        ypeVar.b(qoeError, false);
        ypj ypjVar = ypeVar.h;
        if (ypjVar != null) {
            ypjVar.f(qoeError.getCode(), jB);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ype ypeVar = this.a;
        if (ypeVar.d() || ypeVar.c()) {
            return;
        }
        ypeVar.s = ypeVar.j.b();
        ypeVar.q.e();
        int iPosition = byteBuffer.position();
        if (ypeVar.t.get() && !ypeVar.u.get()) {
            ypeVar.c.m(iPosition);
            ypeVar.d.a(null, null, true, iPosition);
        }
        byteBuffer.flip();
        if (ypeVar.e() && !ypeVar.d() && !ypeVar.c()) {
            synchronized (zik.class) {
                if (!ypeVar.d() && !ypeVar.c()) {
                    ypeVar.m.onBodyData(byteBuffer);
                }
            }
        }
        byteBuffer.clear();
        ype ypeVar2 = this.a;
        long j = ypeVar2.r;
        ypeVar2.r = ypeVar2.j.b();
        urlRequest.read(byteBuffer);
        ypj ypjVar = ypeVar2.h;
        if (ypjVar != null) {
            ypjVar.g(j, ypeVar2.s, iPosition);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        ype ypeVar = this.a;
        if (ypeVar.d() || ypeVar.c()) {
            return;
        }
        mbc mbcVar = ypeVar.j;
        tlk tlkVar = ypeVar.q;
        long jB = mbcVar.b();
        tlkVar.f();
        if (ypeVar.e() && !ypeVar.d() && !ypeVar.c()) {
            synchronized (zik.class) {
                if (!ypeVar.d() && !ypeVar.c()) {
                    ypeVar.m.onRedirect(str);
                }
            }
        }
        ype ypeVar2 = this.a;
        if (ypeVar2.x) {
            int i = this.c + 1;
            this.c = i;
            if (i <= 20) {
                urlRequest.followRedirect();
                return;
            }
        }
        QoeError qoeError = new QoeError("net.redirect", ype.a(ypeVar2.w));
        ypeVar2.b(qoeError, false);
        urlRequest.cancel();
        ypj ypjVar = ypeVar2.h;
        if (ypjVar != null) {
            ypjVar.f(qoeError.getCode(), jB);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        byi byiVar;
        ype ypeVar = this.a;
        if (ypeVar.d() || ypeVar.c()) {
            return;
        }
        mbc mbcVar = ypeVar.j;
        tlk tlkVar = ypeVar.q;
        long jB = mbcVar.b();
        tlkVar.g();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        Map allHeaders = urlResponseInfo.getAllHeaders();
        if (ypeVar.e() && !ypeVar.d() && !ypeVar.c()) {
            synchronized (zik.class) {
                if (!ypeVar.d() && !ypeVar.c()) {
                    ypeVar.m.onHttpResponse(new HttpResponse(httpStatusCode, yno.c(allHeaders)));
                }
            }
        }
        ype ypeVar2 = this.a;
        Long lB = new elr(allHeaders, (byte[]) null).B("x-walltime-ms");
        if (lB != null) {
            ((twi) ypeVar2.f.io()).a(lB);
        }
        if (httpStatusCode < 200 || httpStatusCode > 299) {
            ArrayList arrayListA = ype.a(ypeVar2.w);
            arrayListA.add(new QoeErrorDetail("rc", String.valueOf(httpStatusCode)));
            QoeError qoeError = new QoeError("net.badstatus", arrayListA);
            ypeVar2.b(qoeError, false);
            urlRequest.cancel();
            ypj ypjVar = ypeVar2.h;
            if (ypjVar != null) {
                ypjVar.f(qoeError.getCode(), jB);
                return;
            }
            return;
        }
        if (httpStatusCode == 204 && (byiVar = ypeVar2.w) != null && byiVar.d == 2) {
            ypeVar2.b.k(zhz.d(new QoeError("net.nocontent", ype.a(byiVar)), false));
        }
        ypeVar2.t.set(true);
        ypeVar2.e.c();
        ypeVar2.c.p(ypeVar2.k);
        ypeVar2.d.d(null, null, true);
        zjr zjrVar = ypeVar2.l;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(zjrVar.O() > 0 ? a.p(zjrVar.O()) : 32768);
        this.b = byteBufferAllocateDirect;
        zkf.d(byteBufferAllocateDirect);
        zkf.d(urlRequest);
        ypeVar2.r = ypeVar2.j.b();
        urlRequest.read(this.b);
        ypj ypjVar2 = ypeVar2.h;
        if (ypjVar2 != null) {
            ypjVar2.h(jB);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ype ypeVar = this.a;
        if (ypeVar.d() || ypeVar.c()) {
            return;
        }
        mbc mbcVar = ypeVar.j;
        tlk tlkVar = ypeVar.q;
        long jB = mbcVar.b();
        tlkVar.h();
        ypeVar.b(null, false);
        ypj ypjVar = ypeVar.h;
        if (ypjVar != null) {
            ypjVar.d(jB);
        }
    }
}
