package defpackage;

import android.net.Uri;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ula {
    public final vft a;
    public final vfs b;
    public final Uri c;
    public final Size d;
    public final use e;
    public final umi f;
    public final ulp g;
    private final uxj h;
    private final Long i;

    public ula(vft vftVar, vfs vfsVar, uxj uxjVar, Uri uri, Long l, Size size, umi umiVar, use useVar, ulp ulpVar) {
        this.a = vftVar;
        this.b = vfsVar;
        this.h = uxjVar;
        this.c = uri;
        this.i = l;
        this.d = size;
        this.f = umiVar;
        this.e = useVar;
        this.g = ulpVar;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ula) {
            ula ulaVar = (ula) obj;
            if (this.a.equals(ulaVar.a) && this.b.equals(ulaVar.b) && this.h.equals(ulaVar.h) && this.c.equals(ulaVar.c) && ((l = this.i) != null ? l.equals(ulaVar.i) : ulaVar.i == null) && this.d.equals(ulaVar.d) && this.f.equals(ulaVar.f) && this.e.equals(ulaVar.e) && this.g.equals(ulaVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.c.hashCode();
        Long l = this.i;
        return (((((((((iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        ulp ulpVar = this.g;
        use useVar = this.e;
        umi umiVar = this.f;
        Size size = this.d;
        Uri uri = this.c;
        uxj uxjVar = this.h;
        vfs vfsVar = this.b;
        return "LoadDraftArguments{shortsProjectState=" + String.valueOf(this.a) + ", shortsEditorProjectState=" + String.valueOf(vfsVar) + ", shortsEffectsManager=" + String.valueOf(uxjVar) + ", sourceVideoUri=" + String.valueOf(uri) + ", videoDurationMs=" + this.i + ", playerDimensions=" + String.valueOf(size) + ", timelineCallback=" + String.valueOf(umiVar) + ", mediaCompositionManagerFactory=" + String.valueOf(useVar) + ", draftRestoreErrorHandler=" + String.valueOf(ulpVar) + '}';
    }

    public ula() {
        throw null;
    }
}
