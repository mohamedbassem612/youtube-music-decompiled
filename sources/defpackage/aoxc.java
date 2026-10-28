package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoxc implements weh {
    static final aoxb a;
    public static final weq b;
    private final aoxd c;

    static {
        aoxb aoxbVar = new aoxb();
        a = aoxbVar;
        b = aoxbVar;
    }

    public aoxc(aoxd aoxdVar) {
        this.c = aoxdVar;
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
        return new aoxa(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aoxc) && this.c.equals(((aoxc) obj).c);
    }

    public aoxe getPostEphemeralitySettings() {
        aoxe aoxeVar = this.c.d;
        return aoxeVar == null ? aoxe.a : aoxeVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "PostEphemeralitySettingsEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
