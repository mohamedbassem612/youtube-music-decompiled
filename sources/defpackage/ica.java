package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ica implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ica(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = this.$cid;
        int i2 = 10;
        int i3 = 9;
        if (i == 0) {
            ajta ajtaVar = (ajta) obj;
            agke agkeVar = (agke) Collection.EL.stream(ajtaVar.c).filter(new hud(i3)).map(new iaa(i2)).collect(aghu.a);
            icj icjVar = (icj) this.b;
            icjVar.z.h(agkeVar);
            ajsx ajsxVarA = ajsx.a(ajtaVar.f);
            if (ajsxVarA == null) {
                ajsxVarA = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
            }
            if (icjVar.F()) {
                if (ajsxVarA == ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN) {
                    ajsxVarA = icjVar.a(this.a);
                }
                icjVar.z.d = ajsxVarA;
                return;
            }
            return;
        }
        if (i != 1) {
            ((uoa) this.b).e(this.a && ((unr) obj).c());
            return;
        }
        ajta ajtaVar2 = (ajta) obj;
        agke agkeVar2 = (agke) Collection.EL.stream(ajtaVar2.c).filter(new hud(i3)).map(new iaa(i2)).collect(aghu.a);
        icj icjVar2 = (icj) this.b;
        icjVar2.v.h(agkeVar2);
        ajsx ajsxVarA2 = ajsx.a(ajtaVar2.f);
        if (ajsxVarA2 == null) {
            ajsxVarA2 = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
        }
        if (icjVar2.F()) {
            if (ajsxVarA2 == ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN) {
                ajsxVarA2 = icjVar2.a(this.a);
            }
            icjVar2.v.d = ajsxVarA2;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
