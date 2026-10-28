package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import defpackage.ahbt;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BufferManagerImpl$$ExternalSyntheticLambda4 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Long.valueOf(Math.max(ahbt.a((Duration) obj), 0L));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
