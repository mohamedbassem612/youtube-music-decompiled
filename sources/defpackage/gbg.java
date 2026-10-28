package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.protobuf.ExtensionRegistryLite;
import dalvik.system.DexClassLoader;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbg {
    public final Context a;
    public ExecutorService b;
    public DexClassLoader c;
    public gav d;
    public byte[] e;
    public final boolean h;
    public gak j;
    public gbd m;
    public dov n;
    private final Map p;
    public volatile jwb f = null;
    public volatile boolean g = false;
    public volatile fxl i = null;
    private Future o = null;
    public boolean k = false;
    public boolean l = false;

    public gbg(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.p = new HashMap();
        if (this.m == null) {
            this.m = new gbd(context);
        }
    }

    public static final void e(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            String.format("File %s not found. No need for deletion", file.getAbsolutePath());
        }
    }

    public final int a() {
        if (this.j == null) {
            return Integer.MIN_VALUE;
        }
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (gak.b == null) {
                synchronized (gak.class) {
                    if (gak.b == null) {
                        gak.b = new Random();
                    }
                }
            }
            return gak.b.nextInt();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final fxl b() {
        dov dovVar = this.n;
        if (dovVar == null) {
            return this.i;
        }
        if (!dovVar.a.isDone()) {
            return fxl.a;
        }
        try {
            return (fxl) this.n.a.get();
        } catch (InterruptedException | ExecutionException unused) {
            return fxl.a;
        }
    }

    public final Method c(String str, String str2) {
        gcq gcqVar = (gcq) this.p.get(new Pair(str, str2));
        if (gcqVar == null) {
            return null;
        }
        if (gcqVar.d != null) {
            return gcqVar.d;
        }
        try {
            if (gcqVar.f.await(2L, TimeUnit.SECONDS)) {
                return gcqVar.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Future] */
    public final Future d() {
        dov dovVar = this.n;
        return dovVar != null ? dovVar.a : this.o;
    }

    public final void f(int i) {
        if (this.k) {
            Future<?> futureSubmit = this.b.submit(new awu(this, i, 6, (byte[]) null));
            if (i == 0) {
                this.o = futureSubmit;
            }
        }
    }

    public final void g(File file) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1787936389793"));
        if (!file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1787936389793"));
        if (file3.exists()) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                long length = file2.length();
                if (length <= 0) {
                    e(file2);
                    return;
                }
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            e(file2);
                        } else {
                            try {
                                fxm fxmVar = (fxm) aihn.parseFrom(fxm.a, bArr, ExtensionRegistryLite.a);
                                if ("1787936389793".equals(new String(fxmVar.e.G())) && Arrays.equals(fxmVar.d.G(), fzu.b(fxmVar.c.G())) && Arrays.equals(fxmVar.f.G(), Build.VERSION.SDK.getBytes())) {
                                    byte[] bArrB = this.d.b(this.e, new String(fxmVar.c.G()));
                                    file3.createNewFile();
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(bArrB, 0, bArrB.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                    } catch (gau | IOException | NoSuchAlgorithmException unused2) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (IOException unused5) {
                                            throw th;
                                        }
                                    }
                                    fileOutputStream.close();
                                }
                                e(file2);
                            } catch (NullPointerException unused6) {
                            }
                        }
                        fileInputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (gau | IOException | NoSuchAlgorithmException unused7) {
                    fileOutputStream = null;
                }
            } catch (IOException unused8) {
            }
        } catch (gau | IOException | NoSuchAlgorithmException unused9) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final void h(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        Map map = this.p;
        if (map.containsKey(pair)) {
            return;
        }
        map.put(pair, new gcq(this, str, str2, clsArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        if (r13 != null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.io.File r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbg.i(java.io.File):void");
    }
}
