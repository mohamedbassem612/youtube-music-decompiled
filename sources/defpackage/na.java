package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class na extends mx implements my {
    public static Method a;
    public my b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public na(Context context, int i) {
        super(context, null, i);
    }

    @Override // defpackage.mx
    public final mb p(Context context, boolean z) {
        mz mzVar = new mz(context, z);
        mzVar.e = this;
        return mzVar;
    }
}
