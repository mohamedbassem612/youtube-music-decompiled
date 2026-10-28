package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cch implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, cty, cfx, cbp {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ ccm a;

    public cch(ccm ccmVar) {
        this.a = ccmVar;
    }

    @Override // defpackage.cfx
    public final void A(cri criVar) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1032, new cea(cdyVarE, criVar, 16));
    }

    @Override // defpackage.cbp
    public final void a(boolean z) {
        this.a.ad();
    }

    @Override // defpackage.cfx
    public final void b(caw cawVar) {
        this.a.G.d(cawVar);
    }

    @Override // defpackage.cfx
    public final void c(String str, long j, long j2) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1008, new ceq(cdyVarE, str, j2, j, 1));
    }

    @Override // defpackage.cfx
    public final void d(String str) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1012, new cea(cdyVarE, str, 0));
    }

    @Override // defpackage.cfx
    public final void e(final long j) {
        ces cesVar = this.a.D;
        final cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1010, new bvs() { // from class: ceh
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).E(cdyVarE, j);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cfx
    public final void f(int i) {
        ccf ccfVar = new ccf(i, 1);
        final ccf ccfVar2 = new ccf(i, 0 == true ? 1 : 0);
        final bvc bvcVar = this.a.m;
        ahno.O(Looper.myLooper() == bvcVar.a.a());
        bvcVar.d++;
        bvcVar.b(new Runnable() { // from class: bva
            @Override // java.lang.Runnable
            public final void run() {
                Function function = ccfVar2;
                bvc bvcVar2 = bvcVar;
                bvcVar2.c = function.apply(bvcVar2.c);
                bvcVar2.c(new blq(bvcVar2, bvcVar2.c, 8, (short[]) null));
            }
        });
        bvcVar.e(ccfVar.apply(bvcVar.b));
    }

    @Override // defpackage.cfx
    public final void g(Exception exc) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1014, new cea(cdyVarE, exc, 17));
    }

    @Override // defpackage.cfx
    public final void h(final int i, final long j, final long j2) {
        ces cesVar = this.a.D;
        final cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1011, new bvs() { // from class: cee
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).H(cdyVarE, i, j, j2);
            }
        });
    }

    @Override // defpackage.cty
    public final void i(final int i, final long j) {
        ces cesVar = this.a.D;
        final cdy cdyVarD = cesVar.D();
        cesVar.H(cdyVarD, 1018, new bvs() { // from class: cei
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).P(cdyVarD, i, j);
            }
        });
    }

    @Override // defpackage.cty
    public final void j(final Object obj, final long j) {
        ccm ccmVar = this.a;
        ces cesVar = ccmVar.D;
        final cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 26, new bvs() { // from class: cep
            @Override // defpackage.bvs
            public final void a(Object obj2) {
                ((cdz) obj2).ac(cdyVarE, obj, j);
            }
        });
        if (ccmVar.t == obj) {
            ccmVar.F.h(26, new cce(0));
        }
    }

    @Override // defpackage.cfx
    public final void k(boolean z) {
        ccm ccmVar = this.a;
        if (ccmVar.w != z) {
            ccmVar.w = z;
            ccmVar.F.h(23, new ccg(z, 0));
        }
    }

    public final void l(bwj bwjVar) {
        this.a.aa(new cbo(2, bwjVar, null, 1003, null, -1, null, 4, null, false));
    }

    @Override // defpackage.cty
    public final void m(Exception exc) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1030, new cea(cdyVarE, exc, 2));
    }

    @Override // defpackage.cty
    public final void n(caw cawVar) {
        this.a.H.d(cawVar);
    }

    @Override // defpackage.cty
    public final void o(String str, long j, long j2) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1016, new ceq(cdyVarE, str, j2, j, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        ccm ccmVar = this.a;
        ccmVar.Z(surface);
        ccmVar.u = surface;
        ccmVar.V(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ccm ccmVar = this.a;
        ccmVar.Z(null);
        ccmVar.V(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.V(i, i2);
    }

    @Override // defpackage.cty
    public final void p(String str) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1019, new cea(cdyVarE, str, 6));
    }

    @Override // defpackage.cty
    public final void q(cay cayVar) {
        ces cesVar = this.a.D;
        cdy cdyVarD = cesVar.D();
        cesVar.H(cdyVarD, 1020, new cea(cdyVarD, cayVar, 10, null));
    }

    @Override // defpackage.cty
    public final void r(cay cayVar) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1015, new cea(cdyVarE, cayVar, 14, null));
    }

    @Override // defpackage.cty
    public final void s(final bse bseVar, final caz cazVar) {
        ces cesVar = this.a.D;
        final cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1017, new bvs() { // from class: cel
            @Override // defpackage.bvs
            public final void a(Object obj) {
                ((cdz) obj).aq(cdyVarE, bseVar, cazVar);
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.V(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.V(0, 0);
    }

    @Override // defpackage.cty
    public final void t(btz btzVar) {
        this.a.F.h(25, new cbv(btzVar, 17));
    }

    @Override // defpackage.cfx
    public final void u() {
        ces cesVar = this.a.D;
        cesVar.H(cesVar.E(), 1029, new cce(10));
    }

    @Override // defpackage.cfx
    public final void v() {
        ces cesVar = this.a.D;
        cdy cdyVarD = cesVar.D();
        cesVar.H(cdyVarD, 1013, new cbv(cdyVarD, 20));
    }

    @Override // defpackage.cfx
    public final void w() {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1007, new cbv(cdyVarE, 18));
    }

    @Override // defpackage.cfx
    public final void x(bse bseVar) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1009, new cea(cdyVarE, bseVar, 13, null));
    }

    @Override // defpackage.cty
    public final void y() {
        ces cesVar = this.a.D;
        cesVar.H(cesVar.D(), 1021, new cce(6));
    }

    @Override // defpackage.cfx
    public final void z(cri criVar) {
        ces cesVar = this.a.D;
        cdy cdyVarE = cesVar.E();
        cesVar.H(cdyVarE, 1031, new cea(cdyVarE, criVar, 11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
