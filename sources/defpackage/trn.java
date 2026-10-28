package defpackage;

import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trn implements bnu {
    public boolean a;
    private final ArrayList b;

    public trn(tqj tqjVar, oml omlVar) {
        new ConcurrentHashMap();
        this.a = false;
        Process.myTid();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new trm("@UI", 2, omlVar));
        arrayList.add(new trm("@CRITICAL", 1, omlVar));
        int i = tqr.a;
        if (tqjVar.a(1074010927) != 0) {
            arrayList.add(new trm("RenderThread", 2, omlVar));
        }
    }

    private final synchronized void b() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            trm trmVar = (trm) arrayList.get(i);
            boolean z = trmVar.d;
            if (trmVar.c) {
                ((mcs) trmVar.f.a).a(-1);
                trmVar.d = false;
            } else {
                int i2 = trmVar.b;
                if (i2 != 0) {
                    int threadPriority = Process.getThreadPriority(i2);
                    if (threadPriority >= 0) {
                        trmVar.d = false;
                    } else {
                        Process.setThreadPriority(i2, Math.min(threadPriority + 1000, 0));
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, tqj] */
    public final synchronized void a(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            trm trmVar = (trm) arrayList.get(i2);
            if ((!trmVar.d || trmVar.a.equals("@UI")) && (i != 2 || trmVar.e != 1)) {
                if (trmVar.c) {
                    oml omlVar = trmVar.f;
                    ?? r6 = omlVar.b;
                    int i3 = tqr.a;
                    int iA = (int) ((((long) r6.a(1074404098)) >> 5) & 15);
                    ((mcs) omlVar.a).a(iA > 0 ? iA - 19 : -19);
                } else {
                    int i4 = trmVar.b;
                    if (i4 != 0) {
                        if (Process.getThreadPriority(i4) > -20) {
                            Process.setThreadPriority(i4, -20);
                        }
                    }
                }
                trmVar.d = true;
            }
        }
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        b();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        a(2);
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        b();
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
}
