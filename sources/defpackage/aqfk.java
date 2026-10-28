package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqfk implements weh {
    static final aqfj a;
    public static final weq b;
    private final aqfl c;

    static {
        aqfj aqfjVar = new aqfj();
        a = aqfjVar;
        b = aqfjVar;
    }

    public aqfk(aqfl aqflVar) {
        this.c = aqflVar;
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
        return new aqfi(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqfk) && this.c.equals(((aqfk) obj).c);
    }

    public Integer getSelectionEnd() {
        return Integer.valueOf(this.c.e);
    }

    public Integer getSelectionStart() {
        return Integer.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "SuggestEditableTextSelectionStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
