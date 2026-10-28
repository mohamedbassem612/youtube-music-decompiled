package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.StateMachineHandle;
import defpackage.awmy;
import defpackage.awqp;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$4 extends awrb implements awqp {
    public RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$4(Object obj) {
        super(7, obj, CommandQueue.class, "pointerDown", "pointerDown-iHGrxBs(JLapp/rive/Fit;FFIFF)V", 0);
    }

    @Override // defpackage.awqp
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m313invokeiHGrxBs(((StateMachineHandle) obj).m570unboximpl(), (Fit) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue(), ((Number) obj5).intValue(), ((Number) obj6).floatValue(), ((Number) obj7).floatValue());
        return awmy.a;
    }

    /* JADX INFO: renamed from: invoke-iHGrxBs, reason: not valid java name */
    public final void m313invokeiHGrxBs(long j, Fit fit, float f, float f2, int i, float f3, float f4) {
        fit.getClass();
        ((CommandQueue) this.receiver).m452pointerDowniHGrxBs(j, fit, f, f2, i, f3, f4);
    }
}
