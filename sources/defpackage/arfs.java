package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum arfs implements aihr {
    SHORTS_CREATION_PACKAGE_UNKNOWN(0),
    SHORTS_CREATION_PACKAGE_CAMERA(1),
    SHORTS_CREATION_PACKAGE_EDIT(2),
    SHORTS_CREATION_PACKAGE_EDIT_THUMBNAIL(3);

    public final int e;

    arfs(int i) {
        this.e = i;
    }

    public static arfs a(int i) {
        if (i == 0) {
            return SHORTS_CREATION_PACKAGE_UNKNOWN;
        }
        if (i == 1) {
            return SHORTS_CREATION_PACKAGE_CAMERA;
        }
        if (i == 2) {
            return SHORTS_CREATION_PACKAGE_EDIT;
        }
        if (i != 3) {
            return null;
        }
        return SHORTS_CREATION_PACKAGE_EDIT_THUMBNAIL;
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
