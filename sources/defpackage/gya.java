package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gya extends gut {
    public final Context a;
    public final iup b;
    public final tbt c;
    public final Executor d;
    public final ttm e;
    public final vxe f;
    public final jin g;
    private final abfv h;

    public gya(Context context, iup iupVar, tbt tbtVar, Executor executor, ttm ttmVar, jin jinVar, vxe vxeVar, abfv abfvVar) {
        this.a = context;
        this.b = iupVar;
        this.c = tbtVar;
        this.d = executor;
        this.e = ttmVar;
        this.g = jinVar;
        this.f = vxeVar;
        this.h = abfvVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, final Map map) {
        aihl aihlVar = apys.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        final apys apysVar = (apys) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        typ.f(apysVar.c);
        final Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        this.h.g(this.a).setTitle(R.string.sideloaded_track_delete_dialog_title).setMessage(R.string.sideloaded_track_delete_dialog_msg).setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() { // from class: gxz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Uri uri = Uri.parse(apysVar.c);
                gya gyaVar = this.a;
                taf.i(gyaVar.b.h(uri), gyaVar.d, new gtq(gyaVar, 5), new gsu(gyaVar, map, objS, 6, (byte[]) null), new gqd(3));
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
    }
}
