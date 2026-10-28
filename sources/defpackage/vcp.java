package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcp {
    public static final long a;
    public final Context b;
    public final ahbw c;
    public final Executor d;
    public final Executor e;
    public final vxz f;
    public final ayq g;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 604800000L;
    }

    public vcp(Context context, ayq ayqVar, ahbw ahbwVar, vxz vxzVar, Executor executor, Executor executor2) {
        context.getClass();
        ahbwVar.getClass();
        executor.getClass();
        executor2.getClass();
        this.b = context;
        this.g = ayqVar;
        this.c = ahbwVar;
        this.f = vxzVar;
        this.d = executor;
        this.e = executor2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final Uri a(aneh anehVar) {
        int i;
        String str;
        akhb akhbVar = (anehVar.b == 1 ? (apgo) anehVar.c : apgo.a).c;
        if (akhbVar == null) {
            akhbVar = akhb.a;
        }
        akhbVar.getClass();
        if (this.f.l(575, 45825842L, false)) {
            String str2 = akhbVar.f;
            str2.getClass();
            if (str2.length() > 0) {
                str = akhbVar.f;
            } else {
                i = akhbVar.b;
                if (i == 2) {
                    return null;
                }
                if (i == 2) {
                    str = (String) akhbVar.c;
                } else {
                    str = "";
                }
            }
        } else {
            i = akhbVar.b;
            if (i == 2) {
                return null;
            }
            if (i == 2) {
                str = (String) akhbVar.c;
            } else {
                str = "";
            }
        }
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        if (awrc.c(uri.getScheme(), "content") && awrc.c(uri.getAuthority(), "media")) {
            return uri;
        }
        return null;
    }
}
