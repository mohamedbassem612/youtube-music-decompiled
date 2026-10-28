package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afml extends ContentObserver {
    public final /* synthetic */ hie a;
    private final afvq b;
    private final String c;
    private final Executor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afml(hie hieVar, afvq afvqVar, Executor executor) {
        super(null);
        this.a = hieVar;
        this.b = afvqVar;
        this.c = "Sideloaded content observer";
        this.d = executor;
    }

    private final void a() {
        this.d.execute(afwl.i(new afjc(this, 2)));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (afty.o()) {
            a();
            return;
        }
        afun afunVarA = this.b.a(130, this.c);
        try {
            a();
            afunVarA.close();
        } catch (Throwable th) {
            try {
                afunVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        if (afty.o()) {
            a();
            return;
        }
        afun afunVarA = this.b.a(131, this.c);
        try {
            a();
            afunVarA.close();
        } catch (Throwable th) {
            try {
                afunVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
