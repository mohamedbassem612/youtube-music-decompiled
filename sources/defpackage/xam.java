package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xam extends wzz {
    public xam(Context context, xgm xgmVar, vxe vxeVar, adhv adhvVar, tza tzaVar, aeda aedaVar, Context context2) {
        super(context, xgmVar, vxeVar, adhvVar, tzaVar, aedaVar, context2);
        Resources resources = aedaVar.i() ? context2.getResources() : context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        tym.i(this.c, new oqe(marginLayoutParams, 14), new tyk(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.wzz
    public final int d() {
        return R.layout.live_chat_overlay_paid_sticker;
    }
}
