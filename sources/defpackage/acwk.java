package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class acwk extends bp implements acwn {
    protected acwk() {
    }

    protected static final void o(View view) {
        bac.p(view, new acwj());
    }

    private static View q(Window window) {
        return window.getDecorView().findViewById(R.id.content);
    }

    @Override // defpackage.acwn
    public final void a() {
        iN();
    }

    protected Drawable i(Context context) {
        Drawable drawable = context.getDrawable(com.google.android.apps.youtube.music.R.drawable.modern_dialog_background);
        drawable.getClass();
        return drawable;
    }

    @Override // defpackage.bp
    public final Dialog iH(Bundle bundle) {
        Dialog dialogIH = super.iH(bundle);
        dialogIH.setTitle("");
        View viewJ = j();
        if (n()) {
            acwo acwoVar = new acwo(requireContext());
            dialogIH.setContentView(acwoVar);
            acwoVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
            acwoVar.addView(viewJ, new FrameLayout.LayoutParams(-1, -2, 17));
            if (m()) {
                acwoVar.setBackground(i(requireContext()));
                viewJ.setClickable(true);
                o(viewJ);
            }
            Window window = dialogIH.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -1);
                window.setDimAmount(0.6f);
                azz.c(window, false);
                View viewQ = q(window);
                if (viewQ != null) {
                    final int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.modern_dialog_margin);
                    ayx ayxVar = new ayx() { // from class: acwi
                        @Override // defpackage.ayx
                        public final bbn a(View view, bbn bbnVar) {
                            int i = bbnVar.f(8).e;
                            int i2 = bbnVar.f(519).e;
                            int i3 = bbnVar.f(519).c;
                            int i4 = dimensionPixelSize;
                            view.setPaddingRelative(i4, i3 + i4, i4, Math.max(i, i2) + i4);
                            return bbnVar;
                        }
                    };
                    int i = bac.a;
                    azs.c(viewQ, ayxVar);
                    o(viewQ);
                    if (this.c) {
                        viewQ.setOnClickListener(new yde(this, 12));
                    } else {
                        viewQ.setClickable(false);
                        dialogIH.setCanceledOnTouchOutside(false);
                    }
                }
            }
        } else {
            dialogIH.setContentView(viewJ);
            Window window2 = dialogIH.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(i(requireContext()));
                return dialogIH;
            }
        }
        return dialogIH;
    }

    protected abstract View j();

    protected abstract xgn k();

    protected abstract ajwo l();

    protected abstract boolean m();

    protected abstract boolean n();

    @Override // defpackage.cc, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Window window;
        View viewQ;
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f;
        if (dialog == null || (window = dialog.getWindow()) == null || (viewQ = q(window)) == null) {
            return;
        }
        int i = bac.a;
        viewQ.requestApplyInsets();
    }

    @Override // defpackage.bp, defpackage.cc
    public void onStart() {
        super.onStart();
        p().m(this, "");
        if (m()) {
            k().b(xhb.a(222112), l(), null);
        }
    }

    @Override // defpackage.bp, defpackage.cc
    public void onStop() {
        super.onStop();
        p().o(this, "");
        if (m()) {
            k().t();
        }
    }

    protected abstract abfv p();
}
