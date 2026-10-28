package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ywh implements ywj {
    public static final ywh a = new ywh(ywj.c);
    public final ywj b;
    private final Handler d = new Handler(Looper.getMainLooper());

    public ywh(ywj ywjVar) {
        this.b = ywjVar;
    }

    private final void B(Runnable runnable) {
        if (a.x()) {
            runnable.run();
        } else {
            this.d.post(afwl.i(runnable));
        }
    }

    @Override // defpackage.ywj
    public final void A(final long j, final long j2, final ywk ywkVar, final boolean z, final long j3, final zgs zgsVar) {
        B(new Runnable() { // from class: ywf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.A(j, j2, ywkVar, z, j3, zgsVar);
            }
        });
    }

    @Override // defpackage.ywj
    public final yxj a() {
        return this.b.a();
    }

    @Override // defpackage.ywj
    public final zjd b() {
        return this.b.b();
    }

    @Override // defpackage.ywj
    public final void c(int i) {
        B(new rir(this, i, 12));
    }

    @Override // defpackage.ywj
    public final void d(int i) {
        B(new rir(this, i, 11));
    }

    @Override // defpackage.yxg
    public final void e() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ygz(ywjVar, 15));
    }

    @Override // defpackage.yxg
    public final void f(wgs wgsVar, long j, long j2, ywx[] ywxVarArr) {
        this.b.f(wgsVar, j, j2, ywxVarArr);
    }

    @Override // defpackage.yxg
    public final void g() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ygz(ywjVar, 14));
    }

    @Override // defpackage.yxg
    public final void h(zhz zhzVar) {
        B(new yts(this, zhzVar, 7));
    }

    @Override // defpackage.yxg
    public final void i(zhz zhzVar, yxj yxjVar) {
        B(new yag((Object) this, (Object) zhzVar, (Object) yxjVar, 4, (char[]) null));
    }

    @Override // defpackage.yxg
    public final void j(yvu yvuVar) {
        B(new yts(this, yvuVar, 3, null));
    }

    @Override // defpackage.yxg
    public final void k(long j, long j2) {
        B(new ywg(this, j, j2, 0));
    }

    @Override // defpackage.yxg
    public final void l(String str) {
        B(new yts(this, str, 4));
    }

    @Override // defpackage.yxg
    public final void m() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ygz(ywjVar, 19));
    }

    @Override // defpackage.yxg
    public final void n() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ygz(ywjVar, 18));
    }

    @Override // defpackage.yxg
    public final void o(long j, appa appaVar) {
        B(new laz(this, j, appaVar, 10));
    }

    @Override // defpackage.yxg
    public final void p(float f) {
        B(new ywe(this, f, 0));
    }

    @Override // defpackage.yxg
    public final void q() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ygz(ywjVar, 17));
    }

    @Override // defpackage.yxg
    public final void r() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ygz(ywjVar, 20));
    }

    @Override // defpackage.yxg
    public final void s(long j) {
        B(new jup(this, j, 13));
    }

    @Override // defpackage.yxg
    public final void t(aphs aphsVar) {
        B(new yts(this, aphsVar, 6));
    }

    @Override // defpackage.yxg
    public final void u() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ywt(ywjVar, 1));
    }

    @Override // defpackage.yxg
    public final void v(long j, appa appaVar) {
        B(new laz(this, j, appaVar, 8));
    }

    @Override // defpackage.yxg
    public final void w(long j, appa appaVar) {
        B(new laz(this, j, appaVar, 9));
    }

    @Override // defpackage.yxg
    public final void x(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) {
        B(new yts(this, stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList, 8, null));
    }

    @Override // defpackage.yxg
    public final void y() {
        ywj ywjVar = this.b;
        ywjVar.getClass();
        B(new ygz(ywjVar, 16));
    }

    @Override // defpackage.yxg
    public final void z(arfb arfbVar) {
        B(new yts(this, arfbVar, 5));
    }
}
