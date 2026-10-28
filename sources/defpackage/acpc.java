package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpc {
    public final Executor a;
    public final String b;
    public boolean c;
    public int d;
    public int e;
    public final qrx h;
    public String f = "shorts";
    public apfi g = apfi.a;
    public final auor i = new auor();

    public acpc(qrx qrxVar, Executor executor, mbc mbcVar) {
        this.h = qrxVar;
        this.a = executor;
        this.b = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(DesugarDate.from(mbcVar.f()));
    }

    public final ListenableFuture a() {
        return ahcs.e(b(), afwl.a(new aaoz(this, 20)), this.a);
    }

    public final ListenableFuture b() {
        if (!this.f.equals("")) {
            return ahcs.e(this.h.c(), new acpb(this, 1), this.a);
        }
        Log.e("YT", "loadFromDataStore method: storage key equals STORAGE_KEY_UNSPECIFIED");
        return aher.a;
    }
}
