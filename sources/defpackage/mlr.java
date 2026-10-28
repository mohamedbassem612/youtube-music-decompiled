package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mlr extends fkx {
    public static final /* synthetic */ int d = 0;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Supplier a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nso c;

    public mlr() {
        super("Reference");
    }

    private static final mlq aE(fhd fhdVar) {
        return (mlq) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        nay nayVarD;
        mlq mlqVarAE = aE(fhdVar);
        Supplier supplier = this.a;
        mls mlsVar = (mls) fhdVar.k(mls.class);
        mlt mltVar = (mlt) supplier.get();
        mlw mlwVar = new mlw(fhdVar);
        String strA = mltVar.a();
        if (strA == null || mlsVar == null || !mlsVar.a(strA)) {
            nayVarD = mltVar.d(mlwVar);
        } else {
            mltVar = mlx.a;
            nayVarD = null;
        }
        mlqVarAE.a = mltVar;
        mlqVarAE.c = mlwVar;
        mlqVarAE.b = nayVarD;
    }

    @Override // defpackage.fgy
    public final void I(fhd fhdVar) {
        mlq mlqVarAE = aE(fhdVar);
        mlt mltVar = mlqVarAE.a;
        mlqVarAE.c.a = fhdVar;
        mltVar.b();
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        mlq mlqVarAE = aE(fhdVar);
        mlt mltVar = mlqVarAE.a;
        mlqVarAE.c.a = fhdVar;
        mltVar.c();
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        mlq mlqVar = (mlq) fkyVar;
        mlq mlqVar2 = (mlq) fkyVar2;
        mlqVar2.a = mlqVar.a;
        mlqVar2.b = mlqVar.b;
        mlqVar2.c = mlqVar.c;
        mlqVar2.d = mlqVar.d;
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
        fhd fhdVar2;
        fgy fgyVarA;
        nay nayVarA;
        mlq mlqVarAE = aE(fhdVar);
        nay nayVar = mlqVarAE.b;
        tld tldVar = mlqVarAE.d;
        nsl nslVar = this.b;
        nso nsoVar = this.c;
        ntr ntrVar = (ntr) fhdVar.k(ntr.class);
        nth nthVar = (nth) fhdVar.k(nth.class);
        avmm avmmVar = (avmm) fhdVar.k(avmm.class);
        if (nayVar == null) {
            return fqp.aE(fhdVar).a;
        }
        if (tldVar != null && tldVar.b == nayVar) {
            return ((fgy) tldVar.a).l();
        }
        String str = nslVar.u;
        if (str == null || nsoVar == null) {
            fhdVar2 = fhdVar;
            fgyVarA = ntrVar.a(fhdVar2, nslVar, nayVar, nthVar, avmmVar);
        } else {
            int i = npi.a;
            ByteBuffer byteBufferB = nsoVar.b(nayVar);
            if (byteBufferB != null) {
                try {
                    asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, byteBufferB, ExtensionRegistryLite.getGeneratedRegistry());
                    aihf aihfVarCreateBuilder = asri.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    asri asriVar = (asri) aihfVarCreateBuilder.instance;
                    asriVar.c |= 2;
                    asriVar.d = str + ":0";
                    asri asriVar2 = (asri) aihfVarCreateBuilder.build();
                    aihh aihhVar = (aihh) asmvVar.toBuilder();
                    npi.k(asriVar2, aihhVar);
                    nayVarA = nsoVar.a(((asmv) aihhVar.build()).toByteArray(), false);
                } catch (IOException unused) {
                    nayVarA = null;
                }
            } else {
                nayVarA = null;
            }
            nay nayVar2 = nayVarA == null ? nayVar : nayVarA;
            fgy fgyVarA2 = ntrVar.a(fhdVar, nslVar, nayVar2, nthVar, avmmVar);
            fhdVar2 = fhdVar;
            npg npgVar = new npg(str, null);
            asrl asrlVarC = npi.c(nayVar2, null, null, str, nsoVar);
            if (asrlVarC != null) {
                npgVar.c(asrlVarC);
            }
            fmc fmcVarAE = fmd.aE(fhdVar2);
            fmcVarAE.c(fgyVarA2);
            fmcVarAE.N(npgVar);
            fgyVarA = fmcVarAE.a();
        }
        tld tldVar2 = new tld(nayVar, fgyVarA, (char[]) null);
        if (fhdVar2.c != null) {
            fhdVar2.y(new aero(Integer.MIN_VALUE, new Object[]{tldVar2}));
        }
        return fgyVarA.l();
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (mlr) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mlq();
    }

    @Override // defpackage.fgy
    public final fly v(fhd fhdVar, fly flyVar) {
        fly flyVarA = fly.a(flyVar);
        mlt mltVar = aE(fhdVar).a;
        final mls mlsVar = (mls) (flyVar == null ? null : flyVar.c(mls.class));
        final String strA = mltVar.a();
        if (strA != null) {
            mlsVar = new mls() { // from class: mlu
                @Override // defpackage.mls
                public final boolean a(String str) {
                    if (strA.equals(str)) {
                        return true;
                    }
                    mls mlsVar2 = mlsVar;
                    return mlsVar2 != null && mlsVar2.a(str);
                }
            };
        }
        flyVarA.d(mls.class, mlsVar);
        return flyVarA;
    }
}
