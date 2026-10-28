package defpackage;

import com.google.mediapipe.framework.Packet;
import com.google.research.xeno.effect.NativeCallbacks$AuxOutputCallback;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class atvs implements NativeCallbacks$AuxOutputCallback {
    public final /* synthetic */ CopyOnWriteArraySet a;
    public final /* synthetic */ ahub b;

    public /* synthetic */ atvs(ahub ahubVar, CopyOnWriteArraySet copyOnWriteArraySet) {
        this.b = ahubVar;
        this.a = copyOnWriteArraySet;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$AuxOutputCallback
    public final void onOutput(Packet packet, String str, long j) {
        int i = atvu.a;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        Object objT = this.b.t(j);
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((atur) it.next()).l(packet, str, objT);
        }
    }
}
