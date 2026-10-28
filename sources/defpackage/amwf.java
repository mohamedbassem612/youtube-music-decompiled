package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amwf implements weh {
    static final amwe a;
    public static final weq b;
    public final amwh c;

    static {
        amwe amweVar = new amwe();
        a = amweVar;
        b = amweVar;
    }

    public amwf(amwh amwhVar) {
        this.c = amwhVar;
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
        return new amwd(this.c.toBuilder());
    }

    public final boolean e() {
        return (this.c.c & 8) != 0;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof amwf) && this.c.equals(((amwf) obj).c);
    }

    public final boolean f() {
        return (this.c.c & 64) != 0;
    }

    public final boolean g() {
        return (this.c.c & 16) != 0;
    }

    public Integer getActiveItemIndex() {
        return Integer.valueOf(this.c.f);
    }

    public amwg getActiveSectionInfo() {
        amwg amwgVar = this.c.h;
        return amwgVar == null ? amwg.a : amwgVar;
    }

    public String getActiveSyncId() {
        return this.c.j;
    }

    public amwi getCurrentSyncMode() {
        amwi amwiVarA = amwi.a(this.c.i);
        return amwiVarA == null ? amwi.SYNC_MODE_UNKNOWN : amwiVarA;
    }

    public String getPanelId() {
        return this.c.e;
    }

    public Boolean getSyncEnabled() {
        return Boolean.valueOf(this.c.g);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MarkersEngagementPanelSyncEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
