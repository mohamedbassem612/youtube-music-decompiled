package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class byj implements byd {
    private final Context a;
    private final byd b;

    public byj(Context context) {
        byl bylVar = new byl();
        this.a = context.getApplicationContext();
        this.b = bylVar;
    }

    @Override // defpackage.byd
    public final /* synthetic */ bye a() {
        return new byk(this.a, ((byl) this.b).a());
    }
}
