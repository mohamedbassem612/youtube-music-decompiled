package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdr implements adma {
    public final View a;
    private final Context b;
    private final ImageView c;
    private final View d;
    private final aduv e;

    public jdr(Context context, aduv aduvVar) {
        this.b = context;
        this.e = aduvVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_icon_badge, (ViewGroup) null);
        this.a = viewInflate;
        this.c = (ImageView) viewInflate.findViewById(R.id.icon);
        this.d = viewInflate.findViewById(R.id.spinner);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, anpo anpoVar) {
        int iAU;
        aiqe aiqeVar;
        Context context = this.b;
        int iB = adlyVar.b("thumbnailOverlaySize", context.getResources().getDimensionPixelSize(R.dimen.music_icon_size));
        int i = anpoVar.c;
        if (i != 3) {
            if (i == 6 && (iAU = a.aU(((ajds) anpoVar.d).b)) != 0 && iAU == 2) {
                this.a.setLayoutParams(new LinearLayout.LayoutParams(iB, iB));
                View view = this.d;
                view.setLayoutParams(new LinearLayout.LayoutParams(iB, iB));
                this.c.setVisibility(8);
                view.setVisibility(0);
                return;
            }
            return;
        }
        int iB2 = (anpoVar.b & 16) != 0 ? anpoVar.f : adlyVar.b("thumbnailOverlayColor", context.getColor(R.color.quantum_white_100));
        aduv aduvVar = this.e;
        aliz alizVarA = aliz.a((anpoVar.c == 3 ? (alja) anpoVar.d : alja.a).c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        aduk adukVar = new aduk(context, aduvVar.a(alizVarA));
        adukVar.b(iB2);
        adukVar.c(iB, iB);
        Drawable drawableA = adukVar.a();
        this.a.setLayoutParams(new LinearLayout.LayoutParams(iB, iB));
        ImageView imageView = this.c;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iB, iB));
        imageView.setImageDrawable(drawableA);
        if ((anpoVar.b & 4) != 0) {
            aiqeVar = anpoVar.e;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
        } else {
            aiqeVar = null;
        }
        String strU = kro.U(aiqeVar);
        if (strU != null) {
            imageView.setContentDescription(strU);
        } else {
            imageView.setContentDescription(imageView.getContext().getString(R.string.default_icon_badge_label));
        }
        imageView.setVisibility(0);
        this.d.setVisibility(8);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
