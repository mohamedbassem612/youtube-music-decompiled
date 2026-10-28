package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqni implements weh {
    static final aqnh a;
    public static final weq b;
    private final aqnj c;

    static {
        aqnh aqnhVar = new aqnh();
        a = aqnhVar;
        b = aqnhVar;
    }

    public aqni(aqnj aqnjVar) {
        this.c = aqnjVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aqng(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqni) && this.c.equals(((aqni) obj).c);
    }

    public String getFormattedTime() {
        return this.c.e;
    }

    public aqnk getTimestamp() {
        aqnk aqnkVar = this.c.d;
        return aqnkVar == null ? aqnk.a : aqnkVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "TimestampEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
