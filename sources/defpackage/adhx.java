package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adhx {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/image/ImageStorageUtil");

    public static int a(ContentResolver contentResolver, Uri uri) {
        int columnIndex;
        try {
            switch (new bmu(contentResolver.openInputStream(uri)).j()) {
                case 1:
                    return 0;
                case 2:
                default:
                    Cursor cursorQuery = null;
                    try {
                        cursorQuery = contentResolver.query(uri, new String[]{"orientation"}, null, null, null);
                        if (cursorQuery != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("orientation")) != -1) {
                            int i = cursorQuery.getInt(columnIndex);
                            cursorQuery.close();
                            return i;
                        }
                        if (cursorQuery == null) {
                            return 0;
                        }
                    } catch (IllegalArgumentException unused) {
                        if (cursorQuery == null) {
                            return 0;
                        }
                    } catch (Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        cursorQuery.close();
                        throw th;
                    }
                    cursorQuery.close();
                    return 0;
                case 3:
                case 4:
                    return 180;
                case 5:
                case 6:
                    return 90;
                case 7:
                case 8:
                    return -90;
            }
        } catch (IOException unused2) {
            return 0;
        }
        return 0;
    }

    public static Bitmap b(ContentResolver contentResolver, Uri uri, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        options.inSampleSize = 1;
        int i3 = options.outWidth / 2;
        int i4 = options.outHeight / 2;
        while (i > 0 && i3 / options.inSampleSize > i && i2 > 0 && i4 / options.inSampleSize > i2) {
            options.inSampleSize <<= 1;
        }
        options.inJustDecodeBounds = false;
        return c(BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options), contentResolver, uri);
    }

    public static Bitmap c(Bitmap bitmap, ContentResolver contentResolver, Uri uri) throws Throwable {
        Bitmap bitmap2;
        int iA = a(contentResolver, uri);
        if (iA != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(iA);
            try {
                bitmap2 = bitmap;
                try {
                    bitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                    bitmap2.recycle();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    bitmap2.recycle();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap2 = bitmap;
            }
        }
        return bitmap;
    }

    public static Pair d(ContentResolver contentResolver, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        return e(a(contentResolver, uri)) ? Pair.create(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth)) : Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public static boolean e(int i) {
        return Math.abs(i % 180) == 90;
    }
}
