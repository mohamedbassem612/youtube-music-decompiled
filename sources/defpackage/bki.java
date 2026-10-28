package defpackage;

import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bki extends bkh {
    public static final Method a = rpi.B();

    @Override // defpackage.bkg
    public final int c(String str) {
        try {
            return ((Integer) a.invoke(str, StandardCharsets.UTF_8)).intValue();
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(e);
        }
    }
}
