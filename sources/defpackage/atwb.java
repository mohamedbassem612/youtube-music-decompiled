package defpackage;

import android.content.Context;
import java.io.File;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atwb {
    public static volatile atwb a;
    public String b;
    public int c = 0;

    public atwb(Context context) {
        for (File file : context.getFilesDir().listFiles(new zhi(3))) {
            atqn.a(file);
        }
        this.b = a(context);
    }

    public final String a(Context context) {
        File file = new File(context.getFilesDir(), "XenoEffectBuilderSandboxes_".concat(String.valueOf(String.valueOf(UUID.randomUUID()))));
        if (file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }
}
