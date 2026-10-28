package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtm extends gut {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/DeletePlaylistCommandResolver");
    public final Context b;
    public final ttm c;
    public final tbt d;
    public final xgm e;
    public final jin f;
    public final hef g;
    private final wsg h;
    private final vxe i;
    private final acwq k;
    private final vxz l;

    public gtm(Context context, wsg wsgVar, ttm ttmVar, tbt tbtVar, jin jinVar, acwq acwqVar, vxz vxzVar, hef hefVar, vxe vxeVar, xgm xgmVar) {
        context.getClass();
        this.b = context;
        wsgVar.getClass();
        this.h = wsgVar;
        ttmVar.getClass();
        this.c = ttmVar;
        tbtVar.getClass();
        this.d = tbtVar;
        this.f = jinVar;
        this.k = acwqVar;
        this.l = vxzVar;
        this.g = hefVar;
        this.i = vxeVar;
        this.e = xgmVar;
    }

    public static boolean e(akkw akkwVar) {
        int iBd;
        return ((akkwVar.c & 2) == 0 || (iBd = a.bd(akkwVar.e)) == 0 || iBd != 5) ? false : true;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akkw.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akkw akkwVar = (akkw) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        typ.f(akkwVar.d);
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        boolean zBooleanValue = ((Boolean) tym.T(map, "show_confirm_dialog", Boolean.TRUE)).booleanValue();
        if (e(akkwVar)) {
            agrx agrxVar = agso.a;
        } else if (zBooleanValue) {
            gtk gtkVar = new gtk(this, ajwoVar, objS);
            Context context = this.b;
            acwf acwfVarT = acww.t();
            acwfVarT.a = context.getString(R.string.delete_playlist_confirm_msg);
            ajnf ajnfVar = ajnf.a;
            aihh aihhVar = (aihh) ajnfVar.createBuilder();
            alay alayVarD = ackj.d(context.getString(R.string.delete_playlist_confirm_button));
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            alayVarD.getClass();
            ajnfVar2.m = alayVarD;
            ajnfVar2.b |= 64;
            aihhVar.copyOnWrite();
            ajnf ajnfVar3 = (ajnf) aihhVar.instance;
            ajnfVar3.d = 42;
            ajnfVar3.c = 1;
            acwfVarT.c = (ajnf) aihhVar.build();
            aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
            alay alayVarD2 = ackj.d(context.getString(android.R.string.cancel));
            aihhVar2.copyOnWrite();
            ajnf ajnfVar4 = (ajnf) aihhVar2.instance;
            alayVarD2.getClass();
            ajnfVar4.m = alayVarD2;
            ajnfVar4.b |= 64;
            aihhVar2.copyOnWrite();
            ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
            ajnfVar5.d = 39;
            ajnfVar5.c = 1;
            acwfVarT.d = (ajnf) aihhVar2.build();
            acwfVarT.f = gtkVar;
            if (this.l.l(ModuleDescriptor.MODULE_VERSION, 45749502L, false) && akkwVar.d.startsWith("RDTS")) {
                acwfVarT.b = ackj.d(context.getString(R.string.delete_playlist_confirm_msg_for_tastematch_playlist));
            }
            this.k.f(acwfVarT.a());
            this.e.hB().l(new xgj(xhb.b(267122)));
            return;
        }
        d(ajwoVar, objS, true);
    }

    public final void d(ajwo ajwoVar, Object obj, boolean z) {
        ajwo ajwoVar2;
        wsg wsgVar = this.h;
        wsb wsbVar = new wsb(wsgVar.b, wsgVar.c.e());
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akkw.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akkw akkwVar = (akkw) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        wsbVar.a = wsb.j(akkwVar.d);
        wsbVar.n(ajwoVar.c);
        if ((akkwVar.c & 4) != 0) {
            ajwoVar2 = akkwVar.f;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
        } else {
            ajwoVar2 = null;
        }
        if (ajwoVar2 != null && e(akkwVar)) {
            agrx agrxVar = agso.a;
            this.i.a(ajwoVar2);
        }
        wsgVar.e.d(wsbVar, new gtl(this, obj, akkwVar, z));
    }
}
