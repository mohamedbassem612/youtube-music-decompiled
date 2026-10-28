package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class exn implements ffy {
    public final MessageDigest a;
    private final wkr b = new wkr(null);

    public exn(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.ffy
    public final wkr g() {
        return this.b;
    }
}
