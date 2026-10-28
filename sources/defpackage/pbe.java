package defpackage;

import android.content.Intent;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbe {
    public String a;
    public plx b;
    public Intent c;
    public aicf d;
    public pbh e;
    public int f;
    private int g;
    private pbd h;
    private List i;
    private aiff j;
    private pzn k;
    private boolean l;
    private byte m;

    public final pbf a() {
        int i;
        pbd pbdVar;
        List list;
        aiff aiffVar;
        pzn pznVar;
        pbh pbhVar;
        if (this.m == 3 && (i = this.f) != 0 && (pbdVar = this.h) != null && (list = this.i) != null && (aiffVar = this.j) != null && (pznVar = this.k) != null && (pbhVar = this.e) != null) {
            return new pbf(i, this.g, this.a, this.b, pbdVar, list, aiffVar, this.c, pznVar, this.d, this.l, pbhVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == 0) {
            sb.append(" source");
        }
        if ((this.m & 1) == 0) {
            sb.append(" type");
        }
        if (this.h == null) {
            sb.append(" eventThreadType");
        }
        if (this.i == null) {
            sb.append(" threads");
        }
        if (this.j == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.k == null) {
            sb.append(" localThreadState");
        }
        if ((this.m & 2) == 0) {
            sb.append(" activityLaunched");
        }
        if (this.e == null) {
            sb.append(" removalInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.l = z;
        this.m = (byte) (this.m | 2);
    }

    public final void c(pzn pznVar) {
        if (pznVar == null) {
            throw new NullPointerException("Null localThreadState");
        }
        this.k = pznVar;
    }

    public final void d(aiff aiffVar) {
        if (aiffVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.j = aiffVar;
    }

    public final void e(int i) {
        this.g = i;
        this.m = (byte) (this.m | 1);
    }

    public final void f(List list) {
        if (list == null) {
            throw new NullPointerException("Null threads");
        }
        this.i = list;
        this.h = pbd.a;
    }
}
