package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inu {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/search/ZeroPrefixSearchSuggestionsResponseCache");
    public final ahey b;
    private final File c;
    private final vxz d;

    public inu(File file, ahey aheyVar, vxz vxzVar) {
        this.c = file;
        this.b = aheyVar;
        this.d = vxzVar;
    }

    public final File a() {
        boolean zL = this.d.l(0, 45712947L, false);
        File file = this.c;
        return zL ? new File(file, "searchlandingpageresponse.pbdata") : new File(file, "zeroprefixresponse.pbdata");
    }

    public final void b() {
        taq.c();
        if (a().delete()) {
            return;
        }
        ((agrc) ((agrc) a.c().i(agso.a, "ZeroPrefixCache")).k("com/google/android/apps/youtube/music/search/ZeroPrefixSearchSuggestionsResponseCache", "clearSuggestions", 102, "ZeroPrefixSearchSuggestionsResponseCache.java")).t("Error while deleting zero prefix cache");
    }

    public final void c(alxg alxgVar) {
        taq.c();
        try {
            agyo.d(alxgVar.toByteArray(), a());
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "ZeroPrefixCache")).j(e)).k("com/google/android/apps/youtube/music/search/ZeroPrefixSearchSuggestionsResponseCache", "setSuggestions", 'B', "ZeroPrefixSearchSuggestionsResponseCache.java")).t("Error writing to zero prefix cache file");
        }
    }
}
