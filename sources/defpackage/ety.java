package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ety implements ett {
    public final afv b = new ffg();

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            afv afvVar = this.b;
            if (i >= afvVar.d) {
                return;
            }
            etx etxVar = (etx) afvVar.d(i);
            Object objG = afvVar.g(i);
            etw etwVar = etxVar.c;
            if (etxVar.e == null) {
                etxVar.e = etxVar.d.getBytes(ett.a);
            }
            etwVar.a(etxVar.e, objG, messageDigest);
            i++;
        }
    }

    public final Object b(etx etxVar) {
        afv afvVar = this.b;
        return afvVar.containsKey(etxVar) ? afvVar.get(etxVar) : etxVar.b;
    }

    public final void c(ety etyVar) {
        this.b.i(etyVar.b);
    }

    public final void d(etx etxVar, Object obj) {
        this.b.put(etxVar, obj);
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (obj instanceof ety) {
            return this.b.equals(((ety) obj).b);
        }
        return false;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + '}';
    }
}
