package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abma extends ablz {
    private final avgj j;

    public abma(String str, avgj avgjVar) {
        super("$N", 0, str, 0L);
        this.j = avgjVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [acey, java.lang.Object] */
    @Override // defpackage.ablz
    public final int a(long j) {
        ?? r0 = ((abwk) this.j.a).d;
        return (int) (r0 != 0 ? r0.g(j) : -1L);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [acey, java.lang.Object] */
    @Override // defpackage.ablz
    public final int b() {
        ?? r2 = ((abwk) this.j.a).d;
        return (int) (r2 != 0 ? r2.g(r2.m().w().i) : -1L);
    }

    @Override // defpackage.ablz
    public final int d() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }
}
