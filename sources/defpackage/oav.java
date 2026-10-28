package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oav {
    public Context a;
    public String b;
    public Map c;
    public obb d;
    private final oat e;
    private fxg f;
    private final aerj g;

    public oav(oat oatVar, aerj aerjVar) {
        this.e = oatVar;
        this.g = aerjVar;
    }

    public final oaw a() {
        atqq.b(this.a, Context.class);
        atqq.b(this.c, Map.class);
        atqq.b(this.f, fxg.class);
        atqq.b(this.d, obb.class);
        return new oaw(this.e, this.g, this.a, this.b, this.c, this.f, this.d);
    }

    public final /* bridge */ /* synthetic */ void b(fxg fxgVar) {
        fxgVar.getClass();
        this.f = fxgVar;
    }
}
