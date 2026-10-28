package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvl {
    public static final Object a = new Object();
    public static final Map b = new HashMap(4);
    public static final Map c = new HashMap(4);
    public static final WeakHashMap d = new WeakHashMap();
    private static final WeakHashMap e = new WeakHashMap();
    private static fvk f;

    public static void a(Context context, Map map) {
        map.remove(context);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Context baseContext = (Context) ((Map.Entry) it.next()).getKey();
            Context baseContext2 = context;
            while (baseContext2 instanceof ContextWrapper) {
                baseContext2 = ((ContextWrapper) baseContext2).getBaseContext();
            }
            while (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (baseContext == baseContext2) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:6:0x000a, B:8:0x0014, B:10:0x0020, B:12:0x0022, B:14:0x002a, B:16:0x002e, B:17:0x0040, B:18:0x0048, B:20:0x0054, B:21:0x005c), top: B:27:0x000a }] */
    public static fvj b(Context context, fvm fvmVar) {
        Object objB;
        fvj fvjVar = null;
        if (!fvmVar.ac()) {
            synchronized (a) {
                Map map = b;
                Map map2 = (Map) map.get(context);
                if (map2 == null) {
                    if (!d.containsKey(hmy.b(context))) {
                        if (!e.containsKey(context) && f == null) {
                            f = new fvk();
                            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f);
                        }
                        map2 = new HashMap();
                        map.put(context, map2);
                        objB = fvmVar.B();
                        fvjVar = (fvj) map2.get(objB);
                        if (fvjVar == null) {
                            fvj fvjVarW = fvmVar.w();
                            map2.put(objB, fvjVarW);
                            fvjVar = fvjVarW;
                        }
                    }
                } else {
                    objB = fvmVar.B();
                    fvjVar = (fvj) map2.get(objB);
                    if (fvjVar == null) {
                        fvj fvjVarW2 = fvmVar.w();
                        map2.put(objB, fvjVarW2);
                        fvjVar = fvjVarW2;
                    }
                }
            }
        }
        return fvjVar;
    }
}
