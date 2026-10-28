package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fch implements euc {
    private final euc b;

    public fch(euc eucVar) {
        this.b = eucVar;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.euc
    public final ewf b(Context context, ewf ewfVar, int i, int i2) {
        fce fceVar = (fce) ewfVar.c();
        ewf ezwVar = new ezw(fceVar.a(), erj.b(context).a);
        euc eucVar = this.b;
        ewf ewfVarB = eucVar.b(context, ezwVar, i, i2);
        if (!ezwVar.equals(ewfVarB)) {
            ezwVar.e();
        }
        fceVar.a.a.e(eucVar, (Bitmap) ewfVarB.c());
        return ewfVar;
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (obj instanceof fch) {
            return this.b.equals(((fch) obj).b);
        }
        return false;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return this.b.hashCode();
    }
}
