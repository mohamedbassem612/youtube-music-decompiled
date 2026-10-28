package defpackage;

import android.view.View;
import android.widget.TextView;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jjl extends jbm {
    final /* synthetic */ jjm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjl(jjm jjmVar, TextView textView, aduv aduvVar, vxe vxeVar, abxv abxvVar) {
        super(aduvVar, vxeVar, Optional.of(abxvVar), textView, null, null, null, false);
        this.g = jjmVar;
    }

    @Override // defpackage.jbm, defpackage.adlu
    public final boolean hV(View view) {
        if (this.c == null) {
            return super.hV(view);
        }
        jjm jjmVar = this.g;
        aqjx aqjxVarK = jjmVar.k();
        if (aqjxVarK != null) {
            ajng ajngVar = aqjxVarK.e;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            ajnf ajnfVar = ajngVar.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
            ajwo ajwoVar = ajnfVar.r;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                ajng ajngVar2 = aqjxVarK.e;
                if (ajngVar2 == null) {
                    ajngVar2 = ajng.a;
                }
                ajnf ajnfVar2 = ajngVar2.c;
                if (ajnfVar2 == null) {
                    ajnfVar2 = ajnf.a;
                }
                ajwo ajwoVar2 = ajnfVar2.r;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                if (ajwoVar2 != null && jjmVar.x != null) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                    ajwoVar2.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                    aihf builder = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
                    jjp jjpVar = jjmVar.x;
                    ahgb ahgbVar = jjpVar.f;
                    List list = jjpVar.a;
                    aihf aihfVarCreateBuilder = ajmi.a.createBuilder();
                    Iterator it = ahgbVar.Q(list).iterator();
                    while (it.hasNext()) {
                        String str = ((jjv) it.next()).a.g;
                        aihfVarCreateBuilder.copyOnWrite();
                        ajmi ajmiVar = (ajmi) aihfVarCreateBuilder.instance;
                        str.getClass();
                        ajmiVar.a();
                        ajmiVar.e.add(str);
                    }
                    Iterator it2 = ahgbVar.R().iterator();
                    while (it2.hasNext()) {
                        String str2 = ((jjv) it2.next()).a.f;
                        aihfVarCreateBuilder.copyOnWrite();
                        ajmi ajmiVar2 = (ajmi) aihfVarCreateBuilder.instance;
                        str2.getClass();
                        ajmiVar2.b();
                        ajmiVar2.d.add(str2);
                    }
                    ajmi ajmiVar3 = (ajmi) aihfVarCreateBuilder.build();
                    builder.copyOnWrite();
                    ajmf ajmfVar = (ajmf) builder.instance;
                    ajmiVar3.getClass();
                    ajmfVar.h = ajmiVar3;
                    ajmfVar.b |= 64;
                    ajmf ajmfVar2 = (ajmf) builder.build();
                    aihh aihhVar = (aihh) ajwoVar2.toBuilder();
                    aihhVar.e(ajmj.a, ajmfVar2);
                    ajwo ajwoVar3 = (ajwo) aihhVar.build();
                    adly adlyVar = this.d;
                    if (adlyVar != null) {
                        ajwo ajwoVarF = adlyVar.b.f(ajwoVar3);
                        if (ajwoVarF != null) {
                            jjmVar.r.c(ajwoVarF, this.d.e());
                        }
                    } else {
                        jjmVar.r.c(ajwoVar3, null);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
