package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avtm extends awjm implements avok {
    final avno a;

    public avtm(axsp axspVar, avno avnoVar) {
        super(axspVar);
        this.a = avnoVar;
    }

    @Override // defpackage.avok
    public final boolean d(Object obj) {
        if (this.h) {
            return false;
        }
        if (this.i != 0) {
            this.e.kk(null);
        } else {
            try {
                boolean zA = this.a.a(obj);
                if (zA) {
                    this.e.kk(obj);
                }
                return zA;
            } catch (Throwable th) {
                g(th);
            }
        }
        return true;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (d(obj)) {
            return;
        }
        this.f.ko(1L);
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return f(i);
    }

    @Override // defpackage.avot
    public final Object km() {
        avoq avoqVar = this.g;
        while (true) {
            Object objKm = avoqVar.km();
            if (objKm == null) {
                return null;
            }
            if (this.a.a(objKm)) {
                return objKm;
            }
            if (this.i == 2) {
                avoqVar.ko(1L);
            }
        }
    }
}
