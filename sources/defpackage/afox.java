package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afox implements bnu {
    private final boh a;
    private final afts b;

    public afox(afts aftsVar, boh bohVar) {
        this.a = bohVar;
        this.b = aftsVar;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        afty.t();
        try {
            this.a.e(boa.ON_CREATE);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        afvn afvnVarC = this.b.c();
        try {
            this.a.e(boa.ON_DESTROY);
            afvnVarC.close();
        } catch (Throwable th) {
            try {
                afvnVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        afty.g();
        try {
            this.a.e(boa.ON_PAUSE);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        afts aftsVar = this.b;
        aftq aftqVar = new aftq(aftsVar, aftsVar.c(), 0);
        try {
            this.a.e(boa.ON_RESUME);
            aftqVar.close();
        } catch (Throwable th) {
            try {
                aftqVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        afty.t();
        try {
            this.a.e(boa.ON_START);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        afty.g();
        try {
            this.a.e(boa.ON_STOP);
            afty.k();
        } catch (Throwable th) {
            try {
                afty.k();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
