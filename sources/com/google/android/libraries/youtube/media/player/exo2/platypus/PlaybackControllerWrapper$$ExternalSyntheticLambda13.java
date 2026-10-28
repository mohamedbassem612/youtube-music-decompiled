package com.google.android.libraries.youtube.media.player.exo2.platypus;

import defpackage.wgs;
import defpackage.zik;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class PlaybackControllerWrapper$$ExternalSyntheticLambda13 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        wgs wgsVar = (wgs) obj;
        return zik.co(wgsVar.e(), wgsVar.C());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
