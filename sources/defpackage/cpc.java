package defpackage;

import androidx.car.app.model.Alert;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cpc implements cpq {
    public long a;
    private final long c;
    private final long d;

    public cpc(long j, long j2) {
        this.c = j;
        this.d = j2;
        this.a = j - 1;
    }

    @Override // defpackage.cpq
    public /* synthetic */ int a() {
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected final void d() {
        long j = this.a;
        if (j < this.c || j > this.d) {
            throw new NoSuchElementException();
        }
    }

    @Override // defpackage.cpq
    public final boolean e() {
        long j = this.a + 1;
        this.a = j;
        return j <= this.d;
    }
}
