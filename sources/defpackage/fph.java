package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fph extends fgv {
    public final fpj a;
    final fhd d;
    public final BitSet e;
    private final String[] f;

    public fph(fhd fhdVar, fpj fpjVar) {
        super(fhdVar, fpjVar);
        this.f = new String[]{"section"};
        BitSet bitSet = new BitSet(1);
        this.e = bitSet;
        this.a = fpjVar;
        this.d = fhdVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fpj a() {
        hmy.c(1, this.e, this.f);
        fpj fpjVar = this.a;
        fiq fiqVarV = fpjVar.E;
        if (fiqVarV == null) {
            fiqVarV = this.d.v(-1505688212, fpjVar.D());
        }
        fpjVar.E = fiqVarV;
        fiq fiqVarV2 = fpjVar.F;
        if (fiqVarV2 == null) {
            fiqVarV2 = this.d.v(-238194236, fpjVar.D());
        }
        fpjVar.F = fiqVarV2;
        fiq fiqVarV3 = fpjVar.G;
        if (fiqVarV3 == null) {
            fiqVarV3 = this.d.v(-1017305181, fpjVar.D());
        }
        fpjVar.G = fiqVarV3;
        return fpjVar;
    }

    public final void c(float f) {
        ayq ayqVar = this.c;
        this.a.a = ayqVar.z(f);
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void r(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void s() {
        this.a.d = false;
    }

    public final void f(nt ntVar) {
        this.a.t = ntVar;
    }

    public final void g(float f) {
        ayq ayqVar = this.c;
        this.a.v = ayqVar.z(f);
    }

    public final void h(float f) {
        ayq ayqVar = this.c;
        this.a.B = ayqVar.z(f);
    }

    public final void i(float f) {
        ayq ayqVar = this.c;
        this.a.D = ayqVar.z(f);
    }

    public final void j(qa qaVar) {
        if (qaVar != null) {
            fpj fpjVar = this.a;
            if (fpjVar.y == Collections.EMPTY_LIST) {
                fpjVar.y = new ArrayList();
            }
            fpjVar.y.add(qaVar);
        }
    }
}
