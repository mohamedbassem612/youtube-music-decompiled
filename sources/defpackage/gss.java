package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gss extends gut {
    private final Context a;
    private final hxs b;

    public gss(Context context, hxs hxsVar) {
        this.b = hxsVar;
        this.a = context;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajhm.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        hxs hxsVar = this.b;
        cf cfVar = (cf) this.a;
        if (hxsVar.isAdded() || hxsVar.isVisible()) {
            return;
        }
        hxsVar.gT(cfVar.getSupportFragmentManager(), "AUDIO_TRACKS_MENU_BOTTOM_SHEET_FRAGMENT");
    }
}
