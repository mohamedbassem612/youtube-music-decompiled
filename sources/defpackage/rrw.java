package defpackage;

import android.content.Context;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rrw implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rrw(aboq aboqVar, abnl abnlVar, abnp abnpVar, String str, int i) {
        this.$cid = i;
        this.c = aboqVar;
        this.a = abnlVar;
        this.b = abnpVar;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r0v21, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        ooy ooyVar;
        int i = this.$cid;
        if (i == 0) {
            int i2 = tqr.a;
            if (this.a.k(1073840072)) {
                return rrx.g(this.c, new qoh(this.b, 8), null, this.d);
            }
            return ahng.n(null);
        }
        if (i == 1) {
            PaintUnitOwner paintUnitOwnerR = this.b.r();
            while (true) {
                if (paintUnitOwnerR != null) {
                    if (paintUnitOwnerR instanceof ooy) {
                        ooyVar = (ooy) paintUnitOwnerR;
                        break;
                    }
                    if (paintUnitOwnerR instanceof PaintUnit) {
                        paintUnitOwnerR = ((PaintUnit) paintUnitOwnerR).r();
                    }
                }
                ooyVar = null;
                break;
            }
            if (ooyVar == null) {
                return null;
            }
            return new ovc(ooyVar, ((ovg) this.d).a((ovd) this.c, (ElementsServices) this.a));
        }
        if (i == 2) {
            ascs ascsVar = (ascs) this.d;
            if ((ascsVar.b & 2) != 0) {
                aijp aijpVar = ascsVar.d;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                return Long.valueOf(aikz.a(aijpVar));
            }
            if (((aqrv) this.c).c) {
                ?? r0 = ((aczl) this.b).g;
                if (((Optional) r0.io()).isPresent() && (((aplf) ((Optional) r0.io()).get()).c & SemanticState.Focused) != 0) {
                    return Long.valueOf(this.a.f().toEpochMilli() + ((long) ((aplf) ((Optional) r0.io()).get()).g));
                }
            }
            return 0L;
        }
        if (i == 3) {
            aboq aboqVar = (aboq) this.c;
            ght ghtVar = ((giq) aboqVar.f.a).a;
            Object obj = this.d;
            Object obj2 = this.b;
            abnl abnlVar = (abnl) this.a;
            abnp abnpVar = (abnp) obj2;
            String str = (String) obj;
            return aboqVar.c.c(agke.r(aboqVar.b.a(abnlVar, abnpVar, str), new abqu((tbt) ghtVar.I.io(), (wup) ghtVar.ls.io(), (wjz) ghtVar.lF.io(), abnlVar, abnpVar)), abnlVar, abnpVar, str, true != aboqVar.d.ci() ? 1 : 3);
        }
        if (i != 4) {
            return abhh.i((String[]) this.d, (Uri) this.a, (String) this.b, (String) this.c);
        }
        abxu abxuVar = (abxu) this.d.io();
        xgn xgnVarA = ((acvx) this.a).a((String) this.c);
        Context context = (Context) abxuVar.c.io();
        context.getClass();
        Optional optional = (Optional) abxuVar.e.io();
        optional.getClass();
        xgnVarA.getClass();
        vxz vxzVar = (vxz) abxuVar.d.io();
        vxzVar.getClass();
        tqj tqjVar = (tqj) abxuVar.b.io();
        tqjVar.getClass();
        vxz vxzVar2 = (vxz) abxuVar.a.io();
        vxzVar2.getClass();
        return new adfs(context, optional, vxzVar, tqjVar, vxzVar2, (vxz) abxuVar.f.io(), xgnVarA, (akrn) this.b);
    }

    public /* synthetic */ rrw(acvx acvxVar, awmd awmdVar, String str, akrn akrnVar, int i) {
        this.$cid = i;
        this.a = acvxVar;
        this.d = awmdVar;
        this.c = str;
        this.b = akrnVar;
    }

    public /* synthetic */ rrw(aczl aczlVar, ascs ascsVar, aqrv aqrvVar, mbc mbcVar, int i) {
        this.$cid = i;
        this.b = aczlVar;
        this.d = ascsVar;
        this.c = aqrvVar;
        this.a = mbcVar;
    }

    public /* synthetic */ rrw(ovg ovgVar, PaintUnit paintUnit, ovd ovdVar, ElementsServices elementsServices, int i) {
        this.$cid = i;
        this.d = ovgVar;
        this.b = paintUnit;
        this.c = ovdVar;
        this.a = elementsServices;
    }

    public /* synthetic */ rrw(tqj tqjVar, agev agevVar, ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, int i) {
        this.$cid = i;
        this.a = tqjVar;
        this.b = agevVar;
        this.c = listenableFuture;
        this.d = scheduledExecutorService;
    }

    public /* synthetic */ rrw(String[] strArr, Uri uri, String str, String str2, int i) {
        this.$cid = i;
        this.d = strArr;
        this.a = uri;
        this.b = str;
        this.c = str2;
    }
}
