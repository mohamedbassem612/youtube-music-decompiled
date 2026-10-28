package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gso extends gut {
    private final aczl a;

    public gso(aczl aczlVar) {
        this.a = aczlVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean z;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aiwu.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            z = true;
        } else {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aiwy.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                z = true;
            } else {
                z = false;
            }
        }
        ahno.F(z);
        xgn xgnVar = (xgn) tym.U(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.class);
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aiwu.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aiwy.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            if (ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aiwy.b);
                ajwoVar.c(aihlVarCheckIsLite5);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                aiwy aiwyVar = (aiwy) (objK == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK));
                if ((aiwyVar.c & 1) == 0) {
                    if (aiwyVar.e.size() <= 0) {
                        throw new IllegalArgumentException("AddToPlaylistServiceEndpoint had no video ids. Could not resolve command.");
                    }
                    this.a.v(aiwyVar.e, ajwoVar.c, xgnVar, null);
                    return;
                } else {
                    this.a.v(agke.q(aiwyVar.d), ajwoVar.c, xgnVar, null);
                    return;
                }
            }
            return;
        }
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aiwu.b);
        ajwoVar.c(aihlVarCheckIsLite6);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
        aiwu aiwuVar = (aiwu) (objK2 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK2));
        if ((aiwuVar.c & 1) != 0) {
            this.a.v(agke.q(aiwuVar.d), ajwoVar.c, xgnVar, aiwuVar.g);
            return;
        }
        if (aiwuVar.f.size() > 0) {
            this.a.v(aiwuVar.f, ajwoVar.c, xgnVar, aiwuVar.g);
            return;
        }
        if ((aiwuVar.c & 4) == 0) {
            throw new IllegalArgumentException("AddToPlaylistEndpoint had no video ids or playlist ids. Could not resolve command.");
        }
        aczl aczlVar = this.a;
        String str = aiwuVar.e;
        aigj aigjVar = ajwoVar.c;
        aigj aigjVar2 = aiwuVar.g;
        if (!((tfq) aczlVar.f).i()) {
            Object obj = aczlVar.d;
            jio jioVarE = jin.e();
            ((jik) jioVarE).k(((cf) aczlVar.c).getString(R.string.common_no_network));
            ((jin) obj).d(jioVarE.b());
            return;
        }
        wsc wscVarH = ((wsg) aczlVar.g).h();
        wscVarH.b = str;
        wscVarH.e();
        if (aigjVar != null) {
            wscVarH.n(aigjVar);
        } else {
            wscVarH.m();
        }
        if (aigjVar2 != null) {
            wscVarH.c = aigjVar2;
        }
        aczlVar.w(wscVarH, xgnVar);
    }
}
