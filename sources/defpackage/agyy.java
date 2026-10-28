package defpackage;

import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agyy extends agyz {
    public final Stream a;
    public final Stream b;

    public agyy(Stream stream, Stream stream2) {
        stream.getClass();
        this.a = stream;
        stream2.getClass();
        this.b = stream2;
    }

    @Override // defpackage.agyz
    public final Stream a(final BiFunction biFunction) {
        int i = 7;
        return StreamSupport.stream(new Supplier() { // from class: agyv
            @Override // java.util.function.Supplier
            public final Object get() {
                agyx agyxVar = new agyx(this.a);
                return new agyw(agyxVar, Math.min(agyxVar.c.estimateSize(), agyxVar.d.estimateSize()), biFunction);
            }
        }, 16, false).onClose(new afjc(this.a, i)).onClose(new afjc(this.b, i));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Stream stream = this.a;
        try {
            this.b.close();
            stream.close();
        } catch (Throwable th) {
            try {
                stream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
