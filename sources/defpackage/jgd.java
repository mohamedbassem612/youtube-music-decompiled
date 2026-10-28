package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgd extends jca {
    public static final agrf c = agrf.h("com/google/android/apps/youtube/music/ui/presenter/OfflineVideoFadeAndDisplayStatePresenter");
    public final hpd d;
    private final cf e;
    private final View f;
    private final TextView g;
    private CharSequence h;

    public jgd(cf cfVar, hpy hpyVar, hpd hpdVar, avmb avmbVar, View view, TextView textView) {
        super(hpyVar, avmbVar);
        this.e = cfVar;
        this.f = view;
        this.g = textView;
        this.d = hpdVar;
    }

    @Override // defpackage.jca
    public final Optional d(Object obj) {
        boolean zN;
        boolean z = obj instanceof anzi;
        if (z) {
            ajwo ajwoVar = ((anzi) obj).i;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite);
            zN = ajwoVar.j.n(aihlVarCheckIsLite.d);
        } else {
            zN = false;
            if (obj != null) {
                throw new IllegalArgumentException(String.format("isOffline does not support %s", obj.getClass().toString()));
            }
        }
        ahno.F(zN);
        String str = null;
        if (z) {
            anzi anziVar = (anzi) obj;
            ajwo ajwoVar2 = anziVar.i;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohu.a);
            ajwoVar2.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
            if ((((aoht) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b & 1) != 0) {
                ajwo ajwoVar3 = anziVar.i;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
                ajwoVar3.c(aihlVarCheckIsLite3);
                Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                str = ((aoht) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).c;
            }
        }
        return Optional.ofNullable(str);
    }

    @Override // defpackage.jca
    public final void e(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        if (optional2.isEmpty()) {
            f();
            return;
        }
        hpd hpdVar = this.d;
        aamp aampVarD = hpdVar.d(optional3, optional4, optional5);
        if (hpdVar.r(optional3, optional4, optional5)) {
            String str = this.b;
            if (str != null) {
                taf.k(this.e, hpdVar.g(str), new jco(3), new iny(this, 12));
                return;
            }
            return;
        }
        htg htgVar = new htg();
        htgVar.d(optional3);
        htgVar.b(optional4);
        htgVar.c(optional5);
        g(aampVarD, hpdVar.n(htgVar.a()));
    }

    @Override // defpackage.jca
    public final void f() {
        this.f.setAlpha(1.0f);
        this.g.setText(this.h);
    }

    public final void g(aamp aampVar, String str) {
        this.f.setAlpha(aampVar == aamp.PLAYABLE ? 1.0f : 0.4f);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        CharSequence charSequence = str;
        if (zIsEmpty) {
            charSequence = this.h;
        }
        this.g.setText(charSequence);
    }

    @Override // defpackage.jca, defpackage.adma
    public final void hU(adly adlyVar, Object obj) {
        this.h = this.g.getText();
        super.hU(adlyVar, obj);
    }
}
