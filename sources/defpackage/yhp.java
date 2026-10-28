package defpackage;

import com.google.android.libraries.youtube.media.interfaces.MediaCacheReadTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yhp extends MediaCacheReadTask {
    private final yhg a;

    public yhp(yhg yhgVar) {
        this.a = yhgVar;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MediaCacheReadTask
    public final void cancel() {
        this.a.a();
    }
}
