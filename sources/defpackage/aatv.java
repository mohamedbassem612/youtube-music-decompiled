package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class aatv {
    public final Context h;
    public final AlertDialog.Builder i;
    public final vxe j;
    public final adhv k;
    public View l;
    public ImageView m;
    public ImageView n;
    public adia o;
    public adia p;
    public TextView q;
    public TextView r;
    public AlertDialog s;
    public TextView t;
    public TextView u;
    public ajnf v;
    public ajnf w;
    protected xgn x;

    protected aatv(Context context, AlertDialog.Builder builder, vxe vxeVar, adhv adhvVar) {
        this.h = context;
        this.i = builder;
        this.j = vxeVar;
        this.k = adhvVar;
    }

    private final void c(ajnf ajnfVar, TextView textView, View.OnClickListener onClickListener) {
        alay alayVar;
        if (ajnfVar == null) {
            tuk.l(textView, false);
            return;
        }
        if ((ajnfVar.b & 64) != 0) {
            alayVar = ajnfVar.m;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        CharSequence charSequenceK = ackj.k(null, alayVar, null, false);
        tuk.u(textView, charSequenceK);
        aiqe aiqeVar = ajnfVar.v;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        if ((aiqeVar.b & 1) != 0) {
            aiqe aiqeVar2 = ajnfVar.v;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            aiqd aiqdVar = aiqeVar2.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            charSequenceK = aiqdVar.c;
        }
        textView.setContentDescription(charSequenceK);
        textView.setOnClickListener(onClickListener);
        xgn xgnVar = this.x;
        if (xgnVar != null) {
            xgnVar.w(new xgj(ajnfVar.y, (amud) null), null);
        }
    }

    public static void e(vxe vxeVar, arat aratVar) {
        if (aratVar.j.size() != 0) {
            for (ajwo ajwoVar : aratVar.j) {
                HashMap map = new HashMap();
                map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aratVar);
                vxeVar.c(ajwoVar, map);
            }
        }
    }

    protected int a() {
        return R.layout.upsell_dialog_with_header_images;
    }

    protected void b(AlertDialog alertDialog) {
        alertDialog.setOnCancelListener(new gxt(this, 13));
    }

    public final void d(ajnf ajnfVar) {
        xgn xgnVar;
        if (ajnfVar != null) {
            if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                ajwo ajwoVarF = ajnfVar.r;
                if (ajwoVarF == null) {
                    ajwoVarF = ajwo.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
                ajwoVarF.c(aihlVarCheckIsLite);
                if (!ajwoVarF.j.n(aihlVarCheckIsLite.d) && (xgnVar = this.x) != null) {
                    ajwoVarF = xgnVar.f(ajwoVarF);
                }
                if (ajwoVarF != null) {
                    this.j.c(ajwoVarF, null);
                }
            }
            if ((ajnfVar.b & SemanticState.Modal) != 0) {
                vxe vxeVar = this.j;
                ajwo ajwoVar = ajnfVar.q;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, xhd.h(ajnfVar, !((ajnfVar.b & SemanticState.Obscured) != 0)));
            }
        }
    }

    public final void f(arat aratVar, View.OnClickListener onClickListener) {
        ajnf ajnfVar;
        ajng ajngVar = aratVar.h;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar2 = null;
        if ((ajngVar.b & 1) != 0) {
            ajng ajngVar2 = aratVar.h;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnfVar = ajngVar2.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        this.w = ajnfVar;
        ajng ajngVar3 = aratVar.g;
        if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
            if (ajngVar3 == null) {
                ajngVar3 = ajng.a;
            }
            ajnfVar2 = ajngVar3.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
        }
        this.v = ajnfVar2;
        if (this.w == null && ajnfVar2 == null) {
            tuk.u(this.u, this.h.getResources().getText(R.string.cancel));
            tuk.l(this.t, false);
        } else {
            c(ajnfVar2, this.t, onClickListener);
            c(this.w, this.u, onClickListener);
        }
    }

    public final void g(arat aratVar, xgn xgnVar) {
        alay alayVar;
        alay alayVar2;
        this.x = xgnVar;
        int i = aratVar.b & 4;
        ImageView imageView = this.m;
        if (i != 0) {
            imageView.setVisibility(0);
            adia adiaVar = this.o;
            aqmh aqmhVar = aratVar.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adiaVar.f(aqmhVar, null);
        } else {
            imageView.setVisibility(8);
            this.o.a();
        }
        if ((aratVar.b & 1) != 0) {
            aqmh aqmhVar2 = aratVar.c;
            if (aqmhVar2 == null) {
                aqmhVar2 = aqmh.a;
            }
            aqmg aqmgVarM = aawb.M(aqmhVar2);
            if (aqmgVarM != null) {
                float f = aqmgVarM.d;
                float f2 = aqmgVarM.e;
                ImageView imageView2 = this.n;
                tym.h(imageView2, new tyl((int) ((f / f2) * imageView2.getLayoutParams().height), 0), ViewGroup.LayoutParams.class);
            }
            this.n.setVisibility(0);
            adia adiaVar2 = this.p;
            aqmh aqmhVar3 = aratVar.c;
            if (aqmhVar3 == null) {
                aqmhVar3 = aqmh.a;
            }
            adiaVar2.f(aqmhVar3, null);
        } else {
            this.n.setVisibility(8);
            this.p.a();
        }
        TextView textView = this.q;
        if ((aratVar.b & 32) != 0) {
            alayVar = aratVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        TextView textView2 = this.r;
        if ((aratVar.b & 64) != 0) {
            alayVar2 = aratVar.f;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView2, ackj.k(null, alayVar2, null, false));
    }
}
