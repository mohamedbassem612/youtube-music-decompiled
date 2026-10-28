package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sxb extends admr {
    public aqti a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final aeaa e;
    private final aeaa f;
    private final vxe g;
    private final Context h;

    public sxb(Context context, ViewGroup viewGroup, vxe vxeVar, afip afipVar, aciz acizVar) {
        this.h = context;
        this.g = vxeVar;
        View viewInflate = LayoutInflater.from(context).inflate(true != acizVar.C() ? R.layout.unlimited_user_notification : R.layout.unlimited_user_notification_modern_type, viewGroup, false);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.title);
        this.d = (TextView) viewInflate.findViewById(R.id.message);
        aeaa aeaaVarD = afipVar.d((TextView) viewInflate.findViewById(R.id.dismiss_button));
        this.e = aeaaVarD;
        aeaaVarD.c = new sug(this, 5);
        aeaa aeaaVarD2 = afipVar.d((TextView) viewInflate.findViewById(R.id.update_button));
        this.f = aeaaVarD2;
        aeaaVarD2.c = new sug(this, 6);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.a = null;
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        ajnf ajnfVar;
        ajnf ajnfVar2;
        aqti aqtiVar = (aqti) obj;
        this.a = aqtiVar;
        int i = aqtiVar.c;
        if (i == 5) {
            this.b.setBackgroundColor(Color.parseColor((String) aqtiVar.d));
        } else if (i == 8) {
            View view = this.b;
            Context context = this.h;
            aqlc aqlcVarA = aqlc.a(((Integer) aqtiVar.d).intValue());
            if (aqlcVarA == null) {
                aqlcVarA = aqlc.THEME_ATTRIBUTE_UNKNOWN;
            }
            view.setBackgroundColor(aedn.b(context, aqlcVarA));
        }
        TextView textView = this.c;
        if ((aqtiVar.b & 1) != 0) {
            alayVar = aqtiVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        String property = System.getProperty("line.separator");
        alay[] alayVarArr = (alay[]) aqtiVar.f.toArray(new alay[0]);
        Spanned[] spannedArr = new Spanned[alayVarArr.length];
        for (int i2 = 0; i2 < alayVarArr.length; i2++) {
            spannedArr[i2] = ackj.k(null, alayVarArr[i2], null, false);
        }
        CharSequence charSequenceG = ackj.g(property, spannedArr);
        TextView textView2 = this.d;
        tuk.u(textView2, charSequenceG);
        if ((aqtiVar.b & 8) != 0) {
            Context context2 = this.h;
            aqlc aqlcVarA2 = aqlc.a(aqtiVar.i);
            if (aqlcVarA2 == null) {
                aqlcVarA2 = aqlc.THEME_ATTRIBUTE_UNKNOWN;
            }
            int iB = aedn.b(context2, aqlcVarA2);
            textView.setTextColor(iB);
            textView2.setTextColor(iB);
        }
        if ((aqtiVar.b & 1) == 0 && aqtiVar.f.size() > 0) {
            tym.h(textView2, new tyk(0, 0, 0, 0), ViewGroup.MarginLayoutParams.class);
        }
        if ((aqtiVar.b & 4) != 0) {
            ajng ajngVar = aqtiVar.h;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            ajnfVar = ajngVar.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        this.e.a(ajnfVar, null, null);
        if ((aqtiVar.b & 2) != 0) {
            ajng ajngVar2 = aqtiVar.g;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnfVar2 = ajngVar2.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
        } else {
            ajnfVar2 = null;
        }
        this.f.a(ajnfVar2, null, null);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqti) obj).j.G();
    }

    public final void g(ajnf ajnfVar) {
        if (ajnfVar != null) {
            int i = ajnfVar.b;
            if ((i & SemanticState.Obscured) != 0) {
                vxe vxeVar = this.g;
                ajwo ajwoVar = ajnfVar.r;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, null);
                return;
            }
            if ((i & SemanticState.Modal) != 0) {
                vxe vxeVar2 = this.g;
                ajwo ajwoVar2 = ajnfVar.q;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar2.c(ajwoVar2, xhd.h(this.a, true));
            }
        }
    }
}
