package defpackage;

import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.RemoteAssetManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class attd {
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final aglz f = new aghn(null);
    public final RemoteAssetManager g;

    public attd(RemoteAssetManager remoteAssetManager) {
        this.g = remoteAssetManager;
    }

    public final void b(String str, Effect effect, String str2) {
        ArrayList arrayList;
        synchronized (this) {
            if (effect != null) {
                effect.nativeSetName(effect.a, (String) ((agfa) agev.i(str)).a);
                this.e.put(str, effect);
                arrayList = new ArrayList(this.f.g(str));
            } else {
                arrayList = new ArrayList(this.f.g(str));
            }
            throw th;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((attc) arrayList.get(i)).a(effect, str2);
        }
    }
}
