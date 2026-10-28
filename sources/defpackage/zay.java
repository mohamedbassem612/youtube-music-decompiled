package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class zay implements zao {
    public final Handler a;
    public final zao b;
    protected final Handler c;

    public zay(Handler handler, zao zaoVar, Handler handler2) {
        this.a = handler;
        this.b = zaoVar;
        this.c = handler2;
    }

    public final void a(String str, String str2) {
        this.a.post(new yag((Object) this, (Object) str, (Object) str2, 9, (byte[]) null));
    }
}
