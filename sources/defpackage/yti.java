package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yti {
    public static final agkz a = agpr.a;

    static {
        new ager(",");
    }

    public static String a(String str) {
        return (str.equals("redirector.googlevideo.com") || !str.endsWith(".googlevideo.com") || str.endsWith(".a1.googlevideo.com")) ? str : str.replaceFirst(".googlevideo.com", ".a1.googlevideo.com");
    }

    public static void b(String str) {
        Exception exc = new Exception();
        zvp.f(zvn.a, zvm.i, str + " [sample rate: " + String.format(Locale.ENGLISH, "%.2f", Double.valueOf(0.01d)) + ']', exc, 0.01d);
        zhr.c(zhq.ONESIE, exc, "Warning message: %s", str);
    }

    public static xpl c(vyo vyoVar, vxu vxuVar, mbc mbcVar) throws ytg {
        long j = vyoVar.d.f.b;
        long epochMilli = mbcVar.f().toEpochMilli() - j;
        anew anewVar = vyoVar.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        aojp aojpVar = anewVar.c;
        if (aojpVar == null) {
            aojpVar = aojp.a;
        }
        if ((aojpVar.b & 1) != 0) {
            aojp aojpVar2 = anewVar.c;
            if (((aojpVar2 == null ? aojp.a : aojpVar2).b & 2) != 0) {
                if (aojpVar2 == null) {
                    aojpVar2 = aojp.a;
                }
                if (aojpVar2.e > 0) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    aojp aojpVar3 = anewVar.c;
                    if (aojpVar3 == null) {
                        aojpVar3 = aojp.a;
                    }
                    long millis = timeUnit.toMillis(aojpVar3.e);
                    if (j < 0 || epochMilli >= millis) {
                        throw new ytg(2);
                    }
                    aojp aojpVar4 = anewVar.c;
                    if (aojpVar4 == null) {
                        aojpVar4 = aojp.a;
                    }
                    byte[] bArrG = aojpVar4.c.G();
                    aojp aojpVar5 = anewVar.c;
                    if (aojpVar5 == null) {
                        aojpVar5 = aojp.a;
                    }
                    return new xpl(bArrG, aojpVar5.d.G(), (char[]) null);
                }
            }
        }
        anhb anhbVar = vxuVar.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        vxuVar.d();
        long j2 = vxuVar.b.g.c;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long epochMilli2 = mbcVar.f().toEpochMilli() - j2;
        TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
        long j3 = epochMilli2 / 1000;
        if ((anhbVar.b & 536870912) == 0) {
            throw new ytg(1);
        }
        aojm aojmVar = anhbVar.n;
        if (aojmVar == null) {
            aojmVar = aojm.b;
        }
        if (j3 < 0 || j3 > aojmVar.e) {
            throw new ytg(2);
        }
        return new xpl(aojmVar.c.G(), aojmVar.d.G(), (char[]) null);
    }
}
