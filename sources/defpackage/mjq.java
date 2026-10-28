package defpackage;

import com.google.android.libraries.elements.interfaces.DirectUpdateProcessor;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mjq extends fkx {

    @fmt(a = 10)
    @fmu(a = fmv.a)
    fgy a;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mjs c;

    public mjq() {
        super("DirectPropertyUpdate");
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        mjp mjpVar = (mjp) fhdVar.i().c;
        mjs mjsVar = this.c;
        mjsVar.c();
        mjsVar.a();
        mjpVar.a = new AtomicReference(mjsVar);
    }

    @Override // defpackage.fgy
    public final void I(fhd fhdVar) {
        mjs mjsVar = (mjs) ((mjp) fhdVar.i().c).a.get();
        if (mjsVar == null || !mjsVar.l) {
            return;
        }
        mjsVar.c();
        mjsVar.a();
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        mjs mjsVar = (mjs) ((mjp) fhdVar.i().c).a.get();
        if (mjsVar != null) {
            DirectUpdateProcessor directUpdateProcessor = mjsVar.b;
            if (directUpdateProcessor != null) {
                directUpdateProcessor.dispose();
                mjsVar.b = null;
            }
            mjsVar.c = null;
            mjsVar.l = true;
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        ((mjp) fkyVar2).a = ((mjp) fkyVar).a;
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
        mjp mjpVar = (mjp) fhdVar.i().c;
        fgy fgyVar = this.a;
        mjs mjsVar = this.c;
        boolean z = this.b;
        AtomicReference atomicReference = mjpVar.a;
        int i = fmd.b;
        fmc fmcVar = new fmc(fhdVar, new fmd());
        fmcVar.c(fgyVar);
        mjs mjsVar2 = (mjs) atomicReference.get();
        if (mjsVar2 != null) {
            if (z && mjsVar2.l) {
                mjsVar2.c();
            }
            EnumMap enumMap = new EnumMap(asmn.class);
            enumMap.put(asmn.DYNAMIC_PROP_TYPE_ALPHA, Float.valueOf(mjsVar.f));
            enumMap.put(asmn.DYNAMIC_PROP_TYPE_SCALE_X, Float.valueOf(mjsVar.g));
            enumMap.put(asmn.DYNAMIC_PROP_TYPE_SCALE_Y, Float.valueOf(mjsVar.h));
            enumMap.put(asmn.DYNAMIC_PROP_TYPE_ROTATION, Float.valueOf(mjsVar.i));
            enumMap.put(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X, Float.valueOf(mjsVar.j));
            enumMap.put(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y, Float.valueOf(mjsVar.k));
            mjsVar2.b(enumMap);
            DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = mjsVar.d;
            if (directUpdatePropertiesOuterClass$DirectUpdateProperties != null && (!mjsVar2.a || !directUpdatePropertiesOuterClass$DirectUpdateProperties.equals(mjsVar2.d))) {
                mjsVar2.d = directUpdatePropertiesOuterClass$DirectUpdateProperties;
                mjsVar2.a();
            }
            ksy.ay(fmcVar, mjsVar2.e);
        } else {
            mjsVar.c();
            atomicReference.set(mjsVar);
            mjsVar.a();
            ksy.ay(fmcVar, mjsVar.e);
        }
        return fmcVar.a();
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        mjq mjqVar = (mjq) super.l();
        fgy fgyVar = mjqVar.a;
        mjqVar.a = fgyVar != null ? fgyVar.l() : null;
        return mjqVar;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mjp();
    }
}
