package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bil {
    static final bil a = new bil(null);
    private static volatile boolean b = false;
    private static volatile bil c = null;
    private static volatile int e = 1;
    private final Map d;

    bil() {
        this.d = new HashMap();
    }

    public static bil a() {
        Class cls = bhp.a;
        bil bilVar = c;
        if (bilVar == null) {
            synchronized (bil.class) {
                bilVar = c;
                if (bilVar == null) {
                    Class cls2 = bij.a;
                    bil bilVar2 = null;
                    if (cls2 != null) {
                        try {
                            bilVar2 = (bil) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (bilVar2 == null) {
                        bilVar2 = a;
                    }
                    c = bilVar2;
                    bilVar = bilVar2;
                }
            }
        }
        return bilVar;
    }

    public final acw b(bji bjiVar, int i) {
        return (acw) this.d.get(new bik(bjiVar, i));
    }

    public bil(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
