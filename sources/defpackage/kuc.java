package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kuc implements kof, kpb {
    public final Queue a = new ArrayDeque();
    public Status b = new Status(17, "None of the GmsClient connection callbacks have been called.", null, null);

    private final void c() {
        while (true) {
            Consumer consumerM7m = a$$ExternalSyntheticApiModelOutline0.m7m(this.a.poll());
            if (consumerM7m == null) {
                return;
            } else {
                consumerM7m.r(this.b);
            }
        }
    }

    @Override // defpackage.kof
    public final void a(Bundle bundle) {
        this.b = Status.a;
        c();
    }

    @Override // defpackage.kof
    public final void b(int i) {
        this.b = new Status(20, a.bR(i, "Connection to the GMS Core module was suspended, cause: "), null, null);
        c();
    }

    @Override // defpackage.kpb
    public final void i(klo kloVar) {
        this.b = new Status(kloVar, "Connection to the GMS Core module failed.", 17);
        c();
    }
}
