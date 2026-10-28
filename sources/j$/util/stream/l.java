package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class l extends w2 {
    public final /* synthetic */ byte b = 0;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g3 g3Var, Function function) {
        super(g3Var);
        this.d = function;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.b) {
            case 0:
                g3 g3Var = (g3) this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    g3Var.r((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    g3Var.r(obj);
                    return;
                }
                return;
            default:
                g3 g3Var2 = (g3) this.a;
                Stream stream = (Stream) ((Function) this.d).apply(obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            Spliterator<T> spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!g3Var2.s() && spliterator.tryAdvance(g3Var2)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(g3Var2);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
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
                this.c = false;
                this.d = null;
                ((g3) this.a).p(-1L);
                break;
            default:
                ((g3) this.a).p(-1L);
                break;
        }
    }

    @Override // j$.util.stream.w2, j$.util.stream.g3
    public final boolean s() {
        switch (this.b) {
            case 1:
                this.c = true;
                return ((g3) this.a).s();
            default:
                return super.s();
        }
    }

    public /* synthetic */ l(g3 g3Var) {
        super(g3Var);
    }
}
