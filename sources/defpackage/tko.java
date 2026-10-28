package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tko {
    public final tqj a;
    public final Object b;
    public tkq c;
    public awuz d;
    public boolean e;
    public int f;
    private final Context g;
    private final awut h;
    private final Executor i;
    private final awmi j;
    private final awmi k;
    private final awmi l;
    private final tir m;

    public tko(Context context, tir tirVar, awut awutVar, Executor executor, tqj tqjVar) {
        context.getClass();
        tirVar.getClass();
        awutVar.getClass();
        executor.getClass();
        tqjVar.getClass();
        this.g = context;
        this.m = tirVar;
        this.h = awutVar;
        this.i = executor;
        this.a = tqjVar;
        this.j = new awmp(new ebk(this, 16));
        this.k = new awmp(new ebk(this, 17));
        this.b = new Object();
        this.f = 1;
        this.l = new awmp(new ebk(this, 18));
    }

    private final String h() {
        return (String) this.l.a();
    }

    public final int a() {
        return ((Number) this.j.a()).intValue();
    }

    public final long b() {
        return ((Number) this.k.a()).longValue();
    }

    public final tkq c() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.g.getFilesDir(), "brotli_dictionary"));
            try {
                tkp tkpVar = (tkp) tkp.parseDelimitedFrom(tkp.a, fileInputStream);
                if (tkpVar == null) {
                    twu.d("Shrinky", 6, "Dictionary file on disk is corrupt.", null);
                } else if (awrc.c(tkpVar.b, h())) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.getClass();
                    long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                    if (size > 0) {
                        MappedByteBuffer map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, fileChannelConvertMaybeLegacyFileChannelFromLibrary.position(), size);
                        map.getClass();
                        int i = agxm.b;
                        byte[] bArrE = agxl.a.a(map.duplicate()).e();
                        bArrE.getClass();
                        twu.d("Shrinky", 4, "Successfully loaded dictionary from disk.", null);
                        tkq tkqVar = new tkq(bArrE, map);
                        fileInputStream.close();
                        return tkqVar;
                    }
                    twu.d("Shrinky", 6, "Dictionary file on disk is corrupt (non-positive length).", null);
                } else {
                    twu.d("Shrinky", 6, "Dictionary file on disk is from an outdated URL.", null);
                }
                fileInputStream.close();
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                        throw th2;
                    }
                }
            }
        } catch (FileNotFoundException unused) {
            twu.d("Shrinky", 4, "Shrinky dictionary not found on disk", null);
            return null;
        } catch (IOException e) {
            twu.d("Shrinky", 6, "Failed to read shrinky dictionary from disk", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(awoq awoqVar) throws Throwable {
        tkm tkmVar;
        if (awoqVar instanceof tkm) {
            tkmVar = (tkm) awoqVar;
            int i = tkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkmVar.c = i - Integer.MIN_VALUE;
            } else {
                tkmVar = new tkm(this, awoqVar);
            }
        } else {
            tkmVar = new tkm(this, awoqVar);
        }
        Object objAd = tkmVar.a;
        awox awoxVar = awox.a;
        int i2 = tkmVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objAd);
                if (h().length() != 0) {
                    ListenableFuture listenableFutureC = this.m.c(new tkl(h()));
                    listenableFutureC.getClass();
                    tkmVar.c = 1;
                    objAd = awrc.ad(listenableFutureC, tkmVar);
                    if (objAd == awoxVar) {
                        return awoxVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objAd);
            objAd.getClass();
            tnx tnxVar = (tnx) objAd;
            if (tnxVar.h()) {
                twu.d("Shrinky", 4, "Dictionary download request completed successfully.", null);
                ByteBuffer byteBuffer = (ByteBuffer) tnxVar.c().a;
                if (byteBuffer != null) {
                    int i3 = agxm.b;
                    byte[] bArrE = agxl.a.a(byteBuffer.duplicate()).e();
                    bArrE.getClass();
                    tkq tkqVar = new tkq(bArrE, byteBuffer);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.g.getFilesDir(), "brotli_dictionary"));
                        try {
                            aihf aihfVarCreateBuilder = tkp.a.createBuilder();
                            aihfVarCreateBuilder.getClass();
                            String strH = h();
                            strH.getClass();
                            aihfVarCreateBuilder.copyOnWrite();
                            ((tkp) aihfVarCreateBuilder.instance).b = strH;
                            aihn aihnVarBuild = aihfVarCreateBuilder.build();
                            aihnVarBuild.getClass();
                            ((tkp) aihnVarBuild).writeDelimitedTo(fileOutputStream);
                            DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).write(tkqVar.b.duplicate());
                            fileOutputStream.close();
                            twu.d("Shrinky", 4, "Successfully parsed dictionary from URL response", null);
                            return tkqVar;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    avkz.d(th, th3);
                                }
                                throw th2;
                            }
                        }
                    } catch (IOException e) {
                        twu.d("Shrinky", 6, "Failed to write shrinky dictionary to disk", e);
                    }
                }
            } else {
                twu.d("Shrinky", 4, "Dictionary download request completed with an error response.", null);
            }
        } catch (Throwable th4) {
            twu.d("Shrinky", 6, "Dictionary download future failed", th4);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(awoq awoqVar) throws Throwable {
        tkn tknVar;
        boolean z;
        tkq tkqVar;
        tkq tkqVarC;
        if (awoqVar instanceof tkn) {
            tknVar = (tkn) awoqVar;
            int i = tknVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tknVar.c = i - Integer.MIN_VALUE;
            } else {
                tknVar = new tkn(this, awoqVar);
            }
        } else {
            tknVar = new tkn(this, awoqVar);
        }
        Object objD = tknVar.a;
        Object obj = awox.a;
        int i2 = tknVar.c;
        try {
            if (i2 == 0) {
                atqp.j(objD);
                synchronized (this.b) {
                    if (this.e) {
                        z = false;
                    } else {
                        this.e = true;
                        z = true;
                    }
                }
                if (z) {
                    tkqVarC = c();
                } else {
                    synchronized (this.b) {
                        tkqVar = this.c;
                    }
                    tkqVarC = tkqVar;
                }
                if (tkqVarC != null) {
                    return tkqVarC;
                }
                synchronized (this.b) {
                    this.f = 3;
                }
                tknVar.c = 1;
                objD = d(tknVar);
                if (objD == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objD);
            }
            tkq tkqVar2 = (tkq) objD;
            synchronized (this.b) {
                this.f = 2;
            }
            return tkqVar2;
        } catch (Throwable th) {
            synchronized (this.b) {
                this.f = 2;
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.b) {
            if (this.f == 1) {
                this.f = 2;
                this.d = awro.r(this.h, awov.a, 1, new bej(this, (awoq) null, 11));
            }
        }
    }

    public final void g(boolean z) {
        synchronized (this.b) {
            if (this.f == 1) {
                if (z) {
                    this.i.execute(afwl.i(new szq(this, 2)));
                } else {
                    f();
                }
            }
        }
    }
}
