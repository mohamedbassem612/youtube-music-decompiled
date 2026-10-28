package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ajc extends awng implements Map, j$.util.Map, awrp {
    public final ajg a;

    public ajc(ajg ajgVar) {
        this.a = ajgVar;
    }

    @Override // defpackage.awng
    public final /* synthetic */ Collection a() {
        return new ajf(this);
    }

    @Override // defpackage.awng
    public final Set b() {
        return new aje(this, 1);
    }

    @Override // defpackage.awng
    public final /* synthetic */ Set c() {
        return new aje(this, 0);
    }

    @Override // defpackage.awng, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        obj.hashCode();
        return false;
    }

    @Override // defpackage.awng, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        obj.hashCode();
        return null;
    }
}
