package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ihu extends iil {
    public final Bitmap a;
    public final agke b;

    public ihu(Bitmap bitmap, agke agkeVar) {
        this.a = bitmap;
        if (agkeVar == null) {
            throw new NullPointerException("Null recentlyPlayedItemResults");
        }
        this.b = agkeVar;
    }

    @Override // defpackage.iil
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.iil
    public final agke b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iil) {
            iil iilVar = (iil) obj;
            Bitmap bitmap = this.a;
            if (bitmap != null ? bitmap.equals(iilVar.a()) : iilVar.a() == null) {
                if (aguu.v(this.b, iilVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return (((bitmap == null ? 0 : bitmap.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.b;
        return "WidgetThumbnailResults{primaryAlbumArtBitmap=" + String.valueOf(this.a) + ", recentlyPlayedItemResults=" + agkeVar.toString() + '}';
    }
}
