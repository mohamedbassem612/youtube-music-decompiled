package defpackage;

import android.app.Activity;
import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jku {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/util/MusicUtil");

    public static void a(Runnable runnable, Context context) {
        if (c(context)) {
            ((Activity) context).runOnUiThread(runnable);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                int i = agyj.b;
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw e;
                }
            } catch (IOException e2) {
                ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "MusicUtils")).j(e2)).k("com/google/android/apps/youtube/music/util/MusicUtil", "safeClose", 'e', "MusicUtil.java")).t("Error closing closeable");
            }
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException();
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean d(Context context) {
        if (c(context)) {
            return e(((cf) context).getSupportFragmentManager());
        }
        return false;
    }

    public static boolean e(dd ddVar) {
        ddVar.getClass();
        if (!ddVar.ad() && !ddVar.A) {
            return true;
        }
        ((agrc) ((agrc) a.c().i(agso.a, "MusicUtils")).k("com/google/android/apps/youtube/music/util/MusicUtil", "isFragmentTransactionAllowed", 83, "MusicUtil.java")).t("Fragment transaction is not allowed.");
        return false;
    }
}
