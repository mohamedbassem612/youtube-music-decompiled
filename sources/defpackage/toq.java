package defpackage;

import app.rive.semantics.SemanticState;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class toq implements tot {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/common/network/volley/cache/DefaultDiskLruCache");
    public final File a;
    public Writer c;
    public int e;
    private final File g;
    private final File h;
    private final long j;
    private final Executor m;
    private final boolean n;
    private long k = 0;
    final LinkedHashMap d = new LinkedHashMap(0, 0.75f, true);
    private long l = 0;
    private final Callable o = new rru(this, 4);
    private final int i = 539296001;
    public final int b = 1;

    public toq(File file, boolean z, Executor executor, long j) {
        this.a = file;
        this.g = new File(file, "journal");
        this.h = new File(file, "journal.tmp");
        this.j = j;
        if (z) {
            this.m = new ahfg(executor);
        } else {
            this.m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        this.n = z;
    }

    public static toq l(File file, boolean z, Executor executor, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        afvx afvxVarAd = tym.ad(tsb.DISK_LRU_CACHE_OPEN);
        try {
            toq toqVar = new toq(file, z, executor, j);
            File file2 = toqVar.g;
            if (file2.exists()) {
                try {
                    toqVar.r();
                    q(toqVar.h);
                    Iterator it = toqVar.d.values().iterator();
                    while (it.hasNext()) {
                        too tooVar = (too) it.next();
                        if (tooVar.d == null) {
                            for (int i = 0; i < toqVar.b; i = 1) {
                                toqVar.k += tooVar.b[0];
                            }
                        } else {
                            tooVar.d = null;
                            for (int i2 = 0; i2 < toqVar.b; i2 = 1) {
                                q(tooVar.b());
                                q(tooVar.c());
                            }
                            it.remove();
                        }
                    }
                    toqVar.c = new BufferedWriter(new FileWriter(file2, true), SemanticState.Multiline);
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) f.c()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/DefaultDiskLruCache", "open", 389, "DefaultDiskLruCache.java")).t("Disk cache journal is corrupt");
                    toqVar.g();
                    file.mkdirs();
                    toq toqVar2 = new toq(file, z, executor, j);
                    toqVar2.i();
                    toqVar = toqVar2;
                }
            } else {
                file.mkdirs();
                toq toqVar3 = new toq(file, z, executor, j);
                toqVar3.i();
                toqVar = toqVar3;
            }
            afvxVarAd.close();
            return toqVar;
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private final void n() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void o() {
        boolean z = this.n;
        Executor executor = this.m;
        if (z) {
            executor.execute(afwl.i(new szq(this, 7)));
        } else {
            ((ExecutorService) executor).submit(this.o);
        }
    }

    private static void p(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(String.valueOf(file))));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                p(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(String.valueOf(file2))));
            }
        }
    }

    private static void q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0156 A[Catch: EOFException -> 0x0266, all -> 0x029c, TryCatch #4 {EOFException -> 0x0266, blocks: (B:20:0x006d, B:23:0x0077, B:25:0x0080, B:28:0x008e, B:144:0x024d, B:29:0x0095, B:31:0x009f, B:32:0x00a7, B:34:0x00b1, B:36:0x00b5, B:38:0x00bd, B:40:0x00d9, B:43:0x00e1, B:45:0x00e4, B:47:0x00f1, B:48:0x00f5, B:49:0x00f6, B:50:0x00fa, B:39:0x00c4, B:51:0x00fb, B:54:0x0107, B:55:0x0110, B:58:0x011c, B:59:0x0125, B:60:0x0126, B:61:0x012f, B:62:0x0130, B:68:0x0149, B:93:0x0190, B:103:0x01a5, B:105:0x01ad, B:106:0x01b3, B:108:0x01bb, B:110:0x01c5, B:112:0x01ca, B:114:0x01ce, B:119:0x01dd, B:125:0x01f2, B:127:0x0204, B:128:0x020a, B:129:0x0213, B:130:0x0214, B:131:0x021d, B:132:0x021e, B:133:0x0229, B:134:0x0232, B:115:0x01d3, B:135:0x0233, B:141:0x0246, B:138:0x023d, B:140:0x0241, B:145:0x0252, B:146:0x025b, B:147:0x025c, B:148:0x0265, B:91:0x0188, B:73:0x0156, B:78:0x0163, B:84:0x0172, B:65:0x013b), top: B:166:0x006d, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0161 A[DONT_INVERT, PHI: r10
      0x0161: PHI (r10v4 char) = (r10v3 char), (r10v10 char) binds: [B:72:0x0154, B:76:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0163 A[Catch: EOFException -> 0x0266, all -> 0x029c, TryCatch #4 {EOFException -> 0x0266, blocks: (B:20:0x006d, B:23:0x0077, B:25:0x0080, B:28:0x008e, B:144:0x024d, B:29:0x0095, B:31:0x009f, B:32:0x00a7, B:34:0x00b1, B:36:0x00b5, B:38:0x00bd, B:40:0x00d9, B:43:0x00e1, B:45:0x00e4, B:47:0x00f1, B:48:0x00f5, B:49:0x00f6, B:50:0x00fa, B:39:0x00c4, B:51:0x00fb, B:54:0x0107, B:55:0x0110, B:58:0x011c, B:59:0x0125, B:60:0x0126, B:61:0x012f, B:62:0x0130, B:68:0x0149, B:93:0x0190, B:103:0x01a5, B:105:0x01ad, B:106:0x01b3, B:108:0x01bb, B:110:0x01c5, B:112:0x01ca, B:114:0x01ce, B:119:0x01dd, B:125:0x01f2, B:127:0x0204, B:128:0x020a, B:129:0x0213, B:130:0x0214, B:131:0x021d, B:132:0x021e, B:133:0x0229, B:134:0x0232, B:115:0x01d3, B:135:0x0233, B:141:0x0246, B:138:0x023d, B:140:0x0241, B:145:0x0252, B:146:0x025b, B:147:0x025c, B:148:0x0265, B:91:0x0188, B:73:0x0156, B:78:0x0163, B:84:0x0172, B:65:0x013b), top: B:166:0x006d, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x016b  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0172 A[Catch: EOFException -> 0x0266, all -> 0x029c, TryCatch #4 {EOFException -> 0x0266, blocks: (B:20:0x006d, B:23:0x0077, B:25:0x0080, B:28:0x008e, B:144:0x024d, B:29:0x0095, B:31:0x009f, B:32:0x00a7, B:34:0x00b1, B:36:0x00b5, B:38:0x00bd, B:40:0x00d9, B:43:0x00e1, B:45:0x00e4, B:47:0x00f1, B:48:0x00f5, B:49:0x00f6, B:50:0x00fa, B:39:0x00c4, B:51:0x00fb, B:54:0x0107, B:55:0x0110, B:58:0x011c, B:59:0x0125, B:60:0x0126, B:61:0x012f, B:62:0x0130, B:68:0x0149, B:93:0x0190, B:103:0x01a5, B:105:0x01ad, B:106:0x01b3, B:108:0x01bb, B:110:0x01c5, B:112:0x01ca, B:114:0x01ce, B:119:0x01dd, B:125:0x01f2, B:127:0x0204, B:128:0x020a, B:129:0x0213, B:130:0x0214, B:131:0x021d, B:132:0x021e, B:133:0x0229, B:134:0x0232, B:115:0x01d3, B:135:0x0233, B:141:0x0246, B:138:0x023d, B:140:0x0241, B:145:0x0252, B:146:0x025b, B:147:0x025c, B:148:0x0265, B:91:0x0188, B:73:0x0156, B:78:0x0163, B:84:0x0172, B:65:0x013b), top: B:166:0x006d, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void r() {
        Object[] objArr;
        char c;
        int i;
        ton tonVar;
        String[] strArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.g), SemanticState.Multiline);
        try {
            String strJ = tol.j(bufferedInputStream);
            String strJ2 = tol.j(bufferedInputStream);
            String strJ3 = tol.j(bufferedInputStream);
            String strJ4 = tol.j(bufferedInputStream);
            String strJ5 = tol.j(bufferedInputStream);
            if ("com.google.android.libraries.youtube.common.cache".equals(strJ) && "1".equals(strJ2) && Integer.toString(this.i).equals(strJ3)) {
                int i2 = this.b;
                if (Integer.toString(i2).equals(strJ4) && "".equals(strJ5)) {
                    tqj tqjVar = tqi.a;
                    boolean z = true;
                    int i3 = 0;
                    if (tqjVar != null) {
                        int i4 = tqr.a;
                        if (tqjVar.k(1073830524)) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                    } else {
                        objArr = false;
                    }
                    int i5 = 0;
                    while (true) {
                        try {
                            String strJ6 = tol.j(bufferedInputStream);
                            if (objArr == true) {
                                int i6 = 32;
                                int i7 = 6;
                                char cCharAt = strJ6.length() < 6 ? ' ' : strJ6.charAt(2);
                                if (cCharAt != 'E') {
                                    if (cCharAt != 'A') {
                                        if (cCharAt == 'R') {
                                            c = cCharAt;
                                        } else if (strJ6.startsWith("DIRTY ")) {
                                            i7 = 6;
                                        } else {
                                            c = 'R';
                                        }
                                        if (cCharAt == 'M' || !strJ6.startsWith("REMOVE ")) {
                                            cCharAt = c;
                                            i7 = 0;
                                        } else {
                                            char c2 = c;
                                            i7 = 7;
                                            cCharAt = c2;
                                        }
                                    } else if (strJ6.startsWith("READ ")) {
                                        i7 = 5;
                                    } else {
                                        cCharAt = 'A';
                                        if (cCharAt == 'R') {
                                            c = cCharAt;
                                        } else if (strJ6.startsWith("DIRTY ")) {
                                            i7 = 6;
                                        } else {
                                            c = 'R';
                                        }
                                        if (cCharAt == 'M') {
                                            cCharAt = c;
                                            i7 = 0;
                                        } else {
                                            cCharAt = c;
                                            i7 = 0;
                                        }
                                    }
                                } else if (strJ6.startsWith("CLEAN ")) {
                                    cCharAt = 'E';
                                } else {
                                    cCharAt = 'E';
                                    if (cCharAt != 'A') {
                                        if (cCharAt == 'R') {
                                            c = cCharAt;
                                        } else if (strJ6.startsWith("DIRTY ")) {
                                            i7 = 6;
                                        } else {
                                            c = 'R';
                                        }
                                        if (cCharAt == 'M') {
                                            cCharAt = c;
                                            i7 = 0;
                                        } else {
                                            cCharAt = c;
                                            i7 = 0;
                                        }
                                    } else if (strJ6.startsWith("READ ")) {
                                        i7 = 5;
                                    } else {
                                        cCharAt = 'A';
                                        if (cCharAt == 'R') {
                                            c = cCharAt;
                                        } else if (strJ6.startsWith("DIRTY ")) {
                                            i7 = 6;
                                        } else {
                                            c = 'R';
                                        }
                                        if (cCharAt == 'M') {
                                            cCharAt = c;
                                            i7 = 0;
                                        } else {
                                            cCharAt = c;
                                            i7 = 0;
                                        }
                                    }
                                }
                                int iIndexOf = i7 == 0 ? -1 : strJ6.indexOf(32, i7);
                                if (iIndexOf == -1) {
                                    iIndexOf = strJ6.length();
                                    i = -1;
                                } else {
                                    i = iIndexOf;
                                }
                                if (i7 != 0 && iIndexOf > i7) {
                                    if (cCharAt != 'E') {
                                        z = false;
                                    }
                                    if (z == (i != -1)) {
                                        String strSubstring = strJ6.substring(i7, iIndexOf);
                                        LinkedHashMap linkedHashMap = this.d;
                                        if (cCharAt == 'M') {
                                            linkedHashMap.remove(strSubstring);
                                            z = true;
                                        } else {
                                            too tooVar = (too) linkedHashMap.get(strSubstring);
                                            if (tooVar == null) {
                                                tooVar = new too(this, strSubstring);
                                                linkedHashMap.put(strSubstring, tooVar);
                                            }
                                            if (cCharAt == 'E') {
                                                int i8 = i + 1;
                                                int i9 = 0;
                                                while (i9 < i2) {
                                                    int length = i9 == i2 + (-1) ? strJ6.length() : strJ6.indexOf(i6, i8);
                                                    if (length <= i8) {
                                                        throw new IOException("unexpected journal line: ".concat(strJ6));
                                                    }
                                                    long j = 0;
                                                    while (i8 < length) {
                                                        int iCharAt = strJ6.charAt(i8) - '0';
                                                        if (iCharAt < 0 || iCharAt > 9 || j > 922337203685477580L) {
                                                            throw new IOException("unexpected journal line: ".concat(strJ6));
                                                        }
                                                        long j2 = j * 10;
                                                        long j3 = iCharAt;
                                                        if (j2 > Long.MAX_VALUE - j3) {
                                                            throw new IOException("unexpected journal line: ".concat(strJ6));
                                                        }
                                                        i8++;
                                                        j = j2 + j3;
                                                    }
                                                    tooVar.b[i9] = j;
                                                    i8 = length + 1;
                                                    i9++;
                                                    i6 = 32;
                                                }
                                                z = true;
                                                tooVar.c = true;
                                                tonVar = null;
                                            } else {
                                                z = true;
                                                z = true;
                                                z = true;
                                                if (cCharAt != 'R') {
                                                    if (cCharAt != 'A') {
                                                        throw new IOException("unexpected journal line: ".concat(strJ6));
                                                    }
                                                } else if (tooVar.d == null) {
                                                    tonVar = new ton(this, tooVar);
                                                }
                                            }
                                            tooVar.d = tonVar;
                                        }
                                    }
                                }
                                throw new IOException("unexpected journal line: ".concat(strJ6));
                            }
                            String[] strArrSplit = strJ6.split(" ");
                            int length2 = strArrSplit.length;
                            if (length2 < 2) {
                                throw new IOException("unexpected journal line: ".concat(strJ6));
                            }
                            String str = strArrSplit[z ? 1 : 0];
                            if (strArrSplit[i3].equals("REMOVE") && length2 == 2) {
                                this.d.remove(str);
                            } else {
                                LinkedHashMap linkedHashMap2 = this.d;
                                too tooVar2 = (too) linkedHashMap2.get(str);
                                if (tooVar2 == null) {
                                    tooVar2 = new too(this, str);
                                    linkedHashMap2.put(str, tooVar2);
                                }
                                if (strArrSplit[i3].equals("CLEAN") && length2 == i2 + 2) {
                                    tooVar2.c = z;
                                    tooVar2.d = null;
                                    if (this.n) {
                                        strArr = (String[]) Arrays.copyOfRange(strArrSplit, 2, length2);
                                    } else {
                                        int i10 = length2 - 2;
                                        Object[] objArr2 = (Object[]) Array.newInstance(strArrSplit.getClass().getComponentType(), i10);
                                        System.arraycopy(strArrSplit, 2, objArr2, i3, i10);
                                        strArr = (String[]) objArr2;
                                    }
                                    if (strArr.length != tooVar2.e.b) {
                                        throw too.d(strArr);
                                    }
                                    for (int i11 = i3; i11 < strArr.length; i11++) {
                                        try {
                                            tooVar2.b[i11] = Long.parseLong(strArr[i11]);
                                        } catch (NumberFormatException unused) {
                                            throw too.d(strArr);
                                        }
                                    }
                                } else if (strArrSplit[i3].equals("DIRTY") && length2 == 2) {
                                    tooVar2.d = new ton(this, tooVar2);
                                } else if (!strArrSplit[i3].equals("READ") || length2 != 2) {
                                    throw new IOException("unexpected journal line: ".concat(strJ6));
                                }
                            }
                            i5++;
                            i3 = 0;
                        } catch (EOFException unused2) {
                            this.e = i5 - this.d.size();
                            try {
                                bufferedInputStream.close();
                                return;
                            } catch (IOException unused3) {
                                return;
                            }
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strJ + ", " + strJ2 + ", " + strJ4 + ", " + strJ5 + ']');
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.tot
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final synchronized ton c(String str) {
        n();
        tol.k(str);
        LinkedHashMap linkedHashMap = this.d;
        too tooVar = (too) linkedHashMap.get(str);
        if (tooVar == null) {
            tooVar = new too(this, str);
            linkedHashMap.put(str, tooVar);
        } else if (tooVar.d != null) {
            return null;
        }
        ton tonVar = new ton(this, tooVar);
        tooVar.d = tonVar;
        this.c.write(a.bU((byte) 10, str, "DIRTY "));
        this.c.flush();
        return tonVar;
    }

    @Override // defpackage.tot
    public final synchronized long a() {
        return this.k;
    }

    @Override // defpackage.tot
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized top d(String str) {
        top topVar;
        afvx afvxVarAd = tym.ad(tsb.DISK_LRU_CACHE_GET);
        try {
            n();
            tol.k(str);
            too tooVar = (too) this.d.get(str);
            topVar = null;
            if (tooVar != null && tooVar.c) {
                int i = this.b;
                InputStream[] inputStreamArr = new InputStream[i];
                for (int i2 = 0; i2 < i; i2 = 1) {
                    try {
                        inputStreamArr[0] = new FileInputStream(tooVar.b());
                    } catch (FileNotFoundException unused) {
                    }
                }
                this.e++;
                this.c.append((CharSequence) ("READ " + str + '\n'));
                if (k()) {
                    o();
                }
                topVar = new top(inputStreamArr);
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return topVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.d.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ton tonVar = ((too) arrayList.get(i)).d;
            if (tonVar != null) {
                tonVar.a();
            }
        }
        j();
        this.c.close();
        this.c = null;
    }

    public final synchronized void e() {
        if (this.c == null) {
            return;
        }
        try {
            afvx afvxVarAd = tym.ad(tsb.DISK_LRU_CACHE_CLEANUP_AND_LOG_EXCEPTIONS);
            try {
                j();
                if (k()) {
                    i();
                    this.e = 0;
                }
                afvxVarAd.close();
            } catch (Throwable th) {
                try {
                    afvxVarAd.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/DefaultDiskLruCache", "cleanupAndLogExceptions", (char) 320, "DefaultDiskLruCache.java")).t("DefaultDiskLruCache cleanup error: ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000b, B:10:0x0010, B:12:0x0014, B:15:0x0020, B:16:0x002a, B:18:0x002c, B:20:0x0030, B:22:0x0036, B:24:0x003c, B:25:0x0054, B:27:0x0059, B:31:0x006b, B:35:0x00ab, B:37:0x00b6, B:39:0x00bc, B:32:0x007e, B:34:0x00a4, B:42:0x00c1, B:43:0x00c6), top: B:48:0x0001 }] */
    public final synchronized void f(ton tonVar, boolean z) {
        too tooVar = tonVar.a;
        if (tooVar.d != tonVar) {
            throw new IllegalStateException();
        }
        if (z && !tooVar.c) {
            for (int i = 0; i < this.b; i = 1) {
                if (!tooVar.c().exists()) {
                    tonVar.a();
                    throw new IllegalStateException("edit didn't create file 0");
                }
            }
        }
        for (int i2 = 0; i2 < this.b; i2 = 1) {
            File fileC = tooVar.c();
            if (!z) {
                q(fileC);
            } else if (fileC.exists()) {
                File fileB = tooVar.b();
                fileC.renameTo(fileB);
                long[] jArr = tooVar.b;
                long j = jArr[0];
                long length = fileB.length();
                jArr[0] = length;
                this.k = (this.k - j) + length;
            }
        }
        this.e++;
        tooVar.d = null;
        if (tooVar.c) {
            tooVar.c = true;
            this.c.write("CLEAN " + tooVar.a + tooVar.a() + '\n');
            if (z) {
                this.l++;
            }
        } else if (z) {
            z = true;
            tooVar.c = true;
            this.c.write("CLEAN " + tooVar.a + tooVar.a() + '\n');
            if (z) {
                this.l++;
            }
        } else {
            LinkedHashMap linkedHashMap = this.d;
            String str = tooVar.a;
            linkedHashMap.remove(str);
            this.c.write(a.bU((byte) 10, str, "REMOVE "));
        }
        h();
        if (this.k > this.j || k()) {
            o();
        }
    }

    @Override // defpackage.tot
    public final void g() throws IOException {
        close();
        p(this.a);
    }

    public final synchronized void h() {
        n();
        j();
        this.c.flush();
    }

    public final synchronized void i() {
        Writer writer = this.c;
        if (writer != null) {
            writer.close();
        }
        File file = this.h;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file), SemanticState.Multiline);
        bufferedWriter.write("com.google.android.libraries.youtube.common.cache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.i));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.b));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (too tooVar : this.d.values()) {
            if (tooVar.d != null) {
                bufferedWriter.write("DIRTY " + tooVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + tooVar.a + tooVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        File file2 = this.g;
        file.renameTo(file2);
        this.c = new BufferedWriter(new FileWriter(file2, true), SemanticState.Multiline);
    }

    public final void j() {
        while (this.k > this.j) {
            m((String) ((Map.Entry) this.d.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean k() {
        int i = this.e;
        return i >= 2000 && i >= this.d.size();
    }

    @Override // defpackage.tot
    public final synchronized void m(String str) {
        n();
        tol.k(str);
        LinkedHashMap linkedHashMap = this.d;
        too tooVar = (too) linkedHashMap.get(str);
        if (tooVar != null && tooVar.d == null) {
            for (int i = 0; i < this.b; i = 1) {
                File fileB = tooVar.b();
                if (!fileB.delete()) {
                    throw new IOException("failed to delete ".concat(fileB.toString()));
                }
                long j = this.k;
                long[] jArr = tooVar.b;
                this.k = j - jArr[0];
                jArr[0] = 0;
            }
            this.e++;
            this.c.append((CharSequence) a.bU((byte) 10, str, "REMOVE "));
            linkedHashMap.remove(str);
            if (k()) {
                o();
            }
        }
    }
}
