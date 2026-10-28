package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bls {
    public final Object a = new Object();
    public Handler b;
    public HandlerThread c;
    public blt d;
    qcb e;
    private final Context f;
    private final awy g;
    private ContentObserver h;
    private Runnable i;

    public bls(Context context, awy awyVar) {
        azs.m(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = awyVar;
    }

    private final void b() {
        this.e = null;
        ContentObserver contentObserver = this.h;
        if (contentObserver != null) {
            this.f.getContentResolver().unregisterContentObserver(contentObserver);
            this.h = null;
        }
        synchronized (this.a) {
            this.b.removeCallbacks(this.i);
            HandlerThread handlerThread = this.c;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.b = null;
            this.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060 A[Catch: all -> 0x009b, TryCatch #2 {all -> 0x009b, blocks: (B:15:0x0029, B:17:0x002d, B:19:0x0035, B:27:0x0060, B:28:0x0062, B:37:0x008e, B:40:0x0091, B:44:0x0096, B:21:0x003f, B:24:0x004f, B:29:0x0063, B:31:0x0067, B:32:0x007b, B:34:0x007f, B:35:0x0086, B:36:0x008d), top: B:112:0x0029, outer: #4, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0067 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0063, B:31:0x0067, B:32:0x007b, B:34:0x007f, B:35:0x0086, B:36:0x008d), top: B:108:0x0063, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0063, B:31:0x0067, B:32:0x007b, B:34:0x007f, B:35:0x0086, B:36:0x008d), top: B:108:0x0063, outer: #2 }] */
    public final void a() {
        long j;
        long jF;
        long jMin;
        Object obj;
        if (this.e != null) {
            try {
                try {
                    aami aamiVarD = aaq.d(this.f, null, this.g);
                    if (aamiVarD.a != 0) {
                        throw new RuntimeException("fetchFonts failed (1)");
                    }
                    axd[] axdVarArrD = aamiVarD.d();
                    if (axdVarArrD == null || axdVarArrD.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    axd axdVar = axdVarArrD[0];
                    int i = axdVar.e;
                    if (i == 2) {
                        Object obj2 = this.a;
                        synchronized (obj2) {
                            try {
                                blt bltVar = this.d;
                                if (bltVar != null) {
                                    if (bltVar.b != 0) {
                                        long jUptimeMillis = SystemClock.uptimeMillis() - bltVar.b;
                                        long j2 = bltVar.a;
                                        if (jUptimeMillis > j2) {
                                            jMin = -1;
                                        } else {
                                            j = -1;
                                            jMin = Math.min(Math.max(jUptimeMillis, 1000L), j2 - jUptimeMillis);
                                        }
                                        if (jMin >= 0) {
                                            obj = axdVar.f;
                                            synchronized (obj2) {
                                                try {
                                                    if (this.h == null) {
                                                        blr blrVar = new blr(this, this.b);
                                                        this.h = blrVar;
                                                        this.f.getContentResolver().registerContentObserver((Uri) obj, false, blrVar);
                                                    }
                                                    if (this.i == null) {
                                                        this.i = new bkn(this, 2, null);
                                                    }
                                                    this.b.postDelayed(this.i, jMin);
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            return;
                                        }
                                        ((bli) this.e.a).a.g();
                                        b();
                                    }
                                    bltVar.b = SystemClock.uptimeMillis();
                                    jMin = 0;
                                    j = -1;
                                    if (jMin >= 0) {
                                        obj = axdVar.f;
                                        synchronized (obj2) {
                                            if (this.h == null) {
                                                blr blrVar2 = new blr(this, this.b);
                                                this.h = blrVar2;
                                                this.f.getContentResolver().registerContentObserver((Uri) obj, false, blrVar2);
                                            }
                                            if (this.i == null) {
                                                this.i = new bkn(this, 2, null);
                                            }
                                            this.b.postDelayed(this.i, jMin);
                                            return;
                                        }
                                    }
                                    ((bli) this.e.a).a.g();
                                    b();
                                }
                                j = -1;
                                i = 2;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        j = -1;
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ')');
                    }
                    Context context = this.f;
                    Typeface typefaceB = aaq.b(context, null, new axd[]{axdVar});
                    ByteBuffer byteBufferB = ave.b(context, null, (Uri) axdVar.f);
                    if (byteBufferB == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    qcb qcbVar = this.e;
                    ByteBuffer byteBufferDuplicate = byteBufferB.duplicate();
                    byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
                    long jF2 = ato.f(byteBufferDuplicate);
                    if (jF2 != 65536 && jF2 != 1330926671) {
                        throw new IOException("Cannot read metadata.");
                    }
                    char c = (char) byteBufferDuplicate.getShort();
                    if (c > 'd') {
                        throw new IOException("Cannot read metadata.");
                    }
                    ato.g(6, byteBufferDuplicate);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c) {
                            jF = j;
                            break;
                        }
                        int i3 = byteBufferDuplicate.getInt();
                        ato.g(4, byteBufferDuplicate);
                        jF = ato.f(byteBufferDuplicate);
                        ato.g(4, byteBufferDuplicate);
                        if (i3 == 1835365473) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (jF != j) {
                        ato.g((int) (jF - ((long) byteBufferDuplicate.position())), byteBufferDuplicate);
                        ato.g(12, byteBufferDuplicate);
                        long jF3 = ato.f(byteBufferDuplicate);
                        if (jF3 > 100) {
                            throw new IOException("Cannot read metadata.");
                        }
                        for (int i4 = 0; i4 < jF3; i4++) {
                            int i5 = byteBufferDuplicate.getInt();
                            long jF4 = ato.f(byteBufferDuplicate);
                            long jF5 = ato.f(byteBufferDuplicate);
                            if (i5 == 1164798569 || i5 == 1701669481) {
                                long j3 = jF4 + jF;
                                if (jF5 > 10485760) {
                                    throw new IOException("Metadata length is too large.");
                                }
                                byteBufferDuplicate.position((int) j3);
                                dqp dqpVar = new dqp();
                                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                                dqpVar.d(byteBufferDuplicate.getInt(byteBufferDuplicate.position()) + byteBufferDuplicate.position(), byteBufferDuplicate);
                                dep depVar = new dep(typefaceB, dqpVar);
                                Object obj3 = qcbVar.a;
                                ((bli) obj3).c = depVar;
                                dep depVar2 = ((bli) obj3).c;
                                bll bllVar = ((bli) obj3).a;
                                ((bli) obj3).b = new eqf(depVar2, bllVar.i, bllVar.g, bllVar.h);
                                ArrayList arrayList = new ArrayList();
                                bllVar.a.writeLock().lock();
                                try {
                                    bllVar.c = 1;
                                    Set set = bllVar.b;
                                    arrayList.addAll(set);
                                    set.clear();
                                    bllVar.a.writeLock().unlock();
                                    bllVar.d.post(new duz(arrayList, bllVar.c, 1));
                                    b();
                                    return;
                                } catch (Throwable th3) {
                                    bllVar.a.writeLock().unlock();
                                    throw th3;
                                }
                            }
                        }
                    }
                    throw new IOException("Cannot read metadata.");
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RuntimeException("provider not found", e);
                }
            } catch (Throwable unused) {
                ((bli) this.e.a).a.g();
                b();
            }
        }
    }
}
