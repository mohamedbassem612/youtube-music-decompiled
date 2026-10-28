package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mea {
    public final mdr a;
    private final mdv b;

    public mea(Context context, mdv mdvVar) {
        Context context2;
        Context applicationContext = context.getApplicationContext();
        meb mebVar = new meb();
        mdq mdqVar = new mdq();
        mdqVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        mdqVar.a = applicationContext;
        mdqVar.c = new agfa(mebVar);
        mdqVar.a();
        if (mdqVar.e == 1 && (context2 = mdqVar.a) != null) {
            this.a = new mdr(context2, mdqVar.b, mdqVar.c, mdqVar.d);
            this.b = mdvVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (mdqVar.a == null) {
            sb.append(" context");
        }
        if (mdqVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static mea a(Context context, mdp mdpVar) {
        return new mea(context, new mdv(mdpVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + '}';
    }
}
