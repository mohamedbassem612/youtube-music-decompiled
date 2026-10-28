package defpackage;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzt implements PackageManager$OnChecksumsReadyListener {
    public final SettableFuture a = SettableFuture.create();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.a.set("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksumM = qa$$ExternalSyntheticApiModelOutline0.m(list.get(i));
                if (apkChecksumM.getType() == 8) {
                    this.a.set(agyg.f.f().j(apkChecksumM.getValue()));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.a.set("");
    }
}
