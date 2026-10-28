package j$.sun.security.action;

import j$.time.zone.f;
import java.io.Serializable;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements PrivilegedAction {
    public final /* synthetic */ byte a = 0;
    public Serializable b;

    public a(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                String property = System.getProperty((String) this.b);
                if (property != null) {
                    return property;
                }
                return null;
            default:
                String property2 = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
                if (property2 == null) {
                    f.b(new f());
                    return null;
                }
                try {
                    f fVar = (f) f.class.cast(Class.forName(property2, true, f.class.getClassLoader()).newInstance());
                    f.b(fVar);
                    ((ArrayList) this.b).add(fVar);
                    return null;
                } catch (Exception e) {
                    throw new Error(e);
                }
        }
    }

    public /* synthetic */ a() {
    }
}
