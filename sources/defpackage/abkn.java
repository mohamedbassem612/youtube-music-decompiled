package defpackage;

import android.view.View;
import android.widget.TextView;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abkn {
    public static final /* synthetic */ int h = 0;
    private static final Duration i = Duration.ofMillis(200);
    private static final Duration j = Duration.ofMillis(200);
    private static final Duration k = Duration.ofMillis(200);
    public abkx a;
    public abkx b;
    public final View c;
    public final abkq d;
    public TextView e;
    public boolean f;
    public tss g;

    static {
        Duration.ofSeconds(1L);
    }

    public abkn(View view, abkq abkqVar) {
        this.c = view;
        this.d = abkqVar;
    }

    public final abkx a(int i2, int i3, int i4) {
        abkw abkwVar = new abkw();
        abkwVar.c(Duration.ofMillis(200L));
        abkwVar.c(i);
        Duration duration = k;
        abkwVar.b(agke.s(abkv.a(0.0f, 1.0f, duration), abkv.a(1.0f, 1.0f, j), abkv.a(1.0f, 0.0f, duration)));
        View view = this.c;
        abkwVar.d(agke.s(view.findViewById(i2), view.findViewById(i3), view.findViewById(i4)));
        abkwVar.a = new abkm(this);
        return abkwVar.a();
    }
}
