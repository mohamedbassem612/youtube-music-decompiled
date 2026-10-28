package defpackage;

import android.content.Context;
import java.io.File;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vet implements Supplier {
    private final Context a;

    public vet(Context context) {
        this.a = context;
    }

    public final File a() {
        File[] externalFilesDirs = this.a.getExternalFilesDirs(null);
        File file = new File(externalFilesDirs != null ? externalFilesDirs[0] : null, "shorts_project");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // java.util.function.Supplier
    @Deprecated
    public final /* bridge */ /* synthetic */ Object get() {
        File[] externalFilesDirs = this.a.getExternalFilesDirs(null);
        File file = new File(externalFilesDirs != null ? externalFilesDirs[0] : null, "shorts_project");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
