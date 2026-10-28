package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odi extends odl {
    private final Context a;
    private final Map b;

    public odi(fxg fxgVar, ocu ocuVar, Map map, Context context, omj omjVar) {
        super("3WwgEdMWvzrZ7qPBXm9NxnubUCO3yZKs5JZZfvbAA+VggTZJBX/oghrFHavf4t+E", "oHIN/Y4zAL1wY+vdgCDL9l3iq4VgmlsNbHbRiCW0UZU=", fxgVar, ocuVar, omjVar.h(120));
        this.a = context;
        this.b = map;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        fxl fxlVar;
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l = (Long) method.invoke("", this.a);
                l.getClass();
                lValueOf = l;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.b.get("gs");
                if (listenableFuture != null && listenableFuture.isDone() && (fxlVar = (fxl) listenableFuture.get()) != null) {
                    lValueOf = Long.valueOf(fxlVar.X);
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException unused2) {
        }
        synchronized (fxgVar) {
            long jLongValue = lValueOf.longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar2 = (fxl) fxgVar.instance;
            fxl fxlVar3 = fxl.a;
            fxlVar2.c |= 16777216;
            fxlVar2.X = jLongValue;
        }
    }
}
