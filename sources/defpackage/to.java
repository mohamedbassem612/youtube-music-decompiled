package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class to extends vm {
    final String a;
    final int b;
    private final String c;
    private final String d;
    private final String e;

    public to(String str, String str2, String str3, ry ryVar) {
        super((byte[]) null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        azs.f(!ryVar.b(), "failedResult was actually successful");
        this.a = ryVar.c;
        this.b = ryVar.a;
    }

    public final String toString() {
        return "MigrationFailure { schemaType: " + this.e + ", namespace: " + this.c + ", documentId: " + this.d + ", appSearchResult: " + new ry(this.b, null, this.a).toString() + '}';
    }
}
