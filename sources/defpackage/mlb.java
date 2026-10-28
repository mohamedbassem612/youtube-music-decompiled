package defpackage;

import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlb implements ntv {
    private final nvp a;
    private final mky b;
    private final mkz c;
    private final mep d;
    private final boolean e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;

    public mlb(Optional optional, Optional optional2, nvp nvpVar, mky mkyVar, mkz mkzVar, mep mepVar, Optional optional3, boolean z, Optional optional4, Optional optional5) {
        if (mkyVar == null && mkzVar == null) {
            throw new nud("No input function object provided to ElementTypeConverterFlat");
        }
        this.a = nvpVar;
        this.b = mkyVar;
        this.c = mkzVar;
        this.d = mepVar;
        this.e = z;
        this.f = optional;
        this.g = optional2;
        this.h = optional3;
        this.i = optional4;
        this.j = optional5;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ntv
    public final fgy a(fhd fhdVar, nsl nslVar, nay nayVar, List list, nth nthVar, boolean z) {
        mip mipVar;
        ntq ntqVar;
        String str;
        nsl nslVar2;
        fhd fhdVar2;
        fgv fgvVarD;
        ntq ntqVar2;
        nvy nvyVar;
        nsl nslVarA = nslVar;
        if (!nayVar.n()) {
            throw new nud("Element missing type");
        }
        nff nffVarJ = nayVar.j();
        mep mepVar = this.d;
        if (!nffVarJ.e(mepVar)) {
            throw new nud("Element missing correct type extension");
        }
        met metVarD = nayVar.j().d(mepVar);
        nds ndsVarI = nayVar.m() ? nayVar.i() : nnb.a;
        String strK = nayVar.k();
        if (ndsVarI.e(mzl.I)) {
            agke agkeVarC = nslVarA.c();
            if (agkeVarC == null) {
                agkeVarC = agpi.a;
            }
            mipVar = new mip(agkeVarC);
        } else {
            mipVar = null;
        }
        boolean z2 = false;
        boolean z3 = mepVar == mzt.K || mepVar == mzq.J;
        asnu asnuVarD = nslVarA.d();
        adfx adfxVarI = nslVarA.i();
        ntx ntxVar = nslVarA.x;
        if (ntxVar != null && (nvyVar = ntxVar.f) != null) {
            z2 = nvyVar.d;
        }
        mkn mknVar = new mkn(asnuVarD, adfxVarI, z3, z2, this.f, this.g, this.h, this.i, this.j);
        if (nthVar != null) {
            ntg ntgVarA = nthVar.a(mknVar);
            nsk nskVar = new nsk(nslVarA);
            nskVar.k = ntgVarA;
            nslVarA = nskVar.a();
            ntqVar = ntgVarA;
        } else {
            ntqVar = mknVar;
        }
        nsl nslVar3 = nslVarA;
        mky mkyVar = this.b;
        if (mkyVar != null) {
            fhdVar2 = fhdVar;
            fgvVarD = mkyVar.a(fhdVar2, nslVar3, metVarD, strK, ndsVarI, mipVar, list);
            nslVar2 = nslVar3;
            str = strK;
        } else {
            str = strK;
            nslVar2 = nslVar3;
            fhdVar2 = fhdVar;
            mkz mkzVar = this.c;
            if (mkzVar == null) {
                throw new nud("No input function object provided to ElementTypeConverterFlat");
            }
            fgvVarD = mkzVar.d(fhdVar2, nslVar2, nayVar);
        }
        if (str != null) {
            fgvVarD.z(str);
        }
        mknVar.a = fgvVarD;
        if (z) {
            this.a.b(mknVar);
        }
        if (z3) {
            ntqVar2 = ntqVar;
        } else {
            fhd fhdVar3 = fhdVar2;
            nsl nslVar4 = nslVar2;
            ntqVar2 = ntqVar;
            this.a.a(fhdVar3, nslVar4, str, ndsVarI, ntqVar2, mipVar);
            fhdVar2 = fhdVar3;
            String str2 = nslVar4.v;
            if (str2 != null && nslVar4.w) {
                ntqVar2.t(R.id.elements_tree_debug_id, str2);
            }
        }
        mep mepVar2 = mwo.B;
        if (ndsVarI.e(mepVar2)) {
            mow.b((mwo) ndsVarI.d(mepVar2), ntqVar2);
        }
        fgy fgyVarB = ntqVar2.b(fhdVar2);
        mknVar.a = null;
        return fgyVarB;
    }

    @Override // defpackage.ntv
    public final mep b() {
        return this.d;
    }

    @Override // defpackage.ntv
    public final boolean c() {
        return this.e;
    }
}
