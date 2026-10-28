package app.rive.core;

import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awqg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class FrameTickerKt$ChoreographerFrameTicker$1 implements FrameTicker {
    public static final FrameTickerKt$ChoreographerFrameTicker$1 INSTANCE = new FrameTickerKt$ChoreographerFrameTicker$1();

    static final awmy withFrame$lambda$0(awqg awqgVar, long j) {
        awqgVar.invoke(Long.valueOf(j));
        return awmy.a;
    }

    @Override // app.rive.core.FrameTicker
    public final Object withFrame(final awqg awqgVar, awoq awoqVar) {
        Object objWithFrameNanosChoreographer = FrameTickerKt.withFrameNanosChoreographer(new awqg() { // from class: app.rive.core.FrameTickerKt$ChoreographerFrameTicker$1$$ExternalSyntheticLambda0
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return FrameTickerKt$ChoreographerFrameTicker$1.withFrame$lambda$0(awqgVar, ((Long) obj).longValue());
            }
        }, awoqVar);
        return objWithFrameNanosChoreographer != awox.a ? awmy.a : objWithFrameNanosChoreographer;
    }
}
