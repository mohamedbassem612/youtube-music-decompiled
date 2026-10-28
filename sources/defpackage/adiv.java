package defpackage;

import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adiv extends LinkedHashMap {
    final /* synthetic */ GlideImageLoggerImpl a;

    public adiv(GlideImageLoggerImpl glideImageLoggerImpl) {
        this.a = glideImageLoggerImpl;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > ((Integer) this.a.b.io()).intValue();
    }
}
