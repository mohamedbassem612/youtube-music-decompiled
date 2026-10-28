package app.rive.runtime.kotlin.core;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ContextAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;
    private final Context context;

    public ContextAssetLoader(Context context) {
        context.getClass();
        this.context = context;
    }

    protected final Context getContext() {
        return this.context;
    }
}
