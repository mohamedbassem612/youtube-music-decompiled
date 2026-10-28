package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bmi extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class c;

    private bmi() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new bmi();
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new bmh(cls, charSequence) : super.newEditable(charSequence);
    }
}
