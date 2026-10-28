package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tkw extends UrlRequest.Callback {
    public final mbc a;
    public final tmf b;
    public final tgv c;
    public final tls e;
    private final toh f;
    private final Executor g;
    private final tns h;
    private final tmr i;
    private final tqj j;
    private final ArrayDeque k = new ArrayDeque(2);
    public volatile int d = 0;
    private long l = -1;
    private int m = 0;
    private boolean n = false;
    private boolean o = false;

    public tkw(mbc mbcVar, toh tohVar, Executor executor, tns tnsVar, tmr tmrVar, tls tlsVar, tmf tmfVar, tgv tgvVar, tqj tqjVar) {
        this.a = mbcVar;
        this.f = tohVar;
        this.g = executor;
        this.h = tnsVar;
        this.i = tmrVar;
        this.e = tlsVar;
        this.b = tmfVar;
        this.c = tgvVar;
        this.j = tqjVar;
    }

    private final int a(long j) {
        if (j > 393216) {
            return 393216;
        }
        if (j > 256) {
            return (int) j;
        }
        if (!this.o || this.n) {
            return SemanticState.Multiline;
        }
        this.n = true;
        return SemanticState.Hidden;
    }

    private final void b(UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        tnm tnmVar;
        byte[] bArrA;
        this.c.b();
        if (urlResponseInfo == null || cronetException != null) {
            tqj tqjVar = this.j;
            int i = tqr.a;
            boolean zK = tqjVar.k(1073830881);
            tls tlsVar = this.e;
            if (zK) {
                taq.o(tlsVar.c);
            } else {
                tlsVar.f();
            }
            c(null, cronetException);
            return;
        }
        this.e.f();
        if (urlResponseInfo.getHttpStatusCode() == 304) {
            tfz tfzVar = tfz.a;
            vwt vwtVar = new vwt((byte[]) null, (short[]) null);
            tmr tmrVar = this.i;
            if (tmrVar != null) {
                vwtVar.w(tmrVar.b.c.entrySet());
                bArrA = tmrVar.a.a();
            } else {
                bArrA = null;
            }
            vwtVar.w(urlResponseInfo.getAllHeadersAsList());
            tnmVar = new tnm(304, bArrA, vwtVar.u().b(), true);
        } else {
            tfz tfzVar2 = tfz.a;
            vwt vwtVar2 = new vwt((byte[]) null, (short[]) null);
            vwtVar2.w(urlResponseInfo.getAllHeadersAsList());
            tfz tfzVarU = vwtVar2.u();
            try {
                try {
                    ArrayDeque arrayDeque = this.k;
                    tgn tgnVar = tgn.a;
                    ArrayList arrayList = new ArrayList(arrayDeque);
                    tgn tgnVar2 = new tgn(null, Long.toString(tgn.b(arrayList)));
                    tgnVar2.c = arrayList;
                    byte[] bArrH = tgnVar2.h();
                    this.k.clear();
                    tnmVar = new tnm(urlResponseInfo.getHttpStatusCode(), bArrH, tfzVarU.b(), false);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                this.k.clear();
                throw th;
            }
        }
        c(tnmVar, null);
    }

    private final void c(tnm tnmVar, CronetException cronetException) {
        this.g.execute(afwl.i(new dzn(this, tnmVar, cronetException, 8, (short[]) null)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.c();
        this.a.b();
        this.k.clear();
        if (this.d != 0) {
            b(null, tme.a(this.d));
        } else {
            b(null, null);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.d();
        if (this.h.D()) {
            onCanceled(urlRequest, urlResponseInfo);
        } else {
            this.a.b();
            b(urlResponseInfo, cronetException);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.b.e();
        if (this.h.D()) {
            urlRequest.cancel();
            return;
        }
        int iPosition = byteBuffer.position();
        this.l -= (long) (iPosition - this.m);
        this.m = iPosition;
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
            return;
        }
        byteBuffer.flip();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(a(this.l));
        this.m = 0;
        this.k.add(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws tog {
        this.b.f();
        if (this.f != null) {
            toh.a(str);
        }
        tqj tqjVar = this.j;
        int i = tqr.a;
        if (tqjVar.k(1073830474) && (tyu.j(this.h.s()) || tyu.j(str))) {
            throw new tog("Open redirect blocked.");
        }
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        String str;
        String str2;
        long j;
        this.b.g();
        int i = tqr.a;
        if (this.j.k(1073830881)) {
            taq.p(this.h);
        }
        if (this.h.D()) {
            urlRequest.cancel();
            return;
        }
        Map allHeaders = urlResponseInfo.getAllHeaders();
        String str3 = null;
        if (allHeaders != null) {
            String str4 = allHeaders.containsKey("Content-Length") ? (String) ((List) allHeaders.get("Content-Length")).get(0) : null;
            str2 = allHeaders.containsKey("Content-Encoding") ? (String) ((List) allHeaders.get("Content-Encoding")).get(0) : null;
            str = allHeaders.containsKey("Content-Type") ? (String) ((List) allHeaders.get("Content-Type")).get(0) : null;
            str3 = str4;
        } else {
            str = null;
            str2 = null;
        }
        long j2 = Long.MIN_VALUE;
        if (TextUtils.isEmpty(str3)) {
            j = Long.MIN_VALUE;
        } else {
            try {
                j = Long.parseLong(str3);
            } catch (NumberFormatException unused) {
                j = Long.MIN_VALUE;
            }
        }
        if (j >= 0) {
            if (TextUtils.isEmpty(str2) || "identity".equals(str2)) {
                this.o = true;
            } else {
                j = "application/x-protobuf".equals(str) ? j * 3 : (long) (j * 1.5d);
            }
            j2 = j;
        }
        this.l = j2;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(a(j2));
        this.k.add(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.h();
        if (this.h.D()) {
            onCanceled(urlRequest, urlResponseInfo);
            return;
        }
        this.a.b();
        ArrayDeque arrayDeque = this.k;
        ByteBuffer byteBuffer = (ByteBuffer) arrayDeque.peekLast();
        byteBuffer.flip();
        if (!byteBuffer.hasRemaining()) {
            arrayDeque.removeLast();
        }
        b(urlResponseInfo, null);
    }
}
