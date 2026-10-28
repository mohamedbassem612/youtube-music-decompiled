package defpackage;

import android.graphics.Bitmap;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rox implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rox(rpa rpaVar, String str, boolean z, String str2, int i) {
        this.$cid = i;
        this.b = rpaVar;
        this.c = str;
        this.a = z;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int iA;
        int i = this.$cid;
        if (i == 0) {
            Optional optional = (Optional) obj;
            if (!optional.isPresent()) {
                return ahng.n(Optional.empty());
            }
            Object obj2 = this.d;
            boolean z = this.a;
            Object obj3 = this.c;
            Object obj4 = this.b;
            rpa rpaVar = (rpa) obj4;
            rpaVar.f.h("SUCCESS");
            afxd afxdVarF = afxd.f(rpaVar.g.c());
            qmu qmuVar = new qmu(obj4, 14);
            Executor executor = rpaVar.c;
            return afxd.f(afxdVarF.h(qmuVar, executor)).g(new roy(optional, (String) obj3, z, (String) obj2, 0), executor);
        }
        boolean z2 = true;
        if (i != 1) {
            Bitmap bitmap = (Bitmap) obj;
            if (!this.a) {
                return ahng.n(bitmap);
            }
            return ahng.r(afwl.j(new ium(this.c, bitmap, this.b, 19, (byte[]) null)), this.d);
        }
        oip oipVar = (oip) obj;
        if (oipVar == null || !((iA = nsw.a(oipVar.r)) == 0 || iA == 1)) {
            return ahng.n(null);
        }
        oir oirVar = oipVar.m;
        if (oirVar == null) {
            oirVar = oir.a;
        }
        Object obj5 = this.c;
        int iAS = a.aS(oirVar.d);
        if (iAS == 0 || iAS != 2) {
            oir oirVar2 = oipVar.m;
            if (oirVar2 == null) {
                oirVar2 = oir.a;
            }
            int iAS2 = a.aS(oirVar2.d);
            if (iAS2 == 0 || iAS2 != 3) {
                z2 = false;
            } else {
                long jF = ((omj) ((xgg) obj5).i).f();
                oio oioVar = oipVar.c;
                if (oioVar == null) {
                    oioVar = oio.a;
                }
                long j = jF - oioVar.d;
                oir oirVar3 = oipVar.m;
                if (oirVar3 == null) {
                    oirVar3 = oir.a;
                }
                if (j / 1000 > oirVar3.e) {
                    aihf builder = oipVar.toBuilder();
                    oir oirVar4 = oipVar.m;
                    if (oirVar4 == null) {
                        oirVar4 = oir.a;
                    }
                    aihf builder2 = oirVar4.toBuilder();
                    builder2.copyOnWrite();
                    oir oirVar5 = (oir) builder2.instance;
                    oirVar5.d = 1;
                    oirVar5.b |= 2;
                    builder.copyOnWrite();
                    oip oipVar2 = (oip) builder.instance;
                    oir oirVar6 = (oir) builder2.build();
                    oirVar6.getClass();
                    oipVar2.m = oirVar6;
                    oipVar2.b |= SemanticState.Modal;
                    oipVar = (oip) builder.build();
                } else {
                    z2 = false;
                }
            }
        }
        boolean z3 = this.a;
        String str = oipVar.d;
        int i2 = onb.a;
        if (!z3 && !z2) {
            return ahng.n(null);
        }
        oir oirVar7 = oipVar.m;
        if (oirVar7 == null) {
            oirVar7 = oir.a;
        }
        return ((xgg) obj5).g((oiw) this.b, oirVar7, this.d);
    }

    public /* synthetic */ rox(vfb vfbVar, boolean z, ahey aheyVar, ukh ukhVar, int i) {
        this.$cid = i;
        this.c = vfbVar;
        this.a = z;
        this.d = aheyVar;
        this.b = ukhVar;
    }

    public /* synthetic */ rox(xgg xggVar, boolean z, oiw oiwVar, ahcy ahcyVar, int i) {
        this.$cid = i;
        this.c = xggVar;
        this.a = z;
        this.b = oiwVar;
        this.d = ahcyVar;
    }
}
