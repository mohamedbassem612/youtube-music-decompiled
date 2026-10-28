package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aalf {
    private static final agrf i = agrf.h("com/google/android/libraries/youtube/offline/filesystem/DefaultOfflineFileStore");
    public final Context a;
    public final String b;
    public final File c;
    public final aauk d;
    public File e;
    public final tqa f;
    public aada g;
    public final aaqg h;
    private final txp j;
    private final adhv k;
    private final acaq l;
    private final awmd m;
    private final aerv n;
    private File o;
    private File p;
    private File q;
    private final vxu r;

    public aalf(Context context, String str, txp txpVar, adhv adhvVar, acaq acaqVar, tqa tqaVar, vxu vxuVar, aaqg aaqgVar, awmd awmdVar, aerv aervVar, aauk aaukVar) {
        File file = new File(aalg.b(context, str), "data");
        this.a = context;
        this.b = str;
        this.j = txpVar;
        this.k = adhvVar;
        this.l = acaqVar;
        this.f = tqaVar;
        this.r = vxuVar;
        this.h = aaqgVar;
        this.m = awmdVar;
        this.n = aervVar;
        this.c = file;
        this.d = aaukVar;
    }

    private final File A(boolean z, String str) {
        if (z) {
            File fileD = D(this.a, this.b, this.h, this.d);
            if (fileD != null) {
                return new File(fileD, "streams");
            }
        } else {
            File fileE = E(this.f, str, this.b, this.h);
            if (fileE != null) {
                return new File(fileE, "streams");
            }
        }
        return null;
    }

    private static void B(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                C(file);
                file.delete();
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) i.c()).j(e)).k("com/google/android/libraries/youtube/offline/filesystem/DefaultOfflineFileStore", "deleteDirectory", (char) 548, "DefaultOfflineFileStore.java")).w("[Offline] Failed to delete directory %s", file.getAbsolutePath());
            }
        }
    }

    @Deprecated
    private static void C(File file) throws IOException {
        if (!file.isDirectory()) {
            ((agrc) ((agrc) i.c()).k("com/google/android/libraries/youtube/offline/filesystem/DefaultOfflineFileStore", "deleteDirectoryContents", 1048, "DefaultOfflineFileStore.java")).t("[Offline] Failed to delete directory since the directory file is null or it is not a directory ");
            return;
        }
        if (file.getCanonicalPath().equals(file.getAbsolutePath())) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("Error listing files for ".concat(file.toString()));
            }
            for (File file2 : fileArrListFiles) {
                file2.getClass();
                if (file2.isDirectory()) {
                    C(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("Failed to delete ".concat(file2.toString()));
                }
            }
        }
    }

    private static File D(Context context, String str, aaqg aaqgVar, aauk aaukVar) {
        File externalFilesDir;
        context.getClass();
        int i2 = typ.a;
        if (ahno.aa(str)) {
            throw new IllegalArgumentException();
        }
        try {
            if (aaukVar.I()) {
                externalFilesDir = context.getExternalFilesDir(null);
            } else {
                File[] externalFilesDirs = context.getExternalFilesDirs(null);
                if (externalFilesDirs == null || externalFilesDirs.length == 0) {
                    return null;
                }
                externalFilesDir = externalFilesDirs[0];
            }
            if (externalFilesDir == null) {
                return null;
            }
            File file = new File(externalFilesDir, "offline" + File.separator + str);
            if (file.exists()) {
                return file;
            }
            return new File(externalFilesDir, "offline" + File.separator + aaqgVar.t(str));
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static File E(tqa tqaVar, String str, String str2, aaqg aaqgVar) {
        tqaVar.getClass();
        typ.f(str2);
        if (!tqaVar.g(str)) {
            return null;
        }
        File file = new File(tqaVar.a(str), "offline" + File.separator + str2);
        if (!file.exists()) {
            file = new File(tqaVar.a(str), "offline" + File.separator + aaqgVar.t(str2));
        }
        return file;
    }

    private static final File F(File file, Uri uri) {
        uri.getClass();
        return new File(file, r(uri.toString()));
    }

    public static final String r(String str) {
        str.getClass();
        int iLastIndexOf = str.lastIndexOf(File.separator);
        if (str.startsWith("file") && iLastIndexOf >= 0 && iLastIndexOf < str.length() - 1) {
            return str.substring(iLastIndexOf + 1);
        }
        int iLastIndexOf2 = str.lastIndexOf(46);
        String strSubstring = (iLastIndexOf2 <= 0 || iLastIndexOf2 <= iLastIndexOf || iLastIndexOf2 == str.length() + (-1)) ? "" : str.substring(iLastIndexOf2);
        return str.hashCode() + strSubstring;
    }

    public static final boolean s(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.delete();
        }
        return true;
    }

    public static void t(Context context, tqa tqaVar, String str, aaqg aaqgVar, aauk aaukVar) {
        B(aalg.b(context, str));
        B(D(context, str, aaqgVar, aaukVar));
        for (Map.Entry entry : tqaVar.e().entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                B(E(tqaVar, (String) entry.getKey(), str, aaqgVar));
            }
        }
    }

    private final File y(String str) {
        return new File(a(str), "thumbnails");
    }

    private final File z(String str) {
        typ.f(str);
        return new File(c(str), "thumbnails");
    }

    public final File a(String str) {
        if (this.o == null) {
            this.o = new File(this.c, "channels");
        }
        return new File(this.o, str);
    }

    public final File b(String str, Uri uri) {
        return F(y(str), uri);
    }

    public final File c(String str) {
        if (this.q == null) {
            this.q = new File(this.c, "playlists");
        }
        return new File(this.q, str);
    }

    public final File d(String str, Uri uri) {
        return F(z(str), uri);
    }

    public final File e(String str, Uri uri) {
        return F(i(str), uri);
    }

    public final File f(String str) {
        typ.f(str);
        if (this.p == null) {
            this.p = new File(this.c, "videos");
        }
        return new File(this.p, str);
    }

    public final File g(String str) {
        return new File(f(str), "thumbnails");
    }

    public final File h(String str, Uri uri) {
        return F(g(str), uri);
    }

    public final File i(String str) {
        return new File(f(str), "tmpthumbnails");
    }

    public final File j(boolean z, String str) {
        File fileA;
        try {
            if (z) {
                boolean zI = this.d.I();
                Context context = this.a;
                if (zI) {
                    fileA = context.getExternalFilesDir(null);
                } else {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs == null || externalFilesDirs.length == 0) {
                        return null;
                    }
                    fileA = externalFilesDirs[0];
                }
            } else {
                fileA = this.f.a(str);
            }
            if (fileA == null) {
                o(z, "MIGRATION_ERROR_OUT");
                return null;
            }
            String str2 = this.b;
            File file = new File(fileA, "offline" + File.separator + str2);
            aaqg aaqgVar = this.h;
            String strT = aaqgVar.t(str2);
            boolean zEquals = strT.equals(str2);
            if (!file.exists()) {
                if (!zEquals || aaqgVar.C(str2, this.j.a())) {
                    return A(z, str);
                }
                o(z, "MIGRATION_ERROR_OUT");
                return null;
            }
            o(z, "MIGRATION_INITIALIZED");
            if (zEquals) {
                strT = this.j.a();
                if (!aaqgVar.C(str2, strT)) {
                    o(z, "MIGRATION_IDENTITY_NONCE_MAPPING_FAILED");
                    return A(z, str);
                }
            }
            try {
                if (file.renameTo(new File(fileA, "offline" + File.separator + strT))) {
                    o(z, "MIGRATION_RENAME_SUCCESS");
                } else {
                    o(z, "MIGRATION_RENAME_FAILED");
                }
            } catch (NullPointerException unused) {
                o(z, "MIGRATION_RENAME_NULL_POINTER_EXCEPTION");
            } catch (SecurityException unused2) {
                o(z, "MIGRATION_RENAME_SECURITY_EXCEPTION");
            }
            return A(z, str);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused3) {
            return null;
        }
    }

    public final String k(String str, acca accaVar) {
        typ.f(str);
        accaVar.getClass();
        taq.c();
        sxv sxvVarC = sxv.c();
        this.l.b(new acap(accaVar), sxvVarC);
        File file = new File(new File(f(str), "subtitles"), accaVar.a + '_' + accaVar.hashCode());
        agyo.b(file);
        agyo.d((byte[]) sxvVarC.get(), file);
        return file.getAbsolutePath();
    }

    public final void l(File file) {
        if (file.exists() && file.isDirectory()) {
            try {
                C(file);
                file.delete();
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) i.c()).j(e)).k("com/google/android/libraries/youtube/offline/filesystem/DefaultOfflineFileStore", "deleteDir", (char) 563, "DefaultOfflineFileStore.java")).w("[Offline] Failed to delete directory %s", file);
            }
        }
    }

    public final void m(String str) {
        l(z(str));
    }

    public final void n(Uri uri, File file) throws IOException {
        aauk aaukVar = this.d;
        String scheme = uri.getScheme();
        if (aaukVar.b.m(14, 45365105L) && scheme != null && ahno.ag("http", scheme)) {
            uri = uri.buildUpon().scheme("https").build();
        }
        if ("file".equals(scheme)) {
            return;
        }
        agyo.b(file);
        awmd awmdVar = this.m;
        sxv sxvVarC = sxv.c();
        ((zyh) awmdVar.io()).a(uri, sxvVarC);
        long jLongValue = ((Long) sxvVarC.get()).longValue();
        File parentFile = file.getParentFile();
        if (parentFile == null || nsj.e(this.r.c(), parentFile) < jLongValue) {
            throw new aarr(file.length());
        }
        adhv adhvVar = this.k;
        sxv sxvVarC2 = sxv.c();
        adhvVar.m(uri, sxvVarC2);
        try {
            byte[] bArr = (byte[]) sxvVarC2.get(30L, TimeUnit.SECONDS);
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (TimeoutException e) {
            throw new yoa(e);
        }
    }

    protected final void o(boolean z, String str) {
        aerv aervVar = this.n;
        if (aervVar != null) {
            ((qtf) aervVar.r.io()).b(1L, true != z ? "MIGRATION_LOCATION_SDCARD" : "MIGRATION_LOCATION_PRIMARY", str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    public final void p(aamh aamhVar) throws IOException {
        aqmh aqmhVar;
        taq.c();
        aofu aofuVar = aamhVar.h;
        if (aofuVar != null) {
            if ((aofuVar.b & 4) != 0) {
                aqmhVar = aofuVar.d;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
            } else {
                aqmhVar = null;
            }
            if (aqmhVar != null) {
                for (wgg wggVar : new abuz(aajg.f(aqmhVar, agke.q(480))).b) {
                    n(wggVar.a(), d(aamhVar.a, wggVar.a()));
                }
            }
        }
    }

    public final boolean q() {
        aaqg aaqgVar = this.h;
        if (!aaqgVar.n()) {
            return false;
        }
        tqa tqaVar = this.f;
        return tqaVar.g(aaqgVar.D(tqaVar));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public final abuz u(String str, abuz abuzVar) {
        ArrayList arrayList = new ArrayList();
        for (wgg wggVar : abuzVar.b) {
            File fileB = b(str, wggVar.a());
            if (fileB.exists()) {
                arrayList.add(new wgg(Uri.fromFile(fileB), wggVar.a, wggVar.b));
            }
        }
        return new abuz((List) arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public final abuz v(String str, abuz abuzVar) {
        ArrayList arrayList = new ArrayList();
        for (wgg wggVar : abuzVar.b) {
            File fileD = d(str, wggVar.a());
            if (fileD.exists()) {
                arrayList.add(new wgg(Uri.fromFile(fileD), wggVar.a, wggVar.b));
            }
        }
        abuz abuzVar2 = new abuz((List) arrayList);
        return !abuzVar2.b.isEmpty() ? abuzVar2 : abuzVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public final abuz w(String str, abuz abuzVar) {
        ArrayList arrayList = new ArrayList();
        for (wgg wggVar : abuzVar.b) {
            File fileH = h(str, wggVar.a());
            if (fileH.exists()) {
                arrayList.add(new wgg(Uri.fromFile(fileH), wggVar.a, wggVar.b));
            }
        }
        abuz abuzVar2 = new abuz((List) arrayList);
        return !abuzVar2.b.isEmpty() ? abuzVar2 : abuzVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final void x(aaok aaokVar) throws IOException {
        taq.c();
        aodw aodwVar = (aodw) aaokVar.a;
        aodv aodvVar = aodwVar.c;
        if (aodvVar == null) {
            aodvVar = aodv.a;
        }
        aqmh aqmhVar = aodvVar.d;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        String str = (String) aaokVar.b;
        if (u(str, new abuz(aqmhVar)).b.isEmpty()) {
            typ.f(str);
            l(y(str));
            taq.c();
            aodv aodvVar2 = aodwVar.c;
            if (aodvVar2 == null) {
                aodvVar2 = aodv.a;
            }
            aqmh aqmhVar2 = aodvVar2.d;
            if (aqmhVar2 == null) {
                aqmhVar2 = aqmh.a;
            }
            for (wgg wggVar : new abuz(aajg.f(aqmhVar2, agke.q(240))).b) {
                n(wggVar.a(), b(str, wggVar.a()));
            }
        }
    }
}
