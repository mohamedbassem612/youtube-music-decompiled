package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jew extends jbh {
    private final vxe a;
    private final Context b;
    private final izr c;
    private final jer d;
    private final jnj e;

    public jew(Context context, vxe vxeVar, izr izrVar, jer jerVar, jnj jnjVar) {
        super(context);
        context.getClass();
        this.b = context;
        vxeVar.getClass();
        this.a = vxeVar;
        this.c = izrVar;
        this.d = jerVar;
        this.e = jnjVar;
    }

    @Override // defpackage.jbh
    protected final adma d() {
        return new jev(this.b, this.a, this.c, this.d, this.e);
    }
}
