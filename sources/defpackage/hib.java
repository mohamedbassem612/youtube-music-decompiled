package defpackage;

import android.app.Notification;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hib implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hib(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r9v29, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v31, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                break;
            case 1:
                this.a.invoke(obj);
                break;
            case 2:
                this.a.invoke(obj);
                break;
            case 3:
                this.a.invoke(obj);
                break;
            case 4:
                ((hje) this.a).a();
                break;
            case 5:
                ((hji) this.a).a();
                break;
            case 6:
                ((hms) this.a).d.n.d(R.string.offline_download_removed);
                break;
            case 7:
                yx yxVar = new yx();
                yxVar.c(aaka.b((String) obj));
                ((hng) this.a).c.kk(yxVar.b());
                break;
            case 8:
                Object obj2 = this.a;
                taf.g(((hng) obj2).a.b((List) obj), new hvn(obj2, 1));
                break;
            case 9:
                ((hng) this.a).c((List) obj);
                break;
            case 10:
                Object obj3 = this.a;
                taf.g(((hng) obj3).a.b((List) obj), new gln(obj3, 20));
                break;
            case 11:
                yx yxVar2 = new yx();
                yxVar2.c(aaka.a((String) obj));
                ((hng) this.a).c.kk(yxVar2.b());
                break;
            case 12:
                yx yxVar3 = new yx();
                yxVar3.c(aaka.a((String) obj));
                ((hng) this.a).c.kk(yxVar3.b());
                break;
            case 13:
                Throwable th = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) hoj.a.b().i(agso.a, "MusicDLResponseGenBlock")).j(th)).k("com/google/android/apps/youtube/music/offline/blocks/MusicDownloadsResponseGenerationBlockImpl", "generateSingleColumnBrowseResultsRender", (char) 224, "MusicDownloadsResponseGenerationBlockImpl.java")).t("Error when processing entity update");
                this.a.c(th);
                break;
            case 14:
                Throwable th2 = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) hoj.a.b().i(agso.a, "MusicDLResponseGenBlock")).j(th2)).k("com/google/android/apps/youtube/music/offline/blocks/MusicDownloadsResponseGenerationBlockImpl", "handleSingleContainers", (char) 305, "MusicDownloadsResponseGenerationBlockImpl.java")).t("Error when processing entity update");
                this.a.c(th2);
                break;
            case 15:
                Throwable th3 = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) hoj.a.b().i(agso.a, "MusicDLResponseGenBlock")).j(th3)).k("com/google/android/apps/youtube/music/offline/blocks/MusicDownloadsResponseGenerationBlockImpl", "handleRegularContainers", (char) 359, "MusicDownloadsResponseGenerationBlockImpl.java")).t("Error when processing entity update");
                this.a.c(th3);
                break;
            case 16:
                this.a.invoke(obj);
                break;
            case 17:
                this.a.invoke(obj);
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                this.a.kk(obj);
                break;
            default:
                ((htp) this.a).c.d("ytm_smart_downloads", 8, (Notification) obj);
                break;
        }
    }
}
