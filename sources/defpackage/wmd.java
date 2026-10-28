package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface wmd {
    wkt a();

    wkt b();

    ListenableFuture c(wmc wmcVar, Executor executor);

    InnertubeContext$InnerTubeContext d(wmc wmcVar);

    EnumSet e();

    boolean f();

    void g(aihf aihfVar);

    void h(aihf aihfVar, String str);
}
