package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hnn implements aajz {
    public final grj a;

    public hnn(grj grjVar) {
        this.a = grjVar;
    }

    @Override // defpackage.aajz
    public final ListenableFuture a(Collection collection) {
        return ahng.n(agke.n((List) j$.util.Collection.EL.stream(collection).map(new hfw(this, 11)).collect(Collectors.toList())));
    }

    @Override // defpackage.aajz
    public final Class b() {
        return anyx.class;
    }
}
