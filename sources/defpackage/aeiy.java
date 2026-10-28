package defpackage;

import android.content.Context;
import android.util.LruCache;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeiy {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public aeiy(xit xitVar, awmd awmdVar, tqj tqjVar, hno hnoVar) {
        this.h = new HashMap();
        this.a = new HashMap();
        this.d = xitVar;
        this.b = awmdVar;
        this.e = tqjVar;
        this.g = hnoVar;
        this.c = new LruCache(hnoVar.e() > 0 ? hnoVar.e() : 5);
        this.f = new LruCache(hnoVar.e() > 0 ? hnoVar.e() : 5);
    }

    public static final String c() {
        return UUID.randomUUID().toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: IOException -> 0x0064, TryCatch #0 {IOException -> 0x0064, blocks: (B:12:0x001a, B:14:0x0029, B:16:0x0040, B:17:0x0044, B:19:0x004a, B:20:0x004f, B:22:0x0055, B:24:0x005b), top: B:29:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:19:0x004a A[Catch: IOException -> 0x0064, TryCatch #0 {IOException -> 0x0064, blocks: (B:12:0x001a, B:14:0x0029, B:16:0x0040, B:17:0x0044, B:19:0x004a, B:20:0x004f, B:22:0x0055, B:24:0x005b), top: B:29:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:20:0x004f A[Catch: IOException -> 0x0064, TryCatch #0 {IOException -> 0x0064, blocks: (B:12:0x001a, B:14:0x0029, B:16:0x0040, B:17:0x0044, B:19:0x004a, B:20:0x004f, B:22:0x0055, B:24:0x005b), top: B:29:0x001a }] */
    public final long a(File file, String str, Set set) {
        File[] fileArrListFiles;
        long jA;
        long j = 0;
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    File file3 = new File(canonicalPath);
                    if (canonicalPath.equals(str)) {
                        if (file3.isFile()) {
                            jA = file3.length();
                        } else if (!file3.isDirectory()) {
                        }
                        j += jA;
                    } else {
                        if (canonicalPath.startsWith(str + File.separator)) {
                            if (file3.isFile()) {
                                jA = file3.length();
                            } else if (!file3.isDirectory() && !set.contains(canonicalPath)) {
                                set.add(canonicalPath);
                                jA = a(file3, str, set);
                            }
                            j += jA;
                        } else {
                            file2.getAbsolutePath();
                        }
                    }
                } catch (IOException unused) {
                    file2.getAbsolutePath();
                }
            }
        }
        return j;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture b() {
        ((aeiv) this.d).c("ds_mls");
        return ahno.as(((lqa) this.h).D("shared"), new aajs(this, 14), this.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, xit] */
    public final xir d(apfp apfpVar) {
        xir xirVarO;
        xir xirVarO2;
        if (apfpVar == null) {
            return this.d.o(42);
        }
        if (h()) {
            String str = apfpVar.U;
            if (!str.isEmpty()) {
                return ((aenr) ((aenu) this.b.io()).f(str).io()).b();
            }
        }
        if (((hno) this.g).aB()) {
            return e(apfpVar);
        }
        if (g()) {
            Object obj = this.c;
            synchronized (obj) {
                xir xirVar = (xir) ((LruCache) obj).get(apfpVar);
                if (xirVar == null) {
                    xirVarO2 = this.d.o(42);
                    ((LruCache) obj).put(apfpVar, xirVarO2);
                } else {
                    xirVarO2 = xirVar;
                }
            }
            return xirVarO2;
        }
        ?? r1 = this.h;
        synchronized (r1) {
            xir xirVar2 = (xir) r1.get(apfpVar);
            if (xirVar2 == null) {
                xirVarO = this.d.o(42);
                r1.put(apfpVar, xirVarO);
            } else {
                xirVarO = xirVar2;
            }
        }
        return xirVarO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, xit] */
    public final xir e(Object obj) {
        xir xirVarO;
        if (g()) {
            Object obj2 = this.f;
            synchronized (obj2) {
                xirVarO = (xir) ((LruCache) obj2).get(obj);
                if (xirVarO == null) {
                    xirVarO = this.d.o(42);
                    ((LruCache) obj2).put(obj, xirVarO);
                }
            }
        } else {
            ?? r0 = this.a;
            synchronized (r0) {
                xirVarO = (xir) r0.get(obj);
                if (xirVarO == null) {
                    xirVarO = this.d.o(42);
                }
                r0.put(obj, xirVarO);
            }
        }
        return xirVarO;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void f(xir xirVar) {
        if (((hno) this.g).aB()) {
            ?? r0 = this.a;
            synchronized (r0) {
                Collection.EL.removeIf(r0.entrySet(), new aciy(xirVar, 7));
            }
        } else {
            ?? r3 = this.h;
            synchronized (r3) {
                Collection.EL.removeIf(r3.entrySet(), new aciy(xirVar, 8));
            }
        }
    }

    public final boolean g() {
        return ((vxz) ((hno) this.g).i).l(170, 45732018L, false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tqj] */
    public final boolean h() {
        int i = tqr.a;
        return this.e.k(1073829998);
    }

    public aeiy(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr, byte[] bArr2) {
        this.c = awmdVar;
        this.d = awmdVar2;
        this.a = awmdVar3;
        this.g = awmdVar4;
        this.f = awmdVar5;
        this.h = awmdVar6;
        this.b = awmdVar7;
        awmdVar8.getClass();
        this.e = awmdVar8;
    }

    public aeiy(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr) {
        this.h = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
        awmdVar5.getClass();
        this.g = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        awmdVar8.getClass();
        this.d = awmdVar8;
    }

    public aeiy(Context context, agev agevVar, aabb aabbVar, Set set, Set set2, awmd awmdVar, vyo vyoVar, vxz vxzVar) {
        if (vxzVar.l(9, 45530965L, false)) {
            ahno.F(!set.isEmpty());
        } else {
            ahno.F(!set2.isEmpty());
        }
        this.a = context;
        this.b = agevVar;
        this.h = aabbVar;
        this.e = set;
        this.d = set2;
        this.f = awmdVar;
        this.g = vyoVar;
        this.c = vxzVar;
    }

    public aeiy(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.c = awmdVar2;
        this.f = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.g = awmdVar5;
        awmdVar6.getClass();
        this.d = awmdVar6;
        awmdVar7.getClass();
        this.e = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
    }

    public aeiy(lqa lqaVar, Executor executor, axlj axljVar, Executor executor2, Context context, vxz vxzVar, aeiv aeivVar, ahgb ahgbVar) {
        this.h = lqaVar;
        this.a = executor;
        this.g = axljVar;
        this.b = executor2;
        this.c = context;
        this.f = vxzVar;
        this.d = aeivVar;
        this.e = ahgbVar;
    }
}
