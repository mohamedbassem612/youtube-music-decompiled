package j$.util.stream;

import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class m extends w2 {
    public final /* synthetic */ byte b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g3 g3Var, Object obj, byte b) {
        super(g3Var);
        this.b = b;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    ((g3) this.a).accept(obj);
                }
                break;
            case 1:
                if (((Predicate) this.c).test(obj)) {
                    ((g3) this.a).accept(obj);
                }
                break;
            case 2:
                ((g3) this.a).accept(((Function) this.c).apply(obj));
                break;
            case 3:
                ((g3) this.a).accept(((ToIntFunction) this.c).applyAsInt(obj));
                break;
            default:
                ((g3) this.a).accept(((ToLongFunction) this.c).applyAsLong(obj));
                break;
        }
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                ((g3) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void p(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                ((g3) this.a).p(-1L);
                break;
            case 1:
                ((g3) this.a).p(-1L);
                break;
            default:
                super.p(j);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g3 g3Var) {
        super(g3Var);
        this.b = (byte) 0;
    }
}
