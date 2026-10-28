package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvr extends gut {
    private final Context a;
    private final hnq b;
    private final vxe c;
    private final vxz d;

    public gvr(Context context, hnq hnqVar, vxe vxeVar, vxz vxzVar) {
        this.a = context;
        this.b = hnqVar;
        this.c = vxeVar;
        this.d = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anzv.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anzv.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        int iAU = a.aU(((anzu) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b);
        if (iAU == 0) {
            iAU = 1;
        }
        if (iAU - 1 != 1) {
            throw new IllegalArgumentException("Update smart downloads action is not specified or not implemented");
        }
        this.b.d(true);
        if (this.d.l(98, 45419996L, false)) {
            return;
        }
        this.c.a(fhz.P(this.a.getString(R.string.smart_downloads_introducer_enable_toast)));
    }
}
