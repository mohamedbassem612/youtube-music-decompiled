package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qol {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        c = new String[]{"media", (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        r1 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.AssetFileDescriptor a(android.content.Context r3, android.net.Uri r4, java.lang.String r5, defpackage.qok r6) {
        /*
            android.content.ContentResolver r0 = r3.getContentResolver()
            android.net.Uri r4 = e(r4)
            java.lang.String r1 = r4.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L19
            android.content.res.AssetFileDescriptor r3 = r0.openAssetFileDescriptor(r4, r5)
            return r3
        L19:
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L91
            int r1 = r5.hashCode()
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L6c
            r2 = 119(0x77, float:1.67E-43)
            if (r1 == r2) goto L62
            r2 = 3653(0xe45, float:5.119E-42)
            if (r1 == r2) goto L59
            r2 = 3786(0xeca, float:5.305E-42)
            if (r1 == r2) goto L50
            r2 = 3805(0xedd, float:5.332E-42)
            if (r1 == r2) goto L47
            r2 = 113359(0x1bacf, float:1.5885E-40)
            if (r1 != r2) goto L8b
            java.lang.String r1 = "rwt"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L8b
            goto L6a
        L47:
            java.lang.String r1 = "wt"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L8b
            goto L6a
        L50:
            java.lang.String r1 = "wa"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L8b
            goto L6a
        L59:
            java.lang.String r1 = "rw"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L8b
            goto L6a
        L62:
            java.lang.String r1 = "w"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L8b
        L6a:
            r1 = 2
            goto L75
        L6c:
            java.lang.String r1 = "r"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L8b
            r1 = 1
        L75:
            boolean r3 = k(r3, r4, r1, r6)
            if (r3 == 0) goto L83
            android.content.res.AssetFileDescriptor r3 = r0.openAssetFileDescriptor(r4, r5)
            m(r3)
            goto La8
        L83:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Can't open content uri."
            r3.<init>(r4)
            throw r3
        L8b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L91:
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lbd
            android.content.res.AssetFileDescriptor r5 = r0.openAssetFileDescriptor(r4, r5)
            m(r5)
            android.os.ParcelFileDescriptor r0 = r5.getParcelFileDescriptor()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lb8
            j(r3, r0, r4, r6)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lb8
            r3 = r5
        La8:
            return r3
        La9:
            r3 = move-exception
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r6 = "Validation failed."
            r4.<init>(r6)
            r4.initCause(r3)
            h(r5, r4)
            throw r4
        Lb8:
            r3 = move-exception
            h(r5, r3)
            throw r3
        Lbd:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Unsupported scheme"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qol.a(android.content.Context, android.net.Uri, java.lang.String, qok):android.content.res.AssetFileDescriptor");
    }

    public static InputStream b(Context context, Uri uri) {
        return c(context, uri, qok.a);
    }

    public static InputStream c(Context context, Uri uri, qok qokVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriE = e(uri);
        String scheme = uriE.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uriE);
        }
        if ("content".equals(scheme)) {
            if (!k(context, uriE, 1, qokVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriE);
            m(inputStreamOpenInputStream);
            return inputStreamOpenInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uriE.getPath()).getCanonicalFile()), "r");
            try {
                j(context, parcelFileDescriptorOpenFileDescriptor, uriE, qokVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (FileNotFoundException e) {
                i(parcelFileDescriptorOpenFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                i(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    public static OutputStream d(Context context, Uri uri, String str, qok qokVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorA = a(context, uri, str, qokVar);
        if (assetFileDescriptorA == null) {
            return null;
        }
        try {
            return assetFileDescriptorA.createOutputStream();
        } catch (IOException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Unable to create stream");
            fileNotFoundException.initCause(e);
            h(assetFileDescriptorA, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    private static Uri e(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static String f(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void g(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static void h(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void i(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        r8 = r7.createDeviceProtectedStorageContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r8 = r8.getDataDir();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r9.startsWith(f(r8)) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r8 = l(new defpackage.qoh(r7, r1));
        r0 = r8.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r2 >= r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        r5 = r8[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r5 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r9.startsWith(f(r5)) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r7 = l(new defpackage.qoh(r7, r3));
        r8 = r7.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        if (r0 >= r8) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        r2 = r7[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        if (r2 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if (r9.startsWith(f(r2)) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(android.content.Context r7, android.os.ParcelFileDescriptor r8, android.net.Uri r9, defpackage.qok r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qol.j(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, qok):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f A[PHI: r0 r1
      0x002f: PHI (r0v1 java.lang.String) = (r0v0 java.lang.String), (r0v3 java.lang.String) binds: [B:3:0x000e, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r1v2 android.content.pm.ProviderInfo) = (r1v1 android.content.pm.ProviderInfo), (r1v3 android.content.pm.ProviderInfo) binds: [B:3:0x000e, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[LOOP:1: B:32:0x0088->B:35:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[LOOP:2: B:37:0x0099->B:40:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:12:0x003f->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private static boolean k(Context context, Uri uri, int i, qok qokVar) {
        tld tldVar;
        agke agkeVar;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int i6;
        String[] strArr2;
        int i7;
        String[] strArr3;
        int i8;
        String str;
        int iA;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider != null) {
            tldVar = new tld(uri, providerInfoResolveContentProvider, (char[]) null);
            qok qokVar2 = qok.a;
            agkeVar = qokVar.e;
            i2 = ((agpi) agkeVar).d;
            i3 = 0;
            while (true) {
                if (i3 < i2) {
                    i4 = 3;
                    break;
                }
                iA = ((qom) agkeVar.get(i3)).a(context, tldVar, qokVar.c) - 1;
                i3++;
                if (iA != 0) {
                    i4 = 1;
                    break;
                }
                if (iA == 1) {
                    i4 = 2;
                    break;
                }
            }
            i5 = i4 - 1;
            if (i5 != 0) {
                if (i5 != 1) {
                    return false;
                }
                if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
                    return qokVar.c;
                }
                if (!qokVar.c) {
                    return false;
                }
                if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && providerInfoResolveContentProvider.exported) {
                    strArr = c;
                    int length = strArr.length;
                    for (i6 = 0; i6 < 2; i6++) {
                        if (!strArr[i6].equals(authority)) {
                        }
                    }
                    strArr2 = d;
                    int length2 = strArr2.length;
                    for (i7 = 0; i7 < 3; i7++) {
                        if (!strArr2[i7].equals(authority)) {
                        }
                    }
                    strArr3 = b;
                    for (i8 = 0; i8 < 7; i8++) {
                        str = strArr3[i8];
                        if (str.charAt(str.length() - 1) == '.') {
                            if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                                return false;
                            }
                        } else if (!providerInfoResolveContentProvider.packageName.equals(str)) {
                            return false;
                        }
                    }
                }
            }
        } else {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                qok qokVar3 = qok.a;
                if (qokVar.c) {
                    return false;
                }
            } else {
                tldVar = new tld(uri, providerInfoResolveContentProvider, (char[]) null);
                qok qokVar4 = qok.a;
                agkeVar = qokVar.e;
                i2 = ((agpi) agkeVar).d;
                i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        i4 = 3;
                        break;
                    }
                    iA = ((qom) agkeVar.get(i3)).a(context, tldVar, qokVar.c) - 1;
                    i3++;
                    if (iA != 0) {
                        i4 = 1;
                        break;
                    }
                    if (iA == 1) {
                        i4 = 2;
                        break;
                    }
                }
                i5 = i4 - 1;
                if (i5 != 0) {
                    if (i5 != 1) {
                        return false;
                    }
                    if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
                        return qokVar.c;
                    }
                    if (!qokVar.c) {
                        return false;
                    }
                    if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0) {
                        strArr = c;
                        int length3 = strArr.length;
                        while (i6 < 2) {
                            if (!strArr[i6].equals(authority)) {
                            }
                        }
                        strArr2 = d;
                        int length4 = strArr2.length;
                        while (i7 < 3) {
                            if (!strArr2[i7].equals(authority)) {
                            }
                        }
                        strArr3 = b;
                        while (i8 < 7) {
                            str = strArr3[i8];
                            if (str.charAt(str.length() - 1) == '.') {
                                if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                                    return false;
                                }
                            } else if (!providerInfoResolveContentProvider.packageName.equals(str)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static File[] l(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void m(Object obj) throws FileNotFoundException {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }
}
