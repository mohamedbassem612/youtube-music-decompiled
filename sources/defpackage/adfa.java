package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adfa extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ adfc a;

    public adfa(adfc adfcVar) {
        this.a = adfcVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        adfc adfcVar = this.a;
        float scaleFactor = adfcVar.c * scaleGestureDetector.getScaleFactor();
        int i = adex.a;
        adfcVar.c = Math.max(1.0f, Math.min(((int) (scaleFactor * 100.0f)) / 100.0f, 10.0f));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        adfc adfcVar = this.a;
        if (!adfcVar.d) {
            adfcVar.n = false;
            if (adfcVar.o) {
                adfcVar.d = true;
                FrameLayout frameLayout = new FrameLayout(adfcVar.getContext());
                if (adfcVar.p) {
                    adfcVar.g = adfcVar.a();
                    adfcVar.g.setBackground(adfcVar.getBackground());
                    frameLayout.addView(adfcVar.g, new FrameLayout.LayoutParams(adfcVar.getWidth(), adfcVar.getHeight()));
                    if (adfcVar.C == 2) {
                        adfcVar.h = adfcVar.a();
                        adfcVar.h.setBackgroundColor(adfcVar.getResources().getColor(R.color.zoom_overlay_translucent_black));
                        frameLayout.addView(adfcVar.h, new FrameLayout.LayoutParams(adfcVar.getWidth(), adfcVar.getHeight()));
                    }
                }
                adfcVar.i = adfcVar.a();
                adfcVar.i.setImageDrawable(adfcVar.getDrawable());
                if (adfcVar.r) {
                    adfcVar.i.setScaleType(ImageView.ScaleType.MATRIX);
                    adfcVar.i.setImageMatrix(adfcVar.getImageMatrix());
                }
                frameLayout.addView(adfcVar.i, new FrameLayout.LayoutParams(adfcVar.getWidth(), adfcVar.getHeight()));
                adfcVar.f = new Dialog(adfcVar.getContext(), android.R.style.Theme.Translucent.NoTitleBar.Fullscreen);
                Window window = adfcVar.f.getWindow();
                if (adfcVar.q && window != null) {
                    if (Build.VERSION.SDK_INT < 35) {
                        azz.c(window, false);
                    }
                    new zf(window, window.getDecorView()).b(519);
                }
                int i = adfcVar.C;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && window != null) {
                    window.setBackgroundDrawableResource(R.color.zoom_overlay_translucent_black);
                }
                adfcVar.f.addContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                adfcVar.f.show();
                if (adfcVar.k != null && adfcVar.l != null) {
                    nrt nrtVarD = nrv.d();
                    nsl nslVar = adfcVar.j;
                    if (nslVar != null) {
                        nrtVarD.f = nslVar.t;
                    }
                    adfcVar.k.a(adfcVar.l, nrtVarD.a()).D();
                }
            }
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
