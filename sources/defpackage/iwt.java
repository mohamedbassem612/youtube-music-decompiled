package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iwt extends AppCompatImageView {
    private final Context a;
    private final aduv b;
    private final int c;

    public iwt(Context context, aduv aduvVar) {
        super(context);
        this.a = context;
        aduvVar.getClass();
        this.b = aduvVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.music_small_icon_size);
        this.c = dimensionPixelSize;
        setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        setPaddingRelative(0, 0, getResources().getDimensionPixelOffset(R.dimen.music_inline_badge_padding_end), 0);
    }

    public final void a(aliz alizVar) {
        aduk adukVar = new aduk(this.a, this.b.a(alizVar));
        adukVar.d(R.color.ytm_text_color_secondary_translucent);
        int i = this.c;
        adukVar.c(i, i);
        setImageDrawable(adukVar.a());
    }
}
