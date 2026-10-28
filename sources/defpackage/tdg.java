package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tdg implements tdh {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/lifecycle/initializable/CompositeInitializable");
    private final Map b;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    public tdg(Map map) {
        this.b = map;
    }

    @Override // defpackage.tdh
    public final void a() {
        agqr it = ((agpk) ((agpn) this.b).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            awmd awmdVar = (awmd) entry.getValue();
            if (!this.d.containsKey(str)) {
                HashMap map = this.c;
                Object obj = map.get(str);
                if (obj == null) {
                    Object objIo = awmdVar.io();
                    objIo.getClass();
                    obj = (tdh) objIo;
                    map.put(str, obj);
                }
                tdh tdhVar = (tdh) obj;
                try {
                    tdhVar.a();
                } catch (Throwable th) {
                    ((agrc) ((agrc) a.b()).j(th).k("com/google/android/libraries/youtube/common/lifecycle/initializable/CompositeInitializable", "initialize", 30, "CompositeInitializable.kt")).w("Failed to initialize: %s", str);
                }
                this.d.put(str, tdhVar);
            }
        }
    }

    @Override // defpackage.tdh
    public final void gY() {
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            try {
                ((tdh) entry.getValue()).gY();
            } catch (Throwable th) {
                ((agrc) ((agrc) a.b()).j(th).k("com/google/android/libraries/youtube/common/lifecycle/initializable/CompositeInitializable", "teardown", 46, "CompositeInitializable.kt")).w("Failed to teardown: %s", str);
            }
        }
        this.d.clear();
    }
}
