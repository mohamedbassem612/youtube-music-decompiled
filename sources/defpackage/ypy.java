package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ypy implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ ypy(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid == 0) {
            return new ypz(this.a);
        }
        aihf aihfVar = (aihf) obj;
        aihfVar.copyOnWrite();
        ailz ailzVar = (ailz) aihfVar.instance;
        ailz ailzVar2 = ailz.a;
        ailzVar.b |= 2;
        ailzVar.d = this.a;
        return aihfVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
