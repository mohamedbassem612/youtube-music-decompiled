package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vyi {
    static final /* synthetic */ vyi a = new vyi();
    private static final vyh b = new vyh();

    private final synchronized void b() {
        vyh vyhVar = b;
        if (vyhVar.a != null) {
            return;
        }
        Function0 function0 = vyhVar.b;
        try {
            Class.forName("com.google.android.libraries.youtube.innertube.config.DefaultFlagRegistry").getClass();
        } catch (Throwable unused) {
        }
        vyh vyhVar2 = b;
        vyj vyjVar = vyhVar2.a;
        if (vyjVar == null) {
            vyj vyjVar2 = vyhVar2.c;
            vyjVar = vxx.a;
        }
        vyhVar2.a = vyjVar;
    }

    public final void a() {
        if (b.a == null) {
            b();
        }
    }
}
