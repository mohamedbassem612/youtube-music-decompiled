package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hyl implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hyl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [avls, java.lang.Object] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) hym.a.b().i(agso.a, "NerdStatsBottomSheetBtn")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/player/controls/NerdStatsBottomSheetButtonController", "maybeShowNerdStats", 'i', "NerdStatsBottomSheetButtonController.java")).t("Error getting player feature settings.");
                ((hym) this.a).c.g(false);
                break;
            case 1:
                ((agrc) ((agrc) hkl.a.c().i(agso.a, "DefaultPivotBarCtlr")).k("com/google/android/apps/youtube/music/navigation/DefaultPivotBarController", "doGuideServiceRequest", 389, "DefaultPivotBarController.java")).t("Failed to load guide response from network.");
                ((avyd) this.a).a();
                break;
            case 2:
                atpu atpuVar = (atpu) obj;
                if (atpuVar != null) {
                    Object obj2 = this.a;
                    ((hym) obj2).c.g(atpuVar.d);
                }
                break;
            case 3:
                boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
                Object obj3 = this.a;
                if (zEquals) {
                    ((ivn) obj3).n = true;
                }
                ((ivn) obj3).f();
                break;
            case 4:
                tdw tdwVar = (tdw) obj;
                ?? r7 = this.a;
                if (!r7.f()) {
                    r7.c(tdwVar);
                }
                break;
            case 5:
                Uri.Builder builder = (Uri.Builder) obj;
                int i = wlt.d;
                if (builder != null) {
                    anin aninVar = ((vyo) this.a).b().g;
                    if (aninVar == null) {
                        aninVar = anin.a;
                    }
                    if (aninVar.b) {
                        builder.appendQueryParameter("retry", "1");
                    }
                }
                break;
            case 6:
                ((acdf) this.a).m((List) obj);
                break;
            default:
                ((acdf) this.a).m((List) obj);
                break;
        }
    }
}
