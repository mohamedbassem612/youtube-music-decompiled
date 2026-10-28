package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import com.google.android.libraries.blocks.runtime.RuntimeKeyedSignal;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acoo implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acoo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [axso, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v62, types: [awmd, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0;
        int i = 3;
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                acoq acoqVar = (acoq) obj;
                return acoqVar.h.b(acoqVar.a) ? avlh.f(((vor) acoqVar.b.io()).w.c, nsj.f(), new vnc(new acfc(obj, i), 8)).p() : ((avlh) ((vor) acoqVar.b.io()).w.c).H(new abqe(new acjn(obj, 16), 20)).p();
            case 1:
                return ((aclf) this.a).d(900);
            case 2:
                acpv acpvVar = (acpv) this.a;
                acpu acpuVar = acpvVar.g;
                if (acpuVar.a && acpuVar.b) {
                    twu.d("ReelAutoAdvanceController", 4, "Auto advancing to next reel from a timer", null);
                    acpvVar.h.c(false);
                }
                return awmy.a;
            case 3:
                Context baseContext = ((actj) this.a).b;
                while (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        return (Activity) baseContext;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    baseContext.getClass();
                }
                return null;
            case 4:
                return Integer.valueOf(((actj) this.a).j.getStreamMaxVolume(3));
            case 5:
                adpa adpaVar = (adpa) this.a;
                adpaVar.unscheduleSelf(adpaVar.e);
                return awmy.a;
            case 6:
                return adpa.a((adpa) this.a);
            case 7:
                adpa adpaVar2 = (adpa) this.a;
                adpaVar2.unscheduleSelf(adpaVar2.e);
                return awmy.a;
            case 8:
                adrf adrfVar = (adrf) this.a;
                if (adrfVar.b() != null && (function0 = adrfVar.m) != null) {
                    function0.invoke();
                }
                return awmy.a;
            case 9:
                ((adrf) this.a).h.f();
                return awmy.a;
            case 10:
                return Boolean.valueOf(((vxz) ((aciz) this.a).b).l(146, 45764598L, false));
            case 11:
                aehr aehrVar = (aehr) this.a;
                return (aehd) awrc.f(((lqa) aehrVar.b.io()).J(aehrVar.f.h));
            case 12:
                aiie aiieVar = ((aehr) this.a).f.y;
                aiieVar.getClass();
                return aguu.V(aiieVar);
            case 13:
                arkm arkmVar = ((aehr) this.a).f;
                int i2 = arkmVar.d;
                if (i2 == 1) {
                    return agvp.f((agya) arkmVar.e).a;
                }
                return i2 == 14 ? (String) arkmVar.e : "";
            case 14:
                String strW = ((aehr) this.a).w();
                strW.getClass();
                Uri uri = Uri.parse(strW);
                uri.getClass();
                return uri;
            case 15:
                return (xih) ((aenr) this.a).b.io();
            case 16:
                return (xfq) this.a.io();
            case 17:
                return (xih) ((aenr) this.a).b.io();
            case 18:
                aqps aqpsVar = aqps.a;
                aihn.getParserForClass(aqps.class);
                return new RuntimeKeyedSignal(((may) ((agcl) this.a).b).a);
            case 19:
                return ((afpa) this.a).getViewModelStore();
            default:
                return ((afpa) this.a).getDefaultViewModelProviderFactory();
        }
    }
}
