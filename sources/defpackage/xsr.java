package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsr implements adma {
    public final Context a;
    public final aeda b;
    public final xsh c;
    private final View d;
    private final YouTubeTextView e;
    private final adxj f;
    private final ImageView g;

    public xsr(Context context, aeda aedaVar, adxj adxjVar, xsh xshVar) {
        this.a = context;
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_link_with_tv_code, null);
        this.d = viewInflate;
        this.e = (YouTubeTextView) viewInflate.findViewById(R.id.device_picker_link_with_tv_code_text);
        this.g = (ImageView) viewInflate.findViewById(R.id.device_picker_link_with_tv_code_icon);
        this.b = aedaVar;
        this.f = adxjVar;
        this.c = xshVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.d;
    }

    public final void d() {
        adxj adxjVar;
        this.d.setOnClickListener(new xpr(this, 10));
        boolean z = this.c.c.u;
        if (this.g != null) {
            aeda aedaVar = this.b;
            Drawable drawable = null;
            if (aedaVar != null && (adxjVar = this.f) != null && aedaVar.s()) {
                drawable = adxjVar.d(this.a, z ? arqz.dQ : arqz.od);
            }
            if (drawable == null) {
                try {
                    drawable = this.a.getDrawable(z ? R.drawable.yt_outline_add_vd_theme_24 : R.drawable.yt_outline_youtube_linked_tv_vd_theme_24);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (drawable != null) {
                this.g.setImageDrawable(yno.db(this.a, drawable));
            }
        }
        YouTubeTextView youTubeTextView = this.e;
        youTubeTextView.setText(z ? R.string.add_a_device : R.string.link_with_tv_code);
        youTubeTextView.setContentDescription(this.a.getString(true != z ? R.string.accessibility_link_with_tv_code : R.string.accessibility_add_a_device));
        xsj xsjVar = this.c.c;
        xgx xgxVarC = xsjVar.c(xsjVar.B, xhb.b(82853));
        if (xgxVarC != null) {
            xsjVar.B = xgxVarC;
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
