package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfg implements adma {
    public static final agkj a = agkj.l(anxv.MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_CONSTRUCTIVE, Integer.valueOf(R.color.yt_light_green), anxv.MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_DESTRUCTIVE, Integer.valueOf(R.color.yt_light_red), anxv.MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_UNDO, Integer.valueOf(R.color.yt_grey4));
    public final Context b;
    public final FrameLayout c;
    public final LottieAnimationView d;
    private final vxe e;
    private final ico f;
    private final hcb g;
    private final vxz h;

    public jfg(Context context, vxe vxeVar, hcb hcbVar, ico icoVar, vxz vxzVar) {
        this.b = context;
        this.e = vxeVar;
        this.g = hcbVar;
        this.f = icoVar;
        this.h = vxzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.d = lottieAnimationView;
        frameLayout.addView(lottieAnimationView, new FrameLayout.LayoutParams(-1, -1, 17));
        frameLayout.setVisibility(0);
        lottieAnimationView.setVisibility(0);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.c;
    }

    public final void d(anxy anxyVar, Object obj) {
        ajwo ajwoVar;
        if (g(anxyVar)) {
            anxw anxwVar = anxyVar.d;
            if (anxwVar == null) {
                anxwVar = anxw.a;
            }
            ajwoVar = anxwVar.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            anxw anxwVar2 = anxyVar.c;
            if (anxwVar2 == null) {
                anxwVar2 = anxw.a;
            }
            ajwoVar = anxwVar2.e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        }
        if (obj instanceof anzi) {
            int i = hdv.a;
            this.e.c(ajwoVar, xhd.h(obj, true));
        } else if (obj instanceof hyz) {
            this.f.e((hyz) obj);
        }
    }

    public final boolean e(anxy anxyVar) {
        anxw anxwVar;
        if (g(anxyVar)) {
            anxwVar = anxyVar.d;
            if (anxwVar == null) {
                anxwVar = anxw.a;
            }
        } else {
            anxwVar = anxyVar.c;
            if (anxwVar == null) {
                anxwVar = anxw.a;
            }
        }
        int iBh = a.bh(anxwVar.c);
        return iBh != 0 && iBh == 2;
    }

    public final boolean f(anxy anxyVar) {
        if (g(anxyVar)) {
            if ((anxyVar.b & 2) == 0) {
                return false;
            }
        } else if ((anxyVar.b & 1) == 0) {
            return false;
        }
        return true;
    }

    public final boolean g(anxy anxyVar) {
        ajlu ajluVar = (ajlu) this.g.b(anxyVar.e, ajlu.class);
        if (ajluVar != null) {
            return ajluVar.getValue().booleanValue();
        }
        return false;
    }

    public final void h(anxy anxyVar) {
        anxw anxwVar;
        if (g(anxyVar)) {
            anxwVar = anxyVar.d;
            if (anxwVar == null) {
                anxwVar = anxw.a;
            }
        } else {
            anxwVar = anxyVar.c;
            if (anxwVar == null) {
                anxwVar = anxw.a;
            }
        }
        int iBh = a.bh(anxwVar.c);
        if (iBh == 0) {
            iBh = 1;
        }
        int i = iBh - 1;
        int i2 = 0;
        boolean zL = this.h.l(260, 45827295L, false);
        if (i == 1) {
            i2 = zL ? R.raw.aic_delete_v2 : R.raw.aic_delete;
        } else if (i == 2) {
            i2 = zL ? R.raw.add_to_playlist_icon_v2 : R.raw.add_to_playlist_icon;
        } else if (i == 3) {
            i2 = zL ? R.raw.play_next_icon_v2 : R.raw.play_next_icon;
        } else if (i == 4) {
            i2 = zL ? R.raw.mark_as_played_icon_v2 : R.raw.mark_as_played_icon;
        } else if (i == 5) {
            i2 = zL ? R.raw.mark_as_unplayed_icon_v2 : R.raw.mark_as_unplayed_icon;
        }
        if (i2 != 0) {
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.music_icon_size);
            LottieAnimationView lottieAnimationView = this.d;
            lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            lottieAnimationView.h(i2);
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        h((anxy) obj);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
