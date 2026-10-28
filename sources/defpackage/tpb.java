package defpackage;

import app.rive.semantics.SemanticState;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
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
/* JADX INFO: loaded from: classes4.dex */
public final class tpb implements tot {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/common/network/volley/cache/SingleValueDiskLruCache");
    public final File a;
    public Writer b;
    public int d;
    private final File f;
    private final File g;
    private final long i;
    private final Executor l;
    private final boolean m;
    private long j = 0;
    final LinkedHashMap c = new LinkedHashMap(0, 0.75f, true);
    private long k = 0;
    private final Callable n = new qoh(this, 20);
    private final int h = 539296001;

    public tpb(File file, boolean z, Executor executor, long j) {
        this.a = file;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.i = j;
        if (z) {
            this.l = new ahfg(executor);
        } else {
            this.l = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        this.m = z;
    }

    public static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static tpb n(File file, boolean z, Executor executor, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        afvx afvxVarAd = tym.ad(tsb.DISK_LRU_CACHE_OPEN);
        try {
            tpb tpbVar = new tpb(file, z, executor, j);
            File file2 = tpbVar.f;
            if (file2.exists()) {
                try {
                    tpbVar.t();
                    r(tpbVar.g);
                    Iterator it = tpbVar.c.values().iterator();
                    while (it.hasNext()) {
                        toz tozVar = (toz) it.next();
                        if (tozVar.d == null) {
                            tpbVar.j += tozVar.b;
                        } else {
                            tozVar.d = null;
                            r(tozVar.a());
                            r(tozVar.b());
                            it.remove();
                        }
                    }
                    tpbVar.b = new BufferedWriter(new FileWriter(file2, true), SemanticState.Multiline);
                } catch (IOException e2) {
                    ((agrc) ((agrc) ((agrc) e.c()).j(e2)).k("com/google/android/libraries/youtube/common/network/volley/cache/SingleValueDiskLruCache", "open", 354, "SingleValueDiskLruCache.java")).t("Disk cache journal is corrupt");
                    tpbVar.g();
                    file.mkdirs();
                    tpb tpbVar2 = new tpb(file, z, executor, j);
                    tpbVar2.j();
                    tpbVar = tpbVar2;
                }
            } else {
                file.mkdirs();
                tpb tpbVar3 = new tpb(file, z, executor, j);
                tpbVar3.j();
                tpbVar = tpbVar3;
            }
            afvxVarAd.close();
            return tpbVar;
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

    private final void o() {
        if (this.b == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void p() {
        boolean z = this.m;
        Executor executor = this.l;
        if (z) {
            executor.execute(afwl.i(new szq(this, 8)));
        } else {
            ((ExecutorService) executor).submit(this.n);
        }
    }

    private static void q(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(String.valueOf(file))));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                q(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(String.valueOf(file2))));
            }
        }
    }

    private static void r(File file) throws IOException {
        s(file, file.exists());
    }

