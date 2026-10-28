package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgl extends jbd {
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final admd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgl(Context context, vxe vxeVar) {
        super(context, vxeVar);
        context.getClass();
        vxeVar.getClass();
        jdw jdwVar = new jdw(context);
        this.e = jdwVar;
        View viewInflate = View.inflate(context, R.layout.showing_results_for_item, null);
        this.b = viewInflate;
        this.c = (YouTubeTextView) viewInflate.findViewById(R.id.showing_results_for);
        this.d = (YouTubeTextView) viewInflate.findViewById(R.id.search_instead_for);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.e).a;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        akfx akfxVar = (akfx) obj;
        adlyVar.b.w(new xgj(akfxVar.i, (amud) null), null);
        admd admdVar = this.e;
        kro.T(((jdw) admdVar).a, adlyVar);
        if ((akfxVar.b & 1) != 0) {
            alayVar = akfxVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        if ((akfxVar.b & 2) != 0) {
            alayVar2 = akfxVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
        ajwo ajwoVar = akfxVar.e;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.c.setText(d(spannedK, spannedK2, ajwoVar, adlyVar.b.i()));
        YouTubeTextView youTubeTextView = this.d;
        if ((akfxVar.b & 8) != 0) {
            alayVar3 = akfxVar.f;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        Spanned spannedK3 = ackj.k(null, alayVar3, null, false);
        if ((akfxVar.b & 16) != 0) {
            alayVar4 = akfxVar.g;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
        } else {
            alayVar4 = null;
        }
        Spanned spannedK4 = ackj.k(null, alayVar4, null, false);
        ajwo ajwoVar2 = akfxVar.h;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        youTubeTextView.setText(d(spannedK3, spannedK4, ajwoVar2, adlyVar.b.i()));
        admdVar.e(adlyVar);
    }
}
