package defpackage;

import android.R;
import android.content.Context;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrarUpb;
import com.google.android.libraries.multiplatform.elements.runtime.ReaperThreadJniWrapper;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adav implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adav(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        Object mavVar;
        switch (this.$cid) {
            case 0:
                mavVar = new mav((Container) this.a.io());
                break;
            case 1:
                Object obj = this.a;
                adak adakVar = (adak) obj;
                return adakVar.p.l(14, 45785871L, false) ? ahcs.e(adakVar.c(), afwl.a(new acpb(obj, 8)), adakVar.k) : ahng.n(adakVar.b());
            case 2:
                return (ByteStore) this.a.io();
            case 3:
                return (ComponentSharedResources) this.a.io();
            case 4:
                return (opq) this.a.io();
            case 5:
                return (SubscriptionProcessorRegistrarUpb) this.a.io();
            case 6:
                return (UnifiedTemplateResolver) this.a.io();
            case 7:
                return (ReaperThreadJniWrapper) this.a.io();
            case 8:
                return (DirectUpdateDataRelay) this.a.io();
            case 9:
                return tzk.s((Context) this.a) ? adhp.b : adhp.a;
            case 10:
                fep fepVar = new fep(((adiz) this.a).f.getResources().getInteger(R.integer.config_shortAnimTime));
                fepVar.b();
                feq feqVarA = fepVar.a();
                fby fbyVar = new fby();
                fbyVar.a = feqVarA;
                mavVar = fbyVar;
                break;
            case 11:
                qtf qtfVarF = ((aerv) this.a).a.f("/client_streamz/youtube/ads/companion/multi_item_shopping_companion_presented", new qte("filling_type", String.class));
                qtfVarF.c();
                return qtfVarF;
            case 12:
                qtf qtfVarF2 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/eom_consent_flow_state", new qte("status", String.class));
                qtfVarF2.c();
                return qtfVarF2;
            case 13:
                qtf qtfVarF3 = ((aerv) this.a).a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_received", new qte[0]);
                qtfVarF3.c();
                return qtfVarF3;
            case 14:
                qtf qtfVarF4 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/incognito_griffin_count", new qte[0]);
                qtfVarF4.c();
                return qtfVarF4;
            case 15:
                qtf qtfVarF5 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/offline_account_switcher_fetched", new qte("result", String.class), new qte("storage_key", String.class));
                qtfVarF5.c();
                return qtfVarF5;
            case 16:
                qtf qtfVarF6 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/offline_account_switcher_saved", new qte("result", String.class), new qte("storage_key", String.class));
                qtfVarF6.c();
                return qtfVarF6;
            case 17:
                qtf qtfVarF7 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/open_my_google_page", new qte("auth_type", String.class));
                qtfVarF7.c();
                return qtfVarF7;
            case 18:
                qtf qtfVarF8 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/reauth_flow_status", new qte("status", String.class));
                qtfVarF8.c();
                return qtfVarF8;
            case 19:
                qtf qtfVarF9 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/removed_identities", new qte("is_channel_delegate", Boolean.class));
                qtfVarF9.c();
                return qtfVarF9;
            default:
                qtf qtfVarF10 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/signed_out_state_store_migration", new qte("status", String.class));
                qtfVarF10.c();
                return qtfVarF10;
        }
        return mavVar;
    }
}
