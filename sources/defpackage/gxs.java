package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gxs implements View.OnFocusChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public gxs(gti gtiVar, int i) {
        this.$cid = i;
        this.a = gtiVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        EditText editText;
        SearchToolbarView searchToolbarView;
        int i = this.$cid;
        if (i == 0) {
            if (z) {
                return;
            }
            tuk.i(((gxx) this.a).e);
            return;
        }
        if (i == 1) {
            if (z || (editText = ((gti) this.a).f) == null) {
                return;
            }
            tuk.i(editText);
            return;
        }
        if (i == 2) {
            if (z) {
                ioc iocVar = (ioc) this.a;
                if (iocVar.B && iocVar.F.l(4, 45733117L, false) && iocVar.F.l(8, 45764180L, false) && (searchToolbarView = iocVar.u) != null) {
                    searchToolbarView.e();
                    iocVar.u.k = false;
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            if (Build.VERSION.SDK_INT < 30) {
                ((jmg) this.a).D();
                return;
            }
            return;
        }
        if (i == 4) {
            oxe oxeVar = (oxe) this.a;
            View.OnFocusChangeListener onFocusChangeListener = oxeVar.x;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
            if (z) {
                return;
            }
            oxeVar.b();
            return;
        }
        Object obj = this.a;
        if (i == 5) {
            afdt afdtVar = (afdt) obj;
            afdtVar.f(afdtVar.k());
            return;
        }
        afeb afebVar = (afeb) obj;
        afebVar.b = z;
        ((afeg) obj).x();
        if (z) {
            return;
        }
        afebVar.k(false);
        afebVar.c = false;
    }

    public /* synthetic */ gxs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
