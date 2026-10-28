package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzo extends wzg {
    public wrb m;
    public Activity n;
    public View o;
    public LinearLayout p;
    public aigj q = aigj.d;
    public wwn r;
    public wwh s;
    private ajwo t;

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        View viewInflate = LayoutInflater.from(this.n).inflate(R.layout.live_chat_item_context_menu_dialog, (ViewGroup) null);
        this.o = viewInflate.findViewById(R.id.progress_bar);
        this.p = (LinearLayout) viewInflate.findViewById(R.id.menu_container);
        wrb wrbVar = this.m;
        wrbVar.h(wrbVar.g(this.t), new gtg(this, 10));
        fu fuVar = new fu(this.n);
        fuVar.i(R.string.live_chat_item_context_menu_title);
        fuVar.setView(viewInflate);
        fuVar.a(true);
        return fuVar.create();
    }

    public final boolean k() {
        return getLifecycle().a().a(bob.e);
    }

    public final /* synthetic */ void l(anfv anfvVar, xgn xgnVar) {
        wwh wwhVar = this.s;
        if (wwhVar != null) {
            wwhVar.i(anfvVar);
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(yno.dR(anfvVar), (amud) null), null);
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.wzg, defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.n = activity;
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (twm.v(this.n) || configuration.orientation != 2) {
            return;
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        ajwo ajwoVarB = this.t;
        if (ajwoVarB == null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                super.iQ(false, false, false);
                return;
            } else {
                ajwoVarB = vxg.b(arguments.getByteArray("navigation_endpoint"));
                this.t = ajwoVarB;
            }
        }
        this.q = ajwoVarB.c;
    }
}
