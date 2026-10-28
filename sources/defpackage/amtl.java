package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amtl implements weh {
    static final amtk a;
    public static final weq b;
    private final amtm c;

    static {
        amtk amtkVar = new amtk();
        a = amtkVar;
        b = amtkVar;
    }

    public amtl(amtm amtmVar) {
        this.c = amtmVar;
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
        return new amtj(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof amtl) && this.c.equals(((amtl) obj).c);
    }

    public Boolean getLockModeInTransition() {
        return Boolean.valueOf(this.c.e);
    }

    public amtn getLockModeStateEnum() {
        amtn amtnVarA = amtn.a(this.c.d);
        return amtnVarA == null ? amtn.LOCK_MODE_STATE_ENUM_UNKNOWN : amtnVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LockModeStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
