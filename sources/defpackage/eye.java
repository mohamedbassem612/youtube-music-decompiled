package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eye implements euh {
    private final Resources.Theme a;
    private final Resources b;
    private final eyf c;
    private final int d;
    private Object e;

    public eye(Resources.Theme theme, Resources resources, eyf eyfVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = eyfVar;
        this.d = i;
    }

    @Override // defpackage.euh
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.euh
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.e(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        try {
            Object objD = this.c.d(this.a, this.b, this.d);
            this.e = objD;
            eugVar.b(objD);
        } catch (Resources.NotFoundException e) {
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
