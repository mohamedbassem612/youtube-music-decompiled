package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afxb implements bnu {
    private final bnu a;

    public afxb(bnu bnuVar) {
        ahno.P(!(bnuVar instanceof afxb), "Yo dawg.");
        this.a = bnuVar;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        afty.t();
        try {
            this.a.onCreate(bogVar);
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
        afty.g();
        try {
            this.a.onDestroy(bogVar);
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
    public final void onPause(bog bogVar) {
        afty.g();
        try {
            this.a.onPause(bogVar);
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
        afty.t();
        try {
            this.a.onResume(bogVar);
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
    public final void onStart(bog bogVar) {
        afty.t();
        try {
            this.a.onStart(bogVar);
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
            this.a.onStop(bogVar);
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
