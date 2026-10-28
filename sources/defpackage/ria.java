package defpackage;

import android.util.Size;
import j$.time.Duration;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ria implements rib {
    private static final rbm g = new rbm("ria");
    public final rjc a;
    public rgf b;
    public rft c;
    private final UUID d;
    private final qug e;
    private int f = 0;

    public ria(UUID uuid, rjc rjcVar, qug qugVar) {
        this.d = uuid;
        this.a = rjcVar;
        this.e = qugVar;
    }

    @Override // defpackage.rib
    public final /* synthetic */ Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.rib
    public final void c(rfs rfsVar) {
        this.a.e(new rhz(this, rfsVar, 1));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.e(new rhl(this, 2));
    }

    public final void d(rfn rfnVar) {
        this.a.e(new rhz(this, rfnVar, 0));
    }

    @Override // defpackage.rib
    public final synchronized void e(rft rftVar) {
        this.c = rftVar;
    }

    public final synchronized void f(Duration duration, Size size) {
        rfq rfqVarA;
        rft rftVar = this.c;
        if (rftVar != null) {
            rgf rgfVar = this.b;
            rgfVar.getClass();
            rgfVar.d(size.getWidth(), size.getHeight());
            try {
                rfqVarA = rgfVar.a();
                try {
                    rfqVarA.a(ahbt.a(duration));
                    ((riz) this.a).a.g(rfqVarA.getTextureName(), rfqVarA.getWidth(), rfqVarA.getHeight());
                    rgi.e(this.f);
                    rgi.g();
                } catch (bvn e) {
                    e = e;
                    rbc rbcVar = new rbc(g, rbd.d);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Failed to produce a frame.", new Object[0]);
                    qug qugVar = this.e;
                    tge tgeVarA = quk.a();
                    tgeVarA.b = e;
                    tgeVarA.c = new quh(this.d, 4);
                    qugVar.a(tgeVarA.e());
                }
            } catch (bvn e2) {
                e = e2;
                rfqVarA = null;
            }
            if (rfqVarA != null) {
                rftVar.a(rfqVarA);
            }
        }
    }

    @Override // defpackage.rib
    public final boolean g() {
        return false;
    }

    public final void h(Duration duration, Size size) {
        this.a.e(new lez(this, duration, size, 18, (int[]) null));
    }

    public final synchronized void i(int i) {
        this.f = i;
    }

    @Override // defpackage.rib
    public final /* synthetic */ void iF(long j) {
    }
}
