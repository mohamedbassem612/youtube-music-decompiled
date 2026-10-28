package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aalg {
    public final File a;
    public File b;
    public File c;
    private File d;

    public aalg(Context context, String str) {
        this.a = new File(b(context, str), "data");
    }

    static /* synthetic */ File b(Context context, String str) {
        context.getClass();
        int i = typ.a;
        if (ahno.aa(str)) {
            throw new IllegalArgumentException();
        }
        return new File(context.getFilesDir(), "offline" + File.separator + str);
    }

    public final File a(String str) {
        typ.f(str);
        if (this.d == null) {
            this.d = new File(this.a, "videos");
        }
        return new File(this.d, str);
    }
}
