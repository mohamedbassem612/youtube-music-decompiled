package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajga implements aihr {
    ASSET_ITEM_SELECTED_STATE_UNKNOWN(0),
    ASSET_ITEM_SELECTED_STATE_UNSELECTED(1),
    ASSET_ITEM_SELECTED_STATE_SELECTED(2),
    ASSET_ITEM_SELECTED_STATE_LOADING(3);

    public final int e;

    ajga(int i) {
        this.e = i;
    }

    public static ajga a(int i) {
        if (i == 0) {
            return ASSET_ITEM_SELECTED_STATE_UNKNOWN;
        }
        if (i == 1) {
            return ASSET_ITEM_SELECTED_STATE_UNSELECTED;
        }
        if (i == 2) {
            return ASSET_ITEM_SELECTED_STATE_SELECTED;
        }
        if (i != 3) {
            return null;
        }
        return ASSET_ITEM_SELECTED_STATE_LOADING;
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
