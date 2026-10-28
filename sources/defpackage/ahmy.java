package defpackage;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmy implements ahmz {
    private final /* synthetic */ int $cid;

    public ahmy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahmz
    public final /* synthetic */ Object a(String str, Provider provider) {
        int i = this.$cid;
        if (i == 0) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
        if (i != 1) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
