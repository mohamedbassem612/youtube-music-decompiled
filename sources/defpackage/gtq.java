package defpackage;

import android.os.Handler;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gtq implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gtq(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r7v20, types: [avls, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, zza] */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                gtr gtrVar = new gtr(obj, th, i);
                Optional optional = ((gts) obj).d;
                if (true == optional.isPresent()) {
                    Object obj2 = optional.get();
                    Object obj3 = gtrVar.a;
                    Object obj4 = gtrVar.b;
                    ttm ttmVar = ((gts) obj3).b;
                    jio jioVarE = jin.e();
                    ((jik) jioVarE).k(ttmVar.b((Throwable) obj4));
                    ((jin) obj2).d(jioVarE.b());
                }
                break;
            case 1:
                agkz agkzVar = gpo.a;
                this.a.jj(taq.z(th));
                break;
            case 2:
                Object obj5 = this.a;
                jio jioVarE2 = jin.e();
                guv guvVar = (guv) obj5;
                ((jik) jioVarE2).k(guvVar.a.b(th));
                guvVar.c.d(jioVarE2.b());
                break;
            case 3:
                ((gwl) this.a).e(th);
                break;
            case 4:
                ((gxg) this.a).c.e(th);
                ((agrc) ((agrc) ((agrc) gxg.a.c().i(agso.a, "SetWatchHistoryPaused")).j(th)).k("com/google/android/apps/youtube/music/command/SetWatchHistoryPausedSettingCommandResolver", "showError", 'p', "SetWatchHistoryPausedSettingCommandResolver.java")).t("Error requesting SetSetting");
                break;
            case 5:
                Object obj6 = this.a;
                jio jioVarE3 = jin.e();
                gya gyaVar = (gya) obj6;
                ((jik) jioVarE3).k(gyaVar.e.b(th));
                gyaVar.g.d(jioVarE3.b());
                break;
            case 6:
                agrx agrxVar = agso.a;
                this.a.b(new Exception());
                break;
            case 7:
                hgy.k((awlx) this.a, th);
                break;
            case 8:
                hgy.l((awlx) this.a, th);
                break;
            case 9:
                hhr.h((hjn) this.a, false);
                break;
            case 10:
                Duration duration = hiv.a;
                ((hit) this.a).jj(new toe(th));
                break;
            case 11:
                Duration duration2 = hiv.a;
                ((hiu) this.a).jj(new toe(th));
                break;
            case 12:
                toe toeVar = new toe(th);
                String message = toeVar.getMessage() != null ? toeVar.getMessage() : "Lacking required capabilities.";
                Object obj7 = this.a;
                zvp.a(zvn.b, zvm.n, message);
                ((Handler) ((hiv) obj7).r.io()).post(new hgx(obj7, 4));
                break;
            case 13:
                Duration duration3 = hiv.a;
                ((hit) this.a).jj(new toe(th));
                break;
            case 14:
                Duration duration4 = hiv.a;
                ((his) this.a).jj(new toe(th));
                break;
            case 15:
                ((hja) this.a).b = false;
                break;
            case 16:
                this.a.c(th);
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) hot.ae.b().i(agso.a, "OfflinePlDetailFragment")).j(th)).k("com/google/android/apps/youtube/music/offline/browse/OfflinePlaylistDetailPageFragment", "initiateBrowseResponseStreamProcessing", (char) 193, "OfflinePlaylistDetailPageFragment.java")).t("Error within onDataCallback");
                if (th != null) {
                    ((hot) this.a).I(th);
                }
                break;
            case 18:
                ((agrc) ((agrc) ((agrc) hur.a.b().i(agso.a, "OfflineBrowsePageGenSvc")).j(th)).k("com/google/android/apps/youtube/music/offline/service/OfflineBrowsePageGenerationService", "updateItemViewModeAndCreatePage", (char) 420, "OfflineBrowsePageGenerationService.java")).t("Unable to query for item view mode");
                this.a.jj(new toe(th));
                break;
            case 19:
                ((agrc) ((agrc) ((agrc) hur.a.b().i(agso.a, "OfflineBrowsePageGenSvc")).j(th)).k("com/google/android/apps/youtube/music/offline/service/OfflineBrowsePageGenerationService", "sendContinuationRequest", (char) 402, "OfflineBrowsePageGenerationService.java")).t("Unable to query for downloads library");
                this.a.jj(new toe(th));
                break;
            default:
                this.a.jj(new toe(th));
                break;
        }
    }
}
