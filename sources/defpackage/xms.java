package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xms implements abrf, wop, wun {
    public final awmd a;

    public xms(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.wun
    public final void a(wuq wuqVar) {
        xmw xmwVar = (xmw) this.a.io();
        ydu yduVar = (ydu) xmwVar.g.io();
        aihf builder = xmwVar.l.toBuilder();
        builder.copyOnWrite();
        amyf amyfVar = (amyf) builder.instance;
        amyfVar.b &= -3;
        amyfVar.e = 0;
        long jD = yduVar.d();
        if (jD > 0) {
            builder.copyOnWrite();
            amyf amyfVar2 = (amyf) builder.instance;
            amyfVar2.b |= 2;
            amyfVar2.e = (int) (jD / 1000);
        }
        builder.copyOnWrite();
        ((amyf) builder.instance).g = amyf.emptyProtobufList();
        List listF = yduVar.f();
        if (!listF.isEmpty()) {
            builder.bB(listF);
        }
        builder.copyOnWrite();
        ((amyf) builder.instance).h = amyf.emptyProtobufList();
        builder.bA(yduVar.e());
        wuqVar.I = (amyf) builder.build();
    }

    @Override // defpackage.wks
    public final wkt b() {
        return wkt.MDX_BROWSE_REQUEST_MODIFIER;
    }

    @Override // defpackage.wks
    public final /* synthetic */ EnumSet c() {
        return EnumSet.allOf(wku.class);
    }

    @Override // defpackage.wks
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        ((woo) obj).G = ((xmw) this.a.io()).l;
    }

    @Override // defpackage.wks
    public final /* synthetic */ ListenableFuture e(Executor executor) {
        return ahno.ap(new wko(this, 2), executor);
    }

    @Override // defpackage.abrf
    public final void hX(abri abriVar) {
        abriVar.ae = ((xmw) this.a.io()).l;
    }
}
