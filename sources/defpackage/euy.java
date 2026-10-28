package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class euy implements eva {
    private static final String[] a = {"_data"};
    private final ContentResolver b;

    public euy(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.eva
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
