package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fub implements bcn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ View a;

    public /* synthetic */ fub(View view, int i) {
        this.$cid = i;
        this.a = view;
    }

    @Override // defpackage.bcn
    public final boolean a(zs zsVar, int i, Bundle bundle) {
        if (this.$cid == 0) {
            View view = this.a;
            fip fipVar = ((fue) view).i;
            if (fipVar == null) {
                Log.e("TextInputSpec", "Rich content event handler is null - this should never happen (we shouldn't have set up this listener in that case)");
                return false;
            }
            int i2 = fua.R;
            aai aaiVar = new aai();
            aaiVar.b = view;
            aaiVar.c = zsVar;
            aaiVar.a = i;
            return ((Boolean) fipVar.b.n().z(fipVar, aaiVar)).booleanValue();
        }
        if ((i & 1) != 0) {
            try {
                zsVar.e();
                InputContentInfo inputContentInfo = ((bcp) zsVar.a).a;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipData clipData = new ClipData(zsVar.b(), new ClipData.Item(zsVar.c()));
        aya axzVar = Build.VERSION.SDK_INT >= 31 ? new axz(clipData, 2) : new ayb(clipData, 2);
        View view2 = this.a;
        axzVar.d(zsVar.d());
        axzVar.b(bundle);
        return bac.d(view2, axzVar.a()) == null;
    }
}
