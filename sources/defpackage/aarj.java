package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aarj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/sync/playbackposition/DefaultOfflineVideoPlaybackPositionSyncController");
    public final Executor b;
    public final awmd c;
    public final awmd d;
    public final awmd e;
    public final zwb f;
    public final aany g;
    public final ahbw h;
    public ListenableFuture i;
    public ListenableFuture j;
    public final vxz k;
    private ListenableFuture l;

    public aarj(avmb avmbVar, Executor executor, wbz wbzVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, zwb zwbVar, aany aanyVar, ahbw ahbwVar, vxz vxzVar) {
        this.b = executor;
        this.c = awmdVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.f = zwbVar;
        this.g = aanyVar;
        this.h = ahbwVar;
        this.k = vxzVar;
        if (vxzVar.l(180, 45706258L, false)) {
            return;
        }
        wbzVar.c().i(aret.class).O(avmbVar).af(new zgd(this, 13));
    }

    public static final aofh d(String str, long j) {
        aihf aihfVarCreateBuilder = aofh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
        aofhVar.c = 4;
        aofhVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
        str.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = str;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        aihl aihlVar = areq.b;
        aihf aihfVarCreateBuilder2 = areq.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        areq areqVar = (areq) aihfVarCreateBuilder2.instance;
        areqVar.c |= 1;
        areqVar.d = j;
        aihhVar.e(aihlVar, (areq) aihfVarCreateBuilder2.build());
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
        aofg aofgVar = (aofg) aihhVar.build();
        aofgVar.getClass();
        aofhVar3.e = aofgVar;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder.build();
    }

    public final void a() {
        ListenableFuture listenableFuture = this.l;
        if (listenableFuture == null || listenableFuture.isCancelled() || this.l.isDone()) {
            ListenableFuture listenableFutureD = ((aald) this.e.io()).d(this.f.e());
            this.l = listenableFutureD;
            taf.i(listenableFutureD, MoreExecutors.directExecutor(), new ztb(9), new yqj(this, 7), null);
        }
    }
}
