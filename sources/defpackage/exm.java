package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class exm implements ffw {
    private final /* synthetic */ int $cid;

    public exm(int i) {
        this.$cid = i;
    }

    public static final exn b() {
        try {
            return new exn(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ffw
    public final /* synthetic */ Object a() {
        return this.$cid != 0 ? new ewe() : b();
    }
}
