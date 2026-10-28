package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xsw implements adma {
    private final Context a;
    private final xsh b;
    private final aeda c;
    private final adxj d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private final ImageView h;
    private final LinearLayout i;
    private final vxz j;

    public xsw(Context context, xsh xshVar, vxz vxzVar, aeda aedaVar, adxj adxjVar) {
        this.a = context;
        this.b = xshVar;
        this.j = vxzVar;
        this.c = aedaVar;
        this.d = adxjVar;
        View viewInflate = View.inflate(context, R.layout.mdx_device_picker_route, null);
        this.e = viewInflate;
        this.f = (TextView) viewInflate.findViewById(R.id.device_picker_route_title);
        this.g = (TextView) viewInflate.findViewById(R.id.device_picker_route_description);
        this.h = (ImageView) viewInflate.findViewById(R.id.device_picker_route_icon);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.textHolder);
    }

    private final Drawable d(xvq xvqVar) {
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
        aeda aedaVar = this.c;
        Drawable drawableD = (aedaVar == null || (adxjVar = this.d) == null || !aedaVar.s()) ? null : adxjVar.d(this.a, arqzVar);
        if (drawableD == null) {
            try {
                drawableD = this.a.getDrawable(i);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        if (drawableD == null) {
            return null;
        }
        boolean z = xvqVar.b;
        Context context = this.a;
        if (z) {
            return yno.db(context, drawableD);
        }
        yno.dd(context, drawableD);
        return drawableD;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.e;
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        xgt xgtVarA;
        xvq xvqVar = (xvq) obj;
        boolean zL = xvqVar.l();
        TextView textView = this.f;
        if (zL) {
            textView.setText(R.string.this_device_title);
        } else {
            textView.setText(xvqVar.c);
        }
        Drawable drawableD = d(xvqVar);
        ImageView imageView = this.h;
        if (imageView != null && drawableD != null) {
            imageView.setImageDrawable(drawableD);
        }
        if (xvqVar.k() && (xvqVar.h() || this.j.l(145, 45649405L, false))) {
            if (xvqVar.h()) {
                String str = xvqVar.d;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                TextView textView2 = this.g;
                if (zIsEmpty) {
                    textView2.setText(R.string.connected_to_bluetooth_generic_description);
                } else {
                    textView2.setText(this.a.getString(R.string.connected_to_bluetooth_description, str));
                }
            } else if (this.j.l(145, 45649405L, false)) {
                this.g.setText(R.string.tap_here_to_disconnect_help_text);
            }
            TextView textView3 = this.g;
            textView3.setTextColor(tzk.i(this.a, R.attr.ytTextSecondary));
            this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f.setGravity(80);
            textView3.setVisibility(0);
        } else if (xvqVar.m()) {
            this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView4 = this.f;
            Context context = this.a;
            textView4.setTextColor(tzk.i(context, R.attr.ytTextPrimary));
            textView4.setGravity(80);
            TextView textView5 = this.g;
            textView5.setText(context.getString(R.string.playing_device, "YouTube"));
            textView5.setTextColor(tzk.i(context, R.attr.ytTextSecondary));
            textView5.setVisibility(0);
        } else {
            TextView textView6 = this.f;
            textView6.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            textView6.setGravity(16);
            textView6.setTextColor(tzk.i(this.a, R.attr.ytTextPrimary));
            TextView textView7 = this.g;
            textView7.setVisibility(8);
            textView7.setText("");
        }
        if (!xvqVar.b) {
            TextView textView8 = this.f;
            Context context2 = this.a;
            textView8.setTextColor(tzk.i(context2, R.attr.ytTextDisabled));
            this.g.setTextColor(tzk.i(context2, R.attr.ytTextDisabled));
        }
        Object objF = tym.M(this.a).f();
        cf cfVar = objF instanceof cf ? (cf) objF : null;
        View view = this.e;
        xsh xshVar = this.b;
        dii diiVar = xvqVar.a;
        view.setOnClickListener(new xsg(xshVar, diiVar, xshVar.b, (Boolean) xshVar.f.io(), xshVar.n, xshVar.d, xshVar.e, xvqVar, cfVar));
        xsj xsjVar = xshVar.c;
        int iA = xshVar.a();
        xgn xgnVar = xsjVar.x;
        HashMap map = xsjVar.y;
        if (map.containsKey(xrx.a(diiVar)) || xgnVar == null || (xgtVarA = xgnVar.a()) == null) {
            return;
        }
        xgx xgxVar = new xgx(xgtVarA, xhb.b(true != xvqVar.l() ? 12926 : 162183));
        xgx xgxVar2 = xsjVar.z;
        if (xgxVar2 == null) {
            xgnVar.d(xgxVar);
        } else {
            xgnVar.e(xgxVar, xgxVar2);
        }
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
        int iW = xsjVar.w(xvqVar);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar.c = iW - 1;
        amdgVar.b |= 1;
        int iBU = zik.bU(iA);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar2.d = iBU - 1;
        amdgVar2.b |= 4;
        amdg amdgVar3 = (amdg) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdgVar3.getClass();
        amddVar.f = amdgVar3;
        amddVar.b |= 4;
        xgnVar.w(xgxVar, (amdd) aihfVarCreateBuilder.build());
        map.put(xrx.a(diiVar), xgxVar);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
