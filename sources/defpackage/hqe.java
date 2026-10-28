package defpackage;

import android.widget.FrameLayout;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hqe implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hqe(amlg amlgVar, Object obj, ajwo ajwoVar, Map map, int i) {
        this.$cid = i;
        this.c = amlgVar;
        this.d = obj;
        this.a = ajwoVar;
        this.b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, xir] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Object obj2 = this.d;
            ?? r1 = this.c;
            Object obj3 = this.b;
            ((hqf) this.a).c((Optional) obj3, r1, (aahb) obj2, (wer) obj);
            return;
        }
        if (i == 1) {
            ahgb ahgbVar = (ahgb) obj;
            int iOrdinal = ((amlg) this.c).ordinal();
            ?? r3 = this.b;
            Object obj4 = this.a;
            Object obj5 = this.d;
            if (iOrdinal == 0) {
                ahgbVar.aj((alrk) obj5, (ajwo) obj4, r3);
                return;
            } else if (iOrdinal == 1) {
                ahgbVar.ah((alri) obj5, (ajwo) obj4, r3);
                return;
            } else {
                if (iOrdinal == 2) {
                    ahgbVar.ak((alrm) obj5, (ajwo) obj4, r3);
                    return;
                }
                return;
            }
        }
        if (i == 2) {
            aehd aehdVar = (aehd) obj;
            vrm vrmVar = (vrm) this.a;
            FrameLayout frameLayout = vrmVar.i;
            frameLayout.getClass();
            Object obj6 = ((agfa) this.d).a;
            zwa zwaVarE = vrmVar.e.e();
            aehe aeheVar = new aehe((aehi) obj6, vrmVar.g, vrmVar.h, this.c);
            aehdVar.d(vrmVar.d, (arkm) this.b, frameLayout, zwaVarE, vrmVar.f, aeheVar);
            return;
        }
        aehd aehdVar2 = (aehd) obj;
        vsc vscVar = (vsc) this.a;
        FrameLayout frameLayout2 = vscVar.i;
        frameLayout2.getClass();
        zwb zwbVar = vscVar.e;
        Object obj7 = this.d;
        zwa zwaVarE2 = zwbVar.e();
        aehe aeheVar2 = new aehe((aehi) ((agev) obj7).f(), vscVar.g, vscVar.h, this.c);
        aehdVar2.d(vscVar.d, (arkm) this.b, frameLayout2, zwaVarE2, vscVar.f, aeheVar2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i != 1) {
            return i != 2 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hqe(hqf hqfVar, Optional optional, zwa zwaVar, aahb aahbVar, int i) {
        this.$cid = i;
        this.a = hqfVar;
        this.b = optional;
        this.c = zwaVar;
        this.d = aahbVar;
    }

    public /* synthetic */ hqe(vrk vrkVar, arkm arkmVar, agev agevVar, xir xirVar, int i) {
        this.$cid = i;
        this.a = vrkVar;
        this.b = arkmVar;
        this.d = agevVar;
        this.c = xirVar;
    }
}
