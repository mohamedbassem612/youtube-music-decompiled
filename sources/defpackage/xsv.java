package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsv implements xzf {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/devicepicker/DevicePickerPlaybackButtonsController");
    public final Context a;
    ImageView b;
    ImageView c;
    public final xsh d;
    public final ycp e;
    private final aeda g;
    private final adxj h;
    private final vxz i;

    public xsv(Context context, xsh xshVar, vxz vxzVar, aeda aedaVar, adxj adxjVar, ycp ycpVar) {
        this.a = context;
        this.d = xshVar;
        this.i = vxzVar;
        this.g = aedaVar;
        this.h = adxjVar;
        this.e = ycpVar;
    }

    public final void a(View view) {
        this.b = (ImageView) view.findViewById(R.id.device_picker_mic_icon);
        this.c = (ImageView) view.findViewById(R.id.device_picker_remote_icon);
    }

    public final void b(Context context, int i) {
        try {
            Intent intentCQ = yno.cQ(context);
            intentCQ.setFlags(268435456);
            intentCQ.putExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", i);
            intentCQ.putExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", true != yno.C(context) ? 2132084322 : 2132084329);
            yno.dc(context, intentCQ);
            this.d.h((cf) context, 3);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    public final void c() {
        adxj adxjVar;
        adxj adxjVar2;
        ImageView imageView = this.b;
        ImageView imageView2 = this.c;
        if (!this.d.g()) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        boolean z = true;
        if (imageView != null) {
            ycp ycpVar = this.e;
            vxz vxzVar = this.i;
            yco ycoVar = ycpVar.e;
            vxzVar.getClass();
            if (ycoVar != null) {
                boolean zAt = ycoVar.at("mic");
                if (!vxzVar.l(177, 45702180L, false)) {
                    zAt = ycoVar.at("dpa") || zAt;
                }
                if (ycoVar.b() == 2 || ycoVar.b() == 0 || !zAt) {
                    imageView.setVisibility(8);
                } else {
                    aeda aedaVar = this.g;
                    Drawable drawableD = (aedaVar == null || (adxjVar2 = this.h) == null || !aedaVar.s()) ? null : adxjVar2.d(this.a, arqz.bc);
                    if (drawableD == null) {
                        try {
                            drawableD = this.a.getDrawable(R.drawable.yt_fill_mic_vd_theme_24);
                        } catch (Resources.NotFoundException e) {
                            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/android/libraries/youtube/mdx/mediaroute/devicepicker/DevicePickerPlaybackButtonsController", "updateControlsUi", ']', "DevicePickerPlaybackButtonsController.java")).t("microphoneIcon resource wasn't found.");
                        }
                    }
                    Drawable drawable = drawableD;
                    if (drawable != null) {
                        imageView.setImageDrawable(yno.db(this.a, drawable));
                    }
                    imageView.setOnClickListener(new xpr(this, 14, null));
                    imageView.setVisibility(0);
                    xsj xsjVar = this.d.c;
                    xgx xgxVarC = xsjVar.c(xsjVar.D, xhb.b(78759));
                    if (xgxVarC != null) {
                        xsjVar.D = xgxVarC;
                    }
                }
            } else {
                imageView.setVisibility(8);
            }
        }
        if (imageView2 != null) {
            ycp ycpVar2 = this.e;
            vxz vxzVar2 = this.i;
            yco ycoVar2 = ycpVar2.e;
            vxzVar2.getClass();
            if (ycoVar2 != null) {
                boolean zAt2 = ycoVar2.at("dpa");
                if (vxzVar2.l(177, 45702180L, false)) {
                    z = zAt2;
                } else {
                    boolean zAt3 = ycoVar2.at("mic");
                    if (!zAt2 && !zAt3) {
                        z = false;
                    }
                }
                if (ycoVar2.b() != 2 && ycoVar2.b() != 0 && z) {
                    aeda aedaVar2 = this.g;
                    Drawable drawableD2 = (aedaVar2 == null || (adxjVar = this.h) == null || !aedaVar2.s()) ? null : adxjVar.d(this.a, arqz.ah);
                    if (drawableD2 == null) {
                        try {
                            drawableD2 = this.a.getDrawable(R.drawable.quantum_ic_games_vd_theme_24);
                        } catch (Resources.NotFoundException e2) {
                            ((agrc) ((agrc) ((agrc) f.b()).j(e2)).k("com/google/android/libraries/youtube/mdx/mediaroute/devicepicker/DevicePickerPlaybackButtonsController", "updateControlsUi", (char) 129, "DevicePickerPlaybackButtonsController.java")).t("remoteIcon resource wasn't found.");
                        }
                    }
                    if (drawableD2 != null) {
                        imageView2.setImageDrawable(yno.db(this.a, drawableD2));
                    }
                    imageView2.setOnClickListener(new xpr(this, 15, null));
                    imageView2.setVisibility(0);
                    xsj xsjVar2 = this.d.c;
                    xgx xgxVarC2 = xsjVar2.c(xsjVar2.E, xhb.b(78760));
                    if (xgxVarC2 != null) {
                        xsjVar2.E = xgxVarC2;
                        return;
                    }
                    return;
                }
            }
            imageView2.setVisibility(8);
        }
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        c();
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        c();
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void h(xzc xzcVar) {
    }
}
