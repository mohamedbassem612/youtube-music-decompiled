package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tac implements aheh, bnu {
    private final bob a;
    private boolean b;
    private boolean c;
    private boc d;
    private twi e;
    private twi f;

    public tac(bob bobVar, boc bocVar, twi twiVar, twi twiVar2) {
        this.a = bobVar;
        bocVar.getClass();
        this.d = bocVar;
        this.e = twiVar;
        this.f = twiVar2;
        bocVar.b(this);
    }

    private final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        boc bocVar = this.d;
        bocVar.getClass();
        bocVar.c(this);
        this.d = null;
        this.e = null;
        this.f = null;
    }

    private final boolean d() {
        if (this.b) {
            return true;
        }
        if (this.c) {
            boc bocVar = this.d;
            bocVar.getClass();
            if (!bocVar.a().a(this.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        if (!d()) {
            twi twiVar = this.f;
            twiVar.getClass();
            twiVar.a(th);
        }
        c();
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        if (!d()) {
            twi twiVar = this.e;
            twiVar.getClass();
            twiVar.a(obj);
        }
        c();
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        if (bogVar.getLifecycle().a().a(this.a)) {
            return;
        }
        c();
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        if (bogVar.getLifecycle().a().a(this.a)) {
            return;
        }
        c();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        if (bob.e.a(this.a)) {
            this.c = true;
        }
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        if (bob.d.a(this.a)) {
            this.c = true;
        }
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        if (bogVar.getLifecycle().a().a(this.a)) {
            return;
        }
        c();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }
}
