package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agts {
    public static final agtu a = a(agtu.d);

    private static agtu a(String[] strArr) {
        agud agudVar;
        try {
            agudVar = ague.a;
        } catch (NoClassDefFoundError unused) {
            agudVar = null;
        }
        if (agudVar != null) {
            return agudVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (agtu) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
