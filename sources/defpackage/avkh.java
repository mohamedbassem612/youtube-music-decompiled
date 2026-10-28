package defpackage;

import java.net.URI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avkh implements avki {
    private final URI a;

    public avkh(URI uri) {
        uri.getClass();
        this.a = uri;
    }

    @Override // defpackage.avki
    public final avbt a(avbq avbqVar, avbo avboVar) {
        return avbqVar.b(this.a, avboVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avkh) {
            return this.a.equals(((avkh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
