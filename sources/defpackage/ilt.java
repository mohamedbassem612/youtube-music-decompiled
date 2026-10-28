package defpackage;

import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ilt {
    public final isi a;
    private final LoadingFrameLayout b;

    public ilt(LoadingFrameLayout loadingFrameLayout, isi isiVar) {
        if (loadingFrameLayout == null) {
            throw new NullPointerException("Null view");
        }
        this.b = loadingFrameLayout;
        this.a = isiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilt) {
            ilt iltVar = (ilt) obj;
            if (this.b.equals(iltVar.b) && this.a.equals(iltVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        isi isiVar = this.a;
        return "AppErrorViewModel{view=" + this.b.toString() + ", controller=" + isiVar.toString() + '}';
    }

    public ilt() {
        throw null;
    }
}
