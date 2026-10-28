package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class exh implements exd {
    private final mqd a;

    public exh(Context context) {
        this.a = new mqd(context);
    }

    @Override // defpackage.exd
    public final exe a() {
        mqd mqdVar = this.a;
        File cacheDir = ((Context) mqdVar.b).getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, (String) mqdVar.a);
        if (file == null) {
            return null;
        }
        if (file.isDirectory() || file.mkdirs()) {
            return new exi(file);
        }
        return null;
    }
}
