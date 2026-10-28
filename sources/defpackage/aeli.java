package defpackage;

import android.app.Activity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeli implements vxc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/share/endpoint/InvitePlaylistCollaboratorsCommandResolver");
    public final ttm b;
    public final awmd c;
    private final Activity d;
    private final Executor e;
    private final wsl f;
    private final xgm g;

    public aeli(Activity activity, wsl wslVar, Executor executor, awmd awmdVar, ttm ttmVar, xgm xgmVar) {
        this.d = activity;
        wslVar.getClass();
        this.f = wslVar;
        this.e = executor;
        ttmVar.getClass();
        this.b = ttmVar;
        awmdVar.getClass();
        this.c = awmdVar;
        this.g = xgmVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Optional optionalEmpty;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            this.b.d("command is not supported by this resolver");
            return;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amfp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        amfp amfpVar = (amfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        typ.f(amfpVar.d);
        int i = amfpVar.c;
        if ((i & 2) == 0 || (i & 4) == 0) {
            this.b.e(new vxo());
            return;
        }
        ajwo ajwoVar2 = amfpVar.e;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aotf.b);
        ajwoVar2.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
        Object objC = objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2);
        wsl wslVar = this.f;
        aotf aotfVar = (aotf) objC;
        wsi wsiVarA = wslVar.a();
        wsiVarA.n(ajwoVar.c);
        wsiVarA.a = aotfVar.d;
        wsiVarA.c = aotfVar.h;
        wsiVarA.e(aotfVar.e);
        Executor executor = this.e;
        ListenableFuture listenableFutureB = wslVar.b(wsiVarA, executor);
        Activity activity = this.d;
        ajwo ajwoVar3 = amfpVar.f;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apth.b);
        ajwoVar3.c(aihlVarCheckIsLite4);
        Object objK3 = ajwoVar3.j.k(aihlVarCheckIsLite4.d);
        apth apthVar = (apth) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
        if ((aotfVar.c & 2) != 0) {
            ajwo ajwoVar4 = aotfVar.g;
            if (ajwoVar4 == null) {
                ajwoVar4 = ajwo.a;
            }
            optionalEmpty = Optional.of(ajwoVar4);
        } else {
            optionalEmpty = Optional.empty();
        }
        aelh aelhVar = new aelh(this, activity, apthVar, optionalEmpty, this.g);
        taf.i(listenableFutureB, executor, new aelg(aelhVar, 0), new yqj(aelhVar, 19), null);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
