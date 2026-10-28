package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.youtube.music.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class guu extends vwu {
    private static final agrf e = agrf.h("com/google/android/apps/youtube/music/command/MusicCommandRouter");
    private final Context f;
    private final zxj g;
    private final vwx h;
    private final jin i;

    public guu(Context context, zxj zxjVar, jin jinVar, Executor executor, vwx vwxVar) {
        super((Activity) context, vwxVar, executor);
        this.f = context;
        this.g = zxjVar;
        this.i = jinVar;
        this.h = vwxVar;
    }

    @Override // defpackage.vwu, defpackage.vxe
    public final void c(ajwo ajwoVar, Map map) {
        if (ajwoVar != null) {
            try {
                this.h.f(ajwoVar);
                super.c(ajwoVar, map);
                aiie<amuo> aiieVar = ajwoVar.d;
                if (aiieVar == null || aiieVar.isEmpty()) {
                    return;
                }
                for (amuo amuoVar : aiieVar) {
                    if (amuoVar != null && (amuoVar.b & 1) != 0) {
                        zxj zxjVar = this.g;
                        zxi zxiVar = new zxi(1, "musicactivityendpointlogging");
                        zxiVar.b(Uri.parse(amuoVar.c));
                        zxiVar.d = false;
                        zxjVar.b(null, zxiVar, zzl.c);
                    }
                }
            } catch (vxo e2) {
                ((agrc) ((agrc) ((agrc) e.b()).j(e2)).k("com/google/android/apps/youtube/music/command/MusicCommandRouter", "logUnknownCommandException", 'c', "MusicCommandRouter.java")).w("%s", "Unknown command not resolved; Base64 representation:\n".concat(String.valueOf(Base64.encodeToString(ajwoVar.toByteArray(), 2))));
                String message = e2.getMessage();
                if (message == null) {
                    message = "Unknown exception";
                }
                zvp.b(zvn.b, zvm.n, message, e2);
                jin jinVar = this.i;
                Context context = this.f;
                jio jioVarE = jin.e();
                ((jik) jioVarE).k(context.getText(R.string.navigation_unavailable));
                jinVar.d(jioVarE.b());
            }
        }
    }
}
