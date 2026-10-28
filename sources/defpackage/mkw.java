package defpackage;

import android.util.Pair;
import com.google.android.libraries.elements.interfaces.MaterializationResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mkw implements avnf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ mkw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, xhz] */
    @Override // defpackage.avnf
    public final Object a(Object obj, Object obj2) {
        avmm avmmVar;
        fgy fgyVarA;
        int i = this.$cid;
        boolean z = false;
        if (i == 0) {
            mma mmaVar = (mma) obj;
            fhd fhdVar = (fhd) obj2;
            mkx mkxVar = (mkx) this.a;
            nsl nslVarA = mkxVar.h;
            if (nslVarA == null) {
                fgyVarA = fqp.aE(fhdVar).a;
            } else if (mmaVar == null) {
                mkxVar.a.c(aslh.LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR, nslVarA, "Template produced null Element", new Object[0]);
                fgyVarA = fqp.aE(fhdVar).a;
            } else {
                MaterializationResult materializationResult = mmaVar.b;
                if (materializationResult == null || materializationResult.getNativeUpb() == 0) {
                    nsk nskVar = new nsk(nslVarA);
                    nskVar.o = materializationResult;
                    nslVarA = nskVar.a();
                }
                nsl nslVar = nslVarA;
                ntr ntrVar = mkxVar.b;
                nay nayVar = mmaVar.a;
                nth nthVar = mkxVar.c;
                if (!mkxVar.d || (avmmVar = mkxVar.e) == null) {
                    avmmVar = mkxVar.f;
                }
                fgyVarA = ntrVar.a(fhdVar, nslVar, nayVar, nthVar, avmmVar);
                npg npgVar = mmaVar.c;
                if (npgVar != null) {
                    int i2 = fmd.b;
                    fmc fmcVar = new fmc(fhdVar, new fmd());
                    fmcVar.c(fgyVarA);
                    fmcVar.N(npgVar);
                    fgyVarA = fmcVar.a();
                }
            }
            return Pair.create(fgyVarA, fhdVar);
        }
        if (i == 1) {
            obj.getClass();
            obj2.getClass();
            return this.a.invoke(obj, obj2);
        }
        if (i == 2) {
            vob vobVar = (vob) obj;
            double dM = (((Boolean) obj2).booleanValue() && ((vxz) this.a).l(2, 45764143L, false)) ? vobVar.m() : vobVar.l();
            if (dM < 0.0d || dM > 1.0d) {
                dM = 0.34d;
            }
            return Double.valueOf(dM);
        }
        if (i != 3) {
            if (i != 4) {
                ?? r8 = this.a;
                return new ablc(new ablb((wgi) obj, r8), new abkz((wjf) obj2, r8));
            }
            Boolean bool = (Boolean) obj2;
            if ((((Boolean) obj).booleanValue() || bool.booleanValue()) && ((xkw) this.a).b.aA()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        xkv xkvVar = (xkv) obj;
        Boolean bool2 = (Boolean) obj2;
        agrx agrxVar = agso.a;
        boolean z2 = xkvVar.a;
        boolean z3 = ((xkw) this.a).c.k;
        boolean z4 = xkvVar.b;
        if (!z2 && (!z4 || !bool2.booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
