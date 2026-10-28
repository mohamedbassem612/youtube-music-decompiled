package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yri implements aheh {
    public aqi a;
    private final List b = DesugarCollections.synchronizedList(new ArrayList(2));

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        zkf.d(this.a);
        this.a.d(th);
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        yno ynoVar = (yno) obj;
        aqi aqiVar = this.a;
        zkf.d(aqiVar);
        if (ynoVar != null) {
            aqiVar.b(ynoVar);
            this.b.add(ynoVar);
        }
        aqiVar.d(new NullPointerException());
    }
}
