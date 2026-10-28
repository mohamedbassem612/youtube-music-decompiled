package defpackage;

import android.os.ConditionVariable;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cab implements bzk {
    private static final HashSet f = new HashSet();
    public final File a;
    public final bzw b;
    public final bzq c;
    public long d;
    public bzj e;
    private final HashMap g;
    private final Random h;
    private long i;
    private boolean j;
    private final kys k;

    public cab(File file, kys kysVar, bxo bxoVar) {
        bzw bzwVar = new bzw(bxoVar, file);
        bzq bzqVar = new bzq(bxoVar);
        if (!q(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(String.valueOf(file))));
        }
        this.a = file;
        this.k = kysVar;
        this.b = bzwVar;
        this.c = bzqVar;
        this.g = new HashMap();
        this.h = new Random();
        this.d = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new caa(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static long h(File[] fileArr) {
        int i = 0;
        for (File file : fileArr) {
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return Long.parseLong(name.substring(i, name.indexOf(46)), 16);
                } catch (NumberFormatException unused) {
                    bvx.c("SimpleCache", "Malformed UID file: ".concat(String.valueOf(String.valueOf(file))));
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static void j(File file) throws bzj {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strConcat = "Failed to create cache directory: ".concat(String.valueOf(String.valueOf(file)));
        bvx.c("SimpleCache", strConcat);
        throw new bzj(strConcat);
    }

    private final void m(cac cacVar) {
        bzw bzwVar = this.b;
        String str = cacVar.a;
        bzwVar.b(str).c.add(cacVar);
        this.i += cacVar.c;
        ArrayList arrayList = (ArrayList) this.g.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((kys) arrayList.get(size)).b(this, cacVar);
                }
            }
        }
        this.k.b(this, cacVar);
    }

    private final void n(bzr bzrVar) {
        bzs bzsVarA = this.b.a(bzrVar.a);
        if (bzsVarA == null || !bzsVarA.c.remove(bzrVar)) {
            return;
        }
        File file = bzrVar.e;
        if (file != null) {
            file.delete();
        }
        this.i -= bzrVar.c;
        bzq bzqVar = this.c;
        file.getClass();
        String name = file.getName();
        try {
            bzqVar.d(name);
        } catch (IOException unused) {
            bvx.e("SimpleCache", "Failed to remove file index entry for: ".concat(String.valueOf(name)));
        }
        this.b.d(bzsVarA.b);
        ArrayList arrayList = (ArrayList) this.g.get(bzrVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((kys) arrayList.get(size)).d(bzrVar);
                }
            }
        }
        this.k.d(bzrVar);
    }

    private final void o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableCollection(this.b.a.values()).iterator();
        while (it.hasNext()) {
            for (bzr bzrVar : ((bzs) it.next()).c) {
                File file = bzrVar.e;
                file.getClass();
                if (file.length() != bzrVar.c) {
                    arrayList.add(bzrVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            n((bzr) arrayList.get(i));
        }
    }

    private static synchronized void p(File file) {
        f.remove(file.getAbsoluteFile());
    }

    private static synchronized boolean q(File file) {
        return f.add(file.getAbsoluteFile());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[Catch: all -> 0x0153, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0017, B:27:0x0096, B:29:0x009a, B:31:0x00ac, B:35:0x00b9, B:37:0x00ef, B:40:0x00ff, B:39:0x00f6, B:41:0x0102, B:34:0x00b2, B:44:0x010a, B:45:0x0113, B:47:0x011b, B:49:0x0127, B:62:0x0143, B:8:0x002c, B:10:0x0048, B:22:0x007f, B:24:0x0083, B:26:0x0092, B:14:0x0057, B:16:0x005f, B:18:0x0067, B:21:0x0070), top: B:69:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[Catch: all -> 0x0153, LOOP:2: B:8:0x002c->B:26:0x0092, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0017, B:27:0x0096, B:29:0x009a, B:31:0x00ac, B:35:0x00b9, B:37:0x00ef, B:40:0x00ff, B:39:0x00f6, B:41:0x0102, B:34:0x00b2, B:44:0x010a, B:45:0x0113, B:47:0x011b, B:49:0x0127, B:62:0x0143, B:8:0x002c, B:10:0x0048, B:22:0x007f, B:24:0x0083, B:26:0x0092, B:14:0x0057, B:16:0x005f, B:18:0x0067, B:21:0x0070), top: B:69:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0096 A[EDGE_INSN: B:80:0x0096->B:27:0x0096 BREAK  A[LOOP:2: B:8:0x002c->B:26:0x0092], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0096 A[EDGE_INSN: B:81:0x0096->B:27:0x0096 BREAK  A[LOOP:2: B:8:0x002c->B:26:0x0092], SYNTHETIC] */
    @Override // defpackage.bzk
    public final synchronized bzr a(String str, long j, long j2) {
        long j3;
        long j4;
        cac cacVar;
        File file;
        ahno.O(!this.j);
        i();
        bzs bzsVarA = this.b.a(str);
        if (bzsVarA != null) {
            while (true) {
                String str2 = bzsVarA.b;
                cac cacVar2 = new cac(str2, j, -1L, -9223372036854775807L, null);
                TreeSet treeSet = bzsVarA.c;
                cac cacVar3 = (cac) treeSet.floor(cacVar2);
                if (cacVar3 != null) {
                    j3 = -1;
                    if (cacVar3.b + cacVar3.c > j) {
                        cacVar = cacVar3;
                    }
                    if (cacVar.d) {
                        break;
                    }
                    file = cacVar.e;
                    file.getClass();
                    if (file.length() != cacVar.c) {
                        break;
                    }
                    o();
                } else {
                    j3 = -1;
                }
                cac cacVar4 = (cac) treeSet.ceiling(cacVar2);
                if (cacVar4 != null) {
                    long jMin = cacVar4.b - j;
                    if (j2 != j3) {
                        jMin = Math.min(jMin, j2);
                    }
                    j4 = jMin;
                } else {
                    j4 = j2;
                }
                cacVar = new cac(str2, j, j4, -9223372036854775807L, null);
                if (cacVar.d) {
                    break;
                    break;
                }
                file = cacVar.e;
                file.getClass();
                if (file.length() != cacVar.c) {
                    break;
                    break;
                }
                o();
            }
        } else {
            cacVar = new cac(str, j, j2, -9223372036854775807L, null);
            j3 = -1;
        }
        if (cacVar.d) {
            File file2 = cacVar.e;
            file2.getClass();
            long j5 = cacVar.c;
            bzq bzqVar = this.c;
            String name = file2.getName();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                bzqVar.f(name, j5, jCurrentTimeMillis);
            } catch (IOException unused) {
                bvx.e("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            bzs bzsVarA2 = this.b.a(str);
            bzsVarA2.getClass();
            TreeSet treeSet2 = bzsVarA2.c;
            ahno.O(treeSet2.remove(cacVar));
            File file3 = cacVar.e;
            file3.getClass();
            ahno.O(cacVar.d);
            String str3 = cacVar.a;
            cac cacVar5 = new cac(str3, cacVar.b, cacVar.c, jCurrentTimeMillis, file3);
            treeSet2.add(cacVar5);
            ArrayList arrayList = (ArrayList) this.g.get(str3);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((kys) arrayList.get(size)).c(this, cacVar, cacVar5);
                }
            }
            this.k.c(this, cacVar, cacVar5);
            return cacVar5;
        }
        bzs bzsVarB = this.b.b(str);
        long j6 = cacVar.c;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = bzsVarB.d;
            if (i >= arrayList2.size()) {
                arrayList2.add(new czo(j, j6, null, null));
                return cacVar;
            }
            czo czoVar = (czo) arrayList2.get(i);
            long j7 = czoVar.b;
            if (j7 <= j) {
                long j8 = czoVar.a;
                if (j8 == j3 || j7 + j8 > j) {
                    return null;
                }
                i++;
            } else {
                if (j6 == j3 || j + j6 > j7) {
                    return null;
                }
                i++;
            }
        }
    }

    @Override // defpackage.bzk
    public final synchronized bzx b(String str) {
        bzs bzsVarA;
        ahno.O(!this.j);
        bzsVarA = this.b.a(str);
        return bzsVarA != null ? bzsVarA.e : bzy.a;
    }

    @Override // defpackage.bzk
    public final synchronized File c(String str, long j, long j2) {
        File file;
        int i;
        long jCurrentTimeMillis;
        ahno.O(!this.j);
        i();
        bzs bzsVarA = this.b.a(str);
        bzsVarA.getClass();
        ahno.O(bzsVarA.a(j, j2));
        File file2 = this.a;
        if (!file2.exists()) {
            j(file2);
            o();
        }
        kys kysVar = this.k;
        if (j2 != -1) {
            kysVar.a(this, j2);
        }
        file = new File(file2, Integer.toString(this.h.nextInt(10)));
        if (!file.exists()) {
            j(file);
        }
        i = bzsVarA.a;
        jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = cac.g;
        return rpi.I(file, i, j, jCurrentTimeMillis);
    }

    @Override // defpackage.bzk
    public final synchronized void d(File file, long j) {
        ahno.O(!this.j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            bzw bzwVar = this.b;
            cac cacVarC = cac.c(file, j, -9223372036854775807L, bzwVar);
            cacVarC.getClass();
            bzs bzsVarA = bzwVar.a(cacVarC.a);
            bzsVarA.getClass();
            long j2 = cacVarC.c;
            long j3 = cacVarC.b;
            ahno.O(bzsVarA.a(j3, j2));
            long jA = bzsVarA.e.a();
            if (jA != -1) {
                ahno.O(j3 + j2 <= jA);
            }
            try {
                this.c.f(file.getName(), j2, cacVarC.f);
                m(cacVarC);
                try {
                    this.b.e();
                    notifyAll();
                } catch (IOException e) {
                    throw new bzj(e);
                }
            } catch (IOException e2) {
                throw new bzj(e2);
            }
        }
    }

    @Override // defpackage.bzk
    public final synchronized void e(bzr bzrVar) {
        ahno.O(!this.j);
        bzw bzwVar = this.b;
        bzs bzsVarA = bzwVar.a(bzrVar.a);
        bzsVarA.getClass();
        long j = bzrVar.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = bzsVarA.d;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((czo) arrayList.get(i)).b == j) {
                arrayList.remove(i);
                bzwVar.d(bzsVarA.b);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.bzk
    public final synchronized void f(bzr bzrVar) {
        ahno.O(!this.j);
        n(bzrVar);
    }

    @Override // defpackage.bzk
    public final synchronized void g(String str, eol eolVar) {
        ahno.O(!this.j);
        i();
        bzw bzwVar = this.b;
        bzs bzsVarB = bzwVar.b(str);
        bzy bzyVar = bzsVarB.e;
        bzsVarB.e = bzyVar.b(eolVar);
        if (!bzsVarB.e.equals(bzyVar)) {
            bzwVar.c.d(bzsVarB);
        }
        try {
            bzwVar.e();
        } catch (IOException e) {
            throw new bzj(e);
        }
    }

    public final synchronized void i() {
        bzj bzjVar = this.e;
        if (bzjVar != null) {
            throw bzjVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    public final void k(File file, boolean z, File[] fileArr, Map map) {
        czo czoVar;
        long j;
        long j2;
        cac cacVarC;
        if (fileArr == null || (fileArr.length) == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (!z) {
                czoVar = (czo) map.remove(name);
                if (czoVar != null) {
                    j = czoVar.a;
                    j2 = czoVar.b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                cacVarC = cac.c(file2, j2, j, this.b);
                if (cacVarC != null) {
                    m(cacVarC);
                } else {
                    file2.delete();
                }
            } else if (name.indexOf(46) == -1) {
                k(file2, false, file2.listFiles(), map);
            } else if (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid")) {
                czoVar = (czo) map.remove(name);
                if (czoVar != null) {
                    j = czoVar.a;
                    j2 = czoVar.b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                cacVarC = cac.c(file2, j2, j, this.b);
                if (cacVarC != null) {
                    m(cacVarC);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void l() {
        if (this.j) {
            return;
        }
        this.g.clear();
        o();
        try {
            try {
                this.b.e();
            } catch (IOException e) {
                bvx.d("SimpleCache", "Storing index file failed", e);
            }
            p(this.a);
            this.j = true;
        } catch (Throwable th) {
            p(this.a);
            this.j = true;
            throw th;
        }
    }
}
