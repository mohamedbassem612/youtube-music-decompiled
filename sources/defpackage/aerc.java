package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aerc implements tdj {
    private final mbc a;
    private final aerd b;
    private final boolean c;

    public aerc(aerd aerdVar, mbc mbcVar, tqj tqjVar) {
        this.b = aerdVar;
        this.a = mbcVar;
        int i = tqr.a;
        this.c = tqjVar.a(1073960836) != 0;
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsh.b(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.c;
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsh.c(this);
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        if (this.c) {
            return;
        }
        this.b.b();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        if (this.c) {
            return;
        }
        aerd aerdVar = this.b;
        if (!aerdVar.l) {
            aerdVar.l = true;
            if (aerdVar.g) {
                aqiz aqizVar = aerdVar.f;
                if ((aqizVar.b & SemanticState.ReadOnly) != 0) {
                    aqiw aqiwVar = aqizVar.j;
                    if (aqiwVar == null) {
                        aqiwVar = aqiw.a;
                    }
                    if (aqiwVar.b.size() != 0) {
                        aqiw aqiwVar2 = aqizVar.j;
                        if (aqiwVar2 == null) {
                            aqiwVar2 = aqiw.a;
                        }
                        Iterator it = aqiwVar2.b.iterator();
                        while (it.hasNext()) {
                            aerdVar.h.add(Long.valueOf(((long) ((Integer) it.next()).intValue()) * 1000));
                        }
                        aerdVar.k = new aemk(aerdVar, 5, null);
                    }
                }
            }
        }
        if (aerdVar.k != null) {
            aerdVar.a(this.a.b());
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
