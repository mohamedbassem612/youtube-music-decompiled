package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awz implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ awy c;
    final /* synthetic */ int d;

    public awz(String str, Context context, awy awyVar, int i) {
        this.a = str;
        this.b = context;
        this.c = awyVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return axc.b(this.a, this.b, eol.s(new Object[]{this.c}), this.d);
    }
}
