package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum elp {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String d;

    elp(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
