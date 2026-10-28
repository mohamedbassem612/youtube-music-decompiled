package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jiq implements aeem {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public jiq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    @Override // defpackage.aeem
    public final /* synthetic */ void a(Object obj, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
        } else if (i2 != 1) {
        } else if (((aefl) obj) == this.a) {
            taf.g(((aczl) this.b).F(), new gpq(0));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, vxe] */
    @Override // defpackage.aeem
    public final /* synthetic */ void b(Object obj) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                return;
            }
            ((abmc) this.b).d((arnj) this.a);
            return;
        }
        ajan ajanVar = (ajan) this.a;
        xgj xgjVar = new xgj(ajanVar.g, (amud) null);
        kyr kyrVar = (kyr) this.b;
        kyrVar.b.l(xgjVar);
        kyrVar.a.b(ajanVar.f);
    }
}
