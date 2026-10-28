package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zhi implements FilenameFilter {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int $cid;

    public zhi(int i) {
        this.$cid = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                throw null;
            }
            if (i != 2) {
                return str.startsWith("XenoEffectBuilderSandboxes");
            }
            if (str.endsWith(".tmp") || str.endsWith(".rm")) {
                return true;
            }
        } else if (!str.equals("cached_content_index.exi") && !zhj.a.matcher(str).matches() && !zhj.b.matcher(str).matches() && !zhj.c.matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
