package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acmb implements acln, aclo, rsq {
    public final awku d;
    private final mbc e;
    private avmn m;
    private final vyo n;
    private boolean f = false;
    private boolean g = false;
    private long h = 0;
    private String i = null;
    private String j = null;
    public long a = 0;
    public String b = null;
    private String k = null;
    private String l = null;
    public long c = 0;

    public acmb(mbc mbcVar, vyo vyoVar) {
        Duration duration = Duration.ZERO;
        int i = awku.k;
        duration.getClass();
        this.d = new awku(duration);
        this.e = mbcVar;
        this.n = vyoVar;
        mbcVar.b();
    }

    private final void y() {
        this.c = 0L;
        w();
        this.b = null;
        this.k = null;
        this.l = null;
    }

    @Override // defpackage.acln
    public final void b(String str, boolean z, boolean z2) {
        y();
        this.f = z;
        this.g = z2;
        this.i = str;
        if (z) {
            this.a = 0L;
            this.h = 0L;
            this.j = str;
            this.e.b();
            if (afxw.e(this.n).cq) {
                this.d.kk(Duration.ofMillis(this.a));
                return;
            }
            return;
        }
        this.h = this.a;
        if (z2) {
            this.k = str;
            return;
        }
        this.b = str;
        this.c = this.e.f().toEpochMilli();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i = avlh.a;
        this.m = avlh.F(1000L, 1000L, timeUnit, awlg.a()).ak(new acjp(this, 7));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00a3, please report this as an issue */
    @Override // defpackage.acln
    public final void c(int i, String str) {
        boolean zEquals;
        String str2 = this.j;
        if (str2 != null && str2.equals(str)) {
            this.e.b();
            this.j = null;
            return;
        }
        String str3 = this.b;
        if (str3 == null) {
            String str4 = this.k;
            if (str4 != null) {
                zEquals = str4.equals(str);
            }
            if (this.f) {
            }
            rmp.n(null, "ReelTslaMgr: onPageExit is not matching the current processing identifier, onPageExit identifier: " + str + ", processing identifier: " + this.i);
        }
        zEquals = str3.equals(str);
        if (zEquals) {
            if (i == 0) {
                if (str3 != null) {
                    x();
                    this.d.kk(Duration.ofMillis(this.a));
                }
                if (this.f) {
                    long j = this.a;
                    if (j != 0) {
                        rmp.n(null, "ReelTslaMgr: accumulatedWatchTimeMs is not 0 for ad. The page identifier: " + this.i + ", accumulatedWatchTimeMs: " + j + ", accumulatedOnPageEnterTimeMs: " + this.h);
                    }
                } else {
                    long j2 = this.h;
                    long j3 = this.a;
                    if (j2 >= j3) {
                        rmp.n(null, "ReelTslaMgr: accumulatedWatchTimeMs is not greater than accumulatedOnPageEnterTimeMs. The page identifier: " + this.i + ", isVideo: " + this.g + ", accumulatedWatchTimeMs: " + j3 + ", accumulatedOnPageEnterTimeMs: " + j2);
                    }
                }
                y();
                return;
            }
            return;
        }
        if (this.f) {
            rmp.n(null, "ReelTslaMgr: onPageExit is not matching the current processing identifier, onPageExit identifier: " + str + ", processing identifier: " + this.i);
        }
    }

    @Override // defpackage.rsq
    public final void k(aayw aaywVar) {
        if (aaywVar.b == abnw.d) {
            this.l = aaywVar.f;
        }
    }

    @Override // defpackage.rsq
    public final void p(String str, long j, int i) {
        String str2;
        if (i != 1 || (str2 = this.l) == null || !str2.equals(str) || this.f) {
            return;
        }
        long j2 = this.c;
        if (j > j2) {
            long j3 = this.a + (j - j2);
            this.a = j3;
            this.c = j;
            this.d.kk(Duration.ofMillis(j3));
        }
    }

    public final void w() {
        avmn avmnVar = this.m;
        if (avmnVar != null && !avmnVar.f()) {
            awka.f((AtomicReference) this.m);
        }
        this.m = null;
    }

    public final void x() {
        long epochMilli = this.e.f().toEpochMilli();
        long j = epochMilli - this.c;
        if (j > 0) {
            this.a += j;
        }
        this.c = epochMilli;
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.aclo
    public final /* synthetic */ void ag() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ap() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ar() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void as() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void at() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void a(agkz agkzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ah(int i, boolean z) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
