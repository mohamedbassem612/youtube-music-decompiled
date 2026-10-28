package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tlw extends UrlRequest.Callback {
    private int a = 0;
    private final Deque b = new ArrayDeque(2);
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private CronetException g = null;
    private final tmb h;

    public tlw(tmb tmbVar) {
        this.h = tmbVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.clear();
        CronetException cronetException = this.g;
        tmb tmbVar = this.h;
        if (cronetException != null) {
            tmbVar.e(cronetException);
        } else {
            tmbVar.d();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.clear();
        this.h.e(cronetException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        boolean z;
        ?? r15;
        tmb tmbVar = this.h;
        tmbVar.g.e();
        if (tmbVar.b.D()) {
            urlRequest.cancel();
            return;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i = iPosition - this.f;
        this.f = iPosition;
        int i2 = this.d + i;
        this.d = i2;
        boolean z2 = true;
        boolean z3 = false;
        ahno.O(i2 >= this.c);
        if (this.d - this.c >= this.e) {
            byteBuffer.flip();
            ahno.O(this.d >= this.c);
            ahno.O(this.d - this.c >= this.e);
            aigm aigmVarT = aigm.T(this.b);
            try {
                aigmVarT.f(this.d);
                aigmVarT.C(this.c);
                while (!aigmVarT.D()) {
                    try {
                        int iD = aigmVarT.d();
                        int iN = aigmVarT.n();
                        if ((iN >>> 3) != z2) {
                            aigmVarT.F(iN);
                            this.c += iD - aigmVarT.d();
                        } else {
                            int i3 = iN & 7;
                            if (i3 != 2) {
                                throw new IOException(a.bR(i3, "Wrong wiretype for messages tag: "));
                            }
                            int iK = aigmVarT.k();
                            if (aigmVarT.d() < iK) {
                                this.e = iK + (iD - aigmVarT.d());
                                break;
                            }
                            tmb tmbVar2 = this.h;
                            tnm tnmVar = new tnm(urlResponseInfo.getHttpStatusCode(), aigmVarT.H(iK), z3, taq.l(urlResponseInfo));
                            if (tmbVar2.j && taq.s(tnmVar)) {
                                tob tobVar = new tob(tnmVar);
                                tnmVar = taq.k(tobVar);
                                if (tnmVar != null) {
                                    z = z2;
                                } else {
                                    tmbVar2.b(tobVar);
                                    r15 = z3;
                                }
                                this.e = r15;
                                this.c += iD - aigmVarT.d();
                                z2 = true;
                                z3 = false;
                            } else {
                                z = z3;
                            }
                            tma tmaVar = tmbVar2.k;
                            tns tnsVar = tmbVar2.b;
                            tmaVar.a.b(tnsVar, tnmVar, Long.valueOf(tmaVar.b));
                            afxd.f(tnsVar.j(tmbVar2.a, tnmVar, z)).g(new rwj(tmbVar2, 5), MoreExecutors.directExecutor()).b(Exception.class, new rwj(tmbVar2, 6), MoreExecutors.directExecutor()).i(new tlz(tmbVar2), MoreExecutors.directExecutor());
                            r15 = 0;
                            this.e = r15;
                            this.c += iD - aigmVarT.d();
                            z2 = true;
                            z3 = false;
                        }
                    } catch (IOException e) {
                        this.g = new tlv(e);
                        urlRequest.cancel();
                    }
                }
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                int iLimit2 = 0;
                while (true) {
                    Deque deque = this.b;
                    if (!deque.isEmpty()) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) deque.peekFirst();
                        byteBuffer2.getClass();
                        if (byteBuffer2.limit() > this.c) {
                            break;
                        }
                        iLimit2 += byteBuffer2.limit();
                        deque.removeFirst();
                    } else {
                        break;
                    }
                }
                this.c -= iLimit2;
                this.d -= iLimit2;
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
            return;
        }
        byteBuffer.flip();
        int i4 = this.e;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i4 != 0 ? Math.min(393216, i4 - (this.d - this.c)) : SemanticState.Multiline);
        this.f = 0;
        this.b.add(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws tog {
        tmb tmbVar = this.h;
        tmbVar.c(str);
        int i = tqr.a;
        if (tmbVar.h.k(1073830474) && (tyu.j(tmbVar.b.s()) || tyu.j(str))) {
            throw new tog("Open redirect blocked.");
        }
        tmbVar.g.f();
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        toe teyVar;
        int i = this.a;
        this.a = i + 1;
        ahno.P(i == 0, "StreamScanner instances cannot be reused");
        tmb tmbVar = this.h;
        tmbVar.g.g();
        tns tnsVar = tmbVar.b;
        if (!tnsVar.D()) {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if ((httpStatusCode < 200 || httpStatusCode > 299) && httpStatusCode != 304) {
                if (httpStatusCode == 401) {
                    teyVar = new tmg();
                } else if (httpStatusCode == 403) {
                    teyVar = new tnc();
                } else if (httpStatusCode == 415) {
                    teyVar = new thb();
                } else if (httpStatusCode == 400) {
                    teyVar = new tey();
                } else {
                    tmbVar.j = true;
                }
                tnsVar.E();
                if (taq.r(tnsVar, teyVar)) {
                    tmbVar.i = true;
                    tmbVar.a();
                } else {
                    tmbVar.a.execute(afwl.i(new sxk(tmbVar, teyVar, 9)));
                }
            }
            Deque deque = this.b;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(SemanticState.Multiline);
            deque.add(byteBufferAllocateDirect);
            urlRequest.read(byteBufferAllocateDirect);
            return;
        }
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.clear();
        tmb tmbVar = this.h;
        tmbVar.g.h();
        tns tnsVar = tmbVar.b;
        if (tnsVar.D()) {
            tmbVar.d();
            return;
        }
        ((tkr) tmbVar.c).m.b();
        taq.n(tnsVar);
        tmbVar.a.execute(afwl.i(new szq(tmbVar, 6)));
    }
}
