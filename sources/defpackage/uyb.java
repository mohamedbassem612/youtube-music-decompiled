package defpackage;

import android.view.View;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyb {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/deprecated/picker/StaticThumbnailProvider");
    public uzl b;
    public final uyq d;
    private final HashSet f = new HashSet();
    final HashMap c = new HashMap();
    public volatile boolean e = false;

    public uyb(uyq uyqVar) {
        this.d = uyqVar;
    }

    public final synchronized void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final synchronized void b(String str) {
        File file = new File(str);
        HashMap map = this.c;
        if (map.containsKey(file)) {
            for (View view : (List) map.get(file)) {
                if (view != null) {
                    view.post(new uqd(file, view, 3, null));
                }
            }
            map.remove(file);
        }
        this.f.add(file);
    }

    public final synchronized void c() {
        this.e = true;
        uzl uzlVar = this.b;
        if (uzlVar != null) {
            uzlVar.a();
        }
    }
}
