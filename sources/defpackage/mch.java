package defpackage;

import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mch extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        boolean z;
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = mck.a;
        synchronized (weakHashMap) {
            Boolean bool = (Boolean) weakHashMap.remove(threadCurrentThread);
            z = true;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (!zBooleanValue) {
                }
                return Boolean.valueOf(z);
            }
        }
        ThreadLocal threadLocal = mci.a;
        if (!"Filter".equals(threadCurrentThread.getName()) && !"Feedback".equals(threadCurrentThread.getName())) {
            String name = threadCurrentThread.getName();
            if (!Objects.equals(name, "Instr: com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner") && (name == null || !name.startsWith("SimpleServer ConnectionThread "))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
