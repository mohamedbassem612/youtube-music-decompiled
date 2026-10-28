package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcf implements eub {
    @Override // defpackage.eth
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, ety etyVar) throws Throwable {
        try {
            fff.c(((fce) ((ewf) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // defpackage.eub
    public final int b() {
        return 1;
    }
}
