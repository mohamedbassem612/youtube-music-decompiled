package j$.util.function;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ c(Function function, Function function2, byte b) {
        this.a = b;
        this.b = function;
        this.c = function2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        Function function = this.c;
        Function function2 = this.b;
        switch (b) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
