package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxy extends gut {
    public final vxe a;
    public final ttm b;
    public final tbt c;
    public final jin d;
    private final Context e;
    private final itu f;
    private final abfv g;

    public gxy(Context context, itu ituVar, vxe vxeVar, ttm ttmVar, tbt tbtVar, jin jinVar, abfv abfvVar) {
        context.getClass();
        this.e = context;
        ituVar.getClass();
        this.f = ituVar;
        this.a = vxeVar;
        ttmVar.getClass();
        this.b = ttmVar;
        tbtVar.getClass();
        this.c = tbtVar;
        this.d = jinVar;
        this.g = abfvVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVar = apyr.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apyr apyrVar = (apyr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        typ.f(apyrVar.d);
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (!((Boolean) tym.T(map, "show_confirm_dialog", Boolean.TRUE)).booleanValue()) {
            d(apyrVar, objS);
        } else {
            hrg hrgVar = new hrg(this, apyrVar, objS, 1);
            this.g.g(this.e).setTitle(R.string.delete_playlist_confirm_msg).setPositiveButton(R.string.delete_playlist_confirm_button, hrgVar).setNegativeButton(android.R.string.cancel, hrgVar).create().show();
        }
    }

    public final void d(apyr apyrVar, Object obj) {
        String str = apyrVar.d;
        adrz adrzVar = new adrz(this, obj, apyrVar, 1);
        itu ituVar = this.f;
        ituVar.f.ae(3);
        taf.i(ituVar.c.g(Uri.parse(str)), ituVar.d, new ijj(adrzVar, 12), new itt(ituVar, adrzVar, 0), new gqd(12));
    }
}
