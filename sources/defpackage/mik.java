package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mik {
    public RecyclerView a;
    public npv b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mlf d;
    public final /* synthetic */ nsl e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ AtomicReference h;
    public final /* synthetic */ adfx i;
    public final /* synthetic */ ci j;

    public mik(ci ciVar, adfx adfxVar, boolean z, mlf mlfVar, nsl nslVar, boolean z2, boolean z3, AtomicReference atomicReference) {
        this.j = ciVar;
        this.i = adfxVar;
        this.c = z;
        this.d = mlfVar;
        this.e = nslVar;
        this.f = z2;
        this.g = z3;
        this.h = atomicReference;
    }

    public final void a(RecyclerView recyclerView) {
        boolean z = false;
        for (int i = 0; i < recyclerView.e(); i++) {
            qa qaVarAF = recyclerView.aF(i);
            if (qaVarAF instanceof npv) {
                npv npvVar = (npv) qaVarAF;
                npvVar.m(recyclerView);
                z |= npvVar == this.b;
            }
        }
        npv npvVar2 = this.b;
        if (npvVar2 != null && !z) {
            npvVar2.m(recyclerView);
        }
        this.b = null;
    }
}
