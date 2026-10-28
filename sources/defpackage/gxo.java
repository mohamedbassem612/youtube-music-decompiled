package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxo extends gut {
    private final vxe a;
    private final aaug b;
    private final aeba c;

    public gxo(vxe vxeVar, aaug aaugVar, aeba aebaVar) {
        this.a = vxeVar;
        this.b = aaugVar;
        this.c = aebaVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apyg.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apyg.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apyg apygVar = (apyg) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            int i = apygVar.d;
            if (i == 1) {
                this.a.a((ajwo) apygVar.e);
                return;
            }
            Optional optionalH = kro.H(i == 2 ? (apji) apygVar.e : apji.a, arau.a);
            if (optionalH.isPresent()) {
                aeba aebaVar = this.c;
                if (aebaVar.c(((arat) optionalH.get()).m)) {
                    this.b.b(optionalH.get(), (xgn) tym.U(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.class), null);
                    aebaVar.a(((arat) optionalH.get()).m);
                    return;
                }
            }
            Optional optionalH2 = kro.H(apygVar.d == 2 ? (apji) apygVar.e : apji.a, ajwt.a);
            if (optionalH2.isPresent()) {
                aeba aebaVar2 = this.c;
                if (aebaVar2.c(((ajws) optionalH2.get()).f)) {
                    if ((((ajws) optionalH2.get()).b & 2) != 0) {
                        vxe vxeVar = this.a;
                        ajwo ajwoVar2 = ((ajws) optionalH2.get()).d;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        vxeVar.a(ajwoVar2);
                    }
                    if ((((ajws) optionalH2.get()).b & 1) != 0) {
                        vxe vxeVar2 = this.a;
                        ajwo ajwoVar3 = ((ajws) optionalH2.get()).c;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        vxeVar2.a(ajwoVar3);
                    }
                    aebaVar2.a(((ajws) optionalH2.get()).f);
                    return;
                }
            }
            if ((apygVar.c & 1) != 0) {
                vxe vxeVar3 = this.a;
                ajwo ajwoVar4 = apygVar.f;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                vxeVar3.a(ajwoVar4);
            }
        }
    }
}
