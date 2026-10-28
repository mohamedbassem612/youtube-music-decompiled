package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ejp {
    public final AssetManager d;
    public eol f;
    public final ejy a = new ejy();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public String e = ".ttf";

    public ejp(Drawable.Callback callback, eol eolVar) {
        this.f = eolVar;
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            ene.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
