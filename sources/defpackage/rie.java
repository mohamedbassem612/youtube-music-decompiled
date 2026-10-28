package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.util.Size;
import j$.time.Duration;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rie implements rhw {
    private static final rbm u = new rbm("rie");
    public final Context c;
    public final rih d;
    public final rjc e;
    public final rid f;
    public final qua g;
    public rgf h;
    public int m;
    public Duration n;
    public Size o;
    public rfs p;
    public rft q;
    public int r;
    private final UUID s;
    private final qug t;
    public final Object a = new Object();
    public final Object b = new Object();
    public Semaphore j = new Semaphore(1);
    public boolean k = false;
    public boolean l = false;
    public rgh i = null;

    public rie(Context context, UUID uuid, rih rihVar, rjc rjcVar, rid ridVar, qua quaVar, qug qugVar) {
        this.c = context;
        this.s = uuid;
        this.d = rihVar;
        this.e = rjcVar;
        this.f = ridVar;
        this.g = quaVar;
        this.t = qugVar;
    }

    public static atwa i(atqs atqsVar) {
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihhVar.e(atqs.b, atqsVar);
        return (atwa) aihhVar.build();
    }

    public static atqt l(rfs rfsVar, String str, int i) {
        aihf aihfVarCreateBuilder = atqt.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atqt atqtVar = (atqt) aihfVarCreateBuilder.instance;
        atqtVar.b |= 1;
        atqtVar.c = str;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            Matrix matrixG = rfsVar.g();
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f);
            matrix.postConcat(matrixG);
            matrix.postScale(1.0f, -1.0f);
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            aihf aihfVarCreateBuilder2 = aimy.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aimy aimyVar = (aimy) aihfVarCreateBuilder2.instance;
            aimyVar.f = 1;
            aimyVar.b |= 4;
            aihfVarCreateBuilder2.az(new ahbm(fArr, 0, 9));
            aihfVarCreateBuilder2.copyOnWrite();
            aimy aimyVar2 = (aimy) aihfVarCreateBuilder2.instance;
            aimyVar2.b |= 1;
            aimyVar2.c = 3;
            aihfVarCreateBuilder2.copyOnWrite();
            aimy aimyVar3 = (aimy) aihfVarCreateBuilder2.instance;
            aimyVar3.b |= 2;
            aimyVar3.d = 3;
            aimy aimyVar4 = (aimy) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            atqt atqtVar2 = (atqt) aihfVarCreateBuilder.instance;
            aimyVar4.getClass();
            atqtVar2.d = aimyVar4;
            atqtVar2.b |= 4;
        }
        return (atqt) aihfVarCreateBuilder.build();
    }

    public static jrr m(Duration duration) {
        jrr jrrVar = (jrr) atqs.a.createBuilder();
        long jA = ahbt.a(duration);
        jrrVar.copyOnWrite();
        atqs atqsVar = (atqs) jrrVar.instance;
        atqsVar.d = 4;
        atqsVar.e = Long.valueOf(jA);
        return jrrVar;
    }

    @Override // defpackage.rib
    public final /* synthetic */ Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.rib
    public final void c(rfs rfsVar) {
        synchronized (this.b) {
            this.p = rfsVar;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            this.q = null;
        }
        synchronized (this.b) {
            this.k = false;
        }
        rjc rjcVar = this.e;
        rjcVar.e(new rhl(this, 3));
        rjcVar.b();
    }

    @Override // defpackage.rhw
    public final void d(Semaphore semaphore) {
        synchronized (this.b) {
            ahno.P(!this.k, "Trying to set the backpressure semaphore after starting the source.");
            this.j = semaphore;
        }
    }

    @Override // defpackage.rib
    public final void e(rft rftVar) {
        synchronized (this.a) {
            this.q = rftVar;
        }
    }

    public final rfq f() {
        try {
            rgf rgfVar = this.h;
            rgfVar.getClass();
            return rgfVar.a();
        } catch (bvn e) {
            qug qugVar = this.t;
            tge tgeVarA = quk.a();
            tgeVarA.b = e;
            tgeVarA.c = new quj(this.s, 4);
            ((rdr) qugVar).D(tgeVarA.e());
            return null;
        }
    }

    @Override // defpackage.rib
    public final boolean g() {
        return this.d.i();
    }

    public final rfs h(rfs rfsVar, boolean z) {
        rgh rghVar = this.i;
        rghVar.getClass();
        rfq rfqVarF = f();
        if (rfqVarF == null) {
            return null;
        }
        try {
            j(rfqVarF);
            if (z) {
                rghVar.b(rfsVar.getTextureName(), rfsVar.b(), rfsVar.f(), new Matrix());
            } else {
                rghVar.c(rfsVar);
            }
            rgi.g();
            return rfqVarF;
        } catch (bvn e) {
            rbc rbcVar = new rbc(u, rbd.c);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Could not render the transformed frame, passing transparent frame.", new Object[0]);
            qug qugVar = this.t;
            tge tgeVarA = quk.a();
            tgeVarA.b = e;
            tgeVarA.c = new quj(this.s, 4);
            ((rdr) qugVar).D(tgeVarA.e());
            return rfqVarF;
        }
    }

    @Override // defpackage.rib
    public final void iF(long j) {
        this.d.e(j);
    }

    public final void j(rfs rfsVar) {
        try {
            ((riz) this.e).a.g(rfsVar.getTextureName(), rfsVar.getWidth(), rfsVar.getHeight());
            rgi.d(this.m);
        } catch (bvn | RuntimeException e) {
            rbc rbcVar = new rbc(u, rbd.c);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Could not clear color from frame.", new Object[0]);
            qug qugVar = this.t;
            tge tgeVarA = quk.a();
            tgeVarA.b = e;
            tgeVarA.c = new quj(this.s, 4);
            ((rdr) qugVar).D(tgeVarA.e());
        }
    }

    public final void k() {
        synchronized (this.b) {
            this.l = true;
        }
    }
}
