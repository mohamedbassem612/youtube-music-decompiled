package defpackage;

import android.os.Bundle;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sum {
    protected final wvi a;
    public final sud b;
    public final xeu c;
    public final awmd d;
    public final cf e;
    public final xit f;
    public xir g;
    public final Executor h;
    public sul k;
    public xgn l;
    public final vxz m;
    public qcb n;
    private final ttm o;
    private final xgm p;
    private final svl q;
    private final abfv r;
    public boolean j = true;
    boolean i = false;

    public sum(wvi wviVar, ttm ttmVar, xgm xgmVar, xeu xeuVar, xit xitVar, awmd awmdVar, cf cfVar, Executor executor, abfv abfvVar, svl svlVar, vxz vxzVar) {
        this.a = wviVar;
        this.o = ttmVar;
        this.p = xgmVar;
        this.c = xeuVar;
        this.f = xitVar;
        this.d = awmdVar;
        this.e = cfVar;
        this.h = executor;
        this.r = abfvVar;
        this.q = svlVar;
        this.m = vxzVar;
        sud sudVar = new sud();
        this.b = sudVar;
        sudVar.j(new suj(this));
    }

    public final xgn a() {
        xgn xgnVar = this.l;
        return xgnVar == null ? this.p.hB() : xgnVar;
    }

    public final void b(amaz amazVar, ajwn ajwnVar) {
        akdd akddVar;
        CharSequence charSequenceD;
        qcb qcbVar;
        if (this.i) {
            acb acbVar = new acb((char[]) null);
            acbVar.c = "Get Cart";
            if ((amazVar.b & 64) != 0) {
                acbVar.d = amazVar.l;
            }
            xeu xeuVar = this.c;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_CANCELLED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                xeuVar.b(acbVar.g());
            }
        }
        ambc ambcVar = amazVar.j;
        if (ambcVar == null) {
            ambcVar = ambc.a;
        }
        if (ambcVar.b == 64099105) {
            ambc ambcVar2 = amazVar.j;
            if (ambcVar2 == null) {
                ambcVar2 = ambc.a;
            }
            akddVar = ambcVar2.b == 64099105 ? (akdd) ambcVar2.c : akdd.a;
        } else {
            akddVar = null;
        }
        if (akddVar != null) {
            acwl.i(this.e, akddVar, (vxe) this.d.io(), a(), null, true, true, null, null, null, null, this.r, false);
            c();
            this.i = false;
            return;
        }
        ambc ambcVar3 = amazVar.j;
        if ((ambcVar3 == null ? ambc.a : ambcVar3).b == 65500215) {
            if (ambcVar3 == null) {
                ambcVar3 = ambc.a;
            }
            charSequenceD = nsg.d(ambcVar3.b == 65500215 ? (arqe) ambcVar3.c : arqe.a);
        } else {
            charSequenceD = null;
        }
        if (charSequenceD != null) {
            e(charSequenceD);
            this.i = false;
            return;
        }
        if ((amazVar.b & 8) != 0 && (qcbVar = this.n) != null) {
            ambc ambcVar4 = amazVar.j;
            if (ambcVar4 == null) {
                ambcVar4 = ambc.a;
            }
            CharSequence charSequenceA = qcbVar.a(ambcVar4);
            if (charSequenceA != null) {
                e(charSequenceA);
                this.i = false;
                return;
            }
        }
        xir xirVar = this.g;
        if (xirVar != null) {
            xirVar.n("ttcr");
        }
        int i = amazVar.b;
        if ((i & SemanticState.Hidden) == 0) {
            int i2 = amazVar.c;
            if (i2 == 15) {
                sul sulVar = this.k;
                sulVar.getClass();
                amazVar.getClass();
                suq suqVar = new suq();
                suqVar.k = sulVar;
                Bundle bundle = new Bundle();
                bundle.putByteArray("get_cart_response", amazVar.toByteArray());
                suqVar.setArguments(bundle);
                suqVar.h(this.e.getSupportFragmentManager(), "upgrade_dialog");
            } else if (i2 == 7) {
                this.q.b((aigj) amazVar.d, amazVar.n, amazVar.l, "", null, new suk(this, amazVar));
            } else {
                acb acbVar2 = new acb((char[]) null);
                acbVar2.a = 18;
                acbVar2.c = "Empty Get Cart Response";
                if ((i & 64) != 0) {
                    acbVar2.d = amazVar.l;
                }
                xeu xeuVar2 = this.c;
                if (xeuVar2.b) {
                    xff xffVarA2 = xeuVar2.a(acbVar2.o(), alot.TRANSACTION_FLOW_FAILED);
                    ztf ztfVar2 = xffVarA2.k.e;
                    xffVarA2.l = ztfVar2.a();
                    ztfVar2.k(xffVarA2);
                } else {
                    xeuVar2.b(acbVar2.h());
                }
            }
        } else if (!this.i) {
            vxe vxeVar = (vxe) this.d.io();
            ajwo ajwoVar = amazVar.m;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.a(ajwoVar);
        }
        if (ajwnVar != null) {
            nsh.h((vxe) this.d.io(), ajwnVar);
        }
        this.i = false;
    }

    public final void c() {
        sul sulVar = this.k;
        if (sulVar != null) {
            sulVar.d();
        }
    }

    public final void d(Throwable th) {
        e(this.o.b(th));
    }

    public final void e(CharSequence charSequence) {
        sul sulVar = this.k;
        if (sulVar != null) {
            sulVar.e(charSequence);
        }
    }

    public final void f(wvg wvgVar, ajwn ajwnVar) {
        if (!this.j) {
            zvp.a(zvn.a, zvm.l, "youtubePayment::PaymentController Fail to start buy flow because a YPCGetCart request is already being sent out.");
            return;
        }
        nsh.g((vxe) this.d.io(), ajwnVar);
        this.j = false;
        if (this.m.m(12, 45461736L)) {
            this.b.iR(false);
        }
        sud sudVar = this.b;
        cf cfVar = this.e;
        sudVar.gT(cfVar.getSupportFragmentManager(), sud.k);
        acb acbVar = new acb((char[]) null);
        acbVar.c = "Get cart without prefetch";
        this.g = this.f.n(185);
        wvi wviVar = this.a;
        Executor executor = this.h;
        ListenableFuture listenableFutureF = wviVar.j.m(8, 45408146L) ? ahcs.f(wviVar.c(wviVar.d.e(), ajgq.ENGAGEMENT_TYPE_YPC_GET_CART, executor), afwl.d(new qzc(wviVar, wvgVar, executor, 17)), executor) : wviVar.e.b(wvgVar, executor, null);
        if (wviVar.i.l(3, 45370961L, false)) {
            yno.ef(wviVar.h, listenableFutureF, executor, 159);
        }
        taf.k(cfVar, listenableFutureF, new gyr((Object) this, (Object) acbVar, (Object) ajwnVar, 9), new gyr((Object) this, (Object) acbVar, (Object) ajwnVar, 10));
    }
}
