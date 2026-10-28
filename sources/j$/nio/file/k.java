package j$.nio.file;

import java.nio.file.OpenOption;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements m {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ k(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.m, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v5, types: [j$.nio.file.m, java.nio.file.LinkOption] */
    public static /* synthetic */ m a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof l) {
            return ((l) openOption).a;
        }
        if (openOption instanceof LinkOption) {
            return a.c((LinkOption) openOption);
        }
        return openOption instanceof x ? a.e((x) openOption) : new k(openOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof k) {
            obj = ((k) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
