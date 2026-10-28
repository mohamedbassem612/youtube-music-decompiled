package defpackage;

import com.facebook.yoga.YogaNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkk {
    public static volatile fkj a;
    public static final fwk b;

    static {
        fwk fwkVar = new fwk();
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(fwkVar.a, true);
        b = fwkVar;
    }
}
