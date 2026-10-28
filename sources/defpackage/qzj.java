package defpackage;

import com.google.mediapipe.framework.Packet;
import com.google.research.xeno.effect.Effect;
import j$.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzj extends qvk implements qyw, qzh {
    public static final /* synthetic */ int b = 0;
    private final agkz h;
    private final List i;

    public qzj(Effect effect, List list) {
        super(effect);
        this.i = list;
        this.h = (agkz) Collection.EL.stream(list).flatMap(new qzp(1)).collect(aghu.b);
    }

    @Override // defpackage.qzh
    public final void b(rfs rfsVar) {
        for (Cloneable cloneable : this.i) {
            if (cloneable instanceof qzh) {
                ((qzh) cloneable).b(rfsVar);
            }
        }
    }

    @Override // defpackage.qvk
    public final void j() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((qvk) it.next()).j();
        }
    }

    @Override // defpackage.qyw
    public final agkz k() {
        return this.h;
    }

    @Override // defpackage.atur
    public final /* bridge */ /* synthetic */ void l(Packet packet, String str, Object obj) {
        Effect effect = (Effect) obj;
        for (Cloneable cloneable : this.i) {
            if (cloneable instanceof qyw) {
                qyw qywVar = (qyw) cloneable;
                if (qywVar.k().contains(str)) {
                    qywVar.l(packet, str, effect);
                }
            }
        }
    }

    @Override // defpackage.qvk, defpackage.qvc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ qvc clone() {
        return this;
    }

    @Override // defpackage.qvk, defpackage.qvc
    public final /* bridge */ /* synthetic */ Object clone() {
        return this;
    }

    @Override // defpackage.qvk
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ qvk a() {
        return this;
    }
}
