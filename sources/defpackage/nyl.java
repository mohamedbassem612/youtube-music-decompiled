package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nyl implements nvn {
    private final Object a;
    private final Method b;

    public nyl(Object obj, Method method) {
        this.a = obj;
        this.b = method;
    }

    @Override // defpackage.nvn
    public final synchronized void a() {
        try {
            this.b.invoke(this.a, 0);
        } catch (IllegalAccessException e) {
            Log.w("NativeMemoryAccountant", "Failed to register native allocations", e);
        } catch (InvocationTargetException e2) {
            Log.w("NativeMemoryAccountant", "Failed to register native allocations", e2);
        }
    }
}
