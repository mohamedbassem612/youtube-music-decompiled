package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sxa implements adme {
    private final /* synthetic */ int $cid;
    private final Context a;
    private final vxe b;
    private final Object c;
    private final Object d;

    public sxa(Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, int i) {
        this.$cid = i;
        context.getClass();
        this.a = context;
        adhvVar.getClass();
        this.c = adhvVar;
        vxeVar.getClass();
        this.b = vxeVar;
        aduvVar.getClass();
        this.d = aduvVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [adhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aduv, java.lang.Object] */
    @Override // defpackage.adme
    public final /* synthetic */ adma a(ViewGroup viewGroup) {
        if (this.$cid != 0) {
            Context context = this.a;
            jdw jdwVar = new jdw(context);
            vxe vxeVar = this.b;
            return new jby(context, this.c, this.d, vxeVar, jdwVar);
        }
        return new sxb(this.a, viewGroup, this.b, (afip) this.c, (aciz) this.d);
    }

    public sxa(Context context, vxe vxeVar, afip afipVar, aciz acizVar, int i) {
        this.$cid = i;
        context.getClass();
        this.a = context;
        vxeVar.getClass();
        this.b = vxeVar;
        afipVar.getClass();
        this.c = afipVar;
        acizVar.getClass();
        this.d = acizVar;
    }
}
