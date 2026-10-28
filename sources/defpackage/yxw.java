package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yxw implements bzg {
    private final zjd a;
    private final yxr b;
    private final Map c = new HashMap();

    public yxw(zjd zjdVar, yxr yxrVar) {
        zkf.d(zjdVar);
        this.a = zjdVar;
        this.b = yxrVar;
    }

    @Override // defpackage.bzg
    public final synchronized void a(bye byeVar, byi byiVar, boolean z, int i) {
        yxv yxvVar = (yxv) this.c.get(byeVar);
        if (yxvVar == null) {
            return;
        }
        if (yxvVar.c == 0 && i > 0) {
            this.a.w(yxvVar.a, yxvVar.b);
        }
        long j = i;
        if (!yxvVar.b) {
            if (yxvVar.a) {
                long j2 = yxvVar.c;
                if (j2 < 102400 && j2 + j >= 102400) {
                    this.a.az();
                }
            } else {
                long j3 = yxvVar.c;
                if (j3 < 40960 && j3 + j >= 40960) {
                    this.a.f();
                }
            }
        }
        yxvVar.c += j;
    }

    @Override // defpackage.bzg
    public final synchronized void b(bye byeVar, byi byiVar, boolean z) {
        Map map = this.c;
        yxv yxvVar = (yxv) map.get(byeVar);
        if (yxvVar == null) {
            return;
        }
        if (yxvVar.b) {
            this.a.y(yxvVar.a);
        }
        map.remove(byeVar);
    }

    @Override // defpackage.bzg
    public final synchronized void c(bye byeVar, byi byiVar, boolean z) {
        Uri uri = byiVar.a;
        if ("/videoplayback".equals(uri.getPath())) {
            try {
                int i = Integer.parseInt(uri.getQueryParameter("itag"));
                long j = byiVar.h;
                boolean z2 = j == 0;
                yxr yxrVar = this.b;
                if (yxrVar != null) {
                    long j2 = j + byiVar.b;
                    long j3 = byiVar.i;
                    if (!yxrVar.f) {
                        Map map = yxrVar.e;
                        Integer numValueOf = Integer.valueOf(i);
                        if (!map.containsKey(numValueOf)) {
                            zhq zhqVar = zhq.ABR;
                            map.put(numValueOf, Long.valueOf(j2));
                        }
                    }
                }
                Set setC = wir.c();
                Integer numValueOf2 = Integer.valueOf(i);
                if (setC.contains(numValueOf2)) {
                    this.c.put(byeVar, new yxv(true, z2));
                    this.a.aA(i, z2);
                } else if (wir.b().contains(numValueOf2)) {
                    this.c.put(byeVar, new yxv(false, z2));
                    this.a.g(i, z2);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // defpackage.bzg
    public final synchronized void d(bye byeVar, byi byiVar, boolean z) {
        yxv yxvVar = (yxv) this.c.get(byeVar);
        if (yxvVar == null) {
            return;
        }
        this.a.as(yxvVar.a, yxvVar.b);
    }
}
