package defpackage;

import android.os.ConditionVariable;
import android.util.Log;
import android.util.SparseArray;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtc implements jsk {
    private static final HashSet m = new HashSet();
    private static final Set n = ConcurrentHashMap.newKeySet();
    public final File a;
    public final jso b;
    public boolean c;
    public final Object d;
    public final xeu e;
    public final boolean f;
    public final boolean g;
    public long h;
    public jsi i;
    public xhn j;
    public xxy k = null;
    final axfd l;
    private final HashMap o;
    private final ArrayList p;
    private final Random q;
    private final boolean r;
    private final boolean s;
    private long t;
    private boolean u;
    private final boolean v;

    public jtc(File file, jso jsoVar, axfd axfdVar, ahsm ahsmVar, boolean z, boolean z2, boolean z3) {
        if (!A(file, z3)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(file.toString()));
        }
        this.v = z;
        this.a = file;
        this.b = jsoVar;
        this.l = axfdVar;
        this.d = new Object();
        this.e = (xeu) (ahsmVar != null ? ahsmVar.b : null);
        boolean z4 = false;
        if (ahsmVar != null && ahsmVar.a) {
            z4 = true;
        }
        this.s = z4;
        this.o = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.p = arrayList;
        this.q = new Random();
        this.r = jsoVar.g();
        if (ahsmVar != null) {
            arrayList.add(ahsmVar.c);
        }
        this.f = z2;
        this.g = z3;
        ConditionVariable conditionVariable = new ConditionVariable();
        new jtb(this, conditionVariable, jsoVar).start();
        conditionVariable.block();
    }

    private static synchronized boolean A(File file, boolean z) {
        boolean zAdd;
        if (z) {
            try {
                zAdd = n.add(file.getCanonicalPath());
            } catch (IOException e) {
                hna.ac("Unable to add cache dir to lockedCacheDirsV2", e);
                zAdd = false;
            }
        } else {
            zAdd = m.add(file.getAbsoluteFile());
        }
        return zAdd;
    }

    private final void v(jtd jtdVar) {
        axfd axfdVar = this.l;
        String str = jtdVar.a;
        axfdVar.Z(str).c.add(jtdVar);
        this.t += jtdVar.c;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((jsj) arrayList.get(i)).a(this, jtdVar);
        }
        ArrayList arrayList2 = (ArrayList) this.o.get(str);
        if (arrayList2 != null) {
            for (jsj jsjVar : aguu.t(arrayList2)) {
                if (!arrayList.contains(jsjVar)) {
                    jsjVar.a(this, jtdVar);
                }
            }
        }
        this.b.a(this, jtdVar);
    }

    private final void w(jsp jspVar) {
        axfd axfdVar = this.l;
        String str = jspVar.a;
        jsq jsqVarY = axfdVar.Y(str);
        if (jsqVarY == null || !jsqVarY.c.remove(jspVar)) {
            return;
        }
        jspVar.e.delete();
        this.t -= jspVar.c;
        axfdVar.ad(jsqVarY.b);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((jsj) arrayList.get(i)).c(jspVar);
        }
        ArrayList arrayList2 = (ArrayList) this.o.get(str);
        if (arrayList2 != null) {
            for (jsj jsjVar : aguu.t(arrayList2)) {
                if (!arrayList.contains(jsjVar)) {
                    jsjVar.c(jspVar);
                }
            }
        }
        this.b.c(jspVar);
    }

    private final void x() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) this.l.d).values().iterator();
        while (it.hasNext()) {
            for (jsp jspVar : ((jsq) it.next()).c) {
                if (jspVar.e.length() != jspVar.c) {
                    arrayList.add(jspVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            w((jsp) arrayList.get(i));
        }
    }

    private static synchronized void y(File file, boolean z) {
        if (z) {
            try {
                n.remove(file.getCanonicalPath());
            } catch (IOException e) {
                hna.ac("Unable to remove cache dir from lockedCacheDirsV2", e);
            }
        } else {
            m.remove(file.getAbsoluteFile());
        }
    }

    private final boolean z() {
        if (!this.f) {
            return this.u;
        }
        try {
            return !n.contains(this.a.getCanonicalPath());
        } catch (IOException e) {
            hna.ac("Exception thrown when checking if cache folder is locked", e);
            return false;
        }
    }

    @Override // defpackage.jsk
    public final synchronized long a() {
        if (this.u) {
            return 0L;
        }
        return this.t;
    }

    @Override // defpackage.jsk
    public final synchronized jsu d(String str) {
        jsv jsvVar;
        if (this.u) {
            jsvVar = jsv.a;
        } else {
            jsq jsqVarY = this.l.Y(str);
            jsvVar = jsqVarY != null ? jsqVarY.d : jsv.a;
        }
        return jsvVar;
    }

    @Override // defpackage.jsk
    public final synchronized File e(String str, long j, long j2) {
        if (this.u) {
            return null;
        }
        t();
        jsq jsqVarY = this.l.Y(str);
        jsqVarY.getClass();
        ahno.O(jsqVarY.e);
        File file = this.a;
        if (!file.exists()) {
            file.mkdirs();
            x();
        }
        this.b.h(this, j2);
        File file2 = new File(file, Integer.toString(this.q.nextInt(10)));
        if (!file2.exists()) {
            file2.mkdir();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = jsqVarY.a;
        int i2 = jtd.g;
        return rpi.I(file2, i, j, jCurrentTimeMillis);
    }

    @Override // defpackage.jsk
    public final /* synthetic */ File f(String str, long j, long j2, ypq ypqVar) {
        return e(str, j, j2);
    }

    @Override // defpackage.jsk
    public final synchronized NavigableSet g(String str) {
        TreeSet treeSet;
        if (this.u) {
            treeSet = new TreeSet();
        } else {
            jsq jsqVarY = this.l.Y(str);
            treeSet = (jsqVarY == null || jsqVarY.b()) ? new TreeSet() : new TreeSet((Collection) jsqVarY.c);
        }
        return treeSet;
    }

    @Override // defpackage.jsk
    public final synchronized Set h() {
        if (this.u) {
            return new HashSet();
        }
        return new HashSet(this.l.aa());
    }

    @Override // defpackage.jsk
    public final synchronized void i(File file, long j) {
        if (this.u || !file.exists()) {
            return;
        }
        if (j == 0) {
            file.delete();
            return;
        }
        axfd axfdVar = this.l;
        jtd jtdVarD = jtd.d(file, j, axfdVar, this.e);
        jtdVarD.getClass();
        jsq jsqVarY = axfdVar.Y(jtdVarD.a);
        jsqVarY.getClass();
        ahno.O(jsqVarY.e);
        long jA = jsqVarY.d.a();
        if (jA != -1) {
            ahno.O(jtdVarD.b + jtdVarD.c <= jA);
        }
        v(jtdVarD);
        try {
            axfdVar.ab();
            notifyAll();
        } catch (IOException e) {
            if (this.f) {
                hna.ad(this.e, jsq.c(e, "exception thrown when storing contentIndex when calling commitFile, with message: ", ", with stack trace: "), e);
            }
            throw new jsi(e);
        }
    }

    @Override // defpackage.jsk
    public final /* synthetic */ void j(File file, long j, ypq ypqVar) {
        i(file, j);
    }

    @Override // defpackage.jsk
    public final synchronized void k() {
        if (z()) {
            return;
        }
        this.o.clear();
        this.p.clear();
        x();
        try {
            try {
                this.l.ab();
            } catch (IOException e) {
                if (this.f) {
                    hna.ad(this.e, jsq.c(e, "exception thrown when storing contentIndex when calling release, with message: ", ", with stack trace: "), e);
                }
                bvx.d("SimpleCache", "Storing index file failed", e);
            }
            y(this.a, this.g);
            this.u = true;
        } catch (Throwable th) {
            y(this.a, this.g);
            this.u = true;
            throw th;
        }
    }

    @Override // defpackage.jsk
    public final synchronized void l(jsp jspVar) {
        if (this.u) {
            return;
        }
        axfd axfdVar = this.l;
        jsq jsqVarY = axfdVar.Y(jspVar.a);
        jsqVarY.getClass();
        ahno.O(jsqVarY.e);
        jsqVarY.e = false;
        if (this.s && !jsqVarY.b()) {
            hna.ad(this.e, "releaseHoleSpan (cachedContent.key=" + jsqVarY.b + "id=" + jsqVarY.a + ')', null);
        }
        axfdVar.ad(jsqVarY.b);
        notifyAll();
    }

    @Override // defpackage.jsk
    public final synchronized void m(jsp jspVar) {
        if (!this.u) {
            w(jspVar);
        }
    }

    @Override // defpackage.jsk
    public final synchronized boolean n(jsj jsjVar) {
        return this.p.add(jsjVar);
    }

    @Override // defpackage.jsk
    public final synchronized boolean o(String str, long j, long j2) {
        long jMin;
        if (this.u) {
            return false;
        }
        jsq jsqVarY = this.l.Y(str);
        if (jsqVarY != null) {
            jtd jtdVarA = jsqVarY.a(j);
            if (jtdVarA.b()) {
                jMin = -Math.min(jtdVarA.c() ? Long.MAX_VALUE : jtdVarA.c, j2);
            } else {
                long j3 = j + j2;
                long jMax = jtdVarA.b + jtdVarA.c;
                if (jMax < j3) {
                    for (jtd jtdVar : jsqVarY.c.tailSet(jtdVarA, false)) {
                        long j4 = jtdVar.b;
                        if (j4 > jMax) {
                            break;
                        }
                        jMax = Math.max(jMax, j4 + jtdVar.c);
                        if (jMax >= j3) {
                            break;
                        }
                    }
                }
                jMin = Math.min(jMax - j, j2);
            }
            if (jMin >= j2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jsk
    public final synchronized boolean p(jsj jsjVar) {
        return this.p.remove(jsjVar);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, jss] */
    @Override // defpackage.jsk
    public final synchronized void q(String str, kyr kyrVar) {
        if (z()) {
            hna.ad(this.e, "applyContentMetadataMutations was called after SimpleCache was released", null);
            return;
        }
        t();
        axfd axfdVar = this.l;
        jsq jsqVarZ = axfdVar.Z(str);
        jsv jsvVar = jsqVarZ.d;
        jsqVarZ.d = jsvVar.b(kyrVar);
        if (!jsqVarZ.d.equals(jsvVar)) {
            axfdVar.c.g();
        }
        try {
            axfdVar.ab();
        } catch (IOException e) {
            if (this.f) {
                hna.ad(this.e, jsq.c(e, "exception thrown when storing contentIndex when calling applyContentMetadataMutations, with message: ", ", with stack trace: "), e);
            }
            throw new jsi(e);
        }
    }

    @Override // defpackage.jsk
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final synchronized jtd b(String str, long j) {
        if (this.u) {
            return null;
        }
        t();
        while (true) {
            jtd jtdVarC = c(str, j);
            if (jtdVarC != null) {
                return jtdVarC;
            }
            wait();
        }
    }

    @Override // defpackage.jsk
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final synchronized jtd c(String str, long j) {
        jtd jtdVar;
        String str2;
        jtd jtdVar2;
        File file;
        jtd jtdVarA;
        if (this.u) {
            return null;
        }
        t();
        axfd axfdVar = this.l;
        jsq jsqVarY = axfdVar.Y(str);
        if (jsqVarY != null) {
            while (true) {
                jtdVarA = jsqVarY.a(j);
                if (!this.v || !jtdVarA.d) {
                    break;
                }
                if (jtdVarA.e.length() == jtdVarA.c) {
                    break;
                }
                x();
            }
            jtdVar = jtdVarA;
            str2 = str;
        } else {
            str2 = str;
            jtdVar = new jtd(str2, j, -1L, -9223372036854775807L, null);
        }
        if (!jtdVar.d) {
            jsq jsqVarZ = axfdVar.Z(str2);
            if (jsqVarZ.e) {
                return null;
            }
            jsqVarZ.e = true;
            return jtdVar;
        }
        if (this.r) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jsq jsqVarY2 = axfdVar.Y(str2);
            TreeSet treeSet = jsqVarY2.c;
            ahno.O(treeSet.remove(jtdVar));
            File file2 = jtdVar.e;
            long j2 = jtdVar.b;
            File fileI = rpi.I(file2.getParentFile(), jsqVarY2.a, j2, jCurrentTimeMillis);
            if (file2.renameTo(fileI)) {
                file = fileI;
            } else {
                bvx.e("CachedContent", "Failed to rename " + String.valueOf(file2) + " to " + fileI.toString());
                file = file2;
            }
            String str3 = jtdVar.a;
            jtd jtdVar3 = new jtd(str3, j2, jtdVar.c, jCurrentTimeMillis, file);
            treeSet.add(jtdVar3);
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jsj) arrayList.get(i)).b(this, jtdVar, jtdVar3);
            }
            ArrayList arrayList2 = (ArrayList) this.o.get(str3);
            if (arrayList2 != null) {
                for (jsj jsjVar : aguu.t(arrayList2)) {
                    if (!arrayList.contains(jsjVar)) {
                        jsjVar.b(this, jtdVar, jtdVar3);
                    }
                }
            }
            this.b.b(this, jtdVar, jtdVar3);
            jtdVar2 = jtdVar3;
        } else {
            jtdVar2 = jtdVar;
        }
        return jtdVar2;
    }

    public final synchronized void t() {
        if (this.g && !this.c) {
            jsi jsiVar = new jsi("Cache initialization failed to complete");
            hna.ac("SimpleCache checkInitialization; cache initialization failed to complete", jsiVar);
            throw jsiVar;
        }
        jsi jsiVar2 = this.i;
        if (jsiVar2 != null) {
            throw jsiVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, jss] */
    public final void u(File file, boolean z, File[] fileArr) {
        int length;
        axfd axfdVar;
        jtd jtdVarD;
        int size;
        int size2;
        long length2;
        int i;
        File[] fileArr2 = fileArr;
        if (fileArr2 == null || (length = fileArr2.length) == 0) {
            if (z || !file.delete()) {
                return;
            }
            hna.ad(this.e, "Deleting directory in loadDirectory: files arg = null or files.length = 0 and isRoot=false", null);
            return;
        }
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            File file2 = fileArr2[i2];
            String name = file2.getName();
            if (z) {
                if (name.indexOf(46) == -1) {
                    u(file2, z2, file2.listFiles());
                } else if (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid")) {
                    axfdVar = this.l;
                    jtdVarD = jtd.d(file2, -1L, axfdVar, this.e);
                    if (jtdVarD != null) {
                        this.h++;
                        v(jtdVarD);
                    } else {
                        size = axfdVar.aa().size();
                        size2 = ((SparseArray) axfdVar.e).size();
                        length2 = file2.length();
                        Files.delete(FileRetargetClass.toPath(file2));
                        xeu xeuVar = this.e;
                        ?? r15 = this.l.c;
                        boolean zD = r15.d();
                        boolean zC = r15.c();
                        boolean zE = r15.e();
                        StringBuilder sb = new StringBuilder();
                        i = length;
                        sb.append("Deleting file in loadDirectory: Span could not be created so deleting file ");
                        sb.append(name);
                        sb.append(" (size = ");
                        sb.append(length2);
                        sb.append("), contentIndexSize = ");
                        sb.append(size);
                        sb.append(", contentIndexIdCount = ");
                        sb.append(size2);
                        sb.append(", wasHashCodeMismatchDetectedOnInit = ");
                        sb.append(zD);
                        sb.append(", wasExpectedEofFoundOnInit = ");
                        sb.append(zC);
                        sb.append(", wasIoExceptionDetectedOnInit = ");
                        sb.append(zE);
                        hna.ad(xeuVar, sb.toString(), null);
                    }
                }
                i = length;
            } else {
                axfdVar = this.l;
                jtdVarD = jtd.d(file2, -1L, axfdVar, this.e);
                if (jtdVarD != null) {
                    this.h++;
                    v(jtdVarD);
                    i = length;
                } else {
                    size = axfdVar.aa().size();
                    size2 = ((SparseArray) axfdVar.e).size();
                    try {
                        length2 = file2.length();
                    } catch (Exception unused) {
                        length2 = 0;
                    }
                    try {
                        Files.delete(FileRetargetClass.toPath(file2));
                        xeu xeuVar2 = this.e;
                        ?? r16 = this.l.c;
                        boolean zD2 = r16.d();
                        boolean zC2 = r16.c();
                        boolean zE2 = r16.e();
                        StringBuilder sb2 = new StringBuilder();
                        i = length;
                        try {
                            sb2.append("Deleting file in loadDirectory: Span could not be created so deleting file ");
                            sb2.append(name);
                            sb2.append(" (size = ");
                            sb2.append(length2);
                            sb2.append("), contentIndexSize = ");
                            sb2.append(size);
                            sb2.append(", contentIndexIdCount = ");
                            sb2.append(size2);
                            sb2.append(", wasHashCodeMismatchDetectedOnInit = ");
                            sb2.append(zD2);
                            sb2.append(", wasExpectedEofFoundOnInit = ");
                            sb2.append(zC2);
                            sb2.append(", wasIoExceptionDetectedOnInit = ");
                            sb2.append(zE2);
                            hna.ad(xeuVar2, sb2.toString(), null);
                        } catch (IOException e) {
                            e = e;
                            hna.ad(this.e, "Deleting file in loadDirectory: failed to delete file " + name + " (size = " + length2 + "), contentIndexSize = " + size + ", contentIndexIdCount = " + size2 + ", with exception " + e.getMessage() + ", with stack trace: " + Log.getStackTraceString(e), e);
                        } catch (RuntimeException e2) {
                            e = e2;
                            hna.ad(this.e, "Deleting file in loadDirectory: failed to delete file " + name + " (size = " + length2 + "), contentIndexSize = " + size + ", contentIndexIdCount = " + size2 + ", with exception " + e.getMessage() + ", with stack trace: " + Log.getStackTraceString(e), e);
                        }
                    } catch (IOException | RuntimeException e3) {
                        e = e3;
                        i = length;
                    }
                }
            }
            i2++;
            fileArr2 = fileArr;
            length = i;
            z2 = false;
        }
    }
}
