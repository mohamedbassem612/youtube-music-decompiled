package defpackage;

import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.research.xeno.effect.Effect;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rff extends res implements atur, rhr {
    public static final /* synthetic */ int i = 0;
    public final AtomicReference a;
    private static final rbm k = new rbm("rff");
    private static final Duration j = Duration.ofMillis(250);

    public rff(qup qupVar, req reqVar) {
        super(qupVar, reqVar, true != reqVar.p().a.ag ? 0 : 3);
        this.a = new AtomicReference();
    }

    private final void r(rfc rfcVar) {
        this.a.set(rfcVar);
    }

    @Override // defpackage.res
    protected final Duration e() {
        return j;
    }

    @Override // defpackage.res
    protected final rei f() {
        ListenableFuture listenableFutureD;
        rht rhtVar;
        ListenableFuture listenableFutureD2;
        req reqVar = this.c;
        if (!reqVar.p().a.ag) {
            rhp rhpVarH = rht.h();
            rhpVarH.d(reqVar.u());
            rhpVarH.b(reqVar.i());
            rhpVarH.c(reqVar.j());
            rhpVarH.d = reqVar.p().a;
            rhpVarH.e = reqVar.r();
            rhpVarH.b = this;
            rhpVarH.h = reqVar.s();
            rht rhtVarA = rhpVarH.a();
            rhtVarA.o = this;
            rgo rgoVar = new rgo();
            rgoVar.b(rhtVarA);
            rgn rgnVar = new rgn(rgoVar);
            ria riaVar = new ria(this.b.a, reqVar.t(), reqVar);
            rgnVar.i(riaVar);
            riaVar.d(reqVar.q());
            ListenableFuture listenableFuture = aher.a;
            AtomicReference atomicReference = new AtomicReference();
            Effect effectI = nqz.i(nrc.e(reqVar.y()), atomicReference);
            if (effectI == null) {
                IllegalStateException illegalStateException = new IllegalStateException("load() failed with error: ".concat(String.valueOf((String) atomicReference.get())));
                listenableFutureD = ahng.m(illegalStateException);
                rbc rbcVar = new rbc(k, rbd.e);
                rbcVar.a = illegalStateException;
                rbcVar.c();
                rbcVar.a("Failed to load Xeno effect for text segment: [%s].", atomicReference.get());
            } else {
                listenableFutureD = reqVar.s().d(rhtVarA.j(agke.q(new qvk(effectI))), new hco(this, rhtVarA, riaVar, 7, (byte[]) null));
            }
            return new rfe(this, listenableFutureD, riaVar, rhtVarA, rgnVar);
        }
        rhp rhpVarH2 = rht.h();
        rhpVarH2.d(reqVar.u());
        rhpVarH2.b(reqVar.i());
        rhpVarH2.c(reqVar.j());
        rhpVarH2.d = reqVar.p().a;
        rhpVarH2.e = reqVar.r();
        rhpVarH2.b = this;
        rhpVarH2.h = reqVar.s();
        rht rhtVarA2 = rhpVarH2.a();
        rhtVarA2.o = this;
        agkz agkzVarE = nrc.e(reqVar.y());
        AtomicReference atomicReference2 = new AtomicReference();
        Effect effectI2 = nqz.i(agkzVarE, atomicReference2);
        rhe rheVar = new rhe();
        rheVar.i(this.b.c);
        int i2 = rgm.c;
        rgk rgkVar = new rgk();
        rgkVar.a = this.e;
        rgkVar.c = reqVar.p().a.c;
        rgkVar.b = j(reqVar.w());
        rgkVar.b(rhtVarA2);
        rgkVar.b(rheVar);
        rgkVar.d = reqVar.p().a;
        rgm rgmVarA = rgkVar.a();
        reqVar.K();
        rif rifVar = new rif(reqVar.m(), this.b.a, reqVar.n(), ((quy) this.b.b).j, Optional.empty(), new rih(reqVar.p().b, this.b.d, 1), reqVar.t(), reqVar.p().a, false, reqVar);
        qup qupVar = this.b;
        rgmVarA.l(qupVar.c, qupVar.b());
        rgmVarA.i(rifVar);
        rifVar.t(reqVar.n());
        rifVar.s(reqVar.q());
        if (effectI2 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("load() failed with error: ".concat(String.valueOf((String) atomicReference2.get())));
            listenableFutureD2 = ahng.m(illegalStateException2);
            rbc rbcVar2 = new rbc(k, rbd.e);
            rbcVar2.a = illegalStateException2;
            rbcVar2.c();
            rbcVar2.a("Failed to load Xeno effect for text segment: [%s].", atomicReference2.get());
            rhtVar = rhtVarA2;
        } else {
            rhtVar = rhtVarA2;
            listenableFutureD2 = reqVar.s().d(rhtVarA2.j(agke.q(new qvk(effectI2))), new hco(this, rhtVar, rifVar, 6, (byte[]) null));
        }
        return new rfd(this, listenableFutureD2, rifVar, rhtVar, rgmVarA, rheVar);
    }

    @Override // defpackage.rhr
    public final void h(String str) {
        rbc rbcVar = new rbc(k, rbd.c);
        rbcVar.c();
        rbcVar.a("TextSegmentRenderer onFrameError: %s", str);
        req reqVar = this.c;
        if (reqVar != null) {
            tge tgeVarA = quk.a();
            tgeVarA.e = str;
            tgeVarA.c = new quh(this.b.a, 3);
            reqVar.a(tgeVarA.e());
        }
    }

    @Override // defpackage.atur
    public final /* synthetic */ void l(Packet packet, String str, Object obj) {
        try {
            atrd atrdVar = (atrd) PacketGetter.b(packet, atrd.a);
            if ((atrdVar.b & 1) != 0) {
                atrm atrmVar = atrdVar.c;
                if (atrmVar == null) {
                    atrmVar = atrm.a;
                }
                if (!atrmVar.b.isEmpty()) {
                    atrm atrmVar2 = atrdVar.c;
                    if (atrmVar2 == null) {
                        atrmVar2 = atrm.a;
                    }
                    aiie<atrk> aiieVar = ((atrf) aguu.M(atrmVar2.b)).c;
                    RectF rectF = new RectF();
                    for (atrk atrkVar : aiieVar) {
                        rectF.union(atrkVar.c, atrkVar.d, atrkVar.e, atrkVar.f);
                    }
                    SizeF sizeF = ((quy) this.b.b).d;
                    r(new rfc(packet.a(), new Size((int) (rectF.width() * sizeF.getWidth()), (int) (rectF.height() * sizeF.getHeight()))));
                    return;
                }
            }
            r(rfc.a(packet.a()));
        } catch (aiik e) {
            rbc rbcVar = new rbc(k, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Failed to retrieve bounding box for rendered text.", new Object[0]);
            r(rfc.a(packet.a()));
        }
    }

    public final void q(rht rhtVar) {
        req reqVar = this.c;
        rar rarVarJ = nqz.j(this.b, 0, new rfb(this, reqVar.n().getWidth() / reqVar.o().getWidth(), 0));
        aihf aihfVarCreateBuilder = atrc.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atrl.a.createBuilder();
        atrg atrgVarB = rarVarJ.b(Duration.ZERO);
        aihfVarCreateBuilder2.copyOnWrite();
        atrl atrlVar = (atrl) aihfVarCreateBuilder2.instance;
        atrgVarB.getClass();
        atrlVar.a();
        atrlVar.b.add(atrgVarB);
        aihfVarCreateBuilder.copyOnWrite();
        atrc atrcVar = (atrc) aihfVarCreateBuilder.instance;
        atrl atrlVar2 = (atrl) aihfVarCreateBuilder2.build();
        atrlVar2.getClass();
        atrcVar.d = atrlVar2;
        atrcVar.c |= 1;
        atrc atrcVar2 = (atrc) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) atwa.a.createBuilder();
        aihhVar.e(atrc.b, atrcVar2);
        rhtVar.r("gl_skia_stickers_calculator_runtime_options", (atwa) aihhVar.build());
    }
}
