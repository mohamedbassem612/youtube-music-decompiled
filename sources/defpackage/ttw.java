package defpackage;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ttw extends LinkedHashMap {
    private final String a;

    public ttw(String str) {
        super(4, 0.75f, true);
        this.a = str;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= 4) {
            return false;
        }
        try {
            ((Allocation) entry.getValue()).destroy();
        } catch (RSRuntimeException e) {
            ((agrc) ((agrc) ((agrc) ttx.a.b()).j(e)).k("com/google/android/libraries/youtube/common/ui/RenderScriptCompat$AllocationCache", "removeEldestEntry", 176, "RenderScriptCompat.java")).w("%s cache eviction failed", this.a);
        }
        return true;
    }
}
