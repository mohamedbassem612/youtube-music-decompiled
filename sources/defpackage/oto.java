package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oto implements FrameSequenceDrawable.OnFinishedListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ oto(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.support.rastermill.FrameSequenceDrawable.OnFinishedListener
    public final void onFinished(FrameSequenceDrawable frameSequenceDrawable) {
        int i = this.$cid;
        ?? r2 = this.a;
        if (i == 0) {
            r2.run();
            return;
        }
        nxs nxsVar = (nxs) r2;
        CommandOuterClass$Command commandOuterClass$Command = nxsVar.a;
        if (commandOuterClass$Command != null) {
            nxsVar.b.a(commandOuterClass$Command, nrv.d().a()).D();
        }
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(1);
        frameSequenceDrawable.start();
    }
}
