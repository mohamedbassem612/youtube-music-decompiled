package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jao implements adlz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jao(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            adlyVar.f("sectionListController", this.a);
            return;
        }
        if (i2 == 1) {
            adlyVar.f("pagePadding", Integer.valueOf(jnj.x(((grf) this.a).requireContext())));
            return;
        }
        if (i2 == 2) {
            adlyVar.f("backgroundColor", Integer.valueOf(((Context) this.a).getColor(R.color.music_full_transparent)));
            return;
        }
        if (i2 == 3) {
            Object obj = this.a;
            adlyVar.f("headerItemModels", obj != null ? ((jat) obj).b : null);
        } else if (i2 == 4) {
            adlyVar.f("chipCloudController", ((jav) this.a).a);
        } else {
            if (i2 == 5) {
                adlyVar.f("chipCloudPagePadding", Integer.valueOf(((Context) this.a).getResources().getDimensionPixelSize(R.dimen.page_margin)));
                return;
            }
            HashMap map = new HashMap();
            map.put("engagement_panel_id_key", this.a);
            adlyVar.g(map);
        }
    }
}
