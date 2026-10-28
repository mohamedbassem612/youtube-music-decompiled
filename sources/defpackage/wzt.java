package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzt implements adma {
    protected final Context a;
    protected final View b;
    public final vxe c;
    private final advb d;

    public wzt(Context context, advb advbVar, vxe vxeVar) {
        this.a = context;
        this.b = View.inflate(context, R.layout.live_chat_light_auto_mod_item, null);
        this.d = advbVar;
        this.c = vxeVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        d().removeAllViews();
        e().removeAllViews();
    }

    protected final ViewGroup d() {
        return (ViewGroup) this.b.findViewById(R.id.auto_moderated_item);
    }

    protected final ViewGroup e() {
        return (ViewGroup) this.b.findViewById(R.id.auto_mod_buttons);
    }

    protected final TextView f() {
        return (TextView) this.b.findViewById(R.id.header_text);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        apji apjiVar;
        apji apjiVar2;
        amou amouVar = (amou) obj;
        TextView textViewF = f();
        if ((amouVar.b & 16) != 0) {
            alayVar = amouVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        textViewF.setText(ackj.k(null, alayVar, null, false));
        apji apjiVar3 = amouVar.f;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
        apjiVar3.c(aihlVarCheckIsLite);
        if (apjiVar3.j.n(aihlVarCheckIsLite.d)) {
            vqd vqdVar = new vqd((Object) this, (aihn) amouVar, 4);
            f().setOnClickListener(vqdVar);
            View viewFindViewById = this.b.findViewById(R.id.warning_icon);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(vqdVar);
            }
        }
        int i = amouVar.b & 8;
        if (i != 0) {
            advb advbVar = this.d;
            if (i != 0) {
                apjiVar = amouVar.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
            } else {
                apjiVar = null;
            }
            admh admhVar = ((xas) advbVar).a;
            int iA = admhVar.a(aavv.r(apjiVar));
            adlyVar.f("is-auto-mod-message", Boolean.TRUE);
            adma admaVarC = admhVar.c(iA, d());
            if ((amouVar.b & 8) != 0) {
                apjiVar2 = amouVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
            } else {
                apjiVar2 = null;
            }
            admaVarC.hU(adlyVar, aavv.r(apjiVar2));
            d().addView(admaVarC.a());
        }
        ViewGroup viewGroupE = e();
        viewGroupE.removeAllViews();
        for (apji apjiVar4 : amouVar.g) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
            apjiVar4.c(aihlVarCheckIsLite2);
            Object objK = apjiVar4.j.k(aihlVarCheckIsLite2.d);
            ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if (ajnfVar.c == 1) {
                ((Integer) ajnfVar.d).intValue();
            }
            Button button = (Button) LayoutInflater.from(this.a).inflate(R.layout.live_chat_auto_mod_button_grey_light, (ViewGroup) null, false);
            if (ajnfVar.l) {
                button.setEnabled(false);
            } else {
                button.setEnabled(true);
                if ((ajnfVar.b & SemanticState.Modal) != 0) {
                    button.setOnClickListener(new vqd((Object) this, (aihn) ajnfVar, 3));
                }
            }
            alay alayVar2 = ajnfVar.m;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            button.setText(ackj.k(null, alayVar2, null, false));
            viewGroupE.addView(button);
        }
    }
}
