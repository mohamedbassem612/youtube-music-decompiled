package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdu implements rks {
    private final Context a;
    private final aunn b;
    private final aunn c;
    private final aunn d;

    public gdu(Context context, aunn aunnVar, aunn aunnVar2, aunn aunnVar3) {
        context.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        this.a = context;
        this.b = aunnVar;
        this.c = aunnVar2;
        this.d = aunnVar3;
    }

    @Override // defpackage.rks
    public final void e(int i) {
        if (((vor) this.c.io()).c("music-comment-panel") != null) {
            ((gfo) this.b.io()).r();
        }
        jin jinVar = (jin) this.d.io();
        jik jikVar = new jik();
        jikVar.i(-1);
        jikVar.c();
        jikVar.j();
        jikVar.k(this.a.getString(R.string.channel_created));
        jinVar.d(jikVar.b());
    }

    @Override // defpackage.rks
    public final void a() {
    }

    @Override // defpackage.rks
    public final void b() {
    }

    @Override // defpackage.rks
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.rks
    public final void d() {
    }
}
