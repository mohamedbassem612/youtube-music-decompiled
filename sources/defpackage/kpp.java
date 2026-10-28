package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kpp extends kpt {
    public final int a;
    public final Bundle b;
    final int c;
    final /* synthetic */ kpz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpp(kpz kpzVar, int i, Bundle bundle, int i2) {
        super(kpzVar, Boolean.TRUE);
        this.d = kpzVar;
        this.a = i;
        this.b = bundle;
        this.c = i2;
    }

    protected abstract void a(klo kloVar);

    protected abstract boolean b();

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    @Override // defpackage.kpt
    protected final /* synthetic */ void c() {
        String strE;
        int i = this.a;
        if (i == 0) {
            if (b()) {
                return;
            }
            this.d.N(1, null, this.c);
            a(new klo(1, 8, null, null, null, null));
            return;
        }
        kpz kpzVar = this.d;
        kpzVar.N(1, null, this.c);
        Bundle bundle = this.b;
        PendingIntent pendingIntent = bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null;
        if (i == 1) {
            strE = kpzVar.E();
            kro.g("Must not be called on the main application thread");
            if (strE != null) {
                int i2 = klu.c;
            }
        } else if (i == 21) {
            i = 21;
            strE = kpzVar.E();
            kro.g("Must not be called on the main application thread");
            if (strE != null) {
                int i3 = klu.c;
            }
        }
        a(new klo(1, i, pendingIntent, null, null, null));
    }
}
