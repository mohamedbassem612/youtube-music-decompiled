package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yns implements Consumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yns(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aihf aihfVar = (aihf) obj;
            aihfVar.copyOnWrite();
            atpl atplVar = (atpl) aihfVar.instance;
            atpl atplVar2 = atpl.a;
            atplVar.b |= 4;
            atplVar.f = 3;
            return;
        }
        if (i == 1) {
            aihf aihfVar2 = (aihf) obj;
            aihfVar2.copyOnWrite();
            aimg aimgVar = (aimg) aihfVar2.instance;
            aimg aimgVar2 = aimg.a;
            aimgVar.b |= 1;
            aimgVar.d = 1;
            return;
        }
        if (i == 2) {
            jrq jrqVar = (jrq) obj;
            jrqVar.copyOnWrite();
            atpn atpnVar = (atpn) jrqVar.instance;
            atpn atpnVar2 = atpn.a;
            atpnVar.b |= 1;
            atpnVar.j = 1;
            return;
        }
        if (i != 3) {
            aihf aihfVar3 = (aihf) obj;
            aihfVar3.copyOnWrite();
            atpv atpvVar = (atpv) aihfVar3.instance;
            atpv atpvVar2 = atpv.a;
            atpvVar.b |= 1;
            atpvVar.c = 1;
            return;
        }
        aihf aihfVar4 = (aihf) obj;
        aihfVar4.copyOnWrite();
        atpq atpqVar = (atpq) aihfVar4.instance;
        atpq atpqVar2 = atpq.a;
        atpqVar.b |= SemanticState.LiveRegion;
        atpqVar.o = 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i != 2) {
            return i != 3 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
