package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ably {
    public final Bitmap a;
    private final Rect b;

    public ably(Bitmap bitmap, Rect rect) {
        this.a = bitmap;
        this.b = rect;
    }

    public static ably a(Bitmap bitmap) {
        return new ably(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ably) {
            ably ablyVar = (ably) obj;
            if (this.a.equals(ablyVar.a) && this.b.equals(ablyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Rect rect = this.b;
        return "StoryboardFrame{mosaic=" + this.a.toString() + ", rect=" + rect.toString() + '}';
    }

    public ably() {
        throw null;
    }
}
