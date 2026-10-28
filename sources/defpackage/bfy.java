package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfy implements bdt {
    public final Function0 a;
    public final ayq c;
    private final File d;
    private final bgh e;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final axff f = new axfi(false);

    public bfy(File file, bgh bghVar, ayq ayqVar, Function0 function0) {
        this.d = file;
        this.e = bghVar;
        this.c = ayqVar;
        this.a = function0;
    }

    private final void d() {
        if (this.b.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // defpackage.bdt
    public final void a() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:30:0x006f, B:40:0x0083, B:39:0x0080, B:36:0x007b), top: B:45:0x001f, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [awql] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    public final Object b(awql awqlVar, awoq awoqVar) throws Throwable {
        bfw bfwVar;
        ?? B;
        Throwable th;
        Throwable th2;
        bft bftVar;
        ?? r8;
        if (awoqVar instanceof bfw) {
            bfwVar = (bfw) awoqVar;
            int i = bfwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfwVar.d = i - Integer.MIN_VALUE;
            } else {
                bfwVar = new bfw(this, awoqVar);
            }
        } else {
            bfwVar = new bfw(this, awoqVar);
        }
        Object obj = bfwVar.b;
        awox awoxVar = awox.a;
        int i2 = bfwVar.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awqlVar = bfwVar.a;
                bftVar = bfwVar.e;
                try {
                    atqp.j(obj);
                    r8 = awqlVar;
                    try {
                        bftVar.a();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        this.f.c();
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        bftVar.a();
                    } catch (Throwable th5) {
                        avkz.d(th2, th5);
                    }
                    throw th2;
                }
            }
            atqp.j(obj);
            d();
            B = this.f.b();
            try {
                bft bftVar2 = new bft(this.d, this.e);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) B);
                    bfwVar.e = bftVar2;
                    bfwVar.a = B;
                    bfwVar.d = 1;
                    Object objInvoke = awqlVar.invoke(bftVar2, boolValueOf, bfwVar);
                    if (objInvoke == awoxVar) {
                        return awoxVar;
                    }
                    obj = objInvoke;
                    r8 = B == true ? 1 : 0;
                    bftVar = bftVar2;
                    bftVar.a();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        this.f.c();
                    }
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    awqlVar = B == true ? 1 : 0;
                    bftVar = bftVar2;
                    bftVar.a();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                if (B != 0) {
                    this.f.c();
                }
                throw th;
            }
        } catch (Throwable th8) {
            B = awqlVar;
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb A[Catch: all -> 0x00f4, IOException -> 0x00f7, TRY_ENTER, TryCatch #8 {IOException -> 0x00f7, all -> 0x00f4, blocks: (B:37:0x00cb, B:39:0x00d4, B:41:0x00e5, B:48:0x00f3, B:47:0x00f0), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[Catch: all -> 0x00f4, IOException -> 0x00f7, TRY_LEAVE, TryCatch #8 {IOException -> 0x00f7, all -> 0x00f4, blocks: (B:37:0x00cb, B:39:0x00d4, B:41:0x00e5, B:48:0x00f3, B:47:0x00f0), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5 A[Catch: all -> 0x00f4, IOException -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00f7, all -> 0x00f4, blocks: (B:37:0x00cb, B:39:0x00d4, B:41:0x00e5, B:48:0x00f3, B:47:0x00f0), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [axff] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    public final Object c(awqk awqkVar, awoq awoqVar) throws Throwable {
        bfx bfxVar;
        ?? file;
        axff axffVar;
        bft bftVar;
        Throwable th;
        bft bftVar2;
        axff axffVar2;
        ?? r2;
        if (awoqVar instanceof bfx) {
            bfxVar = (bfx) awoqVar;
            int i = bfxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfxVar.d = i - Integer.MIN_VALUE;
            } else {
                bfxVar = new bfx(this, awoqVar);
            }
        } else {
            bfxVar = new bfx(this, awoqVar);
        }
        ?? r10 = bfxVar.b;
        awox awoxVar = awox.a;
        int i2 = bfxVar.d;
        Throwable th2 = null;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            atqp.j(r10);
                            d();
                            File file2 = this.d;
                            File parentFile = file2.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    Objects.toString(file2);
                                    throw new IOException("Unable to create parent directories of ".concat(file2.toString()));
                                }
                            }
                            axffVar = this.f;
                            bfxVar.e = (bfo) awqkVar;
                            bfxVar.f = (axfi) axffVar;
                            bfxVar.d = 1;
                            if (axffVar.a(bfxVar) == awoxVar) {
                                return awoxVar;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bftVar2 = bfxVar.g;
                                Object obj = bfxVar.a;
                                axffVar2 = bfxVar.f;
                                try {
                                    atqp.j(r10);
                                    r2 = obj;
                                    try {
                                        bftVar2.a();
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                    }
                                    if (th2 == null) {
                                        throw th2;
                                    }
                                    if (((File) r2).exists()) {
                                        File file3 = this.d;
                                        r2.getClass();
                                        bds.a((File) r2, file3);
                                    }
                                    axffVar2.c();
                                    return awmy.a;
                                } catch (Throwable th4) {
                                    th = th4;
                                    try {
                                        bftVar2.a();
                                    } catch (Throwable th5) {
                                        avkz.d(th, th5);
                                    }
                                    throw th;
                                }
                            }
                            axfi axfiVar = bfxVar.f;
                            bfo bfoVar = bfxVar.e;
                            atqp.j(r10);
                            axffVar = axfiVar;
                            awqkVar = bfoVar;
                        }
                        bfxVar.e = null;
                        bfxVar.f = (axfi) axffVar;
                        bfxVar.a = file;
                        bfxVar.g = bftVar;
                        bfxVar.d = 2;
                        if (awqkVar.invoke(bftVar, bfxVar) == awoxVar) {
                            return awoxVar;
                        }
                        axffVar2 = axffVar;
                        r2 = file;
                        bftVar2 = bftVar;
                        bftVar2.a();
                        if (th2 == null) {
                            throw th2;
                        }
                        if (((File) r2).exists()) {
                            File file4 = this.d;
                            r2.getClass();
                            bds.a((File) r2, file4);
                        }
                        axffVar2.c();
                        return awmy.a;
                    } catch (Throwable th6) {
                        th = th6;
                        bftVar2 = bftVar;
                        bftVar2.a();
                        throw th;
                    }
                    bftVar = new bft(file, this.e);
                } catch (IOException e) {
                    e = e;
                    if (((File) file).exists()) {
                        ((File) file).delete();
                    }
                    throw new IOException("Unable to rename " + file + " to " + this.d + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.", e);
                }
                file = new File(this.d.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                th = th7;
                r10.c();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            file = awoxVar;
        } catch (Throwable th8) {
            th = th8;
            r10 = bfxVar;
            r10.c();
            throw th;
        }
    }
}
