package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ewh implements ett {
    private static final ffo b = new ffo(50);
    private final ett c;
    private final ett d;
    private final int e;
    private final int f;
    private final Class g;
    private final ety h;
    private final euc i;
    private final ewv j;

    public ewh(ewv ewvVar, ett ettVar, ett ettVar2, int i, int i2, euc eucVar, Class cls, ety etyVar) {
        this.j = ewvVar;
        this.c = ettVar;
        this.d = ettVar2;
        this.e = i;
        this.f = i2;
        this.i = eucVar;
        this.g = cls;
        this.h = etyVar;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        ewv ewvVar = this.j;
        byte[] bArr = (byte[]) ewvVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        euc eucVar = this.i;
        if (eucVar != null) {
            eucVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        Class cls = this.g;
        ffo ffoVar = b;
        byte[] bytes = (byte[]) ffoVar.g(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a);
            ffoVar.h(cls, bytes);
        }
        messageDigest.update(bytes);
        ewvVar.c(bArr);
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (!(obj instanceof ewh)) {
            return false;
        }
        ewh ewhVar = (ewh) obj;
        if (this.f != ewhVar.f || this.e != ewhVar.e) {
            return false;
        }
        euc eucVar = this.i;
        euc eucVar2 = ewhVar.i;
        char[] cArr = ffs.a;
        return afxw.l(eucVar, eucVar2) && this.g.equals(ewhVar.g) && this.c.equals(ewhVar.c) && this.d.equals(ewhVar.d) && this.h.equals(ewhVar.h);
    }

    @Override // defpackage.ett
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        euc eucVar = this.i;
        int iHashCode2 = (((iHashCode * 31) + this.e) * 31) + this.f;
        if (eucVar != null) {
            iHashCode2 = (iHashCode2 * 31) + eucVar.hashCode();
        }
        return (((iHashCode2 * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        ety etyVar = this.h;
        euc eucVar = this.i;
        Class cls = this.g;
        ett ettVar = this.d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.c) + ", signature=" + String.valueOf(ettVar) + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(eucVar) + "', options=" + String.valueOf(etyVar) + '}';
    }
}
