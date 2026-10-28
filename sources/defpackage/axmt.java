package defpackage;

import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.Proxy;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axmt implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public /* synthetic */ axmt(Runnable runnable, int i) {
        this.$cid = i;
        this.b = "onFailed";
        this.a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [axoi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [axoi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [axoi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [axoi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                synchronized (((CronetBidirectionalStream) obj).n) {
                    if (!((CronetBidirectionalStream) obj).g()) {
                        try {
                            Object obj2 = this.b;
                            ((CronetBidirectionalStream) obj2).c.onResponseTrailersReceived((BidirectionalStream) obj2, ((CronetBidirectionalStream) obj2).u, (UrlResponseInfo.HeaderBlock) this.a);
                        } catch (Exception e) {
                            ((CronetBidirectionalStream) this.b).e(e);
                        }
                        break;
                    }
                }
                return;
            case 1:
                new axjt("CronetBidirectionalStream#postTaskToExecutor " + ((String) this.b) + " running callback", 0);
                this.a.run();
                return;
            case 2:
                ((CronetBidirectionalStream) this.b).c((CronetException) this.a);
                return;
            case 3:
                String str = CronetUrlRequestContext.a;
                ((Proxy.HttpConnectCallback) ((axoz) this.b).a).onBeforeRequest((Proxy.HttpConnectCallback.Request) this.a);
                return;
            case 4:
                String str2 = CronetUrlRequestContext.a;
                new axjt("CronetUrlRequestContext#postTaskToExecutor " + ((String) this.b) + " running callback", 0);
                this.a.run();
                return;
            case 5:
                ((axow) this.b).onRequestFinished((RequestFinishedInfo) this.a);
                return;
            case 6:
                new axjt("JavaUploadDataSinkBase#executeOnExecutor " + ((String) this.b) + " running callback", 0);
                this.a.run();
                return;
            case 7:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th) {
                    ((axoh) this.a).b(new axmz("System error", th));
                    return;
                }
            case 8:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th2) {
                    ((axoh) this.a).c(th2);
                    return;
                }
            case 9:
                axoh axohVar = (axoh) this.b;
                String str3 = axohVar.p;
                axof axofVar = axohVar.b;
                axofVar.a(new axoe(axofVar, (UrlResponseInfo) this.a, str3, i), "onRedirectReceived");
                return;
            case 10:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th3) {
                    Object obj3 = this.a;
                    axms axmsVar = new axms(obj3, 15);
                    axoh axohVar2 = (axoh) obj3;
                    axohVar2.d(axmsVar, "enterUserErrorState");
                    axohVar2.b(new axml("Exception received from UrlRequest.Callback", th3));
                    return;
                }
            case 11:
                String str4 = axoh.a;
                new axjt("Cronet JavaUrlRequest#executeOnExecutor " + ((String) this.b) + " running callback", 0);
                this.a.run();
                return;
            case 12:
                ?? r0 = this.b;
                axoh axohVar3 = (axoh) this.a;
                axohVar3.d(new axmt(axohVar3, (axoi) r0, 7), "read");
                return;
            case 13:
                Object obj4 = this.a;
                Object obj5 = this.b;
                try {
                    ((axof) obj5).a.onSucceeded(((axof) obj5).d, (UrlResponseInfo) obj4);
                    break;
                } catch (Exception e2) {
                    ((axof) obj5).d.i("onSucceded", e2);
                }
                axof axofVar2 = (axof) obj5;
                axofVar2.c();
                axofVar2.d.r.c();
                return;
            case 14:
                new axjt("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + ((String) this.b) + " running callback", 0);
                this.a.run();
                return;
            case 15:
                new axjt("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + ((String) this.b) + " running callback", 0);
                this.a.run();
                return;
            default:
                Object obj6 = this.a;
                Object obj7 = this.b;
                try {
                    ((axof) obj7).a.onCanceled(((axof) obj7).d, (UrlResponseInfo) obj6);
                    break;
                } catch (Exception e3) {
                    ((axof) obj7).d.i("onCanceled", e3);
                }
                axof axofVar3 = (axof) obj7;
                axofVar3.c();
                axofVar3.d.r.c();
                return;
        }
    }

    public axmt(axow axowVar, RequestFinishedInfo requestFinishedInfo, int i) {
        this.$cid = i;
        this.b = axowVar;
        this.a = requestFinishedInfo;
    }

    public /* synthetic */ axmt(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ axmt(axoh axohVar, axoi axoiVar, int i) {
        this.$cid = i;
        this.a = axohVar;
        this.b = axoiVar;
    }

    public axmt(CronetBidirectionalStream cronetBidirectionalStream, Object obj, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = cronetBidirectionalStream;
    }
}
