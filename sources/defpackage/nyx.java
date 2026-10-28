package defpackage;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class nyx extends qa {
    final /* synthetic */ nqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyx(nqt nqtVar) {
        super((byte[]) null);
        this.a = nqtVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032 A[Catch: all -> 0x008a, TryCatch #2 {, blocks: (B:6:0x0012, B:8:0x0023, B:10:0x0029, B:16:0x005e, B:12:0x0032, B:14:0x004a, B:15:0x004c), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x004a A[Catch: all -> 0x008a, TryCatch #2 {, blocks: (B:6:0x0012, B:8:0x0023, B:10:0x0029, B:16:0x005e, B:12:0x0032, B:14:0x004a, B:15:0x004c), top: B:45:0x0012 }] */
    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        nyy nyyVar;
        List list;
        if (i != 1) {
            if (i == 0) {
                nqt nqtVar = this.a;
                synchronized (((nyz) nqtVar).h) {
                    ((nyz) nqtVar).g.g = SystemClock.elapsedRealtimeNanos() / 1000;
                }
                return;
            }
            return;
        }
        nqt nqtVar2 = this.a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        synchronized (((nyz) nqtVar2).h) {
            nyy nyyVar2 = ((nyz) nqtVar2).g;
            if (nyyVar2.e.equals(nzs.PAGE_INITIAL_RENDERING)) {
                ((nyz) nqtVar2).f.add(((nyz) nqtVar2).g);
                nyyVar = ((nyz) nqtVar2).g;
                if (nyyVar.g == 0) {
                    nyyVar.g = jElapsedRealtimeNanos;
                }
                ((nyz) nqtVar2).g = new nyy(nzs.FEED_SCROLL);
                ((nyz) nqtVar2).g.f = jElapsedRealtimeNanos;
            } else {
                long j = nyyVar2.g;
                if (j != 0 && jElapsedRealtimeNanos - j >= 1000000) {
                    ((nyz) nqtVar2).f.add(((nyz) nqtVar2).g);
                    nyyVar = ((nyz) nqtVar2).g;
                    if (nyyVar.g == 0) {
                        nyyVar.g = jElapsedRealtimeNanos;
                    }
                    ((nyz) nqtVar2).g = new nyy(nzs.FEED_SCROLL);
                    ((nyz) nqtVar2).g.f = jElapsedRealtimeNanos;
                }
            }
        }
        nqt nqtVar3 = this.a;
        nyz nyzVar = (nyz) nqtVar3;
        synchronized (nyzVar.h) {
            list = ((nyz) nqtVar3).f;
            ((nyz) nqtVar3).f = new ArrayList();
        }
        nyzVar.d.execute(new msh(nqtVar3, list, 10));
    }
}
