package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzp extends wzh implements wyy {
    public wyz m;
    public wys n;
    private Activity o;
    private int p;

    private final void k(int i) {
        Window window;
        Dialog dialog = this.f;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i);
    }

    private final void l() {
        Window window;
        Dialog dialog = this.f;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(this.m.a, -2);
        window.setGravity(this.m.b);
    }

    @Override // defpackage.wyy
    public final void b() {
        l();
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialogIH = super.iH(bundle);
        dialogIH.requestWindowFeature(1);
        Window window = dialogIH.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogIH;
    }

    @Override // defpackage.wzh, defpackage.cc
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.o = activity;
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(1, 0);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.live_chat_purchase_dialog, viewGroup);
        viewInflate.setOnClickListener(new vhv((cc) this, 11));
        Bundle arguments = getArguments();
        if (arguments != null) {
            dd childFragmentManager = getChildFragmentManager();
            if (arguments.get("picker_panel") != null) {
                if (childFragmentManager.g("purchase_menu_fragment") == null) {
                    av avVar = new av(childFragmentManager);
                    wzr wzrVar = new wzr();
                    wzrVar.setArguments(arguments);
                    avVar.q(R.id.content_container, wzrVar, "purchase_menu_fragment");
                    avVar.a(false, true);
                    childFragmentManager.ah();
                }
            } else if (arguments.get("navigation_endpoint") != null && childFragmentManager.g("purchase_flow_fragment") == null) {
                av avVar2 = new av(childFragmentManager);
                wzq wzqVar = new wzq();
                wzqVar.setArguments(arguments);
                avVar2.q(R.id.content_container, wzqVar, "purchase_flow_fragment");
                if (childFragmentManager.g("purchase_menu_fragment") != null) {
                    avVar2.o(null);
                }
                avVar2.a(false, true);
                childFragmentManager.ah();
            }
        }
        return viewInflate;
    }

    @Override // defpackage.wyu, defpackage.bp, defpackage.cc
    public final void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onStart();
        l();
        this.m.a(this);
        Activity activity = this.o;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            this.p = attributes.softInputMode;
        }
        k(32);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        this.m.b(this);
        this.n.d();
        k(this.p);
    }
}
