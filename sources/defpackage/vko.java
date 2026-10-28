package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vko {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FontCachesController");
    public final Context b;
    public final File c;
    private final zvl d;

    public vko(Context context, zvl zvlVar) {
        this.b = context;
        this.d = zvlVar;
        this.c = new File(context.getFilesDir(), vcb.g);
    }

    public final void a(Exception exc) {
        String message = exc.getMessage() == null ? "Font cache error" : exc.getMessage();
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 40;
        zvjVarA.d(message);
        zvjVarA.f(exc);
        this.d.a(zvjVarA.a());
        ((agrc) ((agrc) ((agrc) a.b()).j(exc)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/text/FontCachesController", "logError", (char) 200, "FontCachesController.java")).w("%s", message);
    }
}
