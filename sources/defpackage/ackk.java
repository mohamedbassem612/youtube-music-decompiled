package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ackk extends avr {
    final /* synthetic */ Context a;
    final /* synthetic */ ackl b;
    final /* synthetic */ String c;

    public ackk(Context context, ackl acklVar, String str) {
        this.a = context;
        this.b = acklVar;
        this.c = str;
    }

    @Override // defpackage.avr
    public final void b(Typeface typeface) {
        Typeface typefaceB = ackm.b(this.a, typeface, ackm.a(this.b));
        Map map = ackm.s;
        synchronized (map) {
            j$.util.Map.EL.putIfAbsent(map, this.c, typefaceB);
        }
    }

    @Override // defpackage.avr
    public final void a(int i) {
    }
}
