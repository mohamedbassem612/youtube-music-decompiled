package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ivi implements sxu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ivi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        hvt hvtVar;
        ImageView imageView;
        int i = this.$cid;
        if (i == 0) {
            ((ivj) this.a).c((hck) obj2);
            return;
        }
        if (i == 1) {
            wjf wjfVar = (wjf) obj2;
            hvu hvuVar = (hvu) this.a;
            if (hvuVar.c() || (hvtVar = hvuVar.a) == null || (imageView = hvtVar.m) == null) {
                return;
            }
            wjfVar.af();
            hvuVar.b.b.j(imageView, wjfVar.af().l(), adhr.b);
            return;
        }
        xvk xvkVar = (xvk) obj2;
        xqi xqiVar = (xqi) this.a;
        xqiVar.g.L();
        xqiVar.g.m(R.drawable.mdx_ic_done);
        cf cfVar = xqiVar.a;
        xqiVar.g.o(tzk.k(cfVar, R.attr.ytCallToAction));
        if (xqiVar.o.P()) {
            xqiVar.d(false);
            xqiVar.k.setTag(R.id.device_id_from_button_tag, xvkVar.k().b);
        } else {
            xqiVar.j.getBackground().setColorFilter(tzk.i(cfVar, R.attr.ytCallToAction), PorterDuff.Mode.MULTIPLY);
            xqiVar.j.setTextColor(tzk.i(cfVar, R.attr.ytTextPrimaryInverse));
            xqiVar.j.setEnabled(true);
            xqiVar.j.setTag(R.id.device_id_from_button_tag, xvkVar.k().b);
        }
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        int i = this.$cid;
        if (i == 0) {
            ivj ivjVar = (ivj) this.a;
            jin jinVar = ivjVar.ak;
            jio jioVarE = jin.e();
            ((jik) jioVarE).k(ivjVar.c.b(exc));
            jinVar.d(jioVarE.b());
            return;
        }
        if (i == 1) {
            ((agrc) ((agrc) ((agrc) hvv.a.b().i(agso.a, "ConnectionPendingDlgCtlr")).j(exc)).k("com/google/android/apps/youtube/music/player/ConnectionPendingDialogFragmentController$PendingDialogSession$1", "onError", (char) 210, "ConnectionPendingDialogFragmentController.java")).t("Error fetching PlayerResponse model to show background thumbnail.");
            return;
        }
        xqi xqiVar = (xqi) this.a;
        cf cfVar = xqiVar.a;
        int i2 = tzk.i(cfVar, R.attr.ytErrorBackground);
        xqiVar.g.j(i2);
        xqiVar.g.u(ColorStateList.valueOf(i2));
        xqiVar.g.L();
        xqiVar.g.m(R.drawable.quantum_ic_error_black_18);
        xqiVar.g.o(tzk.k(cfVar, R.attr.ytTextPrimary));
        AccessibilityManager accessibilityManager = (AccessibilityManager) cfVar.getApplicationContext().getSystemService("accessibility");
        if (Build.VERSION.SDK_INT < 30 || accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        xqiVar.h.setStateDescription(cfVar.getBaseContext().getString(R.string.tv_code_error_msg));
        xqiVar.h.performAccessibilityAction(64, null);
    }
}
