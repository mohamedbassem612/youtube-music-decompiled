package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swg extends admr {
    final ImageView a;
    final TextView b;
    final TextView c;
    final int d;
    final int e;
    final int f;
    private final adhv g;
    private final vxe h;
    private final admd i;
    private final adsz j;

    public swg(Context context, adhv adhvVar, vxe vxeVar, swd swdVar, lqa lqaVar) {
        this.g = adhvVar;
        this.h = vxeVar;
        this.i = swdVar;
        int iOrElse = tzk.n(context, R.attr.ytTextPrimary).orElse(0);
        this.d = iOrElse;
        int iOrElse2 = tzk.n(context, R.attr.ytTextSecondary).orElse(0);
        this.e = iOrElse2;
        int iOrElse3 = tzk.n(context, R.attr.ytStaticBlue).orElse(0);
        this.f = iOrElse3;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_key_promo_small_feature_item, (ViewGroup) null);
        this.a = (ImageView) viewInflate.findViewById(R.id.icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.header);
        this.b = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
        this.c = textView2;
        adsy adsyVar = (adsy) lqaVar.a;
        adsyVar.a = textView;
        adsyVar.f(iOrElse);
        adsyVar.b = textView2;
        adsyVar.e(iOrElse2);
        adsyVar.d(iOrElse3);
        this.j = adsyVar.a();
        swdVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((swd) this.i).a;
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        alay alayVar;
        antk antkVar = (antk) obj;
        int i = 1 != (antkVar.b & 1) ? 8 : 0;
        ImageView imageView = this.a;
        imageView.setVisibility(i);
        aqmh aqmhVar = antkVar.c;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        this.g.h(imageView, aqmhVar);
        TextView textView = this.b;
        alay alayVar2 = antkVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        ajkx ajkxVar = null;
        tuk.u(textView, ackj.k(null, alayVar2, null, false));
        TextView textView2 = this.c;
        if ((antkVar.b & 4) != 0) {
            alayVar = antkVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        tuk.u(textView2, vxl.a(null, alayVar, this.h, false));
        adsz adszVar = this.j;
        if ((antkVar.b & 8) != 0) {
            antj antjVar = antkVar.f;
            if (antjVar == null) {
                antjVar = antj.a;
            }
            ajkxVar = antjVar.b == 118483990 ? (ajkx) antjVar.c : ajkx.a;
        }
        adszVar.a(ajkxVar);
        this.i.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((antk) obj).g.G();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
