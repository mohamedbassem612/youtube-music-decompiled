package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iqg {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/store/MusicBrowserClientsPrefsStore");
    private final aunn b;
    private final Executor c;

    public iqg(aunn aunnVar, Executor executor) {
        this.b = aunnVar;
        this.c = executor;
    }

    public final ListenableFuture a(String str) {
        return ahno.ar(((ayq) this.b.io()).i(), new iii(str, 9), this.c);
    }

    public final ListenableFuture b(String str, ailn ailnVar) {
        ListenableFuture listenableFutureJ = ((ayq) this.b.io()).j(new vvg(str, ailnVar, 1));
        taf.j(listenableFutureJ, new gou(str, ailnVar, 13, null));
        return listenableFutureJ;
    }
}
