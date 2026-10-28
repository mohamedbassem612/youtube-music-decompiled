package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oev implements oel {
    private final List a = new ArrayList();

    @Override // defpackage.oel
    public final synchronized void d(Map map, Context context) {
        List list = this.a;
        map.put("vst", new ArrayList(list));
        list.clear();
    }

    @Override // defpackage.oel
    public final void b(Map map) {
    }

    @Override // defpackage.oel
    public final void c(Map map) {
    }
}
