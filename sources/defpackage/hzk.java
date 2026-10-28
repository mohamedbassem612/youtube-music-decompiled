package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzk implements DialogInterface.OnClickListener, xgm {
    public final Context a;
    public final adhv b;
    public final xgn c;
    public final Resources d;
    public final aqmg[] e;
    public final aqmg[] f;
    public final aqmg[] g;
    public final abfv h;
    private final vxe i;
    private hzj j;

    public hzk(Context context, vxe vxeVar, adhv adhvVar, xgn xgnVar, abfv abfvVar) {
        context.getClass();
        this.a = context;
        this.i = vxeVar;
        adhvVar.getClass();
        this.b = adhvVar;
        abfvVar.getClass();
        this.h = abfvVar;
        Resources resources = context.getResources();
        this.d = resources;
        this.g = new aqmg[]{aawb.I(resources.getString(R.string.ytu_promo_logo_180x56), 180, 56), aawb.I(resources.getString(R.string.ytu_promo_logo_360x112), 360, 112), aawb.I(resources.getString(R.string.ytu_promo_logo_540x168), 540, 168)};
        this.e = new aqmg[]{aawb.I(resources.getString(R.string.ytu_promo_dreads_416x88), 416, 88), aawb.I(resources.getString(R.string.ytu_promo_dreads_832x176), 832, 176), aawb.I(resources.getString(R.string.ytu_promo_dreads_1248x264), 1248, 264)};
        this.f = new aqmg[]{aawb.I(resources.getString(R.string.ytu_promo_dreads_548x88), 548, 88), aawb.I(resources.getString(R.string.ytu_promo_dreads_1096x176), 1096, 176), aawb.I(resources.getString(R.string.ytu_promo_dreads_1644x264), 1644, 264)};
        this.c = xgnVar;
    }

    public final void a() {
        hzj hzjVar = this.j;
        if (hzjVar == null) {
            hzjVar = new hzj(this);
            this.j = hzjVar;
        }
        hzjVar.a.show();
        aqmh aqmhVar = aqmh.a;
        aihh aihhVar = (aihh) aqmhVar.createBuilder();
        hzk hzkVar = hzjVar.h;
        aihhVar.q(Arrays.asList(hzkVar.g));
        aqmh aqmhVar2 = (aqmh) aihhVar.build();
        aihh aihhVar2 = (aihh) aqmhVar.createBuilder();
        aihhVar2.q(Arrays.asList(hfn.F(hzkVar.a) ? hzkVar.f : hzkVar.e));
        aqmh aqmhVar3 = (aqmh) aihhVar2.build();
        ImageView imageView = hzjVar.g;
        if (imageView != null) {
            hzjVar.c.f(aqmhVar2, null);
            imageView.setVisibility(0);
        }
        ImageView imageView2 = hzjVar.f;
        if (imageView2 != null) {
            hzjVar.b.f(aqmhVar3, null);
            imageView2.setVisibility(0);
        }
        TextView textView = hzjVar.d;
        if (textView != null) {
            tuk.u(textView, hzkVar.d.getString(R.string.upsell_audio_cast_title));
        }
        TextView textView2 = hzjVar.e;
        if (textView2 != null) {
            tuk.u(textView2, hzkVar.d.getString(R.string.upsell_audio_cast_song_text));
        }
        xgn xgnVar = hzkVar.c;
        xgnVar.b(xhb.a(23528), null, null);
        xgnVar.l(new xgj(xhb.b(25082)));
        xgnVar.l(new xgj(xhb.b(25083)));
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return this.c;
    }

    @tcc
    void handleCastAudioRouteUnsupportedEvent(xqp xqpVar) {
        a();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        hzj hzjVar = this.j;
        if (hzjVar != null) {
            AlertDialog alertDialog = hzjVar.a;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            if (i == -2) {
                this.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(25083)), null);
                dialogInterface.dismiss();
                return;
            }
            return;
        }
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihf aihfVarCreateBuilder = ajmf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajmf ajmfVar = (ajmf) aihfVarCreateBuilder.instance;
        ajmfVar.b |= 1;
        ajmfVar.c = "SPunlimited";
        aihhVar.e(ajmj.a, (ajmf) aihfVarCreateBuilder.build());
        xgt xgtVarA = this.c.a();
        if (xgtVarA != null) {
            aihf aihfVarCreateBuilder2 = aoar.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder2.instance;
            String str = xgtVarA.a;
            str.getClass();
            aoarVar.b |= 1;
            aoarVar.c = str;
            aihfVarCreateBuilder2.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder2.instance;
            aoarVar2.b |= 2;
            aoarVar2.d = 25082;
            aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder2.build());
        }
        this.i.c((ajwo) aihhVar.build(), null);
        dialogInterface.dismiss();
    }
}
