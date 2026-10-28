package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class woz extends wnn {
    public final zwb c;
    public final wlp d;
    public final Context e;
    public wow f;
    public final syn g;
    private woy h;

    public woz(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, syn synVar, Context context) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        wlpVar.getClass();
        this.d = wlpVar;
        this.g = synVar;
        this.e = context;
    }

    public final ListenableFuture a(wlu wluVar, Executor executor) {
        woy woyVar = this.h;
        if (woyVar == null) {
            woy woyVar2 = new woy(this.d, e());
            this.h = woyVar2;
            woyVar = woyVar2;
        }
        return woyVar.b(wluVar, executor, null);
    }
}
