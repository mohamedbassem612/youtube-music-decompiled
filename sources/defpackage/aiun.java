package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiun implements weh {
    static final aiul a;
    public static final weq b;
    private final aiuo c;

    static {
        aiul aiulVar = new aiul();
        a = aiulVar;
        b = aiulVar;
    }

    public aiun(aiuo aiuoVar) {
        this.c = aiuoVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        aiuo aiuoVar = this.c;
        if ((aiuoVar.b & 2) != 0) {
            agkxVar.c(aiuoVar.d);
        }
        return agkxVar.g();
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
        return new aium(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aiun) && this.c.equals(((aiun) obj).c);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "AdPlaybackDataEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
