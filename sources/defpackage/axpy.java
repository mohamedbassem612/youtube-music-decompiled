package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.version_info.VersionConstantsBridge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpy {
    static final axpy a = new axpy(null);
    private static volatile boolean b = false;
    private static volatile axpy c = null;
    private static volatile int e = 1;
    private final Map d;

    axpy() {
        this.d = new HashMap();
    }

    public static axpy a() {
        Class cls = axpi.a;
        axpy axpyVar = c;
        if (axpyVar == null) {
            synchronized (axpy.class) {
                axpyVar = c;
                if (axpyVar == null) {
                    Class cls2 = axpw.a;
                    axpy axpyVar2 = null;
                    if (cls2 != null) {
                        try {
                            axpyVar2 = (axpy) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (axpyVar2 == null) {
                        axpyVar2 = a;
                    }
                    c = axpyVar2;
                    axpyVar = axpyVar2;
                }
            }
        }
        return axpyVar;
    }

    public final VersionConstantsBridge b(axqv axqvVar, int i) {
        return (VersionConstantsBridge) this.d.get(new axpx(axqvVar, i));
    }

    public axpy(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
