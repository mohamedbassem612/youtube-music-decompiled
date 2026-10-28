package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rsb implements aupn {
    public static agke b(Set set, Set set2) {
        agjz agjzVar = new agjz(4);
        agjzVar.j(set);
        agjzVar.j(set2);
        agke agkeVarG = agjzVar.g();
        agkeVarG.getClass();
        return agkeVarG;
    }

    public static agke c(Set set, Set set2) {
        agjz agjzVar = new agjz(4);
        agjzVar.j(set);
        agjzVar.j(set2);
        agke agkeVarG = agjzVar.g();
        agkeVarG.getClass();
        return agkeVarG;
    }

    public static acdq d(acdq acdqVar, abmt abmtVar) {
        if (!abmtVar.K()) {
            acdqVar = new acdq(abmtVar);
        }
        acdqVar.getClass();
        return acdqVar;
    }

    public static acdw e(Context context, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, abmt abmtVar, Executor executor, Executor executor2, acdw acdwVar) {
        if (!abmtVar.K()) {
            acdwVar = new acdw(context, awmdVar, awmdVar2, awmdVar3, abmtVar, executor, executor2);
        }
        acdwVar.getClass();
        return acdwVar;
    }

    public static boc f(bog bogVar) {
        boc lifecycle = bogVar.getLifecycle();
        lifecycle.getClass();
        return lifecycle;
    }

    public static ExperimentalCronetEngine g(CronetEngine cronetEngine) {
        if (!(cronetEngine instanceof ExperimentalCronetEngine)) {
            throw new IllegalStateException("Could not create ExperimentalCronetEngine");
        }
        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) cronetEngine;
        experimentalCronetEngine.getClass();
        return experimentalCronetEngine;
    }

    public static syx h() {
        syx syxVar = upj.a;
        syxVar.getClass();
        return syxVar;
    }

    public static uvz i(awmd awmdVar, cc ccVar, Map map) {
        uvz uvzVar = (uvz) ((awmd) j$.util.Map.EL.getOrDefault(map, ccVar.getClass(), new oqe(awmdVar, 6))).io();
        uvzVar.getClass();
        return uvzVar;
    }

    public static uxm j(Map map, cc ccVar) {
        uxm uxmVar;
        cc parentFragment = ccVar.getParentFragment();
        awmd awmdVar = (awmd) map.get(ccVar.getClass());
        while (awmdVar == null) {
            if (parentFragment == null) {
                uxmVar = uxm.yU;
                uxmVar.getClass();
                return uxmVar;
            }
            awmdVar = (awmd) map.get(parentFragment.getClass());
            parentFragment = parentFragment.getParentFragment();
        }
        uxmVar = (uxm) awmdVar.io();
        uxmVar.getClass();
        return uxmVar;
    }

    public static val k(vbf vbfVar, awmd awmdVar, awmd awmdVar2) {
        int iOrdinal = vbfVar.a().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Object objIo = awmdVar2.io();
                objIo.getClass();
                return (val) objIo;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return new vap();
                }
                throw new awmj();
            }
        }
        Object objIo2 = awmdVar.io();
        objIo2.getClass();
        return (val) objIo2;
    }

    public static vbf l(cc ccVar, Map map) {
        vbf vbfVar;
        ccVar.getClass();
        awmd awmdVar = (awmd) map.get(ccVar.getClass());
        return (awmdVar == null || (vbfVar = (vbf) awmdVar.io()) == null) ? new vbe() : vbfVar;
    }

    public static via m(gja gjaVar) {
        via viaVar = (via) gjaVar.o.io();
        viaVar.getClass();
        return viaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gja n(cc ccVar) {
        Object obj;
        ccVar.getClass();
        for (cc parentFragment = ccVar; parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof vga) {
                obj = ((vga) parentFragment).get();
                obj.getClass();
            } else {
                afnb afnbVar = parentFragment instanceof afnb ? (afnb) parentFragment : null;
                Object objPeer = afnbVar != null ? afnbVar.peer() : null;
                if (objPeer instanceof vga) {
                    obj = ((vga) objPeer).get();
                    obj.getClass();
                }
            }
            return (gja) obj;
        }
        throw new IllegalStateException("Could not find VideoEffectsComponent from a parent fragment. Make sure the current fragment is a child of VideoEffectsComponentSupplier.");
    }

    public static vge o(gja gjaVar) {
        vge vgeVar = (vge) gjaVar.c.io();
        vgeVar.getClass();
        return vgeVar;
    }

    public static via p(gja gjaVar) {
        via viaVar = (via) gjaVar.f.io();
        viaVar.getClass();
        return viaVar;
    }

    public static qrx q(Context context, awmd awmdVar, rrq rrqVar, ahex ahexVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("effectvisit");
        qpqVar.d("effectvisit.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(atos.a);
        int i = 7;
        qrlVarA.b(new tpr(awmdVar, new bym(16), new sdp(6), new ulo(i), new heo(i), ahexVar));
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static uzv r(aunn aunnVar, uys uysVar, aunn aunnVar2, aaok aaokVar, aunn aunnVar3, aunn aunnVar4) {
        aunnVar.getClass();
        aunnVar2.getClass();
        aaokVar.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        return new uzv(aunnVar, uysVar, aunnVar2, aaokVar, aunnVar3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public static vfq s(aczl aczlVar) {
        ((abte) aczlVar.b.io()).getClass();
        vfp vfpVar = (vfp) aczlVar.e.io();
        vfpVar.getClass();
        ((ahbw) aczlVar.c.io()).getClass();
        ((aaok) aczlVar.a.io()).getClass();
        ((zvl) aczlVar.d.io()).getClass();
        ((aehn) aczlVar.g.io()).getClass();
        ((Executor) aczlVar.f.io()).getClass();
        return new vfq(vfpVar);
    }

    public static aczl t(cc ccVar, Map map, awmd awmdVar) {
        aczl aczlVar = (aczl) ((awmd) j$.util.Map.EL.getOrDefault(map, ccVar.getClass(), new oqe(awmdVar, 5))).io();
        aczlVar.getClass();
        return aczlVar;
    }

    public static xpl u(gja gjaVar) {
        xpl xplVar = (xpl) gjaVar.l.io();
        xplVar.getClass();
        return xplVar;
    }

    public static uzm v(zvl zvlVar, bog bogVar, uys uysVar, xpl xplVar, vbk vbkVar) {
        zvlVar.getClass();
        bogVar.getClass();
        return new uzm(zvlVar, bogVar, uysVar, xplVar, vbkVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
