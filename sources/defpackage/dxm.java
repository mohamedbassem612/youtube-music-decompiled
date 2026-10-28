package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class dxm extends dxl {
    public final WindowLayoutComponent a;
    private final dwg b;
    private final ReentrantLock c = new ReentrantLock();
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private final Map f = new LinkedHashMap();

    public dxm(WindowLayoutComponent windowLayoutComponent, dwg dwgVar) {
        this.a = windowLayoutComponent;
        this.b = dwgVar;
    }

    @Override // defpackage.dxl, defpackage.dxj
    public void a(axo axoVar) {
        MulticastConsumer multicastConsumerM;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(axoVar);
            if (context != null && (multicastConsumerM = qf$$ExternalSyntheticApiModelOutline0.m(this.d.get(context))) != null) {
                ReentrantLock reentrantLock2 = multicastConsumerM.a;
                reentrantLock2.lock();
                try {
                    multicastConsumerM.b.remove(axoVar);
                    reentrantLock2.unlock();
                    this.e.remove(axoVar);
                    if (multicastConsumerM.b.isEmpty()) {
                        this.d.remove(context);
                        dwf dwfVar = (dwf) this.f.remove(multicastConsumerM);
                        if (dwfVar != null) {
                            dwfVar.a.invoke(dwfVar.b, dwfVar.c);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // defpackage.dxl, defpackage.dxj
    public void b(Context context, axo axoVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Map map = this.d;
            MulticastConsumer multicastConsumerM = qf$$ExternalSyntheticApiModelOutline0.m(map.get(context));
            if (multicastConsumerM != null) {
                multicastConsumerM.a(axoVar);
                this.e.put(axoVar, context);
            } else {
                MulticastConsumer multicastConsumer = new MulticastConsumer(context);
                map.put(context, multicastConsumer);
                this.e.put(axoVar, context);
                multicastConsumer.a(axoVar);
                dwg dwgVar = this.b;
                WindowLayoutComponent windowLayoutComponent = this.a;
                int i = awrn.a;
                Object objNewProxyInstance = Proxy.newProxyInstance(dwgVar.a, new Class[]{dwgVar.a()}, new dwe(new awqv(WindowLayoutInfo.class), new hho((Object) multicastConsumer, 1, (byte[]) null)));
                objNewProxyInstance.getClass();
                windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, dwgVar.a()).invoke(windowLayoutComponent, context, objNewProxyInstance);
                this.f.put(multicastConsumer, new dwf(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", dwgVar.a()), windowLayoutComponent, objNewProxyInstance));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
