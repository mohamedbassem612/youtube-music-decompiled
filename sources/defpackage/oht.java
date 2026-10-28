package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oht extends ohu {
    private final String a;
    private final String b;
    private final String c;

    public oht(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.ohu
    public final String a() {
        return this.c;
    }

    @Override // defpackage.ohu
    public final String b() {
        return this.b;
    }

    @Override // defpackage.ohu
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohu) {
            ohu ohuVar = (ohu) obj;
            if (this.a.equals(ohuVar.c()) && this.b.equals(ohuVar.b()) && this.c.equals(ohuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
