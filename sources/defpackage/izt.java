package defpackage;

import android.util.LruCache;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izt {
    private final LruCache a = new LruCache(SemanticState.Hidden);

    public final void a(angh anghVar, boolean z) {
        ajwo ajwoVar = anghVar.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.a.put(ajwoVar, Boolean.valueOf(z));
    }

    public final boolean b(angh anghVar) {
        ajwo ajwoVar = anghVar.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        LruCache lruCache = this.a;
        if (lruCache.get(ajwoVar) == null) {
            return anghVar.m;
        }
        ajwo ajwoVar2 = anghVar.g;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        return ((Boolean) lruCache.get(ajwoVar2)).booleanValue();
    }
}
