package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqr {
    private static final aqq b = new aqq();
    public static final awuq a = awvi.b;

    public static final ListenableFuture a(awou awouVar, awqk awqkVar) throws Throwable {
        awuz awuzVarR = awro.r(b, awouVar, 1, awqkVar);
        aqp aqpVar = new aqp(awuzVarR);
        new awow(JniZero.q(JniZero.o(new dmf((Object) awuzVarR, 1, (byte[]) null), aqpVar)), awox.a).resumeWith(awmy.a);
        return aqpVar;
    }
}
