package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import j$.util.Optional;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhg {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/creation/common/provenance/ShortsC2paLogger");
    public final mbc a;
    public final Optional b;
    private final Context d;
    private final zvl e;

    public uhg(Context context, mbc mbcVar, zvl zvlVar, Optional optional) {
        context.getClass();
        mbcVar.getClass();
        zvlVar.getClass();
        this.d = context;
        this.a = mbcVar;
        this.e = zvlVar;
        this.b = optional;
    }

    public static final int c(CompositionProto$Composition compositionProto$Composition) {
        int size = 0;
        for (akcw akcwVar : compositionProto$Composition.c) {
            akcx akcxVar = akcwVar.f;
            if (akcxVar == null) {
                akcxVar = akcx.a;
            }
            aihl aihlVar = apbs.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            akcxVar.c(aihlVarCheckIsLite);
            if (akcxVar.j.n(aihlVarCheckIsLite.d)) {
                akcx akcxVar2 = akcwVar.f;
                if (akcxVar2 == null) {
                    akcxVar2 = akcx.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                akcxVar2.c(aihlVarCheckIsLite2);
                Object objK = akcxVar2.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                objC.getClass();
                size += ((apbs) objC).c.size();
            }
        }
        return size;
    }

    public static final int d(CompositionProto$Composition compositionProto$Composition) {
        int i = 0;
        for (akcw akcwVar : compositionProto$Composition.c) {
            int i2 = akcwVar.c;
            if (i2 == 3) {
                if (((i2 == 3 ? (amsy) akcwVar.d : amsy.a).b & 1) != 0) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final String e(String str) {
        if (!awrc.n(str, "file://", true)) {
            return str;
        }
        String strSubstring = str.substring(7);
        strSubstring.getClass();
        return strSubstring;
    }

    public final String a(String str) {
        Uri uri;
        String lowerCase;
        String strConcat;
        String str2;
        String name;
        String authority;
        String scheme;
        if (awrc.v(str)) {
            return "empty";
        }
        String canonicalPath = null;
        try {
            uri = Uri.parse(str);
            uri.getClass();
        } catch (Exception unused) {
            uri = null;
        }
        String str3 = "unknown";
        if (uri == null || (scheme = uri.getScheme()) == null) {
            lowerCase = "unknown";
        } else {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (awrc.c(lowerCase, "content")) {
            if (uri != null && (authority = uri.getAuthority()) != null) {
                str3 = authority;
            }
            return "content://".concat(String.valueOf(str3));
        }
        File file = new File(e(str));
        String name2 = file.getName();
        name2.getClass();
        String str4 = "";
        String lowerCase2 = awrc.t(name2, '.', "").toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        if (lowerCase2.length() == 0) {
            strConcat = "";
        } else {
            strConcat = awrc.n(lowerCase2, "c2pa_tmp_", false) ? ".c2pa_tmp" : ".".concat(lowerCase2);
        }
        try {
            canonicalPath = file.getCanonicalPath();
        } catch (Exception unused2) {
        }
        if (canonicalPath == null) {
            return "file://<invalid_path>".concat(strConcat);
        }
        String str5 = this.d.getApplicationInfo().dataDir;
        if (awrc.n(canonicalPath, "/system/", false)) {
            return "file://<system>/*".concat(strConcat);
        }
        if (awrc.n(canonicalPath, "/sys/", false)) {
            return "file://<sys>/*".concat(strConcat);
        }
        str5.getClass();
        if (awrc.n(canonicalPath, str5, false)) {
            File parentFile = file.getParentFile();
            if (parentFile != null && (name = parentFile.getName()) != null) {
                str4 = name;
            }
            return a.ca(strConcat, str4, "file://<app_data>/", "/*");
        }
        if (awrc.n(canonicalPath, "/data/", false)) {
            return "file://<data>/*".concat(strConcat);
        }
        if (awrc.n(canonicalPath, "/storage/", false) || awrc.n(canonicalPath, "/sdcard/", false)) {
            List listF = awrc.F(canonicalPath, new String[]{"/"});
            if (listF.size() > 5) {
                return "file://<storage>/" + listF.get(4) + "/*" + strConcat;
            }
            str2 = "file://<storage>/*";
        } else {
            str2 = "file://<other>/*";
        }
        return str2.concat(strConcat);
    }

    public final void b(String str, ajtv ajtvVar, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.d(str);
        zvjVarA.c(ajtvVar);
        zvjVarA.j = 40;
        zvjVarA.f(th);
        this.e.a(zvjVarA.a());
        ajtv ajtvVar2 = ajtv.ERROR_LEVEL_WARNING;
        agrf agrfVar = c;
        if (ajtvVar == ajtvVar2) {
            ((agrc) ((agrc) agrfVar.c()).j(th).k("com/google/android/libraries/youtube/creation/common/provenance/ShortsC2paLogger", "logCel", 187, "ShortsC2paLogger.kt")).w("%s", str);
        } else {
            ((agrc) ((agrc) agrfVar.b()).j(th).k("com/google/android/libraries/youtube/creation/common/provenance/ShortsC2paLogger", "logCel", 193, "ShortsC2paLogger.kt")).w("%s", str);
        }
    }
}
