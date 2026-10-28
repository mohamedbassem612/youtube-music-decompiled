package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gtt extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/FlagCommandResolver");
    public final Context b;
    public final ttm c;
    public final vxe d;
    public final abfv e;
    private final aend f;

    public gtt(Context context, aend aendVar, ttm ttmVar, vxe vxeVar, abfv abfvVar) {
        context.getClass();
        this.b = context;
        aendVar.getClass();
        this.f = aendVar;
        ttmVar.getClass();
        this.c = ttmVar;
        vxeVar.getClass();
        this.d = vxeVar;
        abfvVar.getClass();
        this.e = abfvVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akzc.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        if (!((akzc) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e) {
            d(ajwoVar);
            return;
        }
        Context context = this.b;
        new AlertDialog.Builder(context).setMessage(context.getString(R.string.report_playlist_confirmation)).setPositiveButton(R.string.report_button, new ijf((Object) this, (aihn) ajwoVar, 1)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, zwb] */
    public final void d(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akzc.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        aend aendVar = this.f;
        akzc akzcVar = (akzc) objC;
        wpz wpzVar = new wpz(aendVar.b, aendVar.d.e());
        wpzVar.n(vxg.a(ajwoVar));
        wpzVar.a = akzcVar.c;
        int iAS = a.aS(akzcVar.d);
        if (iAS == 0) {
            iAS = 1;
        }
        wpzVar.b = iAS;
        ((wnh) aendVar.c).d(wpzVar, new gtg(this, 2));
    }
}
