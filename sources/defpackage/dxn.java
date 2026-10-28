package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dxn extends dxm {
    private final ReentrantLock b;
    private final Map c;
    private final Map d;

    public dxn(WindowLayoutComponent windowLayoutComponent, dwg dwgVar) {
        super(windowLayoutComponent, dwgVar);
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.dxm, defpackage.dxl, defpackage.dxj
    public final void a(axo axoVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.d;
            Context context = (Context) map.get(axoVar);
            if (context != null) {
                Map map2 = this.c;
                dxo dxoVar = (dxo) map2.get(context);
                if (dxoVar != null) {
                    dxoVar.removeListener(axoVar);
                    map.remove(axoVar);
                    if (dxoVar.isEmpty()) {
                        map2.remove(context);
                        this.a.removeWindowLayoutInfoListener(dxoVar);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.dxm, defpackage.dxl, defpackage.dxj
    public final void b(Context context, axo axoVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.c;
            dxo dxoVar = (dxo) map.get(context);
            if (dxoVar != null) {
                dxoVar.addListener(axoVar);
                this.d.put(axoVar, context);
            } else {
                dxo dxoVar2 = new dxo(context);
                map.put(context, dxoVar2);
                this.d.put(axoVar, context);
                dxoVar2.addListener(axoVar);
                this.a.addWindowLayoutInfoListener(context, dxoVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
