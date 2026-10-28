package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krn {
    public static final kro a = new kro();

    public static void a(knf knfVar) {
        b(knfVar, new krk());
    }

    public static lpa b(final knf knfVar, final krm krmVar) {
        final kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        knfVar.d(new kne() { // from class: krl
            @Override // defpackage.kne
            public final void a(Status status) {
                kjc kjcVar2 = kjcVar;
                if (status.c()) {
                    kjcVar2.x(krmVar.a(knfVar.g(TimeUnit.MILLISECONDS)));
                } else {
                    kjcVar2.w(kro.q(status));
                }
            }
        });
        return (lpa) kjcVar.a;
    }
}
