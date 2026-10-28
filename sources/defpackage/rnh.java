package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rnh {
    public static final agkz a = new agqj("image/gif");

    public static String a(ContentResolver contentResolver, Uri uri) {
        String type = contentResolver.getType(uri);
        return (type == null || type.isEmpty()) ? "image/unknown" : type;
    }
}
