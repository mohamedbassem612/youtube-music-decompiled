package defpackage;

import android.graphics.Bitmap;
import app.rive.semantics.SemanticState;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgz {
    public final List a;
    public final List b;
    public final Map c;
    public final List d;
    public final Bitmap e;
    public final Map f;
    public final Bitmap g;
    public final pzp h;
    public final Bitmap i;

    public /* synthetic */ pgz(List list, List list2, Map map, List list3, Bitmap bitmap, Map map2, Bitmap bitmap2, pzp pzpVar, int i) {
        this((i & 1) != 0 ? awno.a : list, (i & 2) != 0 ? awno.a : list2, (i & 4) != 0 ? awnp.a : map, (i & 8) != 0 ? awno.a : list3, (i & 16) != 0 ? null : bitmap, (i & 32) != 0 ? awnp.a : map2, (i & 64) != 0 ? null : bitmap2, (i & SemanticState.Focused) != 0 ? null : pzpVar, (Bitmap) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pgz) {
            pgz pgzVar = (pgz) obj;
            if (awrc.c(this.a, pgzVar.a) && awrc.c(this.b, pgzVar.b) && awrc.c(this.c, pgzVar.c) && awrc.c(this.d, pgzVar.d) && awrc.c(this.e, pgzVar.e) && awrc.c(this.f, pgzVar.f) && awrc.c(this.g, pgzVar.g) && awrc.c(this.h, pgzVar.h) && awrc.c(this.i, pgzVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Bitmap bitmap = this.e;
        int iHashCode2 = ((((iHashCode * 31) + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.f.hashCode()) * 31;
        Bitmap bitmap2 = this.g;
        int iHashCode3 = (iHashCode2 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        pzp pzpVar = this.h;
        int iHashCode4 = (iHashCode3 + (pzpVar == null ? 0 : pzpVar.hashCode())) * 31;
        Bitmap bitmap3 = this.i;
        return iHashCode4 + (bitmap3 != null ? bitmap3.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationImageHolder(iconBitmaps=" + this.a + ", bigPictureBitmaps=" + this.b + ", bigPictureImageToUriMap=" + this.c + ", expandedViewIconBitmaps=" + this.d + ", messagingStyleAvatarBitmap=" + this.e + ", messagingStyleImageToUriMap=" + this.f + ", shortcutIconBitmap=" + this.g + ", imageLoadingOutcome=" + this.h + ", enlargedImageBitmap=" + this.i + ')';
    }

    public pgz(List list, List list2, Map map, List list3, Bitmap bitmap, Map map2, Bitmap bitmap2, pzp pzpVar, Bitmap bitmap3) {
        list.getClass();
        list2.getClass();
        map.getClass();
        list3.getClass();
        map2.getClass();
        this.a = list;
        this.b = list2;
        this.c = map;
        this.d = list3;
        this.e = bitmap;
        this.f = map2;
        this.g = bitmap2;
        this.h = pzpVar;
        this.i = bitmap3;
    }

    public pgz() {
        this((List) null, (List) null, (Map) null, (List) null, (Bitmap) null, (Map) null, (Bitmap) null, (pzp) null, 511);
    }
}
