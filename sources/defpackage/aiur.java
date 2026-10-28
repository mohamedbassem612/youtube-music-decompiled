package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiur implements weh {
    static final aiup a;
    public static final weq b;
    private final aius c;

    static {
        aiup aiupVar = new aiup();
        a = aiupVar;
        b = aiupVar;
    }

    public aiur(aius aiusVar) {
        this.c = aiusVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aiuq(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aiur) && this.c.equals(((aiur) obj).c);
    }

    public Boolean getFullscreenForced() {
        return Boolean.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "AdPlayerFullscreenStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
