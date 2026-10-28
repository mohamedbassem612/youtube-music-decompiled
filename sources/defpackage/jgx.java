package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgx implements adma, xgm, adlu, adlv {
    public final adlw a;
    public adly b;
    private final ImageView c;
    private final aduv d;
    private final vxe e;
    private ajwo f;
    private ajwo g;
    private final Drawable h;
    private final ci i;

    public jgx(Context context, aduv aduvVar, vxe vxeVar, ci ciVar) {
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.top_menu_button_item, (ViewGroup) null);
        this.c = imageView;
        this.e = vxeVar;
        this.d = aduvVar;
        this.a = new adlw(vxeVar, imageView, this);
        this.i = ciVar;
        this.h = imageView.getBackground();
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.a.b();
        this.b = null;
        this.g = null;
        this.f = null;
        this.c.setBackground(this.h);
    }

    @Override // defpackage.adlv
    public final void f(Map map) {
        Object objC;
        adly adlyVar = this.b;
        if (adlyVar == null || (objC = adlyVar.c("com.google.android.libraries.youtube.innertube.endpoint.tag")) == null) {
            return;
        }
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", objC);
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        adly adlyVar = this.b;
        return adlyVar != null ? adlyVar.b : xgn.l;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        ajwo ajwoVar2;
        int iAr;
        int iAr2;
        Drawable drawableD;
        ajnf ajnfVar = (ajnf) obj;
        if ((ajnfVar.b & SemanticState.Modal) != 0) {
            ajwoVar = ajnfVar.q;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.f = ajwoVar;
        if ((ajnfVar.b & SemanticState.Multiline) != 0) {
            ajwoVar2 = ajnfVar.s;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
        } else {
            ajwoVar2 = null;
        }
        this.g = ajwoVar2;
        this.b = adlyVar;
        if (!ajnfVar.y.E()) {
            adlyVar.b.w(new xgj(ajnfVar.y, (amud) null), null);
        }
        if ((ajnfVar.b & SemanticState.Obscured) != 0) {
            adlw adlwVar = this.a;
            xgn xgnVarHB = hB();
            ajwo ajwoVar3 = ajnfVar.r;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            adlwVar.a(xgnVarHB, ajwoVar3, adlyVar.e(), this);
        }
        ImageView imageView = this.c;
        imageView.setOnClickListener(new ivp(this, 20));
        int i = ajnfVar.b;
        if ((262144 & i) != 0) {
            aiqe aiqeVar = ajnfVar.v;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            kro.aa(imageView, aiqeVar);
        } else if ((i & 131072) != 0) {
            aiqd aiqdVar = ajnfVar.u;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            imageView.setContentDescription(aiqdVar.c);
        } else {
            aduv aduvVar = this.d;
            if (aduvVar instanceof izf) {
                izf izfVar = (izf) aduvVar;
                aliz alizVarA = aliz.a((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                int iB = izfVar.b(alizVarA);
                if (iB != 0) {
                    imageView.setContentDescription(imageView.getResources().getString(iB));
                }
            }
        }
        if (ajnfVar.c != 1 || (iAr = ahng.ar(((Integer) ajnfVar.d).intValue())) == 0) {
            iAr = 1;
        }
        if (iAr - 1 == 38 && (drawableD = dl.d(new ContextThemeWrapper(imageView.getContext(), R.style.WidgetTheme_WhiteTranslucentNoOutlineButton), R.drawable.circle_button_shape)) != null) {
            tym.Z(imageView, drawableD);
        }
        int i2 = ajnfVar.e;
        if (i2 == 8) {
            aduv aduvVar2 = this.d;
            aliz alizVarA2 = aliz.a((i2 == 8 ? (alja) ajnfVar.f : alja.a).c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            imageView.setImageResource(aduvVar2.a(alizVarA2));
        }
        Context context = imageView.getContext();
        int i3 = ajnfVar.c;
        int i4 = R.color.ytm_color_icon_active;
        if (i3 == 1 && (iAr2 = ahng.ar(((Integer) ajnfVar.d).intValue())) != 0 && iAr2 == 25) {
            i4 = R.color.ytm_color_grey_09;
        }
        imageView.setColorFilter(context.getColor(i4), PorterDuff.Mode.SRC_IN);
        if (imageView.getVisibility() == 0) {
            ci ciVar = this.i;
            ciVar.af(ciVar, imageView);
        }
    }

    @Override // defpackage.adlu
    public final boolean hV(View view) {
        Object objC;
        ajwo ajwoVar = this.g;
        if (ajwoVar == null && (ajwoVar = this.f) == null) {
            ajwoVar = null;
        }
        if (ajwoVar == null) {
            return false;
        }
        HashMap map = new HashMap();
        map.put(xhd.c, Boolean.TRUE);
        adly adlyVar = this.b;
        if (adlyVar != null && (objC = adlyVar.c("com.google.android.libraries.youtube.innertube.endpoint.tag")) != null) {
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", objC);
        }
        this.e.c(ajwoVar, map);
        return true;
    }
}
