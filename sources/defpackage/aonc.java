package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aonc implements aihr {
    PHOTO_UPLOAD_STATUS_UNSPECIFIED(0),
    PHOTO_UPLOAD_STATUS_UPLOADING(1),
    PHOTO_UPLOAD_STATUS_FAILED(2);

    public final int d;

    aonc(int i) {
        this.d = i;
    }

    public static aonc a(int i) {
        if (i == 0) {
            return PHOTO_UPLOAD_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return PHOTO_UPLOAD_STATUS_UPLOADING;
        }
        if (i != 2) {
            return null;
        }
        return PHOTO_UPLOAD_STATUS_FAILED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
