package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzn extends wzf implements wyy {
    public wrb k;
    public wyz l;
    public aduv m;
    public advb n;
    public mbc o;
    public tun p;
    public Activity q;
    public View r;
    public LinearLayout s;
    public YouTubeTextView t;
    public View u;
    public wwh v;
    private ajwo w;

    private final void k() {
        Window window;
        Dialog dialog = this.f;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(this.l.a, -2);
        window.setGravity(this.l.b);
    }

    @Override // defpackage.wyy
    public final void b() {
        k();
    }

    @Override // defpackage.aevy, defpackage.gs, defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialogIH = super.iH(bundle);
        dialogIH.requestWindowFeature(1);
        Window window = dialogIH.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            yno.dz(window, this.o, this.p);
        }
        return dialogIH;
    }

    @Override // defpackage.wzf, defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.q = activity;
    }

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (twm.v(this.q) || configuration.orientation != 2) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            dismiss();
            return;
        }
        if (this.w == null) {
            this.w = vxg.b(arguments.getByteArray("navigation_endpoint"));
        }
        this.n.b(amqm.class);
        iO(1, 0);
        this.l.a(this);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.live_chat_context_menu_bottom_sheet_dialog, viewGroup);
        this.r = viewInflate.findViewById(R.id.progress_bar);
        this.s = (LinearLayout) viewInflate.findViewById(R.id.menu_container);
        this.t = (YouTubeTextView) viewInflate.findViewById(R.id.header_text);
        this.u = viewInflate.findViewById(R.id.separator);
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onDestroy() {
        super.onDestroy();
        this.l.b(this);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        this.l.b(this);
        this.t.setVisibility(8);
        this.u.setVisibility(8);
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        wrb wrbVar = this.k;
        wrbVar.h(wrbVar.g(this.w), new wzm(this));
    }
}
