package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adcz extends fkx {

    @fmt(a = 6)
    @fmu(a = fmv.a)
    public List a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nry b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public CommandOuterClass$Command f;

    public adcz() {
        super("SwipeableContainer");
    }

    private static final adcy aE(fhd fhdVar) {
        return (adcy) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        int i = fipVar.c;
        if (i == -1806852260) {
            isw iswVar = (isw) obj;
            fiu fiuVar = fipVar.b;
            fhd fhdVar = (fhd) fipVar.d[0];
            Object obj2 = iswVar.b;
            return Boolean.valueOf(aE(fhdVar).b.b((View) obj2, (MotionEvent) iswVar.a));
        }
        if (i != -1336101728) {
            if (i != -1048037474) {
                return null;
            }
            gzj.bO((fhd) fipVar.d[0], (isw) obj);
            return null;
        }
        isw iswVar2 = (isw) obj;
        fiu fiuVar2 = fipVar.b;
        fhd fhdVar2 = (fhd) fipVar.d[0];
        Object obj3 = iswVar2.b;
        return Boolean.valueOf(aE(fhdVar2).b.c((View) obj3, (MotionEvent) iswVar2.a));
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        adcy adcyVarAE = aE(fhdVar);
        nry nryVar = this.b;
        CommandOuterClass$Command commandOuterClass$Command = this.e;
        CommandOuterClass$Command commandOuterClass$Command2 = this.c;
        CommandOuterClass$Command commandOuterClass$Command3 = this.f;
        CommandOuterClass$Command commandOuterClass$Command4 = this.d;
        avmm avmmVar = new avmm();
        adcyVarAE.b = new adgq(fhdVar.a, new adda(avmmVar, nryVar, commandOuterClass$Command, commandOuterClass$Command2, commandOuterClass$Command3, commandOuterClass$Command4));
        adcyVarAE.a = avmmVar;
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        adcy adcyVarAE = aE(fhdVar);
        adgq adgqVar = adcyVarAE.b;
        avmm avmmVar = adcyVarAE.a;
        blf blfVar = adgqVar.b;
        if (blfVar != null) {
            blfVar.j();
        }
        avmmVar.b();
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        adcy adcyVar = (adcy) fkyVar;
        adcy adcyVar2 = (adcy) fkyVar2;
        adcyVar2.a = adcyVar.a;
        adcyVar2.b = adcyVar.b;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        List list = this.a;
        mjd mjdVarAE = mje.aE(fhdVar);
        mjdVarAE.b.k().F().t(o(adcz.class, "SwipeableContainer", fhdVar, -1806852260, new Object[]{fhdVar}));
        mjdVarAE.V(o(adcz.class, "SwipeableContainer", fhdVar, -1336101728, new Object[]{fhdVar}));
        mjdVarAE.i(1);
        mjdVarAE.e(list);
        return mjdVarAE.a();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new adcy();
    }
}
