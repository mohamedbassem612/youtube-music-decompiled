package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ali {
    public static final /* synthetic */ int a = 0;
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    static {
        new ali(null);
    }

    private ali(byte[] bArr) {
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        if (aph.a() < 0 || aph.a() < 0 || aph.a() < 0 || aph.a() < 0) {
            alh.a("Layer outsets must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ali)) {
            return false;
        }
        ali aliVar = (ali) obj;
        float f = aliVar.b;
        float f2 = aliVar.c;
        float f3 = aliVar.d;
        float f4 = aliVar.e;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "LayerOutsets(left=" + aph.b() + ", top=" + aph.b() + ", right=" + aph.b() + ", bottom=" + aph.b() + ')';
    }

    public ali() {
        this(null);
    }
}
