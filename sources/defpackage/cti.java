package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cti {
    public static final Executor a = new cte(0);
    public final Context b;
    public final SparseArray c;
    public final boolean d;
    public final cuc e;
    public final bvd f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final ctq i;
    public bwn j = new bwn();
    public final bse k;
    public bvq l;
    public Pair m;
    public int n;
    public int o;
    public long p;
    public int q;
    public final zs r;

    public cti(ctf ctfVar) {
        this.b = ctfVar.a;
        zs zsVar = ctfVar.h;
        zsVar.getClass();
        this.r = zsVar;
        this.c = new SparseArray();
        agke agkeVar = agpi.a;
        this.d = ctfVar.c;
        bvd bvdVar = ctfVar.d;
        this.f = bvdVar;
        this.h = -ctfVar.f;
        ctq ctqVar = ctfVar.g;
        this.i = ctqVar;
        this.e = new cst(ctfVar.b, ctqVar, bvdVar);
        this.g = new CopyOnWriteArraySet();
        this.k = new bse(new bsd());
        this.p = -9223372036854775807L;
        this.q = -1;
        this.o = 0;
    }

    public static final bru b(bru bruVar) {
        return (bruVar == null || !bruVar.g()) ? bru.a : bruVar;
    }

    public final void a() {
        this.e.b();
    }
}
