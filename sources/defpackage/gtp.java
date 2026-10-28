package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtp extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/ExecuteEntityCommandResolver");
    public final vxe b;
    public final Context c;
    public final jin d;
    private final wbz e;
    private final zwb f;
    private final avmb g;

    public gtp(Context context, jin jinVar, wbz wbzVar, zwb zwbVar, avmb avmbVar, vxe vxeVar) {
        this.c = context;
        this.d = jinVar;
        this.e = wbzVar;
        this.f = zwbVar;
        this.g = avmbVar;
        this.b = vxeVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akwh.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akwh akwhVar = (akwh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((akwhVar.c & 1) != 0) {
            this.e.e(this.f.e()).g(akwhVar.d).s(this.g).g(ajwk.class).k(new gto(this, map, ajwoVar, 0)).j(new gks(this, 17)).H();
        }
    }
}
