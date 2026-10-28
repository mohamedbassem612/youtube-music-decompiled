package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dzt {
    public abstract dzk a(String str);

    public abstract dzk b(UUID uuid);

    public abstract dzk c(List list);

    public abstract void d();

    public abstract dzk e(String str, int i, List list);

    public final dzk f(ayq ayqVar) {
        return c(atqq.H(ayqVar));
    }

    public abstract dzk g(String str, int i, ayq ayqVar);

    public final dzk h(String str, int i, ayq ayqVar) {
        str.getClass();
        List listSingletonList = Collections.singletonList(ayqVar);
        listSingletonList.getClass();
        return e(str, i, listSingletonList);
    }

    public abstract ListenableFuture i(dov dovVar);
}
