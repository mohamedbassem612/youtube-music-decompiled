package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adof {
    public final Context a;
    public final vxe b;
    public final xgn c;
    public final Set d = new HashSet();
    public final awku e = new awku();
    public boolean f;
    public final abfv g;
    public final abfv h;
    private final aedj i;
    private final boolean j;
    private final adul k;

    public adof(Context context, vxe vxeVar, xgn xgnVar, abfv abfvVar, aedj aedjVar, adul adulVar, abfv abfvVar2, vxz vxzVar) {
        this.a = context;
        this.b = vxeVar;
        this.c = xgnVar;
        this.h = abfvVar;
        this.i = aedjVar;
        this.k = adulVar;
        this.g = abfvVar2;
        this.j = vxzVar.l(9, 45381188L, false);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, vxe] */
    public static void c(ajwo ajwoVar, adyc adycVar) {
        alay alayVar;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anix.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anix.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                int iBh = a.bh(((anix) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c);
                if (iBh == 0) {
                    iBh = 1;
                }
                int i = iBh - 1;
                ajnf ajnfVar = null;
                if (i == 1) {
                    ajly ajlyVarN = ((aciz) adycVar.c).n();
                    if (ajlyVarN != null) {
                        Object obj = adycVar.e;
                        if ((ajlyVarN.b & 1) != 0) {
                            alayVar = ajlyVarN.c;
                            if (alayVar == null) {
                                alayVar = alay.a;
                            }
                        } else {
                            alayVar = null;
                        }
                        Spanned spannedA = vxl.a(null, alayVar, adycVar.f, false);
                        adog adogVar = (adog) obj;
                        adogVar.d.setVisibility(0);
                        CompoundButton compoundButton = adogVar.e;
                        compoundButton.setContentDescription(spannedA);
                        compoundButton.setVisibility(0);
                        TextView textView = adogVar.f;
                        textView.setText(spannedA);
                        textView.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    adycVar.a();
                    return;
                }
                if (i == 3) {
                    adycVar.e();
                    return;
                }
                if (i == 4) {
                    apkc apkcVar = (apkc) ((aciz) adycVar.c).a;
                    ajng ajngVar = apkcVar.g;
                    if (ajngVar == null) {
                        ajngVar = ajng.a;
                    }
                    if ((ajngVar.b & 1) != 0) {
                        ajng ajngVar2 = apkcVar.g;
                        if (ajngVar2 == null) {
                            ajngVar2 = ajng.a;
                        }
                        ajnfVar = ajngVar2.c;
                        if (ajnfVar == null) {
                            ajnfVar = ajnf.a;
                        }
                    }
                    adycVar.c(ajnfVar);
                }
            }
        }
    }

    public final void a(aokc aokcVar, Map map) {
        if ((aokcVar.b & 64) != 0) {
            vxe vxeVar = this.b;
            ajwo ajwoVar = aokcVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.c(ajwoVar, map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.widget.ListAdapter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, vxe] */
    public final void b(apkc apkcVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        Context context = this.a;
        if (tym.K(context).isFinishing()) {
            return;
        }
        adyc adycVar = new adyc(context, this.b, new aciz(apkcVar), new ahhp(this, obj), this.i, this.g, this.j);
        fv fvVar = (fv) adycVar.d;
        if (fvVar.isShowing()) {
            return;
        }
        Object obj2 = adycVar.e;
        aciz acizVar = (aciz) adycVar.c;
        apkc apkcVar2 = (apkc) acizVar.a;
        if ((apkcVar2.b & 2) != 0) {
            alayVar = apkcVar2.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        aokf aokfVar = (aokf) acizVar.b;
        if ((aokfVar.b & 1) != 0) {
            alayVar2 = aokfVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        adog adogVar = (adog) obj2;
        adogVar.a.setText((Spanned) ahno.ad(spannedK, ackj.k(null, alayVar2, null, false)));
        ?? r2 = adycVar.a;
        adogVar.b.setAdapter((ListAdapter) r2);
        ?? r5 = adycVar.f;
        if ((apkcVar2.b & 8) != 0) {
            alayVar3 = apkcVar2.e;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        Spanned spannedA = vxl.a(null, alayVar3, r5, false);
        if (spannedA != null) {
            TextView textView = adogVar.c;
            textView.setText(spannedA);
            textView.setVisibility(0);
        }
        adol adolVar = (adol) r2;
        adolVar.setNotifyOnChange(false);
        adolVar.clear();
        adolVar.addAll(aokfVar.c);
        adolVar.setNotifyOnChange(true);
        fvVar.show();
        adycVar.b();
    }
}
