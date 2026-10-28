package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aipm implements weh {
    static final aipk a;
    public static final weq b;
    private final aipj c;

    static {
        aipk aipkVar = new aipk();
        a = aipkVar;
        b = aipkVar;
    }

    public aipm(aipj aipjVar) {
        this.c = aipjVar;
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
        return new aipl(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aipm) && this.c.equals(((aipm) obj).c);
    }

    public Boolean getShouldRequireViewerAck() {
        return Boolean.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "AADCGuidelinesStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
