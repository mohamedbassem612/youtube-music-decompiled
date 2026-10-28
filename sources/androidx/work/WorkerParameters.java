package androidx.work;

import defpackage.awou;
import defpackage.axfd;
import defpackage.dyp;
import defpackage.dyw;
import defpackage.dzv;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final dyp b;
    public final Set c;
    public final int d;
    public final Executor e;
    public final awou f;
    public final dzv g;
    public final dyw h;
    public final axfd i;

    public WorkerParameters(UUID uuid, dyp dypVar, Collection collection, int i, Executor executor, awou awouVar, axfd axfdVar, dzv dzvVar, dyw dywVar) {
        this.a = uuid;
        this.b = dypVar;
        this.c = new HashSet(collection);
        this.d = i;
        this.e = executor;
        this.f = awouVar;
        this.i = axfdVar;
        this.g = dzvVar;
        this.h = dywVar;
    }
}
