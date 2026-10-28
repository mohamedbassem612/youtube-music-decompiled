package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wuy implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ wuy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
            case 12:
                a((Throwable) obj);
                break;
            case 13:
                a((Throwable) obj);
                break;
            case 14:
                a((Throwable) obj);
                break;
            case 15:
                a((Throwable) obj);
                break;
            case 16:
                a((Throwable) obj);
                break;
            case 17:
                a((Throwable) obj);
                break;
            case 18:
                a((Throwable) obj);
                break;
            case 19:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, zwx] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r12v44, types: [eug, java.lang.Object] */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                this.a.n("rpc_e");
                break;
            case 1:
                ?? r12 = this.a;
                if (!(th instanceof toe)) {
                    r12.jj(new toe(th));
                } else {
                    r12.jj((toe) th);
                }
                break;
            case 2:
                wzq wzqVar = (wzq) this.a;
                wzqVar.k.setVisibility(8);
                wzqVar.l.setVisibility(0);
                wzqVar.m.setText(wzqVar.f.b(th));
                break;
            case 3:
                ((zty) this.a).g(th);
                break;
            case 4:
                ((xfn) this.a).i("Failed to save the updated Heartbeat index.", th);
                break;
            case 5:
                xfn xfnVar = (xfn) this.a;
                xfnVar.i("Failed to reset the heartbeat index.", th);
                xfnVar.l(3, xfnVar.g, xfnVar.h, false);
                break;
            case 6:
                ((xfn) ((xfm) this.a).a).i("Failed to reset heartbeat.", th);
                break;
            case 7:
                ((xfn) ((xfm) this.a).a).i("Failed to reset heartbeat.", th);
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) xyk.a.b().i(agso.a, "MDX.ExternalMessage")).j(th)).k("com/google/android/libraries/youtube/mdx/remote/ExternalMessageControllerImpl", "executeRequest", (char) 198, "ExternalMessageControllerImpl.java")).t("IOException while sending the request message.");
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 15;
                zvjVarA.d("IOException while sending the request message.");
                ((xyk) this.a).d.a(zvjVarA.a());
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) yaz.n.b().i(agso.a, "MDX.DialRecoverer")).j(th)).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSessionRecoverer", "onRouteFound", 'z', "DialSessionRecoverer.java")).t("DIAL Error.");
                Object obj = this.a;
                ((yab) obj).h();
                ((yaz) obj).p = null;
                break;
            case 10:
                zik.bB(((yen) this.a).c, 7, new Exception(th));
                break;
            case 11:
                this.a.y(taq.z(th));
                break;
            case 12:
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((abqc) this.a).b(th);
                break;
            case 13:
                abqc abqcVar = (abqc) this.a;
                abqcVar.j = th;
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                abqcVar.g();
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) abty.a.b()).j(th)).k("com/google/android/libraries/youtube/player/sequencerv2/ClientPrefetchController", "maybePrefetch", (char) 153, "ClientPrefetchController.java")).t("Failed to prefetch sequenceItem");
                abty abtyVar = (abty) this.a;
                if (abtyVar.d()) {
                    abtyVar.a();
                }
                break;
            case 15:
                ((agrc) ((agrc) ((agrc) achd.a.b()).j(th)).k("com/google/android/libraries/youtube/player/video/heartbeat/AttestationDecoratingResponseHandler", "solveAttestationChallenge", (char) 198, "AttestationDecoratingResponseHandler.java")).t("Failed to get attestation response from RealTimeAttestation API");
                achd achdVar = (achd) this.a;
                achdVar.b = Optional.empty();
                achdVar.c = 3;
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) acrn.a.b()).j(th)).k("com/google/android/libraries/youtube/reel/internal/pager/ReelSequenceController", "initializeFromOfflineSequence", (char) 551, "ReelSequenceController.java")).t("ReelWatchSequence Error");
                acrn acrnVar = (acrn) this.a;
                acrnVar.f(th, acrnVar.i, false, true);
                break;
            case 17:
                ((acrq) this.a).f();
                break;
            case 18:
                ((acrq) this.a).d.f("r_sqe");
                break;
            case 19:
                boolean z = th instanceof Exception;
                ?? r13 = this.a;
                if (!z) {
                    r13.e(new Exception("Future failed with a Throwable", th));
                } else {
                    r13.e((Exception) th);
                }
                break;
            default:
                ((aehd) this.a).g = null;
                break;
        }
    }
}
