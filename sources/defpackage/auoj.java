package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auoj implements auph {
    public final bpp a;
    public final Context b;
    private volatile aunt c;
    private final Object d = new Object();

    public auoj(qe qeVar) {
        this.a = qeVar;
        this.b = qeVar;
    }

    @Override // defpackage.auph
    public final /* synthetic */ Object generatedComponent() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = ((auoh) new bpn(this.a, new auoa(this.b, 2)).a(auoh.class)).a;
                }
            }
        }
        return this.c;
    }
}
