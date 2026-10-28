package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vlv extends awrb implements awqk {
    public static final vlv a = new vlv();

    public vlv() {
        super(2, npy.class, "resolveRawResource", "resolveRawResource(Landroid/content/Context;Ljava/lang/String;)I", 0);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(npy.a((Context) obj, "raw", (String) obj2));
    }
}
