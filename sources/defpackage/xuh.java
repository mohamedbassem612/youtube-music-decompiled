package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xuh extends xtu {
    public qcb m;

    @Override // defpackage.dgf
    public final dge i(Context context) {
        qcb qcbVar = this.m;
        TypedValue typedValue = new TypedValue();
        int i = 2132084322;
        if (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) {
            i = 2132084329;
        }
        gij gijVar = (gij) qcbVar.a;
        return new xug((Context) gijVar.b.b.io(), i, (xru) gijVar.a.po.io());
    }
}
