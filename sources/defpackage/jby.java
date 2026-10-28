package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jby extends admr implements xgm {
    private final admd a;
    private final View b;
    private final TextView c;
    private final aduv d;
    private final ImageView e;
    private final adia f;
    private final adlw g;
    private final vxe h;
    private xgn i;

    public jby(Context context, adhv adhvVar, aduv aduvVar, vxe vxeVar, admd admdVar) {
        this.a = admdVar;
        this.d = aduvVar;
        this.h = vxeVar;
        this.g = new adlw(vxeVar, admdVar, (adlu) null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.compact_link_view, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.title);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        this.e = imageView;
        this.f = new adia(adhvVar, imageView, false);
        admdVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.a).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.f.a();
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        akbg akbgVar = (akbg) obj;
        this.i = adlyVar.b;
        int i = akbgVar.c;
        if (i == 4) {
            this.g.a(this.i, i == 4 ? (ajwo) akbgVar.d : ajwo.a, adlyVar.e(), null);
        }
        TextView textView = this.c;
        if ((akbgVar.b & SemanticState.Modal) != 0) {
            alayVar = akbgVar.g;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        textView.setText(ackj.k(null, alayVar, null, false));
        ImageView imageView = this.e;
        imageView.setVisibility(0);
        int i2 = akbgVar.b;
        if ((i2 & 2) != 0) {
            alja aljaVar = akbgVar.e;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            aduv aduvVar = this.d;
            adia adiaVar = this.f;
            int iA = aduvVar.a(alizVarA);
            adiaVar.a();
            if (iA == 0) {
                imageView.setImageDrawable(null);
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(iA);
            }
        } else if ((i2 & 64) != 0) {
            adia adiaVar2 = this.f;
            aqmh aqmhVar = akbgVar.f;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            adiaVar2.f(aqmhVar, null);
        } else {
            imageView.setVisibility(8);
        }
        this.a.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((akbg) obj).i.G();
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.i;
    }
}
