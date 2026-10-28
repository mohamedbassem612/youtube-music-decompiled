package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tki extends tkk {
    private final boolean b;
    private final ArrayDeque c;
    private int d;
    private int e;
    private int f;
    private int g;

    public tki(tiz tizVar, boolean z) {
        super(tizVar);
        this.b = z;
        this.c = new ArrayDeque(2);
        this.f = -1;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        this.c.clear();
        this.a.l(urlRequest, urlResponseInfo);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        urlRequest.getClass();
        cronetException.getClass();
        this.c.clear();
        this.a.m(urlRequest, urlResponseInfo, cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        byteBuffer.getClass();
        this.a.p(urlRequest, urlResponseInfo);
        int iPosition = byteBuffer.position();
        int i = iPosition - this.d;
        this.f -= i;
        this.g += i;
        this.d = iPosition;
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
            return;
        }
        byteBuffer.flip();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(awro.h(this.f, SemanticState.Multiline, 393216));
        byteBufferAllocateDirect.getClass();
        this.d = 0;
        this.c.add(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        str.getClass();
        this.a.q(urlRequest, urlResponseInfo, str);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        tkh tkhVar;
        int iH;
        String str;
        urlRequest.getClass();
        urlResponseInfo.getClass();
        int i = this.e;
        this.e = i + 1;
        if (i != 0) {
            throw new IllegalArgumentException("UnaryScanner instances cannot be reused");
        }
        this.a.r(urlRequest, urlResponseInfo);
        Map allHeaders = urlResponseInfo.getAllHeaders();
        List list = (List) allHeaders.get("Content-Length");
        Integer numG = (list == null || (str = (String) list.get(0)) == null) ? null : awrc.G(str);
        List list2 = (List) allHeaders.get("Content-Encoding");
        String str2 = list2 != null ? (String) list2.get(0) : null;
        List list3 = (List) allHeaders.get("Content-Type");
        String str3 = list3 != null ? (String) list3.get(0) : null;
        if (numG == null) {
            tkhVar = new tkh(-1, false);
        } else if (TextUtils.isEmpty(str2) || awrc.c("identity", str2)) {
            tkhVar = new tkh(numG.intValue(), true);
        } else if (awrc.c("application/x-protobuf", str3)) {
            tkhVar = (this.b && awrc.z("br", str2)) ? new tkh((int) (((double) numG.intValue()) * 4.5d), false) : new tkh(numG.intValue() * 3, false);
        } else {
            tkhVar = new tkh((int) (((double) numG.intValue()) * 1.5d), false);
        }
        int i2 = tkhVar.a;
        if (tkhVar.b) {
            iH = SemanticState.Hidden;
            if (i2 >= 256) {
                iH = awro.h(i2, SemanticState.Multiline, 393216);
            }
        } else {
            iH = awro.h(i2, SemanticState.Multiline, 393216);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iH);
        byteBufferAllocateDirect.getClass();
        this.c.add(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        ArrayDeque arrayDeque = this.c;
        Object objPeekLast = arrayDeque.peekLast();
        objPeekLast.getClass();
        ByteBuffer byteBuffer = (ByteBuffer) objPeekLast;
        byteBuffer.flip();
        if (!byteBuffer.hasRemaining()) {
            arrayDeque.removeLast();
        }
        try {
            if (this.b) {
                agke agkeVarT = aguu.T(arrayDeque);
                arrayDeque.clear();
                if (nsi.k(agkeVarT) != 0) {
                    this.a.n(urlRequest, urlResponseInfo, agkeVarT);
                }
            } else {
                try {
                    byte[] bArrH = aigm.T(arrayDeque).H(this.g);
                    bArrH.getClass();
                    this.c.clear();
                    if (bArrH.length != 0) {
                        this.a.o(urlRequest, urlResponseInfo, bArrH);
                    }
                } catch (IOException e) {
                    this.a.m(urlRequest, urlResponseInfo, new tkj("IOException during readRawBytes", e));
                    this.c.clear();
                    return;
                }
            }
            this.a.s(urlRequest, urlResponseInfo);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }
}
