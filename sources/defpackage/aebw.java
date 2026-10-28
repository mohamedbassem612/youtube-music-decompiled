package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aebw extends SparseArray {
    public aebw() {
        append(1, new String[]{"android.permission.CAMERA"});
        append(2, new String[]{"android.permission.RECORD_AUDIO"});
        append(3, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }

    public aebw(byte[] bArr) {
        append(0, new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"});
        append(4, new String[]{"android.permission.READ_MEDIA_IMAGES"});
        append(5, new String[]{"android.permission.READ_MEDIA_VIDEO"});
    }

    public aebw(byte[] bArr, byte[] bArr2) {
        append(0, new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        append(4, new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        append(5, new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
    }
}
