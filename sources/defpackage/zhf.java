package defpackage;

import com.google.android.libraries.blocks.StatusException;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zhf {
    public static final Pattern a = Pattern.compile("[0-9a-zA-Z._$]+@[0-9a-f]+$");
    public static final Pattern b = Pattern.compile("[\\.$]");
    private static final Map c;
    private static final agkj d;

    static {
        HashMap map = new HashMap();
        map.put("IllegalArgument", "IA");
        map.put("IllegalState", "IS");
        map.put("NullPointer", "NP");
        map.put("Execution", "Ex");
        map.put("Network", "N");
        map.put("Exception", "E");
        map.put("VirtualMachine", "VM");
        map.put("Error", "Er");
        map.put("DataSource", "DSo");
        map.put("DataSink", "DSi");
        map.put("Interrupted", "Ir");
        map.put("jdk.internal.reflect.NativeMethodAccessorImpl.invoke", "jdk.refl");
        map.put("sun.reflect.NativeMethodAccessorImpl.invoke", "sun.refl");
        map.put("com.google.android.libraries.youtube", "yt");
        map.put("com.google.common.util", "cgcu");
        map.put("com.google.android.exoplayer", "exo");
        map.put("concurrent.AbstractFuture", "cAF");
        map.put("java.util.concurrent.Future", "Futu");
        map.put("native_", "n_");
        map.put("android.media.MediaCodec", "MC");
        c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("org.chromium.net.impl", "ocni");
        map2.put("NetworkExceptionImpl", "NEI");
        map2.put("Exception in CronetUrlRequest: ", "");
        map2.put("net::ERR_INTERNET_DISCONNECTED", "NetDisc");
        map2.put("ErrorCode", "code");
        map2.put("Internal", "int");
        d = agkj.h(map2);
    }

    public static String a(Throwable th, boolean z, int i) {
        return b(th, z, i, zhl.a);
    }

    public static String b(Throwable th, boolean z, int i, int i2) {
        if (th == null) {
            return "";
        }
        zhd zhdVarH = h(th);
        StringBuilder sb = new StringBuilder(zhdVarH.d());
        sb.append('.');
        sb.append(e(zhdVarH.c()));
        sb.append(';');
        sb.append(zhdVarH.e());
        sb.append('.');
        sb.append(zhdVarH.g(0, zhl.b, ":"));
        int iH = zhdVarH.h();
        String strF = z ? zhdVarH.f() : null;
        boolean z2 = true;
        while (th.getCause() != null && th.getCause() != th && i > 0) {
            th = th.getCause();
            zhd zhdVarH2 = h(th);
            if (z) {
                z2 = z2 && zhdVarH2.h() == iH;
                if (z2) {
                    strF = zhdVarH2.f();
                }
            }
            sb.append(';');
            sb.append(zhdVarH2.a());
            sb.append('.');
            sb.append(e(zhdVarH2.c()));
            sb.append(';');
            sb.append(zhdVarH2.b());
            sb.append('.');
            sb.append(zhdVarH2.g(0, zhl.c, ":"));
            i--;
        }
        if (z && strF != null && strF.length() > 0) {
            agqr it = d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (strF.contains(str)) {
                    strF = strF.replace(str, (CharSequence) entry.getValue());
                }
            }
            String strD = zic.d(strF, zhl.ek());
            sb.append(";m.");
            sb.append(strD);
        }
        return f(sb.toString(), i2);
    }

    public static String c(Throwable th, int i, int i2, String str) {
        return h(th).g(i, i2, str);
    }

    public static String d() {
        return f("s.".concat(c(new Exception(), 1, 30, "-")), zhl.a);
    }

    public static String e(String str) {
        for (Map.Entry entry : c.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str.contains(str2)) {
                str = str.replace(str2, (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    public static String f(String str, int i) {
        return str.length() > i ? str.substring(0, i) : str;
    }

    public static String g(Throwable th) {
        return b(th, false, 0, zhl.a);
    }

    private static zhd h(Throwable th) {
        if (th instanceof StatusException) {
            StatusException statusException = (StatusException) th;
            asjd asjdVar = statusException.a;
            asja asjaVar = null;
            if (asjdVar != null) {
                aiie aiieVar = asjdVar.c;
                int size = aiieVar.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    asjc asjcVar = (asjc) aiieVar.get(size);
                    int i = asjcVar.b;
                    if (i == 1) {
                        if (i != 1) {
                            asjaVar = asja.a;
                            break;
                        }
                        asjaVar = (asja) asjcVar.c;
                        break;
                    }
                }
            }
            if (asjaVar != null) {
                return new zhe(asjaVar, 0);
            }
            statusException.getStackTrace();
        }
        return new zhe(th, 1);
    }
}
