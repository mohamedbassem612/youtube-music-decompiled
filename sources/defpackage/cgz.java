package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgz {
    public final Context a;
    public cgy b;
    public cfu c;
    public cgw d;
    public cbp e;
    public ayq f;
    private cff g;
    private boolean h;

    @Deprecated
    public cgz() {
        this.a = null;
        this.g = cff.a;
    }

    public final chd a() {
        if (this.h) {
            throw new IllegalStateException();
        }
        this.h = true;
        if (this.f == null) {
            this.f = new ayq(new buj[0]);
        }
        cfu cfuVar = this.c;
        cgw cgwVar = this.d;
        if (cfuVar == null) {
            if (cgwVar == null) {
                this.d = new cgv(this.a);
            }
            if (this.b == null) {
                this.b = cgy.a;
            }
            Context context = this.a;
            cgp cgpVar = new cgp(context);
            cff cffVar = context != null ? null : this.g;
            Context context2 = cgpVar.a;
            if (context2 == null) {
                cgpVar.d = cffVar;
            }
            cgpVar.b = this.d;
            cgpVar.c = this.b;
            if (cgpVar.b == null) {
                cgpVar.b = new cgv(context2);
            }
            this.c = new cgq(cgpVar);
        } else {
            if (cgwVar != null) {
                throw new IllegalStateException();
            }
            if (this.b != null) {
                throw new IllegalStateException();
            }
        }
        return new chd(this);
    }

    @Deprecated
    public final void b(cff cffVar) {
        cffVar.getClass();
        this.g = cffVar;
    }

    public cgz(Context context) {
        this.a = context;
        this.g = cff.a;
    }
}
