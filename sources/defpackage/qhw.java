package defpackage;

import android.content.Context;
import android.os.Debug;
import android.os.StrictMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhw {
    public static final /* synthetic */ int f = 0;
    public final awmd a;
    public final Context b;
    public final awmd c;
    public final awmd d;
    public final oml e;

    static {
        aguu.al(new jxp(11));
    }

    public qhw(final awmd awmdVar, Context context, awmd awmdVar2, final awmd awmdVar3, awmd awmdVar4, oml omlVar) {
        this.e = omlVar;
        awmdVar.getClass();
        final agfr agfrVarAl = aguu.al(new qhs(awmdVar, 0));
        this.a = new awmd() { // from class: qht
            @Override // defpackage.awmd, defpackage.awmc
            public final Object io() {
                int i = qhw.f;
                return (qhh) (((Boolean) awmdVar3.io()).booleanValue() ? agfrVarAl.io() : awmdVar.io());
            }
        };
        this.b = context;
        this.c = awmdVar2;
        this.d = awmdVar4;
    }

    public static /* synthetic */ agev a() {
        try {
            return agev.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", (char) 144, "MemoryUsageCapture.java")).t("MemoryInfo.getOtherPss(which) failure");
            return agdf.a;
        } catch (NoSuchMethodException unused) {
            return agdf.a;
        } catch (Exception e2) {
            e = e2;
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", (char) 144, "MemoryUsageCapture.java")).t("MemoryInfo.getOtherPss(which) failure");
            return agdf.a;
        }
    }

    public static Long b(String str) {
        if (ahno.aa(str)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(str.trim()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Long c(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String strGroup = matcher.group(1);
            aguu.ak(strGroup);
            return Long.valueOf(Long.parseLong(strGroup));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final String d(String str, String str2, boolean z) {
        String str3;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                File file = new File(String.format("/proc/%s/%s", str, str2));
                Charset charsetDefaultCharset = Charset.defaultCharset();
                ahng ahngVar = new ahng();
                charsetDefaultCharset.getClass();
                str3 = new String(agyn.b(file, ahngVar), charsetDefaultCharset);
            } catch (IOException e) {
                str3 = null;
                if (!z) {
                    ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "readProcFileToString", 353, "MemoryUsageCapture.java")).w("Error reading proc %s", new qdv(str2));
                } else if (!(e instanceof FileNotFoundException)) {
                    ((agrc) ((agrc) ((agrc) ((agrc) qcq.a.c()).g(1, TimeUnit.MINUTES)).j(e)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "readProcFileToString", 349, "MemoryUsageCapture.java")).w("Error reading dmabuf proc %s", new qdv(str2));
                }
            }
            return str3;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
