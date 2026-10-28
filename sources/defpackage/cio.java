package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cio {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final cjh i;
    public final cjf j;
    public final ciu k;
    public final agke l;
    public final cin m;
    private final List n;

    public cio(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ciu ciuVar, cjh cjhVar, cjf cjfVar, List list, List list2, cin cinVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.k = ciuVar;
        this.i = cjhVar;
        this.j = cjfVar;
        this.n = list == null ? Collections.EMPTY_LIST : list;
        this.l = list2 == null ? agpi.a : agke.n(list2);
        if (list2 != null && !list2.isEmpty()) {
            Uri uri = ((cis) aguu.K(list2)).a;
        }
        this.m = cinVar;
    }

    public final int a() {
        return this.n.size();
    }

    public final long b(int i) {
        long j;
        long j2;
        List list = this.n;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((aesh) list.get(i)).a;
        } else {
            j = ((aesh) list.get(i + 1)).a;
            j2 = ((aesh) list.get(i)).a;
        }
        return j - j2;
    }

    public final long c(int i) {
        return bwp.y(b(i));
    }

    public final aesh d(int i) {
        return (aesh) this.n.get(i);
    }
}
