package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.security.MessageDigest;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzg implements atzk {
    public final String a;
    public final String b;
    public final atzc c;
    public final String d;
    public final atzb e;
    public final MessageDigest f;
    public final agev g;
    public atzk h;
    private int i;

    public atzg(String str, atzc atzcVar, atzb atzbVar, atzo atzoVar) {
        str.getClass();
        this.a = str;
        this.b = "POST";
        this.c = atzcVar;
        this.d = ahno.Z(null);
        this.e = atzbVar;
        this.i = 1;
        this.f = atzoVar.b;
        this.g = atzoVar.c;
    }

    @Override // defpackage.atzk
    public final ListenableFuture a() {
        aegt aegtVar = new aegt(this, 13);
        ahfi ahfiVar = new ahfi();
        ahfiVar.c("Scotty-Uploader-MultipartTransfer-%d");
        ahex ahexVarA = MoreExecutors.a(Executors.newSingleThreadExecutor(ahfi.a(ahfiVar)));
        ListenableFuture listenableFutureSubmit = ahexVarA.submit(aegtVar);
        ahexVarA.shutdown();
        return listenableFutureSubmit;
    }

    @Override // defpackage.atzk
    public final void b() {
        synchronized (this) {
            atzk atzkVar = this.h;
            if (atzkVar != null) {
                atzkVar.b();
            }
            this.i = 3;
            notifyAll();
        }
    }

    public final synchronized void c() {
        int i;
        while (true) {
            i = this.i;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new atzm(atzl.CANCELED, "", null);
        }
        aguu.ah(i == 1);
    }
}
