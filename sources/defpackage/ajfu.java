package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfu implements weh {
    static final ajfs a;
    public static final weq b;
    private final ajfw c;

    static {
        ajfs ajfsVar = new ajfs();
        a = ajfsVar;
        b = ajfsVar;
    }

    public ajfu(ajfw ajfwVar) {
        this.c = ajfwVar;
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
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ajft d() {
        return new ajft(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajfu) && this.c.equals(((ajfu) obj).c);
    }

    public String getAssetId() {
        return this.c.e;
    }

    public ajga getAssetItemSelectedState() {
        ajga ajgaVarA = ajga.a(this.c.f);
        return ajgaVarA == null ? ajga.ASSET_ITEM_SELECTED_STATE_UNKNOWN : ajgaVarA;
    }

    public Integer getAssetItemType() {
        return Integer.valueOf(this.c.g);
    }

    public List getSelectedAssetIds() {
        return this.c.h;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "AssetItemCurrentlySelectedEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
