package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jbz extends jbd {
    private final View b;
    private final YouTubeTextView c;
    private final admd d;

    public jbz(Context context, vxe vxeVar) {
        super(context, vxeVar);
        jdw jdwVar = new jdw(context);
        this.d = jdwVar;
        View viewInflate = View.inflate(context, R.layout.did_you_mean_item, null);
        this.b = viewInflate;
        this.c = (YouTubeTextView) viewInflate.findViewById(R.id.did_you_mean);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.d).a;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        akfs akfsVar = (akfs) obj;
        adlyVar.b.w(new xgj(akfsVar.f, (amud) null), null);
        admd admdVar = this.d;
        kro.T(((jdw) admdVar).a, adlyVar);
        if ((akfsVar.b & 1) != 0) {
            alayVar = akfsVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        if ((akfsVar.b & 2) != 0) {
            alayVar2 = akfsVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
        ajwo ajwoVar = akfsVar.e;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.c.setText(d(spannedK, spannedK2, ajwoVar, adlyVar.b.i()));
        admdVar.e(adlyVar);
    }
}
