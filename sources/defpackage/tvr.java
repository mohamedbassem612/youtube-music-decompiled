package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tvr implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tvr(int i, arkf arkfVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = arkfVar;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((jfk) obj).a(this.a, ((tvt) this.b).b);
            return;
        }
        if (i == 1) {
            ((jfk) obj).a(this.a, ((tvt) this.b).b);
            return;
        }
        xfh xfhVar = new xfh(this.a - 1, 32);
        aihf aihfVarCreateBuilder = akzk.a.createBuilder();
        aihf aihfVarCreateBuilder2 = arjy.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        arjy arjyVar = (arjy) aihfVarCreateBuilder2.instance;
        arjyVar.d = ((arkf) this.b).z;
        arjyVar.b |= 2;
        arjy arjyVar2 = (arjy) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder.instance;
        arjyVar2.getClass();
        akzkVar.k = arjyVar2;
        akzkVar.b |= 2097152;
        xfhVar.a = (akzk) aihfVarCreateBuilder.build();
        ((abte) obj).b(xfhVar, alai.FLOW_TYPE_WEB_VIEW);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ tvr(tvt tvtVar, int i, int i2) {
        this.$cid = i2;
        this.b = tvtVar;
        this.a = i;
    }
}
