package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hvl extends gut {
    public final gez a;
    public final hvo b;
    public final hkl c;
    public final hkk d;
    private final Executor e;
    private final jnj f;

    public hvl(gez gezVar, hvo hvoVar, hkl hklVar, jnj jnjVar, Executor executor, hkk hkkVar) {
        this.a = gezVar;
        this.b = hvoVar;
        this.c = hklVar;
        this.f = jnjVar;
        this.e = executor;
        this.d = hkkVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        if (!this.f.h() || this.b.g()) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(antb.a);
            ajwoVar.c(aihlVarCheckIsLite);
            ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(antb.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            anta antaVar = (anta) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            ListenableFuture listenableFutureH = this.b.h();
            if ((antaVar.b & 1) == 0 || !antaVar.c) {
                return;
            }
            listenableFutureH.addListener(new gwb((Object) this, (Object) antaVar, (Object) map, 8, (byte[]) null), this.e);
        }
    }
}
