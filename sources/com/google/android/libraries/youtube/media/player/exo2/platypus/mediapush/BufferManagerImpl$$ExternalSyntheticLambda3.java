package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import defpackage.yrr;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BufferManagerImpl$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ String a;
    public final /* synthetic */ yrr b;

    public /* synthetic */ BufferManagerImpl$$ExternalSyntheticLambda3(String str, yrr yrrVar) {
        this.a = str;
        this.b = yrrVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.a.equals(this.b.h);
    }
}