    private static void s(File file, boolean z) throws IOException {
        if (z && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124 A[Catch: EOFException -> 0x021d, all -> 0x0253, TryCatch #1 {EOFException -> 0x021d, blocks: (B:20:0x0065, B:23:0x006f, B:25:0x0078, B:28:0x0086, B:131:0x0204, B:29:0x008d, B:31:0x0097, B:32:0x009f, B:36:0x00ac, B:37:0x00b2, B:40:0x00bb, B:41:0x00c8, B:42:0x00c9, B:45:0x00d5, B:46:0x00de, B:49:0x00ea, B:50:0x00f3, B:51:0x00f4, B:52:0x00fd, B:53:0x00fe, B:59:0x0117, B:83:0x0158, B:93:0x016d, B:95:0x0175, B:96:0x017b, B:98:0x0183, B:100:0x018d, B:102:0x0195, B:105:0x019d, B:107:0x01a3, B:113:0x01b8, B:115:0x01c6, B:116:0x01ca, B:117:0x01d3, B:118:0x01d4, B:119:0x01dd, B:120:0x01de, B:128:0x01fd, B:121:0x01e5, B:122:0x01ee, B:125:0x01f4, B:127:0x01f8, B:132:0x0209, B:133:0x0212, B:134:0x0213, B:135:0x021c, B:81:0x0150, B:64:0x0124, B:69:0x0131, B:74:0x013e, B:56:0x0109), top: B:145:0x0065, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f A[DONT_INVERT, PHI: r8
      0x012f: PHI (r8v5 char) = (r8v4 char), (r8v10 char) binds: [B:63:0x0122, B:67:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0131 A[Catch: EOFException -> 0x021d, all -> 0x0253, TryCatch #1 {EOFException -> 0x021d, blocks: (B:20:0x0065, B:23:0x006f, B:25:0x0078, B:28:0x0086, B:131:0x0204, B:29:0x008d, B:31:0x0097, B:32:0x009f, B:36:0x00ac, B:37:0x00b2, B:40:0x00bb, B:41:0x00c8, B:42:0x00c9, B:45:0x00d5, B:46:0x00de, B:49:0x00ea, B:50:0x00f3, B:51:0x00f4, B:52:0x00fd, B:53:0x00fe, B:59:0x0117, B:83:0x0158, B:93:0x016d, B:95:0x0175, B:96:0x017b, B:98:0x0183, B:100:0x018d, B:102:0x0195, B:105:0x019d, B:107:0x01a3, B:113:0x01b8, B:115:0x01c6, B:116:0x01ca, B:117:0x01d3, B:118:0x01d4, B:119:0x01dd, B:120:0x01de, B:128:0x01fd, B:121:0x01e5, B:122:0x01ee, B:125:0x01f4, B:127:0x01f8, B:132:0x0209, B:133:0x0212, B:134:0x0213, B:135:0x021c, B:81:0x0150, B:64:0x0124, B:69:0x0131, B:74:0x013e, B:56:0x0109), top: B:145:0x0065, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013b  */
    /* JADX WARN: Code duplicated, block: B:74:0x013e A[Catch: EOFException -> 0x021d, all -> 0x0253, TryCatch #1 {EOFException -> 0x021d, blocks: (B:20:0x0065, B:23:0x006f, B:25:0x0078, B:28:0x0086, B:131:0x0204, B:29:0x008d, B:31:0x0097, B:32:0x009f, B:36:0x00ac, B:37:0x00b2, B:40:0x00bb, B:41:0x00c8, B:42:0x00c9, B:45:0x00d5, B:46:0x00de, B:49:0x00ea, B:50:0x00f3, B:51:0x00f4, B:52:0x00fd, B:53:0x00fe, B:59:0x0117, B:83:0x0158, B:93:0x016d, B:95:0x0175, B:96:0x017b, B:98:0x0183, B:100:0x018d, B:102:0x0195, B:105:0x019d, B:107:0x01a3, B:113:0x01b8, B:115:0x01c6, B:116:0x01ca, B:117:0x01d3, B:118:0x01d4, B:119:0x01dd, B:120:0x01de, B:128:0x01fd, B:121:0x01e5, B:122:0x01ee, B:125:0x01f4, B:127:0x01f8, B:132:0x0209, B:133:0x0212, B:134:0x0213, B:135:0x021c, B:81:0x0150, B:64:0x0124, B:69:0x0131, B:74:0x013e, B:56:0x0109), top: B:145:0x0065, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void t() {
        Object[] objArr;
        char c;
        int i;
        toy toyVar;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f), SemanticState.Multiline);
        try {
            String strJ = tol.j(bufferedInputStream);
            String strJ2 = tol.j(bufferedInputStream);
            String strJ3 = tol.j(bufferedInputStream);
            String strJ4 = tol.j(bufferedInputStream);
            String strJ5 = tol.j(bufferedInputStream);
            if (!strJ.equals("com.google.android.libraries.youtube.common.cache") || !strJ2.equals("1") || !strJ3.equals(Integer.toString(this.h)) || !strJ4.equals("1") || !strJ5.isEmpty()) {
                throw new IOException("unexpected journal header: [" + strJ + ", " + strJ2 + ", " + strJ4 + ", " + strJ5 + ']');
            }
            tqj tqjVar = tqi.a;
            boolean z = true;
            char c2 = 0;
            if (tqjVar != null) {
                int i2 = tqr.a;
                if (tqjVar.k(1073830524)) {
                    objArr = true;
                } else {
                    objArr = false;
                }
            } else {
                objArr = false;
            }
            int i3 = 0;
            while (true) {
                try {
                    String strJ6 = tol.j(bufferedInputStream);
                    if (objArr == true) {
                        int i4 = 6;
                        char cCharAt = strJ6.length() < 6 ? ' ' : strJ6.charAt(2);
                        if (cCharAt != 'E') {
                            if (cCharAt != 'A') {
                                if (cCharAt == 'R') {
                                    c = cCharAt;
                                } else if (!strJ6.startsWith("DIRTY ")) {
                                    c = 'R';
                                }
                                if (cCharAt == 'M' || !strJ6.startsWith("REMOVE ")) {
                                    cCharAt = c;
                                    i4 = 0;
                                } else {
                                    i4 = 7;
                                    cCharAt = c;
                                }
                            } else if (strJ6.startsWith("READ ")) {
                                i4 = 5;
                            } else {
                                cCharAt = 'A';
                                if (cCharAt == 'R') {
                                    c = cCharAt;
                                } else if (!strJ6.startsWith("DIRTY ")) {
                                    c = 'R';
                                }
                                if (cCharAt == 'M') {
                                    cCharAt = c;
                                    i4 = 0;
                                } else {
                                    cCharAt = c;
                                    i4 = 0;
                                }
                            }
                        } else if (strJ6.startsWith("CLEAN ")) {
                            cCharAt = 'E';
                        } else {
                            cCharAt = 'E';
                            if (cCharAt != 'A') {
                                if (cCharAt == 'R') {
                                    c = cCharAt;
                                } else if (!strJ6.startsWith("DIRTY ")) {
                                    c = 'R';
                                }
                                if (cCharAt == 'M') {
                                    cCharAt = c;
                                    i4 = 0;
                                } else {
                                    cCharAt = c;
                                    i4 = 0;
                                }
                            } else if (strJ6.startsWith("READ ")) {
                                i4 = 5;
                            } else {
                                cCharAt = 'A';
                                if (cCharAt == 'R') {
                                    c = cCharAt;
                                } else if (!strJ6.startsWith("DIRTY ")) {
                                    c = 'R';
                                }
                                if (cCharAt == 'M') {
                                    cCharAt = c;
                                    i4 = 0;
                                } else {
                                    cCharAt = c;
                                    i4 = 0;
                                }
                            }
                        }
                        int iIndexOf = i4 == 0 ? -1 : strJ6.indexOf(32, i4);
                        if (iIndexOf == -1) {
                            iIndexOf = strJ6.length();
                            i = -1;
                        } else {
                            i = iIndexOf;
                        }
                        if (i4 != 0 && iIndexOf > i4) {
                            boolean z2 = cCharAt != 'E' ? false : z ? 1 : 0;
                            if (i == -1) {
                                z = false;
                            }
                            if (z2 == z) {
                                String strSubstring = strJ6.substring(i4, iIndexOf);
                                LinkedHashMap linkedHashMap = this.c;
                                if (cCharAt == 'M') {
                                    linkedHashMap.remove(strSubstring);
                                    z = true;
                                } else {
                                    toz tozVar = (toz) linkedHashMap.get(strSubstring);
                                    if (tozVar == null) {
                                        tozVar = new toz(this, strSubstring);
                                        linkedHashMap.put(strSubstring, tozVar);
                                    }
                                    if (cCharAt == 'E') {
                                        int i5 = i + 1;
                                        if (strJ6.indexOf(32, i5) != -1 || i5 >= strJ6.length()) {
                                            throw new IOException("unexpected journal line: ".concat(strJ6));
                                        }
                                        long j = 0;
                                        while (i5 < strJ6.length()) {
                                            int iCharAt = strJ6.charAt(i5) - '0';
                                            if (iCharAt < 0 || iCharAt > 9 || j > 922337203685477580L) {
                                                throw new IOException("unexpected journal line: ".concat(strJ6));
                                            }
                                            long j2 = j * 10;
                                            long j3 = iCharAt;
                                            if (j2 > Long.MAX_VALUE - j3) {
                                                throw new IOException("unexpected journal line: ".concat(strJ6));
                                            }
                                            j = j2 + j3;
                                            i5++;
                                        }
                                        tozVar.b = j;
                                        z = true;
                                        tozVar.c = true;
                                        toyVar = null;
                                    } else {
                                        z = true;
                                        z = true;
                                        z = true;
                                        if (cCharAt == 'R') {
                                            if (tozVar.d == null) {
                                                toyVar = new toy(this, tozVar);
                                            }
                                        } else if (cCharAt != 'A') {
                                            throw new IOException("unexpected journal line: ".concat(strJ6));
                                        }
                                    }
                                    tozVar.d = toyVar;
                                }
                            }
                        }
                        throw new IOException("unexpected journal line: ".concat(strJ6));
                    }
                    String[] strArrSplit = strJ6.split(" ");
                    int length = strArrSplit.length;
                    if (length < 2) {
                        throw new IOException("unexpected journal line: ".concat(strJ6));
                    }
                    String str = strArrSplit[z ? 1 : 0];
                    if (strArrSplit[c2].equals("REMOVE") && length == 2) {
                        this.c.remove(str);
                    } else {
                        LinkedHashMap linkedHashMap2 = this.c;
                        toz tozVar2 = (toz) linkedHashMap2.get(str);
                        if (tozVar2 == null) {
                            tozVar2 = new toz(this, str);
                            linkedHashMap2.put(str, tozVar2);
                        }
                        if (strArrSplit[c2].equals("CLEAN") && length == 3) {
                            tozVar2.c = z;
                            tozVar2.d = null;
                            String str2 = strArrSplit[2];
                            try {
                                tozVar2.b = Long.parseLong(str2);
                            } catch (NumberFormatException e2) {
                                throw new IOException("unexpected journal line: ".concat(String.valueOf(str2)), e2);
                            }
                        } else if (strArrSplit[c2].equals("DIRTY") && length == 2) {
                            tozVar2.d = new toy(this, tozVar2);
                        } else if (!strArrSplit[c2].equals("READ") || length != 2) {
                            throw new IOException("unexpected journal line: ".concat(strJ6));
                        }
                    }
                    i3++;
                    c2 = 0;
                } catch (EOFException unused) {
                    this.d = i3 - this.c.size();
                    f(bufferedInputStream);
                    return;
                }
            }
        } catch (Throwable th) {
            f(bufferedInputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.tot
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final synchronized toy c(String str) {
        o();
        tol.k(str);
        LinkedHashMap linkedHashMap = this.c;
        toz tozVar = (toz) linkedHashMap.get(str);
        if (tozVar == null) {
            tozVar = new toz(this, str);
            linkedHashMap.put(str, tozVar);
        } else if (tozVar.d != null) {
            return null;
        }
        toy toyVar = new toy(this, tozVar);
        tozVar.d = toyVar;
        this.b.write(a.bU((byte) 10, str, "DIRTY "));
        this.b.flush();
        return toyVar;
    }

    @Override // defpackage.tot
    public final synchronized long a() {
        return this.j;
    }

    @Override // defpackage.tot
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized tpa d(String str) {
        tpa tpaVar;
        afvx afvxVarAd = tym.ad(tsb.DISK_LRU_CACHE_GET);
        try {
            o();
            tol.k(str);
            toz tozVar = (toz) this.c.get(str);
            tpaVar = null;
            if (tozVar != null && tozVar.c) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(tozVar.a());
                    this.d++;
                    this.b.append((CharSequence) ("READ " + str + '\n'));
                    if (l()) {
                        p();
                    }
                    tpaVar = new tpa(fileInputStream);
                } catch (FileNotFoundException unused) {
                }
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
        return tpaVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.c.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            toy toyVar = ((toz) arrayList.get(i)).d;
            if (toyVar != null) {
                toyVar.a();
            }
        }
        k();
        this.b.close();
        this.b = null;
    }

    public final synchronized void e() {
        if (this.b == null) {
            return;
        }
        try {
            afvx afvxVarAd = tym.ad(tsb.DISK_LRU_CACHE_CLEANUP_AND_LOG_EXCEPTIONS);
            try {
                k();
                if (l()) {
                    j();
                    this.d = 0;
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
        } catch (IOException e2) {
            ((agrc) ((agrc) ((agrc) e.b()).j(e2)).k("com/google/android/libraries/youtube/common/network/volley/cache/SingleValueDiskLruCache", "cleanupAndLogExceptions", (char) 291, "SingleValueDiskLruCache.java")).t("SingleValueDiskLruCache cleanup error: ");
        }
    }

    @Override // defpackage.tot
    public final void g() throws IOException {
        close();
        q(this.a);
    }

    public final synchronized void h(toy toyVar, boolean z) {
        toz tozVar = toyVar.a;
        ahno.O(tozVar.d == toyVar);
        File fileB = tozVar.b();
        boolean zExists = fileB.exists();
        if (z && !tozVar.c && !zExists) {
            toyVar.a();
            throw new IllegalStateException("edit didn't create file 0");
        }
        if (!z) {
            s(fileB, zExists);
        } else if (zExists) {
            File fileA = tozVar.a();
            fileB.renameTo(fileA);
            long j = tozVar.b;
            long length = fileA.length();
            tozVar.b = length;
            this.j = (this.j - j) + length;
        }
        this.d++;
        tozVar.d = null;
        if (tozVar.c || z) {
            tozVar.c = true;
            this.b.write("CLEAN " + tozVar.a + ' ' + tozVar.b + '\n');
            if (z) {
                this.k++;
            }
        } else {
            LinkedHashMap linkedHashMap = this.c;
            String str = tozVar.a;
            linkedHashMap.remove(str);
            this.b.write(a.bU((byte) 10, str, "REMOVE "));
        }
        i();
        if (this.j > this.i || l()) {
            p();
        }
    }

    public final synchronized void i() {
        o();
        k();
        this.b.flush();
    }

    public final synchronized void j() {
        Writer writer = this.b;
        if (writer != null) {
            writer.close();
        }
        File file = this.g;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file), SemanticState.Multiline);
        bufferedWriter.write("com.google.android.libraries.youtube.common.cache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.h));
        bufferedWriter.write("\n");
        bufferedWriter.write("1\n\n");
        for (toz tozVar : this.c.values()) {
            if (tozVar.d != null) {
                bufferedWriter.write("DIRTY " + tozVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + tozVar.a + ' ' + tozVar.b + '\n');
            }
        }
        bufferedWriter.close();
        File file2 = this.f;
        file.renameTo(file2);
        this.b = new BufferedWriter(new FileWriter(file2, true), SemanticState.Multiline);
    }

    public final void k() {
        while (this.j > this.i) {
            m((String) ((Map.Entry) this.c.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean l() {
        int i = this.d;
        return i >= 2000 && i >= this.c.size();
    }

    @Override // defpackage.tot
    public final synchronized void m(String str) {
        o();
        tol.k(str);
        LinkedHashMap linkedHashMap = this.c;
        toz tozVar = (toz) linkedHashMap.get(str);
        if (tozVar != null && tozVar.d == null) {
            File fileA = tozVar.a();
            if (!fileA.delete()) {
                throw new IOException("failed to delete ".concat(fileA.toString()));
            }
            this.j -= tozVar.b;
            tozVar.b = 0L;
            this.d++;
            this.b.append((CharSequence) a.bU((byte) 10, str, "REMOVE "));
            linkedHashMap.remove(str);
            if (l()) {
                p();
            }
        }
    }
}
