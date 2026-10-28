package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsy implements adma {
    public long a = 0;
    public int b = 0;
    public final xsh c;
    public final mbc d;
    public final Handler e;
    public xtr f;
    private final Context g;
    private final aeda h;
    private final adxj i;
    private final View j;
    private final TextView k;
    private final ImageView l;
    private final SeekBar m;
    private final ImageButton n;
    private final vxz o;

    public xsy(Context context, xsh xshVar, mbc mbcVar, vxz vxzVar, aeda aedaVar, adxj adxjVar) {
        this.g = context;
        this.c = xshVar;
        this.d = mbcVar;
        this.o = vxzVar;
        this.h = aedaVar;
        this.i = adxjVar;
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_route_with_volume, null);
        this.j = viewInflate;
        this.k = (TextView) viewInflate.findViewById(R.id.device_picker_route_title);
        this.l = (ImageView) viewInflate.findViewById(R.id.device_picker_route_icon);
        this.m = (SeekBar) viewInflate.findViewById(R.id.device_picker_route_volume_slider);
        this.e = new Handler(Looper.getMainLooper());
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.overflow_button);
        this.n = imageButton;
        imageButton.setOnClickListener(new vqd(xshVar, context, 15));
    }

    private final Drawable e(xvq xvqVar) {
        arqz arqzVar;
        int i;
        adxj adxjVar;
        if (xvqVar.l()) {
            arqzVar = arqz.jh;
            i = R.drawable.yt_outline_mobile_vd_theme_24;
        } else {
            int iA = xvqVar.a();
            if (iA == 1) {
                arqzVar = arqz.of;
                i = R.drawable.yt_outline_tv_vd_theme_24;
            } else if (iA == 2) {
                arqzVar = arqz.mU;
                i = R.drawable.yt_outline_speaker_vd_theme_24;
            } else if (xvqVar.n()) {
                arqzVar = arqz.mW;
                i = R.drawable.yt_outline_speaker_group_vd_theme_24;
            } else {
                arqzVar = arqz.ga;
                i = R.drawable.yt_outline_chromecast_vd_theme_24;
            }
        }
        aeda aedaVar = this.h;
        Drawable drawableD = (aedaVar == null || (adxjVar = this.i) == null || !aedaVar.s()) ? null : adxjVar.d(this.g, arqzVar);
        if (drawableD == null) {
            try {
                drawableD = this.g.getDrawable(i);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        if (drawableD == null) {
            return null;
        }
        boolean z = xvqVar.b;
        Context context = this.g;
        if (z) {
            return yno.db(context, drawableD);
        }
        yno.dd(context, drawableD);
        return drawableD;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.j;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.c.j(this.f);
        this.f = null;
    }

    public final void d(xtr xtrVar) {
        adxj adxjVar;
        if (xtrVar.c) {
            return;
        }
        this.f = xtrVar;
        xvq xvqVar = xtrVar.a;
        boolean zL = xvqVar.l();
        TextView textView = this.k;
        if (zL) {
            textView.setText(R.string.this_device_title);
            this.m.setVisibility(8);
            return;
        }
        textView.setText(xvqVar.c);
        aeda aedaVar = this.h;
        Drawable drawable = null;
        if (aedaVar != null && (adxjVar = this.i) != null && aedaVar.s()) {
            drawable = adxjVar.d(this.g, arqz.jA);
        }
        if (drawable == null) {
            try {
                drawable = this.g.getDrawable(R.drawable.yt_outline_overflow_vertical_vd_theme_24);
            } catch (Resources.NotFoundException unused) {
            }
        }
        if (drawable != null) {
            this.n.setImageDrawable(yno.db(this.g, drawable));
        }
        vxz vxzVar = this.o;
        boolean z = true;
        if (!vxzVar.l(110, 45620291L, false) && !vxzVar.l(131, 45634818L, false)) {
            z = false;
        }
        tuk.l(this.n, z);
        if (z) {
            xsj xsjVar = this.c.c;
            xgx xgxVarC = xsjVar.c(xsjVar.G, xhb.b(210361));
            if (xgxVarC != null) {
                xsjVar.G = xgxVarC;
            }
        }
        xvq xvqVar2 = xtrVar.a;
        Drawable drawableE = e(xvqVar2);
        ImageView imageView = this.l;
        if (imageView != null && drawableE != null) {
            imageView.setImageDrawable(drawableE);
        }
        boolean zL2 = vxzVar.l(164, 45673420L, false);
        SeekBar seekBar = this.m;
        if (zL2) {
            seekBar.setVisibility(8);
            return;
        }
        Context context = this.g;
        seekBar.getProgressDrawable().setColorFilter(tzk.i(context, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_IN);
        seekBar.getThumb().setColorFilter(tzk.i(context, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_IN);
        boolean z2 = xtrVar.b;
        seekBar.setEnabled(z2);
        if (!z2) {
            seekBar.setMax(100);
            seekBar.setProgress(0);
            seekBar.getThumb().mutate().setAlpha(75);
        } else {
            dii diiVar = xvqVar2.a;
            seekBar.setMax(diiVar.q);
            seekBar.setProgress(diiVar.p);
            seekBar.setOnSeekBarChangeListener(new xsx(this, xtrVar));
            xtrVar.d = seekBar;
            this.c.i(xtrVar);
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d((xtr) obj);
    }
}
