package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wye extends wzv {
    private final adia c;

    public wye(Context context, adhv adhvVar) {
        super(context);
        this.c = new adia(adhvVar, this.b, false);
    }

    @Override // defpackage.wzv, defpackage.adma
    public final void b(admh admhVar) {
        this.c.a();
    }

    @Override // defpackage.wzv
    protected final int d() {
        return R.layout.live_chat_light_overlay_legacy_paid_message;
    }

    @Override // defpackage.wzv
    protected final ImageView e() {
        return (ImageView) this.a.findViewById(R.id.sponsor_thumbnail);
    }

    @Override // defpackage.wzv
    protected final TextView f() {
        return (TextView) this.a.findViewById(R.id.detail_text);
    }

    @Override // defpackage.wzv
    protected final TextView g() {
        return (TextView) this.a.findViewById(R.id.event_text);
    }

    @Override // defpackage.wzv
    protected final void h(aqmh aqmhVar) {
        this.c.f(aqmhVar, null);
    }

    @Override // defpackage.wzv
    protected final void i(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        tym.i(this.a, new oqe(new ViewGroup.MarginLayoutParams(-2, -2), 10), new tye(tym.g(-2, -2), new tyk(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
    }
}
