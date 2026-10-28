package defpackage;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kwv {
    private static final HashMap c = new HashMap();
    public final Object a = new Object();
    public aamo b;
    private final Context d;
    private final kww e;
    private final kwc f;
    private final kto g;
    private final boolean h;

    public kwv(Context context, kww kwwVar, kwc kwcVar, kto ktoVar, boolean z) {
        this.d = context;
        this.e = kwwVar;
        this.f = kwcVar;
        this.g = ktoVar;
        this.h = z;
    }

    private final synchronized Class c(aepb aepbVar) {
        Class clsLoadClass;
        Object obj = aepbVar.c;
        if (obj == null) {
            throw new kwu(4010, "mc");
        }
        String str = ((gcz) obj).c;
        HashMap map = c;
        clsLoadClass = (Class) map.get(str);
        if (clsLoadClass == null) {
            try {
                kto ktoVar = this.g;
                Object obj2 = aepbVar.b;
                if (!ktoVar.a((File) obj2)) {
                    throw new kwu(2026, "VM did not pass signature verification");
                }
                try {
                    Object obj3 = aepbVar.a;
                    if (!((File) obj3).exists()) {
                        ((File) obj3).mkdirs();
                    }
                    clsLoadClass = new DexClassLoader(((File) obj2).getAbsolutePath(), ((File) obj3).getAbsolutePath(), null, this.d.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(str, clsLoadClass);
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new kwu(2008, e);
                }
            } catch (GeneralSecurityException e2) {
                throw new kwu(2026, e2);
            }
        }
        return clsLoadClass;
    }

    public final aamo a() {
        aamo aamoVar;
        synchronized (this.a) {
            aamoVar = this.b;
        }
        return aamoVar;
    }

    public final boolean b(aepb aepbVar) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Constructor declaredConstructor = c(aepbVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE);
                Context context = this.d;
                FileInputStream fileInputStream2 = null;
                if (aepbVar.d == null) {
                    try {
                        fileInputStream = new FileInputStream((File) aepbVar.e);
                        try {
                            bArrG = aigj.I(fileInputStream).G();
                            yno.I(fileInputStream);
                        } catch (IOException unused) {
                            yno.I(fileInputStream);
                            bArrG = null;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            yno.I(fileInputStream2);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    aepbVar.d = bArrG;
                }
                Object obj = aepbVar.d;
                aamo aamoVar = new aamo(declaredConstructor.newInstance(context, "msa-r", obj == null ? null : Arrays.copyOf((byte[]) obj, ((byte[]) obj).length), null, new Bundle(), 2), aepbVar, this.e, this.f, this.h);
                if (!aamoVar.k()) {
                    throw new kwu(4000, "init failed");
                }
                int i = aamoVar.i();
                if (i != 0) {
                    throw new kwu(4001, a.bR(i, "ci: "));
                }
                synchronized (this.a) {
                    try {
                        aamo aamoVar2 = this.b;
                        if (aamoVar2 != null) {
                            try {
                                aamoVar2.j();
                            } catch (kwu e) {
                                this.f.c(e.a, -1L, e);
                            }
                        }
                        this.b = aamoVar;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.f.d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new kwu(2004, e2);
            }
        } catch (kwu e3) {
            this.f.c(e3.a, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.f.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
