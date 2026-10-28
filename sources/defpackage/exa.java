package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class exa implements ewy {
    int a;
    public Bitmap.Config b;
    private final exb c;

    public exa(exb exbVar) {
        this.c = exbVar;
    }

    @Override // defpackage.ewy
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof exa)) {
            return false;
        }
        exa exaVar = (exa) obj;
        if (this.a != exaVar.a) {
            return false;
        }
        Bitmap.Config config = this.b;
        Bitmap.Config config2 = exaVar.b;
        char[] cArr = ffs.a;
        return afxw.l(config, config2);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return exc.a(this.a, this.b);
    }
}
