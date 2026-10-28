package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fas implements euc {
    private final euc b;

    public fas(euc eucVar) {
        this.b = eucVar;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.euc
    public final ewf b(Context context, ewf ewfVar, int i, int i2) {
        ewn ewnVar = erj.b(context).a;
        Drawable drawable = (Drawable) ewfVar.c();
        ewf ewfVarA = far.a(ewnVar, drawable, i, i2);
        if (ewfVarA == null) {
            throw new IllegalArgumentException(enb.b(drawable, "Unable to convert ", " to a Bitmap"));
        }
        ewf ewfVarB = this.b.b(context, ewfVarA, i, i2);
        if (!ewfVarB.equals(ewfVarA)) {
            return fbd.f(context.getResources(), ewfVarB);
        }
        ewfVarB.e();
        return ewfVar;
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (obj instanceof fas) {
            return this.b.equals(((fas) obj).b);
        }
        return false;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return this.b.hashCode();
    }
}
