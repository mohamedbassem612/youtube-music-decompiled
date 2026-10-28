package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.research.xeno.effect.RemoteAssetManager;
import io.grpc.Status;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class atvv implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public atvv(avje avjeVar, avjb avjbVar, avjf avjfVar, int i) {
        this.$cid = i;
        this.a = avjbVar;
        this.c = avjfVar;
        this.b = avjeVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.research.xeno.effect.RemoteAssetManager$FetchCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v73, types: [axoi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        axkv axkvVar;
        String str = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                if (obj != null) {
                    uyb uybVar = ((uya) obj2).b;
                    if (uybVar.e) {
                        return;
                    }
                    uybVar.b((String) obj);
                    return;
                }
                Object obj3 = this.c;
                if (obj3 != null) {
                    ((agrc) ((agrc) uyb.a.b()).k("com/google/android/libraries/youtube/creation/effects/deprecated/picker/StaticThumbnailProvider$1", "onCompletion", 140, "StaticThumbnailProvider.java")).B("Thumbnail fetch failed for remote url: %s. Error: %s", ((uya) obj2).a, obj3);
                    return;
                }
                return;
            case 1:
                long j = ((RemoteAssetManager) this.b).b;
                ?? r0 = this.a;
                if (j != 0) {
                    RemoteAssetManager.nativeFetchAsset(j, (String) this.c, r0);
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).post(new atvv(((atvw) r0).a, str, "RemoteAssetManager failed to natively load", i));
                    return;
                }
            case 2:
                ((aveo) this.c).e.a((atxy) this.a, (avbe) this.b);
                return;
            case 3:
                Object obj4 = this.c;
                aven avenVar = (aven) obj4;
                Status status = avenVar.c;
                Object avbeVar = this.a;
                Object obj5 = this.b;
                if (status != null) {
                    obj5 = avenVar.c;
                    avbeVar = new avbe();
                }
                try {
                    ((aven) obj4).e.q((Status) obj5, (avbe) avbeVar);
                    return;
                } catch (RuntimeException e) {
                    aveo.a.logp(Level.WARNING, "io.grpc.internal.DelayedClientCall$DelayedListener$3", "run", "Exception thrown by onClose() in ClientCall", (Throwable) e);
                    return;
                }
            case 4:
                avgc avgcVar = (avgc) this.c;
                avge avgeVar = avgcVar.c;
                if (avgeVar.p.a != auzd.e) {
                    avhm avhmVar = avgeVar.o;
                    avef avefVar = avgcVar.a;
                    if (avhmVar == avefVar) {
                        avgeVar.o = null;
                        avgb avgbVar = avgeVar.h;
                        avgbVar.c();
                        avgeVar.b(auzd.d);
                        avkc avkcVar = avgeVar.s;
                        String str2 = avgeVar.t;
                        String strD = avgc.d(avgbVar.a());
                        String strC = avgc.c(avgbVar.a(), auzm.b);
                        Object obj6 = this.b;
                        String strB = avgc.b((avcb) avgbVar.a().a(avfk.a));
                        String str3 = ((avjy) obj6).g;
                        avby avbyVar = avkc.b;
                        agke agkeVarQ = agke.q(str2);
                        agke agkeVarS = agke.s(strD, strC, str3);
                        avbj avbjVar = avkcVar.a;
                        avbjVar.a(avbyVar, agkeVarQ, agkeVarS);
                        avbjVar.b(avkc.e, agke.q(str2), agke.s(strB, strD, strC));
                        return;
                    }
                    if (avgeVar.n == avefVar) {
                        avkc avkcVar2 = avgeVar.s;
                        String str4 = avgeVar.t;
                        avgb avgbVar2 = avgeVar.h;
                        avkcVar2.a.a(avkc.d, agke.q(str4), agke.r(avgc.d(avgbVar2.a()), avgc.c(avgbVar2.a(), auzm.b)));
                        ahno.R(avgeVar.p.a == auzd.a, "Expected state is CONNECTING, actual state is %s", avgeVar.p.a);
                        auzm auzmVar = (auzm) avgbVar2.c.get(avgbVar2.a);
                        int i2 = avgbVar2.b + 1;
                        avgbVar2.b = i2;
                        if (i2 >= auzmVar.e.size()) {
                            avgbVar2.a++;
                            avgbVar2.b = 0;
                        }
                        if (avgbVar2.a < avgbVar2.c.size()) {
                            avgeVar.g();
                            return;
                        }
                        avgeVar.n = null;
                        avgbVar2.c();
                        Object obj7 = this.a;
                        avcj avcjVar = avgeVar.g;
                        avcjVar.c();
                        Status status2 = (Status) obj7;
                        ahno.G(!status2.e(), "The error status must not be OK");
                        avgeVar.d(new auze(auzd.c, status2));
                        if (avgeVar.e) {
                            return;
                        }
                        if (avgeVar.u == null) {
                            avgeVar.u = new avfa();
                        }
                        long jA = avgeVar.u.a() - avgeVar.j.a(TimeUnit.NANOSECONDS);
                        avgeVar.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", avge.j(status2), Long.valueOf(jA));
                        ahno.P(avgeVar.v == null, "previous reconnectTask is not done");
                        avgeVar.v = avcjVar.d(new avep(avgeVar, 11), jA, TimeUnit.NANOSECONDS, avgeVar.b);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Object obj8 = this.a;
                synchronized (((avjb) obj8).a) {
                    if (((avjb) obj8).c) {
                        return;
                    }
                    ((avjb) obj8).a();
                    ((avje) this.b).b.g.execute(new aves(this, this.c, 14, (short[]) null));
                    return;
                }
            case 6:
                Object obj9 = this.b;
                CronetUrlRequest cronetUrlRequest = (CronetUrlRequest) obj9;
                cronetUrlRequest.a();
                synchronized (cronetUrlRequest.d) {
                    if (((CronetUrlRequest) obj9).h()) {
                        return;
                    }
                    ((CronetUrlRequest) obj9).b = true;
                    try {
                        ((CronetUrlRequest) obj9).f.onRedirectReceived((UrlRequest) obj9, (UrlResponseInfo) this.c, (String) this.a);
                        return;
                    } catch (Exception e2) {
                        ((CronetUrlRequest) this.b).e(e2);
                        return;
                    }
                }
            case 7:
                String str5 = CronetUrlRequestContext.a;
                new axjt("CronetUrlRequestContext#postObservationTaskToExecutor " + ((String) this.b) + " running callback", 0);
                Object obj10 = this.c;
                try {
                    try {
                        this.a.run();
                        if (obj10 != null) {
                            axkvVar = (axkv) obj10;
                            axkvVar.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (obj10 == null) {
                            throw th;
                        }
                        ((axkv) obj10).b();
                        throw th;
                    }
                } catch (Exception e3) {
                    Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception thrown from observation task", e3);
                    if (obj10 == null) {
                        return;
                    } else {
                        axkvVar = (axkv) obj10;
                    }
                }
                break;
            case 8:
                new axjt("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + ((String) this.a) + " running callback", 0);
                new axmt(((axoa) this.b).k, (axoi) this.c, 8).run();
                return;
            case 9:
                Object obj11 = this.c;
                axoh axohVar = (axoh) obj11;
                axohVar.p = URI.create(axohVar.m).resolve((String) this.a).toString();
                axohVar.f.add(axohVar.p);
                axohVar.j(2, 3, new axmt(obj11, this.b, 9));
                return;
            default:
                Object obj12 = this.a;
                Object obj13 = this.b;
                Object obj14 = this.c;
                try {
                    ((axof) obj14).a.onFailed(((axof) obj14).d, (UrlResponseInfo) obj13, (CronetException) obj12);
                    break;
                } catch (Exception e4) {
                    ((axof) obj14).d.i("onFailed", e4);
                }
                axof axofVar = (axof) obj14;
                axofVar.c();
                axofVar.d.r.c();
                return;
        }
    }

    public /* synthetic */ atvv(axof axofVar, UrlResponseInfo urlResponseInfo, CronetException cronetException, int i) {
        this.$cid = i;
        this.c = axofVar;
        this.b = urlResponseInfo;
        this.a = cronetException;
    }

    public /* synthetic */ atvv(RemoteAssetManager.FetchCallback fetchCallback, String str, String str2, int i) {
        this.$cid = i;
        this.a = fetchCallback;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ atvv(RemoteAssetManager remoteAssetManager, String str, RemoteAssetManager.FetchCallback fetchCallback, int i) {
        this.$cid = i;
        this.b = remoteAssetManager;
        this.c = str;
        this.a = fetchCallback;
    }

    public atvv(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj3;
        this.c = obj;
    }

    public /* synthetic */ atvv(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ atvv(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public atvv(CronetUrlRequest cronetUrlRequest, axor axorVar, String str, int i) {
        this.$cid = i;
        this.c = axorVar;
        this.a = str;
        this.b = cronetUrlRequest;
    }
}
