package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hue implements aheh {
    final /* synthetic */ Function a;
    final /* synthetic */ String b;
    public final /* synthetic */ huf c;

    public hue(huf hufVar, Function function, String str) {
        this.a = function;
        this.b = str;
        this.c = hufVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) huf.a.b().i(agso.a, "Offline")).k("com/google/android/apps/youtube/music/offline/orchestration/MusicPlaylistDownloadController$3", "onFailure", 388, "MusicPlaylistDownloadController.java")).t("Couldn't fetch music library entity.");
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        Collection.EL.stream((List) this.a.apply((annv) optional.get())).forEach(new hfo(this, this.b, 15, null));
    }
}
