package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xst implements adma {
    public final xpq a;
    private final Context b;
    private final adxj c;
    private final aeda d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;

    public xst(Context context, xpq xpqVar, adxj adxjVar, aeda aedaVar) {
        xpqVar.getClass();
        this.b = context;
        this.a = xpqVar;
        this.c = adxjVar;
        this.d = aedaVar;
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_lnp, null);
        viewInflate.getClass();
        this.e = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.device_picker_lnp_icon);
        viewFindViewById.getClass();
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.device_picker_lnp_title);
        viewFindViewById2.getClass();
        this.g = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.device_picker_lnp_subtitle);
        viewFindViewById3.getClass();
        this.h = (TextView) viewFindViewById3;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        admhVar.getClass();
        this.e.setOnClickListener(null);
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        adxj adxjVar;
        adlyVar.getClass();
        ((xss) obj).getClass();
        aeda aedaVar = this.d;
        Drawable drawable = null;
        if (aedaVar != null && aedaVar.s() && (adxjVar = this.c) != null) {
            drawable = adxjVar.d(this.b, arqz.oK);
        }
        if (drawable == null) {
            drawable = this.b.getDrawable(R.drawable.yt_outline_experimental_wifi_tethering_vd_theme_24);
        }
        if (drawable != null) {
            this.f.setImageDrawable(yno.db(this.b, drawable));
        }
        this.g.setText(R.string.mdx_device_picker_lnp_title);
        this.h.setText(R.string.mdx_device_picker_lnp_subtitle);
        this.e.setOnClickListener(new xpr(this, 11));
    }
}
