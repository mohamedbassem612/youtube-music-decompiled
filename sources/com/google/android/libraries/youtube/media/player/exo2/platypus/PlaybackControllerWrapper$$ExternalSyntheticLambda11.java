package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class PlaybackControllerWrapper$$ExternalSyntheticLambda11 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Integer.valueOf(((FormatIdOuterClass$FormatId) obj).c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
