package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aalw extends aamf {
    public final byte[] a;
    private final String b;
    private final int c;
    private final String d;
    private final int e;
    private final int f;
    private final byte[] g;
    private final boolean h;

    public aalw(String str, int i, String str2, int i2, int i3, byte[] bArr, byte[] bArr2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.a = bArr;
        this.g = bArr2;
        this.h = z;
    }

    @Override // defpackage.aamf
    public final int a() {
        return this.f;
    }

    @Override // defpackage.aamf
    public final int b() {
        return this.c;
    }

    @Override // defpackage.aamf
    public final int c() {
        return this.e;
    }

    @Override // defpackage.aamf
    public final String d() {
        return this.d;
    }

    @Override // defpackage.aamf
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aamf) {
            aamf aamfVar = (aamf) obj;
            if (this.b.equals(aamfVar.e()) && this.c == aamfVar.b() && ((str = this.d) != null ? str.equals(aamfVar.d()) : aamfVar.d() == null) && this.e == aamfVar.c() && this.f == aamfVar.a()) {
                boolean z = aamfVar instanceof aalw;
                if (Arrays.equals(this.a, z ? ((aalw) aamfVar).a : aamfVar.g())) {
                    if (Arrays.equals(this.g, z ? ((aalw) aamfVar).g : aamfVar.h()) && this.h == aamfVar.f()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aamf
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.aamf
    public final byte[] g() {
        return this.a;
    }

    @Override // defpackage.aamf
    public final byte[] h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        String str = this.d;
        return (((((((((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ Arrays.hashCode(this.a)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        byte[] bArr = this.g;
        return "OfflineHash{videoId=" + this.b + ", itag=" + this.c + ", storageId=" + this.d + ", merkleLevel=" + this.e + ", blockIndex=" + this.f + ", digest=" + Arrays.toString(this.a) + ", hashState=" + Arrays.toString(bArr) + ", matchesBytesOnDisk=" + this.h + '}';
    }
}
