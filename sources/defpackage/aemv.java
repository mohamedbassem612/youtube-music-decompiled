package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemv implements adma {
    public ajwo a;
    public ajwo b;
    public ajwo c;
    public alay d;
    private final vxe e;
    private final aduv f;
    private final View g;
    private final adia h;
    private final TextView i;
    private final TextView j;
    private final ImageView k;

    public aemv(Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, aemu aemuVar) {
        this.e = vxeVar;
        this.f = aduvVar;
        View viewInflate = View.inflate(context, R.layout.share_panel_promo, null);
        this.g = viewInflate;
        this.h = new adia(adhvVar, (ImageView) viewInflate.findViewById(R.id.promo_image), true);
        this.i = (TextView) viewInflate.findViewById(R.id.promo_text);
        TextView textView = (TextView) viewInflate.findViewById(R.id.add_contacts_button);
        this.j = textView;
        textView.setOnClickListener(new aems(this, vxeVar, 0));
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.close_button);
        this.k = imageView;
        imageView.setOnClickListener(new aena(this, vxeVar, aemuVar, 1));
        aenh.m(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.g;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        ajwo ajwoVar;
        ajwo ajwoVar2;
        aqsl aqslVar = (aqsl) obj;
        boolean zIsEmpty = aqslVar.c.isEmpty();
        View view = this.g;
        int iA = 0;
        if (zIsEmpty) {
            view.setBackgroundColor(0);
        } else {
            view.setBackgroundColor(Color.parseColor(aqslVar.c));
        }
        adia adiaVar = this.h;
        aqmh aqmhVar = aqslVar.h;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        adiaVar.f(aqmhVar, null);
        TextView textView = this.i;
        if ((aqslVar.b & 64) != 0) {
            alayVar = aqslVar.i;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        textView.setText(ackj.k(null, alayVar, null, false));
        ajng ajngVar = aqslVar.j;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar = ajngVar.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        TextView textView2 = this.j;
        if ((ajnfVar.b & 64) != 0) {
            alayVar2 = ajnfVar.m;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        tuk.u(textView2, vxl.a(null, alayVar2, this.e, false));
        if ((ajnfVar.b & SemanticState.Modal) != 0) {
            ajwoVar = ajnfVar.q;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.a = ajwoVar;
        if ((ajnfVar.b & SemanticState.Obscured) != 0) {
            ajwoVar2 = ajnfVar.r;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
        } else {
            ajwoVar2 = null;
        }
        this.b = ajwoVar2;
        if ((aqslVar.b & 2) != 0) {
            aduv aduvVar = this.f;
            alja aljaVar = aqslVar.d;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            iA = aduvVar.a(alizVarA);
        }
        ImageView imageView = this.k;
        if (iA != 0) {
            imageView.setImageResource(iA);
        } else {
            imageView.setImageDrawable(null);
        }
        ajwo ajwoVar3 = aqslVar.e;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        this.c = ajwoVar3;
        alay alayVar3 = aqslVar.f;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        this.d = alayVar3;
    }
}
