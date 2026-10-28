package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xar extends wzz {
    private final RelativeLayout f;

    public xar(Context context, xgm xgmVar, vxe vxeVar, adhv adhvVar, tza tzaVar, aeda aedaVar, Context context2) {
        super(context, xgmVar, vxeVar, adhvVar, tzaVar, aedaVar, context2);
        this.f = (RelativeLayout) this.c.findViewById(R.id.live_chat_sticker_background);
    }

    @Override // defpackage.wzz, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.c.setBackgroundColor(0);
        ((GradientDrawable) this.f.getBackground()).setColor(0);
    }

    @Override // defpackage.wzz
    public final int d() {
        return R.layout.live_chat_paid_sticker;
    }
}
