package defpackage;

import com.google.research.xeno.effect.CapabilitiesManifest;
import com.google.research.xeno.effect.Effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class attb implements atta {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public /* synthetic */ attb(atta attaVar, CapabilitiesManifest capabilitiesManifest, int i) {
        this.$cid = i;
        this.a = attaVar;
        this.b = capabilitiesManifest;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [atta, java.lang.Object] */
    @Override // defpackage.atta
    public final void a(Effect effect, String str) {
        int i = this.$cid;
        if (i == 0) {
            ((attd) this.b).b((String) this.a, effect, str);
            return;
        }
        if (i != 1) {
            Object obj = this.a;
            if (i != 2) {
                ((attd) this.b).b((String) obj, effect, str);
                return;
            } else {
                ((attd) this.b).b((String) obj, effect, str);
                return;
            }
        }
        agrf agrfVar = uys.a;
        Object obj2 = this.b;
        try {
            this.a.a(effect, str);
        } finally {
            ((CapabilitiesManifest) obj2).b();
        }
    }

    public attb(attd attdVar, String str, int i) {
        this.$cid = i;
        this.a = str;
        this.b = attdVar;
    }
}
