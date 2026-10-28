package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afxe extends UrlRequest.Callback {
    private final UrlRequest.Callback a;
    private final afwn b = new afwn(afty.c(false));

    public afxe(UrlRequest.Callback callback) {
        this.a = callback;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        afwn afwnVar = this.b;
        afwn afwnVarD = afwn.d();
        afwn.c(afwnVar);
        try {
            this.a.onCanceled(urlRequest, urlResponseInfo);
        } finally {
            afwn.c(afwnVarD);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        afwn afwnVar = this.b;
        afwn afwnVarD = afwn.d();
        afwn.c(afwnVar);
        try {
            this.a.onFailed(urlRequest, urlResponseInfo, cronetException);
        } finally {
            afwn.c(afwnVarD);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        aftx aftxVar = afty.d;
        afwn afwnVar = new afwn(((afvh) aftxVar.get()).c);
        afty.e((afvh) aftxVar.get(), this.b.a);
        try {
            this.a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        } finally {
            afty.e((afvh) afty.d.get(), afwnVar.a);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        afwn afwnVar = this.b;
        afwn afwnVarD = afwn.d();
        afwn.c(afwnVar);
        try {
            this.a.onRedirectReceived(urlRequest, urlResponseInfo, str);
        } finally {
            afwn.c(afwnVarD);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        aftx aftxVar = afty.d;
        afwn afwnVar = new afwn(((afvh) aftxVar.get()).c);
        afty.e((afvh) aftxVar.get(), this.b.a);
        try {
            this.a.onResponseStarted(urlRequest, urlResponseInfo);
        } finally {
            afty.e((afvh) afty.d.get(), afwnVar.a);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        aftx aftxVar = afty.d;
        afwn afwnVar = new afwn(((afvh) aftxVar.get()).c);
        afty.e((afvh) aftxVar.get(), this.b.a);
        try {
            this.a.onSucceeded(urlRequest, urlResponseInfo);
        } finally {
            afty.e((afvh) afty.d.get(), afwnVar.a);
        }
    }
}
