package defpackage;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bqn extends bra {
    public final /* synthetic */ ResultReceiver a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqn(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.a = resultReceiver;
    }

    @Override // defpackage.bra
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.b(0, (Bundle) obj);
    }
}
