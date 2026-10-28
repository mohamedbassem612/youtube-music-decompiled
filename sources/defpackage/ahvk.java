package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import internal.J.N;
import java.io.IOException;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahvk implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ahvk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        lpa lpaVarL;
        switch (this.$cid) {
            case 0:
                this.a.isCancelled();
                return;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.a;
                final Context context = firebaseMessaging.d;
                ahno.e(context);
                final boolean zJ = firebaseMessaging.j();
                if (a.aL()) {
                    SharedPreferences sharedPreferencesC = ahno.C(context);
                    if (!sharedPreferencesC.contains("proxy_retention") || sharedPreferencesC.getBoolean("proxy_retention", false) != zJ) {
                        kli kliVar = firebaseMessaging.e.c;
                        if (kliVar.e.a() >= 241100000) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("proxy_retention", zJ);
                            lpaVarL = klc.a(kliVar.d).b(4, bundle);
                        } else {
                            lpaVarL = mda.l(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        lpaVarL.n(new vp(11), new low() { // from class: ahtg
                            @Override // defpackage.low
                            public final void e(Object obj) {
                                SharedPreferences.Editor editorEdit = ahno.C(context).edit();
                                editorEdit.putBoolean("proxy_retention", zJ);
                                editorEdit.apply();
                            }
                        });
                    }
                }
                if (firebaseMessaging.j()) {
                    firebaseMessaging.d();
                    return;
                }
                return;
            case 2:
                Object obj = this.a;
                synchronized (((CronetUploadDataStream) obj).h) {
                    if (((CronetUploadDataStream) obj).i == 0) {
                        return;
                    }
                    ((CronetUploadDataStream) obj).b(3);
                    if (((CronetUploadDataStream) obj).g == null) {
                        throw new IllegalStateException("Unexpected readData call. Buffer is null");
                    }
                    ((CronetUploadDataStream) obj).j = 0;
                    try {
                        ((CronetUploadDataStream) obj).a();
                        ((CronetUploadDataStream) obj).b.read((UploadDataSink) obj, ((CronetUploadDataStream) obj).g);
                        ((CronetUploadDataStream) obj).f.incrementAndGet();
                        return;
                    } catch (Exception e) {
                        ((CronetUploadDataStream) this.a).c(e);
                        return;
                    }
                }
            case 3:
                try {
                    Object obj2 = this.a;
                    ((CronetUploadDataStream) obj2).a();
                    ((CronetUploadDataStream) obj2).b.close();
                    return;
                } catch (Exception e2) {
                    Log.e("cn_".concat(String.valueOf(CronetUploadDataStream.a)), "Exception thrown when closing", e2);
                    return;
                }
            case 4:
                ((CronetUrlRequest) this.a).e.e();
                return;
            case 5:
                new axjt("CronetUploadDataStream#initializeWithRequest", 0);
                CronetUploadDataStream cronetUploadDataStream = ((CronetUrlRequest) this.a).g;
                synchronized (cronetUploadDataStream.h) {
                    cronetUploadDataStream.j = 2;
                    break;
                }
                try {
                    cronetUploadDataStream.c.a();
                    long length = cronetUploadDataStream.b.getLength();
                    cronetUploadDataStream.d = length;
                    cronetUploadDataStream.e = length;
                    break;
                } catch (Throwable th) {
                    cronetUploadDataStream.c(th);
                }
                synchronized (cronetUploadDataStream.h) {
                    cronetUploadDataStream.j = 3;
                    break;
                }
                Object obj3 = this.a;
                synchronized (((CronetUrlRequest) obj3).d) {
                    if (((CronetUrlRequest) obj3).h()) {
                        return;
                    }
                    CronetUploadDataStream cronetUploadDataStream2 = ((CronetUrlRequest) obj3).g;
                    long j = ((CronetUrlRequest) obj3).a;
                    new axjt("CronetUploadDataStream#attachNativeAdapterToRequest", 0);
                    synchronized (cronetUploadDataStream2.h) {
                        try {
                            cronetUploadDataStream2.i = N.MA4X1aZa(cronetUploadDataStream2, j, cronetUploadDataStream2.d);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    ((CronetUrlRequest) this.a).g();
                    return;
                }
            case 6:
                Object obj4 = this.a;
                CronetUrlRequest cronetUrlRequest = (CronetUrlRequest) obj4;
                cronetUrlRequest.a();
                synchronized (cronetUrlRequest.d) {
                    if (((CronetUrlRequest) obj4).h()) {
                        return;
                    }
                    ((CronetUrlRequest) obj4).c = true;
                    try {
                        ((CronetUrlRequest) obj4).f.onResponseStarted((UrlRequest) obj4, ((CronetUrlRequest) obj4).h);
                        return;
                    } catch (Exception e3) {
                        ((CronetUrlRequest) this.a).e(e3);
                        return;
                    }
                }
            default:
                Object obj5 = this.a;
                synchronized (((CronetUrlRequest) obj5).d) {
                    if (!((CronetUrlRequest) obj5).h()) {
                        ((CronetUrlRequest) obj5).b(0);
                        try {
                            ((CronetUrlRequest) obj5).f.onSucceeded((UrlRequest) obj5, ((CronetUrlRequest) obj5).h);
                        } catch (Exception e4) {
                            ((CronetUrlRequest) this.a).d("onSucceeded", e4);
                        }
                        ((CronetUrlRequest) this.a).c();
                        break;
                    }
                }
                return;
        }
    }

    public ahvk(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
