package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdv implements adma {
    public final vxe a;
    private final View b;
    private final iwt c;
    private final YouTubeAppCompatTextView d;
    private final Context e;
    private final aduv f;
    private final boolean g;
    private adly h;

    public jdv(Context context, aduv aduvVar, vxe vxeVar, vxz vxzVar, aciz acizVar) {
        vxeVar.getClass();
        this.a = vxeVar;
        acizVar.getClass();
        this.e = context;
        this.f = aduvVar;
        this.g = vxzVar.l(110, 45807806L, false);
        if (!vxzVar.l(110, 45807806L, false)) {
            iwt iwtVar = new iwt(context, aduvVar);
            this.c = iwtVar;
            this.d = null;
            this.b = iwtVar;
            return;
        }
        YouTubeAppCompatTextView youTubeAppCompatTextView = (YouTubeAppCompatTextView) LayoutInflater.from(context).inflate(R.layout.music_inline_badge, (ViewGroup) null);
        this.d = youTubeAppCompatTextView;
        aedu aeduVarA = aedv.a();
        aeduVarA.a = 3;
        aeduVarA.b = 2;
        aeduVarA.c = 1;
        aeduVarA.d = 1;
        aedv aedvVarA = aeduVarA.a();
        acizVar.B(aedvVarA, context, youTubeAppCompatTextView);
        aedr aedrVarA = aedi.a(aedvVarA);
        if (aedrVarA != null) {
            youTubeAppCompatTextView.setTextSize(1, aedrVarA.a);
        }
        this.c = null;
        this.b = youTubeAppCompatTextView;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        YouTubeAppCompatTextView youTubeAppCompatTextView;
        this.h = null;
        if (!this.g || (youTubeAppCompatTextView = this.d) == null) {
            return;
        }
        youTubeAppCompatTextView.setOnClickListener(null);
        youTubeAppCompatTextView.setClickable(false);
        youTubeAppCompatTextView.setText((CharSequence) null);
        youTubeAppCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
        tuk.l(this.b, false);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        YouTubeAppCompatTextView youTubeAppCompatTextView;
        Spanned spannedK;
        int iAS;
        anpv anpvVar = (anpv) obj;
        this.h = adlyVar;
        if (!this.g || (youTubeAppCompatTextView = this.d) == null) {
            iwt iwtVar = this.c;
            if (iwtVar != null) {
                if ((anpvVar.c & 4) == 0) {
                    tuk.l(iwtVar, false);
                    iwtVar.setImportantForAccessibility(2);
                    return;
                }
                alja aljaVar = anpvVar.d;
                if (aljaVar == null) {
                    aljaVar = alja.a;
                }
                aliz alizVarA = aliz.a(aljaVar.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                iwtVar.a(alizVarA);
                adly adlyVar2 = this.h;
                int dimensionPixelSize = (adlyVar2 == null || jen.b(adlyVar2, ajwd.COLLECTION_STYLE_ITEM_SIZE_MEDIUM) != ajwd.COLLECTION_STYLE_ITEM_SIZE_SMALL) ? this.e.getResources().getDimensionPixelSize(R.dimen.music_small_icon_size) : this.e.getResources().getDimensionPixelSize(R.dimen.music_extra_small_icon_size);
                iwtVar.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                tuk.l(iwtVar, true);
                if ((anpvVar.c & 8) == 0) {
                    iwtVar.setImportantForAccessibility(2);
                    return;
                }
                aiqe aiqeVar = anpvVar.e;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                kro.aa(iwtVar, aiqeVar);
                return;
            }
            return;
        }
        boolean z = ((anpvVar.c & 64) == 0 || (iAS = a.aS(anpvVar.i)) == 0 || iAS != 3) ? false : true;
        youTubeAppCompatTextView.setBackground(z ? this.e.getDrawable(R.drawable.music_inline_badge_background) : null);
        if ((anpvVar.c & 16) != 0) {
            alay alayVar = anpvVar.g;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            spannedK = ackj.k(null, alayVar, null, false);
        } else {
            spannedK = null;
        }
        youTubeAppCompatTextView.setText(spannedK);
        if ((anpvVar.c & 4) == 0) {
            youTubeAppCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
        } else {
            alja aljaVar2 = anpvVar.d;
            if (aljaVar2 == null) {
                aljaVar2 = alja.a;
            }
            aliz alizVarA2 = aliz.a(aljaVar2.c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            aliz alizVar = aliz.UNKNOWN;
            if (alizVarA2 != alizVar) {
                Context context = this.e;
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.yt_sys_measurement_icon_size_mini);
                int i = true != z ? R.attr.ytOverlayTextSecondary : R.attr.ytOverlayIconActiveOther;
                aduv aduvVar = this.f;
                int i2 = tzk.i(context, i);
                alja aljaVar3 = anpvVar.d;
                if (aljaVar3 == null) {
                    aljaVar3 = alja.a;
                }
                aliz alizVarA3 = aliz.a(aljaVar3.c);
                if (alizVarA3 != null) {
                    alizVar = alizVarA3;
                }
                aduk adukVar = new aduk(context, aduvVar.a(alizVar));
                adukVar.b(i2);
                adukVar.c(dimensionPixelSize2, dimensionPixelSize2);
                youTubeAppCompatTextView.setCompoundDrawablesRelative(adukVar.a(), null, null, null);
            } else {
                youTubeAppCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
            }
        }
        youTubeAppCompatTextView.setOnClickListener((anpvVar.c & 32) != 0 ? new gdp(this, anpvVar, 20) : null);
        youTubeAppCompatTextView.setClickable((anpvVar.c & 32) != 0);
        if ((anpvVar.c & 8) != 0) {
            aiqe aiqeVar2 = anpvVar.e;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            kro.aa(youTubeAppCompatTextView, aiqeVar2);
        } else {
            alay alayVar2 = anpvVar.g;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            youTubeAppCompatTextView.setContentDescription(ackj.e(alayVar2));
            youTubeAppCompatTextView.setImportantForAccessibility((anpvVar.c & 16) != 0 ? 0 : 2);
        }
        tuk.l(youTubeAppCompatTextView, true);
    }
}
