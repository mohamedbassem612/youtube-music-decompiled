package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aawp extends aawv {
    public final String a;
    public final String b;

    private aawp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.aawv
    public final String a() {
        return this.b;
    }

    @Override // defpackage.aawv
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aawv) {
            aawv aawvVar = (aawv) obj;
            String str = this.a;
            if (str != null ? str.equals(aawvVar.b()) : aawvVar.b() == null) {
                String str2 = this.b;
                if (str2 == null) {
                    if (aawvVar.a() == null) {
                        return true;
                    }
                } else if (str2.equals(aawvVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CompositeLiveTokenChangedEvent{compositeLiveStatusToken=" + this.a + ", compositeLiveIngestionOffsetToken=" + this.b + '}';
    }

    public /* synthetic */ aawp(String str, String str2, aawo aawoVar) {
        this(str, str2);
    }
}
