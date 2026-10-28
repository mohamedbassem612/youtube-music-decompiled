package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajgf implements aihr {
    ASSET_ITEM_USAGE_STATE_UNSPECIFIED(0),
    ASSET_ITEM_USAGE_STATE_NEW(1),
    ASSET_ITEM_USAGE_STATE_SEEN(2),
    ASSET_ITEM_USAGE_STATE_USED(3);

    public final int e;

    ajgf(int i) {
        this.e = i;
    }

    public static ajgf a(int i) {
        if (i == 0) {
            return ASSET_ITEM_USAGE_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return ASSET_ITEM_USAGE_STATE_NEW;
        }
        if (i == 2) {
            return ASSET_ITEM_USAGE_STATE_SEEN;
        }
        if (i != 3) {
            return null;
        }
        return ASSET_ITEM_USAGE_STATE_USED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
