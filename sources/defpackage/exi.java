package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class exi implements exe {
    private final File a;
    private esw b;
    private final kyr d = new kyr((byte[]) null, (byte[]) null, (byte[]) null);
    private final kyr c = new kyr((char[]) null);

    protected exi(File file) {
        this.a = file;
    }

    private final synchronized esw d() {
        esw eswVar;
        eswVar = this.b;
        if (eswVar == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    esw.f(file2, file3, false);
                }
            }
            esw eswVar2 = new esw(file);
            if (eswVar2.b.exists()) {
                try {
                    eswVar2.d();
                    esw.c(eswVar2.c);
                    Iterator it = eswVar2.g.values().iterator();
                    while (it.hasNext()) {
                        esu esuVar = (esu) it.next();
                        if (esuVar.e == null) {
                            for (int i = 0; i < eswVar2.d; i = 1) {
                                eswVar2.e += esuVar.b[0];
                            }
                        } else {
                            esuVar.e = null;
                            for (int i2 = 0; i2 < eswVar2.d; i2 = 1) {
                                esw.c(esuVar.c());
                                esw.c(esuVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    eswVar2.b();
                    file.mkdirs();
                    eswVar2 = new esw(file);
                    eswVar2.e();
                }
                eswVar = eswVar2;
                this.b = eswVar;
            }
            file.mkdirs();
            eswVar2 = new esw(file);
            eswVar2.e();
            eswVar = eswVar2;
            this.b = eswVar;
        }
        return eswVar;
    }

    private final synchronized void e() {
        this.b = null;
    }

    @Override // defpackage.exe
    public final File a(ett ettVar) {
        try {
            esv esvVarA = d().a(this.c.I(ettVar));
            if (esvVarA == null) {
                return null;
            }
            return new File(esvVarA.b.a, esvVarA.a + ".0");
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.exe
    public final synchronized void b() {
        try {
            try {
                d().b();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
            e();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [eth, java.lang.Object] */
    @Override // defpackage.exe
    public final void c(ett ettVar, xsc xscVar) {
        rik rikVar;
        File fileD;
        rik rikVar2;
        String strI = this.c.I(ettVar);
        kyr kyrVar = this.d;
        synchronized (kyrVar) {
            rikVar = (rik) kyrVar.b.get(strI);
            if (rikVar == null) {
                ?? r1 = ((elq) kyrVar.a).a;
                synchronized (r1) {
                    try {
                        rikVar2 = (rik) r1.poll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                rikVar = rikVar2 == null ? new rik((char[]) null) : rikVar2;
                kyrVar.b.put(strI, rikVar);
            }
            rikVar.b++;
        }
        rikVar.a.lock();
        try {
            try {
                esw eswVarD = d();
                if (eswVarD.a(strI) == null) {
                    rvp rvpVarK = eswVarD.k(strI);
                    if (rvpVarK == null) {
                        throw new IllegalStateException(a.ce(strI, "Had two simultaneous puts for: "));
                    }
                    try {
                        Object obj = rvpVarK.d;
                        synchronized (obj) {
                            Object obj2 = rvpVarK.c;
                            if (((esu) obj2).e != rvpVarK) {
                                throw new IllegalStateException();
                            }
                            if (!((esu) obj2).c) {
                                ((boolean[]) rvpVarK.b)[0] = true;
                            }
                            fileD = ((esu) obj2).d();
                            ((esw) obj).a.mkdirs();
                        }
                        if (xscVar.b.a(xscVar.c, fileD, (ety) xscVar.a)) {
                            ((esw) obj).j(rvpVarK, true);
                            rvpVarK.a = true;
                        }
                        rvpVarK.b();
                    } catch (Throwable th2) {
                        rvpVarK.b();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                this.d.J(strI);
                throw th3;
            }
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
            }
        }
        this.d.J(strI);
    }
}
