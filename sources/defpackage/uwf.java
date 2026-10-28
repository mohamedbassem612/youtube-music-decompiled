package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwf {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/tooltip/DefaultShortsTooltipController");
    public final Context b;
    public final SortedMap c;
    public final awlo d;
    public aefs e;
    public Long f = null;
    public uwd g = null;
    public final uko h;
    public final vxz i;

    public uwf(cc ccVar, Map map, vxz vxzVar, uko ukoVar) {
        this.b = ccVar.requireContext();
        TreeMap treeMap = new TreeMap();
        this.c = treeMap;
        treeMap.putAll(map);
        this.d = new awlo();
        this.i = vxzVar;
        this.h = ukoVar;
    }

    public final void a() {
        aefs aefsVar = this.e;
        if (aefsVar == null || !aefsVar.h()) {
            return;
        }
        this.e.b(3);
        uwd uwdVar = this.g;
        if (uwdVar != null) {
            uwdVar.c();
        }
    }
}
