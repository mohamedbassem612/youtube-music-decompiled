package j$.nio.file;

import java.nio.file.PathMatcher;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements w {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ u(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    @Override // j$.nio.file.w
    public final /* synthetic */ boolean c(Path path) {
        return this.a.matches(p.h(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
