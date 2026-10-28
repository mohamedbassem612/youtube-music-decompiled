package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class etu implements euc {
    private final Collection b;

    public etu(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.b = collection;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((euc) it.next()).a(messageDigest);
        }
    }

    @Override // defpackage.euc
    public final ewf b(Context context, ewf ewfVar, int i, int i2) {
        Iterator it = this.b.iterator();
        ewf ewfVar2 = ewfVar;
        while (it.hasNext()) {
            ewf ewfVarB = ((euc) it.next()).b(context, ewfVar2, i, i2);
            if (ewfVar2 != null && !ewfVar2.equals(ewfVar) && !ewfVar2.equals(ewfVarB)) {
                ewfVar2.e();
            }
            ewfVar2 = ewfVarB;
        }
        return ewfVar2;
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (obj instanceof etu) {
            return this.b.equals(((etu) obj).b);
        }
        return false;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return this.b.hashCode();
    }
}
