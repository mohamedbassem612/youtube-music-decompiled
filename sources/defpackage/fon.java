package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fon extends flf {
    final /* synthetic */ foq a;
    private final fvu c;
    private boolean d;
    private int e = -1;
    private String f;

    public fon(foq foqVar, fvu fvuVar) {
        this.a = foqVar;
        this.c = fvuVar;
    }

    @Override // defpackage.flf
    public final void a(flf flfVar) {
        synchronized (this) {
            if (this.d) {
                int i = this.e;
                String str = this.f;
                this.e = -1;
                this.f = null;
                this.d = false;
                try {
                    this.a.j(i, str, flfVar);
                } catch (IndexOutOfBoundsException e) {
                    foq foqVar = this.a;
                    throw foq.b(foqVar, foqVar.i, e);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.d) {
            this.d = false;
            this.e = -1;
            this.f = null;
            ((fvt) this.c).removeCallbacks(this);
        }
    }

    public final synchronized void c(int i, String str) {
        if (!this.d) {
            this.d = true;
            Throwable th = this.b;
            if (th != null) {
                th.fillInStackTrace();
            }
            ((fvt) this.c).post(this);
            this.e = i;
            this.f = str;
        }
    }
}
