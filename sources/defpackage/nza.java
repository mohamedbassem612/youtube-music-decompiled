package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nza implements nri {
    public static final SparseArray b;
    public final int c;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public final nzk k;
    private boolean l;
    private final nzw m;
    private final Executor o;
    private final String p;
    private int s;
    private String t;
    private int q = -1;
    public boolean d = false;
    private String r = null;
    public final long e = SystemClock.elapsedRealtimeNanos() / 1000;
    private final nzo n = nrd.a();

    static {
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(16, nzs.ROOT_PREPARATION);
        sparseArray.put(6, nzs.ROOT_MOUNTING);
        sparseArray.put(22, nzs.ROOT_PERFORM_LAYOUT);
        sparseArray.put(23, nzs.ROOT_ON_MEASURE);
    }

    public nza(int i, String str, nzw nzwVar, Executor executor, fhd fhdVar, boolean z, nzk nzkVar) {
        this.l = false;
        this.s = -1;
        this.c = i;
        this.o = executor;
        this.m = nzwVar;
        this.p = str;
        this.t = (String) Map.EL.getOrDefault(fpr.a(fhdVar), "Component name", "");
        this.s = -1;
        this.l = z;
        this.k = nzkVar;
    }

    public static boolean h(int i, adam adamVar) {
        nzs nzsVar = (nzs) b.get(i);
        return nzsVar != null && adamVar.a(nzsVar);
    }

    @Override // defpackage.fkn
    public final void a(String str, int i) {
        if (this.c == 6 && str.equals("treeId")) {
            this.s = i;
        }
    }

    @Override // defpackage.fkn
    public final void b(String str, String str2) {
        if (str.equals("templateUri") && str2 != null) {
            this.t = str2;
            return;
        }
        if (str.equals("CellLogId")) {
            try {
                this.q = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.q = -1;
            }
        } else if (str.equals("CELL_NODE_ID")) {
            this.r = str2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fkn
    public final void c(String str) {
        if (this.c == 16 && this.l) {
            switch (str.hashCode()) {
                case -2086025552:
                    if (str.equals("start_create_layout")) {
                        this.i = SystemClock.elapsedRealtimeNanos() / 1000;
                        this.j = -1L;
                    }
                    break;
                case -935948671:
                    if (str.equals("start_measure")) {
                        this.g = SystemClock.elapsedRealtimeNanos() / 1000;
                        this.h = -1L;
                    }
                    break;
                case 749650793:
                    if (str.equals("end_create_layout")) {
                        this.j = SystemClock.elapsedRealtimeNanos() / 1000;
                    }
                    break;
                case 1694616058:
                    if (str.equals("end_measure")) {
                        this.h = SystemClock.elapsedRealtimeNanos() / 1000;
                    }
                    break;
            }
        }
    }

    @Override // defpackage.nri
    public final void d() {
        this.d = true;
    }

    @Override // defpackage.nri
    public final void e() {
        this.f = SystemClock.elapsedRealtimeNanos() / 1000;
        this.o.execute(new mga(this, 10));
    }

    @Override // defpackage.nri
    public final boolean f() {
        return !this.d;
    }

    public final void g(String str, long j, long j2) {
        nzq nzqVarA = nzr.a();
        nzqVarA.b = this.n;
        String str2 = this.t;
        if (str2 != null) {
            nzqVarA.c(new agqj(str2));
        }
        String str3 = this.r;
        if (str3 != null) {
            nzqVarA.c = str3;
        }
        if (this.s >= 0 && str.equals(nzs.ROOT_MOUNTING.x)) {
            nzqVarA.j = Integer.valueOf(this.s);
        }
        if (this.l) {
            nzqVarA.k = Boolean.TRUE;
        }
        nzk nzkVar = this.k;
        if (nzkVar != null && nzkVar.a) {
            nzqVarA.l = Integer.valueOf(nzkVar.b);
            nzqVarA.m = nzkVar.c;
        }
        nzp nzpVar = new nzp();
        nzpVar.b(str);
        nzpVar.a = Long.valueOf(j);
        nzpVar.b = Long.valueOf(j2);
        nzpVar.e = nzqVarA.a();
        nzt nztVarA = nzpVar.a();
        int i = this.q;
        nzw nzwVar = this.m;
        if (i > 0) {
            nzwVar.f(this.p, i, nztVarA);
        } else {
            nzwVar.g(this.p, nztVarA);
        }
    }
}
