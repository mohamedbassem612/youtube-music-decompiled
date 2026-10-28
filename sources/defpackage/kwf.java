package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwf implements kpq, kpr {
    protected final jwe a;
    private final String b;
    private final String c;
    private final LinkedBlockingQueue d;
    private final HandlerThread e;

    public kwf(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        jwe jweVar = new jwe(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = jweVar;
        this.d = new LinkedBlockingQueue();
        jweVar.H();
    }

    static fxl d() {
        fxg fxgVar = (fxg) fxl.a.createBuilder();
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxlVar.b |= 524288;
        fxlVar.q = 32768L;
        return (fxl) fxgVar.build();
    }

    @Override // defpackage.kpq
    public final void a(Bundle bundle) {
        kwp kwpVarG = g();
        if (kwpVarG != null) {
            try {
                try {
                    kwm kwmVar = new kwm(1, this.b, this.c);
                    Parcel parcelC = kwpVarG.c();
                    gdc.c(parcelC, kwmVar);
                    Parcel parcelD = kwpVarG.d(1, parcelC);
                    kwn kwnVar = (kwn) gdc.a(parcelD, kwn.CREATOR);
                    parcelD.recycle();
                    if (kwnVar.b == null) {
                        try {
                            kwnVar.b = (fxl) aihn.parseFrom(fxl.a, kwnVar.c, ExtensionRegistryLite.a);
                            kwnVar.c = null;
                        } catch (aiik | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    kwnVar.a();
                    this.d.put(kwnVar.b);
                } catch (Throwable unused) {
                    this.d.put(d());
                }
            } catch (InterruptedException unused2) {
            } finally {
                e();
                this.e.quit();
            }
        }
    }

    @Override // defpackage.kpq
    public final void b(int i) {
        try {
            this.d.put(d());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.kpr
    public final void c(klo kloVar) {
        try {
            this.d.put(d());
        } catch (InterruptedException unused) {
        }
    }

    public final void e() {
        jwe jweVar = this.a;
        if (jweVar != null) {
            if (jweVar.w() || jweVar.x()) {
                jweVar.l();
            }
        }
    }

    public final fxl f() {
        fxl fxlVar;
        try {
            fxlVar = (fxl) this.d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            fxlVar = null;
        }
        return fxlVar == null ? d() : fxlVar;
    }

    protected final kwp g() {
        try {
            return this.a.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
