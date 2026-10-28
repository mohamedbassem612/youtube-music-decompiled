package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsq implements adma {
    public final Context a;
    public Intent b;
    public final xsh c;
    private final View d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final aeda g;
    private final adxj h;

    public xsq(Context context, aeda aedaVar, adxj adxjVar, xsh xshVar) {
        this.a = context;
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_learn_more, null);
        this.d = viewInflate;
        this.f = (ImageView) viewInflate.findViewById(R.id.device_picker_learn_more_icon);
        this.e = (YouTubeTextView) viewInflate.findViewById(R.id.device_picker_learn_more_text);
        this.c = xshVar;
        this.g = aedaVar;
        this.h = adxjVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    public final void d() {
        adxj adxjVar;
        this.d.setOnClickListener(new xpr(this, 9));
        if (this.f != null) {
            aeda aedaVar = this.g;
            Drawable drawable = null;
            if (aedaVar != null && (adxjVar = this.h) != null && aedaVar.s()) {
                drawable = adxjVar.d(this.a, arqz.ip);
            }
            if (drawable == null) {
                try {
                    drawable = this.a.getDrawable(R.drawable.yt_outline_info_circle_vd_theme_24);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (drawable != null) {
                this.f.setImageDrawable(yno.db(this.a, drawable));
            }
        }
        this.e.setText(R.string.device_picker_learn_more);
        xsj xsjVar = this.c.c;
        xgx xgxVarC = xsjVar.c(xsjVar.C, xhb.b(55768));
        if (xgxVarC != null) {
            xsjVar.C = xgxVarC;
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
