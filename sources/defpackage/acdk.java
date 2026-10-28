package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acdk extends acdi {
    public zki f;
    public isi g;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public acdk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((acdj) acdj.class.cast(tym.N(tym.L(context.getApplicationContext())))).dQ(this);
        isi isiVar = this.g;
        zkt zktVar = new zkt(context, (ci) isiVar.b, (zjr) isiVar.a, isiVar.c);
        this.f = zktVar;
        ahno.P(this.ac == null, "videoView has already been set");
        zkt zktVar2 = zktVar;
        this.ac = zktVar2;
        addView(zktVar2, 0, new acdh(-2, -2, false));
    }

    public acdk(Context context) {
        this(context, null);
    }
}
