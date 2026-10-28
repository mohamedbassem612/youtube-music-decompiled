package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfm implements adma, xgm, adlu {
    private anye a;
    private ajwo b;
    private adly c;
    private final View d;
    private final YouTubeTextView e;
    private final aduv f;
    private final vxe g;
    private final adlw h;

    public jfm(Context context, aduv aduvVar, ahud ahudVar, vxe vxeVar) {
        vxeVar.getClass();
        this.g = new hdv(vxeVar, this);
        this.f = aduvVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_thumbnail_button, (ViewGroup) null);
        this.d = viewInflate;
        this.e = (YouTubeTextView) viewInflate.findViewById(R.id.thumbnail_button_text);
        this.h = ahudVar.ac(viewInflate, this);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.c = null;
        this.b = null;
        this.a = null;
        this.h.b();
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        adly adlyVar = this.c;
        return adlyVar != null ? adlyVar.b : xgn.l;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        alay alayVar;
        anye anyeVar = (anye) obj;
        this.c = adlyVar;
        this.a = anyeVar;
        if ((anyeVar.b & 4) != 0) {
            ajwoVar = anyeVar.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.b = ajwoVar;
        View view = this.d;
        view.setOnClickListener(this.h);
        if ((anyeVar.b & 1) != 0) {
            alayVar = anyeVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        YouTubeTextView youTubeTextView = this.e;
        tuk.u(youTubeTextView, spannedK);
        youTubeTextView.setTypeface(ackm.ROBOTO_MEDIUM.c(youTubeTextView.getContext(), 0));
        youTubeTextView.setCompoundDrawablePadding(youTubeTextView.getResources().getDimensionPixelSize(R.dimen.button_icon_padding_medium));
        anye anyeVar2 = this.a;
        anyeVar2.getClass();
        if ((anyeVar2.b & 2) != 0) {
            Context context = view.getContext();
            aduv aduvVar = this.f;
            alja aljaVar = anyeVar2.d;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            youTubeTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, dl.d(context, aduvVar.a(alizVarA)), (Drawable) null, (Drawable) null);
            Context context2 = view.getContext();
            for (Drawable drawable : youTubeTextView.getCompoundDrawables()) {
                if (drawable != null) {
                    jkl.c(drawable, context2.getColor(R.color.ytm_color_grey_06));
                }
            }
            view.setVisibility(0);
        } else {
            youTubeTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        }
        youTubeTextView.setTextAlignment(4);
        youTubeTextView.setGravity(17);
        Drawable background = view.getBackground();
        Interpolator interpolator = aedd.a;
        view.setOnTouchListener(new aedc());
        aedd.c(view, tzk.i(view.getContext(), android.R.attr.colorControlHighlight), view.getContext().getResources().getDimensionPixelSize(R.dimen.generated_thumbnail_corner_radius), background);
        if ((anyeVar.b & 32) != 0 && hB() != null) {
            hB().w(new xgj(this.a.g, (amud) null), null);
        }
        if ((anyeVar.b & 8) != 0) {
            aiqe aiqeVar = anyeVar.f;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            kro.aa(view, aiqeVar);
        }
    }

    @Override // defpackage.adlu
    public final boolean hV(View view) {
        ajwo ajwoVar = this.b;
        if (ajwoVar == null) {
            return false;
        }
        yno.eB(this.g, ajwoVar);
        return true;
    }
}
