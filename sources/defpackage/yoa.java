package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yoa extends IOException {
    public yoa() {
        super("Transfer timed out.");
    }

    public yoa(Throwable th) {
        super("[Offline] Thumbnail transfer timed out.", th);
    }
}
