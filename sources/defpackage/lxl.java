package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lxl {
    static final lxl a = new lxl(null);
    private static volatile boolean c = false;
    private static volatile lxl d = null;
    private static volatile int e = 1;
    public final Map b;

    lxl() {
        this.b = new HashMap();
    }

    public static lxl a() {
        Class cls = lwp.a;
        lxl lxlVar = d;
        if (lxlVar == null) {
            synchronized (lxl.class) {
                lxlVar = d;
                if (lxlVar == null) {
                    Class cls2 = lxj.a;
                    lxl lxlVar2 = null;
                    if (cls2 != null) {
                        try {
                            lxlVar2 = (lxl) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (lxlVar2 == null) {
                        lxlVar2 = a;
                    }
                    d = lxlVar2;
                    lxlVar = lxlVar2;
                }
            }
        }
        return lxlVar;
    }

    public lxl(byte[] bArr) {
        this.b = Collections.EMPTY_MAP;
    }
}
