package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kec {
    public static final /* synthetic */ int a = 0;
    private final long b;
    private final Handler c = new afkg(Looper.getMainLooper(), (byte[]) null);
    private final lpo d;

    static {
        new khn("AnalyticsConsent", (String) null);
    }

    public kec(Context context, long j) {
        this.d = lps.a(context);
        this.b = j;
    }

    public final synchronized lpa a() {
        kjc kjcVar;
        kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        lpa lpaVarA = this.d.a();
        lpaVarA.q(new kbf(kjcVar, 3));
        lpaVarA.p(new kea(kjcVar, 2));
        this.c.postDelayed(new kcx(kjcVar, 7), this.b * 1000);
        return (lpa) kjcVar.a;
    }
}
