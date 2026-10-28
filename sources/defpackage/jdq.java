package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdq implements adma {
    private final Context a;
    private final aduv b;
    private final vxe c;
    private final xgn d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final YouTubeButton i;
    private final jbm j;

    public jdq(Context context, vxe vxeVar, xgn xgnVar, aduv aduvVar, jij jijVar) {
        this.a = context;
        this.b = aduvVar;
        this.c = vxeVar;
        this.d = xgnVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_hidden_queue_info, (ViewGroup) null);
        this.e = viewInflate;
        this.g = (TextView) viewInflate.findViewById(R.id.title);
        this.h = (TextView) viewInflate.findViewById(R.id.message);
        this.f = (ImageView) viewInflate.findViewById(R.id.icon);
        YouTubeButton youTubeButton = (YouTubeButton) viewInflate.findViewById(R.id.upgrade_button);
        this.i = youTubeButton;
        jbm jbmVarA = jijVar.a(youTubeButton, null, null, null, false);
        this.j = jbmVarA;
        jbmVarA.e = false;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.j.b(admhVar);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        xgn xgnVar = this.d;
        anpg anpgVar = (anpg) obj;
        adlyVar.a(xgnVar);
        apji apjiVar = anpgVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arau.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        arat aratVar = (arat) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((anpgVar.b & 1) != 0) {
            Context context = this.a;
            aduv aduvVar = this.b;
            alja aljaVar = anpgVar.c;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            aduk adukVar = new aduk(context, aduvVar.a(alizVarA));
            adukVar.b(context.getColor(R.color.quantum_white_100));
            Drawable drawableA = adukVar.a();
            ImageView imageView = this.f;
            imageView.setImageDrawable(drawableA);
            imageView.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        int i = aratVar.b & 32;
        TextView textView = this.g;
        if (i != 0) {
            alay alayVar = aratVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            tuk.u(textView, ackj.k(null, alayVar, null, false));
        } else {
            textView.setVisibility(8);
        }
        int i2 = aratVar.b & 64;
        TextView textView2 = this.h;
        if (i2 != 0) {
            alay alayVar2 = aratVar.f;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            tuk.u(textView2, ackj.k(null, alayVar2, null, false));
        } else {
            textView2.setVisibility(8);
        }
        if ((aratVar.b & SemanticState.Hidden) != 0) {
            jbm jbmVar = this.j;
            ajng ajngVar = aratVar.g;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            ajnf ajnfVar = ajngVar.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
            jbmVar.hU(adlyVar, ajnfVar);
        } else {
            this.i.setVisibility(8);
        }
        if ((aratVar.b & SemanticState.Modal) != 0) {
            xgnVar.l(new xgj(aratVar.i, (amud) null));
        }
        this.c.b(aratVar.j);
    }
}
