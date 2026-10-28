package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afjd implements afhr {
    public final Context a;
    public final ahex b;
    private final ahex c;

    public afjd(Context context, ahex ahexVar, ahex ahexVar2) {
        this.a = context;
        this.c = ahexVar;
        this.b = ahexVar2;
    }

    @Override // defpackage.afhr
    public final ListenableFuture a(afhs afhsVar) {
        return ahng.s(new afgi(this, 5), this.c);
    }
}
