package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwp extends qwq {
    public final Uri a;

    public qwp(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.qwq, defpackage.qwy
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qwy)) {
            return false;
        }
        qwy qwyVar = (qwy) obj;
        qwyVar.b();
        return this.a.equals(qwyVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceParameter{uri=" + this.a.toString() + '}';
    }

    @Override // defpackage.qwy
    public final void b() {
    }
}
