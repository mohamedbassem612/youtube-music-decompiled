package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adez extends AnimatorListenerAdapter {
    final /* synthetic */ adfc a;

    public adez(adfc adfcVar) {
        this.a = adfcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte[] bArr;
        nxs nxsVar;
        super.onAnimationEnd(animator);
        adfc adfcVar = this.a;
        adfcVar.c = 1.0f;
        if (adfcVar.A) {
            Drawable drawable = adfcVar.getDrawable();
            adfcVar.setImageDrawable(null);
            adfcVar.setImageDrawable(drawable);
        } else {
            zsl zslVar = adfcVar.x;
            if (zslVar != null && (bArr = adfcVar.z) != null && (nxsVar = adfcVar.y) != null) {
                try {
                    Drawable drawable2 = (Drawable) zslVar.d(bArr);
                    boolean z = drawable2 instanceof FrameSequenceDrawable;
                    if (z || (drawable2 instanceof fce)) {
                        adfcVar.setImageDrawable(drawable2);
                        if (z) {
                            drawable2.getClass();
                            nxsVar.c((FrameSequenceDrawable) drawable2);
                        } else {
                            drawable2.getClass();
                            nxsVar.d((fce) drawable2);
                        }
                        nxsVar.e();
                    }
                } catch (IOException | tzn e) {
                    Log.e("ImageZoomView", "Failed converting bytes to drawable", e);
                }
            }
        }
        Dialog dialog = this.a.f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
