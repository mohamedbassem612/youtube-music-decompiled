package defpackage;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahtd {
    public final ahnr a;
    public final ahtf b;
    public final kli c;
    public final ahrs d;
    public final ahrs e;
    public final ahrw f;

    public ahtd(ahnr ahnrVar, ahtf ahtfVar, kli kliVar, ahrs ahrsVar, ahrs ahrsVar2, ahrw ahrwVar) {
        this.a = ahnrVar;
        this.b = ahtfVar;
        this.c = kliVar;
        this.d = ahrsVar;
        this.e = ahrsVar2;
        this.f = ahrwVar;
    }

    public final String a() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }
}
