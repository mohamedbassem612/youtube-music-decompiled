package defpackage;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class esw implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new est());
    private final Callable n = new ess(this);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public esw(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(File file, File file2, boolean z) throws IOException {
        if (z) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private final void l() {
        if (this.f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void m(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void n(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized esv a(String str) {
        l();
        esu esuVar = (esu) this.g.get(str);
        if (esuVar != null && esuVar.c) {
            for (int i = 0; i < this.d; i = 1) {
                if (esuVar.c().exists()) {
                }
            }
            this.h++;
            this.f.append((CharSequence) "READ");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            if (h()) {
                this.i.submit(this.n);
            }
            return new esv(this, str);
        }
        return null;
    }

    public final void b() throws IOException {
        close();
        esz.b(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rvp rvpVar = ((esu) arrayList.get(i)).e;
            if (rvpVar != null) {
                rvpVar.a();
            }
        }
        g();
        m(this.f);
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void d() {
        String strSubstring;
        esy esyVar = new esy(new FileInputStream(this.b), esz.a);
        try {
            String strA = esyVar.a();
            String strA2 = esyVar.a();
            String strA3 = esyVar.a();
            String strA4 = esyVar.a();
            String strA5 = esyVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.k).equals(strA3) || !Integer.toString(this.d).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    String strA6 = esyVar.a();
                    int iIndexOf = strA6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strA6)));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strA6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strA6.substring(i2);
                        if (iIndexOf == 6) {
                            if (strA6.startsWith("REMOVE")) {
                                this.g.remove(strSubstring);
                            } else {
                                iIndexOf = 6;
                            }
                        }
                        i++;
                    } else {
                        strSubstring = strA6.substring(i2, iIndexOf2);
                    }
                    LinkedHashMap linkedHashMap = this.g;
                    esu esuVar = (esu) linkedHashMap.get(strSubstring);
                    if (esuVar == null) {
                        esuVar = new esu(this, strSubstring);
                        linkedHashMap.put(strSubstring, esuVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5) {
                        if (!strA6.startsWith("CLEAN")) {
                            iIndexOf = 5;
                            if (iIndexOf2 != -1) {
                                if (iIndexOf2 == -1) {
                                }
                                throw new IOException("unexpected journal line: ".concat(String.valueOf(strA6)));
                            }
                            if (iIndexOf2 == -1) {
                            }
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(strA6)));
                        }
                        String[] strArrSplit = strA6.substring(iIndexOf2 + 1).split(" ");
                        esuVar.c = true;
                        esuVar.e = null;
                        if (strArrSplit.length != esuVar.d.d) {
                            throw esu.e(strArrSplit);
                        }
                        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                            try {
                                esuVar.b[i3] = Long.parseLong(strArrSplit[i3]);
                            } catch (NumberFormatException unused) {
                                throw esu.e(strArrSplit);
                            }
                        }
                    } else if (iIndexOf2 != -1 && iIndexOf == 5 && strA6.startsWith("DIRTY")) {
                        esuVar.e = new rvp(this, esuVar);
                    } else if (iIndexOf2 == -1 || iIndexOf != 4 || !strA6.startsWith("READ")) {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(strA6)));
                    }
                    i++;
                } catch (EOFException unused2) {
                    this.h = i - this.g.size();
                    if (esyVar.b == -1) {
                        e();
                    } else {
                        this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), esz.a));
                    }
                    esz.a(esyVar);
                    return;
                }
            }
        } catch (Throwable th) {
            esz.a(esyVar);
            throw th;
        }
    }

    public final synchronized void e() {
        Writer writer = this.f;
        if (writer != null) {
            m(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), esz.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (esu esuVar : this.g.values()) {
                if (esuVar.e != null) {
                    bufferedWriter.write("DIRTY " + esuVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + esuVar.a + esuVar.a() + '\n');
                }
            }
            m(bufferedWriter);
            File file = this.b;
            if (file.exists()) {
                f(file, this.j, true);
            }
            f(this.c, file, false);
            this.j.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), esz.a));
        } catch (Throwable th) {
            m(bufferedWriter);
            throw th;
        }
    }

    public final void g() {
        while (this.e > this.l) {
            i((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean h() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized void i(String str) {
        l();
        LinkedHashMap linkedHashMap = this.g;
        esu esuVar = (esu) linkedHashMap.get(str);
        if (esuVar != null && esuVar.e == null) {
            for (int i = 0; i < this.d; i = 1) {
                File fileC = esuVar.c();
                if (fileC.exists() && !fileC.delete()) {
                    throw new IOException("failed to delete ".concat(fileC.toString()));
                }
                long j = this.e;
                long[] jArr = esuVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
            linkedHashMap.remove(str);
            if (h()) {
                this.i.submit(this.n);
            }
        }
    }

    public final synchronized void j(rvp rvpVar, boolean z) {
        Object obj = rvpVar.c;
        if (((esu) obj).e != rvpVar) {
            throw new IllegalStateException();
        }
        if (z && !((esu) obj).c) {
            for (int i = 0; i < this.d; i = 1) {
                if (!((boolean[]) rvpVar.b)[0]) {
                    rvpVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!((esu) obj).d().exists()) {
                    rvpVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File fileD = ((esu) obj).d();
            if (!z) {
                c(fileD);
            } else if (fileD.exists()) {
                File fileC = ((esu) obj).c();
                fileD.renameTo(fileC);
                long[] jArr = ((esu) obj).b;
                long j = jArr[0];
                long length = fileC.length();
                jArr[0] = length;
                this.e = (this.e - j) + length;
            }
        }
        this.h++;
        ((esu) obj).e = null;
        if (((esu) obj).c || z) {
            ((esu) obj).c = true;
            this.f.append((CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((CharSequence) ((esu) obj).a);
            this.f.append((CharSequence) ((esu) obj).a());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            LinkedHashMap linkedHashMap = this.g;
            String str = ((esu) obj).a;
            linkedHashMap.remove(str);
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) str);
            this.f.append('\n');
        }
        n(this.f);
        if (this.e > this.l || h()) {
            this.i.submit(this.n);
        }
    }

    public final synchronized rvp k(String str) {
        l();
        LinkedHashMap linkedHashMap = this.g;
        esu esuVar = (esu) linkedHashMap.get(str);
        if (esuVar == null) {
            esuVar = new esu(this, str);
            linkedHashMap.put(str, esuVar);
        } else if (esuVar.e != null) {
            return null;
        }
        rvp rvpVar = new rvp(this, esuVar);
        esuVar.e = rvpVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        n(this.f);
        return rvpVar;
    }
}
