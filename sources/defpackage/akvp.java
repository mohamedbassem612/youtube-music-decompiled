package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvp implements weh {
    static final akvo a;
    public static final weq b;
    private final akvq c;

    static {
        akvo akvoVar = new akvo();
        a = akvoVar;
        b = akvoVar;
    }

    public akvp(akvq akvqVar) {
        this.c = akvqVar;
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
        return new akvn(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof akvp) && this.c.equals(((akvp) obj).c);
    }

    public Long getButtonId() {
        return Long.valueOf(this.c.e);
    }

    public Boolean getIsSelected() {
        return Boolean.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "EntryPointButtonStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
