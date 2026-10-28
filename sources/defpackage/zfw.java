package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfw implements zhp {
    public final zga a;
    public long b;
    private final zgk c;
    private boolean d;

    public zfw(zga zgaVar, zgk zgkVar) {
        this.a = zgaVar;
        this.c = zgkVar;
    }

    @Override // defpackage.zhp
    public final void b(Exception exc) {
        zgk zgkVar = this.c;
        zgkVar.w(new zhz(zhw.a, "cache.exception", ((zgj) zgkVar).s, exc.getCause()));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    @Override // defpackage.zhp
    public final void c(int i) {
        String str;
        boolean z;
        if (i != 0) {
            str = i != 1 ? null : "cache.ignored.unsetlength";
        } else {
            str = "cache.ignored.onerror";
        }
        zgk zgkVar = this.c;
        wja wjaVar = ((zgj) zgkVar).u;
        if (wjaVar != null) {
            z = false;
            if (wjaVar.J() && !wjaVar.B) {
                z = true;
            }
        } else {
            z = true;
        }
        if (this.d || str == null || !z) {
            return;
        }
        this.a.a("error", zgkVar.c() + ':' + str + ':' + zgkVar.b() + ':' + zhf.d());
        this.d = true;
    }

    @Override // defpackage.zhp
    public final void f(long j) {
        this.b += j;
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void a(zih zihVar) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void e(zih zihVar) {
    }

    @Override // defpackage.zhp
    public final /* synthetic */ void d(long j, long j2) {
    }
}
