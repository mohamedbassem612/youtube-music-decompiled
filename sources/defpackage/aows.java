package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aows implements weh {
    static final aowr a;
    public static final weq b;
    private final aowt c;

    static {
        aowr aowrVar = new aowr();
        a = aowrVar;
        b = aowrVar;
    }

    public aows(aowt aowtVar) {
        this.c = aowtVar;
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
        return new aowq(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aows) && this.c.equals(((aows) obj).c);
    }

    public ajgp getAttachmentType() {
        ajgp ajgpVarA = ajgp.a(this.c.e);
        return ajgpVarA == null ? ajgp.POST_ATTACHMENT_TYPE_ENUM_UNKNOWN : ajgpVarA;
    }

    public aowu getPostCreationData() {
        aowu aowuVar = this.c.d;
        return aowuVar == null ? aowu.a : aowuVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "PostCreationDataEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
