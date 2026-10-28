package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gob implements adlz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gob(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        RecyclerView recyclerView;
        Object objC;
        Object objG;
        int iMax = 0;
        z = false;
        boolean z = false;
        iMax = 0;
        switch (this.$cid) {
            case 0:
                adlyVar.f("useChartsPadding", Boolean.TRUE);
                adlyVar.f("pagePadding", Integer.valueOf(jnj.x(((goc) this.a).requireContext())));
                break;
            case 1:
                adlyVar.f("pagePadding", Integer.valueOf(jnj.x(((gnj) this.a).requireContext())));
                break;
            case 2:
                adlyVar.f("pagePadding", Integer.valueOf(jnj.x(((got) this.a).requireContext())));
                break;
            case 3:
                gpl gplVar = (gpl) this.a;
                adlyVar.f("pagePadding", Integer.valueOf(jnj.x(gplVar.requireContext())));
                Object obj = Boolean.TRUE;
                adlyVar.f("useLibraryPadding", obj);
                adlyVar.f("toggleButtonIconSizeResId", Integer.valueOf(R.dimen.library_toggle_button_icon_size));
                adlyVar.f("useAnimatedChipCloudFabAnimationConfig", obj);
                adlyVar.f("roundedCornersResId", Integer.valueOf(R.dimen.library_rounded_corner_radius));
                if (i == 0) {
                    if (gplVar.A != null && (recyclerView = gplVar.al) != null) {
                        iMax = Math.max(((recyclerView.getHeight() / 2) - gplVar.A.getHeight()) - (gplVar.getResources().getDimensionPixelSize(R.dimen.message_renderer_height) / 2), gplVar.getResources().getDimensionPixelSize(R.dimen.message_renderer_minimum_top_margin));
                    }
                    adlyVar.f("messageRendererLayoutTopMargin", Integer.valueOf(iMax));
                }
                break;
            case 4:
                HashMap map = new HashMap();
                map.put("engagement_panel_id_key", this.a);
                adlyVar.g(map);
                break;
            case 5:
                adlyVar.f("thumbnailSelectionController", ((ytf) this.a).g);
                break;
            case 6:
                adlyVar.f("VoteReorderCoordinatorKey", this.a);
                break;
            case 7:
                Object obj2 = this.a;
                adlyVar.f("actionButtonOnClickListener", obj2);
                adlyVar.f("pagePadding", Integer.valueOf(jnj.x(((ioc) obj2).requireContext())));
                adlyVar.f("hideKeyboardOnClick", Boolean.TRUE);
                break;
            case 8:
                agrf agrfVar = iog.a;
                adlyVar.f("pagePadding", Integer.valueOf(jnj.x((Context) this.a)));
                break;
            case 9:
                Object objD = adkzVar.d(i);
                if ((objD instanceof anzi) || (objD instanceof iko)) {
                    ivj ivjVar = (ivj) this.a;
                    int iK = ivjVar.K(adkzVar, i);
                    if (ivjVar.ah && (iK > 1 || ivjVar.L(adkzVar, 0, adkzVar.a() - 1) > 1)) {
                        z = true;
                    }
                    adlyVar.f("isDraggable", Boolean.valueOf(z));
                }
                break;
            case 10:
                iws iwsVar = (iws) this.a;
                adlyVar.a(iwsVar.ae);
                adlyVar.f("isStickyHeader", Boolean.TRUE);
                adlyVar.f("pagePadding", Integer.valueOf(jnj.x(iwsVar.getContext())));
                break;
            case 11:
                int i2 = izl.a;
                adlyVar.f("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
                break;
            case 12:
                Object obj3 = this.a;
                adlyVar.f("com.google.android.libraries.youtube.innertube.endpoint.tag", ((izp) obj3).m);
                izq izqVar = (izq) obj3;
                adlyVar.f("toggleMenuItemMutations", izqVar.p);
                adlyVar.a(izqVar.q);
                break;
            case 13:
                adly adlyVar2 = ((izs) this.a).o;
                if (adlyVar2 != null && (objC = adlyVar2.c("sectionListController")) != null) {
                    adlyVar.f("sectionListController", objC);
                    break;
                }
                break;
            case 14:
                adlyVar.f("blockRegistry", this.a);
                break;
            case 15:
                jol jolVar = (jol) this.a;
                if (!jolVar.o()) {
                    adlyVar.f("pagePadding", Integer.valueOf(jnj.x(jolVar.a)));
                }
                break;
            case 16:
                if (i >= 0) {
                    wwv wwvVar = (wwv) this.a;
                    ArrayList arrayList = wwvVar.a;
                    if (i < arrayList.size() && (objG = wwvVar.g((String) arrayList.get(i))) != null) {
                        adlyVar.f("live_chat_item_action", objG);
                        break;
                    }
                }
                break;
            case 17:
                Optional optionalU = wyq.u(adkzVar.d(i));
                if (!optionalU.isEmpty()) {
                    wyo wyoVar = (wyo) ((wyq) this.a).c.get(optionalU.get());
                    if (wyoVar != null) {
                        adlyVar.f("ticker_start_timestamp_ms", Long.valueOf(wyoVar.d));
                        adlyVar.f("ticker_applied_action", wyoVar.e);
                    }
                }
                break;
            default:
                adlyVar.a(((zqa) this.a).a);
                break;
        }
    }

    public gob(wyq wyqVar, int i) {
        this.$cid = i;
        this.a = wyqVar;
    }
}
