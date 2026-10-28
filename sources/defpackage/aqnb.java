package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqnb implements weh {
    static final aqna a;
    public static final weq b;
    private final aqnc c;

    static {
        aqna aqnaVar = new aqna();
        a = aqnaVar;
        b = aqnaVar;
    }

    public aqnb(aqnc aqncVar) {
        this.c = aqncVar;
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
        return new aqmz(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqnb) && this.c.equals(((aqnb) obj).c);
    }

    public aqmy getTimedListData() {
        aqmy aqmyVar = this.c.d;
        return aqmyVar == null ? aqmy.a : aqmyVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "TimedMarkersListSyncEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
