package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ardd implements weh {
    static final ardc a;
    public static final weq b;
    private final arde c;

    static {
        ardc ardcVar = new ardc();
        a = ardcVar;
        b = ardcVar;
    }

    public ardd(arde ardeVar) {
        this.c = ardeVar;
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
        return new ardb(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ardd) && this.c.equals(((ardd) obj).c);
    }

    public aofb getOfflineModeType() {
        aofb aofbVarA = aofb.a(this.c.d);
        return aofbVarA == null ? aofb.OFFLINE_TYPE_UNKNOWN : aofbVarA;
    }

    public aigj getPersistentData() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "VideoDownloadContextEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
