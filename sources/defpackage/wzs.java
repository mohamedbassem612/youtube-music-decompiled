package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzs extends xat {
    private static final agkj v;
    private boolean w;
    private wxs x;
    private xbb y;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(aliz.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        agkhVar.e(aliz.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        agkhVar.e(aliz.MODERATOR, Integer.valueOf(R.style.live_chat_banner_author_moderator));
        agkhVar.e(aliz.MEMBER, Integer.valueOf(R.style.live_chat_banner_author_member));
        agkhVar.e(aliz.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        v = agkhVar.d(true);
    }

    public wzs(Activity activity, Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, adsa adsaVar, wyv wyvVar, xpl xplVar, aeda aedaVar) {
        super(activity, context, adhvVar, vxeVar, aduvVar, adsaVar, wyvVar, xplVar, new tza(R.style.Themed_YouTube_LiveChat_Dark_DarkerPalette), aedaVar);
        this.f.setAlpha(0.0f);
    }

    @Override // defpackage.xat, defpackage.xac, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.f.setAlpha(1.0f);
    }

    @Override // defpackage.xat, defpackage.xac
    protected final agkj h() {
        return v;
    }

    @Override // defpackage.xac, defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        hU(adlyVar, (ampd) obj);
    }

    @Override // defpackage.xat, defpackage.xac
    protected final void i(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        super.i(spannableStringBuilder, spannableStringBuilder2, spannableStringBuilder3, sb);
        boolean z = this.w;
        TextView textView = this.u;
        if (z) {
            textView.setSingleLine(true);
        } else {
            textView.setSingleLine(false);
        }
        this.y.b(this.c);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) View.ALPHA, 1.0f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.xat, defpackage.xac
    public final void j(View view) {
        wxs wxsVar = this.x;
        if (wxsVar != null) {
            wxsVar.h();
        } else {
            super.j(view);
        }
    }

    @Override // defpackage.xat, defpackage.xac
    protected final View m() {
        return null;
    }

    @Override // defpackage.xac
    protected final List n(List list) {
        return adrx.a(list, agkj.l(aliz.VERIFIED, Integer.valueOf(tzk.i(r(), R.attr.ytIconActiveOther)), aliz.MODERATOR, Integer.valueOf(tzk.i(r(), R.attr.ytIconActiveOther)), aliz.MEMBER, Integer.valueOf(tzk.i(r(), R.attr.ytIconActiveOther))));
    }

    @Override // defpackage.xac
    /* JADX INFO: renamed from: o */
    public final void hU(adly adlyVar, ampd ampdVar) {
        this.w = adlyVar.j("render_content_collapsed");
        this.x = (wxs) adlyVar.d("on_content_clicked_listener", null);
        this.y = (xbb) adlyVar.d("accessibility_data_receiver_key", null);
        super.hU(adlyVar, ampdVar);
    }

    @Override // defpackage.xat, defpackage.xac
    protected final boolean p() {
        return false;
    }

    @Override // defpackage.xac
    protected final boolean q() {
        return false;
    }
}
