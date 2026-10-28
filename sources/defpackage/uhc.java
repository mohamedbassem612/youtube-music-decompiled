package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhc {
    public static final Set a = atqq.aS(new String[]{"http", "https", "ftp"});
    public final Context b;
    public final Optional c;
    public final Optional d;
    public final ahex e;
    public final uhg f;
    private final awmi g;
    private final aaok h;

    public uhc(Context context, Optional optional, Optional optional2, ahex ahexVar, uhg uhgVar, aaok aaokVar) {
        context.getClass();
        ahexVar.getClass();
        aaokVar.getClass();
        this.b = context;
        this.c = optional;
        this.d = optional2;
        this.e = ahexVar;
        this.f = uhgVar;
        this.h = aaokVar;
        this.g = new awmp(new pbm(this, 6));
    }

    public static final File c(String str) {
        str.getClass();
        return new File(str);
    }

    public static final String d(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public final String a(String str) {
        if (awrc.n(str, "file://", true)) {
            String strSubstring = str.substring(7);
            strSubstring.getClass();
            return strSubstring;
        }
        if (!this.h.C() || !awrc.n(str, "file:", true)) {
            return str;
        }
        String strSubstring2 = str.substring(5);
        strSubstring2.getClass();
        return strSubstring2;
    }

    public final boolean b(String str) {
        String strD = d(c(a(str)));
        if (strD == null) {
            return false;
        }
        List<String> list = (List) this.g.a();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (awrc.c(strD, str2) || awrc.n(strD, String.valueOf(str2).concat("/"), false)) {
                return true;
            }
        }
        return false;
    }
}
