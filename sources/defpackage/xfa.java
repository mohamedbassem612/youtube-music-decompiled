package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xfa implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xfa(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            case 2:
                a((Throwable) obj);
                break;
            case 3:
                a((Throwable) obj);
                break;
            case 4:
                a((Throwable) obj);
                break;
            case 5:
                a((Throwable) obj);
                break;
            case 6:
                a((Throwable) obj);
                break;
            case 7:
                a((Throwable) obj);
                break;
            case 8:
                a((Throwable) obj);
                break;
            case 9:
                a((Throwable) obj);
                break;
            case 10:
                a((Throwable) obj);
                break;
            case 11:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.lang.Object, vxe] */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) xfc.a.b()).j(th)).k("com/google/android/libraries/youtube/logging/event/EventLoggingFixedBatchRetryDelayedEventDispatcher", "dispatchEvents", (char) 191, "EventLoggingFixedBatchRetryDelayedEventDispatcher.java")).w("Volley request retry failed for type %s", alox.class.getCanonicalName());
                Object obj = this.a;
                xfc xfcVar = (xfc) obj;
                if (xfcVar.h.a && (th instanceof toe) && (th.getCause() instanceof IllegalStateException)) {
                    xfcVar.b("!Dispatch", (Exception) th.getCause());
                } else {
                    xfcVar.f.b(tai.b, new vwh(obj, this.b, th, 13, (char[]) null));
                }
                break;
            case 1:
                ((wvw) this.a).e.remove(this.b);
                break;
            case 2:
                agru agruVarB = xxp.a.b();
                agrx agrxVar = agso.a;
                ((agrc) ((agrc) ((agrc) agruVarB.i(agrxVar, "MDX.player.queue.mdxServerQueueFetcher")).j(th.getCause())).k("com/google/android/libraries/youtube/mdx/player/MdxServerQueueFetcher", "reloadQueue", 'B', "MdxServerQueueFetcher.java")).t("Error while reloading Watch Next.");
                ((agrc) ((agrc) ((agrc) xww.a.b().i(agrxVar, "MDX.player.defaultLocalPlaybackControl")).j(th.getCause())).k("com/google/android/libraries/youtube/mdx/player/MdxDefaultLocalPlaybackControl$1", "onError", '<', "MdxDefaultLocalPlaybackControl.java")).t("Error while reloading queue.");
                ((xww) ((xxj) this.a).a).a((xyv) this.b);
                break;
            case 3:
                ((ycp) this.b).k((xvj) this.a, null);
                break;
            case 4:
                Exception exc = new Exception(th);
                yfo yfoVar = (yfo) this.a;
                zik.bB(yfoVar.e, 8, exc);
                yfoVar.b.remove(this.b);
                break;
            case 5:
                Exception exc2 = new Exception(th);
                yfo yfoVar2 = (yfo) this.a;
                zik.bB(yfoVar2.e, 9, exc2);
                yfoVar2.b.remove(this.b);
                break;
            case 6:
                zvp.b(zvn.b, zvm.h, "Scheduling notification processing failed", th);
                Bundle bundle = new Bundle();
                ?? r0 = this.b;
                bundle.putByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer", r0.toByteArray());
                bundle.putString("renderer_class_name", r0.getClass().getName());
                ((syi) ((aaok) this.a).b).a("notification_processing", bundle);
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) abzn.a.b()).j(th)).k("com/google/android/libraries/youtube/player/stats/attestation/AttestationClient", "sendPingWithAttestManager", (char) 384, "AttestationClient.java")).t("Failed to get attestation response from RealTimeAttestation API");
                ((abzn) this.b).c(Optional.empty(), this.a);
                break;
            case 8:
                if (th instanceof toe) {
                    Object obj2 = this.b;
                    Object obj3 = ((sve) this.a).a;
                    obj3.getClass();
                    adyu adyuVar = new adyu(obj3, 1);
                    Optional optional = (Optional) obj2;
                    if (true == optional.isPresent()) {
                        adyuVar.a.a((ajwo) optional.get());
                    }
                }
                break;
            case 9:
                this.b.iT(this.a, th instanceof Exception ? (Exception) th : new Exception(th));
                break;
            case 10:
                aegn.r(th.getMessage());
                this.a.a(this.b);
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) aegn.a.b()).j(th)).k("com/google/android/libraries/youtube/rendering/ui/webview/WebViewAuthControllerImplAS", "getAccount", (char) 223, "WebViewAuthControllerImplAS.java")).t("getAndroidAccount failed");
                aegn.r("GetAccountException");
                this.a.a(this.b);
                break;
            default:
                ((agrc) ((agrc) aelt.a.b()).j(th).k("com/google/android/libraries/youtube/share/endpoint/SubmitShareEngagementCommandResolver", "resolve$<anonymous>", 69, "SubmitShareEngagementCommandResolver.kt")).t("SubmitShareEngagement RPC failed");
                aqei aqeiVar = (aqei) this.b;
                if ((aqeiVar.c & 2) != 0) {
                    vxe vxeVar = (vxe) ((aelt) this.a).b.io();
                    ajwo ajwoVar = aqeiVar.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                }
                break;
        }
    }

    public /* synthetic */ xfa(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
