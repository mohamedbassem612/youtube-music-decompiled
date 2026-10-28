package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eue implements euh {
    private final String a;
    private final AssetManager b;
    private Object c;

    public eue(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // defpackage.euh
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                e(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void e(Object obj);

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        try {
            Object objB = b(this.b, this.a);
            this.c = objB;
            eugVar.b(objB);
        } catch (IOException e) {
            eugVar.e(e);
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 1;
    }

    @Override // defpackage.euh
    public final void gI() {
    }
}
